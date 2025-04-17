package StudentWeb.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import StudentWeb.Dao.StudentDao;
import StudentWeb.Dao.nganhDao;
import StudentWeb.Dao.truongDao;
import StudentWeb.Dto.SinhVienFind;
import StudentWeb.Dto.StudentDto;
import StudentWeb.Entity.CongViec;
import StudentWeb.Entity.CongViecId;
import StudentWeb.Entity.Sinhvien;
import StudentWeb.Entity.TotNghiep;
import StudentWeb.Entity.TotNghiepId;
import StudentWeb.Entity.nganh;
import StudentWeb.Entity.truong;
import StudentWeb.repository.CongViecRepository;
import StudentWeb.repository.NganhRepository;
import StudentWeb.repository.TotNghiepRepository;
import StudentWeb.repository.TruongRepository;
import StudentWeb.repository.sinhvienRepository;
 
@Service
public class StudentService implements IStudent{
   @Autowired
   StudentDao student = new StudentDao();
   @Autowired
   nganhDao nganhDao = new nganhDao();
   @Autowired
   truongDao truongDao = new truongDao();
   @Autowired
   NganhRepository nganhRepository;
   @Autowired
   TruongRepository truongRepository;
   @Autowired
   CongViecRepository congViecRepository;
   @Autowired
   TotNghiepRepository totNghiepRepository;
   @Autowired
   sinhvienRepository sinhvienRepository;
   
	 @Override
	
	public int addStudent(StudentDto dto) {
	
		try {
			// 1. Lưu sinh viên
			Sinhvien sv = new Sinhvien();
			sv.setSoCMND(dto.getSoCmnd());
			sv.setHoTen(dto.getHoTen());
			sv.setEmail(dto.getEmail());
			sv.setSoDT(dto.getSoDt());
			sv.setDiaChi(dto.getDiaChi());
			sinhvienRepository.save(sv);

			// 2. Lấy các entity cần set khóa ngoại
			truong truongEntity = truongRepository.findOne(dto.getMaTruong());
			nganh nganhEntity = nganhRepository.findOne(dto.getMaNganh());

			// 3. Tạo totNghiep dùng `sv` làm khóa ngoại
			TotNghiep tn = new TotNghiep();
			TotNghiepId tnId = new TotNghiepId();
			tnId.setSoCMND(dto.getSoCmnd());
			tnId.setMaTruong(dto.getMaTruong());
			tnId.setMaNganh(dto.getMaNganh());
			tn.setId(tnId);

			tn.setHeTN(dto.getHeTn());
			tn.setNgayTN(dto.getNgayTN());
			tn.setLoaiTN(dto.getLoaiTn());
			tn.setSinhVien(sv); // dùng lại object vừa lưu
			tn.setTruong(truongEntity);
			tn.setNganh(nganhEntity);
			totNghiepRepository.save(tn);

			// 4. Tạo công việc
			CongViec cv = new CongViec();
			CongViecId cvId = new CongViecId();
			cvId.setSoCMND(dto.getSoCmnd());
			cvId.setNgayVaoCongTy(dto.getNgayVaoCongTy());
			cv.setId(cvId);

			cv.setNganh(nganhEntity);
			cv.setTenCongViec(dto.getTenCongViec());
			cv.setTenCongTy(dto.getTenCongTy());
			cv.setDiaChiCongTy(dto.getDiaChiCongTy());
			cv.setThoiGianLamViec(dto.getThoiGianLamViec());
			cv.setSinhVien(sv);
			congViecRepository.save(cv);
		    return 1;
		}catch (DataIntegrityViolationException e) {
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
	}

	public List<nganh> getListNganh() {
		return nganhRepository.findAll();

	}

	public List<truong> getListTruong() {
		return truongRepository.findAll();
	}

	public List<Sinhvien> getListStuden(String name) {
		return student.findListALLStudents(name);
	}

	public Sinhvien getCmndSinhVien(String name) {
		Optional<Sinhvien> sv = sinhvienRepository.findFirstByHoTenContaining(name);
		return sv.orElse(null);
		
 	}

	public List<SinhVienFind> getListSinhVienFind(Sinhvien SVFind) {
		return student.FindSinhVienBySoCmnd(SVFind);

	}
	public SinhVienFind getListFind(Sinhvien sv) {
		return student.FindSinhVienBySoCmndvip(sv);
	}
 


	@Override
	public List<Sinhvien> getAllListStudent() {
		return student.getAllListStudent();
		
	}

	@Override
	public boolean checkExistStudent(String socmnd) {
		Optional<Sinhvien> sv = sinhvienRepository.findSinhVienBySoCMND(socmnd);
		if(sv != null) {
			return true;
		}
		return false;
	} 
	
}

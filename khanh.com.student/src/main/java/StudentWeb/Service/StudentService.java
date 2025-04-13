package StudentWeb.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import StudentWeb.Dao.StudentDao;
import StudentWeb.Dao.nganhDao;
import StudentWeb.Dao.truongDao;
import StudentWeb.Dto.SinhVienFind;
import StudentWeb.Dto.StudentDto;
import StudentWeb.Entity.Sinhvien;
import StudentWeb.Entity.nganh;
import StudentWeb.Entity.truong;
 
@Service
public class StudentService implements IStudent{
   @Autowired
   StudentDao student = new StudentDao();
   @Autowired
   nganhDao nganhDao = new nganhDao();
   @Autowired
   truongDao truongDao = new truongDao();
   
	@Override
	public int addStudent(StudentDto students) {
		  int result = student.addStudentAndGraduation(students);
		  return result;
		   
	}

	public List<nganh> getListNganh() {
		return nganhDao.getListNganh();

	}

	public List<truong> getListTruong() {
		return truongDao.getListTruong();
	}

	public List<Sinhvien> getListStuden(String name) {
		return student.findListALLStudents(name);
	}

	public Sinhvien getCmndSinhVien(String name) {
		return student.GetOnlySoCMND(name);
	}

	public List<SinhVienFind> getListSinhVienFind(Sinhvien SVFind) {
		return student.FindSinhVienBySoCmnd(SVFind);

	}
	public SinhVienFind getListFind(Sinhvien sv) {
		return student.FindSinhVienBySoCmndvip(sv);
	}
 
	@Override
	public boolean checkExistStudent(StudentDto students) {
		students = student.CheckExistStudent(students);
		if(students != null ) {
			return true;
		}else {
			return false;
		}
		
  	}

	@Override
	public List<Sinhvien> getAllListStudent() {
		 
		return student.getAllListStudent();
	} 
	
}

package StudentWeb.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import StudentWeb.Dto.SinhVienFind;
import StudentWeb.Dto.SinhVienFindMapper;
import StudentWeb.Dto.StudentDto;
import StudentWeb.Dto.StudentDtoMapper;
import StudentWeb.Entity.SinhVienMapper;
import StudentWeb.Entity.Sinhvien;
 
@Repository
public class StudentDao extends BaseDao {
  public StringBuffer querySql() {
	  StringBuffer  sql = new StringBuffer();
	sql.append("SELECT ");
	sql.append(" ");
	sql.append(" ");
	sql.append(" sv.SoCmnd, ");
	sql.append(" sv.HoTen, ");
	sql.append(" sv.Email, ");
	sql.append(" sv.SoDT, ");
	sql.append(" sv.DiaChi, ");
	sql.append(" tn.MaTruong, ");
	sql.append(" tn.MaNganh, ");
	sql.append(" tn.HeTN, ");
	sql.append(" tn.NgayTN, ");
	sql.append(" LoaiTN ");
	sql.append("FROM sinhvien  as sv ");
	sql.append("INNER JOIN tot_nghiep as tn ");
	sql.append("ON sv.SoCmnd = tn.SoCmnd");
	return sql;  
  } 
  public String querySinhVien() {
	    return "SELECT * FROM sinhvien";
	}

  public List<Sinhvien> getAllListStudent() {
	    List<Sinhvien> students = _jdbcTemplate.query(querySinhVien(), new SinhVienMapper());
	    System.out.println("Danh sách sinh viên: " + students);
	    return students;
	}


  public int addStudentAndGraduation(StudentDto student) {
	    try {
	        // Thêm sinh viên vào bảng sinhvien
	        String sql1 = "INSERT INTO sinhvien (SoCmnd, HoTen, Email, SoDT, DiaChi) VALUES (?, ?, ?, ?, ?)";
	        int result1 = _jdbcTemplate.update(sql1, student.getSoCmnd(), student.getHoTen(), student.getEmail(), student.getSoDt(), student.getDiaChi());

	        // Thêm thông tin tốt nghiệp vào bảng tot_nghiep
	        String sql2 = "INSERT INTO tot_nghiep (SoCmnd, MaTruong, MaNganh, HeTN, NgayTN, LoaiTN) VALUES (?, ?, ?, ?, ?, ?)";
	        int result2 = _jdbcTemplate.update(sql2, student.getSoCmnd(), student.getMaTruong(), student.getMaNganh(), student.getHeTn(), student.getNgayTN(), student.getLoaiTn());

	        // Thêm thông tin công việc vào bảng cong_viec
	        String sql3 = "INSERT INTO cong_viec (SoCmnd, NgayVaoCongTy, MaNganh, TenCongViec, TenCongTy, DiaChiCongTy, ThoiGianLamViec) VALUES (?, ?, ?, ?, ?, ?, ?)";
	        int result3 = _jdbcTemplate.update(sql3, student.getSoCmnd(), student.getNgayVaoCongTy(), student.getMaNganh(), student.getTenCongViec(), student.getTenCongTy(), student.getDiaChiCongTy(), student.getThoiGianLamViec());

	        return (result1 > 0 && result2 > 0 && result3 > 0) ? 1 : 0;
	    } catch (DuplicateKeyException e) {
	        return -1;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return 0;
	    }
	}


  public StudentDto CheckExistStudent(StudentDto students) {
	  String sql = "SELECT SoCmnd FROM sinhvien WHERE SoCmnd = '" + students.getSoCmnd() + "'";
	  StudentDto result  = _jdbcTemplate.queryForObject(sql, new StudentDtoMapper());
	  return result;
	   
  }
  public List<Sinhvien> findListALLStudents(String Name){
	  List<Sinhvien> studentsList = new ArrayList<Sinhvien>();
	  String sql = "SELECT * FROM SINHVIEN WHERE HoTen LIKE '%"+Name+"%' ";
	  studentsList = _jdbcTemplate.query(sql, new SinhVienMapper());
	  return studentsList;
	  
  }
  public Sinhvien GetOnlySoCMND(String Name) {
	    String sql = "SELECT * FROM SINHVIEN WHERE HoTen LIKE ?";
	    try {
	        return _jdbcTemplate.queryForObject(sql, new SinhVienMapper(), "%" + Name + "%");
	    } catch (EmptyResultDataAccessException e) {
	        return null; // Không có kết quả nào
	    }
	}
  
  public SinhVienFind FindSinhVienBySoCmndvip(Sinhvien sv) {
	    SinhVienFind SVFind = new SinhVienFind();
	    StringBuffer varname1 = new StringBuffer();
	    varname1.append("SELECT SV.SoCMND, SV.HoTen, TN.MaNganh, TN.MaTruong, CV.MaNganh, CV.TenCongTy, CV.NgayVaoCongTy ");
	    varname1.append("FROM SINHVIEN SV ");
	    varname1.append("INNER JOIN TOT_NGHIEP TN ON SV.SoCMND = TN.SoCMND ");
	    varname1.append("INNER JOIN CONG_VIEC CV ON SV.SoCMND = CV.SoCMND ");
	    varname1.append("WHERE SV.SoCMND = ? ");
	    varname1.append("AND CV.NgayVaoCongTy = ( ");
	    varname1.append("    SELECT MAX(CV2.NgayVaoCongTy) ");
	    varname1.append("    FROM CONG_VIEC CV2 ");
	    varname1.append("    WHERE CV2.SoCMND = ? ");
	    varname1.append(");");

	    try {
	        SVFind = _jdbcTemplate.queryForObject(
	            varname1.toString(),
	            new SinhVienFindMapper(),
	            sv.getSoCMND(), sv.getSoCMND()
	        );
	    } catch (EmptyResultDataAccessException e) {
	        // Không tìm thấy bản ghi -> trả về null
	        SVFind = null;
	    }

	    return SVFind;
	}

  
  public List<SinhVienFind> FindSinhVienBySoCmnd(Sinhvien sv){
	  List<SinhVienFind> SVFind = new ArrayList<SinhVienFind>();
	  StringBuffer  varname1 = new StringBuffer();
	  varname1.append("SELECT SV.SoCMND, SV.HoTen, TN.MaNganh, TN.MaTruong, CV.MaNganh, CV.TenCongTy, CV.NgayVaoCongTy ");
	  varname1.append("FROM SINHVIEN SV ");
	  varname1.append("INNER JOIN TOT_NGHIEP TN ON SV.SoCMND = TN.SoCMND ");
	  varname1.append("INNER JOIN CONG_VIEC CV ON SV.SoCMND = CV.SoCMND ");
	  varname1.append("WHERE SV.SoCMND = '"+sv.getSoCMND()+"' ");
	  varname1.append("AND CV.NgayVaoCongTy = ( ");
	  varname1.append("    SELECT MAX(CV2.NgayVaoCongTy) ");
	  varname1.append("    FROM CONG_VIEC CV2 ");
	  varname1.append("    WHERE CV2.SoCMND = '"+sv.getSoCMND()+"' ");
	  varname1.append(");");
	  SVFind = _jdbcTemplate.query(varname1.toString(), new SinhVienFindMapper());
	  
	  return SVFind;
	  
	  
  }
  




  
  
  
  
  
  
	
	
	
	
}

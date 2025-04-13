package StudentWeb.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentDtoMapper  implements RowMapper<StudentDto>{

	@Override
	public StudentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentDto students = new StudentDto();
		students.setSoCmnd(rs.getString("SoCMND"));
		students.setHoTen(rs.getString("HoTen"));
		students.setEmail(rs.getString("Email"));
		students.setSoDt(rs.getString("SoDT"));
		students.setDiaChi(rs.getString("DiaChi"));
		students.setMaTruong(rs.getString("MaTruong"));
		students.setMaNganh(rs.getString("MaNganh"));
		students.setHeTn(rs.getString("HeTN"));
		students.setNgayTN(rs.getDate("NgayTN"));
		students.setLoaiTn(rs.getString("LoaiTN"));
		return students;


	}
}

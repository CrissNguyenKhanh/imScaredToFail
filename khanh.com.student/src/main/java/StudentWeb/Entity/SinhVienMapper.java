package StudentWeb.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SinhVienMapper implements RowMapper<Sinhvien> {

	@Override
	public Sinhvien mapRow(ResultSet rs, int rowNum) throws SQLException {
      Sinhvien sv  = new Sinhvien();
      sv.setSoCMND(rs.getString("SoCMND"));
      sv.setHoTen(rs.getString("HoTen"));
      sv.setEmail(rs.getString("Email"));
      sv.setSoDT(rs.getString("SoDT"));
      sv.setDiaChi(rs.getString("DiaChi"));
	  return sv;
	}

}

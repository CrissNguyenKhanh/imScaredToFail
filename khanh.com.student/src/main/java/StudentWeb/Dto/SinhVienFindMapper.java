package StudentWeb.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SinhVienFindMapper implements RowMapper<SinhVienFind> {

	@Override
	public SinhVienFind mapRow(ResultSet rs, int rowNum) throws SQLException {
		SinhVienFind SV = new SinhVienFind();
		SV.setSoCMND(rs.getString("SoCMND"));
		SV.setHoTen(rs.getString("HoTen"));
		SV.setMaNganh(rs.getString("MaNganh"));
		SV.setMaTruong(rs.getString("MaTruong"));
		SV.setTenCongTy(rs.getString("TenCongTy"));
		SV.setNgayVaoCongTy(rs.getDate("NgayVaoCongTy"));
		return SV;
		
	}
	

}

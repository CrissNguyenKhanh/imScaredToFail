package StudentWeb.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class truongMapper implements RowMapper<truong> {

	@Override
	public truong mapRow(ResultSet rs, int rowNum) throws SQLException {
		truong truongs  = new truong();
		truongs.setMaTruong(rs.getString("MaTruong"));
		truongs.setTenTruong(rs.getString("TenTruong"));
		truongs.setDiaChi(rs.getString("Diachi"));
		truongs.setSoDT(rs.getString("soDt"));
		return truongs;
		
	}

}

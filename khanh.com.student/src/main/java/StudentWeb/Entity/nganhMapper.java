package StudentWeb.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class nganhMapper implements RowMapper<nganh>{

	@Override
	public nganh mapRow(ResultSet rs, int rowNum) throws SQLException {
		nganh nganhVip = new nganh();
		nganhVip.setMaNganh(rs.getString("maNganh"));
		nganhVip.setTenNganh(rs.getString("tenNganh"));
		nganhVip.setLoaiNganh(rs.getString("loaiNganh"));

		return nganhVip;
	}
	

}

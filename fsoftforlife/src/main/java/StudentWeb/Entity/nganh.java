package StudentWeb.Entity;

import javax.persistence.*;

import lombok.Data;

 
@Data
@Entity

public class nganh {
    @Id
    private String maNganh;
    private String tenNganh;
    private String loaiNganh;
	public String getMaNganh() {
		return maNganh;
	}
	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}
	public String getTenNganh() {
		return tenNganh;
	}
	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}
	public String getLoaiNganh() {
		return loaiNganh;
	}
	public void setLoaiNganh(String loaiNganh) {
		this.loaiNganh = loaiNganh;
	}
    
    
}



   
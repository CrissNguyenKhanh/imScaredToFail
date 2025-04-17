package StudentWeb.Entity;

 
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
@Data
@Entity
public class truong {
    @Id
    private String maTruong;
    private String tenTruong;
    private String diaChi;
    private String soDT;
	public String getMaTruong() {
		return maTruong;
	}
	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}
	public String getTenTruong() {
		return tenTruong;
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
    
	
    
}

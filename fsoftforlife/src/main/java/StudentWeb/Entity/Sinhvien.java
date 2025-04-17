 package StudentWeb.Entity;

import javax.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name = "sinhvien")
public class Sinhvien {
    @Id
   
    private String soCMND;
    private String hoTen;
    private String email;
    private String soDT;
    private String diaChi;
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@OneToOne(mappedBy = "sinhVien" , cascade = CascadeType.ALL)
	private TotNghiep totNghiep;
    
}

 

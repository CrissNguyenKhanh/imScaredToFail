package StudentWeb.Dto;

import java.util.Date;
  



import org.springframework.format.annotation.DateTimeFormat;

public class StudentDto {
	 
	private String SoCmnd;
  
	private String HoTen;
  
	private String Email;

	private String SoDt;
	private String DiaChi;
	private String maTruong;
	private String maNganh;
	private String heTn;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date NgayTN;
	private String loaiTn;
	private String tenCongViec;
	private String tenCongTy;
	private String diaChiCongTy;
	private String thoiGianLamViec;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngayVaoCongTy;

  // Getters và Setters
  public String getSoCmnd() { return SoCmnd; }
  public void setSoCmnd(String soCmnd) { SoCmnd = soCmnd; }

  public String getHoTen() { return HoTen; }
  public void setHoTen(String hoTen) { HoTen = hoTen; }

  public String getEmail() { return Email; }
  public void setEmail(String email) { Email = email; }

  public String getSoDt() { return SoDt; }
  public void setSoDt(String soDt) { SoDt = soDt; }

  public String getDiaChi() { return DiaChi; }
  public void setDiaChi(String diaChi) { DiaChi = diaChi; }

  public String getMaTruong() { return maTruong; }
  public void setMaTruong(String maTruong) { this.maTruong = maTruong; }

  public String getMaNganh() { return maNganh; }
  public void setMaNganh(String maNganh) { this.maNganh = maNganh; }

  public String getHeTn() { return heTn; }
  public void setHeTn(String heTn) { this.heTn = heTn; }

  public Date getNgayTN() { return NgayTN; }
  public void setNgayTN(Date ngayTN) { NgayTN = ngayTN; }

  public String getLoaiTn() { return loaiTn; }
  public void setLoaiTn(String loaiTn) { this.loaiTn = loaiTn; }
public String getTenCongViec() {
	return tenCongViec;
}
public void setTenCongViec(String tenCongViec) {
	this.tenCongViec = tenCongViec;
}
public String getTenCongTy() {
	return tenCongTy;
}
public void setTenCongTy(String tenCongTy) {
	this.tenCongTy = tenCongTy;
}
public String getDiaChiCongTy() {
	return diaChiCongTy;
}
public void setDiaChiCongTy(String diaChiCongTy) {
	this.diaChiCongTy = diaChiCongTy;
}
public String getThoiGianLamViec() {
	return thoiGianLamViec;
}
public void setThoiGianLamViec(String thoiGianLamViec) {
	this.thoiGianLamViec = thoiGianLamViec;
}
public Date getNgayVaoCongTy() {
	return ngayVaoCongTy;
}
public void setNgayVaoCongTy(Date ngayVaoCongTy) {
	this.ngayVaoCongTy = ngayVaoCongTy;
}
  
}

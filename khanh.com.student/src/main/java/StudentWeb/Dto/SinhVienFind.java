package StudentWeb.Dto;

import java.sql.Date;

public class SinhVienFind {
private String SoCMND;
private String HoTen;
private String MaNganh;
private String MaTruong;
private String TenCongTy;
private Date NgayVaoCongTy;

public SinhVienFind() {
	super();
}
public String getSoCMND() {
	return SoCMND;
}
public void setSoCMND(String soCMND) {
	SoCMND = soCMND;
}
public String getHoTen() {
	return HoTen;
}
public void setHoTen(String hoTen) {
	HoTen = hoTen;
}
public String getMaNganh() {
	return MaNganh;
}
public void setMaNganh(String maNganh) {
	MaNganh = maNganh;
}
public String getMaTruong() {
	return MaTruong;
}
public void setMaTruong(String maTruong) {
	MaTruong = maTruong;
}

public String getTenCongTy() {
	return TenCongTy;
}
public void setTenCongTy(String tenCongTy) {
	TenCongTy = tenCongTy;
}
public Date getNgayVaoCongTy() {
	return NgayVaoCongTy;
}
public void setNgayVaoCongTy(Date ngayVaoCongTy) {
	NgayVaoCongTy = ngayVaoCongTy;
} 


}

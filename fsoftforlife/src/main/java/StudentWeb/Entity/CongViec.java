package StudentWeb.Entity;

import javax.persistence.*;

@Entity
@Table(name = "cong_viec")
public class CongViec {

    @EmbeddedId
    private CongViecId id;

    @ManyToOne
    @MapsId("soCMND")
    @JoinColumn(name = "soCMND")
    private Sinhvien sinhVien;

    @ManyToOne
 
    @JoinColumn(name = "maNganh")
    private nganh nganh;

    private String tenCongViec;
    private String tenCongTy;
    private String diaChiCongTy;
    private String thoiGianLamViec;
	public CongViecId getId() {
		return id;
	}
	public void setId(CongViecId id) {
		this.id = id;
	}
	public Sinhvien getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(Sinhvien sinhVien) {
		this.sinhVien = sinhVien;
	}
	public nganh getNganh() {
		return nganh;
	}
	public void setNganh(nganh nganh) {
		this.nganh = nganh;
	}
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
	
    
}

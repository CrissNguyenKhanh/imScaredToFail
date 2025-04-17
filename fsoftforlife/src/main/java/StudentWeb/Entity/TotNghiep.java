package StudentWeb.Entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tot_nghiep")
public class TotNghiep {

    @EmbeddedId
    private TotNghiepId id;

    @ManyToOne
    @MapsId("soCMND")
    @JoinColumn(name = "soCMND")
    private Sinhvien sinhVien;

    @ManyToOne
    @MapsId("maTruong")
    @JoinColumn(name = "maTruong")
    private truong truong;

    @ManyToOne
    @MapsId("maNganh")
    @JoinColumn(name = "maNganh")
    private nganh nganh;

    private String heTN;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private java.util.Date ngayTN;
    private String loaiTN;
	public TotNghiepId getId() {
		return id;
	}
	public void setId(TotNghiepId id) {
		this.id = id;
	}
	public Sinhvien getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(Sinhvien sinhVien) {
		this.sinhVien = sinhVien;
	}
	public truong getTruong() {
		return truong;
	}
	public void setTruong(truong truong) {
		this.truong = truong;
	}
	public nganh getNganh() {
		return nganh;
	}
	public void setNganh(nganh nganh) {
		this.nganh = nganh;
	}
	public String getHeTN() {
		return heTN;
	}
  
	public void setHeTN(String heTN) {
		this.heTN = heTN;
	}
	

	  
	
	public java.util.Date getNgayTN() {
		return ngayTN;
	}
	public void setNgayTN(java.util.Date ngayTN) {
		this.ngayTN = ngayTN;
	}
	public String getLoaiTN() {
		return loaiTN;
	}
	public void setLoaiTN(String loaiTN) {
		this.loaiTN = loaiTN;
	}
    
}

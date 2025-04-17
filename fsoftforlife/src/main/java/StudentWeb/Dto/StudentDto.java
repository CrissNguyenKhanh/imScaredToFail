package StudentWeb.Dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
public class StudentDto {

    @NotBlank(message = "Số CMND không được để trống")
    private String soCmnd;

    private String hoTen;
    private String email;
    private String soDt;
    private String diaChi;

    @NotBlank(message = "Mã trường không được để trống")
    private String maTruong;

    @NotBlank(message = "Mã ngành không được để trống")
    private String maNganh;

    private String heTn;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayTN;

    private String loaiTn;
    private String tenCongViec;
    private String tenCongTy;
    private String diaChiCongTy;
    private String thoiGianLamViec;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayVaoCongTy;

    // Getters và Setters
    public String getSoCmnd() { return soCmnd; }
    public void setSoCmnd(String soCmnd) { this.soCmnd = soCmnd; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSoDt() { return soDt; }
    public void setSoDt(String soDt) { this.soDt = soDt; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    public String getMaTruong() { return maTruong; }
    public void setMaTruong(String maTruong) { this.maTruong = maTruong; }

    public String getMaNganh() { return maNganh; }
    public void setMaNganh(String maNganh) { this.maNganh = maNganh; }

    public String getHeTn() { return heTn; }
    public void setHeTn(String heTn) { this.heTn = heTn; }

    public Date getNgayTN() { return ngayTN; }
    public void setNgayTN(Date ngayTN) { this.ngayTN = ngayTN; }

    public String getLoaiTn() { return loaiTn; }
    public void setLoaiTn(String loaiTn) { this.loaiTn = loaiTn; }

    public String getTenCongViec() { return tenCongViec; }
    public void setTenCongViec(String tenCongViec) { this.tenCongViec = tenCongViec; }

    public String getTenCongTy() { return tenCongTy; }
    public void setTenCongTy(String tenCongTy) { this.tenCongTy = tenCongTy; }

    public String getDiaChiCongTy() { return diaChiCongTy; }
    public void setDiaChiCongTy(String diaChiCongTy) { this.diaChiCongTy = diaChiCongTy; }

    public String getThoiGianLamViec() { return thoiGianLamViec; }
    public void setThoiGianLamViec(String thoiGianLamViec) { this.thoiGianLamViec = thoiGianLamViec; }

    public Date getNgayVaoCongTy() { return ngayVaoCongTy; }
    public void setNgayVaoCongTy(Date ngayVaoCongTy) { this.ngayVaoCongTy = ngayVaoCongTy; }
}

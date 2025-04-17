package StudentWeb.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class CongViecId implements Serializable {
    private String soCMND;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
   
    private java.util.Date ngayVaoCongTy;
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	public java.util.Date getNgayVaoCongTy() {
		return ngayVaoCongTy;
	}
	public void setNgayVaoCongTy(java.util.Date ngayVaoCongTy) {
		this.ngayVaoCongTy = ngayVaoCongTy;
	}
    

     
    // equals() và hashCode()
}

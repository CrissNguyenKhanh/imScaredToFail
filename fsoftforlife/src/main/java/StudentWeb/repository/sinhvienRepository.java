package StudentWeb.repository;

import java.lang.annotation.Native;
import java.util.Optional;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import StudentWeb.Dto.SinhVienFind;
import StudentWeb.Entity.Sinhvien;
@Repository
public interface sinhvienRepository  extends JpaRepository<Sinhvien, String>{
	 Optional<Sinhvien> findFirstByHoTenContaining(String name);
	 Optional<Sinhvien> findSinhVienBySoCMND(String soCmnd);
//    List<User> findByLastname(String lastname);
//    User findByEmailAddress(String emailAddress);
}

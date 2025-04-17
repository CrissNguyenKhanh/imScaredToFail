package StudentWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StudentWeb.Entity.TotNghiep;
@Repository
public interface TotNghiepRepository extends JpaRepository<TotNghiep, String> {

}

package StudentWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StudentWeb.Entity.CongViec;
@Repository
public interface CongViecRepository extends JpaRepository<CongViec, String> {

}

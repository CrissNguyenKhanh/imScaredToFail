package StudentWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StudentWeb.Entity.nganh;
@Repository
public interface NganhRepository  extends JpaRepository<nganh, String>{


}

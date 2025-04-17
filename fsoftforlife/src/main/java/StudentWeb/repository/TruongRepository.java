package StudentWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StudentWeb.Entity.truong;
 @Repository
public interface TruongRepository extends JpaRepository<truong, String> {
 
}

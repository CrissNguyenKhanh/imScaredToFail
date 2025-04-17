package StudentWeb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StudentWeb.Dao.StudentDao;
import StudentWeb.Dto.StudentDto;
import StudentWeb.Entity.Sinhvien;

@Service
public interface IStudent {
 
  public int addStudent(StudentDto students);
  
  public boolean checkExistStudent(String soCmnd);
  public List<Sinhvien> getListStuden(String name);
  public List<Sinhvien> getAllListStudent();
   
}

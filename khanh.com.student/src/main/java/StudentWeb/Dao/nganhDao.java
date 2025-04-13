package StudentWeb.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import StudentWeb.Entity.nganh;
import StudentWeb.Entity.nganhMapper;

@Repository
public class nganhDao extends BaseDao {
   public List<nganh> getListNganh(){
	   List<nganh> nganhList = new ArrayList<nganh>();
	   String sql = "SELECT * FROM nganh";
	   nganhList = _jdbcTemplate.query(sql, new nganhMapper());
	   return nganhList;
     	   
   }
}

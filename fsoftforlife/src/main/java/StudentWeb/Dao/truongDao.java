package StudentWeb.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import StudentWeb.Entity.truong;
import StudentWeb.Entity.truongMapper;
@Repository
public class truongDao extends BaseDao{
	
	
 public List<truong> getListTruong(){
	 List<truong> truongOnly = new ArrayList<truong>();
     String sql = "SELECT  *  FROM truong ";
     truongOnly = _jdbcTemplate.query(sql, new truongMapper());
     return truongOnly;
	 
 }


}

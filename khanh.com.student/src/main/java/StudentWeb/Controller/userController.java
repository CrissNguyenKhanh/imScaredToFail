package StudentWeb.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.Validator;

import StudentWeb.Dao.StudentDao;
import StudentWeb.Dto.SinhVienFind;
import StudentWeb.Dto.StudentDto;
import StudentWeb.Entity.Sinhvien;
import StudentWeb.Service.StudentService;
 

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class userController extends BaseController {
	 @Autowired
	private  StudentService studentService = new StudentService();
	 
	
	
	 @RequestMapping(value  = "/list-user" , method = RequestMethod.GET)
 
	 public  List<Sinhvien> listSinhVien() {
		 List<Sinhvien> sv = studentService.getAllListStudent();
		 return sv;
		 
	 }
	 @RequestMapping(value  = "User" , method = RequestMethod.GET)
	 public List<Sinhvien>  findvip(@RequestParam("hoTen") String name ,ModelMap modelmap) {
		 List<Sinhvien> sv = studentService.getListStuden(name);
		
		 return sv;
		 
	 }
	 
	 
	 @RequestMapping(value  = "tim-kiem" , method = RequestMethod.GET)
	 public ModelAndView timkiem(@RequestParam("hoTen") String name ,ModelMap modelmap) {
		 List<Sinhvien> sv = studentService.getListStuden(name);
		 _mvShare.setViewName("layouts/user/find");
		 _mvShare.addObject("student",studentService.getListStuden(name));
		 return _mvShare;
		 
	 }
	 
	 
	 @RequestMapping(value  = "tim-kiem-full-thong-tin" , method = RequestMethod.GET)
	 public ModelAndView timKiemFullThongTin(@RequestParam("hoTen") String name ,ModelMap modelmap) {
		 Sinhvien SV = studentService.getCmndSinhVien(name);
		 SinhVienFind svf = studentService.getListFind(SV);
		 
		 if(svf != null ) {
			 _mvShare.setViewName("layouts/user/findFullThongTin");
			 _mvShare.addObject("student",studentService.getListFind(SV));
			 return _mvShare;
		 }else {
		  _mvShare.setViewName("layouts/user/userForm");
			 return _mvShare;
		 }
		
	 }
	   
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public ModelAndView Register() {
		
		_mvShare.addObject("student",new StudentDto());
		_mvShare.addObject("truong",studentService.getListTruong());
		_mvShare.addObject("nganh",studentService.getListNganh());
		_mvShare.setViewName("layouts/user/userForm");
		 return _mvShare;
	  
	}
	
	@RequestMapping(value ="Add-Student", method=RequestMethod.POST )
	public ModelAndView CreateStudent( @ModelAttribute("student") StudentDto students  , BindingResult result ) {
//		 userValidator.validate(students, result);
//	    if(result.hasErrors()) {
//	    	_mvShare.addObject("student",new StudentDto());
//			_mvShare.addObject("truong",studentService.getListTruong());
//			_mvShare.addObject("nganh",studentService.getListNganh());
//			_mvShare.setViewName("layouts/user/userForm");
//			 return _mvShare;
//	    	
//	    }
//
		try {
			 
			int addStudent = studentService.addStudent(students);
	      
			if (addStudent == 1) {
			    _mvShare.addObject("Status", "Thêm mới học sinh thành công");
			} else if (addStudent == -1) {
			    _mvShare.addObject("Status", "Thêm mới học sinh thất bại, CMND đã tồn tại");
			    _mvShare.setViewName("layouts/user/userForm");
			    return _mvShare;
			} else {
			    _mvShare.addObject("Status", "Lỗi hệ thống, vui lòng thử lại sau");
			    _mvShare.setViewName("layouts/user/userForm");
			    return _mvShare;
			}
		    
		} catch (Exception e) {
			 System.out.println("Lỗi khi thêm vào CSDL: " + e.getMessage());
			    e.printStackTrace(); // In rõ lỗi ra console
			    return _mvShare;
		}
		return _mvShare;
	}
	
		
		
		
		
		
	
	
	
	 

	
	
	
	
	
	
	
	
	
	
}

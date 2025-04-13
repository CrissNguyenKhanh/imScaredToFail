package StudentWeb.validator; 

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import StudentWeb.Dto.StudentDto;

public class validator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return StudentDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
	  StudentDto student = (StudentDto) target;
	  if(student.getSoCmnd() == null || student.getSoCmnd().length() == 0) {
		  errors.rejectValue("SoCmnd", "field.required");
	  }
		
	}

}

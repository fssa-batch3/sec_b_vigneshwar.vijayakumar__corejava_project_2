package in.fssa.globalfuncity.util;

import in.fssa.globalfuncity.exception.ValidationException;

public class StringUtil {
	 public static void rejectIfInvalidString(String input, String inputName) throws ValidationException{
    	 if(input == null || "".equals(input.trim())) {
    		 throw new ValidationException(inputName.concat(" cannot be null or empty"));
    	 }
     }
    
    
}
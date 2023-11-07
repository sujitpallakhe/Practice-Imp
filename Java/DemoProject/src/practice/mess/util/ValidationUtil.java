package practice.mess.util;

import java.time.LocalDate;
import java.util.Map;

import practice.mess.exceptions.InvalidMobileNumber;
import practice.mess.exceptions.InvalidRegistrationDate;
import practice.mess.exceptions.MessException;
import practice.mess.pojo.MessMember;

public class ValidationUtil {

	public static boolean checkValidaData(MessMember messMember){
		boolean flag = false;
		try {
			boolean isMobileNumberValid = validateMobileNumber(messMember.getMobileNumber());
			boolean isEmailValid = validateEmail(messMember.getEmail());
			boolean isRegistrationDateValid = validateRegistrationDate(messMember.getRegistrationDate());
			
			if(isMobileNumberValid && isEmailValid && isRegistrationDateValid) {
				flag = true;
			}
		}catch(MessException ex) {
			System.out.println(ex.getMessage());
		}
		return flag;
	}
	
	private static boolean validateMobileNumber(String mobileNumber) throws InvalidMobileNumber {
		String mobileValidationRegex = "^\\s*-?[0-9]{1,10}\\s*$";
		if (mobileNumber.matches(mobileValidationRegex)) {
			return true;
		} else {
			throw new InvalidMobileNumber("Mobile number is not valid");
		}
	}
	
	private static boolean validateEmail(String email) throws InvalidMobileNumber {
		
		/*
		 * String emailValidatationRegex =
		 * "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,}"; if
		 * (email.matches(emailValidatationRegex)) { return true; } else { throw new
		 * InvalidPhoneNumber("Email is not valid"); }
		 */
		
		return true;
	}
	
	/*
	 * Registration Date validation
	 * Registration Date is valid if it is equal to today's date or after today's date 
	 */
	private static boolean validateRegistrationDate(LocalDate regDate) throws InvalidRegistrationDate {
		LocalDate today = LocalDate.now();
		if (today.isEqual(regDate) || regDate.isAfter(today)) {
			return true;
		} else {
			throw new InvalidRegistrationDate("Registation date is Invalid : " + regDate);
		}
	}

	// Check Duplicate
	public static boolean checkDuplicate(Map<Integer, MessMember> memberMap, MessMember messMember) {
		boolean flag = false;
		flag = memberMap.containsValue(messMember); // Equals and Hashcode overridden in MessMember
		return flag;
	}
	
}

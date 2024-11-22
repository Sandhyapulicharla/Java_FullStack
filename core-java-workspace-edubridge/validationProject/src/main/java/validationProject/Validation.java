package validationProject;

public class Validation {
	public String validation(String userName,String password) {
		
		if(userName.equalsIgnoreCase("admin") && password.equals("admin")) {
			return "success";
		}
		else {
			return "failure";
		}
	}
}

package mvcdemo.controllers;

public class Authenticator {
	
	public String authenticate(String username, String password) {

	if (("Ram".equalsIgnoreCase(username))
			&& ("1234".equals(password))) {
		return "success";
	} else {
		return "failure";
	}
}
	
}

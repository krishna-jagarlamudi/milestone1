package com.wipro.exceptionhandling;

public class Problem4 {

	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
		
		
	}

	public static void main(String[] args) {
		Problem4 registration = new Problem4();
		
		try {
			registration.registerUser("Rohith", "India");
		} catch (InvalidCountryException e) {
		}
	}

}
class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India  cannot be registered");
	}

}

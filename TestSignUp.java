package com.FacebookTest;

public class TestSignUp {

	public static void main(String[] args) {
		
		FacebookSignUp objFacebookSignUp = new FacebookSignUp();
		
		objFacebookSignUp.openBrowser();
		objFacebookSignUp.getSignUpDetails();
		objFacebookSignUp.closeBrowser();
				

	}

}

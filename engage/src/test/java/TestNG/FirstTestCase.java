package TestNG;

import org.testng.annotations.Test;

/*
 * 1.)open app
 * 2.)Login
 * 3).logout
 */
public class FirstTestCase {
	@Test
	void openapp() {
		System.out.println("open application");
	}
	@Test
	void login() {
		System.out.println("Login");
	}
	@Test
	void logout() {
		System.out.println("logout");
	}

}

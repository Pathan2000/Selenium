package Day42;

import org.testng.annotations.Test;

/*
 * 1.open app
 * 2.login
 * 3.logout
 */

public class MyFirstTestCase {
	@Test(priority=1)
	void openapp() {
		System.out.println("openapp");
	}
	@Test(priority=2)
	void login() {
		System.out.println("login");
	}
	@Test(priority=3)
	void logout() {
		System.out.println("Logout");
	}
}

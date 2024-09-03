package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1.login
 * 2.search
 * 3.logout
 * 4.login
 * 5.advance Search
 * 6.logout
 */
public class AnnotationsDemo1 {
	@BeforeMethod
	void login() {
		System.out.println("login....");
	}
	@Test(priority=1)
	void search() {
		System.out.println("Search....");
	}
	@Test(priority=2)
	void AdvSearch() {
		System.out.println("AdvSearch...");
	}
	@AfterMethod
	void logout() {
		System.out.println("Logout");
	}

}

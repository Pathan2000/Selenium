package day43;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {
	@Test(priority=3)
	void pqr() {
		System.out.println("This is c3 Test..");
	}
	@BeforeSuite
	void bs() {
		System.out.println("Before Suite...");
	}
	@AfterSuite
	void as() {
		System.out.println("AfterSuite..");
	}
}

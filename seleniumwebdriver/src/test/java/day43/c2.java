package day43;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class c2 {
	@Test(priority=2)
	void xyz() {
		System.out.println("This test from c2");
	}
	@AfterTest
	void at() {
		System.out.println("This is after test..");
	}
}

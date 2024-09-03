package day43;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	@Test(priority=1)
	void abc() {
		System.out.println("this is abc from c1..");
	}
	@BeforeTest
	void bt() {
		System.out.println("This is before test.....");
	}
}

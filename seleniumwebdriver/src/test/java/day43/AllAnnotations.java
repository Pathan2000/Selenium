package day43;

import org.testng.annotations.*;

public class AllAnnotations {
	@BeforeSuite
	void bs() {
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	void as() {
		System.out.println("AfterSuite");
	}
	@BeforeTest
	void bt() {
		System.out.println("Beforetest");
	}
	@AfterTest
	void at() {
		System.out.println("AfterTest");
	}
	@BeforeMethod
	void bm() {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	void Am() {
		System.out.println("AfterMethod");
		
	}
	@BeforeClass
	void bc() {
		System.out.println("Before Class");
	}
	@AfterClass
	void ac() {
		System.out.println("After Class");
	}
	@Test(priority=1)
	void test1() {
		System.out.println("test1");
		
	}
	@Test(priority=2)
	void test2() {
		System.out.println("test2");
	}
	@Test(priority=3)
	void test3() {
		System.out.println("test3");
	}
	@Test(priority=4)
	void test4() {
		System.out.println("test4");
		
	}
	

}

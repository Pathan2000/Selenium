package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	//@Test
	void Test_hardAssertion() {
		
		System.out.println("testing1...");
		System.out.println("testing2...");
		Assert.assertEquals(1, 2);// Assert condition
		System.out.println("testing3...");
		System.out.println("testing4...");
		// if we use hard assertions , if Assertion condition is failed then rest of the code doen't execute.

	}
	@Test
	void Test_SoftAssertion() {
		System.out.println("testing1...");
		System.out.println("testing2...");
		SoftAssert sa = new SoftAssert();//soft assertion
		sa.assertEquals(1, 2);
		//Assert.assertEquals(1, 2);// Assert condition
		System.out.println("testing3...");
		System.out.println("testing4...");
		sa.assertAll();//Mandatory to write this end of program, then only soft Assert will work
	}
}

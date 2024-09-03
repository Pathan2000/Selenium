package day43;

import org.testng.annotations.Test;

public class AssertionsDemo {
	@Test
	void Assert() {
		String exp_Title="OpenCart";
		String Act_Title="OpenCart";
		org.testng.Assert.assertEquals(Act_Title, exp_Title);
		/*if(exp_Title==Act_Title) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}*/
	}
}

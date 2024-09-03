package day44;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority=1,groups={"sanity","regression","functional"})
	void cash() {
		System.out.println("cash");
	}
	@Test(priority=2,groups={"sanity","regression","functional"})
	void paytm() {
		System.out.println("paytm");
	}
	@Test(priority=3,groups={"sanity","regression","functional"})
	void paypol() {
		System.out.println("paypol");
	}
}

package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test() {
		Assert.assertEquals(253656, 253656);
		Assert.assertTrue(1==1);
	}
}

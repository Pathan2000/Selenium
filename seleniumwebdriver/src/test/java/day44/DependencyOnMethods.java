package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyOnMethods {
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login() {
		Assert.assertTrue(true);

	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(false);

	}
	@Test(priority=4,dependsOnMethods= {"login"})
	void Advsearch() {
		Assert.assertTrue(false);

	}
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(false);

	}
	
}

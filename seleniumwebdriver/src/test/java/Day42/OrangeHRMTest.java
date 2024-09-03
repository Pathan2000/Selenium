package Day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
 * 1.open app
 * 2.test logo presence
 * 3.login
 * 4.close
 */
public class OrangeHRMTest {
	WebDriver driver;
	@Test(priority=1)
	void openapp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	void TestLogo() throws InterruptedException {
		Thread.sleep(1000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Displaying"+status);
		
	}
	@Test(priority=3)
	void login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test(priority=4)
	void close() {
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		
	}

}

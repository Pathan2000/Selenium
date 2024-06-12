package engage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Yogesh {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("adjmin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")));
		if(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")) != null) {
			driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin1");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			System.out.println(driver.findElement(By.tagName("h6")).getText());
			driver.findElement(By.tagName("h6")).getText();
			Assert.assertEquals(driver.findElement(By.tagName("h6")).getText(), "Reset Password link sent successfully");
			driver.close();
		}
		else {
			driver.close();
		}
		}		
	}
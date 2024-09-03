package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//IsDisplayed
		System.out.println(driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed());
		//IsEnabled
		System.out.println(driver.findElement(By.xpath("//input[@data-val-required='First name is required.']")).isEnabled());
		//Is Selected
		System.out.println(driver.findElement(By.xpath("//input[@data-val-required='The Newsletter field is required.']")).isSelected());
		driver.close();
	
	}

}

package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//when the Sendkeys or click operation is not working and getting elementinterceptedException , then we use Javascript executor
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//passing the text in input box (sendkeys method)
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		
		//Click action
		WebElement click=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", click);
	}

}

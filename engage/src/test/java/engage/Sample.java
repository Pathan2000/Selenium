package engage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	WebDriver driver;
    @Test
	public static void loginpage() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://iengage.coforge.com/ess1/Authentication/LoginAuth.aspx");
		//driver.get.maximize();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println("1");
		driver.findElement(By.xpath("//input[@name='txtEmpCode']")).sendKeys("101846");
		System.out.println("2");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Password@123");
		System.out.println("3");
		driver.findElement(By.xpath("//input[@name='imgBtnOK']")).click();
		System.out.println("4");
		driver.findElement(By.xpath("(//button[contains(@class,'btn btn-primary')])[1]")).click();
		System.out.println("5");
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle1'])[1]")).click();
		System.out.println("6");
		//webElement frameElement = driver.findElement(By.id("frame-id"));
		driver.switchTo().frame(1);
		//driver.switchTo().frame(0);
		System.out.println("7");
		driver.findElement(By.xpath("(//a[@target='_blank'])[1])")).click();
		System.out.println("Hii");






	}

}

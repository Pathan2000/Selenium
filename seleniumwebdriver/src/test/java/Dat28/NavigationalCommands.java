package Dat28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
//navigate().to()
//navigate().back()		
//navigate().forward()		
//navigate().refresh()
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println("2");
		driver.navigate().forward();
		System.out.println("3");
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
	}

}

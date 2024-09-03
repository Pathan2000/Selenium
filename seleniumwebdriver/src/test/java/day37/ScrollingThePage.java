package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingThePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor Js =(JavascriptExecutor)driver;		
		//Scroll down the page by using pixel number
//		Js.executeScript("window.scrollBy(0,1000)", "");
//		System.out.println(Js.executeScript("return window.pageYOffset;"));
		
		//Scroll the page until element is visible
//		WebElement Ele = driver.findElement(By.xpath("//strong[text()='Community poll']"));
//		Js.executeScript("arguments[0].scrollIntoView();", Ele);
//		System.out.println(Js.executeScript("return window.pageYOffset;"));
		
		//Scroll page till end of the page
		Js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(Js.executeScript("return window.pageYOffset;"));
		Thread.sleep(3000);
		//Scroll upto to top
		Js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		


		
	}

}

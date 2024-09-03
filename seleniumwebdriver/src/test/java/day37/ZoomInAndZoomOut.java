package day37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInAndZoomOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.manage().window().minimize();
		JavascriptExecutor Js =(JavascriptExecutor)driver;	
		Js.executeScript("document.body.style.zoom='10%'");

	}

}

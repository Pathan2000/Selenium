package projectsme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Assignment_problem_test {
	public void Login_test() throws InterruptedException
	{

        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.testfire.net/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//font[text()='Sign In']")).click();
		 Thread.sleep(2000);
		
		driver.findElement(By.id("uid")).sendKeys("Admin");
		 Thread.sleep(2000);
		driver.findElement(By.id("passw")).sendKeys("Admin");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
		 Thread.sleep(2000);
		 WebElement ddown = driver.findElement(By.xpath("//*[@id=\"listAccounts\"]"));
	        Select select = new Select(ddown);
	        
	        select.selectByValue("800000");
	        driver.findElement(By.id("btnGetAccount")).click();
	        
	        Thread.sleep(5000);
	     ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
	        System.out.println(driver.getTitle());
	        String anyname=driver.findElement(By.xpath("html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
			System.out.println("AVAILABLE BALANCE:" +anyname);
			String current=driver.findElement(By.xpath("//td[text()='45.25']")).getText();
			System.out.println("Electric Bill:" +current);
		driver.close();
	
	}
	

}
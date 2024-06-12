package engage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mathematics {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.EdgeDriver", "C:\\Users\\pathan.khan\\Downloads\\edgedriver_win64");
    	WebDriver driver= new ChromeDriver();    	
		driver.get("https://iengage.coforge.com/ess1/authentication/Login.aspx");
		driver.findElement(By.xpath("//button[@class='btn btn-link text-white textUnderline p-0 f-15']")).click();		
		driver.findElement(By.xpath("//input[@name='txtEmpCode']")).sendKeys("101846");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("humTdumt$@t0nAwa2233");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='imgBtnOK']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//a[@title='Mark Attendance']")).click();
		//driver.findElement(By.className("close")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[ (@title=\'Attendance\')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_cmdMarkForToday']")).click();
		
		driver.close();
		//driver.quit();
	}
	
}
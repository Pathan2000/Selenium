package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//1.FullPage Screenshot
	/*	TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);//copy sourcefile to target file*/
		
		//2. Capture the screenshot of specific section
		/*WebElement specificsection=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile=specificsection.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\specificsection.png");
		sourcefile.renameTo(targetfile);*/
		
		//3.Capture the screenshot of web element section
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		sourcefile.renameTo(targetfile);
	}

}

package mavenpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FitPeo {
	static WebDriver driver = new ChromeDriver();
	static Actions actions = new Actions(driver);

	static void  FitPeo_Homepage(){
		driver.get("https://www.fitpeo.com/");	
		driver.manage().window().maximize();
	}
	static void Navigate_to_the_Revenue_Calculator_Page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
	}
	static void Scroll_To_Slider_Calculator() {
//		WebElement Calculator = driver.findElement(By.xpath("//div[@class='MuiBox-root css-19zjbfs']"));
		WebElement Calculator = driver.findElement(By.xpath("//span[text()='Patients should be between 0 to 2000']"));
		actions.keyDown(Calculator, Keys.ARROW_DOWN).perform();
	}
	static void Adjust_the_Slider_820() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(20000);
//		WebElement slider1 = driver.findElement(By.xpath("//span[@style='left: 10%;']"));
//		WebElement slider2 = driver.findElement(By.xpath("//span[@style='left: 41%;']"));
		//actions.dragAndDrop(slider1, slider2).perform();
		WebElement slider=driver.findElement(By.xpath("//span[@data-index='0']"));
		System.out.println(slider.getLocation());
		System.out.println(slider.getSize());
		actions.dragAndDropBy(slider, 250,0).perform();
//		actions.dragAndDrop(slider, slider)
		System.out.println(slider.getLocation());
		System.out.println(slider.getSize());	
	}
	static void Update_the_Text_Field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@aria-invalid='false']")).clear();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//input[@aria-invalid='false']")).sendKeys("0");
		
	}

	public static void main(String[] args) throws InterruptedException {
		FitPeo_Homepage();
		Navigate_to_the_Revenue_Calculator_Page();
		Scroll_To_Slider_Calculator();
		Adjust_the_Slider_820();
		Update_the_Text_Field();
	}

}

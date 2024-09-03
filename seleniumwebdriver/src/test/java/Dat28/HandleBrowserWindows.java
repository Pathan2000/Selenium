package Dat28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		Set<String> windowId=driver.getWindowHandles();
		/*List<String> windowList=new ArrayList(windowId);
		String parentID=windowList.get(0);
		String childID=windowList.get(1);
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());*/
		for(String winID:windowId) {
			String title = driver.switchTo().window(winID).getTitle();
			if(title.equals("OrangeHRM")) {
				driver.close();
			}
		}

	
	
	
	
	}

}

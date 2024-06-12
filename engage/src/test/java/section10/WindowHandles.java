package section10;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		//Iterator It=windows.iterator();
		Iterator<String> it = windows.iterator();
		String ParentId= it.next();
		String ChildId = it.next();
		System.out.println(driver.switchTo().window(ChildId).findElement(By.xpath("//p[@class='im-para red']")).getText());
	}

}

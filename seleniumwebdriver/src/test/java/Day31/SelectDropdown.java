package Day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement CountryListElement=driver.findElement(By.xpath("//select[@id='country']"));
		Select Country = new Select(CountryListElement);
		//Country.selectByIndex(3);
		//Country.selectByValue("germany");
		//Country.selectByVisibleText("France");
		List<WebElement>options=Country.getOptions();
		System.out.println(options.size());
		for(int i=0; i<options.size();i++) {
		System.out.println(options.get(i).getText());
		}
		
	}

}

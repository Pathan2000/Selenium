package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//single file upload
	/*	driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:\\Users\\pathan.khan\\Desktop\\File_Upload.txt");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("File_Upload.txt")) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		} */
		
		//MultipleFiles upload
		String file1 = "C:\\\\Users\\\\pathan.khan\\\\Desktop\\\\File_Upload.txt";
		String file2 = "C:\\\\Users\\\\pathan.khan\\\\Desktop\\\\File_Upload2.txt";
		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys(file1+"\n"+file2);
//		int NoOfFiles =driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
//		if(NoOfFiles==2) {
//			System.out.println("Success");
//		}
//		else {
//			System.out.println("Failure");
//		}
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("File_Upload.txt")
		&& 		driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("File_Upload2.txt")) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		}

		
		
		
	}

}

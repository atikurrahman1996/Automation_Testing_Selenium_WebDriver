package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileDay17 {

	public static void main(String[] args) {
		
		
       System.setProperty("webdriver.gecko.driver", "C:\\Soft\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://edutechs.org/");  
		
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id=\"newUploadFileInputLink\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"newUploadFileInputLink\"]")).sendKeys("C:\\Users\\atik\\Downloads\\Documents\\Atik\\MD ALI ALOM.pdf");
		
		
	}

}

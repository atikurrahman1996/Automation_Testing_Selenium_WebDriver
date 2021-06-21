package LearningSeleniumWebdriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWaitDay11 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://www.google.com/");
		
		
		driver.manage().window().maximize();
		
		
		// Implicit Wait
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // It shows error

		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);  
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3")).click(); 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

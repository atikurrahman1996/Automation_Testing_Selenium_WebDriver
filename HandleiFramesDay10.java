package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleiFramesDay10 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		
		driver.manage().window().maximize();
		
		
		// 1st iFrame 
		
		
		driver.switchTo().frame("packageListFrame");   // name of the frame 
	
		driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		
		driver.switchTo().defaultContent();
		
		
		// Second iFrame
		
		
		driver.switchTo().frame("packageFrame");   // name of the frame 
		
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a")).click();
		driver.switchTo().defaultContent();
		
		
		
		// 3rd iFrame 
		
         driver.switchTo().frame("classFrame");   // name of the frame 
		
		 driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
		 driver.switchTo().defaultContent();
	}

}

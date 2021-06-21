package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClickActionsDay13 {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		
	WebElement field1=	driver.findElement(By.xpath("//*[@id=\"field1\"]"));
	
	    field1.clear();
		
		field1.sendKeys("Welcome to Selenium");
		
		
	WebElement button=driver.findElement(By.xpath("/html/body/button"));
	
	Actions act = new Actions(driver);
	
	act.doubleClick(button).perform();  // Performs the double click actions
	
	
		
		
	}

}

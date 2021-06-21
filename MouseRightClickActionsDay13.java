package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickActionsDay13 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		driver.manage().window().maximize();
		
		
		
	WebElement button =	driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	
	Actions act = new Actions(driver);
	
	act.contextClick(button).perform();  // Right click action 
		
		
		
		
		

	}

}

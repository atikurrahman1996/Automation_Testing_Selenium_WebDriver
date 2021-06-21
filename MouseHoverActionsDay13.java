package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionsDay13 {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://demo.opencart.com/");
		
		
		driver.manage().window().maximize();
		
		
		WebElement desktopsMenu=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
		
		
		WebElement macMenuItem=driver.findElement((By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(desktopsMenu).moveToElement(macMenuItem).click().perform();
	}

}

package LearningSeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksVsLinkTextDay9 {

	public static void main(String[] args) {

		
   System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.com/");
		
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		
	   // driver.findElement(By.partialLinkText("Deals")).click();
		
		
		
		// How to captured all the links from the web page
		
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		//System.out.println("The number of links: "+links.size());    // output 263
		
		// using for loop
		
		for(int i=0; i<=links.size(); i++)
{
	  System.out.println(links.get(i).getText());
	  
	  System.out.println(links.get(i).getAttribute("href")); 
}
		
		
	}

}

package LearningSeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementVsfindElementsDay4 {

	public static void main(String[] args) {

		
		
    System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.com/");
		
		
		// findElement -> return the Single Web element 
		
		
		
	WebElement searchbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	searchbox.sendKeys("XYZ");     
	
	
	//findElements -> returns multiple Web Element 
	
	
      List<WebElement>links= driver.findElements(By.xpath("//div[@id='navFooter']//a"));
	
	System.out.println("The Number of Element Captured: "+links.size());   //output 69
	
	
	for(WebElement ele:links)
	{
		System.out.println(ele.getText());
	}
		
	}

}

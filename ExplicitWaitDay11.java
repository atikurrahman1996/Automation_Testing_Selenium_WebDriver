package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDay11 {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://www.google.com/");
		
		
		driver.manage().window().maximize();
		
		
       // Explicit Wait 
		
		
        WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);  
		
	    WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3")));
	    
	    element.click();
		
		
	
	
	}

}

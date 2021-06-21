package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWebElementDay2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("http://hrd.smef.gov.bd/index.php/participant/index/505");
		
		 //driver.get("https://edutechs.org/register/");
		
		
		//isDisplayed() ,  isEnabled()
		
		WebElement searchStore=driver.findElement(By.xpath("//input[@name='mob']"));
		
		//WebElement searchStore=driver.findElement(By.xpath("//input[@type='password']"));
		
		
		System.out.println("Display status: "+searchStore.isDisplayed());  // true 
		System.out.println("Enable status: "+searchStore.isDisplayed());  // true 

		
		// isSelected   for check radio buttons, check boxes, drop down
		
		
		WebElement male =driver.findElement(By.xpath("//input[@value='Male']"));
		
		
	    WebElement female =driver.findElement(By.xpath("//input[@value='Female']"));
	    
	    
	    System.out.println(male.isSelected());    // False 
	    System.out.println(female.isSelected());  // False 
	    
	    
	    male.click();   // select the male radio button 
	    
	    System.out.println(male.isSelected());    // True 
	    System.out.println(female.isSelected());  // False 
	    
	    
	    female.click();   // select the female radio button 
	    
	    System.out.println(male.isSelected());    // False 
	    System.out.println(female.isSelected());  // True
	    
	    
	    
	    

	    
	    


	}

}

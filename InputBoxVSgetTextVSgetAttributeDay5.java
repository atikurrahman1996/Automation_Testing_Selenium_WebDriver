package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxVSgetTextVSgetAttributeDay5 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
	
		WebElement emailinputbox=driver.findElement(By.id("Email"));   // admin@yourstore.com
		
		//emailinputbox.clear();                   // Clear the current email 
		
		//emailinputbox.sendKeys("atikur2018rahman@gmail.com");  // again input this email
		
		
		// Capturing text from box 
		
	 System.out.println("Result from getAttribute is:"+emailinputbox.getAttribute("value"));     //getAttribute use for value text capturing  // output admin@yourstore.com
	
	 System.out.println("Result from getText is:"+emailinputbox.getText());    // getText use for inner text capturing    // output empty 

	 
	 
	 // Login Button 
	 
	 WebElement button =driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	 
	 System.out.println(button.getAttribute("type"));
	 System.out.println(button.getAttribute("class"));
	 
	 System.out.println(button.getText());

	String title = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[1]")).getText();
	System.out.println(title);

	}

}

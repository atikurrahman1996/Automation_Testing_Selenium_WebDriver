package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkNewTabDay15 {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		String tab= Keys.chord(Keys.CONTROL, Keys.RETURN);
		
		driver.findElement(By.linkText("Register")).sendKeys(tab);
		
		
		
	}

}

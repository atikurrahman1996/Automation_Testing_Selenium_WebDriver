package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropDownDay6 {

	public static void main(String[] args) {
		
		
  System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/\r\n");
		
		
		Select noOfEmpsdrp=new Select(driver.findElement(By.name("NoOfEmployees")));
		
		noOfEmpsdrp.selectByVisibleText("16 - 20");
		
		Select industryDrp=new Select(driver.findElement(By.name("Industry")));
		
		industryDrp.selectByVisibleText("Travel");
		
		
		Select countryDrp=new Select(driver.findElement(By.name("Country")));
		
		countryDrp.selectByVisibleText("Bangladesh");

		
		
		
		
				
		
		
	}

}

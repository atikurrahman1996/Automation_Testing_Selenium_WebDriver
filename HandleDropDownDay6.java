package LearningSeleniumWebdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class HandleDropDownDay6 {

	public static void main(String[] args) {
		
		
  System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		
		// selectByVisibleText() //selectByValue //selectByIndex
		
		WebElement dropdownCountryEle= driver.findElement(By.id("input-country"));
		
		
		Select dropdownCountry=new Select(dropdownCountryEle);
		
		
		dropdownCountry.selectByVisibleText("Bangladesh");
		
		dropdownCountry.selectByValue("18");   // Output Bangladesh 
		
		dropdownCountry.selectByIndex(38);     // Canada
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

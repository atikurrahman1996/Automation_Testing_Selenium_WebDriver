package LearningSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDay12 {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://www.selenium.dev/downloads/");
		
		
		driver.manage().window().maximize();
		
		
		// How many rows in Table 
		
		
	int rows=driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
	
	System.out.println("The number of rows in the table: "+rows);    // output 5
	
	// How many column in the table 
	
	int column=driver.findElements(By.xpath("//table[@class='data-list']/thead/tr/th")).size();
	
	
	System.out.println("The number of column in the table: "+column);  // output 6
	
	
		
	}

}

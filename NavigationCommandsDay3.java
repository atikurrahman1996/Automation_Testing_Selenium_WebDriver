package LearningSeleniumWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsDay3 {

	public static void main(String[] args) {
		
		
       System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://www.daraz.com.bd/");
		
		driver.get("https://evaly.com.bd/");
		
		//driver.navigate().to("https://evaly.com.bd/");         
		
	//Remember- navigate.to() method and get() method are same (using for open the URL)
		// The difference between get() method & navigate.to()method:
				//Get() method is used to open URL and wait till page load but navigate.to()method open URL but doesn't wait page load 
				
		
		
    //navigate.back(), navigate.forward(), navigate.refresh()
		
		
		driver.navigate().back();       // Open Daraz Web page
		driver.navigate().forward();   // Evaly 
		
		driver.navigate().refresh();  // refresh or reload page 
		
		
		
		
		
	}

}

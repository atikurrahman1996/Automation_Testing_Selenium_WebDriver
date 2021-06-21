package LearningSeleniumWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGetCommandsDay1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");

		
		
		ChromeDriver driver = new ChromeDriver();  // Open Browser
		
		driver.get("https://edutechs.org/");     // Open URL 
		
		System.out.println("The title of the web page is: "+driver.getTitle());     // Capture web page title
		
		System.out.println("Current URL  of the web page is: "+driver.getCurrentUrl());  // Capture Current URL 
		
		System.out.println(driver.getPageSource());   // Capture Web page source code 

		
		
		
		
	}

}

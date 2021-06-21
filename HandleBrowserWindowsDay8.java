package LearningSeleniumWebdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindowsDay8 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		// getWindowHandle 
		
		//String windowID = driver.getWindowHandle();    // Return ID of the single browser window
		
		//System.out.println(windowID);    // output- CDwindow-12AFD20A17A13FDA2EBDEBBD70F75968
		
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/a")).click();  // open another browser window (child window)
		
		
		//getWindowHandles
		
		Set<String>windowIDs=driver.getWindowHandles();  // Return IDs of multiple windows 
		
		//Iterator method 
		
	
		Iterator<String>it= windowIDs.iterator();
		
		String parentWindowID=it.next();
		String childWindowID=it.next();
		
		System.out.println(parentWindowID);   // CDwindow-1DE1E0626D1533FDAEE1753D1B860C95
		
		System.out.println(childWindowID);  //CDwindow-A2F02084F0A35FC5D63F25D5F7693425
		
		
		
		driver.close();     // close single browser 
		
		//driver.quit();      // close all browser 
		
		
		

	}

}

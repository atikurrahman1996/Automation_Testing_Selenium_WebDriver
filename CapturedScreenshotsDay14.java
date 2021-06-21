package LearningSeleniumWebdriver;

//import java.io.File;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturedScreenshotsDay14 {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		
		// Take Full page screenshot
		
		/*
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File trg=new File(".\\JavaBasic\\homepage.png");  */
		
		
	 driver.close();
	}

}

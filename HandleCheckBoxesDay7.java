package LearningSeleniumWebdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxesDay7 {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		
		
		//Select specific check boxes 
		
		
		//driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click();   // Output Monday 
		
		
		// Select all check boxes 
		
		
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		System.out.println("The total number of check boxes: "+checkboxes.size());    // output 7
		
		
		// Using for lop 
		
		/*for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();              // output select all 7 boxes 
		}*/

		
		
		// Select multiple check boxes by choice // My choice is Monday and Sunday 
		
		
		for(WebElement chbox:checkboxes)
		{
			String checkboxname =chbox.getAttribute("id");
			
			if(checkboxname.equals("monday") || checkboxname.equals("sunday"))
			{
				
				chbox.click();
				
			}
			
			
		}
		
		
		
		
		
		
		
	}

}

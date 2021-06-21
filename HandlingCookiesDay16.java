package LearningSeleniumWebdriver;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingCookiesDay16 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
		// Captured Cookies from the browser 
		
		
	Set <Cookie> cookies=	driver.manage().getCookies();
	
	System.out.println("The size of the cookies:"+cookies.size());
	
	
	//Print cookies from the browser // Name of the cookies and value of the cookies 
	
	
	for(Cookie cookie: cookies)
	{
		System.out.println(cookie.getName()+": "+cookie.getValue());  //output 4
	}
	
		
		// Add cookies to the browser 
	
	Cookie cookieobj=new Cookie("My cookies123", "Your cookies325");
	
	driver.manage().addCookie(cookieobj);
	cookies=driver.manage().getCookies();
	
	System.out.println("Size of the cookies aftet adding:"+cookies.size());   // output 5
	
	
	// delete cookies 
	
	
	driver.manage().deleteCookie(cookieobj);
	
	//driver.manage().deleteCookieNamed("My cookies123");
	
	cookies=driver.manage().getCookies();
	
	System.out.println("Size of the cookies aftet deleting:"+cookies.size());   // output 4
	
	
	driver.quit();
	
	
	
	 
	}

}

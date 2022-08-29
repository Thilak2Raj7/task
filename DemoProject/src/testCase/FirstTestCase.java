package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	
	 public static void main(String[] args) {  
	        
		      
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();
		    driver.navigate().to("http://www.google.com/");  
		    driver.getTitle();
		 System.out.println(driver.getTitle());
	   
	 }
}

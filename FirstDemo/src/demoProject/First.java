package demoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.servicedeskplus.com/app#/admin/modules/priority");
		driver.navigate().to("https://demo.servicedeskplus.com/app#/admin/modules/priority");
		driver.findElement(By.className("per50")).click();
        //driver.navigate().forward();
		driver.findElement(By.className("truncate-wrapper")).click();
		driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='header-menu-icons']")).click();
		
	}
}

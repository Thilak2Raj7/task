package demoProject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.servicedeskplus.com");
		driver.findElement(By.xpath("//*[@id='scroll']/div/div[2]/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id='esmPortalHome']/div[2]/div[1]/div/div[1]/div/div[1]/img")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("admin-hi")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id='admin-landing-page']/div[1]/div[1]/div/div[2]/div/input")).sendKeys("Priority");
		driver.findElement(By.xpath("//*[@id='select2-result-label-357']/a")).click();
        driver.findElement(By.id("add_new_priorities")).click();
        driver.findElement(By.id("priorities_name")).sendKeys("First");
        driver.findElement(By.id("saveform")).click();
	}

}

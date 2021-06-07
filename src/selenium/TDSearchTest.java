package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.td.com/ca/en/personal-banking/");

		driver.findElement(By.className("td-desktop-search-show-btn")).click();
		driver.findElement(By.name("query")).sendKeys("credit card");
		
		
		
	}

}
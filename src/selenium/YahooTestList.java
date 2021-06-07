package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTestList {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver(); 
			driver.get("https://ca.yahoo.com/?p=us");
			List <WebElement> allLinks=driver.findElements(By.xpath("//li[contains(@class,'trending-list')]/ul/li"));
			  System.out.println(allLinks.size()); //we are printing size of element
				    



				
	}
	}



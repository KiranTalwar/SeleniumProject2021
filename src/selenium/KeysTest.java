package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://login.yahoo.com/?.src=fpctx&.intl=ca&.lang=en-CA&.done=https://ca.yahoo.com&activity=uh-signin&pspid=2142623533");
        driver.findElement(By.name("username")).sendKeys("ayushiayushi10");
        driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
        
	}

}

package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://www.echoecho.com/javascript.htm");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebDriverWait wait= new WebDriverWait(driver,20);
			driver.findElement(By.name("B2")).click();
			
	}
	

}

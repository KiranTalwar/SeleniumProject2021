package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver(); 
			driver.get("https://www.adidas.ca/en/account-login");
			
			driver.findElement(By.id("login-email")).sendKeys("sded@gmail.com");
			driver.findElement(By.id("login-password")).sendKeys("dddd");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
			String Expectedtext= driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
			String actualtext = "Incorrect email/password – please check and retry";
			
			if(Expectedtext.equals(actualtext)) {
				System.out.println("Test pass");
			}else
				System.out.println("test fail");
			
			
	}

}

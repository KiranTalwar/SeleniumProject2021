package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
            
			driver.findElement(By.id("identifierId")).sendKeys("ffffff");
			driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
			
			
	}

}

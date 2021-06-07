package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
	    driver.get("https://www.facebook.com/");
	    
	  
	    WebElement email= driver.findElement(By.id("email"));
	    email.sendKeys("dhhdh");
	  
	   WebElement password= driver.findElement(By.name("pass"));
	   password.sendKeys("sss");
	   
	   WebElement loginButton =driver.findElement(By.name("login"));
	   loginButton.click();
	    

	}

}

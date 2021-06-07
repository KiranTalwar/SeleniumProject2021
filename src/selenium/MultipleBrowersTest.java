package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowersTest {
	public static void main(String[] args) throws IOException {
		
       FileInputStream fi=new FileInputStream("C:\\testing\\prop2.properties");
		
        Properties prop=new Properties();
        prop.load(fi);
        String browser =prop.getProperty("browser");
        
		
		
		WebDriver driver;
		
		 
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
			
			  
			  driver=new FirefoxDriver();
			
		}else
		{

       System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		}
		
	    driver.get("https://www.facebook.com/");
	    
	  
	    WebElement email= driver.findElement(By.id("email"));
	    email.sendKeys("dhhdh");
	  
	   WebElement password= driver.findElement(By.name("pass"));
	   password.sendKeys("sss");
	   
	   WebElement loginButton =driver.findElement(By.name("login"));
	   loginButton.click();
	    

}}


	
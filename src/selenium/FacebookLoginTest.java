package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    //driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("dgdgdg"); //Not Working,because space in the values
	    //driver.findElement(By.id("email")).sendKeys("dhhdh");//working
	    driver.findElement(By.name("email")).sendKeys("hhhh");//working
	    //driver.findElement(By.tagName("input")).sendKeys("sshhs");//not working Not unique and not first 
	   
	    driver.findElement(By.name("pass")).sendKeys("sss");
	    driver.findElement(By.name("login")).click();
	    
	    
	    
  	    
	    

	}

}


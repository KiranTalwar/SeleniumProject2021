package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://login.yahoo.com/?.src=fpctx&.intl=ca&.lang=en-CA&.done=https://ca.yahoo.com&activity=uh-signin&pspid=2142623533");
		
		WebElement email= driver.findElement(By.name("username"));
		email.sendKeys("hghghg");
		
		WebElement button= driver.findElement(By.name("signin"));
		button.click();
		Thread.sleep(2000);
		
		String expectedErr="Sorry, we don't recognize this email.";
		String actualErr=driver.findElement(By.id("username-error")).getText();
		
		if(expectedErr.equals(actualErr)){
			System.out.println("Passed");
			
		}else
			System.out.println("failed");
		
				
	}

}

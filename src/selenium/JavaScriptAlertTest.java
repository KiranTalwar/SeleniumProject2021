package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver(); 
			driver.get("http://www.echoecho.com/javascript4.htm");
			driver.findElement(By.name("B2")).click();
			Thread.sleep(2000);
			Alert a1=driver.switchTo().alert();
			System.out.println(a1.getText());
			
			//a1.accept();
			a1.dismiss();
			
		
		
	}

}

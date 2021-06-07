package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver(); 
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//input[@type='text']")).click();//to click in suggestion box
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canada");
			Thread.sleep(2000);
			List <WebElement> allOptions=driver.findElements(By.xpath("//ul[@role='listbox']/li"));//we used role =listbox in xpath
			System.out.println(allOptions.size()); //we are printing size of element
		    
			  
			/*  for(int i=0;i<allOptions.size();i++)
				    	
				    	System.out.println(allOptions.get(i).getText());
			

	}*/
			
			for(WebElement s:allOptions) {
				System.out.println(s.getText());
			}
				
			}

}

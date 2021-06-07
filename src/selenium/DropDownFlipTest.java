package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownFlipTest {


	public static void main(String[] args) {
		
		 System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver(); 
			driver.get("https://www.flipkart.com/");
			
			List <WebElement> popup=driver.findElements(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
					System.out.println(popup.size());
			
			if(popup.size()>0)
			{
				popup.get(0).click();

	}
			driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
			
			
			List <WebElement> alllist=driver.findElements(By.xpath(" //ul[@id='ui-id-1']/li"));
	        
	        System.out.println(alllist.size());
	        
	        for(WebElement s:alllist) {
				System.out.println(s.getText());
			


}
	}
}

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.ebay.ca/");
		List<WebElement> allText =driver.findElements(By.xpath("//select[@id='gh-cat']//option"));
		Thread.sleep(2000);
		
		System.out.println(allText.size()); //we are printing size of element
		for(WebElement s:allText) {
			if(s.isSelected())
			System.out.println(s.getText()+"-------"+s.isSelected());
			
			
		
				
			
			
		}
		WebElement	box=driver.findElement(By.id("gh-cat"));
		Select s=new Select(box);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		s.selectByValue("2984");
		Thread.sleep(2000);
		s.selectByVisibleText("Books");
		
		for(WebElement s1:allText) {
			if(s1.isSelected())
			System.out.println(s1.getText()+"-------"+s1.isSelected());
		}
		
	}

}

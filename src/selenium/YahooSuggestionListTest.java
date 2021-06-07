package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://ca.yahoo.com/?p=us");
		driver.findElement(By.xpath("//input[@id='header-search-input']")).click();//to click in suggestion box
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("Canada");
		Thread.sleep(2000);
		List <WebElement> allText=driver.findElements(By.xpath("//ul[@role='listbox']/li"));//we used role =listbox in xpath
		System.out.println(allText.size()); //we are printing size of element
	    
		  
		/*  for(int i=0;i<allOptions.size();i++)
			    	
			    	System.out.println(allOptions.get(i).getText());
		

}*/
	for(WebElement s:allText) {
			System.out.println(s.getText());
		
	if(s.getText().contains("canada")) {
	}else
		System.out.println("fail");
	}
		
			

	}

}

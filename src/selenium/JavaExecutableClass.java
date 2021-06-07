package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaExecutableClass {

	public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.adidas.ca/en");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement aboutUs= driver.findElement(By.linkText("About Us"));
		
		System.out.println(aboutUs.getLocation());  //to find the location of an element 
		//option 1
		//jse.executeScript("window.scrollBy(0,4000)");
		
		//option 2
		//jse.executeScript("argument[0],scrollIntoView(true);",aboutUs);
		//aboutUs.click();
		//option 3
		
		jse.executeScript("arguments[0].click();", aboutUs);
			
		
		
	}

}

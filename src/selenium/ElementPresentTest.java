package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.google.com");
		/*if(driver.findElement(By.linkText("fgfgfgfgfg")).isDisplayed()) {
		System.out.println("elemnt present");
		}
		else {
			System.out.println("element not present");
		}*/ //we cant find element by webelement beacuase it should be present
	
		//we can find elememt by creating list
		List <WebElement> element =driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("elemnt  present");
		}else {
			System.out.println("element not present");
			
		}
		
		
	}
}



package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics=driver.findElement(By.linkText("Electronics"));
		Actions builder=new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> all=driver.findElements(By.xpath("(//div[@class='hl-cat-nav__sub-cat-col']/ul)[5]/li"));
		System.out.println(all.size());
		for(WebElement s:all) {
			System.out.println(s.getText());
	
		
		
		
		 
	}

}
}

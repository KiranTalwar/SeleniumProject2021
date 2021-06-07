package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySiggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.ebay.ca/");
        driver.findElement(By.id("gh-ac")).click();
        driver.findElement(By.id("gh-ac")).sendKeys("iphone");

        Thread.sleep(2000);
        List <WebElement> alllist=driver.findElements(By.xpath(" //ul[@id='ui-id-1']/li"));
        
        System.out.println(alllist.size());
        
        for(WebElement s:alllist) {
			System.out.println(s.getText());
		}
        
	}

}

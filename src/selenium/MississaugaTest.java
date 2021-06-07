package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://mississauga.ca/");
		driver.findElement(By.linkText("Our organization")).click();
		List<WebElement> List=driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']//li"));
		System.out.println(List.size());
		
		for(WebElement a1:List) {
			System.out.println(a1.getText());
		}
	}

}

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		List <WebElement> allgroup=driver.findElements(By.name("group1"));
		System.out.println(allgroup.size());
		
		for(WebElement a:allgroup)
			System.out.println(a.getAttribute("Value")+"------"+  a.isSelected());
		
		

}
}

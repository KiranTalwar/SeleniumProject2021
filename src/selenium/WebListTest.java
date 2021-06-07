package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.google.com/");
	    //WebElement right=driver.findElement(By.id("fsl"));//here we are printing only right hand side element.we are creating webelement right
	    
	    //List <WebElement> allLinks=right.findElements(By.tagName("a"));//making a list in allLinks all element will go with tag a
	    List <WebElement> allLinks=driver.findElements(By.xpath("//span[@id='fsl']/a"));//here we are using xpath to find right hand side element
	    
	    System.out.println(allLinks.size()); //we are printing size of element
	    
	    for(int i=0;i<allLinks.size();i++)
	    	
	    	System.out.println(allLinks.get(i).getText());
	}

}

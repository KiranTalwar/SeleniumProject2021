package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver(); 
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(0);
		WebElement drag=	driver.findElement(By.id("draggable"));
			WebElement drop =driver.findElement(By.id("droppable"));
			
			Actions builder=new Actions(driver);
			builder.dragAndDrop(drag, drop).build().perform();
			
			
			if(drop.getText().equals ("Dropped!")){
				System.out.println("test passed");
			}
			else
			{
				System.out.println("test failed");
				
				
			}
			
				
			
			
	}

}

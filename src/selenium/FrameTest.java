package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {

		 System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver(); 
			driver.get("https://jqueryui.com/droppable/");
			List <WebElement> alllist1=driver.findElements(By.linkText("Sortable"));
			System.out.println(alllist1.size());
			
			if(alllist1.size() > 0) {
				System.out.println("sortable present");
			}
			else {
				System.out.println("not present");
			}
			
			List <WebElement> alllist2=driver.findElements(By.id("draggable"));
			System.out.println(alllist2.size());
			
			if(alllist2.size() > 0) {
				System.out.println("sortable present");
			}
			else {
				System.out.println("not present");
			}
			
			
			driver.switchTo().frame(0);
			
			 alllist1=driver.findElements(By.linkText("Sortable"));
			System.out.println(alllist1.size());
			
			if(alllist1.size() > 0) {
				System.out.println("sortable present");
			}
			else {
				System.out.println("not present");
	}
			
			 alllist2=driver.findElements(By.id("draggable"));
			System.out.println(alllist2.size());
			
			if(alllist2.size() > 0) {
				System.out.println("draggable present");
			}
			else {
				System.out.println("not present");
			}
			
		System.out.println("--------------switch to main");
		driver.switchTo().defaultContent();
		 alllist1=driver.findElements(By.linkText("Sortable"));
		System.out.println(alllist1.size());
		
		if(alllist1.size() > 0) {
			System.out.println("sortable present");
		}
		else {
			System.out.println("not present");
		}
		
		 alllist2=driver.findElements(By.id("draggable"));
		System.out.println(alllist2.size());
		
		if(alllist2.size() > 0) {
			System.out.println("graggable present");
		}
		else {
			System.out.println("not present");
		}
		
			}
	}



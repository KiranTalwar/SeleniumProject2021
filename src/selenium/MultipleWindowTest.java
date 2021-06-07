package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

         public class MultipleWindowTest {
	     public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
	
	    driver.get("https://moodle.cestarcollege.com/moodle/");
	    driver.findElement(By.linkText("Faq")).click();
	    
	    Set<String> allWindows=driver.getWindowHandles();
	    System.out.println(allWindows.size());
	    
	    Iterator<String> iter=allWindows.iterator();
	    String mainWindow=iter.next();
	    String childWindow=iter.next();
	    System.out.println(mainWindow);
	    System.out.println(childWindow);
	    
	    driver.switchTo().window(childWindow);
	    System.out.println(driver.getTitle());
	    driver.close();
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(mainWindow);
	    System.out.println(driver.getTitle());
	    driver.quit();	    
	    
	    
	    

		

	}

}

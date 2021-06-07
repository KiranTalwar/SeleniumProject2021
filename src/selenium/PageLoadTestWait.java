package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PageLoadTestWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//impicit wait for web element where we are finding the element
	    
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//This wait for page load 
	    
	    driver.findElement(By.linkText("Create New Account")).click();
	   // Thread.sleep(2000);
	    driver.findElement(By.name("lastname")).sendKeys("hhhh");
	    driver.findElement(By.name("reg_email__")).sendKeys("6666666667");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("yyyyy");
	    
	    WebElement box1 =driver.findElement(By.id("day"));
	    Select s=new Select(box1);
	    s.selectByVisibleText("21");
	    
	    WebElement box2 =driver.findElement(By.id("month"));
	    Select s1=new Select(box2);
	    s1.selectByVisibleText("April");
	    
	    WebElement box3 =driver.findElement(By.id("year"));
	    Select s2=new Select(box3);
	    s2.selectByVisibleText("2000");
	    

	}

	}


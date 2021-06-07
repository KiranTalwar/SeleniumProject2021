package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.scotiabank.com/ca/en/personal.html");
			driver.findElement(By.linkText("Sign In")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//input[@name='usernameInput']")).sendKeys("hhhhhhh");//this is with chro path
			driver.findElement(By.id("usernameInput-input")).sendKeys("hdhdhd");  //this is with the id we can use this one this better than chro ptath
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jjjh");
			driver.findElement(By.xpath("//span[@class='ButtonCore__block']")).click();
			Thread.sleep(2000);
			
			String expectedErr="Please check your card number / username or password and try again.";
			String actualErr=driver.findElement(By.id("globalError")).getText();
			
			if(expectedErr.equals(actualErr)){
				System.out.println("Passed");
				
			}else
				System.out.println("failed");
			
			
	}
}

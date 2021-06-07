
package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.scotiabank.com/ca/en/personal.html");
			driver.manage().window().maximize();

	}

}

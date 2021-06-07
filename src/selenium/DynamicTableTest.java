package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver(); 
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			List <WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
	        System.out.println(rows.size());
			
	        List <WebElement> columns =driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
	        System.out.println(columns.size());
			
			for(int i=2;i<=rows.size();i++)
				
				for(int j=1;j<=columns.size();j++) {
		System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
		System.out.print("    |    ");
					
		
				}
			System.out.println();
		
	}


}

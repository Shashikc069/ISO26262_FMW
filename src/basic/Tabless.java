package basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabless {
	static {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.drive", "./Drivers/IEDriverServer.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//List<WebElement> alltb = driver.findElements(By.xpath("//table[@border='1']/tbody/tr/thead"));
		List<WebElement> alltb = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		
		System.out.println(alltb.size());
		
		for(WebElement tb:alltb)
		{
			System.out.println(tb.getText());
		}
         driver.close();  
	}

}

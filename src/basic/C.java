package basic;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	static {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.drive", "./Drivers/IEDriverServer.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		/*
		 * driver.get("http://demo.guru99.com/popup.php");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click(); //
		 * driver.findElement(.xpath("//*[contains(@href,'popup.php')]")).click();
		 */
        Set<String> all = driver.getWindowHandles();
        ArrayList<String> list = new ArrayList<String>(all);
        driver.switchTo().window(list.get(2));
        
        driver.manage().window().maximize();
        System.out.println(all);
        System.out.println("---------------------");
        System.out.println(list);
        driver.quit();
        
		/*
		 * driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
		 * driver.findElement(By.name("btnLogin")).click();
		 */

	}

}

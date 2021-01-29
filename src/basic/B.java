package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	static {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.drive", "./Drivers/IEDriverServer.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement img = driver.findElement(By.tagName("img"));
		boolean DI = img.isDisplayed();
		if(DI)
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("Not-Displayed");
		}
		Thread.sleep(2000);
		driver.close();

	}

}

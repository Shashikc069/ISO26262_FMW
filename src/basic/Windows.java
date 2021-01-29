package basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windows
     {
	static {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.drive", "./Drivers/IEDriverServer.exe");
	}
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwin = driver.getWindowHandles();
		for(String win:allwin)
		{
			System.out.println(win);
		}
		driver.quit();
	}
}

package section1;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		String expectedData = "demoapps";
		String expectedTitle = "DemoApps";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/");
		
		String actualData = driver.getCurrentUrl();
		
		String actualTitle = driver.getTitle();
		
		System.out.println(actualData);
		System.out.println(actualTitle);
		
		if(actualData.contains(expectedData) && actualTitle.contains(expectedTitle))
		{
			System.out.println("accessed Demo Apps successfully!!");
		}
		else
		{
			System.out.println("not accessed :(");
		}
		 Thread.sleep(4000);
		 driver.close();
	}

}

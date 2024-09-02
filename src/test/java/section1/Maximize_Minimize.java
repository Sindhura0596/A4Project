package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Minimize {

	public static void main(String[] args) throws Exception {
		
		String expectedUrl = "orangehrmlive";
		String expectedTitle = "Orange";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		Thread.sleep(3000);
		
		if(actualUrl.contains(expectedUrl) && actualTitle.contains(expectedTitle))
		{
			System.out.println("Orange HRM home page displayed successfully!!!");
		}
		else
		{
			System.out.println("not displayed!!!!");
		}
		driver.close();
	}

}

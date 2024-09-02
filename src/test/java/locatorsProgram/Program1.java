package locatorsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws Exception {

		String expectedUrl = "orangehrmlive";
		String expectedTitle = "Orange";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.name("password"));
		element.sendKeys("admin123");
		Thread.sleep(3000);
		element.submit();
		
		String expectedUrl1 = "dashboard";

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		driver.close();
		String actualUrl1 = driver.getCurrentUrl();
		Thread.sleep(3000);
		if(actualUrl1.contains(expectedUrl1))
		{
			System.out.println("home page displayed");
		}
		else
		{
			System.out.println("not displayed!!!!");
		}
	}

	

}

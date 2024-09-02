package locatorsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("tripod");
		
		Thread.sleep(3000);
		element.submit();
		Thread.sleep(3000);


		
		String expectedUrl1 = "tripod&otracker=search&otracker1";
		String actualUrl1 = driver.getCurrentUrl();
		if(actualUrl1.contains(expectedUrl1))
		{
			System.out.println("search page displayed");
		}
		else
		{
			System.out.println("not displayed!!!!");
		}
	}

}

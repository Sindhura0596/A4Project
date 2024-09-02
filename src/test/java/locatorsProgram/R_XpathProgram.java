package locatorsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R_XpathProgram {

	public static void main(String[] args) throws Exception {

WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		WebElement element = driver.findElement(By.xpath("//input[contains(@title , 'Search for Products')]"));
		element.sendKeys("iphone 11");
		element.submit();
	//	driver.findElement(By.xpath("//button[@type=\'submit\']")).click();

		driver.findElement(By.xpath("//div[text()='Apple iPhone 11 (White, 64 GB) (Includes EarPods, Power Adapter)']")).click();
		Thread.sleep(3000);

		driver.quit();

	
	}

}

package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPrg {

public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("name"));
		element.sendKeys("Sindhura");
		Thread.sleep(3000);

		WebElement element1 = driver.findElement(By.name("email"));
		element1.sendKeys("Sindhura@gamail.com");
		Thread.sleep(3000);


		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("******");

		Thread.sleep(3000);
		
		element2.submit();


		
}
}

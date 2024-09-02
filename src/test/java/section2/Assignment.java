package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		WebElement element1 = driver.findElement(By.xpath("//div[@class='bpjkJb']/span[text()='Men']"));
		act.moveToElement(element1).perform();
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='wZsanD']"));
		for(WebElement element2 : element)
		{
			String value = element2.getText();
			System.out.println(value);
		}
		
	}
}

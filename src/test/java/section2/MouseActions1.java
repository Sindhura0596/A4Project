package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1 {

	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Electronics']"));
		//act.click(element).perform();
		act.moveToElement(element).click().perform();
		WebElement element1 = driver.findElement(By.xpath("//div[@class='bpjkJb']/span[text()='Men']"));
		act.moveToElement(element1).perform();
		driver.navigate().back();


			driver.close();
		
	}

}

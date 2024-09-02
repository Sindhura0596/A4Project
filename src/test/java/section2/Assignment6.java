package section2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment6 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//span[text()='Login']"));
		act.contextClick(element).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);

		act.click(element).perform();
		driver.navigate().back();

		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element1.sendKeys("i phone 14");
		element1.submit();
		Thread.sleep(2000);

		List<WebElement> all = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));

//		for(int i=0;i<=all.size()-1;i++)
//		{
//			if(i==23)
//			{
//			act.scrollToElement(all.get(i)).perform();
//			Thread.sleep(2000);
//
//		}

	}
	}

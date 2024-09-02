package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		act.moveToElement(element).click().perform();

		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		//act.moveToElement(element1).click().perform();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//div[@id='circle']"));
		act.moveToElement(element2).clickAndHold().perform();
		act.release(element2).perform();
		
}
}
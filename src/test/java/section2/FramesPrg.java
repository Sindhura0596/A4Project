package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPrg {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		Thread.sleep(3000);
	driver.switchTo().frame(0);
		
		String username = "Admin@gmail.com";
		String password = "Admin@1234";
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(password);
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		element.sendKeys(password);
		Thread.sleep(3000);

		element.submit();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		Thread.sleep(3000);

		WebElement element1 = driver.findElement(By.xpath("(//input[@name='password'])"));

		element1.sendKeys(password);
		Thread.sleep(3000);

		element1.submit();	
	}

}

package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment5 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin", Keys.TAB, "admin123", Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		//act.moveToElement(element).click().perform();
	}

}

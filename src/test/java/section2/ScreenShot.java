package section2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\"+"ss1"+".png");
		Files.copy(src, dest);
		driver.findElement(By.name("q")).sendKeys("i phone 14");//wrong path
	}

}

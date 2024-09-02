package locatorsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("li[class='w-[100%] flex justify-between items-center py-1  cursor-pointer  px-2 relative ps-1 text-[14px] text-black']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Sindhura");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Sindhura@gamil.com");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sindhura@gamil.com");
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.cssSelector("input[type='password']"));
		element.sendKeys("sidvath");
		Thread.sleep(2000);

		element.submit();

	}
}
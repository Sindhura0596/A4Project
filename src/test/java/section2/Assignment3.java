package section2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text() = 'Button']")).click();
		
		List<WebElement> all = driver.findElements(By.xpath("//button[contains(@class,'active:bg-green-400')]"));
		
		for(int i=0;i<=all.size()-1;i++)
		{
			if(i==0||i==3||i==7)
			{
			all.get(i).click();
			Thread.sleep(2000);

		}
		
		
		}
	}

}

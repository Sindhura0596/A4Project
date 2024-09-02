package locatorsProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("iphone 14");
		element.submit();
		
		List<WebElement> element1 = driver.findElements(By.xpath("//span[text() = 'Add to Compare']"));
		
		for(int i=0;i<= element1.size()-1; i++)
		{
			if(i==0 || i==1 || i==22 || i==23)
			{
				element1.get(i).click();
				Thread.sleep(2000);
				
			}
		}
	}

}

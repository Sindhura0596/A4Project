package locatorsProgram;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationProgram {

	public static void main(String[] args) throws Exception {
		
		String fname = "sindhura";
		String lname = "Vidwath";
		for(int i=1;i<=2;i++)
		{
			Random r = new Random();
			int num = r.nextInt(1000);
		String expectedemail = "sindhura"+num+"@gmail.com";
		String expectedpass = "sindhura"+num;

		WebDriver driver = new ChromeDriver();

		
		driver.get("https://demowebshop.tricentis.com/fiction");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(fname+num);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lname+num);
		driver.findElement(By.xpath("//input[contains(@data-val-email, 'Wrong email')]")).sendKeys(expectedemail);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(expectedpass);

		WebElement element = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		element.sendKeys(expectedpass);
		Thread.sleep(2000);
		element.submit();
		driver.findElement(By.xpath("//input[contains(@class,'button-1 register')]")).click();
		
		
		String actualText = driver.findElement(By.xpath("//a[contains(text(),'@gmail.com')]")).getText();
		if(actualText.equals(expectedemail))
		{
			System.out.println("Registered successfully"+ num);
		}
		else
		{
			System.out.println("Oooppsss!!!! " + num);
		}
		
		driver.findElement(By.xpath("//a[text() = 'Log out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() = 'Log in']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(expectedemail);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(expectedpass);
		Thread.sleep(2000);


		driver.quit();

		}






		
		

	}

}

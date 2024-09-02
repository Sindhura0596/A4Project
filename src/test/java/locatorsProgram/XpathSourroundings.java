package locatorsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSourroundings {

	public static void main(String[] args) throws Exception {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip%5C&ef_id=:G:s");
		Thread.sleep(3000);
		
		//driver.manage().window().maximize();
		
 driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();
	Thread.sleep(3000);
	String text = driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[@class='DayPicker-Month']/div[@class='DayPicker-Body']/div/div[@aria-disabled=\"false\" and @aria-selected=\"true\"]/div/p[@class=' todayPrice']")).getText();
	System.out.println(text);	
		

		

	}

}

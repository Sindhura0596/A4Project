package section1;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationOperation {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	
		driver.manage().window().maximize();
		
		Navigation nav = driver.navigate();
		Thread.sleep(3000);
		 
		nav.back();
		Thread.sleep(3000);

		nav.forward();
		Thread.sleep(3000);

		nav.refresh();
		

	}

}

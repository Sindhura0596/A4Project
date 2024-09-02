package section1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize_Relocate {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// resize
		
		Dimension d = new Dimension(300,400);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);

		//relocate
		
		Point p = new Point(100,200);
		driver.manage().window().setPosition(p);
		
		
		

	}

}

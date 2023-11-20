import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2_rahulshetty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Static dropdown with navigation function
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
			
			
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		

		
		
		

	}

}

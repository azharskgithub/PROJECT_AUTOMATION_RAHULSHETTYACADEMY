import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS_02_Formy {
    public static void main(String[] args) {
        // TC_01: To verify that the Formy handles invalid URL

        // Setting up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // Creating WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Navigate to the OrangeHRM web URL
        driver.get("https://formy-project.herokuapp.com/88");


    }
}

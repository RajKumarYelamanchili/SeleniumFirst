import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserUsingNavigateMethod {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver1\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.navigate().to("http://www.facebook.com");
			driver.manage().window().maximize();
			//driver.close();
		}
	}


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleWebSite {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver1\\Chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.rediffmail.com");
		}
}

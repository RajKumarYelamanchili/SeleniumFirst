import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleOpenClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

	}

}

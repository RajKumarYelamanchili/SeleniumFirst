import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkedIn {
public static void main(String[] args) {
	
	
     System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver1\\ChromeDriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.srichaitanyaschool.net");
		driver.manage().window().maximize();
		//driver.close(); 
			}
}


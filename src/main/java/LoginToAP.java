
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author User
 *
 */
public class LoginToAP {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("santosh2@test.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
	}
}

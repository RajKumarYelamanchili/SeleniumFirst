import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class GetTextFromTextFields {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.id("search_query_top")).sendKeys("DRESSES");
						
			String valueOfSearch = driver.findElement(By.id("search_query_top")).getAttribute("value");
			System.out.println("Search val is => " + valueOfSearch);
					
			System.out.println(driver.findElement(By.id("search_query_top")).getAttribute("class"));
			
		}
	}


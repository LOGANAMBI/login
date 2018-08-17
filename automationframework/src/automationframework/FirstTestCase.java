package automationframework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
	        public static String Browser;
	        static WebDriver driver;
			public static void main(String[] args) throws InterruptedException
			{
	       //SetBrowser();
	       SetBrowserConfig();
	       RunBrowser();
	    }

public static void SetBrowser()
{
	Browser = "Chrome";
	}
public static void SetBrowserConfig() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\chromedriver_win32\\chromedriver.exe"); 
     driver = new ChromeDriver();
	
}
public static void RunBrowser()
{
	driver.get("https://commbank.com.au//personal-loans.html");
    driver.quit();
	}
}
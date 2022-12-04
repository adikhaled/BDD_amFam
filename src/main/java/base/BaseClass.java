package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GetAQuotePage;
import pages.HomePage;
import pages.LetsGoStarted;
import utils.Configuration;
import static utils.IConstant.*;
import java.util.concurrent.TimeUnit;

public class BaseClass {

	public Configuration config = new Configuration();
	public static HomePage homePage;
	public static LetsGoStarted letsGoStarted;
	public static GetAQuotePage getAQuotePage;
	public static WebDriver driver;

	public void setUpDriver() {
			initDriver(config.getProperty(BROWSER));
			driver.manage().window().maximize();
			driver.get(config.getProperty((URL))); 
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			initObjectClasess();
		}

		private void initDriver(String browser) {
			switch (browser) {
			case CHROME:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case FIREFOX:
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case EDGE:
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			}
		}

    public static void initObjectClasess() {
    	homePage=new HomePage(driver);
    	letsGoStarted=new LetsGoStarted(driver);
    	getAQuotePage=new GetAQuotePage(driver);
    	//enterYourAddress = new EnterYourAddress(driver);
    }
    
	public WebDriver getDriver() {
		return driver;
	}
	
	
	public void closingTheDriverSession() {
		getDriver().quit();
	}

}

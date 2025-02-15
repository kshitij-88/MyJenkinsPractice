package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	protected static ThreadLocal<WebDriver> td=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return td.get();
	}
	
	public static void initlialization(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriver driver=new ChromeDriver();
			td.set(driver);
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriver driver=new EdgeDriver();
			td.set(driver);
		}
		else if(browserName.equalsIgnoreCase("incognito")) {
		
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().get("https://demo.guru99.com/test/newtours/register.php");
		
	}

}

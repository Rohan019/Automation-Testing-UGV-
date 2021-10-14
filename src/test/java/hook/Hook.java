package hook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
public static WebDriver driver;
	
	@Before
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSHERBAH\\eclipse-workspace\\EvaluationCucumber\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://uniformm1.upskills.in/admin");
	}

	@After
	public void closedriver()
	{
		System.out.println("The browseris closing now");
		driver.quit();
	}
	
	}


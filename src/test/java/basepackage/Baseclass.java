package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepackage.Loginpage;
import pagepackage.homepage;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static Loginpage loginobj;
	public homepage homepageobj;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objectmthd()
	{
		loginobj=new Loginpage(driver);
		homepageobj=new homepage(driver);
	}

}

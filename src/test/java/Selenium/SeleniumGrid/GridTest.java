package Selenium.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		//Define Desired Capabilities

		DesiredCapabilities Desired = new DesiredCapabilities();
		Desired.setBrowserName("chrome");
		Desired.setPlatform(Platform.WIN10);
		
		// Define ChromeOptions
		
		ChromeOptions Options = new ChromeOptions();
		
	Options.merge(Desired); // to merge both desired capabilities and chrome options
	
	String huburl = "http://192.168.2.100.4444/wd/hub";
	WebDriver driver = new RemoteWebDriver(new URL(huburl),Options);
	
	driver.get("http://freecrm.com");
	System.out.println(driver.getTitle());
			
	}

}

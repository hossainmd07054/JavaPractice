package javaPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DemoClass3 {
	public static Properties prop;
	public static WebDriver driver;
	public DemoClass3() {
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
			prop = new Properties();
			prop.load(fls);
			System.out.println(prop);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void openBrowser() {
		String browserName = prop.getProperty("ahmed");
		System.out.println(browserName);
		if(browserName.equals("Chrome")) {
			//			System.setProperty("WebDriverManager.chromedriver().setup()", browserName);
			//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		}		
	}
	@Test
	public void openURL() {
		driver.get(prop.getProperty("masum"));
//		driver.manage().window().maximize();
		driver.quit();
	}
//	@Test
//	public void closeBrowser() throws Throwable {
//		Thread.sleep(2000);
		
//	}

}

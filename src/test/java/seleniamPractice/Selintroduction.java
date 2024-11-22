package seleniamPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selintroduction {

	public static void main(String[] args) throws Exception {
		String userName = "Mohammad";
		String passwordText = null;
//		System.setProperty("webdriver.chrome.driver", "C:/Users/hossa/Drivers/chromedriver.exe");
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\hossa\\Drivers\\MicrosoftWebDriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\Users\hossa\Drivers\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("hossain000");
		driver.findElement(By.name("inputPassword")).sendKeys("asd");
		driver.findElement(By.className("signInBtn")).click();
		String text =driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hossains0786@yahoo.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9738583012");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String fullText= driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println(fullText);
		String [] actualText = fullText.split("'");
		System.out.println(actualText[0]);
		System.out.println(actualText[1]);
		passwordText = actualText[1];
		Assert.assertEquals(passwordText, "rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys(passwordText);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		String text3= driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
		Assert.assertEquals(text3, "Hello "+userName+",");
		if(text3.equals("Hello "+userName+",")) {
			System.out.println(text3);
		}		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
		
	}
}

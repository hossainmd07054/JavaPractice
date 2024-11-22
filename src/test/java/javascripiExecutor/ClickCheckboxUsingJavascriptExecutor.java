package javascripiExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickCheckboxUsingJavascriptExecutor {

	public static void main(String[] args) throws Throwable {
		//https://www.youtube.com/watch?v=sXCTNmOmB_s&t=43s
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//FindElement(Javascript) + click (Javascript)
		js.executeScript("document.getElementById('femalerb').click()");
		List<?> checkbox = (List<?>) js.executeScript("return document.getElementsByName('language')");
//		List checkbxes = (List)js.executeScript("return document.getElementsByName('language')");
		for (Object object : checkbox) {
			js.executeScript("arguments[0].click()", object);
		}
//		js.executeScript("document.getElementById('registerbtn').click()");
//		Thread.sleep(2000);
		
		//FindElement(WebDriver) + click (Javascript)
		WebElement button = driver.findElement(By.xpath("//*[@id='registerbtn']"));
		js.executeScript("arguments[0].click()",button);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Click here to navigate to the home page']"));
		js.executeScript("arguments[0].click()", link);
		Thread.sleep(2000);
		driver.quit();
	}

}

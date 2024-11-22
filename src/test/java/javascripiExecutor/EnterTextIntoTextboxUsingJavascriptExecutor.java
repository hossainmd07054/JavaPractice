package javascripiExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterTextIntoTextboxUsingJavascriptExecutor {
	

	public static void main(String[] args) throws Exception {
		//https://www.youtube.com/watch?v=AHUhFgWYtAA&t=17s
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//FindElement(Javascript) + Text (Javascript)
//		js.executeScript("document.evaluate('//input[@id='email',document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue'.value='abcd@gmail.com'");
		js.executeScript("document.getElementById('email').value ='abcd@gmail.com'");
		Thread.sleep(2000);
		
		//FindElement(WebDriver) + Text (Javascript)
		WebElement element = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value ='abcd@gmail.com'", element);
		Thread.sleep(2000);
		
		//Get text using Javascript
		String text1 = (String) js.executeScript("return document.getElementById('email').value");
		System.out.println(text1);
		driver.quit();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

	}

}

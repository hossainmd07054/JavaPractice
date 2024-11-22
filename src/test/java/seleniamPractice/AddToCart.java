package seleniamPractice;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");		
//		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.quit();
	}
	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException{
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.product-name")));
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));		
		for (int i = 0; i < products.size(); i++){
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
//			JavascriptExecutor js =(JavascriptExecutor)driver;
//			js.executeScript("window.scrollTo(0,5000)");
			
			if (itemsNeededList.contains(formattedName)){
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length){
					Thread.sleep(3000);
					break;
				}
			}
		}
	}
}

package seleniamPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniamPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		 WebElement selement = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select objSelect = new Select(selement);
		objSelect.selectByIndex(3);
		objSelect.selectByValue("");
		objSelect.selectByVisibleText("");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		//JavascriptExecutor in Selenium to click a button
//		js.executeScript("document.getElementByID('element id ').click();");
//		
//		//JavascriptExecutor in Selenium to send text
//		js.executeScript("document.getElementByID('element id ').value = 'xyz';");
//
//		//JavascriptExecutor in Selenium to interact with checkbox
//		js.executeScript("document.getElementByID('element id ').checked=false;");
//
//		//JavascriptExecutor in Selenium to refresh the browser window
//		js.executeScript("location.reload()");
//		
//		js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
		
		

	}

}

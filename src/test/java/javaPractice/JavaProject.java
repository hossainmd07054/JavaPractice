package javaPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaProject {

	public static void main(String[] args) throws Exception {
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate yesterDate = LocalDate.now().minusDays(1);
		System.out.println(dtf2.format(yesterDate));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate todaysDate = LocalDate.now();
		System.out.println(dtf.format(todaysDate));
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate nextDate = LocalDate.now().plusDays(1);
		System.out.println(dtf1.format(nextDate));		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
//		Assert.assertTrue(true);
//		driver.findElement(By.xpath("//*[@class='ngp-button-group']/button[2]")).click();
//		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

		int number = 10;
		String name = "Hossain";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		float fl = 5.20f;


		System.out.println(number);
		System.out.println(name);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(myCard);
		System.out.println(fl);

		int []myNumber = {5,10,20,100,50};
		System.out.println(myNumber[3]);

		for (int i=0; i<myNumber.length; i++) {
			System.out.println(myNumber[i]);
		}
		for( int nu :myNumber) {//Enhance for loop
			System.out.println(nu);
		}
		int [] numbers = new int [5];
		numbers [0] =5;
		numbers [1] =10;
		numbers [2] =15;
		numbers [3] =20;
		numbers [4] =25;
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
		for(int i =0; i<numbers.length;i++)
			System.out.println(numbers[i]);

		String name1 = "Hossain";
		System.out.println(name1);

		for(int i =name1.length(); i<name1.length();i++) {
			System.out.println(name1.charAt(i));
		}
		for(int i =name1.length()-1; i>=0;i--) {
			System.out.println(name1.charAt(i));

		}
	}
}

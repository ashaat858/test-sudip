package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;

	@Before
	public void init() {

		// all these commented work ...
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\User\\Sep22QA_Selenium\\Session2\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void testLocators() {

		// sendkey will work as long as there is an input tag
		// Robot class if other then input tag
		driver.findElement(By.name("firstname")).sendKeys("Selenium");

		// click female
		driver.findElement(By.id("sex-1")).click();

		// upload file

		driver.findElement(By.id("photo"))
				.sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\Abdalrahman_Shaat_Resume (2).docx");

		// linked text
		// driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//
		// //navigate back to previous page
		// driver.navigate().back();

		// partial linked text
		// driver.findElement(By.partialLinkText("TF-API")).click();
		//
		// driver.navigate().back();

		// CSS selector
		driver.findElement(By.cssSelector("input#exp-4")).click();

		driver.findElement(By.cssSelector("input[value='Selenium Webdriver']")).click();

		// driver.findElement(By.cssSelector("a[href$='http://www.objectspy.space']")).click();

		// absalote attribute in finding xpath
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("selenium is fun!!");

		// relative attribute
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium is fun");

		// xpath syntax
		driver.findElement(By.xpath("//input[@id='profession-1' and @value='Automation Tester']")).click();
		 
		 // xpath for links
		
		//#1 text (this uses the exact text and this is why we use the = sign)
		//		 driver.findElement(By.xpath("//a[text()='API Documentations']")).click();
		
		//#2 contains text (text can be taken out or not complete but contains the main text needed)
		 driver.findElement(By.xpath("//a[contains(text(),'API Documentat')]")).click();

	
	}
}

package variousConcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeWork {

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
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
		@Test
		public void stepbystepHomework()  {
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.name("login")).click();
			driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).click();
			//a[ text()='New Account']
			driver.findElement(By.xpath("/html/body/section/div/nav/div/ul/li[10]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/div[1]/input")).sendKeys("Abdal");
			driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/div[2]/input")).sendKeys("BankAccount");
			driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/div[3]/input")).sendKeys("200.00");
			driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/div[4]/input")).sendKeys("1234567");
			driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/div[5]/input")).sendKeys("Abdal");
			driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/div[6]/input")).sendKeys("9876782345");
			driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/button")).click();
		}
			@After
		public void close() throws Exception {
		
				driver.manage().wait(200);
			driver.close();
		}
}

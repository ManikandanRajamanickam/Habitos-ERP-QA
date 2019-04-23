package Idlidabba.ERP;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Depriceation {

	  WebDriver d;

	static org.apache.log4j.Logger logger;

	@Test(priority = 1)

	public void Valid_Login() {

		d.manage().window().maximize();

		String un = "vivek";
		String pw = "vivek";

		WebElement uname = d.findElement(By.xpath("//input[@id='kitchen_user_user_name']"));

		WebElement pwd = d.findElement(By.xpath("//input[@id='kitchen_user_password_digest']"));

		WebElement submit = d.findElement(By.name("commit"));

		if (uname.equals(d.switchTo().activeElement())) {

			uname.sendKeys(un);

			uname.sendKeys(Keys.TAB);

		} else {

			logger.error("Verify that if the user can enter the user name");

		}

		if (pwd.equals(d.switchTo().activeElement())) {

			pwd.sendKeys(pw);

		} else {

		}

		if (submit.isEnabled()) {

			submit.click();

		} else {

			// logger.error("Verify that user can login with valid credentials");

		}
	}

	// DEPRICEATION CATEGORY

	@Test(priority = 2)

	public void depriceation() throws InterruptedException {

		try {

			logger = logger.getLogger(" Habitos - DEPRICEATION - ADD");

			Thread.sleep(200);

			WebElement sidebar = d.findElement(By.id("sidebarCollapse"));

			sidebar.click();

			logger.info("Verify  that if click master menu it getting to collapse");

			WebElement masters = d.findElement(By.xpath("//span[contains(text(),'Masters')]"));

			masters.click();

			Thread.sleep(2000);

			WebElement depart = d.findElement(By.xpath("//a[contains(text(),'Depreciation Category')]"));

			depart.isDisplayed();

			depart.click();

			Thread.sleep(2000);

			String url = "http://192.168.1.230:4000/depriciation_categories";

			if (d.getCurrentUrl().equals(url)) {

				logger.info("if click depriceation category  menu it should redirect the related screen");

			}

		}

		catch (Exception e) {

			logger.error("if click depriceation category  menu it should redirect the related screen");

		}

	}

	@Test(priority = 3)

	public void add_depriceation() {

		try {

			WebElement add = d.findElement(By.xpath("//a[@class='btn']"));

			add.click();

			logger.info("If click add button it should redirect to add screen");

			Thread.sleep(2000);

			WebElement depet = d.findElement(By.xpath("//input[@id='depriciation_category_name']"));

			if (depet.equals(d.switchTo().activeElement())) {

				depet.sendKeys("Damaging");

				Thread.sleep(2000);

				WebElement dpercent = d
						.findElement(By.xpath("//input[@name='depriciation_category[depreciation_percentage]']"));

				dpercent.click();

				dpercent.sendKeys("25");

				Thread.sleep(2000);

				WebElement submit = d.findElement(By.xpath("//input[@value='submit']"));

				submit.isDisplayed();

				Thread.sleep(100);

				submit.click();

				logger.info("If click submit button it should redirect to index screen");

			}

		} catch (Exception e) {

			logger.error("If click submit button it should redirect to index screen");

		}
	}

	@Test(priority = 4)

	public void add_depriceation_values() throws InterruptedException {

		try {

			WebElement srch = d.findElement(By.xpath("//input[@type='search']"));

			srch.isDisplayed();

			srch.sendKeys("Damaging");

			Thread.sleep(200);

			WebElement filter = d.findElement(By.xpath("//td[@class='sorting_1']"));

			filter.isDisplayed();

			logger.info("Depriceation category  is successfully added");

		} catch (Exception e) {

			logger.error("Depriceation category  is successfully added");

		}

	}

	@BeforeTest
	public void beforeTest() {
		
		try {

			logger = logger.getLogger(" Habitos - Depreciation");

			PropertyConfigurator.configure("log4jproperties.txt");

			Thread.sleep(100);

			System.setProperty("webdriver.chrome.driver", "../ERP/resources/chromedriver.exe");

			d = new ChromeDriver();

			logger.info("browser gets open");

			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(500);

			d.get("http://192.168.1.230:4000/");

		} catch (Exception e) {

			logger.error("browser gets valid ip address");

		}
		
	}

	@AfterTest
	public void afterTest() {
	
	d.close();
	}
     
}

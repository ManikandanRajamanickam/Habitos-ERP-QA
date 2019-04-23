package Idlidabba.ERP;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
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
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Utensils {
	
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
	
			//	logger.info("Verify that if the username fields get autofocus");

			uname.sendKeys(un);

			//	logger.info("Verify that if the user can enter the user name");

			uname.sendKeys(Keys.TAB);

			} else {

			//	logger.error("Verify that if the user can enter the user name");

		}

		if (pwd.equals(d.switchTo().activeElement())) {

		//	logger.info("Verify that if the password fields get focused");

			pwd.sendKeys(pw);

		} else {

		//	logger.error("Verify that if the password fields get focused");
	
		}

		if (submit.isEnabled()) {

		//	logger.info("Verify that user can login with valid credentials");

			submit.click();

		} else {

		//	logger.error("Verify that user can login with valid credentials");

		}
	}
			
  @Test (priority = 2)
  
  public void Utensils_name() {
	  
	  try {
		  
		  Thread.sleep(200);

			WebElement sidebar = d.findElement(By.id("sidebarCollapse"));

			sidebar.click();

			logger.info("Verify  that if click master menu it getting to collapse");

			WebElement masters = d.findElement(By.xpath("//span[contains(text(),'Masters')]"));

			if (masters.isDisplayed()) {

				masters.click();
	
			}
			
			Thread.sleep(2000);
						
			WebElement utensils = d.findElement(By.xpath("//a[contains(text(),'Utensil Name')]"));
			
			if (utensils.isDisplayed()) {

				utensils.click();		
				
			}
						
			Thread.sleep(2000);
						
			String url = "http://192.168.1.230:4000/utensilnames";
						
			if (d.getCurrentUrl().equals(url)) {

				logger.info("Verify that if Utensils menu it should redirect to related  screen");
		  
			}
	
	  } catch (Exception e) {


		logger.info("Verify that if Utensils menu it should redirect to related  screen");
		
		
	}
	  
	  	  
	  // Add utensils
	  
		try {

			WebElement add = d.findElement(By.xpath("//a[@class='btn']"));

			if (add.isDisplayed() && add.isEnabled()) {

				add.click();

				String url = "http://192.168.1.230:4000/utensilnames/new";

				logger.info("If click add button is should redirect to add new screen");
			}

		} catch (Exception e) {

			logger.error("If click add button is should redirect to add new screen");

		}	  
	  
	  // Enter the new name
	  
		try {

			WebElement add = d.findElement(By.id("utensilname_name"));

			if (add.equals(d.switchTo().activeElement())) {

				add.sendKeys("30 Ltr Hot pack");

				logger.info("can enter the vessels name");

			}

		} catch (Exception e) {

			logger.error("can enter the vessels name");

		}

	  // Enter the Description
	  
		try {

			WebElement desc = d.findElement(By.xpath("//textarea[@id='utensilname_description']"));

			desc.sendKeys("30 Ltr Hot pack");

			logger.info("user can enter the description");

		} catch (Exception e) {

			logger.error("user can enter the description");

		}
	    	  
	  // submit 
	  
		try {

			WebElement submit = d.findElement(By.xpath("//input[@value='submit']"));

			submit.click();

			Thread.sleep(200);

			logger.info("Verify that if the user can click the submit button");
			
			String url = "http://192.168.1.230:4000/utensilnames";

			WebElement srch = d.findElement(By.xpath("//input[@type='search']"));

			srch.sendKeys("30 Ltr Hot pack");

			Thread.sleep(500);

			WebElement values = d.findElement(By.xpath("//td[@class='sorting_1']"));

			// String val = "30 Ltr Hot pack";

			values.isDisplayed();

			logger.info("Verify that if the utensil are successfully created");

		} catch (Exception e) {
			
			logger.error("Verify that if the user can click the submit button");

			logger.error("Verify that if the utensil are successfully created");

		}

	}
    
  @Test (priority = 3)
  public void utensil_2() {
	  
		
	  // ADD SCREEN
	  
	  try {

			WebElement add = d.findElement(By.xpath("//a[@class='btn']"));

			if (add.isDisplayed() && add.isEnabled()) {

				add.click();

				String url = "http://192.168.1.230:4000/utensilnames/new";

				logger.info("If click add button is should redirect to add new screen");
			}

		} catch (Exception e) {

			logger.error("If click add button is should redirect to add new screen");

		}	  
	  
	  
	  // Enter the new name - 2
	  
			try {

				WebElement add = d.findElement(By.id("utensilname_name"));

				if (add.equals(d.switchTo().activeElement())) {

					add.sendKeys("21 Ltr Hot pack");

					logger.info("Verify that if the user can enter the vessels name");

				}

			} catch (Exception e) {

				logger.error("Verify that if the user can enter the vessels name");

			}

		  // Enter the Description
		  
			try {

				WebElement desc = d.findElement(By.xpath("//textarea[@id='utensilname_description']"));

				desc.sendKeys("21 Ltr Hot pack");

				logger.info("user can enter the description");

			} catch (Exception e) {

				logger.error("user can enter the description");

			}
		    	  
		  // submit 
		  
		  try {
			  
			WebElement submit = d.findElement(By.xpath("//input[@value='submit']"));
			
			submit.click();
			
			Thread.sleep(200);
			
			String url ="http://192.168.1.230:4000/utensilnames";
			
			WebElement srch = d.findElement(By.xpath("//input[@type='search']"));
			
			srch.sendKeys("21  Ltr Hot pack");
			 
			Thread.sleep(500);
			
			WebElement values = d.findElement(By.xpath("//td[@class='sorting_1']"));
			
			values.isDisplayed();
			
			logger.info("Verify that if the vessel is successfully created");
						
		  }catch (Exception e) {
			
			  logger.error("Verify that if the vessel is successfully created");
		  
		}
					
	}
    
     	  
	@BeforeTest
	
	public void beforeTest() {
 
		try {

		   	logger = logger.getLogger(" Habitos - Utensils");

			PropertyConfigurator.configure("log4jproperties.txt");

			Thread.sleep(100);

			System.setProperty("webdriver.chrome.driver", "../ERP/resources/chromedriver.exe");

			  d = new ChromeDriver();

			logger.info("browser gets open"); 
			
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(500); 
 
			d.get("http://192.168.1.230:4000/");

			logger.info("browser gets valid ip address");

			}

			catch (Exception e) {

			System.out.println("Login is not working");

		}

  }

  @AfterTest
  
  public void afterTest() throws InterruptedException {
	  
	  Thread.sleep(3000); 
	  
	  d.close();
	  
  }

}

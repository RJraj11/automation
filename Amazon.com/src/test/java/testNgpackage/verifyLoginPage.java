package testNgpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompackage.HomePage;
import pompackage.LoginPage;

public class verifyLoginPage {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	}	  
		  @BeforeMethod
		    public void loginFlipkart() {
		    System.out.println("loginFlipkart");
		    driver.get("https://www.flipkart.com/");
		    loginPage =new LoginPage(driver);
		    loginPage.loginpageclick();
		    	
		    	
		  }
		  
		  @Test
		  public void clickontravel() throws InterruptedException {
		    	
		    	Thread.sleep(3000);
		    	System.out.println("travel");
		    	 homePage = new HomePage(driver);
		    	 homePage.clickonelectronics();
		  }  	 
		    	 
		  @AfterMethod
		  public void logout() throws InterruptedException {
			  
			  
			homePage.clickonlogouticon();
			Thread.sleep(1000);
			homePage.clickonlogoutbutton();
		  }
	
	
		  @AfterClass
		  public void dclose() {
			  
			  driver.close();
		  }
		  
	
	
	

}


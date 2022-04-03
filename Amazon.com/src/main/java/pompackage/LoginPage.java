package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	private WebDriver driver;


	@FindBy (xpath="//a[text()='Login']")
	private WebElement loginicon;
	
	
	@FindBy (xpath="(//input[@type=\"text\"])[3]")
	private WebElement username ;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password ;
	
	@FindBy (xpath="(//span[text()='Login'])[2]")
	private WebElement login ;
	
	@FindBy (xpath="(////div[text()='My Account']")
	private WebElement Myaccount ;
	
	
public LoginPage (WebDriver driver) { //driver1 = driver = new chromeDriver()
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		}	
	
	public void loginpageclick() {
		
		loginicon.click();
		username.sendKeys("9561940711");
		password.sendKeys("9561940711");
		login.click();
		
	}
}

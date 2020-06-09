package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactory {
	
	WebDriver driver;	
	public RediffLoginPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="login")
	WebElement userName;
	
	@FindBy(name="passwd")
	WebElement passWord;
	
	@FindBy(name="proceed")
	WebElement signIn;
	
	@FindBy(linkText="rediff.com")
	WebElement home;

	public WebElement UserName() {
		return userName;
	}

	public WebElement PassWord() {
		return passWord;
	}

	public WebElement SignIn() {
		return signIn;
	}

	public WebElement Home() {
		return home;
	}

	
}

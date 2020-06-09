package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;	
	public RediffLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By userName = By.name("login");
	By passWord = By.name("passwd");
	By signIn = By.name("proceed");
//	By forgotPwd = By.xpath("//u[contains(text(),'Forgot Password?')]");
	By forgotPwd = By.linkText("Forgot Password?");
	By home = By.linkText("rediff.com");
	
	public WebElement UserName() {
		return driver.findElement(userName);
	}

	public WebElement PassWord() {
		return driver.findElement(passWord);
	}

	public WebElement SignIn() {
		return driver.findElement(signIn);
	}

	public WebElement Home() {
		return driver.findElement(home);
	}

	
}

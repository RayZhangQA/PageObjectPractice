package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffLoginPage;
import objectRepository.RediffLoginPageFactory;

public class LoginApplication {
	
	@Test
	public void Login(){
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPageFactory rlp = new RediffLoginPageFactory(driver);
		
		rlp.UserName().sendKeys("myUserName");
		rlp.PassWord().sendKeys("myPassWord");
		rlp.SignIn().click();
		rlp.Home().click();
		
		RediffHomePage rhp = new RediffHomePage(driver);
		
		rhp.SearchProd().sendKeys("ridiff");
		rhp.SearchBtn().click();
	
	
	}
}

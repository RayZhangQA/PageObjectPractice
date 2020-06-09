package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;	
	public RediffHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By srchProd = By.id("srchword");
	By srchBtn = By.xpath("//form[@id='queryTop']/input");
	
	public WebElement SearchProd() {
		return driver.findElement(srchProd);
	}

	public WebElement SearchBtn() {
		return driver.findElement(srchBtn);
	}

	
}

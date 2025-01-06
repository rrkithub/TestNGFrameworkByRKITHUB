package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLoginPage  extends BasePage{
	public AmazonLoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	private WebElement dropdown;
	@FindBy(xpath = "//span[@id='continue-announce']")
	private WebElement signin;

	public void dropdown() {
		dropdown.click();
		
		
	}

	
	

}

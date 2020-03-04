package tm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//img[@alt= 'logo']")
	WebElement tmLogo;
	
	@FindBy(xpath = "//a[contains(text(), 'Home')]")
	WebElement HomeLink;
	
	@FindBy(xpath = "//a[text()='My TM']")
	WebElement MyTMlink;
	
	@FindBy(xpath = "//a[text()= 'Become an Agent']")
	WebElement BecomeAnAgentLink;
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage clickOnTmLogo() {
		tmLogo.click();
		return new HomePage();
	}
	
	public HomePage clickOnHomeLink() {
		HomeLink.click();
		return new HomePage();
	}
	
	public SignInPage clickOnMyTMlink() {
		MyTMlink.click();
		return new SignInPage();
	}
	
	public SignUpPage clickOnBecomeAnAgentLink() {
		BecomeAnAgentLink.click();
		return new SignUpPage();
	}
}

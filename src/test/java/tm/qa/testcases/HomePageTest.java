package tm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tm.qa.base.TestBase;
import tm.qa.pages.HomePage;
import tm.qa.pages.SignInPage;
import tm.qa.pages.SignUpPage;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	SignInPage signInPage;
	SignUpPage signUpPage;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void clickOnTmLogoTest() {
		homePage=homePage.clickOnTmLogo();
	}
	
	@Test(priority=2)
	public void clickOnHomeLinkTest() {
		homePage=homePage.clickOnHomeLink();
	}
	
	@Test(priority=3)
	public void clickOnMyTMlinkTest() {
		signInPage=homePage.clickOnMyTMlink();
	}
	
	@Test(priority=4)
	public void clickOnBecomeAnAgentLinkTest() {
	    signUpPage=homePage.clickOnBecomeAnAgentLink();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}

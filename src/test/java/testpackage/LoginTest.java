package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagepackage.DashboardPage;
import pagepackage.LoginPage;
import utilpackage.BrowserFactory;

public class LoginTest {

	// inherit, obj, by the name of the class

	WebDriver driver;

	

	@Test
	public void verifiedUserShouldBeAbleToLogin() {
		
	

		/*
		 * My self use only BrowserFactory objBF = new BrowserFactory(); objBF.init();
		 * objBF.tearDown();
		 */

		// static void init()

		driver = BrowserFactory.init(); // this driver on left and init() return driver equal to that driver.
		System.out.println(driver.getTitle());
		
//		LoginPage login = new LoginPage();
//		login.insertUserName(username); = not work in way
		
		// login data
		String username = "demo@techfios.com";
		String userpassword = "abc123";
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);	//only driver = parameter, LoginPage.Class = where it going to
		login.insertUserName(username);
		login.insertPassWord(userpassword);
		login.clickSigninButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();
		
		BrowserFactory.tearDown();
	}

}

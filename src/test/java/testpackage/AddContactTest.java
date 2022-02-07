package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagepackage.AddContactPage;
import pagepackage.DashboardPage;
import pagepackage.LoginPage;
import utilpackage.BrowserFactory;

public class AddContactTest {
	
	WebDriver driver;
	
	//Test Data
//	String Full_NAME = "TestNG";
//	String COMPANY_NAME = "Techfios";
//	String EMAIL = "abc234@techfios.com";
//	String PHONE_NUMBER = "123658";
//	String COUNTRY = "Angola";
	
	@Test	//very important, without it will not run
	public void validUserShouldBeAbleToAddCustomer() {
		
		//for new separate AddCustomerTest, first launch browser
		driver = BrowserFactory.init();	//how establish driver
		
		//need login second
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);	//only driver = parameter, LoginPage.Class = where it going to
		login.insertUserName("demo@techfios.com");
		login.insertPassWord("abc123");
		login.clickSigninButton();
		
		//need land on Dash board page
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();
		dashboard.clickCustomerButton();
		dashboard.clickAddCustomerButton();
		
		//need call AddContactPage
		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);		//now we pass drive in AddContactTest, we also need driver in AddContackPage by creating constructor
		addContactPage.insertFullName("TestNG");
		addContactPage.selectCompany("Techfios");
		addContactPage.insertEmail("abc234@techfios.com");
		addContactPage.insertPhone("123658");
		addContactPage.selectCountry("Angola");
		
	}
	
	
}

package pagepackage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddContactPage extends BasePage {
	WebDriver driver;
	
	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT; 
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_NAME_ELEMENT; 
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT; 
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT; 
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]") WebElement COUNTRY_ELEMENT;	//for dropdown copy = <select> tag 

	public void insertFullName(String username) {
		
		FULL_NAME_ELEMENT.sendKeys(username+generateRandomNo(999));
	}
	public void selectCompany(String company) {
		
		
		selectFromDropdown(COMPANY_NAME_ELEMENT,company );
	}
	
		
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(999) + email);
	}
		
	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + generateRandomNo(99));
	}
	
	public void selectCountry(String country) {
		selectFromDropdown(COUNTRY_ELEMENT, country);
	}

	
}

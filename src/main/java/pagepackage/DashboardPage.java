package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	//constructor to connect driver form LoginTest to DashboardPage
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_BUTTON_ELEMENT;
	
	public void verifyDashboard() {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard", "oh! wrong page");	
	}
	
	public void clickCustomerButton() {
		CUSTOMER_BUTTON_ELEMENT.click();
	}
	
	public void clickAddCustomerButton() {
		ADD_CUSTOMER_BUTTON_ELEMENT.click();
	}
}

package pagepackage;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public int generateRandomNo(int boundaryNumber) {
		Random rnd = new Random();	//need it first before generatRandomNo
		int generatNo = rnd.nextInt(boundaryNumber);	//control number
		return generatNo;
		
	}
	
	public void selectFromDropdown(WebElement selectElement, String visibleText) {
		Select sel = new Select(selectElement);	//need select class for dropdown
		sel.selectByVisibleText(visibleText);	//parameterize company= whoever call it, will provide the value
		

}
}

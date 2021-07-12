package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Validate_Page;
import util.BrowserFactory;

public class Validate_Testing {
	
	WebDriver driver;
	

	@Test
	public void validUserShouldBeAbleToValidateTest() {
		driver = BrowserFactory.init();
		
		Validate_Page validatePage = PageFactory.initElements(driver, Validate_Page.class);
		validatePage.insertAddValue("1");
		validatePage.clickAddButton();
		validatePage.insertAddValue1("2");
		validatePage.clickAddButton1();
		validatePage.toggleCheckBox();
		validatePage.clickRemoveButton();
		
		BrowserFactory.tearDown();
		
	}
	
	

}

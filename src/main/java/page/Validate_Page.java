package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Validate_Page extends BasePage {
	
	WebDriver driver;
	
	
//		driver.findElement(By.name("data")).sendKeys("1");
//		driver.findElement(By.cssSelector("input[value='Add']")).click();
////		driver.findElement(By.cssSelector("input[value='Add']")).sendKeys("2");
////		driver.findElement(By.cssSelector("input[value='Add']")).sendKeys("3");
//		driver.findElement(By.cssSelector("input[onclick='checkAll();']")).click();
//		driver.findElement(By.cssSelector("input[value='Remove']")).click();
		
	@FindBy(how=How.NAME, using = "data") WebElement  ADD_VALUE;
	@FindBy(how=How.CSS, using = "input[value='Add']") WebElement  ADD_BUTTON;
	@FindBy(how=How.NAME, using = "data") WebElement  ADD_VALUE1;
	@FindBy(how=How.CSS, using = "input[value='Add']") WebElement  ADD_BUTTON1;
	@FindBy(how=How.CSS, using = "input[value='on']") WebElement  TOGGLE_BOX;
	@FindBy(how=How.CSS, using = "input[value='Remove']") WebElement  REMOVE_BUTTON;
	
	public void insertAddValue(String addValue) {
		ADD_VALUE.sendKeys(addValue);
		
	}
	
	public void clickAddButton() {
		ADD_BUTTON.click();
		
	}
	
	public void insertAddValue1(String addValue1) {
		ADD_VALUE1.sendKeys(addValue1);
		
	}
	
	public void clickAddButton1() {
		ADD_BUTTON1.click();
	}
	
	public void toggleCheckBox() {
		TOGGLE_BOX.click();
		
	}
	
	public void clickRemoveButton() {
		REMOVE_BUTTON.click();
	}
	

}

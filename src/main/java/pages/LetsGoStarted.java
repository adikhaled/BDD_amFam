package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class LetsGoStarted {

	public LetsGoStarted(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@name='zipCode']") WebElement zipCode;
	@FindBy(xpath = "(//span[@class='SelectionTiles__tile-cta'])[1]") WebElement car;
	@FindBy(className = "LoadingButton__content") WebElement letsGo;
	
	public void zipCodeStep() {
		CommonActions.input(zipCode,"11230");
	}
	public void carStep() {
		CommonActions.click(car);
	}
	public void letsGoStep() {
		CommonActions.click(letsGo);
	}
	
	public void letsGoStartedSteps() {
		CommonActions.input(zipCode, "11230");
		CommonActions.click(car);
		CommonActions.click(letsGo);
	}
}

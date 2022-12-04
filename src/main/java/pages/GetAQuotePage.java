package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonActions;

public class GetAQuotePage {
   // CommonWaits commonWaits;
	public GetAQuotePage(WebDriver driver) {
		//commonWaits=new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Get a Quote']")
	WebElement getAQuoteButton;
	
	public void getAQuoteButtonStep() throws InterruptedException {
//		commonWaits.waitUntilVisible(getAQuoteButton);
//		commonWaits.waitUntilClickable(getAQuoteButton);
		Thread.sleep(5000);
		CommonActions.click(getAQuoteButton);
	}
}

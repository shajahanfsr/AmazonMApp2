package com.amazon.pages;

import static com.amazon.testUtils.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ReviewPage extends BasePage {

	// *********Constructor*********
	public ReviewPage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	// *********Web Elements*********
	By proceedToBuyBtn_id = By.id(ObjRepoProp.getProperty("proceedToBuyBtn_id"));
	By confirmationMessage_xpath = By.xpath(ObjRepoProp.getProperty("productName_xpath"));

	public ReviewPage clickOnSubmitBtn() {
		// click on Add to cart button
		click(proceedToBuyBtn_id);
		return this;
	}
	
	public ReviewPage verifyConfirmatinMsg() {
		// Verify Product price
		Assert.assertTrue(isElementDisplayed(confirmationMessage_xpath));
		return this;
	}
}
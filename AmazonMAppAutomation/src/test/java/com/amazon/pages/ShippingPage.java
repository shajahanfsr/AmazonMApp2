package com.amazon.pages;

import static com.amazon.testUtils.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ShippingPage extends BasePage {

	// *********Constructor*********
	public ShippingPage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	// *********Web Elements*********
	By proceedToBuyBtn_id = By.id(ObjRepoProp.getProperty("proceedToBuyBtn_id"));
	By productName_xpath = By.xpath(ObjRepoProp.getProperty("productName_xpath"));
	By deliverToAddressBtn_id = By.id(ObjRepoProp.getProperty("proceedToBuyBtn_id"));

	public ShippingPage clickOnProceedToBuyBtn() {
		// click on Add to cart button
		click(proceedToBuyBtn_id);
		return this;
	}
	
	public BillingPage clickOnDeliverAddress() {
		// click on Add to cart button
		click(proceedToBuyBtn_id);
		return new BillingPage(driver);
	}

	public ShippingPage verifyProductName(String text) {
		// Verify Product price
		Assert.assertTrue(readText(productName_xpath).contains(text));
		return this;
	}
}
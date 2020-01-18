package com.fanniemae.automation.RealEstateBrokerElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateRealEstateBrokerSupplier {

	@FindBy(xpath = "//*[text()='Role']/../following-sibling::tr[2]/td[11]//select")
	public static WebElement supplierRole;
	@FindBy(xpath = "//*[text()='Role']/../following-sibling::tr[2]/td[11]//select")
	public static WebElement supplierRole2;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement saveButton;
	@FindBy(xpath = "//span[text()='Main Info']")
	public static WebElement mainInfoTab;
	@FindBy(xpath = "//td[text()='Supplier ID : ']/following-sibling::td/div")
	public static WebElement supplierId;
}
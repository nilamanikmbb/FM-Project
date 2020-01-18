package com.fanniemae.automation.CreateRequisitionElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateSpecialRequestsRequisitions {

	@FindBy(xpath = "//*[@id='body_x_tabc_containerTab_partdue']/div/div/div/span")
	public static WebElement term;
	@FindBy(id = "proxyActionBar_x_back_to_catalog_btn2")
	public static WebElement backToCatalog;
	@FindBy(id = "proxyActionBar_x_btnAllocationReset_btn2")
	public static WebElement resetAllocation;
	@FindBy(id = "proxyActionBar_x__cmdAction_btn2")
	public static WebElement otherActions;
	@FindBy(xpath = "//div//span[contains(text(),'Workflow')]")
	public static WebElement workflow;
	@FindBy(xpath = "//input[@value='Submit for Approval']")
	public static WebElement submitForApproval;
	@FindBy(xpath = "//div[@id='messageBar']//div/button[2]/span")
	public static WebElement saveButtonMark;
}
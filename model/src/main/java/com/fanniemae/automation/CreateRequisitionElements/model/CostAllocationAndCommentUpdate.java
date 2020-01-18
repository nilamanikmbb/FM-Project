package com.fanniemae.automation.CreateRequisitionElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CostAllocationAndCommentUpdate {

	@FindBy(xpath = "//input[@name='proxyActionBar:x:_cmdSave_btn2']")
	public static WebElement labelSaveButton;
	@FindBy(xpath = "(//*[text()='GL Account']/../following-sibling::tr[2]/td[2]/table//tr/td)[2]")
	public static WebElement glAccountButton;
	@FindBy(xpath = "//input[@name='body:x:txtQuery:x:x']")
	public static WebElement accountSelectionKeyWords;
	@FindBy(xpath = "//input[@name='body:x:prxFilterBar:x:cmdSearchBtn_btn2']")
	public static WebElement accountSelectionSearch;
	@FindBy(id = "body_x_grdAccount_x__ctl2__ctl0")
	public static WebElement accountSelectionLabelIcon;
	@FindBy(xpath = "(//*[text()='GL Account']/../following-sibling::tr[2]/td[3]/table//tr/td)[1]/input")
	public static WebElement costCenter;
	@FindBy(xpath = "//div[@role='menuitem']/div")
	public static WebElement costCentreList;
	@FindBy(xpath = "(//*[text()='GL Account']/../following-sibling::tr[2]/td[4]/table//tr/td)[1]/input")
	public static WebElement peopleSoftProjectID;
	@FindBy(xpath = "//*[@value='Save & close']")
	public static WebElement saveandCloseButton;
	@FindBy(id = "proxyActionBar_x_btnAllocationReset_btn2")
	public static WebElement resetAllocation;
}
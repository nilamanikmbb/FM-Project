package com.fanniemae.automation.SupplierContactElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierContactPage {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement supplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub8")
	public static WebElement browseSupplierContactLink;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement supplierContactsKeywords;
	@FindBy(id = "body_x_selSupplier_x_btnselSupplier_btn2")
	public static WebElement supplierContactsSupplierThreeDots;
	@FindBy(id = "ddlbody_x_ddlContactType_x")
	public static WebElement supplierContactsContactType;
	@FindBy(id = "body_x_chkContactDelete_x0")
	public static WebElement supplierContactDeleteRadioBtn;
	@FindBy(id = "body_x_chkShowPictures_x0")
	public static WebElement supplierContactViewPhotosRadioBtn;
	@FindBy(id = "body_x_chkOrphan_x0")
	public static WebElement supplierContactWithoutAScopeRadioBtn;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement supplierContactSearch;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement supplierContactReset;
}
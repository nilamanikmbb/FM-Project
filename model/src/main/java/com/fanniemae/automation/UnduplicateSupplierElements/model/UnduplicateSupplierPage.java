package com.fanniemae.automation.UnduplicateSupplierElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnduplicateSupplierPage {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement supplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub7")
	public static WebElement unduplicateSupplier;
	@FindBy(id = "body_x_selAlgo_x_txtselAlgo_x_x")
	public static WebElement unduplicateSupplierAlgorithm;
	@FindBy(id = "ddlbody_x_selLevel_x")
	public static WebElement unduplicateSupplierLevel;
	@FindBy(id = "body_x_chkDisplayNotDuplicate_x0")
	public static WebElement unduplicateSupplierNotaDupliRadioBtn;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement unduplicateSupplierSearch;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement unduplicateSupplierReset;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement unduplicateSupplierKeywords;
}
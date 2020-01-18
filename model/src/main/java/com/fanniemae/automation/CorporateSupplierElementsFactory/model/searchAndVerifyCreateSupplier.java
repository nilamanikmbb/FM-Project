package com.fanniemae.automation.CorporateSupplierElementsFactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchAndVerifyCreateSupplier {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement supplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub0")
	public static WebElement supplierBrowser;
	@FindBy(id = "body_x_ddlStatus_x_vddlStatus_x__ctl2___colDelvddlStatus")
	public static WebElement supplierStatusCrossMark;
	@FindBy(id = "ddlbody_x_ddlType_x")
	public static WebElement supplierType;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement supplierSearchKeyword;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement supplierSearchButton;
}
package com.fanniemae.automation.SupplierRiskIndicatorElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierRiskIndicatorPage {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement supplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub9")
	public static WebElement supplierRiskIndicatorLink;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement supplierDocumentKeywords;
	@FindBy(id = "body_x_ddlFamilyRisk_x")
	public static WebElement supplierRiskIndicatorRiskFamily;
	@FindBy(id = "ddlbody_x_ddlStatus_x")
	public static WebElement supplierRiskIndicatorStatus;
	@FindBy(id = "proxyActionBar_x__cmdNew_btn2")
	public static WebElement supplierRiskIndicatorCreateIndicator;
	@FindBy(id = "body_x_txtCode_x_x")
	public static WebElement supplierRiskIndicatorCode;
	@FindBy(id = "ddlbody_x_selIndicCodeParent_x")
	public static WebElement supplierRiskIndicatorCreateRiskFamily;
	@FindBy(id = "body_x_txtLabel_x_x")
	public static WebElement supplierRiskIndicatorLabel;
	@FindBy(xpath = "//table[@id='body_x_phc']/tbody/tr[4]/td[2]/div/div")
	public static WebElement supplierRiskIndicatorDescription;
	@FindBy(id = "body_x_txtOrder_x_x")
	public static WebElement supplierRiskIndicatorOrder;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement supplierRiskIndicatorClose;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement supplierRiskIndicatorSearch;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement supplierRiskIndicatorReset;
}
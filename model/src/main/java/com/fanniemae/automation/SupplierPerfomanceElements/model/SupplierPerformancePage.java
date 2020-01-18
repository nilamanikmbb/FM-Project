package com.fanniemae.automation.SupplierPerfomanceElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierPerformancePage {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement supplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub3")
	public static WebElement SupplierPerformanceLink;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement SupplierPerformancKeywords;
	@FindBy(xpath = "//select[@id='ddlbody_x_selQuestType_x']")
	public static WebElement SupplierPerformancType;
	@FindBy(id = "body_x_selOrga_x_txtselOrga_x_x")
	public static WebElement SupplierPerformancOrganistion;
	@FindBy(id = "body_x_selFamily_x_txtselFamily_x_x")
	public static WebElement SupplierPerformancCommodity;
	@FindBy(id = "body_x_selSupplier_x_btnselSupplier_btn2")
	public static WebElement SupplierPerformancSuppliersDots;
	@FindBy(id = "proxyActionBar_x__cmdNew_btn2")
	public static WebElement SupplierPerformancCampaign;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement supplierPerformancSearch;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement supplierPerformancReset;
}
package com.fanniemae.automation.SupplierRegistrationElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class supplierRegistrations {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement supplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub1")
	public static WebElement supplierRegistrationsLink;
	@FindBy(id = "ddlbody_x_selSearchStatus_x")
	public static WebElement supplierRegStatus;
	@FindBy(id = "body_x_selFamily_x_txtselFamily_x_x")
	public static WebElement supplierRegCommodity;
	@FindBy(id = "body_x_selAnomalies_x_txtselAnomalies_x_x")
	public static WebElement supplierRegAlerts;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement supplierRegKeywords;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement supplierRegSearch;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement supplierRegReset;
}
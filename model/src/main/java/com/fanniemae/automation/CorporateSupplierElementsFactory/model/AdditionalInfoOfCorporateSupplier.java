package com.fanniemae.automation.CorporateSupplierElementsFactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdditionalInfoOfCorporateSupplier {

	@FindBy(css = "#body_x_tabc_containerTab_partadmin .tab_label_class > div")
	public static WebElement additionalInfoTab;
	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_selQualCode_x")
	public static WebElement TINType;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_txtTva_x_x")
	public static WebElement FederalTaxID;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement additionalInfoSaveButton;
	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_selQualCode_x__label")
	public static WebElement TinTypeD;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_txtTva_x_x__label")
	public static WebElement federalTaxIdD;
}
package com.fanniemae.automation.EvalutionElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createSupplier {

	@FindBy(id = "body_x_selEvalObjects_x_btnselEvalObjects_btn2")
	public static WebElement createSupplierDots;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement createSupplierClose;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement createSupplierKeywords;
	@FindBy(id = "body_x__supplier_state__x_txt_supplier_state__x_x")
	public static WebElement createSupplierState;
	@FindBy(id = "body_x_txtSupCommodityComment_x_x")
	public static WebElement createSupplierOverview;
	@FindBy(id = "ddlbody_x_ddlType_x")
	public static WebElement createSupplierType;
	@FindBy(id = "ddlbody_x_ddlStatus_x")
	public static WebElement createSupplierStatus;
	@FindBy(xpath = "//table[@id='body_x_placeholder_supplier_130121155538']/tbody/tr[1]/td/table/tbody/tr/td[2]/span/span/h4")
	public static WebElement createSupplieridentity;
	@FindBy(id = "ddlbody_x_ddlLevel_x")
	public static WebElement createSupplierHierarchy;
	@FindBy(id = "body_x_selOrg_x_txtselOrg_x_x")
	public static WebElement createSupplierOrganisation;
	@FindBy(id = "body_x_chkLimitFam_x0")
	public static WebElement createSupplierLimitComodity;
	@FindBy(id = "body_x_selArea_x_txtselArea_x_x")
	public static WebElement createSupplierRegionsServed;
	@FindBy(id = "body_x_sup_code_x_x")
	public static WebElement createSupplierPSID;
	@FindBy(id = "body_x__supplier_bookmark_x_txt_supplier_bookmark_x_x")
	public static WebElement createSupplierUserBookmarkSupplier;
	@FindBy(id = "createSupplierStatus")
	public static WebElement ddlbody_x_ddlStatus_x;
	@FindBy(id = "ddlbody_x_selYesnCodeActiveSup_1_x")
	public static WebElement createSupplierActiveSupplier;
	@FindBy(id = "ddlbody_x_selCritCode_x")
	public static WebElement createSupplierCritically;
	@FindBy(id = "body_x_chkLimitOrga_x0")
	public static WebElement createSupplierLimitOrganisation;
	@FindBy(id = "body_x_chkSupBook_x0")
	public static WebElement createSupplierFavourite;
	@FindBy(id = "body_x_selAnomalies_x_txtselAnomalies_x_x")
	public static WebElement createSupplierAlerts;
	@FindBy(id = "body_x_sup_tva_ic_x_x")
	public static WebElement createSupplierTaxNumber;
	@FindBy(id = "body_x_cbChangeRequestLocked_x0")
	public static WebElement createSupplierLockedSupplier;
	@FindBy(id = "body_x_txtCity_x_x")
	public static WebElement createSupplierCity;
	@FindBy(id = "body_x_txtZipCode_x_x")
	public static WebElement createSupplierZipCode;
	@FindBy(id = "body_x_selState_x_txtselState_x_x")
	public static WebElement createSupplierAddressState;
	@FindBy(id = "ddlbody_x_selDocType_x")
	public static WebElement createSupplierFolder;
	@FindBy(id = "ddlbody_x_chkFollow_x")
	public static WebElement createSupplierFollow;
	@FindBy(id = "ddlbody_x_chkMissingDoc_x")
	public static WebElement createSupplierDocsMissing;
	@FindBy(id = "ddlbody_x_selDocStatus_x")
	public static WebElement createSupplierConfirmity;
	@FindBy(id = "body_x_ddlValidity_x")
	public static WebElement createSupplierValidity;
	@FindBy(xpath = "//table[@id='body_x_ddlStatus_x_vddlStatus_x']/tbody/tr/td[2]")
	public static WebElement createSupplierCheck;
}
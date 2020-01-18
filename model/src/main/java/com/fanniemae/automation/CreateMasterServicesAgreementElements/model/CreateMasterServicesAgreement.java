package com.fanniemae.automation.CreateMasterServicesAgreementElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateMasterServicesAgreement {

	@FindBy(id = "link_ivmenu00_menu_2")
	public static WebElement contracts;
	@FindBy(id = "link_ivmenu00_menu_2_sub0_sub0")
	public static WebElement createcontract;
	@FindBy(xpath = "//span[@class='fa fa-times']")
	public static WebElement cspviolation;
	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:txtLibContract:x:txtLibContracten']")
	public static WebElement contractTitle;
	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selTypeContract_x']")
	public static WebElement contractType;
	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:selSupplier:x:txtselSupplier:x:x']")
	public static WebElement supplier;
	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:orga_level:x:txtorga_level:x:x']")
	public static WebElement costcenter;
	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:selFundingId:x:txtselFundingId:x:x']")
	public static WebElement pepolesoftproject;
	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:prxDoc:x:UploadButtonControl_btn2']")
	public static WebElement fileattach;
	@FindBy(xpath = "//input[@name='body:x:tabc:x:info:x:prxinfo:x:selFamily:x:txtselFamily:x:x']")
	public static WebElement primaryCategory;
	@FindBy(xpath = "//textarea[@name='body:x:tabc:x:info:x:prxinfo:x:txtCtrFmTxtproductservice:x:x']")
	public static WebElement productsServicesDescription;
	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_selFbdrindiCodeFmDdlriskindicator_2_x']")
	public static WebElement contractStatusIndicator;
	@FindBy(xpath = "//textarea[@name='body:x:tabc:x:info:x:prxinfo:x:txtCtrStatUpdNextSteps_1:x:x']")
	public static WebElement statusUpdateNextSteps;
	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x__ctr_fm_aor_edam_x']")
	public static WebElement thirdPartyData;
	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrSme_x']")
	public static WebElement transactionLegalSME;
	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrFsoneCode_x']")
	public static WebElement chargedtheloan;
	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x__ctr_fm_aor_reo_x']")
	public static WebElement legal;
	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrFromPr_x']")
	public static WebElement createdfromPR;
	@FindBy(xpath = "//select[@id='ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrFg_x']")
	public static WebElement budgetBUApprovalProvidedinFieldglass;
	@FindBy(xpath = "(//td[@class='form'])[2]")
	public static WebElement contractTitleD;
	@FindBy(id = "ddlbody_x_tabc_x_info_x_prxinfo_x_selTypeContract_x__label")
	public static WebElement contractTypeD;
	@FindBy(id = "body_x_tabc_x_info_x_prxinfo_x_selSupplier_x_txtselSupplier_x_x__label")
	public static WebElement supplierD;
	@FindBy(id = "body_x_tabc_x_info_x_prxinfo_x_selFamily_x_txtselFamily_x_x__label")
	public static WebElement primaryCategoryD;
	@FindBy(id = "body_x_tabc_x_info_x_prxinfo_x_txtCtrFmTxtproductservice_x_x__label")
	public static WebElement productDescriptionD;
	@FindBy(id = "ddlbody_x_tabc_x_info_x_prxinfo_x_selFbdrindiCodeFmDdlriskindicator_2_x__label")
	public static WebElement contractStatusIndicatorD;
	@FindBy(id = "body_x_tabc_x_info_x_prxinfo_x_txtCtrStatUpdNextSteps_1_x_x__label")
	public static WebElement statusUpdateD;
	@FindBy(id = "ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrFromPr_x__label")
	public static WebElement createdFromPRD;
	@FindBy(id = "ddlbody_x_tabc_x_info_x_prxinfo_x_txtCtrFg_x__label")
	public static WebElement budgetAndBUApprovalD;
}
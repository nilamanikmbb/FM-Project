package com.fanniemae.automation.CorporateSupplierElementsFactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactInfoForCreateSupplier {

	@FindBy(css = "#body_x_tabc_containerTab_partcontact .tab_label_class > div")
	public static WebElement contactInfoTab;
	@FindBy(id = "body_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact_x_btnselContact_btn2")
	public static WebElement AddAContact;
	@FindBy(id = "ddlbody_x_pxCtc_x_ContactControl_x_selStatusCode_x")
	public static WebElement AddAContactStatus;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactLastname_x_x")
	public static WebElement AddAContactLastName;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactFirstname_x_x")
	public static WebElement AddAContactFirstName;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactEmail_x_x")
	public static WebElement AddAContactEmail;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactPhone_x_x")
	public static WebElement AddAContactPhoneNumber;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement AddAContactSaveAndCloseBtn;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement AddAContactSaveBtn;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement AddAContactCloseBtn;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactLastname_x_x__label")
	public static WebElement lastNameD;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactFirstname_x_x__label")
	public static WebElement firstNameD;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactEmail_x_x__label")
	public static WebElement emailD;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactPhone_x_x__label")
	public static WebElement phoneNoD;
	@FindBy(id = "body_x_pxCtc_x_ContactAddressControl_x_ddlState_x_txtddlState_x_x__label")
	public static WebElement stateD;
	@FindBy(id = "ddlbody_x_pxCtc_x_ContactAddressControl_x_ddlPays_x__label")
	public static WebElement countryD;
}
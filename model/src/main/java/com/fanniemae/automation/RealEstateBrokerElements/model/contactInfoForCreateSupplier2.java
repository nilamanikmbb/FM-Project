package com.fanniemae.automation.RealEstateBrokerElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactInfoForCreateSupplier2 {

	@FindBy(css = "#body_x_tabc_containerTab_partcontact .tab_label_class > div")
	public static WebElement contactInfoTab;
	@FindBy(id = "body_x_tabc_x_contact_x_prxcontact_x_proxyContact_x_selContact_x_btnselContact_btn2")
	public static WebElement addAContact;
	@FindBy(id = "ddlbody_x_pxCtc_x_ContactControl_x_selStatusCode_x")
	public static WebElement contactManagementStatus;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactLastname_x_x")
	public static WebElement contactInfoLastName;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactFirstname_x_x")
	public static WebElement contactInfoFirstName;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactEmail_x_x")
	public static WebElement contactInfoEmail;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_txtContactPhone_x_x")
	public static WebElement contactInfoPhone;
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
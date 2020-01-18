package com.fanniemae.automation.CorporateSupplierElementsFactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainInfoDeatilsOfCorporateSupplier {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement suppliersLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub0_sub0")
	public static WebElement createSupplierLink;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_ddlType_x")
	public static WebElement supplierType;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtName_x_x")
	public static WebElement legalName;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtCorpName_x_txtCorpNameen")
	public static WebElement doingBusinessAs;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtSupRegisContactPhone_x_x")
	public static WebElement phoneNumber;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCompNom_x_x")
	public static WebElement addressNameAdditional;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtVoie_x_x")
	public static WebElement addressLine1;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCity_x_x")
	public static WebElement addressCity;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlState_x_txtddlState_x_x")
	public static WebElement addressState;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtZip_x_x")
	public static WebElement addressZipCode;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlPays_x")
	public static WebElement addressCountry;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selClasCode_x")
	public static WebElement supplierClassification;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement saveButton;
	@FindBy(xpath = "//span[text()='Main Info']")
	public static WebElement mainInfoTab;
	@FindBy(xpath = "//td[text()='Supplier ID : ']/following-sibling::td/div")
	public static WebElement supplierId;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_txtName_x_x__label")
	public static WebElement legalNameD;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selFoiynoCodeOptIn_x__label")
	public static WebElement optInD;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtVoie_x_x__label")
	public static WebElement addressLineD;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtCity_x_x__label")
	public static WebElement cityD;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlState_x_txtddlState_x_x__label")
	public static WebElement stateD;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_txtZip_x_x__label")
	public static WebElement zipCodeD;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_proxyAdr_x_ddlPays_x__label")
	public static WebElement countryD;
	@FindBy(id = "body_x_tabc_x_identity_x_prxidentity_x_ddlType_x__label")
	public static WebElement supplierTypeD;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selLevel_x__label")
	public static WebElement supplierHierarchyD;
	@FindBy(id = "ddlbody_x_tabc_x_identity_x_prxidentity_x_selClasCode_x__label")
	public static WebElement supplierClassificationD;
}
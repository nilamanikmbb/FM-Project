package com.fanniemae.automation.SupplierDocumentsElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class supplierDocumentsPage {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement supplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub6")
	public static WebElement supplierDocument;
	@FindBy(id = "ddlbody_x_selDocType_x")
	public static WebElement supplierDocumentType;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement supplierDocumentKeywords;
	@FindBy(id = "ddlbody_x_selDocStatus_x")
	public static WebElement supplierDocumentStatus;
	@FindBy(id = "body_x_chkArchive_x0")
	public static WebElement supplierDocumentDisplayRadioBtn;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement supplierDocumentSearch;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement supplierDocumentReset;
	@FindBy(id = "body_x_selSupplier_x_btnselSupplier_btn2")
	public static WebElement supplierDocumentSupplierDots;
}
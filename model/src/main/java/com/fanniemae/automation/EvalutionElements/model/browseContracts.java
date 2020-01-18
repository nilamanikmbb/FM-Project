package com.fanniemae.automation.EvalutionElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class browseContracts {

	@FindBy(id = "body_x_selContract_x_btnselContract_btn2")
	public static WebElement contractDots;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement contractKeywords;
	@FindBy(id = "ddlbody_x_ddlProgress_x")
	public static WebElement contractStatus;
	@FindBy(id = "ddlbody_x_selTypeContract_x")
	public static WebElement contractContractType;
	@FindBy(id = "body_x_orga_node_x_txtorga_node_x_x")
	public static WebElement contractCostCenter;
	@FindBy(id = "body_x_txtDate_x_x")
	public static WebElement contractDateFrom;
	@FindBy(id = "body_x_txtDate_x_rtxtDate_x_x")
	public static WebElement contractDateTo;
	@FindBy(id = "body_x_selFamily_x_txtselFamily_x_x")
	public static WebElement contractPrimaryCategory;
	@FindBy(id = "body_x_selEntity_x_txtselEntity_x_x")
	public static WebElement contractManagementEntity;
	@FindBy(id = "body_x_selContact_x_txtselContact_x_x")
	public static WebElement contractContact;
	@FindBy(id = "body_x_project_id_x_txtproject_id_x_x")
	public static WebElement contractProjectCode;
	@FindBy(id = "body_x_selFundingId_x_txtselFundingId_x_x")
	public static WebElement contractPeopleSoftProject;
	@FindBy(id = "ddlbody_x_renewaltype_code_x")
	public static WebElement contractRenewalTypes;
	@FindBy(id = "body_x_selAnomalies_x_txtselAnomalies_x_x")
	public static WebElement contractAlerts;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement contractClose;
}
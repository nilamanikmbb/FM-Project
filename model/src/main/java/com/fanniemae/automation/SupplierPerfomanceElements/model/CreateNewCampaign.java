package com.fanniemae.automation.SupplierPerfomanceElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCampaign {

	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_txtLabel_x_txtLabelen")
	public static WebElement CreateNewCampaignLabel;
	@FindBy(xpath = "//table[@id='body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_txtDesc_x_ptxtDescen']/tbody/tr/td[1]/div/div")
	public static WebElement CreateNewCampaignDescription;
	@FindBy(id = "ddlbody_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selType_x")
	public static WebElement CreateNewCampaignType;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selOrga_x_txtselOrga_x_x")
	public static WebElement CreateNewCampaignOrganisation;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_txtQuestBusinessReviewDate_x_x")
	public static WebElement CreateNewCampaignLabelReviewDate;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selPeriod_x_txtselPeriod_x_x")
	public static WebElement CreateNewCampaignEvaluatedPeriod;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selResp_x_txtselResp_x_x")
	public static WebElement CreateNewCampaignManager;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selFamily_x_txtselFamily_x_x")
	public static WebElement CreateNewCampaignComodity;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_txtDateTo_x_x")
	public static WebElement CreateNewCampaignEndDate;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_txtQuestAutoOpen_x0")
	public static WebElement CreateNewCampaignAutoOpenRadioBtn;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_chkAutoClose_x0")
	public static WebElement CreateNewCampaignAutoCloseRadioBtn;
	@FindBy(id = "ddlbody_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_prxAnomalies_x_selErrors_x")
	public static WebElement CreateNewCampaignAlert;
}
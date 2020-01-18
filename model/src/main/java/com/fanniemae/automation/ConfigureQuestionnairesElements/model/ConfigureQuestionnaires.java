package com.fanniemae.automation.ConfigureQuestionnairesElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigureQuestionnaires {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement supplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub2")
	public static WebElement configureQuestionnairesLink;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement configureQuestionnairesKeywords;
	@FindBy(id = "ddlbody_x_selQuestType_x")
	public static WebElement configureQuestionnairesType;
	@FindBy(id = "body_x_selOrga_x_txtselOrga_x_x")
	public static WebElement configureQuestionnairesOrganisation;
	@FindBy(id = "body_x_selFamily_x_txtselFamily_x_x")
	public static WebElement configureQuestionnairesCommodity;
	@FindBy(id = "ddlbody_x_selStatus_x")
	public static WebElement configureQuestionnairesStatus;
	@FindBy(id = "body_x_selLoginResp_x_txtselLoginResp_x_x")
	public static WebElement configureQuestionnairesManager;
	@FindBy(id = "body_x_chkTemplate_x0")
	public static WebElement configureQuestionnairesTempRadioBtn;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement configureQuestionnairesSearch;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement configureQuestionnairesReset;
	@FindBy(id = "proxyActionBar_x__cmdNew_btn2")
	public static WebElement configureQuestionnairesCreateTemplate;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_txtLabel_x_txtLabelen")
	public static WebElement createTemplateLabel;
	@FindBy(xpath = "//table[@id='body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_txtDesc_x_ptxtDescen']/tbody/tr/td[1]/div/div")
	public static WebElement createTemplateDescription;
	@FindBy(id = "ddlbody_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selType_x")
	public static WebElement createTemplateType;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selOrga_x_txtselOrga_x_x")
	public static WebElement createTemplateOrganisation;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_selFamily_x_txtselFamily_x_x")
	public static WebElement createTemplateCommodity;
	@FindBy(id = "ddlbody_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_prxAnomalies_x_selErrors_x")
	public static WebElement createTemplateAlert;
	@FindBy(id = "body_x_tabCampaign_x_prxInfo_x_prxprxInfo_x_chkTemplateForChoices_x0")
	public static WebElement createChoiceListRadiobtn;
}
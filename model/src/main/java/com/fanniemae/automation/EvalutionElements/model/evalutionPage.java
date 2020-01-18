package com.fanniemae.automation.EvalutionElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class evalutionPage {

	@FindBy(id = "link_ivmenu00_menu_0")
	public static WebElement supplierLink;
	@FindBy(id = "link_ivmenu00_menu_0_sub5")
	public static WebElement evalutionsLink;
	@FindBy(id = "body_x_selQstEvalPeriod_x_txtselQstEvalPeriod_x_x")
	public static WebElement evaluationsPeriod;
	@FindBy(id = "ddlbody_x_selStatus_x")
	public static WebElement evalutionsStatus;
	@FindBy(id = "body_x_selContact_x_txtselContact_x_x")
	public static WebElement evalutionsEvaluator;
	@FindBy(id = "body_x_selQuestGuid_x_txtselQuestGuid_x_x")
	public static WebElement evalutionsQuestionaire;
	@FindBy(id = "ddlbody_x_selQuesttypeCode_7F7A9319_x")
	public static WebElement evalutionsType;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement evalutionsSearch;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement evalutionsReset;
}
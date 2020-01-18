package com.fanniemae.automation.CreateRequisitionElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommodityApprovalforSubmittedRequest {

	@FindBy(id = "aLoginMenu")
	public static WebElement loginMenu;
	@FindBy(xpath = "//a[contains(text(),'My open workflow tasks')]")
	public static WebElement myOpenWorkflowTasks;
	@FindBy(id = "ddlbody_x_ddlAction_x")
	public static WebElement status;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement statusButton;
	@FindBy(xpath = "//table[@class='PowerGridClass']/tbody/tr/td[14]/a")
	public static WebElement allLables;
	@FindBy(xpath = "//div//span[contains(text(),'Workflow')]")
	public static WebElement workflow;
	@FindBy(xpath = "//input[@name='proxyActionBar:x:valPUO_v7CATMANVAL_btn2']")
	public static WebElement approveButton;
	@FindBy(xpath = "//span[@class='fa fa-times']")
	public static WebElement saveButtonMarkC;
}
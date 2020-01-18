package com.fanniemae.automation.CreateRequisitionElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateRequisition {

	@FindBy(id = "link_ivmenu00_menu_4")
	public static WebElement procurement;
	@FindBy(xpath = "//a[@id='link_ivmenu00_menu_4_sub0_sub0']")
	public static WebElement createRequisition;
	@FindBy(name = "body:x:tabc:x:identity:x:prxidentity:x:txtLabel:x:x")
	public static WebElement requisitionName;
	@FindBy(name = "body:x:tabc:x:identity:x:prxidentity:x:selRequester:x:txtselRequester:x:x")
	public static WebElement headerInformationRequester;
	@FindBy(name = "body:x:tabc:x:identity:x:prxidentity:x:selBasketIdPrWatContactIdPrWat_3ACC567C:x:txtselBasketIdPrWatContactIdPrWat_3ACC567C:x:x")
	public static WebElement headerInformationPRWatchers;
	@FindBy(name = "body:x:tabc:x:identity:x:prxidentity:x:txtComment:x:x")
	public static WebElement justification;
	@FindBy(xpath = "//div[@role='menuitem']/div")
	public static WebElement costCentreList;
	@FindBy(xpath = "//input[@name='body:x:tabc:x:identity:x:prxidentity:x:prxFiles:x:UploadButtonControl_btn2']")
	public static WebElement clickDragToAddFiles;
	@FindBy(xpath = "//input[@id='proxyActionBar_x__cmdSave_btn2']")
	public static WebElement saveButton;
	@FindBy(xpath = "//h1[@class='maintitle']")
	public static WebElement basketNo;
}
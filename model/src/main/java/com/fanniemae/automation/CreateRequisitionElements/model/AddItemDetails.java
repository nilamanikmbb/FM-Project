package com.fanniemae.automation.CreateRequisitionElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddItemDetails {

	@FindBy(name = "body:x:tabc:x:identity:x:prxidentity:x:proxyItemControl:x:btnNewItem_btn2")
	public static WebElement addItem;
	@FindBy(xpath = "//input[@name='body:x:txtItemLabel:x:x']")
	public static WebElement itemDescription;
	@FindBy(xpath = "//input[@name='body:x:txtPrice:x:x']")
	public static WebElement itemPrice;
	@FindBy(xpath = "//input[@name='body:x:txtQuantity:x:x']")
	public static WebElement itemQuantity;
	@FindBy(id = "ddlbody_x_selUnit_x")
	public static WebElement unitOfMeasure;
	@FindBy(xpath = "//input[@name='body:x:selFamily:x:btnselFamily_btn2']")
	public static WebElement categoryButton;
	@FindBy(xpath = "//i[@id='body_x_grid_x__ctl4__ctl0']")
	public static WebElement labelIcon;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement saveAndCloseBtn;
	@FindBy(id = "proxyActionBar_x_btnRaz_btn2")
	public static WebElement resetBtn;
	@FindBy(id = "proxyActionBar_x__cmdNew_btn2")
	public static WebElement saveAndNewBtn;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement closeBtn;
}
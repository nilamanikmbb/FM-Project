package com.fanniemae.automation.procurement.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProcurementDelete {

	@FindBy(id = "body_x_txtLogin_x_x")
	public static WebElement usernameProcureOne;
	@FindBy(xpath = "body_x_txtLogin_x_x_yy")
	public static WebElement password;
}
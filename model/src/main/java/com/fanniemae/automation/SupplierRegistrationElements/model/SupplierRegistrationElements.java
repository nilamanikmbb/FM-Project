package com.fanniemae.automation.SupplierRegistrationElements.model;

import com.fanniemae.automation.SupplierRegistrationElements.model.supplierRegistrations;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SupplierRegistrationElements {

	public supplierRegistrations supplierRegistrations;

	public supplierRegistrations getSupplierRegistrations() {
		return supplierRegistrations;
	}

	public void setSupplierRegistrations(supplierRegistrations supplierRegistrations) {
		this.supplierRegistrations = supplierRegistrations;
	}

	public void init(WebDriver driver) {
		supplierRegistrations = PageFactory.initElements(driver, supplierRegistrations.class);
	}
}
package com.fanniemae.automation.EvalutionElements.model;

import com.fanniemae.automation.EvalutionElements.model.evalutionPage;
import com.fanniemae.automation.EvalutionElements.model.createSupplier;
import com.fanniemae.automation.EvalutionElements.model.browseContracts;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class EvalutionElements {

	public evalutionPage evalutionPage;
	public createSupplier createSupplier;
	public browseContracts browseContracts;

	public evalutionPage getEvalutionPage() {
		return evalutionPage;
	}

	public void setEvalutionPage(evalutionPage evalutionPage) {
		this.evalutionPage = evalutionPage;
	}

	public createSupplier getCreateSupplier() {
		return createSupplier;
	}

	public void setCreateSupplier(createSupplier createSupplier) {
		this.createSupplier = createSupplier;
	}

	public browseContracts getBrowseContracts() {
		return browseContracts;
	}

	public void setBrowseContracts(browseContracts browseContracts) {
		this.browseContracts = browseContracts;
	}

	public void init(WebDriver driver) {
		evalutionPage = PageFactory.initElements(driver, evalutionPage.class);
		createSupplier = PageFactory.initElements(driver, createSupplier.class);
		browseContracts = PageFactory.initElements(driver, browseContracts.class);
	}
}
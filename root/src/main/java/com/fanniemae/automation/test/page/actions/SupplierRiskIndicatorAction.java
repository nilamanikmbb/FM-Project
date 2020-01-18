package com.fanniemae.automation.test.page.actions;

import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.SupplierRiskIndicatorElements.model.SupplierRiskIndicatorElements;
import com.fanniemae.automation.SupplierRiskIndicatorElements.model.SupplierRiskIndicatorPage;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class SupplierRiskIndicatorAction extends AbstractTest{
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private SupplierRiskIndicatorElements SRIE;
	private WebDriver driver;
	
	public SupplierRiskIndicatorAction(SupplierRiskIndicatorElements SRIE, WebDriver driver) {
		super();
		this.SRIE = SRIE;
		this.driver = driver;
	}
	
	private int status=FanniemaeConstants.G;
	private int keywords=FanniemaeConstants.J;
	private int label=FanniemaeConstants.N;
	private int Description=FanniemaeConstants.O;
	private int riskFamily=FanniemaeConstants.AV;
	private int code=FanniemaeConstants.AW;
	private int order=FanniemaeConstants.AX;
	
	public void supplierRiskIndicatorPage(String serialNo,String sheetName) {
		WebElementOperations.click(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorLink);
		WebElementOperations.sendKeys(driver, SupplierRiskIndicatorPage.supplierDocumentKeywords, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, sheetName));
		WebElementOperations.dropDownByTextVisibility(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorRiskFamily, REPOSITORY.getCellDataOnTestCase(serialNo, riskFamily, sheetName));
		WebElementOperations.dropDownByTextVisibility(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorStatus, REPOSITORY.getCellDataOnTestCase(serialNo, status, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.click(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorSearch);
		WebElementOperations.park(2);
		WebElementOperations.click(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorReset);
		WebElementOperations.park(2);
		WebElementOperations.click(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorCreateIndicator);
		WebElementOperations.park(3);
		WebElementOperations.switchToFrame(driver, 0);
		WebElementOperations.sendKeys(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorCode, REPOSITORY.getCellDataOnTestCase(serialNo, code, sheetName));
		WebElementOperations.dropDownByTextVisibility(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorCreateRiskFamily, REPOSITORY.getCellDataOnTestCase(serialNo, riskFamily, sheetName));
		WebElementOperations.sendKeys(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorLabel, REPOSITORY.getCellDataOnTestCase(serialNo, label, sheetName));
		WebElementOperations.sendKeys(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorDescription, REPOSITORY.getCellDataOnTestCase(serialNo, Description, sheetName));
		WebElementOperations.sendKeys(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorOrder, REPOSITORY.getCellDataOnTestCase(serialNo, order, sheetName));
		WebElementOperations.click(driver, SupplierRiskIndicatorPage.supplierRiskIndicatorClose);
		WebElementOperations.switchToDefaultContentFrame(driver);
		WebElementOperations.park(3);
	}

}

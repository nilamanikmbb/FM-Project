package com.fanniemae.automation.test.page.actions;

import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.SupplierRegistrationElements.model.SupplierRegistrationElements;
import com.fanniemae.automation.SupplierRegistrationElements.model.supplierRegistrations;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class SupplierRegistrationAction extends AbstractTest{
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private SupplierRegistrationElements SRE;
	private WebDriver driver;
	
	public SupplierRegistrationAction(SupplierRegistrationElements SRE, WebDriver driver) {
		super();
		this.SRE = SRE;
		this.driver = driver;
	}
	
	private int status = FanniemaeConstants.G;
	private int comodity = FanniemaeConstants.H;
	private int alerts = FanniemaeConstants.I;
	private int keywords = FanniemaeConstants.J;
	
	public void supplierRegiPage(String serialNo,String sheetName) {
		WebElementOperations.click(driver, supplierRegistrations.supplierRegistrationsLink);
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, supplierRegistrations.supplierRegStatus,REPOSITORY.getCellDataOnTestCase(serialNo, status, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, supplierRegistrations.supplierRegCommodity,REPOSITORY.getCellDataOnTestCase(serialNo, comodity, sheetName));
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, supplierRegistrations.supplierRegAlerts,REPOSITORY.getCellDataOnTestCase(serialNo, alerts, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, supplierRegistrations.supplierRegKeywords,	REPOSITORY.getCellDataOnTestCase(serialNo, keywords, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.click(driver, supplierRegistrations.supplierRegSearch);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver, 15);
		WebElementOperations.click(driver, supplierRegistrations.supplierRegReset);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver, 15);
	}

}

package com.fanniemae.automation.test.page.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.SupplierPerfomanceElements.model.CreateNewCampaign;
import com.fanniemae.automation.SupplierPerfomanceElements.model.SupplierPerfomanceElements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class SupplierPerformancePageAction {
	private static final Logger LOG = Logger.getLogger(CreateMasterServiceAction.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private SupplierPerfomanceElements SPE;
	private WebDriver driver;
	
	public SupplierPerformancePageAction(SupplierPerfomanceElements SPE, WebDriver driver) {
		super();
		this.SPE = SPE;
		this.driver = driver;
	}
	
	private int manager=FanniemaeConstants.M;
	private int label=FanniemaeConstants.N;
	private int description=FanniemaeConstants.O;
	private int evaluatedPeriod=FanniemaeConstants.P;
	private int dateFrom=FanniemaeConstants.AL;
	private int endDate=FanniemaeConstants.AM;
	private int alerts=FanniemaeConstants.I;
	private int organisation=FanniemaeConstants.K;
	private int type=FanniemaeConstants.L;
	private int commodity=FanniemaeConstants.H;
	
	public void createcampaign(String serialNo,String sheetName) {
		WebElementOperations.sendKeys(driver, CreateNewCampaign.CreateNewCampaignLabel, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, label, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, CreateNewCampaign.CreateNewCampaignDescription, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, description, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, CreateNewCampaign.CreateNewCampaignType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, type, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, CreateNewCampaign.CreateNewCampaignOrganisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, organisation, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, CreateNewCampaign.CreateNewCampaignLabelReviewDate, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, dateFrom, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, CreateNewCampaign.CreateNewCampaignEvaluatedPeriod, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, evaluatedPeriod, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		CreateNewCampaign.CreateNewCampaignManager.clear();
		WebElementOperations.sendKeys(driver, CreateNewCampaign.CreateNewCampaignManager, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, manager, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, CreateNewCampaign.CreateNewCampaignComodity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, commodity, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, CreateNewCampaign.CreateNewCampaignEndDate, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, endDate, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.click(driver, CreateNewCampaign.CreateNewCampaignAutoOpenRadioBtn);
		WebElementOperations.park(2);
		WebElementOperations.click(driver, CreateNewCampaign.CreateNewCampaignAutoCloseRadioBtn);
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, CreateNewCampaign.CreateNewCampaignAlert, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, alerts, sheetName));
		WebElementOperations.park(2);
	}


}

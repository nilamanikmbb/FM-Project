package com.fanniemae.automation.test.page.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.ConfigureQuestionnairesElements.model.ConfigureQuestionnaires;
import com.fanniemae.automation.ConfigureQuestionnairesElements.model.ConfigureQuestionnairesElements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class ConfigureQuestionnairesPageAction {
	private static final Logger LOG = Logger.getLogger(CreateMasterServiceAction.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private ConfigureQuestionnairesElements CQE;
	private WebDriver driver = null;
	
	public ConfigureQuestionnairesPageAction(ConfigureQuestionnairesElements CQE, WebDriver driver) {
		super();
		this.CQE = CQE;
		this.driver = driver;
	}
	
	
	private int label = FanniemaeConstants.N;
	private int description = FanniemaeConstants.O;
	private int alerts = FanniemaeConstants.I;
	private int organisation = FanniemaeConstants.K;
	private int type = FanniemaeConstants.L;
	private int comodity = FanniemaeConstants.H;
	private int status = FanniemaeConstants.G;
	private int keywords = FanniemaeConstants.J;
	private int manager = FanniemaeConstants.M;
	
	public void configureQuestionnairesPage(String serialNo,String sheetName) {
		WebElementOperations.click(driver, ConfigureQuestionnaires.configureQuestionnairesLink);
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, ConfigureQuestionnaires.configureQuestionnairesKeywords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keywords, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, ConfigureQuestionnaires.configureQuestionnairesType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, type, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, ConfigureQuestionnaires.configureQuestionnairesOrganisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, organisation, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, ConfigureQuestionnaires.configureQuestionnairesCommodity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, comodity, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, ConfigureQuestionnaires.configureQuestionnairesStatus, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, status, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, ConfigureQuestionnaires.configureQuestionnairesManager, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, manager, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.click(driver, ConfigureQuestionnaires.configureQuestionnairesTempRadioBtn);
		WebElementOperations.park(2);
		WebElementOperations.click(driver, ConfigureQuestionnaires.configureQuestionnairesSearch);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver, 15);
		WebElementOperations.click(driver, ConfigureQuestionnaires.configureQuestionnairesReset);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver, 15);
		
	}
	
	public void createNewTemplate(String serialNo,String sheetName) {
		WebElementOperations.click(driver, ConfigureQuestionnaires.configureQuestionnairesCreateTemplate);
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, ConfigureQuestionnaires.createTemplateLabel, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, label, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, ConfigureQuestionnaires.createTemplateDescription, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, description, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, ConfigureQuestionnaires.createTemplateType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, type, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, ConfigureQuestionnaires.createTemplateOrganisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, organisation, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, ConfigureQuestionnaires.createTemplateCommodity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, comodity, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, ConfigureQuestionnaires.createTemplateAlert, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, alerts, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.click(driver, ConfigureQuestionnaires.createChoiceListRadiobtn);
	}

}

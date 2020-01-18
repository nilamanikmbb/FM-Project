package com.techouts.fanniemae.supplier;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.fanniemae.automation.ConfigureQuestionnairesElements.model.ConfigureQuestionnaires;
import com.fanniemae.automation.ConfigureQuestionnairesElements.model.ConfigureQuestionnairesElements;
import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.ConfigureQuestionnairesPageAction;
import com.fanniemae.automation.test.page.actions.CreateRequisitionAction;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class ConfigureQuestionnaire extends AbstractTest {
	private static final Logger LOG = Logger.getLogger(SupplierReg.class.getName());

	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.E;
	private int homePageTitle = FanniemaeConstants.F;

	protected static ConfigureQuestionnairesPageAction CONFIGUREQUESTIONNIRESPAGE_ACTION ;
	
	static {
		ConfigureQuestionnairesElements CQE=new ConfigureQuestionnairesElements();
		CQE.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		CONFIGUREQUESTIONNIRESPAGE_ACTION = new ConfigureQuestionnairesPageAction(CQE, DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	}
	
	String serialNo="2";
	String testCaseName="Configure Questionnaires";
	
	@Test
	public void configureQuestionnaires() {
		getFannieMaePage();
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, homePageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.click(getDriver(), ConfigureQuestionnaires.supplierLink);
		WebElementOperations.park(2);
		CONFIGUREQUESTIONNIRESPAGE_ACTION.configureQuestionnairesPage(serialNo, DEFAULT_SHEET_NAME);
		CONFIGUREQUESTIONNIRESPAGE_ACTION.createNewTemplate(serialNo, DEFAULT_SHEET_NAME);
		WebElementOperations.park(2);
		HOMEPAGE_ACTIONS.logout(testCaseName);
	}
	
	

}

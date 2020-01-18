package com.fanniemae.automation.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fanniemae.automation.CorporateSupplierElementsFactory.model.CorporateSupplierElementsFactory;
import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.RealEstateBrokerElements.model.RealEstateBrokerElements;
import com.fanniemae.automation.util.PathProvider;

public class CreateRealEstateBrokerAction {
	
	private static final Logger LOG = Logger.getLogger(CreateRealEstateBrokerAction.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private CorporateSupplierElementsFactory CSEF;
	private RealEstateBrokerElements REBE;
	private WebDriver driver=null;
	
	
	public CreateRealEstateBrokerAction(CorporateSupplierElementsFactory CSEF, WebDriver driver) {
		super();
		this.CSEF = CSEF;
		this.driver = driver;
	}
	
	public CreateRealEstateBrokerAction(RealEstateBrokerElements REBE, WebDriver driver) {
		super();
		this.REBE = REBE;
		this.driver = driver;
	}
	
	public void autoSuggestionHandle(WebElement inputBox, String inputText ){
		try {
			sendKeys(driver, inputBox,inputText);
			park(2);
			enterByRobot();
			//click(driver, elementFactory.getCostCentreList());
		} catch (Exception e) {
			LOG.error("Failed to select a value from AutoFill suggestion");
		}
	}

}

package com.fanniemae.automation.ConfigureQuestionnairesElements.model;

import com.fanniemae.automation.ConfigureQuestionnairesElements.model.ConfigureQuestionnaires;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ConfigureQuestionnairesElements {

	public ConfigureQuestionnaires configureQuestionnaires;

	public ConfigureQuestionnaires getConfigureQuestionnaires() {
		return configureQuestionnaires;
	}

	public void setConfigureQuestionnaires(ConfigureQuestionnaires configureQuestionnaires) {
		this.configureQuestionnaires = configureQuestionnaires;
	}

	public void init(WebDriver driver) {
		configureQuestionnaires = PageFactory.initElements(driver, ConfigureQuestionnaires.class);
	}
}
package com.fanniemae.automation.ElementsFactory.model;

import com.fanniemae.automation.ElementsFactory.model.Logout;
import com.fanniemae.automation.ElementsFactory.model.Login;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ElementsFactory {

	public Logout logout;
	public Login login;

	public Logout getLogout() {
		return logout;
	}

	public void setLogout(Logout logout) {
		this.logout = logout;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public void init(WebDriver driver) {
		logout = PageFactory.initElements(driver, Logout.class);
		login = PageFactory.initElements(driver, Login.class);
	}
}
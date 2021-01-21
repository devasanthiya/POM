package org_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpojo extends Fbbase {
	//1.create the constructor
		public Fbpojo() {
			PageFactory.initElements(driver, this);
		}
		
		// login user
		@FindBy(id = "email")	
		private WebElement txtuser;

		// login pass
		@FindBy(id = "pass")
		private WebElement txtpass;
		
		//login click
		
		@FindBy(xpath="//button[@type=\"submit\"]")
		private WebElement login;
	


	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLogin() {
		return login;
	}

	}
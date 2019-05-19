package com.autoBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoBot.pages.LoginPage;
import com.autoBot.testng.api.base.Annotations;

public class TC001_LoginAndLogout extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_LoginAndLogout";
		testcaseDec = "Login into leaftaps";
		author = "koushik";
		category = "smoke";
		excelFileName = "TC002";
	} 

	@Test (dataProvider="fetchData") 
	public static void loginAndLogout(String uName, String pwd, String CName, String FName, String LName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.ClickCRMsFaLink()
		.LeadsClick()
		.CreateLeadShrctClick()
		.EnteringCompanyName(CName)
		.EnteringFirstName(FName)
		.EnteringLastName(LName)
		.CreateLeadSubmit()
		.FirstNameComparison(FName);
		
		
	}
	
}







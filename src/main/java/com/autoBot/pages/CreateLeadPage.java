package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations {
	
	public CreateLeadPage EnteringCompanyName(String data) {
	//	driver.findElementById("createLeadForm_companyName").sendKeys(data);
		WebElement EnteringCompanyName = locateElement("id", "createLeadForm_companyName");
		clearAndType(EnteringCompanyName, data);
		return this;
		
	}
	
	public CreateLeadPage EnteringFirstName(String data) {
	//	WebElement Name = driver.findElementById("createLeadForm_firstName");
		WebElement EnteringFirstName = locateElement("id", "createLeadForm_firstName");
		clearAndType(EnteringFirstName, data);
		//String FName = "Arunkumar";
		//Name.sendKeys(data);
		return this;
	}
	
	public CreateLeadPage EnteringLastName(String data) {
	//	driver.findElementById("createLeadForm_lastName").sendKeys(data);
		WebElement EnteringLastName = locateElement("id", "createLeadForm_lastName");
		clearAndType(EnteringLastName, data);
		return this;
	}
	
	public ViewLeadPage CreateLeadSubmit() {
		
	//	driver.findElementByXPath("//input[@class='smallSubmit']").click();
		WebElement CreateLeadSubmit = locateElement("xpath", "//input[@class='smallSubmit']");
		click(CreateLeadSubmit);
		return new ViewLeadPage();
		
	}
	
	
	
	

}

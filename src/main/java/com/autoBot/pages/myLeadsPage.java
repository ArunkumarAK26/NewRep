package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class myLeadsPage extends Annotations {
	
	public CreateLeadPage CreateLeadShrctClick() {
		//driver.findElementByLinkText("Create Lead").click();
		WebElement Crter = locateElement("link", "Create Lead");
		click(Crter);
		return new CreateLeadPage();
			}
	
	/*public FindLeadsPage ClickFindLeadsShrtCutBtn() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
	}*/
	
	
	
	
	
	

}

package com.autoBot.pages;
 import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class myHomePage extends Annotations {
	
	public myLeadsPage LeadsClick() {
		//driver.findElementByLinkText("Leads").click();
		WebElement LeadsShrtCutButtonClick = locateElement("link", "Leads");
		click(LeadsShrtCutButtonClick);
		return new myLeadsPage();
		
	}
	
	
	
	
	
	

}

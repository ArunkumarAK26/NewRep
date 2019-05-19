package com.autoBot.pages;

import org.openqa.selenium.WebElement;

import com.autoBot.testng.api.base.Annotations;

public class ViewLeadPage extends Annotations {

	public ViewLeadPage FirstNameComparison(String data) {
		//String FName = "Arunkumar";
		WebElement FirstNameCompare = locateElement("id", "viewLead_firstName_sp");
		String ActualText = getElementText(FirstNameCompare);
		System.out.println(ActualText);
		
		if(ActualText.equals(data)) {
			System.out.println("The Enterted First Name is correct");
		}
		else 
			System.out.println("The name First Name is incorrect");
		return this;
		/*String FirstName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(FirstName);
		if(FirstName.equals(data)) {
			System.out.println("The Enterted First Name is correct");
		}
		else 
			System.out.println("The name First Name is incorrect");
*/		
	}
	
	/*public EditLeadPage ClickEditBtn() {
		driver.findElementByLinkText("Edit").click();
		return new EditLeadPage();
	}
	
	public ViewLeadPage EditedNameComparison(String data) {
		String updatedName = driver.findElementById("viewLead_firstName_sp").getText();
	    System.out.println(updatedName);
	    String EditingName1 = data;
	    if(EditingName1.equals(updatedName)) {
	    	System.out.println("Both Entered and Updated Name is same");
	    		    }
	    else
	      	System.out.println("The Names are different");
	    return this;
	    	}
	
	public myLeadsPage ClickDeleteBtn() {
		driver.findElementByLinkText("Delete").click();
		return new myLeadsPage();
	}
	
	public void DuplicateBtnClick() {
		driver.findElementByLinkText("Duplicate Lead").click();
	
	}*/
}







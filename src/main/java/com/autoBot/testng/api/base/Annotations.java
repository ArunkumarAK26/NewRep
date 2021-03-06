package com.autoBot.testng.api.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.autoBot.selenium.api.base.SeleniumBase;

import utils.DataLibrary;

public class Annotations extends SeleniumBase {
	
	@DataProvider(name = "fetchData", indices = {1})
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  
  @BeforeMethod
  public void beforeMethod() {
	startApp("chrome", "http://leaftaps.com/opentaps");
	node = test.createNode(testcaseName);
	
  }

  @AfterMethod
  public void afterMethod() {
	  close();
  }

}

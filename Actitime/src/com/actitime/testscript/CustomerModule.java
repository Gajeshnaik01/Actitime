package com.actitime.testscript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void createCustomer() throws InterruptedException, IOException {
		Reporter.log("create Customer", true);
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.setclickTask();
		FileLib f=new FileLib();
	String custName=f.getExcelData("Sheet1", 1, 2);
	String custDesc=f.getExcelData("Sheet1", 1, 3);
	
		TaskList t=new TaskList(driver);
		t.getAddNew().click();
		t.getNewCust().click();
		t.getCustName().sendKeys(custName);
		t.getCustDesc().sendKeys(custDesc);
		t.getSelectCust().click();
		t.getOurCompany().click();
		t.getCreateCust().click();
		Thread.sleep(5000);
		f.SetExcelData("Sheet1", 1, 4, "Pass");
	}

}

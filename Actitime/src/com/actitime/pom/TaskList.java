package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;

	@FindBy(xpath="//div[contains(text(),'+ New Customer')]")
	private WebElement newCust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement CustName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDesc;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCust;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCust;
	
	@FindBy(xpath="(//div[@class='editButton'])[last()]/../div[1]")
	private WebElement text;
	
	@FindBy(id="logoutLink")
	private WebElement lobt;
	
	public TaskList(WebDriver driver){
		PageFactory.initElements(driver, this);	
	}
	
	
	public WebElement getAddNew() {
		return addNew;
	}


	public WebElement getNewCust() {
		return newCust;
	}


	public WebElement getCustName() {
		return CustName;
	}


	public WebElement getCustDesc() {
		return custDesc;
	}


	public WebElement getSelectCust() {
		return selectCust;
	}


	public WebElement getOurCompany() {
		return ourCompany;
	}


	public WebElement getCreateCust() {
		return createCust;
	}


	public WebElement getText() {
		return text;
	}


	public WebElement getLobt() {
		return lobt;
	}



}

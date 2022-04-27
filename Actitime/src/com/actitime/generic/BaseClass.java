package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskList;

public class BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;

	@BeforeTest
	public void openBrowser() throws IOException {
		Reporter.log("Open Browser", true);
		driver=new ChromeDriver();
		FileLib f=new FileLib();
		String url=f.getpropertyData("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void closeBrowser() {
		Reporter.log("Close Browser", true);
		driver.close();
	}

	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login", true);
		FileLib f=new FileLib();
		String un = f.getpropertyData("username");
		String pwd = f.getpropertyData("password");
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pwd);
		
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout", true);
		TaskList t=new TaskList(driver);
		t.getLobt().click();
	}

}

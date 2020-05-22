package tests;


import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePack.BaseClass;
import pages.GooglePage;
import pages.SuperTechHomePage;

public class SuperTechTest extends BaseClass{
	

	@Test(priority=0)
	public void superTech() throws InterruptedException {
		test=report.createTest("SuperTect");
		SuperTechHomePage suhp=PageFactory.initElements(driver, SuperTechHomePage.class);
		driver.get(prop.getProperty("file:///E:/WebSite/SuperTech.html"));
		suhp.mouseHover();
		suhp.clickOnGoogle();
		ArrayList<String>tab1= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		
		Thread.sleep(4000);
	}
	@Test(priority=1)
	public void googleTest() throws InterruptedException {
		test=report.createTest("SuperTect");
		GooglePage gop=PageFactory.initElements(driver, GooglePage.class);
		gop.enterInsearchBox("Bangladesh");
		Thread.sleep(4000);
		ArrayList<String>tab0= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab0.get(0));
		
		Thread.sleep(4000);		
	}

	@Test(priority=2)
	public void iframeTest() throws InterruptedException {
		test=report.createTest("SuperTech");
		SuperTechHomePage suhp=PageFactory.initElements(driver, SuperTechHomePage.class);
		
		suhp.enterOnIframeFname("Ataur");
		Thread.sleep(4000);
	}
	@Test(priority=2)
	public void enterFirstName() throws InterruptedException {
		test=report.createTest("SuperTech");
		SuperTechHomePage suhp=PageFactory.initElements(driver, SuperTechHomePage.class);
		
		suhp.enterOnIframeFname("Ataur");
		Thread.sleep(4000);
	}
	@Test(priority=2)
	public void clickOndownload() throws InterruptedException {
		test=report.createTest("SuperTech");
		SuperTechHomePage suhp=PageFactory.initElements(driver, SuperTechHomePage.class);
		
		suhp.clickOnDownload();
		Thread.sleep(4000);
	}
}

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
		test=report.createTest("SuperTech");
		SuperTechHomePage suhp=PageFactory.initElements(driver, SuperTechHomePage.class);
		driver.get("file:///E:/WebSite/SuperTech.html");
		suhp.mouseHover();
		suhp.clickOnGoogle();
		ArrayList<String>tab1= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		
		Thread.sleep(4000);
	}
	@Test(priority=1)
	public void googleTest() throws InterruptedException {
		test=report.createTest("SuperTech");
		SuperTechHomePage suhp=PageFactory.initElements(driver, SuperTechHomePage.class);
		suhp.enterInsearchBox("Bangladesh");
		Thread.sleep(1000);
			
	}

	@Test(priority=2)
	public void iframeTest() throws InterruptedException {
		
		test=report.createTest("SuperTech");
		SuperTechHomePage suhp=PageFactory.initElements(driver, SuperTechHomePage.class);
		
		ArrayList<String>tab0= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab0.get(0));
		
		
		
		suhp.enterOnIframeFname("Ataur");
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void clickOndownload() throws InterruptedException {
		test=report.createTest("SuperTech");
		SuperTechHomePage suhp=PageFactory.initElements(driver, SuperTechHomePage.class);
		
		suhp.clickOnDownload();
		Thread.sleep(1000);
	}
}

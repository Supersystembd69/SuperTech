package tests;

import org.openqa.selenium.support.PageFactory;

import basePack.BaseClass;
import pages.GooglePage;

public class GooglePageTest extends BaseClass{
	
	
	//@Test
	public void googleTest() {
		GooglePage gop=PageFactory.initElements(driver, GooglePage.class);
		gop.enterInsearchBox("Bangladesh");
		
	}

}

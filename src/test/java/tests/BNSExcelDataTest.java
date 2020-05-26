package tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack.BaseClass;
import datahelper.ExcelFileReader;
import pages.BNSPage;




public class BNSExcelDataTest extends BaseClass{
	
	static String filePath=System.getProperty("user.dir")+"//src//test//resources//TestData//BNSData.xlsx";
	static String sheetName="Data1";

@Test(dataProvider = "bnsdata")
public void bnspage(String FN, String LN, String EM, String PW, String Pho, 
		String MN, String DY, String YR, String Gender, String Msn) throws InterruptedException {

	test=report.createTest("BNS page Test");
	BNSPage bnsp=PageFactory.initElements(driver, BNSPage.class);

	driver.get(prop.getProperty("url"));
	bnsp.enterFirstName(FN);
	bnsp.enterLastName(LN);
	bnsp.enterEmail(EM);
	bnsp.enterPassword(PW);
	bnsp.enterPhone(Pho);

	bnsp.selectMonth(MN);
	bnsp.selectDay(DY);
	bnsp.selectYear(YR);
	Thread.sleep(2000);
	if(Gender.equalsIgnoreCase("Male")) {
		bnsp.clickMale();
	}
	else {
		bnsp.clickFemale();
	}
	Thread.sleep(2000);

	bnsp.clickSubmit();
	


	bnsp.verifyMessage(Msn);
	Thread.sleep(2000);
}
@DataProvider(name="bnsdata")
public Object[][] getData() throws IOException{
return ExcelFileReader.dataReading(filePath, sheetName);


}




}

package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import basePack.BaseClass;





public class SuperTechHomePage extends BaseClass {
	
	@FindBy(linkText="Social Media")
		
	WebElement sm;
	public void mouseHover() {
		Actions act=new Actions(driver);
		act.moveToElement(sm).build().perform();
		
	}
	@FindBy(linkText="Google")
	WebElement google;
	public void clickOnGoogle() {
		google.click();
	}
	
	@FindBy(name="q")
	WebElement searchbox;
	public void enterInsearchBox(String searchitem) {
		searchbox.sendKeys(searchitem);
	}
	@FindBy(xpath="/html/body/center/form/table/tbody/tr[1]/td[2]/input")
	WebElement iframeFName;
	public void enterOnIframeFname(String ifn) {
		driver.switchTo().frame("LoginForm");
		iframeFName.sendKeys(ifn);
	}
	@FindBy(linkText="DOWNLOAD")
	WebElement iframedownload;
	public void clickOnDownload() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("Selenium");
		iframedownload.click();;
	}
}

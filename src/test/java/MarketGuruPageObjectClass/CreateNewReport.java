package MarketGuruPageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewReport extends Login
{
WebDriver driver;
public CreateNewReport(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//div[normalize-space()='Create New Report']")
WebElement createnewreport;
@FindBy(xpath="//div[normalize-space()='Market Research reports']")
WebElement marketresearchreport;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/section/div/div/div/div/div[2]/div/div[2]/button")
WebElement nextstep;
@FindBy(xpath="//div[normalize-space()='Health']")
WebElement health;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/section/div/div/div/div/div[2]/div/div[2]/button[2]")
WebElement next;
@FindBy(xpath="//div[normalize-space()='Business Manager']")
WebElement Businessmanager;
@FindBy(xpath="//div[normalize-space()='Next Step']")
WebElement finalstep;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/section/div/div/div/div/div[2]/div/div[1]/div[2]/div[1]/button/img")
WebElement template;
@FindBy(xpath="//div[normalize-space()='Next Step']")
WebElement templatenext;
@FindBy(xpath="//input[@name='report']")
WebElement reportname;
@FindBy(xpath="//input[@name='prompt']")
WebElement propmpt;
@FindBy(xpath="//button[normalize-space()='Finish']")
WebElement nextbuttonpropmpt;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/section/div[1]/button")
WebElement save;
@FindBy(xpath="//p[normalize-space()='Return to Dashboard']")
WebElement returnback;
public void cnr()
{
	createnewreport.click();
}
public void msr()
{
	marketresearchreport.click();
}
public void nextstepinitial()
{
	nextstep.click();
}
public void healthoption()
{
	health.click();
}
public void nextstepmiddle()
{
	next.click();
}
public void bm()
{
	Businessmanager.click();
}
public void nextstepthird()
{
	finalstep.click();
}
public void Annualreport()
{
	template.click();
}
public void nextstepfourth()
{
	templatenext.click();
}
public void rn(String reponame)
{
	reportname.sendKeys(reponame);
}
public void propmpts()
{
	propmpt.sendKeys("Generate the annual report for the following selction");
}
public void finalnext()
{
	nextbuttonpropmpt.click();
}
public void savebutton()
{
save.click();
}
public void returnb()
{
returnback.click();
}
}

package MarketGuruPageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment extends Login
{
WebDriver driver;
public Payment(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//b[normalize-space()='Buy Now']")
WebElement plan;
@FindBy(xpath="//input[@name='email']")
WebElement emailstripe;
@FindBy(xpath="//input[@name='cardNumber']")
WebElement cardinfo;
@FindBy(xpath="//input[@name='cardExpiry']")
WebElement exp;
@FindBy(xpath="//input[@name='cardCvc']")
WebElement cvc;
@FindBy(xpath="//input[@name='billingName']")
WebElement bname;
@FindBy(xpath="//input[@name='billingAddressLine1']")
WebElement billadd1;
@FindBy(xpath="//input[@name='billingAddressLine2']")
WebElement billadd2;
@FindBy(xpath="//input[@name='billingLocality']")
WebElement billloca;
@FindBy(xpath="//input[@name='billingPostalCode']")
WebElement code;
@FindBy(xpath="//*[@id=\"billingAdministrativeArea\"]")
WebElement state;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/main/div/div[2]/form/div[1]/div/div/div[3]/div/div[2]/button/div[3]")
WebElement submit;
public void plans()
{
plan.click();
}
public void es()
{
	emailstripe.sendKeys("ratant@yopmail.com");
}
public void cardinfos()
{
	cardinfo.sendKeys("4242424242424242");
}
public void expd()
{
	exp.sendKeys("12/30");
}
public void cvcs()
{
	cvc.sendKeys("890");
}
public void btname()
{
	bname.sendKeys("john");
}
public void ba1()
{
	billadd1.sendKeys("14 avenue gaur city");
}
public void billadd2()
{
	billadd2.sendKeys("noida");
}
public void city()
{
	billloca.sendKeys("patna");
}
public void zip()
{
	code.sendKeys("201009");
}
public void states()
{
	state.sendKeys("Bihar");
}
public void submitclick()
{
	submit.click();
}
}

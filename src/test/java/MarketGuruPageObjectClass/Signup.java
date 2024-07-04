package MarketGuruPageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup extends BasePage
{
WebDriver driver;
public Signup(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//a[normalize-space()='Sign Up']")
WebElement signup;
@FindBy(xpath="//input[@name='firstname']")
WebElement firstname;
@FindBy(xpath="//input[@name='lastname']")
WebElement lastname;
@FindBy(xpath="//input[@name='email']")
WebElement email;
@FindBy(xpath="//input[@name='password']")
WebElement createpassword;
@FindBy(xpath="//input[@name='confirm_password']")
WebElement Confirmpassword;
@FindBy(xpath="//input[@name='company_name']")
WebElement companyname;
@FindBy(xpath="//input[@name='designation_name']")
WebElement designation;
@FindBy(xpath="//button[normalize-space()='Create Account']")
WebElement continueb;
@FindBy(xpath="//input[@name='verification_code']")
WebElement code;

public void signupbutton()
{
	signup.click();
}
public void fname(String first)
{
	firstname.sendKeys(first);
}
public void lname(String last)
{
	lastname.sendKeys(last);
}
public void efield(String emailfield)
{
email.sendKeys( emailfield);
}
public void createp(String crp)
{
	createpassword.sendKeys(crp);
}
public void confirmp(String cnp)
{
	Confirmpassword.sendKeys(cnp);
}
public void cname(String company)
{
	companyname.sendKeys(company);
}
public void designationname(String dname)
{
	designation.sendKeys(dname);
}
public void continuebutton()
{
continueb.click();
}
public void entercode()
{
code.sendKeys("");
}
}

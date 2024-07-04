package MarketGuruPageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSetting extends Login
{
WebDriver driver;
public AccountSetting(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//button[normalize-space()='Accounts Settings']")
WebElement Accountsetting;
@FindBy(xpath="//input[@name='first_name']")
WebElement Fname;
@FindBy(xpath="//input[@name='last_name']")
WebElement Lname;
@FindBy(xpath="//input[@name='email']")
WebElement efield;
@FindBy(xpath="//textarea[@name='message']")
WebElement message;
@FindBy(xpath="//div[normalize-space()='Send Message']")
WebElement sm;
public void As()
{
Accountsetting.sendKeys("Contact Us");
}
public void first(String firstname)
{
Fname.sendKeys(firstname);
}
public void last(String lastname)
{
Lname.sendKeys(lastname);
}
public void email(String emailfield)
{
efield.sendKeys(emailfield);
}
public void messagefield()
{
message.sendKeys("I want to deactivate my plan");
}
public void send()
{
sm.click();
}
}


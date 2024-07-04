package MarketGuruPageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgetpassword extends BasePage
{
WebDriver driver;
public Forgetpassword(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//a[normalize-space()='Log In']")
WebElement login;
@FindBy(xpath="//a[normalize-space()='Forgot password']")
WebElement forgetpassword;
@FindBy(xpath="//input[@name='Email']")
WebElement emailfield;
@FindBy(xpath="//button[normalize-space()='Send link']")
WebElement sendlink;
public void loginb()
{
login.click();
}
public void fpwd()
{
	forgetpassword.click();
}
public void efield()
{
	emailfield.sendKeys("ceref@yopmail.com");
}
public void send()
{
	sendlink.click();
}
}

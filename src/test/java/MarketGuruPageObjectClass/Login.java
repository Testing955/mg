package MarketGuruPageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage
{
WebDriver driver;
public Login(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//a[normalize-space()='Log In']")
WebElement loginbutton;
@FindBy(xpath="//input[@name='email']")
WebElement emailfields;
@FindBy(xpath="//input[@name='password']")
WebElement password;
@FindBy(xpath="//input[@name='remember']")
WebElement check;
@FindBy(xpath="//button[normalize-space()='Sign in']")
WebElement signinbutton;
public void login()
{
loginbutton.click();
}
public void email()
{
emailfields.sendKeys("kuhcn@yopmail.com");
}
public void passwords()
{
password.sendKeys("Qwerty@1");
}
public void remember()
{
check.click();
}
public void sigin()
{
	signinbutton.click();
}
}

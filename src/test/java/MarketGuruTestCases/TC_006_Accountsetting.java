package MarketGuruTestCases;

import org.testng.annotations.Test;

import MarketGuruPageObjectClass.AccountSetting;
import MarketGuruTestBase.TestBase;

public class TC_006_Accountsetting extends TestBase
{
@Test(groups= {"master","regression","sanity"})
public void Accountsetting_setup()
{
AccountSetting ast = new AccountSetting(driver);
ast.login();
ast.email();
ast.passwords();
ast.sigin();
ast.As();
ast.first(randomString());
ast.last(randomString());
ast.email(randomString()+"@yopmail.com");
ast.messagefield();
ast.send();
}
}

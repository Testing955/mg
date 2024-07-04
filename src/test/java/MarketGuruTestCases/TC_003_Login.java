package MarketGuruTestCases;

import org.testng.annotations.Test;

import MarketGuruPageObjectClass.Login;
import MarketGuruTestBase.TestBase;

public class TC_003_Login extends TestBase
{
@Test(groups={"master","sanity"})
public void log_setup()
{
Login lg = new Login(driver);
lg.login();
lg.email();
lg.passwords();
lg.remember();
lg.sigin();
}
}

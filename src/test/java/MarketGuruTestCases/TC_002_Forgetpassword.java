package MarketGuruTestCases;

import org.testng.annotations.Test;

import MarketGuruPageObjectClass.Forgetpassword;
import MarketGuruTestBase.TestBase;

public class TC_002_Forgetpassword extends TestBase
{
@Test(groups={"master","sanity"})
public void setup_FP() throws InterruptedException
{
Forgetpassword fp = new Forgetpassword(driver);
fp.loginb();
fp.fpwd();
fp.efield();
Thread.sleep(10000);
fp.send();
}
}

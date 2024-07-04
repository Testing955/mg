package MarketGuruTestCases;

import org.testng.annotations.Test;

import MarketGuruPageObjectClass.Payment;
import MarketGuruTestBase.TestBase;

public class TC_004_Payment extends TestBase
{
@Test(groups= {"master","sanity"})
public void payments_setup()
{
Payment pt = new Payment(driver);
pt.login();
pt.email();
pt.passwords();
pt.remember();
pt.sigin();
pt.plans();
pt.es();
pt.cardinfos();
pt.expd();
pt.cvcs();
pt.btname();
pt.ba1();
pt.billadd2();
pt.city();
pt.zip();
pt.states();
pt.submitclick();
}
}

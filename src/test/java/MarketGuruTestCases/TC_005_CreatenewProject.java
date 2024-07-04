package MarketGuruTestCases;

import org.testng.annotations.Test;

import MarketGuruPageObjectClass.CreateNewReport;
import MarketGuruTestBase.TestBase;

public class TC_005_CreatenewProject extends TestBase
{
@Test(groups= {"sanity","master","regression"})
public void set_newproject() throws InterruptedException
{
CreateNewReport cnrs = new CreateNewReport(driver);
cnrs.login();
cnrs.email();
cnrs.passwords();
cnrs.sigin();
cnrs.cnr();
cnrs.msr();
cnrs.nextstepinitial();
cnrs.healthoption();
cnrs.nextstepmiddle();
cnrs.bm();
cnrs.nextstepthird();
cnrs.Annualreport();
cnrs.nextstepfourth();
cnrs.rn(randomString());
Thread.sleep(5000);
cnrs.propmpts();
cnrs.finalnext();
Thread.sleep(20000);
cnrs.savebutton();
cnrs.returnb();
}
}

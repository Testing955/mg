package MarketGuruTestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MarketGuruPageObjectClass.Signup;
import MarketGuruTestBase.TestBase;

public class TC_001_Signup extends TestBase
{
@Test(groups={"master","sanity","regression"})
public void signup_setup()
{
try
{
Signup sp = new Signup(driver);
sp.signupbutton();
sp.fname(randomString());
sp.lname(randomString());
sp.efield(randomString()+"@yopmail.com");
String password = randomAlphaNumeric();
Thread.sleep(5000);
sp.createp(password);
sp.confirmp(password);
sp.cname(randomString());
sp.designationname(randomString());
sp.continuebutton();
Thread.sleep(15000);
sp.entercode();
}
catch(Exception e)
{
Assert.fail();
}
}
}

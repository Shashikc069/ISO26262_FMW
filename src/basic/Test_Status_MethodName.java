package basic;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test_Status_MethodName {
	
	@Test
	public void TestA() {
		Reporter.log("TestA",true);
	}
	
	@Test
	public void TestB()
	{
		Reporter.log("TestB",true);
		Assert.fail();
	}
    
	@AfterMethod
	public void postCondition(ITestResult res)
	{
		int Status = res.getStatus();
		Reporter.log("Status is "+Status,true);
		
		String MN = res.getMethod().getMethodName();
		Reporter.log(MN,true);
	}
}

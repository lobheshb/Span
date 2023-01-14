package ListenersClass;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener
{
     public void OnTestStart(ITestResult result)
     {
    	 System.out.println(result.getName()+ "Test Started ");
     }
     
     public void OnTestSuccess(ITestResult result)
     {
    	 System.out.println(result.getName()+ "test pass");
     }
     
     public void OnTestFailure(ITestResult result)
     {
    	 System.out.println(result.getName()+ " test failure");
     }
     
     public void OnTestSkipper(ITestResult result)
     {
    	 System.out.println(result.getName()+ "test skipped");
     }
     
}

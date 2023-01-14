package TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClass.BaseClass;
import POMClass.Form7004;
import POMClass.HomePage;
import POMClass.LoginPage;
import POMClass.LogoutUserPage;
import UtilClass.UtilClass;

public class TestClass extends UtilClass
{
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	Form7004 f7;
	LogoutUserPage lg;
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	
	
	
	
	
	
	@BeforeClass
   public void openBrowser()
   {
	   driver=BaseClass.OpenBrowser();
	   
	      htmlReporter = BaseClass.gethtmlReporter();
		  report = BaseClass.getExtentReports();
		  test = BaseClass.getTestForReproter("TestClass");
	   
	   
   }
	
	@BeforeMethod
    public void loginToApp()
	   {
		 lp=new LoginPage(driver);
		 hp=new HomePage(driver);
		 f7=new Form7004(driver);
		 lg=new LogoutUserPage(driver);
		 
	   }
	
	
	    @Test
	   public void loginpage()
	   {
		   lp.Username();
		   lp.Password();
		   lp.SignIn();
	   }
	
	    @Test
		   public void loginpage1() throws InterruptedException
		   {
			   hp.formhistory();
			   hp.ClickOnform7004();
			   hp.CreateBusinessExtension();
			   
			   f7.BusinessName();
			   f7.EIN();
			   f7.ConfirmEIN();
			   f7.CheckBox();
			   
			   f7.AddressLine();
			   f7.City();
			   f7.State();
			   f7.Country();
			   f7.PostalCode();
			   f7.Name();
			   f7.Role();
			   f7.Phone();
			   Thread.sleep(3000);
			   lg.userprofile();
			   lg.logOut();
			   lg.rating1();
			   lg.rating2();
			   lg.textarea1();
			   lg.textarea2();
			   lg.Radio1();
			   lg.textarea3();
			   lg.LogOff();
			   
			   driver.quit();
		   }
	
	    @Test
		   public void Form7004 ()
		   {
			   
		   }
	    
	    
	    
	    
	    
	    
//	    
//	        @AfterMethod
//		   public void AfterMethod(ITestResult result)
//		   {
//	        	if(result.getStatus() == ITestResult.SUCCESS){
//					TestNG.log(Status.PASS, "Test is passed " + result.getName());
//				}
//				else{
//					String path = hp.getScreenShot(driver, result.getName());
//					test.log(Status.FAIL, "Test is failed " + result.getName(), 
//					MediaEntityBuilder.createScreenCaptureFromPath(path).build());
//				}  		
//		   }
	        
	        @AfterClass
			   public void closedBrowserWithNewChanges()
			   {
	        	  //driver.quit();
			   }    
	        
	        
	        
	            
	
	
	
	
	
	
	
	
	
	
}

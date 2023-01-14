package POMClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClass.UtilClass;

public class LogoutUserPage extends UtilClass
{

	WebDriver driver;
	  
	  @FindBy(xpath="//a[@class='userName']")
	  private WebElement UserProfile;
	  
	  @FindBy(xpath="//a[@class='d-flex align-items-center justify-content-between']")
	  private WebElement logOut;
	  
	  @FindBy(xpath="(//span[@class='ratingicon glyphicon glyphicon-star'])[1]")
	  private WebElement rating1;
	  
	  @FindBy(xpath="(//span[@class='ratingicon glyphicon glyphicon-star'])[7]")
	  private WebElement rating2;
	  
	  @FindBy(xpath="//textarea[@id='FeaturesLiked']")
	  private WebElement textarea1;
	  
	  @FindBy(xpath="//textarea[@id='FeaturesNeedImprovement']")
	  private WebElement textarea2;
	  
	  @FindBy(xpath="(//label[@class='css-radiolabel'])[2]")
	  private WebElement Radio1;
	  
	  @FindBy(xpath="//textarea[@id='Comments']")
	  private WebElement textarea3;
	  
	  @FindBy(xpath="//input[@id='LogOffAndSubmit']")
	  private WebElement LogOff;
	  
	  public LogoutUserPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  driver=this.driver;
	  }
	  
	  public void userprofile()
	  {
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
//		  js.executeScript("window.scrollBy(100,1000)");
//		  
	//	   js.executeScript("arguments[0].scrollIntoView(true)", UserProfile);
	//	  expliciteWait1(driver,UserProfile);
		  UserProfile.click();
		  
	  }
	  
	  public void logOut()
	  {
		  logOut.click();
	  }
	  
	  public void rating1()
	  {
		  rating1.click();
	  }
	  
	  public void rating2()
	  {
		  rating2.click();
	  }
	  
	  public void textarea1()
	  {
		  textarea1.sendKeys("abccccs");
	  }
	  
	  public void textarea2()
	  {
		  textarea2.sendKeys("viksad");
	  }
	  
	  public void Radio1()
	  {
		  Radio1.click();
	  }
	  
	  public void textarea3()
	  {
		  textarea3.sendKeys("sagarsss");
	  }
	  
	  public void LogOff()
	  {
		  LogOff.click();
	  }
	  
	  
	  
	  
}

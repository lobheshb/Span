package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClass.UtilClass;

public class LoginPage extends UtilClass
{
  WebDriver driver;
	
  @FindBy(xpath="//input[@id='LoginName']")
  private WebElement username;
  
  @FindBy(xpath="//input[@id='OriginalPassword']")
  private WebElement password;
  
  @FindBy(xpath="//button[@id='btnsignin']")
  private WebElement signin;
  
  
  public LoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  driver=this.driver;
  }
  
  public void Username()
  {
	//  ExpliciteWait(driver,username);
	  username.sendKeys("barnettcandy20@gmail.com");
  }
  
  public void Password()
  {
	 // ExpliciteWait(driver,password);
	  password.sendKeys("Admin@123");
	  
  }
  
  public void SignIn()
  {
	//  ExpliciteWait(driver,signin);
	 signin.click();
  }
  
  
}

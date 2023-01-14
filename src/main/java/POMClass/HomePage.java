package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
  WebDriver driver;
  
  @FindBy(xpath="//a[@id='linkglobalSettings']")
  private WebElement formHistory;
  
  @FindBy(xpath="//a[@onclick='BusinessExtension();']")
  private WebElement form7004;
  
  @FindBy(xpath="//a[@class='create_strokebtn create_orangestrokebtn']")
  private WebElement CreateBusinessExtension;
  
  public HomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  driver=this.driver;
  }
  
  public void formhistory()
  {
	  formHistory.click();
  }
  
  public void ClickOnform7004()
  {
	  form7004.click();
  }
  
  public void CreateBusinessExtension()
  {
	  CreateBusinessExtension.click();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

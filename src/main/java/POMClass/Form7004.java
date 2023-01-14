package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UtilClass.UtilClass;

public class Form7004 extends UtilClass
{
	WebDriver driver;
	  
	  @FindBy(xpath="//input[@id='BusinessName']")
	  private WebElement BusinessName;
	  
	  @FindBy(xpath="//input[@id='EIN']")
	  private WebElement EIN;
	  
	  @FindBy(xpath="//input[@id='ConfirmEIN']")
	  private WebElement ConfirmEIN;
	  
	  @FindBy(xpath="//label[@class='css-label ']")
	  private WebElement CheckBox;
	  
	  @FindBy(xpath="//input[@id='Address1']")
	  private WebElement AddressLine;
	  
	  @FindBy(xpath="//input[@id='City']")
	  private WebElement City;
	  
	  @FindBy(xpath="//input[@id='State']")
	  private WebElement State;
	  
	  @FindBy(xpath="//select[@id='MyCountries']")
	  private WebElement Country;
	  
	  @FindBy(xpath="//input[@id='txtzip']")
	  private WebElement PostalCode;
	  
	  @FindBy(xpath="//input[@id='SAName']")
	  private WebElement Name ;
	  
	  @FindBy(xpath="//input[@id='SATitle']")
	  private WebElement Role ;
	  
	  @FindBy(xpath="//input[@id='SADayTimePhone']")
	  private WebElement Phone ;
	  
	  
	  public Form7004(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  driver=this.driver;
	  }
	  
	  public void BusinessName()
	  {
		//  expliciteWait(driver,BusinessName);
		  BusinessName.sendKeys("abc");
	  }
	  
	  public void EIN()
	  {
		  EIN.sendKeys("123456");
	  }
	  
	  public void ConfirmEIN()
	  {
		  ConfirmEIN.sendKeys("123456");
	  }
	  
	  public void CheckBox()
	  {
		  CheckBox.click();
	  }
	  
	  public void  AddressLine()
	  {
		  AddressLine.sendKeys("sdfs");
	  }
	  
	  
	  public void City()
	  {
		  City.sendKeys("aaassdd");
	  }
	  
	  public void State()
	  {
		  State.sendKeys("mmamma");
		
	  }
	  
	  public void Country()
	  {
		  Country.click();
		  
		  Select s=new Select(Country);
		  s.selectByVisibleText("India");
		
	  }
	  public void PostalCode()
	  {
		  PostalCode.sendKeys("12547");
		
	  }
	  
	  public void Name()
	  {
		  Name.sendKeys("ccc");
		
	  }
	  
	  public void Role()
	  {
		  Role.sendKeys("SSSSSSSSSSS");
		
	  }
	  
	  public void Phone()
	  {
		  Phone.sendKeys("258741");
		
	  }
	  
	  
}

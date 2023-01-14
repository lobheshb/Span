package UtilClass;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass 
{
   public static String getScreenshot(WebDriver driver,String testName) throws IOException
   {
	  Date date=new Date();
	   SimpleDateFormat f=new SimpleDateFormat("yy-mm-dd-hh-mm-ss");
	   
	   String currentDate = f.format(date);
	   
	   File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   String path= testName+ ".png";
	   File dest=new File(path);
	   FileHandler.copy(src, dest);
	   return path;
	    
   }
   
   public static WebElement expliciteWait (WebDriver driver,WebElement element)
   {
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
	    WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
	   return element1;
	   
	   
   }
   
   public static WebElement expliciteWait1 (WebDriver driver,WebElement element)
   {
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
	   WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(element));
	   return element2;
   }
   
   
   
   
   
}

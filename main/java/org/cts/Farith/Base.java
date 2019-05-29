package org.cts.Farith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	 public static WebDriver driver;
	public static WebDriver getDriver()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh karunanithi\\Desktop\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\parveen\\SampleMaven\\src\\main\\java\\driver\\chromedriver.exe" );
	
	driver= new ChromeDriver();
	return driver;
	}
	public static void loadUrl (String url){
		driver.get(url);
		}
	public static void type(WebElement element,String name)
	
	{
	element.sendKeys(name);	
	}
	public static void btnclick(WebElement element)
	{
		element.click();
	
	}
	public static void quitBrowser()
	{
		driver.quit();
		
	}
public static void SelectByValueByIndex(WebElement element,int index)

{
	Select s=new Select(element);
	s.selectByIndex(index);
	}
}




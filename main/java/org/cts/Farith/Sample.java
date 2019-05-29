package org.cts.Farith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample extends Base {
	
  static WebDriver driver;
	public static void main(String[] args) {
		 driver=getDriver();
		loadUrl("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		type(txtUserName,"Java");

	WebElement txtPassWord = driver.findElement(By.id("pass"));
	type(txtPassWord,"hello");
	
	WebElement btnLogin=driver.findElement(By.xpath("//input[@value='Log-in']"));
	btnclick(btnLogin);
	quitBrowser();
}
}
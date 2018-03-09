package org.dlg.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QNB
{
	
	public static WebDriver Driver;
	
	public static void initalize()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Tools\\geckodriver.exe");
		Driver =new FirefoxDriver();
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void navigateTo(String URL)
	{
		Driver.get(URL);
	}
	
	public static void navigate_car_quote(String Carid)
	
	{
		Driver.findElement(By.id(Carid)).click();
	}
	public static void close()
	{
		
	}
	
	public static void test()
	{
		System.out.println("test Okay");
	}
	
	public static void main(String[] args)
	
	{
		//TC000 - Initialize Firefox
		initalize();
		//TC001 - Navigate to Drirectline 
		navigateTo("https://www.directline.com/");
		//TC002 - click on Car quote
		navigate_car_quote("car-insurance/getquote");
	}

}

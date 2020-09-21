package Automation_UI.Automation_UI;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Automation_UI.OpenandCloseBrowser;
import Automation_UI.amazon;
import Automation_UI.flipkart;



public class test 
{

	float amazonPrice=0;
	float flipkartPrice=0;
	@BeforeClass(alwaysRun = true)
	public void openBrowser() throws InterruptedException 
	{
		OpenandCloseBrowser openandCloseBrowser = new OpenandCloseBrowser();
		openandCloseBrowser.open();
	}


	@Test
	public void test1() throws Throwable 
	{
		Automation_UI.flipkart flipkart = new flipkart();
		flipkartPrice= flipkart.getPriceFlipkart();

	}	

	@Test(enabled = true)
	public void test2() throws Throwable 
	{   
		amazon amazon = new amazon();
		amazonPrice  = amazon.getPriceAmazon();
		System.out.println(amazonPrice);
		System.out.println(flipkartPrice);
		if(flipkartPrice>amazonPrice)
		{		  System.out.println("https://www.amazon.in/");

		}
		else 
		{
			System.out.println("https://www.flipkart.com/");
		}

	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() throws InterruptedException 
	{
		OpenandCloseBrowser openandCloseBrowser = new OpenandCloseBrowser();
		openandCloseBrowser.close();
	}
}
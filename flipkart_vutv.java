package Automation_UI;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator; 

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class flipkart_vutv extends OpenandCloseBrowser 
{
	public float vutv()
	{
		float flipkartPriceaftercart = 0;
		WebDriver driver = Connection.getWebDriver();
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
				String priceflip =	driver.findElement(By.xpath("//div[@class='_1vC4OE _3qQ9m1']")).getText().trim().substring(1).replace(",", "");
				float flipkartPrice = Float.parseFloat(priceflip);
				System.out.println(flipkartPrice);
				driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
				String priceflipcart = driver.findElement(By.xpath("//span[@class='pMSy0p XU9vZa']")).getText().trim().substring(1).replace(",", "");
				flipkartPriceaftercart = Float.parseFloat(priceflipcart);
				System.out.println(flipkartPriceaftercart);


			}

		}
		return flipkartPriceaftercart;

	}
}



package Automation_UI;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class flipkart extends OpenandCloseBrowser 
{
	flipkart_vutv vutv1=new flipkart_vutv();
	public float getPriceFlipkart()
	{
		WebDriver driver = Connection.getWebDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		System.out.println("flipkart");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		System.out.println("flipkart");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		System.out.println("art");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("vu tv");
		System.out.println("pkart");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='vh79eN']//*[local-name()='svg']")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);


		driver.findElement(By.xpath("//div[contains(text(),'Vu 108cm (43 inch) Ultra HD (4K) LED Smart Android')]")).click();

		float priceFlipkart = vutv1.vutv();
		return priceFlipkart;


	}
}


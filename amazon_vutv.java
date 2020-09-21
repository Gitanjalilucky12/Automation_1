package Automation_UI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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

public class amazon_vutv {
	flipkart amaflip = new flipkart();
	public float vutvamazonchange() throws InterruptedException
	{float pricefinalamazon1=0;
	WebDriver driver = Connection.getWebDriver();
	String parent=driver.getWindowHandle();
	Set<String>s=driver.getWindowHandles();
	Set<String> allWindowHandles = driver.getWindowHandles();
	// Now iterate using Iterator
	for(String handle : allWindowHandles)
	{
		System.out.println("Switching to window - > " + handle);
		//		System.out.println("Navigating to google.com");
		driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
	}
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@id='buybox-see-all-buying-choices-announce']")).click();
	Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	//		if(driver.findElement(By.xpath("//div[@id='aod-container']")).isDisplayed()) {
	String priceamazon = driver.findElement(By.xpath("//span[contains(text(),'34,475.00')]")).getText().trim().replace(",", "");
	float pricefinalamazon = Float.parseFloat(priceamazon);
	System.out.println(pricefinalamazon);
	driver.findElement(By.xpath("//input[@name='submit.addToCart']")).click();
	String aftercartamazon = driver.findElement(By.xpath("//div[@class='a-row a-spacing-micro']//span[@class='a-color-price hlb-price a-inline-block a-text-bold'][contains(text(),'34,475.00')]")).getText().trim().substring(2).replace(",", "");
	System.out.println(aftercartamazon);
	pricefinalamazon1 = Float.parseFloat(aftercartamazon);
	System.out.println(pricefinalamazon1);
	return pricefinalamazon1;



	}}





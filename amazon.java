package Automation_UI;

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

public class amazon{
	amazon_vutv vutvamazon=new amazon_vutv();
	public float getPriceAmazon() throws InterruptedException
	{
		WebDriver driver = Connection.getWebDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		System.out.println("famazon");
		//		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//		System.out.println("flipkart");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		System.out.println("art");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("VU TV");
		System.out.println("amazont");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='nav-input' and @value='Go']")).click();


		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Vu 108 cm (43 inches) 4K Ultra HD Cinema Android S')]")).click();
		Float priceAmazon	= vutvamazon.vutvamazonchange();
		return priceAmazon;
	}
}
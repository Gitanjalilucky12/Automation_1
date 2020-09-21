package Automation_UI;

/**
 * Hello world!
 *
 */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//    

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connection
{
	public static WebDriver driver;

	public static WebDriver getWebDriver(){
		if (driver == null){
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"//chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		}else{
			return driver;
		}
	}
}

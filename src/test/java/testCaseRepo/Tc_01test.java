package testCaseRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.PropertiesUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPagePom;

public class Tc_01test {

	@Test
	public void checkLogin() throws Exception
	{
	
	PropertiesUtility PUTIL = new PropertiesUtility();
	String URL 		=	PUTIL.getDataFromProperties("url");
	String USERNAME =	PUTIL.getDataFromProperties("username");
	String PASSWORD =	PUTIL.getDataFromProperties("password");
	
	WebDriverUtility WUTIL =new WebDriverUtility();
	
	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WUTIL.implicitWaitinScript(driver);
	driver.get(URL);
	WUTIL.maximizeWindow(driver);
	LoginPagePom LPM =new LoginPagePom(driver);
	LPM.loginOperation(USERNAME, PASSWORD);	
	}
}











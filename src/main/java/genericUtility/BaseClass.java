package genericUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePagePom;
import objectRepository.LoginPagePom;

public class BaseClass {

	public DataBaseUtility DUTIL = new DataBaseUtility();
	public PropertiesUtility PUTIL = new PropertiesUtility();
	public WebDriverUtility WUTIL =new WebDriverUtility();
	public static WebDriver driver = null;
	@BeforeSuite(alwaysRun = true)
	public void dbConnection() throws Exception
	{
		DUTIL.establishConnection();
		System.out.println("Database connection establish!!");
	}
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception
	{
	String URL =	PUTIL.getDataFromProperties("url");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		WUTIL.implicitWaitinScript(driver);
		WUTIL.maximizeWindow(driver);
		System.out.println("browser launched successfully!!");
	}
	@BeforeMethod(alwaysRun = true)
	public void loginOperation() throws Exception
	{
	String USERNAME =	PUTIL.getDataFromProperties("username");
	String PASSWORD =	PUTIL.getDataFromProperties("password");
	LoginPagePom LP = new LoginPagePom(driver);
	LP.loginOperation(USERNAME, PASSWORD);
	System.out.println("Login successfull!!");
	}
	@AfterMethod(alwaysRun = true)
	public void logoutOperation()
	{
		HomePagePom HP = new HomePagePom(driver);
		HP.logOutOperation(driver);
		System.out.println("Logout successfull!!");
	}
	@AfterClass(alwaysRun = true)
	public void closeWindow()
	{
		driver.close();
		System.out.println("window closed successfully!!");
	}
	@AfterSuite(alwaysRun = true)
	public void closeDbConnection() throws Exception
	{
		DUTIL.closeConnection();
		System.out.println("db connection closed successfully!!");
	}
}

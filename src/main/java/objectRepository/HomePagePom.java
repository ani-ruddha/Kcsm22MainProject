package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;



public class HomePagePom extends WebDriverUtility{

	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calendar;
	
	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leads;
	
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement organizations;
	
	@FindBy(xpath = "(//a[text()='Contacts'])[1]")
	private WebElement contacts;
	
	@FindBy(xpath = "(//a[text()='Opportunities'])[1]")
	private WebElement opportunities;
	
	@FindBy(xpath = "(//a[text()='Products'])[1]")
	private WebElement products;
	
	@FindBy(xpath = "(//td[@class='small'])[2]")
	private WebElement administrator;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;
	
	
	@FindBy(xpath = "//td[@class='tabSelected']/a/img")
	private WebElement homeIcon;


	public HomePagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getCalendar() {
		return calendar;
	}


	public WebElement getLeads() {
		return leads;
	}


	public WebElement getOrganizations() {
		return organizations;
	}


	public WebElement getContacts() {
		return contacts;
	}


	public WebElement getOpportunities() {
		return opportunities;
	}


	public WebElement getProducts() {
		return products;
	}


	public WebElement getAdministrator() {
		return administrator;
	}


	public WebElement getSignout() {
		return signout;
	}


	public WebElement getHomeIcon() {
		return homeIcon;
	}
	/**
	 * business library for home icon
	 */
	public void clickOnHomeIcon()
	{
		getHomeIcon().click();
	}
	/**
	 * business library for calendar
	 */
	public void clickOnCalendar()
	{
		getCalendar().click();
	}
	/**
	 * business library for Leads
	 */
	public void clickOnLeads()
	{
		getLeads().click();
	}
	/**
	 * business library for Organizations
	 */
	public void clickOnOrg()
	{
		getOrganizations().click();
	}
	/**
	 * business library for Contacts
	 */
	public void clickOnContacts()
	{
		getContacts().click();
	}
	/**
	 * business library for Opportunities
	 */
	public void clickOnOpportunities()
	{
		getOpportunities().click();
	}
	/**
	 * business library for Products
	 */
	public void clickOnProducts()
	{
		getProducts().click();
	}
	/**
	 * business library for sign out
	 */
	public void logOutOperation(WebDriver driver)
	{
		movingTowardsAnElement(driver, administrator);
		getSignout().click();
	}
	
}













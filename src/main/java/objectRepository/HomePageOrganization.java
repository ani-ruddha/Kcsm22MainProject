package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class for home page of Organization
 * @author Aniruddha
 */
public class HomePageOrganization {

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrgLookUpIcon;

	public HomePageOrganization(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateOrgLookUpIcon() {
		return createOrgLookUpIcon;
	}
	/**
	 * this business library is to click on create Org icon
	 */
	public void clickOnLookUpIcon()
	{
		getCreateOrgLookUpIcon().click();
	}
	
	
}

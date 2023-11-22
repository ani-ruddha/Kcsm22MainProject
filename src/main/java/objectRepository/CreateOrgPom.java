package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPom {

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement orgName;
	
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;


	public CreateOrgPom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getOrgName() {
		return orgName;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * this is the business library to create org
	 * @param OrganizationName
	 */
	public void createOrg(String OrganizationName)
	{
		getOrgName().sendKeys(OrganizationName);
		getSaveBtn().click();
	}
	
	
}






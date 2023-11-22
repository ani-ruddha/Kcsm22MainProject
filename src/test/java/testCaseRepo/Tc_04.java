package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;
import objectRepository.CreateOrgPom;
import objectRepository.HomePageOrganization;
import objectRepository.HomePagePom;

public class Tc_04 extends BaseClass {

	@Test
	public void orgMod() throws Exception
	{
		JavaUtility JUTIL  = new JavaUtility();
	int NUM =	JUTIL.getRandomNumber();
		 ExcelUtility EUTIL = new ExcelUtility();
		 String ORGNAME =EUTIL.getDataFromExcel("Org", 2, 2);
		HomePagePom HP = new HomePagePom(driver);
		HP.clickOnOrg();
		HomePageOrganization HPO = new HomePageOrganization(driver);
		HPO.clickOnLookUpIcon();
		CreateOrgPom COP =new CreateOrgPom(driver);
		COP.createOrg(ORGNAME+NUM);
		Thread.sleep(3000);
	}
}

package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePagePom;

public class Tc_02 extends BaseClass {

	@Test
	public void calendarMod()
	{
		HomePagePom HP = new HomePagePom(driver);
		HP.clickOnCalendar();
	}
}

package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
/**
 * this class is all about the WebDriver related methods
 * @author Aniruddha
 *
 */
public class WebDriverUtility {
	/**
	 * This method is use to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * this method is use to perform implicit wait operation
	 * @param driver
	 */
	public void implicitWaitinScript(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * this method is use to wait for a particular webelement
	 * @param driver
	 * @param element
	 */
	public void explicitWaitforAnElement(WebDriver driver , WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method is use to wait to perform click operation on a particular WebElement
	 * @param driver
	 * @param element
	 */
	public void explicitWaitToclickonAnElement(WebDriver driver , WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
						//dropdown handling methods
	/**
	 * this method is use to select an option by indexValue
	 * @param element
	 * @param indexValue
	 */
	public void selectOption(WebElement element , int indexValue)
	{
		Select s = new Select(element);
		s.selectByIndex(indexValue);
	}
	/**
	 *  this method is use to select an option by String value
	 * @param element
	 * @param value
	 */
	public void selectOption(WebElement element , String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	/**
	 * this method is use to select an option by String visibletext
	 * @param element
	 * @param visibleText
	 */
	public void selectOptionByVisibleText(WebElement element , String visibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}
	/**
	 * this is method is use to de select all the options from a dropdown
	 * @param element
	 */
	public void deSelectAllOptions(WebElement element)
	{
		Select s = new Select(element);
		s.deselectAll();
	}
	/**
	 * this method is use to de select the option based on index value
	 * @param element
	 * @param indexValue
	 */
	public void deselectOption(WebElement element , int indexValue)
	{
		Select s = new Select(element);
		s.deselectByIndex(indexValue);
	}
	/**
	 * this method is use to de select the option based on index value
	 * @param element
	 * @param value
	 */
	public void deselectOption(WebElement element , String value)
	{
		Select s = new Select(element);
		s.deselectByValue(value);
	}
	/**
	 * this method is use to de select the option by visible text
	 * @param element
	 * @param visibleText
	 */
	public void deselectOptionByVisibleText(WebElement element , String visibleText)
	{
		Select s = new Select(element);
		s.deselectByValue(visibleText);
	}
	/**
	 * This method is use to cross check dropdown is multiselected or not
	 * @param element
	 */
	public void checkDropdownIsmultiselected(WebElement element)
	{
		Select s = new Select(element);
		s.isMultiple();
	}
				//Mouse Action handling methods
	/**
	 * this method is use to move to a particular element
	 * @param driver
	 * @param element
	 */
	public void movingTowardsAnElement(WebDriver driver , WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * this method is use to perform right click operation
	 * @param driver
	 */
	public void rightClickOperation(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	/**
	 *  this method is use to perform right click operation on a particular WebElement
	 * @param driver
	 * @param element
	 */
	public void rightClickOperation(WebDriver driver , WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * this method is use to perform click operation
	 * @param driver
	 */
	public void clickOperation(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.click().perform();
	}
	/**
	 * this method is use to perform click operation on a particular WebElement
	 * @param driver
	 * @param element
	 */
	public void clickOperation(WebDriver driver , WebElement element)
	{
		Actions act = new Actions(driver);
		act.click(element).perform();
	}
	/**
	 * this method is use to perform double click operation
	 * @param driver
	 */
	public void doubleClickOperation(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	/**
	 * this method is use to perform double click operation on a particular webElement
	 * @param driver
	 * @param element
	 */
	public void doubleClickOperation(WebDriver driver ,WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * this method is use to perform drag and drop operation
	 * @param driver
	 * @param src
	 * @param target
	 */
	public void dragAndDropOperation(WebDriver driver , WebElement src , WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	/**
	 * this method is use to handle sliders
	 * @param driver
	 * @param src
	 * @param x
	 * @param y
	 */
	public void dragAndDropSlider(WebDriver driver , WebElement src , int x , int y)
	{
		Actions act = new Actions(driver);
		act.dragAndDropBy(src, x, y).perform();
	}
	/**
	 * this method is use to perform scroll down operation
	 * @param driver
	 * @param element
	 */
	public void scrollDownOperation(WebDriver driver , WebElement element)
	{
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();		
	}
						//alert popUp method
	/**
	 * this method is use to accept the alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * this method is use to dismiss the alert 
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * this method is use fetch the alert msg
	 * @param driver
	 */
	public void fetchAlertMsg(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}
				//frame popUp methods
	/**
	 * this method is use to switch the frame based on the index value
	 * @param driver
	 * @param index
	 */
	public void switchToFrameByIndex(WebDriver driver , int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * this method is use to switch the frame based on the name
	 * @param driver
	 * @param name
	 */
	public void switchToFrameByName(WebDriver driver , String name)
	{
		driver.switchTo().frame(name);
	}
	/**
	 * this method is use to switch the frame based on the element
	 * @param driver
	 * @param element
	 */
	public void switchToFrameByElement(WebDriver driver ,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	/**
	 * this method is use to switch to the immediate parent frame
	 * @param driver
	 */
	public void switchToImmediateParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	/**
	 * this method is use to switch to the main frame
	 * @param driver
	 */
	public void switchToMainFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
					//scroll down method
	/**
	 * this method is use to perform Scroll down operation based on JS
	 * @param driver
	 * @param jsValue
	 */
	public void scrollDownOperation(WebDriver driver , String jsValue)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(jsValue);
	}
					//window popUp
	/**
	 * this method is use to perform switching operations in between windows
	 * @param driver
	 * @param ParentId
	 */
	public void switchToWindow(WebDriver driver , String ParentId)
	{
	Set<String> childIds =	driver.getWindowHandles();
	Iterator<String> itr = childIds.iterator();
	
	while(itr.hasNext())
	{
	String IDS =itr.next();
	
	String ALLIDS = driver.switchTo().window(IDS).getTitle();
	
	if(ParentId.contains(ALLIDS))
	{
		break;
	}
	}
	}
	/**
	 * this method is to capture ScreenShot
	 * @param driver
	 * @param ScreenShotName
	 * @return
	 * @throws Exception
	 */
	public String screenShotCaptureMethod(WebDriver driver , String ScreenShotName) 
			throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
		File src =	ts.getScreenshotAs(OutputType.FILE);
		String path = ".\\Screenshot\\"+ScreenShotName+".png";
		File dest = new File(path);		
		Files.copy(src, dest);		
		String finalPath =dest.getAbsolutePath();		
		return finalPath;
	}
	/**
	 * customize wait to click an element
	 * @param element
	 * @throws Exception
	 */
	public void customizeClickOnElement(WebElement element) throws Exception
	{
		int count = 1;		
		while(count<10)
		{
			try
			{
			element.click();
			break;
			}
			catch(Exception e)
			{
				Thread.sleep(2000);
				count++;
			}
		}
	}
	
}












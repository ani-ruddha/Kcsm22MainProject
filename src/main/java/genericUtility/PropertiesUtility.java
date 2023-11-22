package genericUtility;
import java.io.FileInputStream;
import java.util.Properties;
/**
 * this class is for common data stored in properties file
 * @author Aniruddha
 */
public class PropertiesUtility {
	/**
	 * this is generic method to fetch data from properties file
	 * @return
	 * @throws Exception 
	 */
	public String getDataFromProperties(String data) throws Exception
	{
		FileInputStream fis = new FileInputStream(IconstantUtility.propertiesPath);
		Properties pobj = new Properties();
		pobj.load(fis);
		
		String propertiesData =	pobj.getProperty(data);
		return propertiesData;		
	}
}

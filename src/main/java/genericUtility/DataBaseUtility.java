package genericUtility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * this class contains all the generic methods regarding DataBase
 * @author Aniruddha
 *
 */
public class DataBaseUtility {

	Connection c = null;
	/**
	 * this method is use to establish the connection
	 * @throws Exception
	 */
	public void establishConnection() throws Exception
	{
		DriverManager.getConnection(IconstantUtility.dbPath , 
				IconstantUtility.dbUsername , IconstantUtility.dbPass);
	}
	/**
	 * this method is use to close the connection
	 * @throws Exception
	 */
	public void closeConnection() throws Exception
	{
		c.close();
	}
	/**
	 * this method is use to execute querry
	 * @param querry
	 * @param colIndex
	 * @param expData
	 * @return
	 * @throws Exception
	 */
	public String executeQuerryOperation(String querry , int colIndex , String expData) throws Exception
	{
	boolean flag = false;
	ResultSet rs = c.createStatement().executeQuery(querry);
	while(rs.next())
	{
	String actualData =	rs.getString(colIndex);	
	if(actualData.equals(expData))
	{
		flag = true;
		break;
	}
}
	if(flag)
	{
		System.out.println("expected data is : " + expData);
		return expData;
	}
	else
	{
		System.out.println("data is not present");
		return "";
	}
	}
	
}
	








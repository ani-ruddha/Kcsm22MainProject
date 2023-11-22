package testCaseRepo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import genericUtility.IconstantUtility;

public class SampleConnection {
	public static void main(String[] args) throws Exception {
		Connection c = null;
		/*establish connection*/
		try {
	 c =DriverManager.getConnection(IconstantUtility.dbPath,IconstantUtility.dbUsername, 
			 IconstantUtility.dbPass);
	/*create statement*/
	Statement s =  c.createStatement();	
	/*execute query*/
	ResultSet rs = s.executeQuery("select * from student");		
	while(rs.next())
	{
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" " + rs.getString(3)+ 
				" " + rs.getString(4));
	}
		}
		catch(Exception e)
		{
			
		}
		finally {
	/*close connection*/
	c.close();
		}
	}
}

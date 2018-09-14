package dbAccess;

import java.sql.SQLException;

import junit.framework.TestCase;
import login.DBConnect;

public class LoginCheckTest extends TestCase {

	
	String username;
	String pwd;
	protected void setUp() throws Exception {
		
		username="maria";
		pwd="123";
	}

	protected void tearDown() throws Exception {
		
		username=null;
		pwd=null;
		
	}

	public void testLoginCheck() throws ClassNotFoundException, SQLException {
		boolean expected=true;
		//boolean actual=true;
		 
		DBConnect obj=new DBConnect();
		boolean actual1=obj.searchUser(username, pwd);
		 assertEquals(expected, actual1);
	}

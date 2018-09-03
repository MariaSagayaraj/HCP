package login;

import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.SQL.Exception;




public class DBConnect {
	private Connection myConn;
	
	public DBConnect() throws ClassNotFoundException, SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/user_login ";
		String user = "root";
		String password = "";
		
		Class.forName("com.mysql.jdbc.Driver");
		myConn = DriverManager.getConnection(dbUrl, user, password);
		System.out.println("initializing database...");
		Statement myStmt = myConn.createStatement(); 
	}
	
	public boolean searchUser(String username, String password) {
		PreparedStatement myStmt = null; 
		ResultSet myRS = null;
		
		try {
			myStmt = myConn.prepareStatement("select * from student_login where Username=? and Password=? ");
			myStmt.setString(1, username);
			myStmt.setString(2, password);
			myRS = myStmt.executeQuery();
			
			if(myRS.next()) {
				return true;
			}
			else {
				return false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		try {
			DBConnect sampleObj = new DBConnect();
			System.out.println("db object created.");
			
			if(sampleObj.searchUser("abi", "1234")) {
				System.out.println("User exists!");
			} else {
				System.out.println("the user is NOT in the database.");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}

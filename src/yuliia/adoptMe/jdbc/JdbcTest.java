package yuliia.adoptMe.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author www.luv2code.com
 *
 */
public class JdbcTest {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adoptme", "yulia" , "yulia");

//			myConn.setAutoCommit(false);
			System.out.println("Database connection successful!\n");
			
			// 2. Create a statement

			myStmt = myConn.prepareStatement("select * from dog where id>?");

//			myStmt = myConn.prepareStatement("insert into dog (id, name, breed) values (5, 'Tuzik', 'chaw-chaw');");//"select * from dog where id>?");

//			myConn.commit();
//			myStmt.setInt(1, 1);
//			myStmt.setString(2, "Bobik");
			
			// 3. Execute SQL query
			myRs = myStmt.executeQuery();
			
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getInt("id") + ", "
						+ myRs.getString("name") + ", "
						+ myRs.getString("breed")
				);

			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}

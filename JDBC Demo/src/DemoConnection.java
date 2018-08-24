import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=JAVA", "sa", "sa123");
			System.out.println("connection successful");
			
			String INSERT_EMPLOYEE="insert into employee values(12,'Citi',3200)";
			Statement st = con.createStatement();
			int rows = st.executeUpdate(INSERT_EMPLOYEE);
			System.out.println("rows inserted: "+rows);
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

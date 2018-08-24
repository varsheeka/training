import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connections.MyConnection;

public class DemoFecthData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = MyConnection.getMyConnection(); 
		
		String Find_ALL_EMPLOYEE = "select * from employee";
		try {
			Statement st=con.createStatement();
			ResultSet set= st.executeQuery(Find_ALL_EMPLOYEE);
			while(set.next())
			{
				int empId=set.getInt(1);
				String name=set.getString(2);	
				int Salary = set.getInt(3);
				System.out.println(empId+" "+Salary);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

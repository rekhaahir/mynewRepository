
	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


	public class Ok {
		public static void main(String args[])throws Exception
		{
			Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","root");
		Statement s=conn.createStatement();
		ResultSet rs=s.executeQuery("select * from Student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
		}
		}

		
	}


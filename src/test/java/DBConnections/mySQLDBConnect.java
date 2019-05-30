package DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mySQLDBConnect {

	static String conURL = "jdbc:sqlserver://10.200.1.57; databaseName=INST1; user=sa; password=Sql2017!;";

	static String url = "jdbc:jtds:sqlserver://10.200.1.57\\INST1:1433/Interlink_Main90";
	static String username = "sa";
	static String password = "Sql2017!";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// Class.forName("com.mysql.jdbc.Driver");

		//Connection con = DriverManager.getConnection(conURL);

		Connection con = DriverManager.getConnection(url, username, password);
		// getConnection("jdbc:sqlserver://NJDBS01/INST1:1433;Interlink_Main90", "sa",
		// "Sql2017!");

		if (con != null) {
			System.out.println("DB Connected Successfully");
		}
	}
}
// jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]
// jdbc:sqlserver://localhost; databaseName=TestDB;
// user=UserName;password=Password;

// jdbc:sqlserver://[10.200.1.57\INST1][:portNumber]][;property=value[;property=value]
// jdbc:sqlserver://10.200.1.57; databaseName=INST1; user=sa; password=Sql2017!;
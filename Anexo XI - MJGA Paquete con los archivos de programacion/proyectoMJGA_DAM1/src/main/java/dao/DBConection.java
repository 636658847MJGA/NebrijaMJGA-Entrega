package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/*import java.sql.SQLException;*/
import java.util.Properties;

/** This class is used for connections*/
public class DBConection {
	
	public static Connection instance = null;
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/mjga_ce";
	
	private DBConection() {
		
	}
	
	public static Connection getConexion() throws SQLException{ 
		
		// En el caso de que no haya conexión hecha ya
		if(instance == null) {
			Properties props = new Properties();
			props.put("user", "root");
			props.put("password", "");
			props.put("charset", "UTF-8");

			/*try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}*/
			
			instance = DriverManager.getConnection(JDBC_URL, props);	
		}
		return instance;
		
	}
}
	



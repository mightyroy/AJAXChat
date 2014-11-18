package ajaxtestpackage;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class DatabaseConnect {
	static String account = "ccs108roychan";
	static String password = "teekeich";
	static String server = "mysql-user-master.stanford.edu";
	static String database = "c_cs108_roychan";
	static Connection con;
	private static Statement stmt;
	public void DatabaseConnect(){}
	
	public static void databaseConnect(){
		try{
			con = DriverManager.getConnection("jdbc:mysql://" + server, account ,password);
			stmt = (Statement) con.createStatement();
			stmt.executeQuery("USE " + database);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Database connect error!");
		} 
	}
	
	
	public void databaseDisconnect(){
		try{
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public static ResultSet getConversationNotes(int conversation_id) throws SQLException {
		ResultSet rs = stmt.executeQuery("SELECT * FROM notes WHERE conversation_id = " + conversation_id + ";");
		return rs;
	}
	
	public static void messageToDatabase(int conversation_ID, String sender, String message, Timestamp timesent) throws SQLException {
		System.out.println("INSERT INTO notes VALUES (" + conversation_ID +", \"" + sender +"\", \"" + message + "\", \'" + timesent + "\');" );
		stmt.executeUpdate("INSERT INTO notes VALUES (" + conversation_ID +", \"" + sender +"\", \"" + message + "\", \'" + timesent + "\');"  );
		
	}
}

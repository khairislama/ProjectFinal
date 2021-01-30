
package database;

import java.sql.*;

public class DataBaseConnection {

	static Connection connection =null;
	static Statement statement;
	static PreparedStatement preparedStatement;
	static String url;
	static String databasename;
	static String usrname;
	static String password;
	static int port;
	static String host_IP;
	static String host_DB;
	
	public static void initialiser()
	{
		DataBaseConnection.host_IP =ParameterDataBase.HOST_IP;
		DataBaseConnection.host_DB=ParameterDataBase.HOST_DB;
		DataBaseConnection.databasename=ParameterDataBase.DATABASE_NAME;
		DataBaseConnection.usrname=ParameterDataBase.USERNAME_DB;
		DataBaseConnection.password=ParameterDataBase.PASSWORD_DB;
		DataBaseConnection.port=ParameterDataBase.PORT_DB;
		
		}
	public static Connection connecter() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		url="jdbc:"+ host_DB +"://"+ host_IP +":"+ port + "/" + databasename;
		connection=DriverManager.getConnection(url,usrname,password);
		return connection;
	}
	
	
	public static Connection deconnecter() throws SQLException
	{
		connection.close();
		return connection;
	}
	
	public static ResultSet executionQuerry(String sql) throws SQLException
	{
		ResultSet resultSet =null;
		statement= connection.createStatement();
		resultSet=statement.executeQuery(sql);
		return resultSet;
	}
	public static int executionUpdate(String sql) throws SQLException
	{
		statement=connection.createStatement();
		return statement.executeUpdate(sql);
	}
    
}

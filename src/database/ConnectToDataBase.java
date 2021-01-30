/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author khairislama
 */
public class ConnectToDataBase {
    java.sql.Connection connection =null;
	public static java.sql.Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_commercial","khairi","123456");
		return connection;
	}
}

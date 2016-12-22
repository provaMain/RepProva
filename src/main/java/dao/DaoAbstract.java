package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public abstract class DaoAbstract {
	Connection c;
	
	public DaoAbstract(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			c=DriverManager.getConnection("jdbc:mysql://localhost/nazione2?user=root&password=password");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		return c;
	}
	
	public ResultSet query(String query){
		ResultSet rs = null;
	    try {
	    	PreparedStatement st = (PreparedStatement) getConnection().prepareStatement(query);
			rs= st.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	    return rs;
	}

}

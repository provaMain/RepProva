package mio.principale;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Lista {
	List<Nazione> ls;
	
	public Lista(){
		ResultSet rs= new FromDB().getRs();
		ls=new LinkedList<>();
		try {
			while(rs.next()){
				Nazione n=new Nazione(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				ls.add(n);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Nazione> getLs() {
		return ls;
	}

	public void setLs(List<Nazione> ls) {
		this.ls = ls;
	}

}

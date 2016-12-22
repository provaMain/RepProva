package mio.principale;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.opensymphony.xwork2.ActionSupport;
import dao.DaoNazione;
import dao.DaoNazioneImpl;

public class FromDB extends ActionSupport{
	ResultSet rs;
	private static final long serialVersionUID = 1L;
	
	public FromDB(){
		DaoNazione d=new DaoNazioneImpl();
		rs= d.execQuery("select * from nazione");
	}
	
	public String execute(){
		try {
			if(rs.first())
				return "successo";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "errore";
	}
	
	public ResultSet getRs(){
		return rs;
	}
}

package dao;

import java.sql.ResultSet;

public interface DaoNazione {
	public ResultSet execQuery(String query);
	public boolean execUpdate(String query);
	public boolean deleteNation(int id);
}

package dao;

import java.sql.ResultSet;

public class DaoNazioneImpl extends DaoAbstract implements DaoNazione{

	public ResultSet execQuery(String query) {
		return super.query(query);
	}

	public boolean execUpdate(String query) {
		return false;
	}

	public boolean deleteNation(int id) {
		return false;
	}

}

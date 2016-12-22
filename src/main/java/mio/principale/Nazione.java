package mio.principale;

public class Nazione {
	private String nome_nazione, siglanum, sigla2, sigla3;
	private int id;
	
	public String getNome_nazione() {
		return nome_nazione;
	}

	public void setNome_nazione(String nome_nazione) {
		this.nome_nazione = nome_nazione;
	}

	public String getSiglanum() {
		return siglanum;
	}

	public void setSiglanum(String siglanum) {
		this.siglanum = siglanum;
	}

	public String getSigla2() {
		return sigla2;
	}

	public void setSigla2(String sigla2) {
		this.sigla2 = sigla2;
	}

	public String getSigla3() {
		return sigla3;
	}

	public void setSigla3(String sigla3) {
		this.sigla3 = sigla3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id_nazione) {
		this.id = id_nazione;
	}

	public Nazione(int id, String nome, String sn, String s2, String s3){
		this.id=id;
		this.nome_nazione=nome;
		this.siglanum=sn;
		this.sigla2=s2;
		this.sigla3=s3;
	}
}

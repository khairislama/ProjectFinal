package model;

public class Adresse {

    private int numero_rue;
	private String libelle_rue;
	private String ville;
	private int code_postale;
	private String gouvernorat;
	private String pays;
	private String id_e;
	public Adresse(int numero_rue, String libelle_rue, String ville, int code_postale, String gouvernorat,
			String pays,String id_e) {
		super();
		this.numero_rue = numero_rue;
		this.libelle_rue = libelle_rue;
		this.ville = ville;
		this.code_postale = code_postale;
		this.gouvernorat = gouvernorat;
		this.pays = pays;
		this.id_e=id_e;
	}
	
	public String getId_e() {
		return id_e;
	}

	public void setId_e(String id_e) {
		this.id_e = id_e;
	}

	public int getNumero_rue() {
		return numero_rue;
	}
	public void setNumero_rue(int numero_rue) {
		this.numero_rue = numero_rue;
	}
	public String getLibelle_rue() {
		return libelle_rue;
	}
	public void setLibelle_rue(String libelle_rue) {
		this.libelle_rue = libelle_rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCode_postale() {
		return code_postale;
	}
	public void setCode_postale(int code_postale) {
		this.code_postale = code_postale;
	}
	public String getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public Adresse() {
		super();
	}
}

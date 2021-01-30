package model;

public class Entreprise {

    private String matricule_fiscale_entreprise;
	private String raison_sociale_entreprise;
	private String type_entreprise;
	private String description_entreprise;
	Adresse adresse_entreprise;
	Banque banque_entreprise;
	private int tel_fixe_entreprise;
	private int tel_mobile_entreprise;
	private int tel_faxe_entreprise;
	private String email_entreprise;
	private String web_entreprise;
	private int etat_tva;
	
	
	public Entreprise(String matricule_fiscale_entreprise, String raison_sociale_entreprise, String type_entreprise,
			String description_entreprise, Adresse adresse_entreprise, Banque banque_entreprise,
			int tel_fixe_entreprise, int tel_mobile_entreprise, int tel_faxe_entreprise,
			String email_entreprise, String web_entreprise, int etat_tva) {
		super();
		this.matricule_fiscale_entreprise = matricule_fiscale_entreprise;
		this.raison_sociale_entreprise = raison_sociale_entreprise;
		this.type_entreprise = type_entreprise;
		this.description_entreprise = description_entreprise;
		this.adresse_entreprise = adresse_entreprise;
		this.banque_entreprise = banque_entreprise;
		this.tel_fixe_entreprise = tel_fixe_entreprise;
		this.tel_mobile_entreprise = tel_mobile_entreprise;
		this.tel_faxe_entreprise = tel_faxe_entreprise;
		this.email_entreprise = email_entreprise;
		this.web_entreprise = web_entreprise;
		this.etat_tva = etat_tva;
	}
	
	public Entreprise() {
		super();
	}

	public String getMatricule_fiscale_entreprise() {
		return matricule_fiscale_entreprise;
	}
	public void setMatricule_fiscale_entreprise(String matricule_fiscale_entreprise) {
		this.matricule_fiscale_entreprise = matricule_fiscale_entreprise;
	}
	public String getRaison_sociale_entreprise() {
		return raison_sociale_entreprise;
	}
	public void setRaison_sociale_entreprise(String raison_sociale_entreprise) {
		this.raison_sociale_entreprise = raison_sociale_entreprise;
	}
	public String getType_entreprise() {
		return type_entreprise;
	}
	public void setType_entreprise(String type_entreprise) {
		this.type_entreprise = type_entreprise;
	}
	public String getDescription_entreprise() {
		return description_entreprise;
	}
	public void setDescription_entreprise(String description_entreprise) {
		this.description_entreprise = description_entreprise;
	}
	public Adresse getAdresse_entreprise() {
		return adresse_entreprise;
	}
	public void setAdresse_entreprise(Adresse adresse_entreprise) {
		this.adresse_entreprise = adresse_entreprise;
	}
	public Banque getBanque_entreprise() {
		return banque_entreprise;
	}
	public void setBanque_entreprise(Banque banque_entreprise) {
		this.banque_entreprise = banque_entreprise;
	}
	public int getTel_fixe_entreprise() {
		return tel_fixe_entreprise;
	}
	public void setTel_fixe_entreprise(int tel_fixe_entreprise) {
		this.tel_fixe_entreprise = tel_fixe_entreprise;
	}
	public int getTel_mobile_entreprise() {
		return tel_mobile_entreprise;
	}
	public void setTel_mobile_entreprise(int tel_mobile_entreprise) {
		this.tel_mobile_entreprise = tel_mobile_entreprise;
	}
	public int getTel_faxe_entreprise() {
		return tel_faxe_entreprise;
	}
	public void setTel_faxe_entreprise(int tel_faxe_entreprise) {
		this.tel_faxe_entreprise = tel_faxe_entreprise;
	}
	public String getEmail_entreprise() {
		return email_entreprise;
	}
	public void setEmail_entreprise(String email_entreprise) {
		this.email_entreprise = email_entreprise;
	}
	public String getWeb_entreprise() {
		return web_entreprise;
	}
	public void setWeb_entreprise(String web_entreprise) {
		this.web_entreprise = web_entreprise;
	}
	public int getEtat_tva() {
		return etat_tva;
	}
	public void setEtat_tva(int etat_tva) {
		this.etat_tva = etat_tva;
	}
}

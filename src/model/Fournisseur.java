package model;

import database.DataBaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Fournisseur {

    private String code_fc;
	private String matricule_fiscale_fc;
	private String raison_sociale_fc;
	private String type_fc;
	 Adresse adresse_Fc;
	 Banque banque_fc;
	private int tel_fixe_fc;
	private int tel_mobile_fc;
	private int tel_faxe_fc;
	private String email_fc;
	private String web_fc;
	private int etat_tva_fc;
	
	
	
	public Fournisseur(String code_fornisseur_client, String matricule_fiscale_fornisseur_client,
			String raison_sociale_fornisseur_client, String type_fornisseur_client, int tel_fixe_fornisseur_client,
			int tel_mobile_fornisseur_client, int tel_faxe_fornisseur_client, String email_fornisseur_client,
			String web_fornisseur_client, int etat_tva_fornisseur_client) {
		super();
		this.code_fc = code_fornisseur_client;
		this.matricule_fiscale_fc = matricule_fiscale_fornisseur_client;
		this.raison_sociale_fc = raison_sociale_fornisseur_client;
		this.type_fc = type_fornisseur_client;
		this.tel_fixe_fc = tel_fixe_fornisseur_client;
		this.tel_mobile_fc = tel_mobile_fornisseur_client;
		this.tel_faxe_fc = tel_faxe_fornisseur_client;
		this.email_fc = email_fornisseur_client;
		this.web_fc = web_fornisseur_client;
		this.etat_tva_fc = etat_tva_fornisseur_client;
	}
	public  Fournisseur(String code_fornisseur_client, String matricule_fiscale_fornisseur_client) {
		super();
		this.code_fc = code_fornisseur_client;
		this.matricule_fiscale_fc = matricule_fiscale_fornisseur_client;
	}
	public  Fournisseur(String code_fornisseur_client, String matricule_fiscale_fornisseur_client,
			String raison_sociale_fornisseur_client, String type_fornisseur_client, Adresse adresse_fornisseur_client,
			Banque banque_fornisseur_client, int tel_fixe_fornisseur_client, int tel_mobile_fornisseur_client,
			int tel_fxe_fornisseur_client, String email_fornisseur_client, String web_fornisseur_client,
			int etat_tva_fornisseur_client) {
		super();
		this.code_fc = code_fornisseur_client;
		this.matricule_fiscale_fc = matricule_fiscale_fornisseur_client;
		this.raison_sociale_fc = raison_sociale_fornisseur_client;
		this.type_fc = type_fornisseur_client;
		this.adresse_Fc = adresse_fornisseur_client;
		this.banque_fc = banque_fornisseur_client;
		this.tel_fixe_fc = tel_fixe_fornisseur_client;
		this.tel_mobile_fc = tel_mobile_fornisseur_client;
		this.tel_faxe_fc = tel_fxe_fornisseur_client;
		this.email_fc = email_fornisseur_client;
		this.web_fc = web_fornisseur_client;
		this.etat_tva_fc = etat_tva_fornisseur_client;
	}
	public  Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCode_fornisseur_client() {
		return code_fc;
	}
	public void setCode_fornisseur_client(String code_fornisseur_client) {
		this.code_fc = code_fornisseur_client;
	}
	public String getMatricule_fiscale_fornisseur_client() {
		return matricule_fiscale_fc;
	}
	public void setMatricule_fiscale_fornisseur_client(String matricule_fiscale_fornisseur_client) {
		this.matricule_fiscale_fc = matricule_fiscale_fornisseur_client;
	}
	public String getRaison_sociale_fornisseur_client() {
		return raison_sociale_fc;
	}
	public void setRaison_sociale_fornisseur_client(String raison_sociale_fornisseur_client) {
		this.raison_sociale_fc = raison_sociale_fornisseur_client;
	}
	public String getType_fornisseur_client() {
		return type_fc;
	}
	public void setType_fornisseur_client(String type_fornisseur_client) {
		this.type_fc = type_fornisseur_client;
	}
	public Adresse getAdresse_fornisseur_client() {
		return adresse_Fc;
	}
	public void setAdresse_fornisseur_client(Adresse adresse_fornisseur_client) {
		this.adresse_Fc = adresse_fornisseur_client;
	}
	public Banque getBanque_fornisseur_client() {
		return banque_fc;
	}
	public void setBanque_fornisseur_client(Banque banque_fornisseur_client) {
		this.banque_fc = banque_fornisseur_client;
	}
	public int getTel_fixe_fornisseur_client() {
		return tel_fixe_fc;
	}
	public void setTel_fixe_fornisseur_client(int tel_fixe_fornisseur_client) {
		this.tel_fixe_fc = tel_fixe_fornisseur_client;
	}
	public int getTel_mobile_fornisseur_client() {
		return tel_mobile_fc;
	}
	public void setTel_mobile_fornisseur_client(int tel_mobile_fornisseur_client) {
		this.tel_mobile_fc = tel_mobile_fornisseur_client;
	}
	public int getTel_faxe_fornisseur_client() {
		return tel_faxe_fc;
	}
	public void setTel_faxe_fornisseur_client(int tel_fxe_fornisseur_client) {
		this.tel_faxe_fc = tel_fxe_fornisseur_client;
	}
	public String getEmail_fornisseur_client() {
		return email_fc;
	}
	public void setEmail_fornisseur_client(String email_fornisseur_client) {
		this.email_fc = email_fornisseur_client;
	}
	public String getWeb_fornisseur_client() {
		return web_fc;
	}
	public void setWeb_fornisseur_client(String web_fornisseur_client) {
		this.web_fc = web_fornisseur_client;
	}
	public int getEtat_tva_fornisseur_client() {
		return etat_tva_fc;
	}
	public void setEtat_tva_fornisseur_client(int etat_tva_fornisseur_client) {
		this.etat_tva_fc = etat_tva_fornisseur_client;
	}
	public static ResultSet getAllFournisseur() throws SQLException
	{
		ResultSet rs=null;
		String sql="SELECT * FROM `forniseur`";
		rs=DataBaseConnection.executionQuerry(sql);
		return rs;
	}
}

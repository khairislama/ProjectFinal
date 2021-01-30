/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DataBaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author khairislama
 */
public class Client extends Fournisseur{
    private String code_fornisseur_client;
	private String matricule_fiscale_fornisseur_client;
	private String raison_sociale_fornisseur_client;
	private String type_fornisseur_client;
	 Adresse adresse_fornisseur_client;
	 Banque banque_fornisseur_client;
	private int tel_fixe_fornisseur_client;
	private int tel_mobile_fornisseur_client;
	private int tel_fxe_fornisseur_client;
	private String email_fornisseur_client;
	private String web_fornisseur_client;
	private int etat_tva_fornisseur_client;
	

	public Client(String code_fornisseur_client, String matricule_fiscale_fornisseur_client,
			String raison_sociale_fornisseur_client, String type_fornisseur_client, Adresse adresse_fornisseur_client,
			Banque banque_fornisseur_client, int tel_fixe_fornisseur_client, int tel_mobile_fornisseur_client,
			int tel_fxe_fornisseur_client, String email_fornisseur_client, String web_fornisseur_client,
			int etat_tva_fornisseur_client) {
		super(code_fornisseur_client, matricule_fiscale_fornisseur_client, raison_sociale_fornisseur_client,
				type_fornisseur_client, adresse_fornisseur_client, banque_fornisseur_client, tel_fixe_fornisseur_client,
				tel_mobile_fornisseur_client, tel_fxe_fornisseur_client, email_fornisseur_client, web_fornisseur_client,
				etat_tva_fornisseur_client);
		// TODO Auto-generated constructor stub
	}

	public Client(String code_fornisseur_client, String matricule_fiscale_fornisseur_client) {
		super(code_fornisseur_client, matricule_fiscale_fornisseur_client);
		// TODO Auto-generated constructor stub
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}
 
	public static ResultSet getAllClient() throws SQLException
	{
		ResultSet rs=null;
		String sql="SELECT * FROM `client`";
		rs=DataBaseConnection.executionQuerry(sql);
		return rs;
	}
}

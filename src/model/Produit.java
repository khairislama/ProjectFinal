package model;

import database.DataBaseConnection;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Produit {

    private String reference_prod;
	private String designation_prod;
	private String unite_mesure_prod;
	Fournisseur fornisseur_prod;
	FamilleProduit  familleProduit;
	private int stock_prod;
	private int stock_min_prod;
	private int prix_unitaire_ht;
	private float tva_prod;
	static Connection con;
	   PreparedStatement ps;
	   ResultSet rs;
	
	public Produit() {
		super();
	}
	public Produit(String reference_prod, String designation_prod, String unite_mesure_prod, Fournisseur fornisseur_prod,
			FamilleProduit familleProduit, int stock_prod, int stock_min_prod, int prix_unitaire_ht, float tva_prod) {
		super();
		this.reference_prod = reference_prod;
		this.designation_prod = designation_prod;
		this.unite_mesure_prod = unite_mesure_prod;
		this.fornisseur_prod = fornisseur_prod;
		this.familleProduit = familleProduit;
		this.stock_prod = stock_prod;
		this.stock_min_prod = stock_min_prod;
		this.prix_unitaire_ht = prix_unitaire_ht;
		this.tva_prod = tva_prod;
	}
	public Produit(String reference, String designation, String unite, int quantite, int prixht, float tva) {
		// TODO Auto-generated constructor stub
		this.reference_prod = reference;
		this.designation_prod = designation;
		this.unite_mesure_prod = unite;
		this.stock_prod = quantite;
		this.prix_unitaire_ht = prixht;
		this.tva_prod = tva;
	}
	public String getReference_prod() {
		return reference_prod;
	}
	public void setReference_prod(String reference_prod) {
		this.reference_prod = reference_prod;
	}
	public String getDesignation_prod() {
		return designation_prod;
	}
	public void setDesignation_prod(String designation_prod) {
		this.designation_prod = designation_prod;
	}
	public String getUnite_mesure_prod() {
		return unite_mesure_prod;
	}
	public void setUnite_mesure_prod(String unite_mesure_prod) {
		this.unite_mesure_prod = unite_mesure_prod;
	}
	public Fournisseur getFornisseur_prod() {
		return fornisseur_prod;
	}
	public void setFornisseur_prod(Fournisseur fornisseur_prod) {
		this.fornisseur_prod = fornisseur_prod;
	}
	public FamilleProduit getFamilleProduit() {
		return familleProduit;
	}
	public void setFamilleProduit(FamilleProduit familleProduit) {
		this.familleProduit = familleProduit;
	}
	public int getStock_prod() {
		return stock_prod;
	}
	public void setStock_prod(int stock_prod) {
		this.stock_prod = stock_prod;
	}
	public int getStock_min_prod() {
		return stock_min_prod;
	}
	public void setStock_min_prod(int stock_min_prod) {
		this.stock_min_prod = stock_min_prod;
	}
	public int getPrix_unitaire_ht() {
		return prix_unitaire_ht;
	}
	public void setPrix_unitaire_ht(int prix_unitaire_ht) {
		this.prix_unitaire_ht = prix_unitaire_ht;
	}
	public float getTva_prod() {
		return tva_prod;
	}
	public void setTva_prod(float f) {
		this.tva_prod = f;
	}
}

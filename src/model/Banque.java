package model;

public class Banque {

    private String banque;
	private String agence;
	private int rib;
	private String id_e;

public Banque(String banque, String agence, int rib,String id_e) {
	super();
	this.banque = banque;
	this.agence = agence;
	this.rib = rib;
	this.id_e = id_e;
}

public Banque() {
	super();
}

public String getId_e() {
	return id_e;
}

public void setId_e(String id_e) {
	this.id_e = id_e;
}

public String getBanque() {
	return banque;
}
public void setBanque(String banque) {
	this.banque = banque;
}
public String getAgence() {
	return agence;
}
public void setAgence(String agence) {
	this.agence = agence;
}
public int getRib() {
	return rib;
}
public void setRib(int rib) {
	this.rib = rib;
}
}

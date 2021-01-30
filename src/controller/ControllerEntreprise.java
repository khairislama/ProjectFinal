/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.ConnectToDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Entreprise;

/**
 *
 * @author khairislama
 */
public class ControllerEntreprise {
    Connection con;
	   PreparedStatement ps;
	   ResultSet rs;
	public ControllerEntreprise() {
		// TODO Auto-generated constructor stub
		
			
	}
	public void ajouterEntreprise(Entreprise e) throws ClassNotFoundException, SQLException
	{
		con=ConnectToDataBase.getConnection();
		ps=con.prepareStatement("INSERT INTO `entreprise`(`matricule`, `raison`, `type`, `activite`, `fix`, `mobile`, `fax`, `email`, `web`,`etat`) VALUES(?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,e.getMatricule_fiscale_entreprise());
		ps.setString(2,e.getRaison_sociale_entreprise());
		ps.setString(3,e.getType_entreprise());
		ps.setString(4,e.getDescription_entreprise());
		ps.setInt(5,e.getTel_fixe_entreprise());
		ps.setInt(6,e.getTel_mobile_entreprise());
		ps.setInt(7,e.getTel_faxe_entreprise());
		ps.setString(8,e.getEmail_entreprise());
		ps.setString(9,e.getWeb_entreprise());
		ps.setInt(10,e.getEtat_tva()); 
		ps.executeUpdate();
	
	}
	public void modifierEntreprise(Entreprise e) {
	     try {
	  	    	con=ConnectToDataBase.getConnection();
	  	    	PreparedStatement ps;
	  		 ps=con.prepareStatement("UPDATE `entreprise` SET `raison`=?,`type`=?,`activite`=?,`fix`=?,`mobile`=?,`fax`=?,`email`=?,`web`=?,`etat`=? WHERE`matricule`= ?");
	  		ps.setString(10,e.getMatricule_fiscale_entreprise());
			ps.setString(1,e.getRaison_sociale_entreprise());
			ps.setString(2,e.getType_entreprise());
			ps.setString(3,e.getDescription_entreprise());
			ps.setInt(4,e.getTel_fixe_entreprise());
			ps.setInt(5,e.getTel_mobile_entreprise());
			ps.setInt(6,e.getTel_faxe_entreprise());
			ps.setString(7,e.getEmail_entreprise());
			ps.setString(8,e.getWeb_entreprise());
			ps.setInt(10,e.getEtat_tva());  
	            if(ps.executeUpdate()>0){
	                            System.out.println(" inty lenna2");
	                       JOptionPane.showMessageDialog(null,"Mofidier avec Succeess");
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            
	        } catch (ClassNotFoundException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			
		
		
	}

}
	public void DeleteEntreprise(Entreprise e)
	{
		 try {
	  	    	con=ConnectToDataBase.getConnection();
	  	    	PreparedStatement ps;
	  		 ps=con.prepareStatement("DELETE FROM `entreprise` WHERE`matricule`= ?");
	  		 ps.setString(1,e.getMatricule_fiscale_entreprise());
	  		 if(ps.executeUpdate()>0){
                 System.out.println(" inty lenna2");
                 	JOptionPane.showMessageDialog(null,"Supprimer avec Succeess");
	  		 	}
	  		 
	}catch(Exception ex) {
		
	} 
	}
}

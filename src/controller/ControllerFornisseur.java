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
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Fournisseur;

/**
 *
 * @author khairislama
 */
public class ControllerFornisseur {
    Connection con;
	   PreparedStatement ps;
	   ResultSet rs;
	public ControllerFornisseur() {
		// TODO Auto-generated constructor stub
	}
	public void ajouterFornisseur(Fournisseur f) throws ClassNotFoundException, SQLException
	{
		con=ConnectToDataBase.getConnection();
		ps=(PreparedStatement) con.prepareStatement("INSERT INTO `forniseur`(`Code`, `matricule`, `raison`, `type`, `fix`, `mobile`, `fax`, `email`, `web`, `etat`) VALUES (?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,f.getCode_fornisseur_client());
		ps.setString(2,f.getMatricule_fiscale_fornisseur_client());
		ps.setString(3,f.getRaison_sociale_fornisseur_client());
		ps.setString(4,f.getType_fornisseur_client());
		ps.setInt(5,f.getTel_fixe_fornisseur_client());
		ps.setInt(6,f.getTel_mobile_fornisseur_client());
		ps.setInt(7,f.getTel_faxe_fornisseur_client());
		ps.setString(8,f.getEmail_fornisseur_client());
		ps.setString(9,f.getWeb_fornisseur_client());
		ps.setInt(10,f.getEtat_tva_fornisseur_client()); 
		ps.executeUpdate();
		System.out.println(ps);
		if(ps.executeUpdate()>0)
			System.out.println("Ajouter Fornisseur Avec Success");
	
	}
	public void modifierFornisseur(Fournisseur f) {
	     try {
	  	    	con=ConnectToDataBase.getConnection();
	  	    	PreparedStatement ps;
	  		 ps=(PreparedStatement) con.prepareStatement("UPDATE `forniseur` SET `matricule`=?,`raison`=?,`type`=?,`fix`=?,`mobile`=?,`fax`=?,`email`=?,`web`=?,`etat`=? WHERE`Code`=?");
	  		ps.setString(10,f.getCode_fornisseur_client());
			ps.setString(1,f.getMatricule_fiscale_fornisseur_client());
			ps.setString(2,f.getRaison_sociale_fornisseur_client());
			ps.setString(3,f.getType_fornisseur_client());
			ps.setInt(4,f.getTel_fixe_fornisseur_client());
			ps.setInt(5,f.getTel_mobile_fornisseur_client());
			ps.setInt(6,f.getTel_faxe_fornisseur_client());
			ps.setString(7,f.getEmail_fornisseur_client());
			ps.setString(8,f.getWeb_fornisseur_client());
			ps.setInt(9,f.getEtat_tva_fornisseur_client()); 
			System.out.println(ps);
	            if(ps.executeUpdate()>0){
	                            
	                       JOptionPane.showMessageDialog(null,"Mofidier avec Succeess");
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            
	        } catch (ClassNotFoundException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			
		
		
	}

}
	public void DeleteFornisseur(Fournisseur f)
	{
		 try {
	  	    	con=ConnectToDataBase.getConnection();
	  	    	PreparedStatement ps;
	  		 ps=(PreparedStatement) con.prepareStatement("DELETE FROM `forniseur` WHERE`Code`= ?");
	  		 ps.setString(1,f.getCode_fornisseur_client());
	  		 System.out.println(ps);
	  		 if(ps.executeUpdate()>0){
               // System.out.println(" inty lenna2");
                	JOptionPane.showMessageDialog(null,"Supprimer avec Succeess");
	  		 	}
	  		 
	}catch(Exception ex) {
		
	} 
	}
	public  Fournisseur getAllFornisseur(String code)
	{
		Fournisseur forr=new Fournisseur();
		
		
		
		try {
			con=ConnectToDataBase.getConnection();
			String query = "SELECT * FROM `forniseur` WHERE code = '"+code+"'";
			
			                 Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{
				
				forr.setCode_fornisseur_client(rs.getString(1));
				forr.setMatricule_fiscale_fornisseur_client(rs.getString(2));
				forr.setRaison_sociale_fornisseur_client(rs.getString(3));
				forr.setType_fornisseur_client(rs.getString(4));
				forr.setTel_fixe_fornisseur_client(Integer.parseInt(rs.getString(5)));
				forr.setTel_mobile_fornisseur_client(Integer.parseInt(rs.getString(6)));
				forr.setTel_faxe_fornisseur_client(Integer.parseInt(rs.getString(7)));
				forr.setEmail_fornisseur_client(rs.getString(8));
				forr.setWeb_fornisseur_client(rs.getString(9));
				forr.setEtat_tva_fornisseur_client(Integer.parseInt(rs.getString(10)));
				
				
			}
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		return forr;
	}
	
	public Fournisseur getFornisseur() throws ClassNotFoundException, SQLException
	{
		Fournisseur forr=new Fournisseur();
	
		
		
		try {
			con=ConnectToDataBase.getConnection();
			String query = "SELECT * FROM `forniseur`";
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);System.out.println(st);
			System.out.println(rs);
			
			while(rs.next())
			{
				
				forr.setCode_fornisseur_client(rs.getString(1));
				forr.setMatricule_fiscale_fornisseur_client(rs.getString(2));
				forr.setRaison_sociale_fornisseur_client(rs.getString(3));
				forr.setType_fornisseur_client(rs.getString(4));
				forr.setTel_fixe_fornisseur_client(Integer.parseInt(rs.getString(5)));
				forr.setTel_mobile_fornisseur_client(Integer.parseInt(rs.getString(6)));
				forr.setTel_faxe_fornisseur_client(Integer.parseInt(rs.getString(7)));
				forr.setEmail_fornisseur_client(rs.getString(8));
				forr.setWeb_fornisseur_client(rs.getString(9));
				forr.setEtat_tva_fornisseur_client(Integer.parseInt(rs.getString(10)));
				
				
			}
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		return forr;
	}
	
	public void supprimmerFournisseur(JTable table) throws SQLException {
		// TODO Auto-generated method stub
		int row = table.getSelectedRow();
		String cell = table.getModel().getValueAt(row,0).toString();
		String sql = "DELETE FROM forniseur where code="+cell;
		
		
			try {
				con=ConnectToDataBase.getConnection();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		try
		{
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			pst.executeUpdate();
			System.out.println(pst);
			JOptionPane.showMessageDialog(null, "Supprimer Avec Success");
		
		}catch(Exception e)
		{
			e.getMessage();
			e.printStackTrace();
		}
		
	}
	public void verifier(Fournisseur fornisseur,String matricule) {

	    
	    try
	    {
	    	con=ConnectToDataBase.getConnection();
	    	System.out.println(fornisseur);
	    	System.out.println(matricule);
	        ps =con.prepareStatement("SELECT * FROM `forniseur` WHERE `matricule` ='"+ matricule +"'");
	        System.out.println(ps);  
	        ResultSet rs = ps.executeQuery();
	        System.out.println(!rs.next());
	        if (!rs.next())
	        {
	        			ajouterFornisseur(fornisseur);
 
	        } 
	        else
	        {			
	 	                JOptionPane.showMessageDialog(null,"Fornisseur Existe Deja...Verifier !!!");
	
	        }

	    } 

	    catch (SQLException ex) 
	    {
	        while (ex != null) 
	        {
	            ex.printStackTrace();
	            ex = ex.getNextException();
	        }
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
}

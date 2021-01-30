/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.ConnectToDataBase;
import database.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.FamilleProduit;
import model.Fournisseur;
import model.Produit;

/**
 *
 * @author khairislama
 */
public class ControllerProduit {
    Connection con;
	   PreparedStatement ps;
	   ResultSet rs;
	public ControllerProduit() {
		// TODO Auto-generated constructor stub
	}
	public void ajouterProduit(Produit p) throws ClassNotFoundException, SQLException
	{	
		con=ConnectToDataBase.getConnection();
		String query="INSERT INTO `produit`(`reference`, `designation`, `unite`, `fornisseur`, `famille_produit`, `stock`, `stock_min`, `prht`, `tva`)"
				+ "VALUES (?,?,?,?,?,?,?,?,?)";
	
		  ps =con.prepareStatement(query);
	      ps.setString (1, p.getReference_prod());
	      ps.setString (2, p.getDesignation_prod());
	      ps.setString (3, p.getUnite_mesure_prod());
	      ps.setString (4, p.getFornisseur_prod().getCode_fornisseur_client());
	      if(p.getFamilleProduit()!= null)
	      {
	    	  ps.setInt (5, p.getFamilleProduit().getCode_famille());
	      }else
	    	  ps.setInt (5, 0);
	      ps.setInt (6,p.getStock_prod());
	      if(p.getStock_min_prod()!=0)
  	      {
            	ps.setInt (7, p.getStock_min_prod());
  	      }else
  	    ps.setInt (7, 0);
	     
	      ps.setDouble(8, p.getPrix_unitaire_ht());
	      ps.setFloat(9,p.getTva_prod());
	      ps.executeUpdate();
	           JOptionPane.showMessageDialog(null,"Ajout� produit avec succes");
	      
			
	}
	
	public void modifierProduit(Produit p,String reference) {
	     try {
	  	    	con=ConnectToDataBase.getConnection();
	  	    	PreparedStatement ps;
	  		 ps=con.prepareStatement("UPDATE `produit` SET `designation`=?,`unite`=?,`fornisseur`=?,`famille_produit`=?,`stock`=?,`stock_min`=?,`prht`=?,`tva`=?  WHERE `reference`=?");
	  		ps.setString(9,reference);
			ps.setString(1,p.getDesignation_prod());
			ps.setString(2,p.getUnite_mesure_prod());
			ps.setString(3,p.getFornisseur_prod().getCode_fornisseur_client());
			ps.setInt(4,p.getFamilleProduit().getCode_famille());
			ps.setInt(5,p.getStock_prod());
			ps.setInt(6,p.getStock_min_prod());
			ps.setInt(7,p.getPrix_unitaire_ht());
			ps.setFloat(8,p.getTva_prod());
			ps.executeUpdate();
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
	public void modifierProduitfacture(Produit p,int stock) {
	     try {
	  	    	con=ConnectToDataBase.getConnection();
	  	    	PreparedStatement ps;
	  	    	System.out.println(stock);
	  		 ps=con.prepareStatement("UPDATE `produit` SET `stock`=?  WHERE `reference`=?");
	  		ps.setString(2,p.getReference_prod());
			ps.setInt(1, p.getStock_prod()+stock);
			
			ps.setInt(1,p.getStock_prod());
			ps.executeUpdate();
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
	public void DeleteProduit(Produit p)
	{
		 try {
	  	    	con=ConnectToDataBase.getConnection();
	  	    	PreparedStatement ps;
	  		 ps=con.prepareStatement("DELETE FROM `produit` WHERE `reference`= ?");
	  		 ps.setString(1,p.getReference_prod());
	  		 if(ps.executeUpdate()>0){
                	JOptionPane.showMessageDialog(null,"Supprimer avec Succeess");
	  		 	}
	  		 
	}catch(Exception ex) {
		
	} 
	}
	public static ResultSet getAllFamilleProduit() throws SQLException
	{
		ResultSet rs=null;
		String sql="SELECT * FROM `famille_produit`";
		rs=DataBaseConnection.executionQuerry(sql);
		return rs;
	}
	public static ResultSet getAllProduit() throws SQLException
	{
		ResultSet rs=null;
		String sql="SELECT * FROM `produit`";
		rs=DataBaseConnection.executionQuerry(sql);
		return rs;
	}
	 public void completeTable(JTable table,String valueToSearch) throws ClassNotFoundException{

	    	
	        try {
	        	con=ConnectToDataBase.getConnection();
	       ps=con.prepareStatement("SELECT * FROM `produit` WHERE `reference`=?");
	       ps.setString(1, "%"+valueToSearch+"%");
	       ResultSet rs=ps.executeQuery();
	                   DefaultTableModel model=(DefaultTableModel)table.getModel();
	       Object[] row;
	       while(rs.next()){
	       row=new Object[9];
	       row[1]=rs.getString(1);
	       row[2]=rs.getString(2);
	       row[3]=rs.getString(3);
	       row[4]=rs.getString(4);
	       row[5]=rs.getString(5);
	       row[6]=rs.getString(6);
	       row[7]=rs.getString(7);
	       row[8]=rs.getString(8);
	       row[9]=rs.getString(9);
	       
	       model.addRow(row);
	       
	       }
	        
	        } catch (SQLException ex) {
	          
	        }
	    
	    }
	 public Produit getallProduit(String reference)
		{
			Produit produit = new Produit();
			ControllerFornisseur cf=new ControllerFornisseur();
			ControllerFamilleProduit cfp=new ControllerFamilleProduit();
			try {
			con=ConnectToDataBase.getConnection();
			 String query = "SELECT * FROM produit  WHERE reference =?";
			  ps=con.prepareStatement(query);
			 	ps.setString(1, reference);
				                        Statement stmt = con.createStatement();
				ResultSet rs=ps.executeQuery(query);
				
				while(rs.next())
				{
					
					produit.setReference_prod(rs.getString(1));
					produit.setDesignation_prod(rs.getString(2));
					produit.setUnite_mesure_prod(rs.getString(3));
					                               Fournisseur code=cf.getAllFornisseur(rs.getString(1));
					produit.setFornisseur_prod(code);
					                               FamilleProduit familleProduit = cfp.recupererFamilleProduit(Integer.parseInt(rs.getString(1)));
					produit.setFamilleProduit(familleProduit);
					produit.setStock_prod(Integer.parseInt(rs.getString(6)));
					produit.setStock_min_prod(Integer.parseInt(rs.getString(7)));
					produit.setPrix_unitaire_ht(Integer.parseInt(rs.getString(8)));
					produit.setTva_prod(Float.parseFloat(rs.getString(9)));
				}
			}catch(Exception e)
			{
				System.out.println(e);
				
			}
			
			return produit;
			
		}
	 public void modifierProduitt(String reference, Produit produit) throws SQLException {
			// TODO Auto-generated method stub
			
			String sql = "UPDATE produit SET stock=? WHERE reference= "+reference;
			try {
			con=ConnectToDataBase.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt (1,produit.getStock_prod());
			ps.execute();
			
				JOptionPane.showMessageDialog(null, "UPDATED succefully");
			
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
		}
	 public void verifierProduit (Produit p,String reference) {

		    
		    try
		    {
		    	con=ConnectToDataBase.getConnection();

		        ps =con.prepareStatement("SELECT * FROM `produit` WHERE `reference` ='"+ reference +"'");
		        ResultSet rs = ps.executeQuery();
		        if (!rs.next())
		        {
		        	con=ConnectToDataBase.getConnection();
		        	String query="INSERT INTO `produit`(`reference`, `designation`, `unite`, `fornisseur`, `famille_produit`, `stock`, `stock_min`, `prht`, `tva`)"
						+ "VALUES (?,?,?,?,?,?,?,?,?)";
			
				  ps =con.prepareStatement(query);
			      ps.setString (1, p.getReference_prod());
			      ps.setString (2, p.getDesignation_prod());
			      ps.setString (3, p.getUnite_mesure_prod());
			      ps.setString (4, p.getFornisseur_prod().getCode_fornisseur_client());
			      if(p.getFamilleProduit()!= null)
			      {
			    	  ps.setInt (5, p.getFamilleProduit().getCode_famille());
			      }else
			    	  ps.setInt (5, 0);
			      ps.setInt (6,p.getStock_prod());
			      if(p.getStock_min_prod()!=0)
		  	      {
		            	ps.setInt (7, p.getStock_min_prod());
		  	      }else
		  	    ps.setInt (7, 0);
			     
			      ps.setDouble(8, p.getPrix_unitaire_ht());
			      ps.setFloat(9,p.getTva_prod());
			      ps.executeUpdate();
			      JOptionPane.showMessageDialog(null,"Ajout� produit avec succes");

		        } 
		        else
		        {			
		 	                JOptionPane.showMessageDialog(null,"produit Existe Deja...Verifier !!!");
		
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

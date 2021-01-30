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
import model.FamilleProduit;

/**
 *
 * @author khairislama
 */
public class ControllerFamilleProduit {
    Connection con;
	   PreparedStatement ps;
	   ResultSet rs;
	public ControllerFamilleProduit() {
		// TODO Auto-generated constructor stub
	}
	public void AjouterFamilleProduit(FamilleProduit fp) {
		try {
			con=ConnectToDataBase.getConnection();
			ps=con.prepareStatement("INSERT INTO `famille_produit`(`code_num`, `designation`) VALUES (?,?)");
			ps.setInt(1,fp.getCode_famille());
			ps.setString(2,fp.getDesignation_famille());
			ps.executeUpdate();
			System.out.println(ps);
			if(ps.executeUpdate()>0){
	                           JOptionPane.showMessageDialog(null,"Ajouter avec Succeess");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}
	public FamilleProduit recupererFamilleProduit(int codeFamilleProduit)
	{
		FamilleProduit familleProduit= new FamilleProduit();
		
		try {
			con=ConnectToDataBase.getConnection();
	
		String query = "SELECT * FROM `famille_produit`  WHERE code_num  = '"+codeFamilleProduit+"' ";
						

			                 Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(query);

			
			if(rs.next())
			{
				familleProduit.setCode_famille(Integer.parseInt(rs.getString(1)));
				familleProduit.setDesignation_famille(rs.getString(2));
			}
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		return familleProduit;
		
	}
}

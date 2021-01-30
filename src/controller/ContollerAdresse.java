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
import model.Adresse;

/**
 *
 * @author khairislama
 */
public class ContollerAdresse {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
 public ContollerAdresse() {
         // TODO Auto-generated constructor stub
 }
 public void AjouterAdresse(Adresse ad) throws ClassNotFoundException, SQLException {
         con=ConnectToDataBase.getConnection();
         ps=con.prepareStatement("INSERT INTO `adresse`(`numero`, `libelle`, `ville`, `codepostal`, `gouvernorat`, `pays`, `id_e`) VALUES (?,?,?,?,?,?,?)");
         ps.setInt(1,ad.getNumero_rue());
         ps.setString(2,ad.getLibelle_rue());
         ps.setString(3,ad.getVille());
         ps.setInt(4,ad.getCode_postale());
         ps.setString(5,ad.getGouvernorat());
         ps.setString(6,ad.getPays());
         ps.setString(7,ad.getId_e());
         ps.executeUpdate();
         if(ps.executeUpdate()>0){

         }		
 }
}

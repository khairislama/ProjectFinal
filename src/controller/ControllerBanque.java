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
import model.Banque;

/**
 *
 * @author khairislama
 */
public class ControllerBanque {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
 public ControllerBanque() {
         // TODO Auto-generated constructor stub
 }
 public void AjouterBanque(Banque b) throws ClassNotFoundException, SQLException {
         con=ConnectToDataBase.getConnection();
         ps=con.prepareStatement("INSERT INTO `banque`(`banque`, `agence`, `rib`, `id_e`) VALUES (?,?,?,?)");
         ps.setString(1,b.getBanque());
         ps.setString(2,b.getAgence());
         ps.setInt(3,b.getRib());
         ps.setString(4,b.getId_e());
         ps.executeUpdate();
         if(ps.executeUpdate()>0){
   }
 }
}

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
import model.Client;

/**
 *
 * @author khairislama
 */
public class ControllerClient {
    Connection con;
    PreparedStatement ps,ps1;
    ResultSet rs;
    
    public ControllerClient() {
            // TODO Auto-generated constructor stub
    }
    
    public void ajouterClinet(Client c) throws ClassNotFoundException, SQLException
    {
            con=ConnectToDataBase.getConnection();
            ps=con.prepareStatement("INSERT INTO `client`(`CodeC`, `matricule`, `raison`, `type`, `fix`, `mobile`, `fax`, `email`, `web`, `etat`) VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,c.getCode_fornisseur_client());
            ps.setString(2,c.getMatricule_fiscale_fornisseur_client());
            ps.setString(3,c.getRaison_sociale_fornisseur_client());
            ps.setString(4,c.getType_fornisseur_client());
            ps.setInt(5,c.getTel_fixe_fornisseur_client());
            ps.setInt(6,c.getTel_mobile_fornisseur_client());
            ps.setInt(7,c.getTel_faxe_fornisseur_client());
            ps.setString(8,c.getEmail_fornisseur_client());
            ps.setString(9,c.getWeb_fornisseur_client());
            ps.setInt(10,c.getEtat_tva_fornisseur_client()); 
            ps.executeUpdate();

            
    }
    
    public void modifierClient(Client c) {
         try {
                    con=ConnectToDataBase.getConnection();
                    PreparedStatement ps;
                     ps=con.prepareStatement("UPDATE `client` SET `matricule`=?,`raison`=?,`type`=?,`fix`=?,`mobile`=?,`fax`=?,`email`=?,`web`=?,`etat`=? WHERE `CodeC`=?");
                    ps.setString(10,c.getCode_fornisseur_client());
                    ps.setString(1,c.getMatricule_fiscale_fornisseur_client());
                    ps.setString(2,c.getRaison_sociale_fornisseur_client());
                    ps.setString(3,c.getType_fornisseur_client());
                    ps.setInt(4,c.getTel_fixe_fornisseur_client());
                    ps.setInt(5,c.getTel_mobile_fornisseur_client());
                    ps.setInt(6,c.getTel_faxe_fornisseur_client());
                    ps.setString(7,c.getEmail_fornisseur_client());
                    ps.setString(8,c.getWeb_fornisseur_client());
                    ps.setInt(9,c.getEtat_tva_fornisseur_client()); 
                if(ps.executeUpdate()>0){

                    JOptionPane.showMessageDialog(null,"Mofidier avec Succeess");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());

            } catch (ClassNotFoundException ex) {

                ex.printStackTrace();
            }

    }
    public void DeleteClient(Client c)
    {
             try {
                    con=ConnectToDataBase.getConnection();
                    PreparedStatement ps;
                    String codee= c.getCode_fornisseur_client();
                    System.out.println(codee);
                     ps=con.prepareStatement("DELETE FROM `client` WHERE`codeC`= ?");
                     ps.setString(1,c.getCode_fornisseur_client());


                     System.out.println(ps);
                     if(ps.executeUpdate()>0){

                    JOptionPane.showMessageDialog(null,"Supprimer avec Succeess");
                            }

    }catch(Exception ex) {

    } 
    }
    public void verifierClient(Client client,String matricule) {


        try
        {
            con=ConnectToDataBase.getConnection();
            ps =con.prepareStatement("SELECT * FROM `client` WHERE `matricule`='"+matricule+"'");
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) 
            {
                    ps1=con.prepareStatement("INSERT INTO `client`(`CodeC`, `matricule`, `raison`, `type`, `fix`, `mobile`, `fax`, `email`, `web`, `etat`) VALUES (?,?,?,?,?,?,?,?,?,?)");
                    ps1.setString(1,client.getCode_fornisseur_client());
                    ps1.setString(2,client.getMatricule_fiscale_fornisseur_client());
                    ps1.setString(3,client.getRaison_sociale_fornisseur_client());
                    ps1.setString(4,client.getType_fornisseur_client());
                    ps1.setInt(5,client.getTel_fixe_fornisseur_client());
                    ps1.setInt(6,client.getTel_mobile_fornisseur_client());
                    ps1.setInt(7,client.getTel_faxe_fornisseur_client());
                    ps1.setString(8,client.getEmail_fornisseur_client());
                    ps1.setString(9,client.getWeb_fornisseur_client());
                    ps1.setInt(10,client.getEtat_tva_fornisseur_client()); 
                    ps1.executeUpdate();
                    JOptionPane.showMessageDialog(null,"ajouter avec Success");

            } 
            else
            {			
                            JOptionPane.showMessageDialog(null,"Client Existe Deja...Verifier !!!");

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

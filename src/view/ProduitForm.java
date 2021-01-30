/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFamilleProduit;
import controller.ControllerFornisseur;
import controller.ControllerProduit;
import database.ConnectToDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produit;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author khairislama
 */
public class ProduitForm extends javax.swing.JFrame {
    
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    PreparedStatement pst;

    /**
     * Creates new form ProduitForm
     */
    public ProduitForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produitTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        reference = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        uniter = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        stockmini = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        prixunitaire = new javax.swing.JTextField();
        tva = new javax.swing.JTextField();
        fournisseurs = new javax.swing.JComboBox<>();
        familleProduit = new javax.swing.JComboBox<>();
        ajouterfamille = new javax.swing.JButton();
        ajouterproduit = new javax.swing.JButton();
        update = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        actualiser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        produitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Reference", "Designation", "Uniter", "Fournisseur", "Famille produit", "stock", "stock minimal", "prix unitaire", "TVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        produitTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produitTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(produitTable);

        jLabel1.setText("Reference");

        jLabel2.setText("Designation");

        jLabel3.setText("Uniter");

        jLabel4.setText("Stock");

        jLabel5.setText("Stock minimal");

        jLabel6.setText("Fournisseur");

        jLabel7.setText("Famille produit");

        jLabel8.setText("prix unitaire");

        jLabel9.setText("TVA");

        fournisseurs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        familleProduit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ajouterfamille.setText("Ajouter famille");
        ajouterfamille.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterfamilleMouseClicked(evt);
            }
        });

        ajouterproduit.setText("Ajouter produit");
        ajouterproduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterproduitMouseClicked(evt);
            }
        });

        update.setText("Update produit");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        supprimer.setText("Supprimer produit");
        supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerMouseClicked(evt);
            }
        });

        actualiser.setText("Actualiser");
        actualiser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualiserMouseClicked(evt);
            }
        });
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stockmini))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(68, 68, 68)
                        .addComponent(stock))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64)
                        .addComponent(uniter))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(designation))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(reference, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(prixunitaire)
                    .addComponent(tva)
                    .addComponent(fournisseurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familleProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajouterfamille)
                    .addComponent(ajouterproduit)
                    .addComponent(update)
                    .addComponent(supprimer)
                    .addComponent(actualiser))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(reference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(fournisseurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(familleProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(uniter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(prixunitaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ajouterfamille)
                        .addGap(18, 18, 18)
                        .addComponent(ajouterproduit)
                        .addGap(18, 18, 18)
                        .addComponent(update)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(tva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(stockmini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(supprimer)
                        .addGap(18, 18, 18)
                        .addComponent(actualiser)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterproduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterproduitMouseClicked
        // TODO add your handling code here:
        String reference=this.reference.getText();
        String designation=this.designation.getText();
        String unite=uniter.getText();
        String fournisseur=fournisseurs.getSelectedItem().toString();
        int famille=Integer.valueOf(familleProduit.getSelectedItem().toString());
        String stocktest=stock.getText();

        if(isIntegerException(stocktest)==true) {
        }
        else {
            JOptionPane.showMessageDialog(null, "entrer un nombre");
        }
        int stock=Integer.valueOf(this.stock.getText());
        int stock_m=Integer.valueOf(stockmini.getText());
        int prix=Integer.valueOf(prixunitaire.getText());
        Float tva=Float.valueOf(this.tva.getText());
        ControllerProduit cp=new ControllerProduit();
        ControllerFamilleProduit cfp=new ControllerFamilleProduit();
        ControllerFornisseur cf=new ControllerFornisseur();
        Produit p=new Produit();
        p.setReference_prod(reference);
        p.setDesignation_prod(designation);
        p.setUnite_mesure_prod(unite);
                p.setFornisseur_prod(cf.getAllFornisseur(fournisseur));
        p.setFamilleProduit(cfp.recupererFamilleProduit(famille));
        p.setStock_prod(stock);
        p.setStock_min_prod(stock_m);
        p.setPrix_unitaire_ht(prix);
        p.setTva_prod(tva);
        if((stock_m>stock)) {
                JOptionPane.showMessageDialog(null,"stock min doit inferieur a stock");
        }else if(reference.isEmpty())
                JOptionPane.showMessageDialog(null,"remplir champs reference SVP....");
        else {
                cp.verifierProduit(p, reference);
        }
    }//GEN-LAST:event_ajouterproduitMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        String reference=this.reference.getText();
        String designation=this.designation.getText();
        String unite=uniter.getText();
        String fournisseur=fournisseurs.getSelectedItem().toString();
        int famille=Integer.valueOf(familleProduit.getSelectedItem().toString());
        int stock=Integer.valueOf(this.stock.getText());
        int stock_m=Integer.valueOf(stockmini.getText());
        int prix=Integer.valueOf(prixunitaire.getText());
        float tva=Float.valueOf(this.tva.getText());
        ControllerFamilleProduit cfp=new ControllerFamilleProduit();
        ControllerFornisseur cf=new ControllerFornisseur();
        Produit p=new Produit();
        p.setReference_prod(reference);
        p.setDesignation_prod(designation);
        p.setUnite_mesure_prod(unite);

                p.setFornisseur_prod(cf.getAllFornisseur(fournisseur));

        p.setFamilleProduit(cfp.recupererFamilleProduit(famille));
        p.setStock_prod(stock);
        p.setStock_min_prod(stock_m);
        p.setPrix_unitaire_ht(prix);
        p.setTva_prod(tva);
        ControllerProduit cp=new ControllerProduit();
        verifstock(stock,stock_m);
        cp.modifierProduit(p,reference);
    }//GEN-LAST:event_updateMouseClicked

    private void supprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMouseClicked
        // TODO add your handling code here:
        String reference=this.reference.getText();
        Produit p=new Produit();
        p.setReference_prod(reference);
        ControllerProduit cp =new ControllerProduit();
        cp.DeleteProduit(p);
    }//GEN-LAST:event_supprimerMouseClicked

    private void actualiserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualiserMouseClicked
        // TODO add your handling code here:
        try {
                con=ConnectToDataBase.getConnection();
                st=con.createStatement();
                rs=st.executeQuery("SELECT `reference`, `designation`, `unite`, `fornisseur`, `famille_produit`, `stock`, `stock_min`, `prht`, `tva` FROM produit");
                produitTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e) {

        }
        
    }//GEN-LAST:event_actualiserMouseClicked

    private void ajouterfamilleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterfamilleMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        FamilleProduitForm fp=new FamilleProduitForm();
        
        fp.setVisible(true);
    }//GEN-LAST:event_ajouterfamilleMouseClicked

    private void produitTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produitTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) produitTable.getModel();
        int index=produitTable.getSelectedRow();
        reference.setText(model.getValueAt(index,0).toString());
        designation.setText(model.getValueAt(index,1).toString());
        uniter.setText(model.getValueAt(index,2).toString());
        //box_fournisseur.setSelectedItem((model.getValueAt(index,3).toString()));
        familleProduit.setSelectedItem((model.getValueAt(index,4).toString()));
        stock.setText(model.getValueAt(index,5).toString());
        stockmini.setText(model.getValueAt(index,6).toString());
        prixunitaire.setText(model.getValueAt(index,7).toString());
        tva.setText(model.getValueAt(index,8).toString()) ;
    }//GEN-LAST:event_produitTableMouseClicked

    private void actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs=model.Fournisseur.getAllFournisseur();
            while(rs.next())
            {
                    fournisseurs.addItem(rs.getString("code_fc"));
            }
        } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        try {
                ResultSet rs=ControllerProduit.getAllFamilleProduit();
                while(rs.next())
                {
                        familleProduit.addItem(rs.getString("code_famille"));
                }
        } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }//GEN-LAST:event_actualiserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProduitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProduitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProduitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProduitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProduitForm pf = new ProduitForm();
                
                pf.setVisible(true);
            }
        });
    }
    public static boolean isStringInteger(String var, int radix) {
        if( var ==null) return false;           //Check if the string is empty
        for(int i = 0; i < (var.length()); i++) {
            if(i == 0 && (var.charAt(i) == '-')) {     //Check for negative Integers
                if(var.length() == 1) return false;
                else continue;
            }
            if(Character.digit(var.charAt(i),radix) < 0) return false;
        }
        return true;
    }
	 private static boolean isIntegerException(String val) {
 	    try {
 	        Integer.valueOf(val);
 	        return !val.startsWith("-");
 	    } catch (NumberFormatException e) {
 	        return false;
 	    }
 	}
	 public void verifstock(int stock,int stockmin) {
		 if(stock<stockmin) {
			 JOptionPane.showMessageDialog(null, "stock Bientot epuis�");
		 }
	 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualiser;
    private javax.swing.JButton ajouterfamille;
    private javax.swing.JButton ajouterproduit;
    private javax.swing.JTextField designation;
    private javax.swing.JComboBox<String> familleProduit;
    private javax.swing.JComboBox<String> fournisseurs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField prixunitaire;
    private javax.swing.JTable produitTable;
    private javax.swing.JTextField reference;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField stockmini;
    private javax.swing.JButton supprimer;
    private javax.swing.JTextField tva;
    private javax.swing.JTextField uniter;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

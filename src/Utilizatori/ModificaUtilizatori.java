/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilizatori;

import clase.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author TechSolutions
 */
public class ModificaUtilizatori extends javax.swing.JFrame {
    Connection connect = DBConnection.getDbCon().connect;
    PreparedStatement ps = null;
    static ResultSet rs = null;
    /**
     * Creates new form ModificaUtilizatori
     */
    public ModificaUtilizatori() throws SQLException {
        initComponents();
        Insert_Table();
    }
    
    private void Insert_Table() throws SQLException{
        try{
        String sql = "Select utilizator, parola, nume, prenume, telefon, adresa, functie, cnp from utilizatori";
         PreparedStatement ps = connect.prepareStatement(sql);
        rs = ps.executeQuery();
        jTableModificaUtilizatori.setModel(DbUtils.resultSetToTableModel(rs));
      // Update_table();
        
       
        }
        catch(SQLException ExSQL){
            JOptionPane.showMessageDialog(null, ExSQL);
        }
    }
    private void Update_table() throws SQLException{
        String sql = "Insert into utilizatori (utilizator)" /*, parola, nume,prenume,telefon,adresa,functie,cnp */
                + "values(?)";
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setString(1, jTableModificaUtilizatori.getName());
             
                ps.executeUpdate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModificaUtilizatori = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableModificaUtilizatori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Utilizator", "Parola", "Nume", "Prenume", "Telefon", "Adresa", "Functie", "CNP"
            }
        ));
        jTableModificaUtilizatori.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTableModificaUtilizatori);
        jTableModificaUtilizatori.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ModificaUtilizatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificaUtilizatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificaUtilizatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificaUtilizatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificaUtilizatori().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificaUtilizatori.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModificaUtilizatori;
    // End of variables declaration//GEN-END:variables
}

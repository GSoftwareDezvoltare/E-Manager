/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jucator;
import clase.DBConnection;
import clase.Jucator;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author TechSolutions
 */
public class ModificaJucator extends javax.swing.JFrame {
    Connection connect = DBConnection.getDbCon().connect;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    /**
     * Creates new form ModificaJucator
     */
    public ModificaJucator() {
        initComponents();
        InserareJucator();
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnModificaDateJucator = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbModificaJucator = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Aplicatie Manangement - Modifica Jucator");

        jbtnModificaDateJucator.setText("Modifica");
        jbtnModificaDateJucator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificaDateJucatorActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecteaza jucatorul pe care doresti sa il modifici din combo box-ul de mai jos");

        jcbModificaJucator.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alege Jucator" }));
        jcbModificaJucator.setToolTipText("");
        jcbModificaJucator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModificaJucatorActionPerformed(evt);
            }
        });

        jLabel2.setText("Dupa ce ai selectat jucatorul dorit apasa click pe butonul de modificare, de mai jos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jcbModificaJucator, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jbtnModificaDateJucator))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcbModificaJucator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jbtnModificaDateJucator)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jcbModificaJucator.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbModificaJucatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbModificaJucatorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcbModificaJucatorActionPerformed

    private void jbtnModificaDateJucatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificaDateJucatorActionPerformed
        // TODO add your handling code here:
        ModificaDateJucator mdj = new ModificaDateJucator();
        mdj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jbtnModificaDateJucatorActionPerformed

    private void InserareJucator(){
        try{
            String sql="Select * from jucator";
            ps=connect.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt("id");
                String denumire =rs.getString("nume");
                jcbModificaJucator.insertItemAt(denumire, id);
              
                        
            }
        }
       
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
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
            java.util.logging.Logger.getLogger(ModificaJucator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificaJucator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificaJucator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificaJucator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaJucator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnModificaDateJucator;
    public static javax.swing.JComboBox jcbModificaJucator;
    // End of variables declaration//GEN-END:variables
}

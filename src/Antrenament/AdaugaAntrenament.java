/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antrenament;

import MainSiLogin.Login;
import clase.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 *
 * @author TechSolutions
 */
public class AdaugaAntrenament extends javax.swing.JFrame {

    Connection connect = DBConnection.getDbCon().connect;
    PreparedStatement ps = null;
    static ResultSet rs = null;
    static ResultSet rs2 = null;
    static int id_grupa = 0;
    DefaultListModel m = new DefaultListModel();

    /**
     * Creates new form AdaugaAntrenament
     */
    public AdaugaAntrenament(){
        initComponents();
        PopuleazaGrupa();
        PopuleazaArbore();
        afisareIDGrupa();
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
        jcbxGrupa = new javax.swing.JComboBox();
        jbtnPasul2_AdaugaAntrenament = new javax.swing.JButton();
        jbtnAnuleaza_AdaugaAntrenament = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("E-Management - Adauga Antrenament");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Antrenament"));

        jcbxGrupa.setToolTipText("");

        jbtnPasul2_AdaugaAntrenament.setText("Pasul 2");
        jbtnPasul2_AdaugaAntrenament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasul2_AdaugaAntrenamentActionPerformed(evt);
            }
        });

        jbtnAnuleaza_AdaugaAntrenament.setText("Anuleaza");
        jbtnAnuleaza_AdaugaAntrenament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAnuleaza_AdaugaAntrenamentActionPerformed(evt);
            }
        });

        jTree1.setBorder(javax.swing.BorderFactory.createTitledBorder("Antrenamente de baza"));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jcbxGrupa, 0, 348, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnAnuleaza_AdaugaAntrenament)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnPasul2_AdaugaAntrenament)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbxGrupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPasul2_AdaugaAntrenament)
                    .addComponent(jbtnAnuleaza_AdaugaAntrenament))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PopuleazaArbore() {
        try {
            ArrayList lista_antrenamente = new ArrayList();
            lista_antrenamente.add("Lista Antrenamente");
            String sql = "SELECT * FROM antrenament_categorii";
            ps = connect.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Object value[] = {rs.getString(1), rs.getString(2)};
                lista_antrenamente.add(value);
            }
            Object hierarchy[] = lista_antrenamente.toArray();
            DefaultMutableTreeNode root = processHierarchy(hierarchy);

            DefaultTreeModel treeModel = new DefaultTreeModel(root);
            jTree1.setShowsRootHandles(false);

            jTree1.setModel(treeModel);
        } catch (SQLException ExSQL) {
            JOptionPane.showMessageDialog(null, ExSQL);
        }
    }

    private DefaultMutableTreeNode processHierarchy(Object[] hierarchy) {
        DefaultMutableTreeNode result = new DefaultMutableTreeNode(hierarchy[0]);
        System.out.println("Result = " + result.toString());
        try {
            int rowNumbers = 0;
            int i = 0;
            String sql = "SELECT * FROM antrenament_categorii";
            PreparedStatement ps = connect.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                rowNumbers = rs.getRow();
            }
            String arrayOfNames[] = new String[rowNumbers];
            String arrayOfIds[] = new String[rowNumbers];
            ps = connect.prepareStatement(sql);

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                arrayOfNames[i] = resultSet.getString("denumire");
                arrayOfIds[i] = resultSet.getString("id");
                i++;
            }

            DefaultMutableTreeNode child = null, grand = null, child2 = null;

            for (int grandIndex = 0; grandIndex < arrayOfNames.length; grandIndex++) {
                grand = new DefaultMutableTreeNode(arrayOfNames[grandIndex]);
                System.out.println("Create grand = " + grand.toString());

                String sql2 = "Select * from antrenamente_subcategorii where id_categorie ='" + arrayOfIds[grandIndex] + "'";
                System.out.println("arrayOfIds[grandIndex] = " + arrayOfIds[grandIndex]);
                ps = connect.prepareStatement(sql2);
                ResultSet rs2 = ps.executeQuery();
                Map<String, DefaultMutableTreeNode> mapOfChildNodes = new HashMap<>();
                while (rs2.next()) {
                    child = new DefaultMutableTreeNode(rs2.getString("denumire"));
                    System.out.println("Grand = " + grand.toString() + " child = " + child.toString());
                    grand.add(child);
                    System.out.println("add to map key = " + arrayOfIds[grandIndex] + " Value = " + child.toString());
                    mapOfChildNodes.put(rs2.getString("id_subcategorie"), child);
                }

                for (Map.Entry<String, DefaultMutableTreeNode> entryGrandNode : mapOfChildNodes.entrySet()) {
                    String sql3 = "Select denumire from antrenamente_subcategoriicopil where id='" + entryGrandNode.getKey() + "'";

                    ps = connect.prepareStatement(sql3);
                    ResultSet rs3 = ps.executeQuery();
                    while (rs3.next()) {
                        child2 = new DefaultMutableTreeNode(rs3.getString("denumire"));
                        if (entryGrandNode.getValue() != null) {
                            System.out.println("Parent = " + entryGrandNode.getValue().toString() + " child = " + child2.toString());
                            entryGrandNode.getValue().add(child2);
                        }
                    }

                }
                result.add(grand);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private void PopuleazaGrupa() {
        try {
            String utilizator = Login.rs.getString("utilizator");
            String sql = "Select `u`.`grupa`,`g`.`denumire` from `utilizatori` `u` LEFT JOIN grupe g on g.id_grupa=u.grupa where utilizator='" + utilizator + "'";
            System.out.println(sql);
            ps = connect.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String denumire = rs.getString("denumire");
                jcbxGrupa.addItem(denumire);
            }

        } catch (SQLException exip) {
            JOptionPane.showMessageDialog(null, exip);
        }
    }

    private void afisareIDGrupa() {
        String sql2 = "Select id_grupa from grupe where denumire=?";
        try {
        ps = connect.prepareStatement(sql2);
        String denumire = jcbxGrupa.getSelectedItem().toString();
        ps.setString(1, denumire);
        rs2 = ps.executeQuery();
        while (rs2.next()) {
        id_grupa = rs2.getInt("id_grupa");
         
       }
        } catch (SQLException ex) {
            Logger.getLogger(Pasul2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void jbtnPasul2_AdaugaAntrenamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasul2_AdaugaAntrenamentActionPerformed
            Pasul2 p2;
        try {
            p2 = new Pasul2();
        
            p2.setVisible(true);
            setVisible(false);
            } catch (SQLException ex) {
            Logger.getLogger(AdaugaAntrenament.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtnPasul2_AdaugaAntrenamentActionPerformed

    private void jbtnAnuleaza_AdaugaAntrenamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnuleaza_AdaugaAntrenamentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jbtnAnuleaza_AdaugaAntrenamentActionPerformed

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
            java.util.logging.Logger.getLogger(AdaugaAntrenament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdaugaAntrenament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdaugaAntrenament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdaugaAntrenament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new AdaugaAntrenament().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton jbtnAnuleaza_AdaugaAntrenament;
    private javax.swing.JButton jbtnPasul2_AdaugaAntrenament;
    public static javax.swing.JComboBox jcbxGrupa;
    // End of variables declaration//GEN-END:variables

}

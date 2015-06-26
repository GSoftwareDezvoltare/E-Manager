/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jucator;

import clase.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import clase.Jucator;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import javax.swing.JMenu;

/**
 *
 * @author TechSolutions
 */
public class AdaugaJucator extends javax.swing.JFrame {
   Connection connect = DBConnection.getDbCon().connect;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Jucator jucator = new Jucator(); 
    private JMenu jMenu1;
    
    /**
     * Creates new form AdaugaJucator
     */
    public AdaugaJucator() {
        initComponents();
        InserareGrupa();
        InserarePost();
    
    
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
        jbtnAdaugaJucator = new javax.swing.JButton();
        jbtnExitJucator = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfnume = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfprenume = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfcnp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaadresa = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jcbgrupa = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfnumetata = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfnumemama = new javax.swing.JTextField();
        jcbpost = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jtftelefon = new javax.swing.JTextField();

        setTitle("Aplicatie Manangement - Adauga Jucator");
        setMinimumSize(new java.awt.Dimension(670, 330));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Adauga Jucator", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Constantia", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 300));

        jbtnAdaugaJucator.setText("Adauga");
        jbtnAdaugaJucator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdaugaJucatorActionPerformed(evt);
            }
        });

        jbtnExitJucator.setText("Exit");
        jbtnExitJucator.setMaximumSize(new java.awt.Dimension(69, 23));
        jbtnExitJucator.setMinimumSize(new java.awt.Dimension(69, 23));
        jbtnExitJucator.setPreferredSize(new java.awt.Dimension(69, 23));
        jbtnExitJucator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitJucatorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Nume:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Prenume:");
        jLabel2.setMaximumSize(new java.awt.Dimension(37, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(37, 17));
        jLabel2.setPreferredSize(new java.awt.Dimension(37, 17));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("CNP:");
        jLabel3.setMaximumSize(new java.awt.Dimension(37, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(37, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(37, 17));

        jLabel4.setText("Adresa:");

        jtaadresa.setColumns(20);
        jtaadresa.setRows(5);
        jtaadresa.setAutoscrolls(false);
        jScrollPane1.setViewportView(jtaadresa);

        jLabel5.setText("Grupa:");

        jcbgrupa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alege Grupa" }));

        jLabel6.setText("Post:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Nume Tata:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Nume Mama:");

        jcbpost.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alege Post" }));

        jLabel9.setText("Telefon:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfcnp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jcbpost, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfnume))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbgrupa, 0, 218, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfprenume, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(jtfnumetata)
                                .addComponent(jtfnumemama))
                            .addComponent(jtftelefon))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnAdaugaJucator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnExitJucator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfnume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfprenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcnp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfnumetata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfnumemama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbgrupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAdaugaJucator)
                    .addComponent(jbtnExitJucator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitJucatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitJucatorActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jbtnExitJucatorActionPerformed

    private void jbtnAdaugaJucatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdaugaJucatorActionPerformed
        // TODO add your handling code here:

        //verificare camp nume
        if(jtfnume.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Va rugam completati numele jucatorului");
        }
        else
        //verificare camp prenume
        if(jtfprenume.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Va rugam completati prenumele jucatorului");
        }
        else
        //limitare cnp
        if(jtfcnp.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Va rugam sa completati cnp-ul jucatorului");
        }
        else
        //verificare lungime cnp corespunzatoare
        if((jtfcnp.getText().length() < 13) || (jtfcnp.getText().length() > 13)){
            JOptionPane.showMessageDialog(null, "CNP-ul corect nu este valid, doarece nu respecta lungimea");
        }
        else
        //verificare camp adresa
        if(jtaadresa.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Va rugam sa completati adresa jucatorului");
        }
        else
        //verificare grupa jucator
        if(jcbgrupa.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Va rugam sa selectati grupa jucatorului din care face parte");
        }
        else
        if(jcbpost.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Va rugam sa selectati postul jucatorului");
        }
        else
        if(jtftelefon.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Va rugam sa completati numarul de telefon");
        }
        else    
        if(jtfnumetata.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Va rugam sa completati numele tatalui !");
        }
        else
        if(jtfnumemama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Va rugam sa completati numele mamei !");
        }
        else {
            jucator.setNume(jtfnume.getText());
            jucator.setPrenume(jtfprenume.getText());
            jucator.setCnp(jtfcnp.getText());
            jucator.setAdresa(jtaadresa.getText());
            jucator.setGrupa(jcbgrupa.getSelectedIndex());
            jucator.setPost(jcbpost.getSelectedIndex());
            jucator.setTelefon(jtftelefon.getText());
            jucator.setNume_tata(jtfnumetata.getText());
            jucator.setNume_mama(jtfnumemama.getText());
            System.out.println(jucator.Afisare());

            //apelare metoda insertbd
            InserareJucator();
            JOptionPane.showMessageDialog(null, "Jucatorul " + jucator.getNume() + " " + jucator.getPrenume() + " S-a adaugat cu succes in baza de date!");
            setVisible(false);
        }
    }//GEN-LAST:event_jbtnAdaugaJucatorActionPerformed

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
            java.util.logging.Logger.getLogger(AdaugaJucator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdaugaJucator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdaugaJucator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdaugaJucator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdaugaJucator().setVisible(true);
            }
        });
    }
    private void InserareGrupa(){
        try{
            String sql="Select * from grupe";
            ps=connect.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt("id_grupa");
                String denumire =rs.getString("denumire");
                jcbgrupa.insertItemAt(denumire, id);
              
                        
            }
        }
       
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    };
    
    //Functia inserarePost este apleata la deschiderea ferestrei si insereaza posturile din baza de date in combobox.
    private void InserarePost(){
        try{
            String sql = "Select * from posturi";
            ps=connect.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id_post");
                String denumire =rs.getString("denumire");
                jcbpost.insertItemAt(denumire, id);
            }
        }
        catch(Exception exip){
            JOptionPane.showMessageDialog(null, exip);
        }
    }
    //Functia InserareJucator este apelata pe butonul ok pentru inserare jucator in baza de date.
    private void InserareJucator(){
    String sql = "Insert into jucator(nume, prenume, cnp, adresa, id_grupa, id_post, nume_tata, nume_mama, telefon) "
                    + "VALUES (?, ?, ?, ?, ?, ?,  ?, ?, ?)";
            try {
                PreparedStatement ps = connect.prepareStatement(sql);
                ps.setString(1, jucator.getNume());
                ps.setString(2, jucator.getPrenume());
                ps.setString(3, jucator.getCnp());
                ps.setString(4, jucator.getAdresa());
                ps.setInt(5, jucator.getGrupa());
                ps.setInt(6, jucator.getPost());
                ps.setString(7, jucator.getNume_tata());
                ps.setString(8, jucator.getNume_mama());
                ps.setString(9, jucator.getTelefon());
                ps.executeUpdate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            } 
            try{
            rs.close();
            ps.close();
            System.out.println("Inchidere rs si ps!");
        }
        //exceptie inchidere bd
        catch(Exception eibd){
            JOptionPane.showMessageDialog(null, eibd);
        }
       /* finally{
            try{
                if(connect != null){
                    connect.close();
                     System.out.println("Inchidere conectiune bd.");
                }
            } 
            //exceptie inchidere conectiune bd
            catch(SQLException eclose){
            JOptionPane.showMessageDialog(null, eclose);
            }
        } */
    };
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdaugaJucator;
    private javax.swing.JButton jbtnExitJucator;
    private javax.swing.JComboBox jcbgrupa;
    private javax.swing.JComboBox jcbpost;
    private javax.swing.JTextArea jtaadresa;
    private javax.swing.JTextField jtfcnp;
    private javax.swing.JTextField jtfnume;
    private javax.swing.JTextField jtfnumemama;
    private javax.swing.JTextField jtfnumetata;
    private javax.swing.JTextField jtfprenume;
    private javax.swing.JTextField jtftelefon;
    // End of variables declaration//GEN-END:variables
}

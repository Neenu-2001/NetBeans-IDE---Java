
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author swlab
 */
public class Location_entry extends javax.swing.JFrame {

    /**
     * Creates new form Location_entry
     */
    ksebdb loc = new ksebdb();
    Statement locstmt;
    ResultSet locrst; 
    DefaultTableModel model = new DefaultTableModel();
    public Location_entry() {
        initComponents();
        model.addColumn("Location_id");
        model.addColumn("Location_name");
        model.addColumn("Location_address"); 
        try
        {
            locstmt = loc.Getconnection().createStatement();
        ref_data();  
        }
        catch (Exception e){
            System.err.println(e);
        }
        locationtable.setModel(model);
    }
   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        locidtxt = new javax.swing.JTextField();
        locnametxt = new javax.swing.JTextField();
        updatebuttn = new javax.swing.JButton();
        insertbuttn = new javax.swing.JButton();
        deletebuttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        locaddrtxt = new javax.swing.JTextArea();
        exitbutt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        locationtable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("KSEB SYSTEM - LOCATION_ENTRY");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Location id :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Location name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Location address :");

        locidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locidtxtActionPerformed(evt);
            }
        });

        updatebuttn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatebuttn.setText("UPDATE");
        updatebuttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttnActionPerformed(evt);
            }
        });

        insertbuttn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertbuttn.setText("INSERT");
        insertbuttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbuttnActionPerformed(evt);
            }
        });

        deletebuttn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletebuttn.setText("DELETE");
        deletebuttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttnActionPerformed(evt);
            }
        });

        locaddrtxt.setColumns(20);
        locaddrtxt.setRows(5);
        jScrollPane1.setViewportView(locaddrtxt);

        exitbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbutt.setText("EXIT");
        exitbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(locnametxt)
                            .addComponent(locidtxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(insertbuttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updatebuttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletebuttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(locidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(locnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebuttn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertbuttn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebuttn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("KSEB SYSTEM - LOCATION ENTRY");

        locationtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        locationtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location_id", "Location_name", "Location_address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        locationtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locationtableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(locationtable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(226, 226, 226))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void locidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locidtxtActionPerformed

    private void updatebuttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttnActionPerformed
         // TODO add your handling code here:
        try{ 
            PreparedStatement ps;
            ps=loc.Getconnection().prepareStatement("update location_master set location_name=?,location_address=? where location_id=?");
            ps.setString(1,locnametxt.getText());
            ps.setString(2,locaddrtxt.getText());
            ps.setString(3,locidtxt.getText());

        if (JOptionPane.showConfirmDialog (null,"Confirm Modification","modification",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION) {
            ps.executeUpdate();
            ref_data();
            locidtxt.setText("");
            locnametxt.setText("");
            locaddrtxt.setText("");
            JOptionPane.showMessageDialog(null, "Data Updated Successfully");
        }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Unable to update :" + e.getLocalizedMessage());
            }        
    }//GEN-LAST:event_updatebuttnActionPerformed

    private void insertbuttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbuttnActionPerformed
// TODO add your handling code here:
        String Location_id = locidtxt.getText();
        String Location_name = locnametxt.getText();
        String Location_address = locaddrtxt.getText();
        try {
            
            PreparedStatement ps = loc.Getconnection().prepareStatement("insert into location_master (location_id,location_name,location_address) values (?,?,?)");
            ps.setString(1, Location_id);
            ps.setString(2, Location_name);
            ps.setString(3, Location_address);
            ps.executeUpdate ();
            JOptionPane.showMessageDialog (null, "Data Inserted Successfully");
            ref_data();
            locidtxt.setText("");
            locnametxt.setText("");
            locaddrtxt.setText("");
        }
        catch (Exception e){           
            JOptionPane.showMessageDialog (null, "Unable to insert data: " + e.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_insertbuttnActionPerformed
 public void movedata (int i){
        try{
            locidtxt.setText(model.getValueAt(i, 0).toString());
            locnametxt.setText(model.getValueAt(i ,1).toString());
            locaddrtxt.setText(model.getValueAt(i ,2).toString());
        }
        catch (Exception e){
    System.err.println(e);
        JOptionPane.showMessageDialog(null,"Error in moving" + e.getLocalizedMessage());
    }
}
    
    private void locationtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationtableMouseClicked
       // TODO add your handling code here:
    try{
        int i=this.locationtable.getSelectedRow();
        movedata(i);
    } 
    catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error moving Data" + e.getLocalizedMessage());
    }
    }//GEN-LAST:event_locationtableMouseClicked

    private void deletebuttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttnActionPerformed
        // TODO add your handling code here:
        String dsql  = "Delete from location_master where location_id = '" + locidtxt.getText() + "'" ;
        try {
            if (JOptionPane.showConfirmDialog(this, "Attention You are going to delete location information","Delete location",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION) {
            if (locidtxt.getText().length() !=0){
            locstmt.executeUpdate(dsql);
            ref_data();
            locidtxt.setText("");
            locnametxt.setText("");
            locaddrtxt.setText("");
            JOptionPane.showMessageDialog(this,"Record Deleted Successfully");
            }
            else {
                JOptionPane.showMessageDialog(this,"Enter Id value to delete..");
    
                 }    
             }
           }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unable to Delete:" + e.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_deletebuttnActionPerformed
    private JFrame frame;
    private void exitbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttActionPerformed
        // TODO add your handling code here:
        frame=new JFrame("exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm to exit","elebill_system",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             this.setVisible(false);
        }
        
    }//GEN-LAST:event_exitbuttActionPerformed
  private void ref_data() {
     try {
         model.setRowCount(0);
        locrst = locstmt.executeQuery("select * from location_master");
        while(locrst.next ()) {
        model.addRow(new Object[]
        {locrst.getString("location_id"),locrst.getString("location_name"),locrst.getString("location_address")});
         }
        }
         catch (Exception e){
             System.err.println(e);
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
            java.util.logging.Logger.getLogger(Location_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Location_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Location_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Location_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Location_entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebuttn;
    private javax.swing.JButton exitbutt;
    private javax.swing.JButton insertbuttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea locaddrtxt;
    private javax.swing.JTable locationtable;
    private javax.swing.JTextField locidtxt;
    private javax.swing.JTextField locnametxt;
    private javax.swing.JButton updatebuttn;
    // End of variables declaration//GEN-END:variables
}
   
      
 
   
       
    

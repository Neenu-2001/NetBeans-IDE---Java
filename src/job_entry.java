
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class job_entry extends javax.swing.JFrame {

    /**
     * Creates new form job_entry
     */
    ksebdb job = new ksebdb();
    Statement jobstmt;
    ResultSet jobrst; 
    DefaultTableModel model = new DefaultTableModel(); 
    public job_entry() {
        initComponents();
        
        model.addColumn("job_id");
        model.addColumn("job_title");
        model.addColumn("salary"); 
        model.addColumn("department_id");
    
        try
        {
            jobstmt = job.Getconnection().createStatement();
        ref_data();  
        }
        catch (Exception e){
            System.err.println(e);
        }
        jobtble.setModel(model);
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
        jLabel5 = new javax.swing.JLabel();
        jidtxt = new javax.swing.JTextField();
        jtitletxt = new javax.swing.JTextField();
        salarytxt = new javax.swing.JTextField();
        dptidtxt = new javax.swing.JTextField();
        updatebutt = new javax.swing.JButton();
        insbutt = new javax.swing.JButton();
        dltbutt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobtble = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText(" KSEB SYSTEM - JOB ENTRY");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Job id :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Job title :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Salary :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Department id :");

        jidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jidtxtActionPerformed(evt);
            }
        });

        jtitletxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtitletxtActionPerformed(evt);
            }
        });

        salarytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarytxtActionPerformed(evt);
            }
        });

        dptidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptidtxtActionPerformed(evt);
            }
        });

        updatebutt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatebutt.setText("UPDATE");
        updatebutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttActionPerformed(evt);
            }
        });

        insbutt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insbutt.setText("INSERT");
        insbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insbuttActionPerformed(evt);
            }
        });

        dltbutt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dltbutt.setText("DELETE");
        dltbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbuttActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtitletxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(salarytxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dptidtxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jidtxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(insbutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatebutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dltbutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtitletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dptidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebutt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dltbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jobtble.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jobtble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job_id", "job_title", "salary", "department_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jobtble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jobtbleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jobtble);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(307, 307, 307))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dptidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dptidtxtActionPerformed

    private void jtitletxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtitletxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtitletxtActionPerformed

    private void insbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insbuttActionPerformed
        // TODO add your handling code here:
        String Job_id = jidtxt.getText();
        String Job_title = jtitletxt.getText();
        String salary = salarytxt.getText();
        String Department_id = dptidtxt.getText();
       
        try { 
            
            PreparedStatement ps = job.Getconnection().prepareStatement("insert into job_master (job_id,job_title,salary,department_id) values (?,?,?,?)");
            ps.setString(1, Job_id);
            ps.setString(2,Job_title);
            ps.setString(3,salary);
            ps.setString(4,Department_id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog (null, "Data Inserted Successfully");
            ref_data();
            jidtxt.setText("");
            jtitletxt.setText("");
            salarytxt.setText("");
            dptidtxt.setText("");
            
        }
        catch (Exception e){           
            JOptionPane.showMessageDialog (null, "Unable to insert data: " + e.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_insbuttActionPerformed

    private void updatebuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttActionPerformed
   
        try{ 
            PreparedStatement ps;
            ps=job.Getconnection().prepareStatement("update job_master set job_title=?, salary=? ,department_id=? where job_id=?");
            ps.setString(1,jtitletxt.getText());
            ps.setString(2,salarytxt.getText());
            ps.setString(3,dptidtxt.getText());
            ps.setString(4,jidtxt.getText());
            
        if (JOptionPane.showConfirmDialog (null,"Confirm Modification","modification",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION) {
            ps.executeUpdate();
            ref_data();
            jidtxt.setText("");
            jtitletxt.setText("");
            salarytxt.setText("");
            dptidtxt.setText("");
            
            JOptionPane.showMessageDialog(null, "Data Updated Successfully");
        }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Unable to update :" + e.getLocalizedMessage());
            }        
                                                  // TODO add your handling code here:
    }//GEN-LAST:event_updatebuttActionPerformed

    private void dltbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbuttActionPerformed
     
        String dsql  = "Delete from job_master where job_id = '" + jidtxt.getText() + "'" ;
        try {
            if (JOptionPane.showConfirmDialog(this, "Attention You are going to delete location information","Delete job",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION) {
            if (jidtxt.getText().length() !=0){
            jobstmt.executeUpdate(dsql);
            ref_data();
            jidtxt.setText("");
            jtitletxt.setText("");
            salarytxt.setText("");
            dptidtxt.setText("");
            
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
            // TODO add your handling code here:
    }//GEN-LAST:event_dltbuttActionPerformed
   private JFrame frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        frame=new JFrame("exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm to exit","elebill_system",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             this.setVisible(false);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void movedata (int i){
        try{
            jidtxt.setText(model.getValueAt(i, 0).toString());
            jtitletxt.setText(model.getValueAt(i ,1).toString());
            salarytxt.setText(model.getValueAt(i ,2).toString());
            dptidtxt.setText(model.getValueAt(i ,3).toString());
           
        }
        catch (Exception e){
    System.err.println(e);
        JOptionPane.showMessageDialog(null,"Error in moving" + e.getLocalizedMessage());
    }
    }
    
    private void jobtbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobtbleMouseClicked
     try{
        int i=this.jobtble.getSelectedRow();
        movedata(i);
    } 
    catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error moving Data" + e.getLocalizedMessage());
    }   // TODO add your handling code here:
    }//GEN-LAST:event_jobtbleMouseClicked

    private void salarytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarytxtActionPerformed

    private void jidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jidtxtActionPerformed

    private void ref_data() {
     try {
         model.setRowCount(0);
        jobrst = jobstmt.executeQuery("select * from job_master");
        while(jobrst.next ()) {
        model.addRow(new Object[]
        { jobrst.getString("job_id"),jobrst.getString("job_title"),jobrst.getString("salary"),jobrst.getString("department_id")});
        
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
            java.util.logging.Logger.getLogger(job_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(job_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(job_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(job_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new job_entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dltbutt;
    private javax.swing.JTextField dptidtxt;
    private javax.swing.JButton insbutt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jidtxt;
    private javax.swing.JTable jobtble;
    private javax.swing.JTextField jtitletxt;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JButton updatebutt;
    // End of variables declaration//GEN-END:variables
}

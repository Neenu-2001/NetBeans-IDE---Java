
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class employee_entry extends javax.swing.JFrame {

    /**
     * Creates new form employee_entry
     */
    ksebdb emp= new ksebdb();
     Statement empstmt;
     ResultSet emprst; 
    DefaultTableModel model = new DefaultTableModel();
    public employee_entry() {
        initComponents();
        model.addColumn("employee_id");
        model.addColumn("employee_name");
        model.addColumn("employee_address"); 
        model.addColumn("employee_phone");
        model.addColumn("department_id");
        model.addColumn("department_name"); 
        model.addColumn("job_id");
        model.addColumn("job_title");
        model.addColumn("salary");
        model.addColumn("user_id");
        model.addColumn("user_type");
        model.addColumn("password");
        try
        {
              empstmt = emp.Getconnection().createStatement();
        ref_data();  
        }
        catch (Exception e){
            System.err.println(e);
        }
        emptble.setModel(model);
  
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        empphtxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        empaddtxt = new javax.swing.JTextArea();
        empidtxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jobtxt = new javax.swing.JTextField();
        useridtxt = new javax.swing.JTextField();
        saltxt = new javax.swing.JTextField();
        empnatxt = new javax.swing.JTextField();
        dptntxt = new javax.swing.JTextField();
        updatebutt = new javax.swing.JButton();
        insertbutt = new javax.swing.JButton();
        dltbutt = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        exitbutt = new javax.swing.JButton();
        combtxt = new javax.swing.JComboBox();
        emppass = new javax.swing.JPasswordField();
        dpt = new javax.swing.JTextField();
        jid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        emptble = new javax.swing.JTable();

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Password :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("KSEB SYSTEM - EMPLOYEE ENTRY");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Employee name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Employee address :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Employee phone :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Department id :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Department name :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Job id :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Employee id :");

        empphtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empphtxtActionPerformed(evt);
            }
        });

        empaddtxt.setColumns(20);
        empaddtxt.setRows(5);
        jScrollPane1.setViewportView(empaddtxt);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Job title :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Salary :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("User id :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("User type :");

        jobtxt.setEditable(false);

        saltxt.setEditable(false);

        dptntxt.setEditable(false);

        updatebutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatebutt.setText("UPDATE");
        updatebutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttActionPerformed(evt);
            }
        });

        insertbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertbutt.setText("INSERT");
        insertbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbuttActionPerformed(evt);
            }
        });

        dltbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dltbutt.setText("DELETE");
        dltbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbuttActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Password :");

        exitbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbutt.setText("EXIT");
        exitbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttActionPerformed(evt);
            }
        });

        combtxt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "user", "admin" }));
        combtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combtxtActionPerformed(evt);
            }
        });

        emppass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emppassActionPerformed(evt);
            }
        });

        dpt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dptKeyPressed(evt);
            }
        });

        jid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jidKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combtxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jobtxt)
                    .addComponent(empidtxt)
                    .addComponent(empphtxt)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane1)
                    .addComponent(empnatxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dptntxt)
                    .addComponent(saltxt)
                    .addComponent(useridtxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emppass)
                    .addComponent(dpt)
                    .addComponent(jid))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertbutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatebutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dltbutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empidtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empnatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(empphtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dptntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jid, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jobtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(combtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emppass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dltbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(updatebutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertbutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        emptble.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emptble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee_id", "Employee_name", "Employee_address", "Employee_phone", "Department_id", "Department_name", "Job_id", "Job_title", "Salary", "User_id", "User_name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        emptble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptbleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(emptble);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void empphtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empphtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empphtxtActionPerformed

    private void insertbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbuttActionPerformed
    
        String employee_id = empidtxt.getText();
        String employee_name = empnatxt.getText();
        String employee_address = empaddtxt.getText();
        String employee_phone = empphtxt.getText();
        String department_id = dpt.getText();
        String department_name = dptntxt.getText();
        String job_id= jid.getText();
        String job_title = jobtxt.getText();
        String salary = saltxt.getText();
        String user_id =useridtxt.getText();
        String user_type = combtxt.getSelectedItem().toString();
        String password= emppass.getPassword().toString();
        try {
            
            PreparedStatement ps = emp.Getconnection().prepareStatement("insert into employee_master (employee_id,employee_name,employee_address,employee_phone,department_id,department_name,job_id,job_title,salary,user_id,user_type,password) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, employee_id);
            ps.setString(2, employee_name);
            ps.setString(3, employee_address);
            ps.setString(4, employee_phone);
            ps.setString(5, department_id);
            ps.setString(6, department_name); 
            ps.setString(7, job_id);  
            ps.setString(8, job_title);
            ps.setString(9, salary);
            ps.setString(10, user_id); 
            ps.setString(11, user_type); 
            ps.setString(12, password );
            ps.executeUpdate ();
            JOptionPane.showMessageDialog (null, "Data Inserted Successfully");
            ref_data();
            empidtxt.setText("");
            empnatxt.setText("");
            empaddtxt.setText("");
            empphtxt.setText("");
            dpt.setText("");
            dptntxt.setText("");
            jid.setText("");
            jobtxt.setText("");
            saltxt.setText("");
            useridtxt.setText("");
            combtxt.setSelectedItem(0);
            emppass.setText("");
        }
       catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to insert data: " + e.getLocalizedMessage());
        }
        
                                           // TODO add your handling code here:
    }//GEN-LAST:event_insertbuttActionPerformed
    private JFrame frame;
    private void exitbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttActionPerformed
        // TODO add your handling code here:
      frame=new JFrame("exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm to exit","elebill_system",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             this.setVisible(false);
        }
                    
    }//GEN-LAST:event_exitbuttActionPerformed

    private void combtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combtxtActionPerformed

    private void updatebuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttActionPerformed
        // TODO add your handling code here:
       try{ 
            PreparedStatement ps;
            ps=emp.Getconnection().prepareStatement("update employee_master set employee_name=?,employee_address=?,employee_phone=?,department_id=?,department_name=?,job_id=?,job_title=?,salary=?,user_id=?,user_type=?,password=?where employee_id=?");
           String password=new String(emppass.getPassword());
            ps.setString(1,empnatxt.getText());
            ps.setString(2,empaddtxt.getText());
            ps.setString(3,empphtxt.getText());
            ps.setString(4,dpt.getText());
            ps.setString(5,dptntxt.getText());
            ps.setString(6,jid.getText());
            ps.setString(7,jobtxt.getText());
            ps.setString(8,saltxt.getText());
            ps.setString(9,useridtxt.getText());
            ps.setString(10,combtxt.getSelectedItem().toString());
            ps.setString(11,password);
            ps.setString(12,empidtxt.getText());
            
        if (JOptionPane.showConfirmDialog (null,"Confirm Modification","modification",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION) {
            ps.executeUpdate();
            ref_data();
            empidtxt.setText("");
            empnatxt.setText("");
            empaddtxt.setText("");
            empphtxt.setText("");
            dpt.setText("");
            dptntxt.setText("");
            jid.setText("");
            jobtxt.setText("");
            saltxt.setText("");
            useridtxt.setText("");
            combtxt.setSelectedItem(0);
            emppass.setText("");
            JOptionPane.showMessageDialog(null, "Data Updated Successfully");
        }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Unable to update :" + e.getLocalizedMessage());
            }        
                                                
    }//GEN-LAST:event_updatebuttActionPerformed

    private void dltbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbuttActionPerformed
        // TODO add your handlmno.setText("");
         String dsql  = "Delete from employee_master where employee_id = '" + empidtxt.getText() + "'" ;
        try {
            if (JOptionPane.showConfirmDialog(this, "Attention You are going to delete employee information","Delete electricity_board",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION) {
            if (empidtxt.getText().length() !=0){
            empstmt.executeUpdate(dsql);
            ref_data();
           empidtxt.setText("");
            empnatxt.setText("");
            empaddtxt.setText("");
            empphtxt.setText("");
            dpt.setText("");
            dptntxt.setText("");
            jid.setText("");
            jobtxt.setText("");
            saltxt.setText("");
            useridtxt.setText("");
            combtxt.setSelectedItem(0);
            emppass.setText("");
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
        
    
         
    }//GEN-LAST:event_dltbuttActionPerformed
 public void movedata (int i){
        try{
            empidtxt.setText(model.getValueAt(i, 0).toString());
            empnatxt.setText(model.getValueAt(i ,1).toString());
            empaddtxt.setText(model.getValueAt(i ,2).toString());
            empphtxt.setText(model.getValueAt(i ,3).toString());
            dpt.setText(model.getValueAt(i ,4).toString());
            dptntxt.setText(model.getValueAt(i ,5).toString());
            jid.setText(model.getValueAt(i ,6).toString());
            jobtxt.setText(model.getValueAt(i ,7).toString());
            saltxt.setText(model.getValueAt(i ,8).toString());
            useridtxt.setText(model.getValueAt(i ,9).toString());   
            combtxt.setSelectedItem(model.getValueAt(i ,10).toString());
            emppass.setText(model.getValueAt(i ,11).toString());
        }
        catch (Exception e){
    System.err.println(e);
        JOptionPane.showMessageDialog(null,"Error in moving" + e.getLocalizedMessage());
    }
}
 
    private void emptbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptbleMouseClicked
        // TODO add your handling code here:
         try{
        int i=this.emptble.getSelectedRow();
        movedata(i);
    } 
    catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error moving Data" + e.getLocalizedMessage());
    }
                                        
    }//GEN-LAST:event_emptbleMouseClicked

    private void emppassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emppassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emppassActionPerformed

    private void dptKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dptKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           disp_dept_details(); 
        }
    }                                 
 
    
   private void disp_dept_details() {
       String dep =dpt.getText();
       try
       {
           PreparedStatement ps =emp.Getconnection().prepareStatement("select Department_name " + " from department_master where Department_id=?");
           ps.setString(1,dep);
           emprst=ps.executeQuery();
           if(emprst.next() ){
               dptntxt.setText(emprst.getString("department_name"));
              
         }
       }
           catch(Exception ex){
                 
                   Logger.getLogger(Consumer_entry.class.getName()).log(Level.SEVERE, null, ex);
                   }
       
      
    }//GEN-LAST:event_dptKeyPressed

    private void jidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jidKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           disp_job_details(); 
        }
    }                                 
 
    
   private void disp_job_details() {
       String job =jid.getText();
       try
       {
           PreparedStatement ps =emp.Getconnection().prepareStatement("select job_title,salary " + " from job_master where job_id=?");
           ps.setString(1,job);
           emprst=ps.executeQuery();
           if(emprst.next() ){
               jobtxt.setText(emprst.getString("job_title"));
               saltxt.setText(emprst.getString("salary"));
         }
       }
           catch(Exception ex){
                 
                   Logger.getLogger(Consumer_entry.class.getName()).log(Level.SEVERE, null, ex);
                   }
       
        
    }//GEN-LAST:event_jidKeyPressed
   
    private void ref_data() {
     try {
         model.setRowCount(0);
        emprst = empstmt.executeQuery("select * from employee_master");
        while(emprst.next ()) {
        model.addRow(new Object[]
        {emprst.getString("employee_id"),emprst.getString("employee_name"),emprst.getString("employee_address"),emprst.getString("employee_phone"),emprst.getString("department_id"),emprst.getString("department_name"),emprst.getString("job_id"),emprst.getString("job_title"),emprst.getString("salary"),emprst.getString("user_id"),emprst.getString("user_type"),emprst.getString("password")});
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
            java.util.logging.Logger.getLogger(employee_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combtxt;
    private javax.swing.JButton dltbutt;
    private javax.swing.JTextField dpt;
    private javax.swing.JTextField dptntxt;
    private javax.swing.JTextArea empaddtxt;
    private javax.swing.JTextField empidtxt;
    private javax.swing.JTextField empnatxt;
    private javax.swing.JPasswordField emppass;
    private javax.swing.JTextField empphtxt;
    private javax.swing.JTable emptble;
    private javax.swing.JButton exitbutt;
    private javax.swing.JButton insertbutt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jobtxt;
    private javax.swing.JTextField saltxt;
    private javax.swing.JButton updatebutt;
    private javax.swing.JTextField useridtxt;
    // End of variables declaration//GEN-END:variables

}

package Module;

import Marks.ResultForm;
import UserLogin.AdminDashboard;
import UserLogin.LoginForm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class ModuleViewAdmin extends javax.swing.JFrame {

    public ModuleViewAdmin() {
        try {
            initComponents();
            
            //loading table data
            removeTableData();
            displayTable();
            
            removeTableData2();
            displayTable2();
            
            removeTableData3();
            displayTable3();
            jComboBox2.setEnabled(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModuleViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModuleViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Module Admin View");

        jTable1.setForeground(new java.awt.Color(255, 51, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Course Duration", "Credit Hour"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Course List:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Teacher List:");

        jTable2.setForeground(new java.awt.Color(51, 51, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Instructor ID", "Username", "Full Name", "Field"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Module List:");

        jTable3.setForeground(new java.awt.Color(0, 153, 51));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Module ID", "Module Name", "Instructor", "Course ID", "Level", "Type"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Module Form:");

        jLabel6.setText("Module Name:");

        jTextField1.setToolTipText("");

        jLabel7.setText("Instructor Username:");

        jLabel8.setText("Course ID:");

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Edit");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setText("Module Id:(For update and Delete)");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel10.setText("Module ID:");

        jLabel11.setText("Level:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level4", "Level5", "Level6" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Type");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compulsory", "Optional" }));

        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("MENU");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setText("Course");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setText("Result");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jButton2))
                        .addGap(77, 77, 77)
                        .addComponent(jButton3)
                        .addGap(103, 103, 103)
                        .addComponent(jButton4)
                        .addContainerGap(208, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel9))
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(75, 75, 75)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                                            .addComponent(jTextField3))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(132, 132, 132)
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(445, 445, 445))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)
                                    .addComponent(jButton3))
                                .addGap(34, 34, 34))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //ADD Module
        //checking empty field
        if(!jTextField1.getText().isEmpty()){
             if(!jTextField2.getText().isEmpty()){
                 if(!jTextField3.getText().isEmpty()){
                 
                     try {
                         String module_name= jTextField1.getText();
                         String username= jTextField2.getText();
                         int course_id=Integer.parseInt(jTextField3.getText());
                         String level=jComboBox1.getSelectedItem().toString();
                         String type=jComboBox2.getSelectedItem().toString();
                         
                         //getting teacher count 
                         CountTeacher counteacher=new CountTeacher();
                         int count=counteacher.countTeacher(username);
                         //checking teacher count 
                         if(count<4){
                             //adding module
                            AddModule addmodule=new AddModule();
                            int result=addmodule.addModule(course_id, username, module_name,level,type);
                            //checking result
                            if(result==1){
                                JOptionPane.showMessageDialog(this,"Module Added Successfully!!!");
                                //resetting table and getting updated data
                                removeTableData3();
                                displayTable3();
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"Module Adding process Failed!!!");

                            }
                         }else{
                             JOptionPane.showMessageDialog(this,"You can not add Teacher in more than 4 Module!");
                         }
                     } catch (ClassNotFoundException ex) {
                         Logger.getLogger(ModuleViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
                     } catch (SQLException ex) {
                         Logger.getLogger(ModuleViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 
                 }
                 else{
                     JOptionPane.showMessageDialog(this,"Fill All the Data!!!");
                 }
             
             }
             else{
                     JOptionPane.showMessageDialog(this,"Fill All the Data!!!");
                 }
         
         }
         else{
                     JOptionPane.showMessageDialog(this,"Fill All the Data!!!");
                 }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //Delete module
        //checking empty Field
        if(!jTextField4.getText().isEmpty()){
        
            try {
                int module_id=Integer.parseInt(jTextField4.getText());
                //deleting module
                DeleteModule deletemodule=new DeleteModule();
                int result=deletemodule.deleteModule(module_id);
                //checking result
                if(result==1){
                    
                     JOptionPane.showMessageDialog(this,"Module Deleted Successfully!!!");
                     removeTableData3();
                     displayTable3();
                
                }else{
                
                     JOptionPane.showMessageDialog(this,"Module Deleted Failed!!!");
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ModuleViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ModuleViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
        else{
            JOptionPane.showMessageDialog(this,"Fill All the Data!!!");
        
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Editing module
        //checking empty field
        if(!jTextField1.getText().isEmpty()){
             if(!jTextField2.getText().isEmpty()){
                 if(!jTextField3.getText().isEmpty()){
                     if(!jTextField4.getText().isEmpty()){
                 
                     try {
                         String module_name= jTextField1.getText();
                         String username= jTextField2.getText();
                         int course_id=Integer.parseInt(jTextField3.getText());
                         int module_id=Integer.parseInt(jTextField4.getText());
                         String level=jComboBox1.getSelectedItem().toString();
                         String type=jComboBox2.getSelectedItem().toString();
                         //getting teache count
                         CountTeacher counteacher=new CountTeacher();
                         int count=counteacher.countTeacher(username);
                         //checking teacher count
                         if(count<4){
                             //applying update in database
                            EditModule editmodule=new EditModule();
                            int result=editmodule.updateModule(module_id, course_id, username, module_name,level,type);
                            //checking result
                            if(result==1){
                                JOptionPane.showMessageDialog(this,"Module updated Successfully!!!");
                                removeTableData3();
                                displayTable3();
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"Module updated Failed!!!");

                            }
                         }else{
                             JOptionPane.showMessageDialog(this,"You can not add Teacher in more than 4 Module!");
                         }
                     } catch (ClassNotFoundException ex) {
                         Logger.getLogger(ModuleViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
                     } catch (SQLException ex) {
                         Logger.getLogger(ModuleViewAdmin.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 
                 }
                 else{
                     JOptionPane.showMessageDialog(this,"Fill All the Data!!!");
                 }
             
             }
             else{
                     JOptionPane.showMessageDialog(this,"Fill All the Data!!!");
                 }
         
         }
         else{
                     JOptionPane.showMessageDialog(this,"Fill All the Data!!!");
                 }
        }
        else{
                     JOptionPane.showMessageDialog(this,"Fill All the Data!!!");
                 }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //LogOut
        LoginForm loginFrame = new LoginForm();
        loginFrame.setVisible(true);
        dispose();
        
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        AdminDashboard adminFrame= new AdminDashboard();
        adminFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ResultForm resultform= new ResultForm();
        resultform.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //diabling another jcombobox by checking selection on this jcombo box
        if (evt.getSource() == jComboBox1) { 
  
            if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Level4")){
                jComboBox2.setEnabled(false);
       
            }
            else if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Level5")){
               jComboBox2.setEnabled(false);
            
            }
            else{
            
               jComboBox2.setEnabled(true);
            }
        
        } 
    }//GEN-LAST:event_jComboBox1ActionPerformed
   //getting data from database and display it in the table
    public void displayTable() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from course")) {
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
              String course_id=String.valueOf(rs.getInt("course_id"));
              String course_name=rs.getString("course_name");
              String course_duration=rs.getString("course_duration");
              String course_credit=rs.getString("course_credit");
              
              String tabledata[] = {course_id,course_name,course_duration,course_credit};
              DefaultTableModel tablemodel=(DefaultTableModel) jTable1.getModel();
              tablemodel.addRow(tabledata);
              
             }
    
    
            }
    }
    //getting data from database and display in in the table
    public void displayTable2() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from instructors")) {
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
              String instructor_id=String.valueOf(rs.getInt("instructor_id"));
              String instructor_username=rs.getString("username");
              String instructor_fullname=rs.getString("user_fullname");
              String instructor_field=rs.getString("Field");
              
              String tabledata[] = {instructor_id,instructor_username,instructor_fullname,instructor_field};
              DefaultTableModel tablemodel=(DefaultTableModel) jTable2.getModel();
              tablemodel.addRow(tabledata);
              
             }
    
    
            }
    }
    //getting data from database and display in in the table
    public void displayTable3() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from module")) {
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
              String module_id=String.valueOf(rs.getInt("module_id"));
              String course_id=rs.getString("course_id");
              String instructor_fullname=rs.getString("username");
              String module_name=rs.getString("module_name");
              String level=rs.getString("level1");
              String type=rs.getString("type1");
              
              //using Arraylist
              ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
              list.add(module_id);//Adding object in arraylist  
              list.add(module_name);  
              list.add(instructor_fullname);  
              list.add(course_id);  
              list.add(level);
              list.add(type);
              String[] tabledata= new String[list.size()];
              tabledata = list.toArray(tabledata);
              //setting data in to the table
              DefaultTableModel tablemodel=(DefaultTableModel) jTable3.getModel();
              tablemodel.addRow(tabledata);
              
             }
    
    
            }
    }
    //resetting table
    public void removeTableData(){
        DefaultTableModel tablemodel=(DefaultTableModel) jTable1.getModel();
        tablemodel.setRowCount(0); 
    
    }
    //resetting table
    public void removeTableData2(){
        DefaultTableModel tablemodel=(DefaultTableModel) jTable2.getModel();
        tablemodel.setRowCount(0); 
    
    }
    //resetting table
    public void removeTableData3(){
        DefaultTableModel tablemodel=(DefaultTableModel) jTable3.getModel();
        tablemodel.setRowCount(0); 
    
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
            java.util.logging.Logger.getLogger(ModuleViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuleViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuleViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuleViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuleViewAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

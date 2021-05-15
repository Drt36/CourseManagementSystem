
package UserLogin;

import Marks.AddMarks;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InstructorDashboard extends javax.swing.JFrame {

    public InstructorDashboard() {
        initComponents();
    }
    public InstructorDashboard(String username) {
        try {
            initComponents();
            //getting data from another form and setting into jlable
            jLabel3.setText(username);
            jLabel3.setVisible(false);
            String username1=jLabel3.getText();
            
            //setting data into table at first
            removeTableData();
            displayTable(username1);
            removeTableData3();
            displayTable3();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InstructorDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InstructorDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Teacher DashBoard");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Module List:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Module ID", "Course ID", "Teacher", "Module Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Student List:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Username", "Course ID", "Module ID"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Load Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Module ID:");

        jTextField1.setToolTipText("Enter Module ID");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel6.setText("Enter module ID and Click load Data to get Student list.");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Marks:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marks ID", "Module ID", "Student", "Marks", "Status"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Add Marks Form:");

        jLabel9.setText("Student username:");

        jLabel10.setText("Marks:");

        jTextField2.setToolTipText("Enter student username");

        jTextField3.setToolTipText("Enter marks");
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Module ID:");

        jTextField4.setToolTipText("enter module ID");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jTextField1)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField4)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(212, 212, 212)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(jLabel11))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          //LogOut
        LoginForm loginFrame = new LoginForm();
        loginFrame.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // setting student list into the table
        if(!jTextField1.getText().isEmpty()){
            
            try {
                int module_id=Integer.parseInt(jTextField1.getText());
                removeTableData2();
                displayTable2(module_id);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InstructorDashboard.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(InstructorDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }else{
            JOptionPane.showMessageDialog(this,"Enter Module ID!!!");
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // for only numeric value
        
        if (evt.getKeyChar() >= 'a'&& evt.getKeyChar() <= 'z'|| evt.getKeyChar() >= 'A'&& evt.getKeyChar() <= 'Z') {
                    jTextField1.setEditable(false);
                    JOptionPane.showMessageDialog(this,"Enter only Numeric Value");
                    jTextField1.setEditable(true);
                } else {
                    jTextField1.setEditable(true);
                                    
                                }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // for only numeric value
         if (evt.getKeyChar() >= 'a'&& evt.getKeyChar() <= 'z'|| evt.getKeyChar() >= 'A'&& evt.getKeyChar() <= 'Z') {
                    jTextField3.setEditable(false);
                    JOptionPane.showMessageDialog(this,"Enter only Numeric Value");
                    jTextField3.setEditable(true);
                } else {
                    jTextField3.setEditable(true);
                                    
                                }
        
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // adding marks 
        //checking empty fields
          if(!jTextField2.getText().isEmpty()){
                if(!jTextField3.getText().isEmpty()){
                    if(!jTextField4.getText().isEmpty()){
                        try {
                            String status=null;
                            String Username=jTextField2.getText();
                            float marks=Float.parseFloat(jTextField3.getText());
                            int module_id=Integer.parseInt(jTextField4.getText());
                            if(marks>40){
                                status="pass";
                            }
                            else{
                                status="Fail";
                            }
                            
                            //adding marks in the database
                            AddMarks addmarks=new AddMarks();
                            int result=addmarks.addMarks(Username, module_id, marks, status);
                            //checking result
                            if(result==1){
                                 removeTableData3();
                                try {
                                    displayTable3();
                                } catch (SQLException ex) {
                                    Logger.getLogger(InstructorDashboard.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                JOptionPane.showMessageDialog(this,"Marks Added Successfully!!!");
                            
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"Marks addition process Failed !!!");
                            
                            }
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(InstructorDashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                else{
            JOptionPane.showMessageDialog(this,"Enter Module ID!!!");
        
        }
      }
      else{
            JOptionPane.showMessageDialog(this,"Enter Marks!!!");
        
        }
     }
       else{
            JOptionPane.showMessageDialog(this,"Enter Student's username!!!");
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // for only numeric value
        if (evt.getKeyChar() >= 'a'&& evt.getKeyChar() <= 'z'|| evt.getKeyChar() >= 'A'&& evt.getKeyChar() <= 'Z') {
                    jTextField4.setEditable(false);
                    JOptionPane.showMessageDialog(this,"Enter only Numeric Value");
                    jTextField4.setEditable(true);
                } else {
                    jTextField4.setEditable(true);
                                    
           }
        
    }//GEN-LAST:event_jTextField4KeyPressed
     
    //getting data from database and set it in the table
    public void displayTable(String username) throws ClassNotFoundException, SQLException{
         
        
        Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from module where username=?")) {
            preparedStatement.setString(1,username);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
              String module_id=String.valueOf(rs.getInt("module_id"));
              String course_id=rs.getString("course_id");
              String instructor_fullname=rs.getString("username");
              String module_name=rs.getString("module_name");
              
              String tabledata[] = {module_id,course_id,instructor_fullname,module_name};
              DefaultTableModel tablemodel=(DefaultTableModel) jTable1.getModel();
              tablemodel.addRow(tabledata);
              
             }
    
    
            }
    }
    //getting data from database and set it in the table
     public void displayTable2(int module_id) throws ClassNotFoundException, SQLException{
         
        
        Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select student_id,c.username,c.course_id,m.module_id from students s,choosedcource c,module m where c.course_id=m.course_id and c.username=s.username and m.module_id=?")) {
            preparedStatement.setInt(1,module_id);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
              String student_id=String.valueOf(rs.getInt("student_id"));
              String module_id1=String.valueOf(rs.getInt("module_id"));
              String username=rs.getString("username");
              String course_id=String.valueOf(rs.getInt("course_id"));
              
              
              String tabledata1[] = {student_id,username,course_id,module_id1};
              DefaultTableModel tablemodel1=(DefaultTableModel) jTable2.getModel();
              tablemodel1.addRow(tabledata1);
              
             }
    
    
            }
    }
     //getting data from database and set it in the table
     public void displayTable3() throws ClassNotFoundException, SQLException{
         
        
            Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from marks")) {
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
              String marks_id=String.valueOf(rs.getInt("marks_id"));
              String username1=rs.getString("username");
              String module_id=String.valueOf(rs.getInt("module_id"));
              String marks=String.valueOf(rs.getFloat("marks"));
              String status1=rs.getString("status1");
              
              String tabledata[] = {marks_id,module_id,username1,marks,status1};
              DefaultTableModel tablemodel=(DefaultTableModel) jTable3.getModel();
              tablemodel.addRow(tabledata);
              
             }
    
    
            }
    }
     //refershing table
    public void removeTableData(){
        DefaultTableModel tablemodel=(DefaultTableModel) jTable1.getModel();
        tablemodel.setRowCount(0); 
    
    }
     //refershing table
    public void removeTableData2(){
        DefaultTableModel tablemodel=(DefaultTableModel) jTable2.getModel();
        tablemodel.setRowCount(0); 
    
    }
     //refershing table
    public void removeTableData3(){
        DefaultTableModel tablemodel=(DefaultTableModel) jTable3.getModel();
        tablemodel.setRowCount(0); 
    }
 
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
            java.util.logging.Logger.getLogger(InstructorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructorDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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

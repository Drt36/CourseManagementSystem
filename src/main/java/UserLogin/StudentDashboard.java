
package UserLogin;

import Course.CancelCourse;
import Course.ChooseCourse;
import User.Database.GetStudentDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class StudentDashboard extends javax.swing.JFrame {

   
    public StudentDashboard() {
   
            initComponents();
           
    }
    public StudentDashboard(String username) {
        try {
            initComponents();
            //getting data from another form 
            jLabel6.setText(username);
            jLabel6.setVisible(false);
            //refreshing table
            removeTableData();
            displayTable();
            removeTableData2();
            displayTable2(jLabel6.getText());
            jTextField3.setText(username);
            jTextField3.setEditable(false);
            
            //getting student's username
            GetStudentDetails getstudentdetails=new GetStudentDetails();
            String level=getstudentdetails.getDataOfStudent(username);
            
            jTextField2.setText(level);
            jTextField2.setEditable(false);
            removeTableData3();
            displayTable3(username,level);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Student Dashboard");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Course List:");

        jTable1.setForeground(new java.awt.Color(255, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Course Duration", "Credit Hour"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Choosen Course:");

        jTable2.setForeground(new java.awt.Color(0, 153, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Choosed ID", "Username", "Course ID"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Choose Course:");

        jLabel5.setText("Course ID:");

        jTextField1.setToolTipText("Enter Course ID");

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Choose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel Course");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("jLabel6");

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Student Details:");

        jLabel8.setText("Level:");

        jLabel9.setText("Username:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Active Module List:");

        jTable6.setBackground(new java.awt.Color(0, 153, 51));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Module ID", "Module Name", "Username"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(361, 361, 361)
                .addComponent(jButton5)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jButton1)
                                .addGap(83, 83, 83)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(30, 30, 30)
                                        .addComponent(jTextField2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane6)))))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // choosing course
        
        String username=jLabel6.getText();
        if(!jTextField1.getText().isEmpty()){
            int course_id=Integer.parseInt(jTextField1.getText());
            try {
                //choosed course apply in the database
                ChooseCourse choosecource=new ChooseCourse();
                int result=choosecource.chooseCourse(username, course_id);
                //checking result
                if(result==1){
                    JOptionPane.showMessageDialog(this,"Course choosed Successfully!!!");
                    // refreshing table
                    removeTableData2();
                    displayTable2(username);
                    removeTableData3();
                    displayTable3(username,jTextField2.getText());
                }
                else{
                     JOptionPane.showMessageDialog(this,"Course choosed Failed!!!");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        else{
            JOptionPane.showMessageDialog(this,"Enter Course ID!!!");
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Cancelling Course
        String username=jLabel6.getText();
        if(!jTextField1.getText().isEmpty()){
            int course_id=Integer.parseInt(jTextField1.getText());
             try {
                 //apply changes on this database
                 CancelCourse cancelcource=new CancelCourse();
                 int result=cancelcource.cancelCourse(course_id);
                 //checking result
                 if(result==1){
                     JOptionPane.showMessageDialog(this,"Course Cancelled Successfully!!!");
                     //refreshing table
                     removeTableData2();
                     displayTable2(username);
                     removeTableData3();
                     displayTable3(username,jTextField2.getText());
                 }
                 else{
                     JOptionPane.showMessageDialog(this,"Course cancelled Failed!!!");
                 }
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(StudentDashboard.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         else{
            JOptionPane.showMessageDialog(this,"Enter Course ID!!!");
        
        }
    
    
    
    
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        //LogOut
        LoginForm loginFrame = new LoginForm();
        loginFrame.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed
    //getting data from database and set it in to the table
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
    //getting data from database and set it in to the table
    public void displayTable2(String username) throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from choosedcource where username=?")) {
            preparedStatement.setString(1,username);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
              String choosed_id=String.valueOf(rs.getInt("choosed_id"));
              String username1=rs.getString("username");
              String course_id=String.valueOf(rs.getInt("course_id"));
            
              String tabledata2[] = {choosed_id,username1,course_id};
              DefaultTableModel tablemode2=(DefaultTableModel) jTable2.getModel();
              tablemode2.addRow(tabledata2);
              
             }
    
    
            }
    }
    //getting data from database and set it in to the table
    public void displayTable3(String username,String level) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select module_id,c.username,module_name from module m,choosedcource c where c.course_id=m.course_id and c.username=? and m.level1=?")) {
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,level);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
              String module_id=String.valueOf(rs.getInt("module_id"));
              String module_name=rs.getString("module_name");
              String usernames=rs.getString("username");
            
              String tabledata3[] = {module_id,module_name,usernames};
              DefaultTableModel tablemode3=(DefaultTableModel) jTable6.getModel();
              tablemode3.addRow(tabledata3);
              
             }
    
    
            }
    }
    //refreshing table
    public void removeTableData(){
        DefaultTableModel tablemodel=(DefaultTableModel) jTable1.getModel();
        tablemodel.setRowCount(0); 
    
    }
    //refreshing table
    public void removeTableData2(){
        DefaultTableModel tablemodel=(DefaultTableModel) jTable2.getModel();
        tablemodel.setRowCount(0); 
    
    }
    //refershing table
    public void removeTableData3(){
        DefaultTableModel tablemodel=(DefaultTableModel) jTable6.getModel();
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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

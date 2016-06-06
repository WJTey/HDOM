package hdom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class systemUser extends javax.swing.JFrame {

Connection myConnection=null;
ResultSet rs = null;
PreparedStatement pst = null;

public systemUser() {
    
    initComponents();
    myConnection = MySqlConnection.dbConnection();
    update_table();
     //Fillcombo();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        change_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_User = new javax.swing.JTable();
        delete_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username: ");

        jLabel2.setText("Password: ");

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        change_btn.setText("Change Password");
        change_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_btnActionPerformed(evt);
            }
        });

        save_btn.setBackground(new java.awt.Color(34, 167, 240));
        save_btn.setText("Save");
        save_btn.setBorderPainted(false);
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        Table_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_User);

        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        jButton3.setText("Back to Start Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(change_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_username)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(save_btn)
                .addGap(42, 42, 42))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(change_btn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(delete_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save_btn)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
    
    String sql= "Insert into userlogin(Username,Password) values(?,?)";
        
    try {
        pst = myConnection.prepareStatement(sql);
    
        pst.setString(1,txt_username.getText());  
        pst.setString(2,txt_password.getText()); 
        
//        String value = combo_status.getSelectedItem().toString();
//        pst.setString(3,value);
         
        pst.execute();
        
       JOptionPane.showMessageDialog(null,"Saved");
      
      rs.close();
      pst.close();
			
         
         } catch (Exception e) {
        
             JOptionPane.showMessageDialog(null,e);
    }
     update_table();
    }//GEN-LAST:event_save_btnActionPerformed

    private void Table_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_UserMouseClicked
    
    try{
        
        int row = Table_User.getSelectedRow();
        
        String Table_click =(Table_User.getModel().getValueAt(row,0).toString());
        String sql ="select * from userlogin where Username = '"+ Table_click +"' ";
        
        pst = myConnection.prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        if(rs.next()){
                 
          String add1 = rs.getString("Username");
          txt_username.setText(add1);
          
          String add2 = rs.getString("Password");
          txt_password.setText(add2);
          
//          String add3 = rs.getString("Status");
//          combo_status.setSelectedItem(add3);
       
        }
       
     } catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
       
         }
    }//GEN-LAST:event_Table_UserMouseClicked

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        
      int p = JOptionPane.showConfirmDialog(null,"Do you sure want to delete","Delete",JOptionPane.YES_NO_OPTION);
       
       if(p==0){
           
        String sql = "delete from userlogin where Username = ?";
     
        try{
        
        pst = myConnection.prepareStatement(sql);
        
        pst.setString(1,txt_username.getText());
        pst.execute();
        JOptionPane.showMessageDialog(null,"Deleted !");
        
          }catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
        
        }
        update_table();
       }
       
    }//GEN-LAST:event_delete_btnActionPerformed

    private void change_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_btnActionPerformed
     
    try{
        
        String value1 = txt_username.getText();
        String value2 = txt_password.getText();
        //String value3 = combo_status.getSelectedItem().toString();
        
       // UPDATE `hdom`.`userlogin` SET `Password`='456' WHERE `Username`='A03';

        //String sql =" UPDATE userlogin set Username ='"+ value1 +"', Password = '"+value2+"'"
        // + "Status= '"+ value3 +"' where Username = '"+ value1 +"'";
        
       String sql =" UPDATE userlogin set Username ='"+ value1 +"', Password = '"+value2+"'where Username = '"+ value1 +"'";
        pst= myConnection.prepareStatement(sql);
        pst.execute();
        
        JOptionPane.showMessageDialog(null,"Password change!");
        
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
        
        }
    update_table();
    }//GEN-LAST:event_change_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_username.setText("");
        txt_password.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new startMenu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed


    private void update_table(){
    
       try {
           
           String sql = "select * from userlogin";
           pst = myConnection.prepareStatement(sql);
           rs = pst.executeQuery();
           Table_User.setModel(DbUtils.resultSetToTableModel(rs));
            
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
       }
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
            java.util.logging.Logger.getLogger(systemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(systemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(systemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(systemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new systemUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_User;
    private javax.swing.JButton change_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save_btn;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}

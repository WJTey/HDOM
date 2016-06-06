package hdom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class Employee_worktime extends javax.swing.JFrame {
    
Connection myConnection=null;
ResultSet rs = null;
PreparedStatement pst = null;


    public Employee_worktime() {
        initComponents();
        CurrentDate();
        myConnection = MySqlConnection.dbConnection();
        update_table();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        time_txt = new javax.swing.JTextField();
        OK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_EmpTimeLog = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        date_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Your Start Working Time :");

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        Table_EmpTimeLog.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_EmpTimeLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_EmpTimeLogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_EmpTimeLog);

        jLabel2.setText("Date :");

        jLabel3.setText("Please enter your employee ID :");

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(time_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(time_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OK)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed

 try {
       
        String sql= "Insert into timelog(ID,startime,date) values(?,?,?)";
        pst = myConnection.prepareStatement(sql);
 
        pst.setString(1,txt_username.getText());  
        pst.setString(2,time_txt.getText()); 
        pst.setString(3,date_txt.getText());
            
        pst.execute();
        
       JOptionPane.showMessageDialog(null,"Saved");
      
      rs.close();
      pst.close();
			
        } catch (Exception e) {
        
             JOptionPane.showMessageDialog(null,e);
 
        }
    }//GEN-LAST:event_OKActionPerformed

    private void Table_EmpTimeLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_EmpTimeLogMouseClicked
        try{
        
        int row = Table_EmpTimeLog.getSelectedRow();
        
        String Table_click =(Table_EmpTimeLog.getModel().getValueAt(row,0).toString());
        String sql ="select * from timelog where ID = '"+ Table_click +"' ";
        
        pst = myConnection.prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        if(rs.next()){
                 
          String add1 = rs.getString("ID");
          txt_username.setText(add1);
          
          String add2 = rs.getString("date");
          date_txt.setText(add2);
          
           String add3 = rs.getString("startime");
           time_txt.setText(add3);

       
        }
       
     } catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
       
         }
        update_table();
    }//GEN-LAST:event_Table_EmpTimeLogMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, " Are you sure want to log out from the system? ");
        new Login().setVisible(true);
        setVisible(false);
       // System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

        private void update_table(){
    
       try {
           
           String sql = "select * from timelog";
           pst = myConnection.prepareStatement(sql);
           rs = pst.executeQuery();
           Table_EmpTimeLog.setModel(DbUtils.resultSetToTableModel(rs));
            
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
       }
    }
 private void CurrentDate(){

Calendar cal = new GregorianCalendar();
int day = cal.get(Calendar.DAY_OF_MONTH);
int month = cal.get(Calendar.MONTH);
int year = cal.get(Calendar.YEAR);

//date_txt.setText(day+"/"+(month+1)+"/"+year);
date_txt.setText(year+"/"+(month+1)+"/"+day);


int hour = cal.get(Calendar.HOUR);
int minutes = cal.get(Calendar.MINUTE);
int second = cal.get(Calendar.SECOND);

time_txt.setText(hour+":"+minutes+":"+second);

}
 
 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_worktime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JTable Table_EmpTimeLog;
    private javax.swing.JTextField date_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField time_txt;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}

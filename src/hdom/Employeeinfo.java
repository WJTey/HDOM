package hdom;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.*;
import java.awt.print.*;

public class Employeeinfo extends javax.swing.JFrame {

Connection myConnection=null;
ResultSet rs = null;
PreparedStatement pst = null;
   
public Employeeinfo() {

initComponents();
myConnection = MySqlConnection.dbConnection();
         
    update_table();
    Fillcombo();
    //CurrentDate();
          
    }

  
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Employee = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        print_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txt_empIC = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txt_DOB = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        txt_empPosition = new javax.swing.JTextField();
        txt_empContactno = new javax.swing.JTextField();
        txt_empBasicPayRate = new javax.swing.JTextField();
        txt_empId = new javax.swing.JTextField();
        txt_empAddr = new javax.swing.JTextField();
        Combo_nameDepartment = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txt_empName = new javax.swing.JTextField();
        Combo_gender = new javax.swing.JComboBox();
        txt_search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 255));

        Table_Employee.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        Table_Employee.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_EmployeeMouseClicked(evt);
            }
        });
        Table_Employee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Table_EmployeeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Table_EmployeeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Employee);

        jLabel11.setText("Search by Employee ID:");

        back_btn.setText("Back to Start menu");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        print_btn.setText("Print Table");
        print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_btnActionPerformed(evt);
            }
        });

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee  Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), java.awt.Color.black)); // NOI18N

        jLabel47.setText("Gender");

        jLabel46.setText("Contact no");

        jLabel51.setText("Address");

        jLabel45.setText("Employee ID");

        jLabel48.setText("Employee Name");

        jLabel50.setText("Basic Pay Rate (RM):");

        jLabel43.setText("Employee IC");

        txt_DOB.setDateFormatString("yyyy-MM-dd");

        jLabel42.setText("Department");

        Combo_nameDepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HR", "Account", "Logistic", "WareHouse", "Purchasing", "Production", "Sale and Marketing" }));

        jLabel44.setText("Date Of Birth");

        jLabel49.setText("Position");

        Combo_gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_empName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel50)
                            .addComponent(jLabel49)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_empId, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_empPosition)
                                        .addComponent(txt_empBasicPayRate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Combo_nameDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(jLabel44)
                            .addComponent(jLabel51))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_empIC, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_empContactno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_empAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Combo_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_DOB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(txt_empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txt_empId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(txt_empIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42))
                    .addComponent(Combo_nameDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel49)
                    .addComponent(txt_empPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_empBasicPayRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50))
                    .addComponent(jLabel44)
                    .addComponent(txt_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empContactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addContainerGap())
        );

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(save_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clear_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(print_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(back_btn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save_btn)
                        .addGap(18, 18, 18)
                        .addComponent(delete_btn)
                        .addGap(18, 18, 18)
                        .addComponent(update_btn)
                        .addGap(18, 18, 18)
                        .addComponent(print_btn)
                        .addGap(18, 18, 18)
                        .addComponent(back_btn)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
//Get value from JTable and set it to jtextfield in Netbeans Java and mysql
    private void Table_EmployeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table_EmployeeKeyReleased

//        if(evt.getKeyCode()== KeyEvent.VK_DOWN || evt.getKeyCode()== KeyEvent.VK_UP){
//
//            try{
//
//                int row = Table_Employee.getSelectedRow();
//
//                String Table_click =(Table_Employee.getModel().getValueAt(row,0).toString());
//                String sql ="select * from employee where Name = '"+ Table_click +"' ";
//
//                pst = myConnection.prepareStatement(sql);
//                rs = pst.executeQuery();
//
//                if(rs.next()){
//
//                    String add1 = rs.getString("Name");
//                    txt_empName.setText(add1);
//
//                    String add2 = rs.getString("ID");
//                    txt_empId.setText(add2);
//
//                    String add3 = rs.getString("IC");
//                    txt_empIC.setText(add3);
//
//                    //String add4 = rs.getString("Gender");
//                    //gender.setSelected(buttonGroup1.getModel(add4), true);
//                    String add4 = rs.getString("Gender");
//                    Combo_gender.setSelectedItem(add4);
//                    
//                    String add5 = rs.getString("DateOfBirth");
//                    ((JTextField)txt_DOB.getDateEditor().getUiComponent()).setText(add5);
//
//                    //Date add5 = rs.getDate("DateOfBirth");
//                    //txt_DOB.setDate(add5);
//
//                    String add6 = rs.getString("Contactno");
//                    txt_empContactno.setText(add6);
//
//                    String add7 = rs.getString("Address");
//                    txt_empAddr.setText(add7);
//
//                    String add8 = rs.getString("Dept");
//                    Combo_nameDepartment.setSelectedItem(add8);
//
//                    String add9 = rs.getString("Position");
//                    txt_empPosition.setText(add9);
//
//                    String add10 = rs.getString("BasicPayRate");
//                    txt_empBasicPayRate.setText(add10);
//
//                }
//
//            } catch(Exception e){
//
//                JOptionPane.showMessageDialog(null,e);
//
////            }
//        }
    }//GEN-LAST:event_Table_EmployeeKeyReleased

    private void Table_EmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table_EmployeeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_EmployeeKeyPressed

    private void Table_EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_EmployeeMouseClicked
     
        try{

            int row = Table_Employee.getSelectedRow();

            String Table_click =(Table_Employee.getModel().getValueAt(row,0).toString());
            String sql ="select * from employee where Name = '"+ Table_click +"' ";

            pst = myConnection.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next()){

                String add1 = rs.getString("Name");
                txt_empName.setText(add1);

                String add2 = rs.getString("ID");
                txt_empId.setText(add2);

                String add3 = rs.getString("IC");
                txt_empIC.setText(add3);

                //          String add4 = rs.getString("Gender");
                //          txt_empGender.setText(add4);
                String add4 = rs.getString("Gender");
                Combo_gender.setSelectedItem(add4);

                String add5 = rs.getString("DateOfBirth");
                ((JTextField)txt_DOB.getDateEditor().getUiComponent()).setText(add5);

                String add6 = rs.getString("Contactno");
                txt_empContactno.setText(add6);

                String add7 = rs.getString("Address");
                txt_empAddr.setText(add7);

                String add8 = rs.getString("Dept");
                Combo_nameDepartment.setSelectedItem(add8);

                String add9 = rs.getString("Position");
                txt_empPosition.setText(add9);

                String add10 = rs.getString("BasicPayRate");
                txt_empBasicPayRate.setText(add10);

            }

        } catch(Exception e){

            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_Table_EmployeeMouseClicked

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        new startMenu().setVisible(true);
        setVisible(false);
        //close();

    }//GEN-LAST:event_back_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed

        txt_empName.setText("");
        txt_empId.setText("");
        txt_empIC.setText("");
        
        //        txt_empGender.setText("");
        ((JTextField)txt_DOB.getDateEditor().getUiComponent()).setText("");
        //txt_DOB.setDate(new Date());
        //txt_DOB.setDate();
        //DOB.setText("");
        txt_empAddr.setText("");
        txt_empContactno.setText("");
        txt_empPosition.setText("");
        txt_empBasicPayRate.setText("");

    }//GEN-LAST:event_clear_btnActionPerformed

    private void print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btnActionPerformed
        MessageFormat header = new MessageFormat("Employee Info");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");

        try{

            Table_Employee.print(JTable.PrintMode.NORMAL,header,footer);

        }catch(java.awt.print.PrinterException e){

            System.err.format("Cannot print %s%n", e.getMessage());

        }

    }//GEN-LAST:event_print_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed

        try{

            String value1 = txt_empName.getText();
            String value2 = txt_empId.getText();
            String value3 = txt_empIC.getText();
            String value4 = Combo_gender.getSelectedItem().toString();
            //String value4 = buttonGroup1.getText();
            String value5 =((JTextField)txt_DOB.getDateEditor().getUiComponent()).getText();
            // String value5 = DOB.getText();
            String value6 = txt_empContactno.getText();
            String value7 = txt_empAddr.getText();
            String value8 = Combo_nameDepartment.getSelectedItem().toString();
            String value9 = txt_empPosition.getText();
            String value10 = txt_empBasicPayRate.getText();

            String sql =" update employee set ID = '"+ value1 +"', Name = '"+value2+"', IC= '"+ value3+"' , Gender = '"+value4+"',"
            + "DateOfBirth = '"+value5+"', Contactno = '"+value6+"', Address = '"+value7+"', Dept = '"+value8+"',Position = '"+value9+"',"
            + "BasicPayRate = '"+value10+"' where ID = '"+ value1 +"' ";

            pst= myConnection.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null,"Updated!");

        }catch(Exception e){

            JOptionPane.showMessageDialog(null,e);

        }

        update_table();
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed

        int p = JOptionPane.showConfirmDialog(null,"Do you sure want to delete","Delete",JOptionPane.YES_NO_OPTION);

        if(p==0){

            String sql = "delete from employee where ID = ?";

            try{

                pst = myConnection.prepareStatement(sql);

                pst.setString(1,txt_empId.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null,"Deleted !");

            }catch(Exception e){

                JOptionPane.showMessageDialog(null,e);

            }
            update_table();
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed

        try{

            String sql= "Insert into employee(Name,ID,IC,Gender,DateOfBirth,Contactno,Address,Dept,Position,BasicPayRate) values(?,?,?,?,?,?,?,?,?,?)";

            pst = myConnection.prepareStatement(sql);

            pst.setString(1,txt_empName.getText());
            pst.setString(2,txt_empId.getText());
            pst.setString(3,txt_empIC.getText());
            //       pst.setString(4,txt_empGender.getText());
            //pst.setString(4,gender);
            String value4 =Combo_gender.getSelectedItem().toString();
            pst.setString(4,value4);
            pst.setString(5,((JTextField)txt_DOB.getDateEditor().getUiComponent()).getText());
            //pst.setString(5,DOB.getText());
            pst.setString(6,txt_empContactno.getText());
            pst.setString(7,txt_empAddr.getText());
            //Combo_Department
            String value8 = Combo_nameDepartment.getSelectedItem().toString();
            pst.setString(8,value8);
            pst.setString(9,txt_empPosition.getText());
            pst.setString(10,txt_empBasicPayRate.getText());

            pst.execute();

            JOptionPane.showMessageDialog(null,"Saved");

        }catch(Exception e){

            JOptionPane.showMessageDialog(null,e);

        }
        update_table();
    }//GEN-LAST:event_save_btnActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
         try{
        //Search by name
        String sql = "select * from employee where ID =?";
        pst= myConnection.prepareStatement(sql);
        pst.setString(1,txt_search.getText());
        rs = pst.executeQuery();
        
        if(rs.next()){
        
        String add1 = rs.getString("Name");
        txt_empName.setText(add1);
        
        String add2 = rs.getString("ID");
        txt_empId.setText(add2);
        
        String add3 = rs.getString("IC");
        txt_empIC.setText(add3);
        
//        String add4 = rs.getString("Gender");
//        male_radiobtn.setSelected(true);
//        female_radiobtn.setSelected(true);
//        gender.equals(add4);
        String add4 = rs.getString("Gender");
        Combo_gender.setSelectedItem(add4);
      
        
//        String add4 = rs.getString("Gender");
//        txt_empGender.setText(add4);
        
        String add5 = rs.getString("DateOfBirth");
        ((JTextField)txt_DOB.getDateEditor().getUiComponent()).setText(add5);
        
        String add6 = rs.getString("Contactno");
        txt_empContactno.setText(add6);
        
        String add7 = rs.getString("Address");
        txt_empAddr.setText(add7);
        
        String add8 = rs.getString("Dept");
        //txt_empIC.setText(add8);
        Combo_nameDepartment.setSelectedItem(add8);
        
        String add9 = rs.getString("Position");
        txt_empPosition.setText(add9);
        
        String add10 = rs.getString("BasicPayRate");
        txt_empBasicPayRate.setText(add10);
        
    }
        
      }catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
      }   
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    
    
    private void update_table(){
    
       try {
           String sql = "select * from employee";
           pst = myConnection.prepareStatement(sql);
           rs = pst.executeQuery();
           Table_Employee.setModel(DbUtils.resultSetToTableModel(rs));
            
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
       }
    }
    
    
private void Fillcombo(){
    
    try{ 
    
    String sql= "select * from employee";
    pst = myConnection.prepareStatement(sql);
    rs = pst.executeQuery();
    
//    while(rs.next()){
//    String Dept = rs.getString("Dept");
//    Combo_nameDepartment.addItem(Dept);
//    
//      }
    
  }catch(Exception e){
    
    JOptionPane.showMessageDialog(null,e);
    
    }
    
   }
    

//private void CurrentDate(){
//
//Calendar cal = new GregorianCalendar();
//int day = cal.get(Calendar.DAY_OF_MONTH);
//int month = cal.get(Calendar.MONTH);
//int year = cal.get(Calendar.YEAR);
//
//date_txt.setText(day+"/"+month+"/"+year);
//
//int hour = cal.get(Calendar.HOUR);
//int minutes = cal.get(Calendar.MINUTE);
//int second = cal.get(Calendar.SECOND);
//
//time_txt.setText(hour+":"+minutes+":"+second);
//
//}

 public void close(){
     
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
            java.util.logging.Logger.getLogger(Employeeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employeeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employeeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employeeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employeeinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combo_gender;
    private javax.swing.JComboBox Combo_nameDepartment;
    private javax.swing.JTable Table_Employee;
    private javax.swing.JButton back_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton print_btn;
    private javax.swing.JButton save_btn;
    private com.toedter.calendar.JDateChooser txt_DOB;
    private javax.swing.JTextField txt_empAddr;
    private javax.swing.JTextField txt_empBasicPayRate;
    private javax.swing.JTextField txt_empContactno;
    private javax.swing.JTextField txt_empIC;
    private javax.swing.JTextField txt_empId;
    private javax.swing.JTextField txt_empName;
    private javax.swing.JTextField txt_empPosition;
    private javax.swing.JTextField txt_search;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables

private String gender;





}

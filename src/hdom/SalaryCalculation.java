package hdom;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.List;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class SalaryCalculation extends javax.swing.JFrame {

   Connection myConnection=null;
   ResultSet rs = null;
   PreparedStatement pst = null;
   
   private String empName;
   private String empID;
   private int dayWork;
   private double empBasicPayRate;
   private double epfEmployer;
   private double epfEmployee;
   private double grossPay;
   private double nettPay;
   private double bonus;
   private double deduction;
   
    
public SalaryCalculation() {
        initComponents();
        myConnection = MySqlConnection.dbConnection();
        Month();
        Calculate();
        update_table();
        FillEmpID();

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Salary = new javax.swing.JTable();
        delete_btn = new javax.swing.JButton();
        combo_month_search = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        Month_combobox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_empId = new javax.swing.JTextField();
        BasicPayRate = new javax.swing.JTextField();
        epf1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        epf2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_DayWork = new javax.swing.JTextField();
        calculate_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NettPay = new javax.swing.JTextField();
        clear_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_empName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        GrossPay = new javax.swing.JTextField();
        save_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_bonus = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_deduction = new javax.swing.JTextField();
        edit_btn = new javax.swing.JButton();
        combo_searchID = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel13.setText("Search by Month :");

        Table_Salary.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_Salary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_SalaryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Salary);

        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        combo_month_search.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "January", "February", "March ", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        combo_month_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_month_searchActionPerformed(evt);
            }
        });
        combo_month_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_month_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                combo_month_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delete_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_month_search, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(delete_btn)
                    .addComponent(combo_month_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View All Employee Salary", jPanel2);

        Month_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March ", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        Month_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Month_comboboxActionPerformed(evt);
            }
        });

        jLabel5.setText("Basic Pay Rate :");

        jLabel8.setText("Gross Pay :");

        jLabel6.setText("EPF Employer :");

        jLabel9.setText("Nett Pay :");

        jLabel1.setText("Employee Name:");

        calculate_btn.setText("Calculate");
        calculate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_btnActionPerformed(evt);
            }
        });

        jLabel2.setText("Employee ID:");

        clear_btn.setText("New");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        back_btn.setText("Back to Start Menu");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel3.setText("Please enter the number of Working Days :");

        jLabel7.setText("EPF Employee :");

        jLabel4.setText("Month :");

        jLabel10.setText("Search by Employee ID :");

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        jLabel11.setText("Bonus For Full Attendance :");

        jLabel12.setText("Please enter Deduction if have:");

        edit_btn.setText("Update");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        combo_searchID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None" }));
        combo_searchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_searchIDActionPerformed(evt);
            }
        });

        jButton1.setText("Print to pdf");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Month_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_searchID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(back_btn)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(epf2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txt_bonus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                    .addComponent(epf1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(BasicPayRate, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(GrossPay)
                                            .addComponent(NettPay)
                                            .addComponent(txt_DayWork)
                                            .addComponent(txt_empId)
                                            .addComponent(txt_empName))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel12)
                                        .addGap(35, 35, 35)
                                        .addComponent(txt_deduction, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(calculate_btn))))
                            .addComponent(jLabel11))
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Month_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(combo_searchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_empId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_DayWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_deduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(calculate_btn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BasicPayRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(epf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(epf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_bonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(GrossPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(NettPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear_btn)
                    .addComponent(back_btn)
                    .addComponent(edit_btn)
                    .addComponent(save_btn)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Salary Calculation", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed

    try{

    String sql= "Insert into salary(Name,ID,DayWork,BasicPayRate,EPFemployer,EPFemployee,GrossPay,NettPay,Month,Bonus,Deduction) values(?,?,?,?,?,?,?,?,?,?,?)";

            pst = myConnection.prepareStatement(sql);

            pst.setString(1,txt_empName.getText());
            pst.setString(2,txt_empId.getText());
            pst.setString(3,txt_DayWork.getText());
            pst.setString(4,BasicPayRate.getText());
            pst.setString(5,epf1.getText());
            pst.setString(6,epf2.getText());
            pst.setString(7,GrossPay.getText());
            pst.setString(8,NettPay.getText());
            
            String value = Month_combobox.getSelectedItem().toString();
            pst.setString(9,value);
            
            pst.setString(10,txt_bonus.getText());
            pst.setString(11,txt_deduction.getText());
            
            pst.execute();

            JOptionPane.showMessageDialog(null,"Saved");

        }catch(Exception e){

            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_save_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        new startMenu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_back_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed

        txt_empName.setText("");
        txt_empId.setText("");
        txt_DayWork.setText("");
        BasicPayRate.setText("");
        epf1.setText("");
        epf2.setText("");
        GrossPay.setText("");
        NettPay.setText("");
        txt_bonus.setText("");
        txt_deduction.setText("");

    }//GEN-LAST:event_clear_btnActionPerformed

    private void calculate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_btnActionPerformed

        try{

            int DayWork = Integer.parseInt(txt_DayWork.getText());
            double basicPayRate = Double.parseDouble(BasicPayRate.getText());

            //Arithmetic Operation
            double grossPay;
            grossPay = DayWork * basicPayRate;
            GrossPay.setText("" + grossPay);

            //System.out.println(grossPay);
            //double grossPay = Double.parseDouble(GrossPay.getText());
            //Pay pay =new pay(DayWork,basicPayRate,grossPay);
            //grossPay = String.valueOf(grossPay);
            //grossPay = Double.parseDouble(GrossPay.getText());

            JOptionPane.showMessageDialog(null,"Calculated gross pay.");

            double epfemployer;
            double epfemployee;

            if(grossPay < 5000)
            {

                epfemployer = grossPay * 13 /100;
                epf1.setText("" + epfemployer);

            }
            else
            //(grossPay > = 5000)
            {
                epfemployer = grossPay * 12 /100;
                epf1.setText("" + epfemployer);

            }

            epfemployee = grossPay * 11/100;
            epf2.setText("" + epfemployee);

            JOptionPane.showMessageDialog(null,"Calculated epf.");

            double nettPay;
            
            //double bonus = Double.parseDouble(txt_bonus.getText());
            // double bonus = txt_bonus.setText("100");
           if(DayWork > 20)
           
           {final double bonus = 100.0;
           txt_bonus.setText("100.00");}
           
           else
           {double bonus = 0.0;
           txt_bonus.setText("0.00");}
           
            double deduction = Double.parseDouble(txt_deduction.getText());
            
            nettPay = grossPay - epfemployee + bonus - deduction;
            
            NettPay.setText("" + nettPay );

        }catch(Exception e){

            JOptionPane.showMessageDialog(null,"The deduction is not filled");
        }
    }//GEN-LAST:event_calculate_btnActionPerformed

    private void Month_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Month_comboboxActionPerformed

    }//GEN-LAST:event_Month_comboboxActionPerformed

    private void Table_SalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_SalaryMouseClicked
    
    try{

            int row = Table_Salary.getSelectedRow();

            String Table_click =(Table_Salary.getModel().getValueAt(row,0).toString());
            String sql ="select * from salary where Name = '"+ Table_click +"' ";

            pst = myConnection.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next()){

                String add1 = rs.getString("Name");
                txt_empName.setText(add1);

                String add2 = rs.getString("ID");
                txt_empId.setText(add2);

                String add3 = rs.getString("DayWork");
                txt_DayWork.setText(add3);

                String add4 = rs.getString("BasicPayRate");
                BasicPayRate.setText(add4);

                String add5 = rs.getString("EPFemployer");
                epf1.setText(add5);

                String add6 = rs.getString("EPFemployee");
                epf2.setText(add6);

                String add7 = rs.getString("Bonus");
               txt_bonus.setText(add7);

                String add8 = rs.getString("Deduction");
                txt_deduction.setText(add8);

                String add9 = rs.getString("GrossPay");
                GrossPay.setText(add9);

                String add10 = rs.getString("NettPay");
                NettPay.setText(add10);
                
                String add11 = rs.getString ("Month");
                Month_combobox.setSelectedItem(add11);

            }

        } catch(Exception e){

            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_Table_SalaryMouseClicked

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
    
        int p = JOptionPane.showConfirmDialog(null,"Do you sure want to delete","Delete",JOptionPane.YES_NO_OPTION);

        if(p==0){

            String sql = "delete from salary where ID = ?";

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

    private void combo_month_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_month_searchKeyReleased
        
      
        
        
    }//GEN-LAST:event_combo_month_searchKeyReleased

    private void combo_month_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_month_searchKeyPressed
  
        
    }//GEN-LAST:event_combo_month_searchKeyPressed

    private void combo_month_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_month_searchActionPerformed
    
    try{
        //String selection=(String)combo_month.getSelectedItem();
        //String sql="Select * from salary where "+selection+"";
        String sql= "Select * from salary where Month = ? ";
        pst = myConnection.prepareStatement(sql);
        pst.setString(1,(String)combo_month_search.getSelectedItem());
        rs=pst.executeQuery();
        
        Table_Salary.setModel(DbUtils.resultSetToTableModel(rs));
        
        while(rs.next())
        {
           String add1 = rs.getString("Name");
                txt_empName.setText(add1);

                String add2 = rs.getString("ID");
                txt_empId.setText(add2);

                String add3 = rs.getString("DayWork");
                txt_DayWork.setText(add3);

                String add4 = rs.getString("BasicPayRate");
                BasicPayRate.setText(add4);

                String add5 = rs.getString("EPFemployer");
                epf1.setText(add5);

                String add6 = rs.getString("EPFemployee");
                epf2.setText(add6);

                String add7 = rs.getString("Bonus");
               txt_bonus.setText(add7);

                String add8 = rs.getString("Deduction");
                txt_deduction.setText(add8);

                String add9 = rs.getString("GrossPay");
                GrossPay.setText(add9);

                String add10 = rs.getString("NettPay");
                NettPay.setText(add10);
        }
        
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_combo_month_searchActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
    
        try{

            
            String value1 = txt_empId.getText();
            String value2 = txt_empName.getText();
            String value3 = txt_DayWork.getText();
            String value4 = BasicPayRate.getText();
            String value5 =epf1.getText();
            String value6 = epf2.getText();
            String value7 = txt_bonus.getText();
            String value8 = txt_deduction.getText();
            String value9 = GrossPay.getText();
            String value10 = NettPay.getText();
            String value11 = Month_combobox.getSelectedItem().toString();

            String sql =" update salary set ID = '"+ value1 +"', Name = '"+value2+"', DayWork= '"+ value3+"' , BasicPayRate = '"+value4+"',"
            + "EPFemployer = '"+value5+"', EPFemployee = '"+value6+"', Bonus = '"+value7+"', Deduction = '"+value8+"',GrossPay = '"+value9+"',"
            + "NettPay= '"+value10+"', Month= '"+value11+"' where ID = '"+ value1 +"'and Month = '"+ value11 +"' ";

            pst= myConnection.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null,"Updated!");
            update_table();

        }catch(Exception e){

            JOptionPane.showMessageDialog(null,e);

        }

       
    }//GEN-LAST:event_edit_btnActionPerformed

    private void combo_searchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_searchIDActionPerformed
       try {
            String sql = "select * from employee where ID = ?";
            pst= myConnection.prepareStatement(sql);
            pst.setString(1,(String)combo_searchID.getSelectedItem());

            rs = pst.executeQuery();

            if(rs.next()){

                String add1 = rs.getString("Name");
                txt_empName.setText(add1);

                String add2 = rs.getString("ID");
                txt_empId.setText(add2);

                String add3 = rs.getString("BasicPayRate");
                BasicPayRate.setText(add3);

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_combo_searchIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        Calendar cal= new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        System.out.println("Date :" + day +"/"+(month+1)+"/"+ year);
       
        String Value1 = txt_empName.getText();
        String Value2 = txt_empId.getText();
        String Value3 = txt_DayWork.getText();
        String Value4 = BasicPayRate.getText();
        String Value5 = epf1.getText();
        String Value6 = epf2.getText();
        String Value7 = txt_bonus.getText();
        String Value8 = GrossPay.getText();
        String Value9 = NettPay.getText();
        String Value10 = txt_deduction.getText();
        String Value11 = Month_combobox.getSelectedItem().toString();
        
        
        try{
            
        Document document= new Document(PageSize.A4.rotate());
        PdfWriter.getInstance(document,new FileOutputStream("PaySlip.pdf"));
        document.open();
       
        
        document.add(new Paragraph("Monthly Pay -"+ Value11 ,FontFactory.getFont(FontFactory.TIMES_BOLD,18,BaseColor.BLACK)));
        document.add(new Paragraph(" "));
        document.add(new Paragraph("Y&G COMPANY"));
        document.add(new Paragraph("___________________________________________________________________"));
        //document.add(new Paragraph(new Date().toString()));
        Paragraph paragraph = new Paragraph();
        paragraph.setAlignment(Element.ALIGN_CENTER);
        //paragraph.add("Monthly Pay -"+ Value11 + "2014");
        document.add(paragraph);
        
        PdfPCell cell = new PdfPCell(new Paragraph("Details"));
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setBackgroundColor(BaseColor.BLUE);     
//        document.setPageSize(PageSize.A4);
//        document.setMargins(36, 72, 108, 180);
//        document.setMarginMirroringTopBottom(true);

//        Paragraph paragraph = new Paragraph();
//        paragraph.setAlignment(Element.ALIGN_JUSTIFIED);
//        for (int i = 0; i < 20; i++) {
//            paragraph.add("Hello World! Hello People! " +
//            		"Hello Sky! Hello Sun! Hello Moon! Hello Stars!");
//        }
//        document.add(paragraph);
        
        com.itextpdf.text.List list = new com.itextpdf.text.List(true,20);
        //list.isAlignindent();
       //list.isAutoindent();
       list.setIndentationLeft(TOP_ALIGNMENT);
        
        list.add("Employee Name                 :"+ Value1);
        list.add("Employee ID                   :"+ Value2);
        list.add("Basic Pay Per Day             :"+ Value3);
        list.add("Number of Working Day         :"+ Value4);
        list.add("EPF Employer                  :"+ Value6);
        list.add("EPF Employee                  :"+ Value5);
        list.add("Bonus For Full Attendance     :"+ Value7);
        list.add("Monthly Gross Pay             :"+ Value8);
        list.add("Deduction                     :"+ Value10);
        list.add("NettPay                       :"+ Value9);
        
        document.add(list);
        
        JOptionPane.showMessageDialog(null,"Salary Slip Saved");
        document.close();
        
        
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void Calculate(){
   
      String empName;
      String empID;
      int DayWork;
      double empBasicPayRate;
      double grossPay;
      double epfEmployer;
      double bonus;
      double deduction;
      
    try{
        
     String sql = "select Name,BasicPayRate from employee where ID = ? ";
           
     pst= myConnection.prepareStatement(sql);
          
     pst.setString(1,txt_DayWork.getText());
     
     pst.execute();
    
      
      }catch(Exception e){
      
      JOptionPane.showMessageDialog(null,e);
      
      }
   
    }
    

    
    private void Month(){
    
    try{ 
        
    String sql= "select * from salary";
    pst = myConnection.prepareStatement(sql);
    rs = pst.executeQuery();

 
  }catch(Exception e){
    
    JOptionPane.showMessageDialog(null,e);
    
    }
    
   }
    
    private void update_table(){
    
   try {
           String sql = "select * from salary";
           pst = myConnection.prepareStatement(sql);
           rs = pst.executeQuery();
           Table_Salary.setModel(DbUtils.resultSetToTableModel(rs));
            
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
       }
    }
    
    private void FillEmpID(){
    
    try{ 
    
    String sql= "select * from employee";
    pst = myConnection.prepareStatement(sql);
    rs = pst.executeQuery();
    
    while(rs.next()){
    String id = rs.getString("ID");
    combo_searchID.addItem(id);
    
      }
    
  }catch(Exception e){
    
    JOptionPane.showMessageDialog(null,e);
    
    }
    
   }
    
   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalaryCalculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BasicPayRate;
    private javax.swing.JTextField GrossPay;
    private javax.swing.JComboBox Month_combobox;
    private javax.swing.JTextField NettPay;
    private javax.swing.JTable Table_Salary;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton calculate_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JComboBox combo_month_search;
    private javax.swing.JComboBox combo_searchID;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JTextField epf1;
    private javax.swing.JTextField epf2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JButton save_btn;
    private javax.swing.JTextField txt_DayWork;
    private javax.swing.JTextField txt_bonus;
    private javax.swing.JTextField txt_deduction;
    private javax.swing.JTextField txt_empId;
    private javax.swing.JTextField txt_empName;
    // End of variables declaration//GEN-END:variables

        
        public String getEmpName() {
        
		return empName;
	}

        
        public void setEmpName(String empName) {
        
            this.empName = empName;
	}
        
	public String getEmpID() {
		return empID;
	}
        
        public void setEmpID(String empID) {
		this.empID = empID;
	}
        
                
        public int getDayWork() {
        
		return dayWork;
	}

        
        public void setDayWork(int dayWork) {
        
            this.dayWork = dayWork;
	}
        
	public double getEmpBasicPayRate() {
		return empBasicPayRate;
	}
        
        public void setEmpBasicPayRate(double empBasicPayRate) {
		this.empBasicPayRate = empBasicPayRate;
	}

                
        public double getEpfEmployer() {
        
		return epfEmployer;
	}

        
        public void setEpfEmployer(double epfEmployer) {
        
            this.epfEmployer = epfEmployer ;
	}
        
	public double getEpfEmployee() {
		return epfEmployee;
	}
        
        public void setEpfEmployee (double epfemployee) {
		this.epfEmployee = epfEmployee;
	}
        
        
        public double getGrossPay() {
        
		return grossPay;
	}

        
        public void setGrossPay(double grossPay) {
        
            this.grossPay = grossPay;
	}
        
	public double getNettPay() {
		return nettPay;
	}
        
        public void setNettPay (double nettPay) {
		this.nettPay = nettPay;
	}

        
        

}

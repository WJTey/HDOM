package hdom;

import javax.swing.JOptionPane;
import java.sql.*;


public class MySqlConnection {
    
    public static Connection dbConnection(){
    
        Connection con;
        //Statement stmt;
        //ResultSet rs;
        //String RsUSERNAME;
        
    try{
        
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdom","root","");
        
//        String query= "select *  from userlogin";
//        PreparedStatement pst = con.prepareStatement(query);
//        ResultSet rs = pst.executeQuery();
//         
//        while(rs.next()){
//         
//            RsUSERNAME= rs.getString("USERNAME");
//            
//            System.out.println(RsUSERNAME);
//         
//         
//         }
//         
//        pst.close();
//        rs.close();
        //JOptionPane.showMessageDialog(null, "Database Connected Successfully");
        return con;
        
        
    }catch(Exception e){
    
    JOptionPane.showMessageDialog(null, e);
    return null;
    
    }
        
        
    }
    
  

}


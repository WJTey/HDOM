package hdom;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class User {

    private String Password;
    private String Username;
    private final boolean verifyUser=false;
    Connection connection=null;
	
public boolean login(String Username,String Password){
		
    this.setUserName(Username);
    this.setPassword(Password);
    connection=MySqlConnection.dbConnection();
		
    try{
            String RsPassword = null;
            String RsUsername = null;
                         
String query="(SELECT Username as Username,Password as Password from userlogin where Username=? and Password=?)";
			
    PreparedStatement pst=connection.prepareStatement(query);
    pst.setString(1, Username);
    pst.setString(2, Password);
                        
    ResultSet rs=pst.executeQuery();
    
    int count=0;
			
    while(rs.next()){
	
	count++;
	
        RsUsername=rs.getString("Username");
        RsPassword=rs.getString("Password");
        		
			}
    if(count==1){
    JOptionPane.showMessageDialog(null,"Welcome "+RsUsername+" !!!" +"\n"+"You 're log in.\n" +
                                  "Enjoy your working Day.");
 
//    JOptionPane.showMessageDialog(null, Username + "Please confirm your start work time and your employee ID.");
//
//    new Employee_worktime().setVisible(true);
                 }
    else{
    
        JOptionPane.showMessageDialog(null,"Username and password is incorrect");
        
    
    }
    
//String query1="(SELECT USERNAME as Username,PASSWORD as Password from userlogin  where Username=? and Password=?)"; 

if("Admin0".equals(RsUsername)||"Admin1".equals(RsUsername)||"Admin2".equals(RsUsername))
{
new startMenu().setVisible(true);   

                                                 
     }
else{
    
     JOptionPane.showMessageDialog(null, Username + "Please confirm your start work time and your employee ID.");

    new Employee_worktime().setVisible(true);  
}

    
//After the query is execute, close the database connection
//
			rs.close();
			pst.close();
//			
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e+"\nError on Database Connection");
			
		}
        return false;
}  

  
        
        public String getUsername() {
        
		return Username;
	}

        
        public void setUserName(String Username) {
        
            this.Username = Username;
	}
        
	public String getPassword() {
		return Password;
	}
        
        public void setPassword(String Password) {
		this.Password = Password;
	}


}


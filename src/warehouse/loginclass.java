package warehouse;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Appel
 */
public class loginclass {
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    String user_name;
    
    loginclass() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "warehouse", "1234");
            st = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    public void adminlogin(String name,String password,String type)
    {
        user_name=name;
        try{
            sql="Select user_name,emp_password,emp_designation from employee where user_name='"+name+"' and emp_password='"+password+"' and emp_designation='"+type+"'";
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                if(name.equals(rs.getString("user_name")) && password.equals(rs.getString("emp_password")) && type.equals(rs.getString("emp_designation"))){
                    JOptionPane.showMessageDialog(null, "Login Success");
                    new Admin(type,user_name).setVisible(true);    
                    LoginPage l=new LoginPage();
                    l.setExtendedState(JFrame.ICONIFIED);
                    //break;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Login Failed");
                }
                
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

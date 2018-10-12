package warehouse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Appel
 */
public class ddlclass {

    Connection con;
    Statement st;
    ResultSet rs;
    String sql;

    ddlclass() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "warehouse", "1234");
            st = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Create a new Branch
    public void branch_in(String name, String address, String phone) {

        try {
            sql = "Insert Into branch values('" + name + "','" + address + "','" + phone + "')";
            if (st.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Delete a branch from database
    public void branch_del(String name) {
        try {
            sql = "Delete branch where branch_name='" + name + "'";
            if (st.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //Transaction method
    public void transaction(int t_id, String s_name, int p_id, String p_name, int quan, int tax, String date, int remark, String b_name, String ename, int t_cost) {
        try {
            PreparedStatement ps = con.prepareStatement("Insert Into transaction values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, t_id);
            ps.setString(2, s_name);
            ps.setInt(3, p_id);
            ps.setString(4, p_name);
            ps.setInt(5, quan);
            ps.setInt(6, tax);
            ps.setString(7, date);
            ps.setInt(8, remark);
            ps.setString(9, b_name);
            ps.setString(10, ename);
            ps.setInt(11, t_cost);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Data Insert Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Data Not Inserted");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void emp_update(int id, String f_name, String u_name, String email, String phone, String pass, String desig, String join, String address) {

        try {
            sql = "update employee set emp_name='" + f_name + "',user_name='" + u_name + "',emp_email='" + email + "',emp_phone='" + phone + "',emp_password='" + pass + "',emp_designation='" + desig + "',emp_joindate='" + join + "',emp_address='" + address + "' where emp_id=" + id + "";
            if (st.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Data Updated Successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void emp_delete(int id)
    {
        try{
            
            if(st.executeUpdate("delete employee where emp_id="+id+"")==1)
             JOptionPane.showMessageDialog(null, "Data Deleted Successfully");   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

}

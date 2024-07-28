package loginexamples;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Db_Connectivity {
    
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
 
    String q="jdbc:sqlserver://localhost:1433;databaseName=LoginExample;user=sa;password=123";
    public Db_Connectivity()
    {
        try
        {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(q);
            st=con.createStatement();
            /* Confirm Dialog*/
        int reply=   JOptionPane.showConfirmDialog
        (null, "Connect your Db", "Application Close",
                JOptionPane.YES_NO_OPTION);
        if(reply== JOptionPane.YES_OPTION){
        System.exit(0);
        }
        }
        catch(Exception e)
        {
            /* Confirm Dialog*/
        int reply=   JOptionPane.showConfirmDialog
        (null, "Not Connected", "Application Close",
                JOptionPane.YES_NO_OPTION);
        if(reply== JOptionPane.YES_OPTION){
        System.exit(0);
        }
        }
    }
}

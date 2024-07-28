/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Instructor
 */
public class clock extends Thread
{
    
    public void run()
    {
        
        try
        {
        while(true)
        {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
            Date d = new Date();
            String dateAndTime = df.format(d);
            
            ShowTime.LabelTime.setText(dateAndTime);
            Thread.sleep(1000);
        
        }
    
        }
     catch(Exception e)
     {
         
     }
    
    
    }
    
}

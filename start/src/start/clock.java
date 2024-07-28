/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowEvent;

/**
 *
 * @author Instructor
 */
public class clock extends Thread
{
    int count =1;
    Window s;
    
    public void abc(Window a)
    {
        s = a;
    }
    public void run()
    {
        
       try
       {
          while(true)
          {
              frame.time.setText(count+"");
              count++;
              Thread.sleep(1000);
              
              if(count==10)
              {
                  
                  WindowEvent w = new WindowEvent(s,WindowEvent.WINDOW_CLOSING);
                  Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
                  Show q = new Show();
                  q.setVisible(true);
                  Show.data.setText(count+"");
                  
                  break;
              }
          }
       }
       catch(Exception e)
       {
           
       }
        
    }
}

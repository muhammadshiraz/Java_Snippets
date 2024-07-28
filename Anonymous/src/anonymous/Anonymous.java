/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymous;

/**
 *
 * @author Muhammad Shiraz
 */
public class Anonymous {

    /**
     * @param args the command line arguments
     */
    
    public void testException()throws MyException {
        if(condition==true)
            System.out.println("True");
        else
            throw new MyException();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
        ContentContentContentContentContent
           */     
        
//        int value = 100;
//        boolean bool = true;
//        if((bool==true) &&
//        ((value+=100)==200)) {
//        System.out.printf("Equal" +value);
//        }
//        else{
//        System.out.println(value + "Not Equal");
//        }
        
        
        
        int value = 100;
        boolean bool = false;
        
        if((bool==true) && ((value+=100)==200))
        {
        System.out.printf("Equal" +value);
        }
        else
        {
        System.out.println(value + " Not Equals");
        }
    }
    
}



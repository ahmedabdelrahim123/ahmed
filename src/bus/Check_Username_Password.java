/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.io.File;
import java.util.Scanner;


public class Check_Username_Password {
    public static boolean valideteuser(String filename,String username,String password){
        Scanner x;
        try {
       
         x=new Scanner(new File (filename+".txt"));
        while(x.hasNext()){
            
            String a=x.next();
            String b=x.next();
            if(a.equals(username)&&b.equals(password)){
                x.close();
                System.out.println("ok");
                return true;
                  
            }
        }
        x.close();
        return false;

        } catch (Exception e) {
        
            System.out.println("ERROR");
            return false;
        
        
    }
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Zakakaria
 */
public class ReadFromFile {
    
    
    public static void main(String[] args) {
        String s1=null;
        try {
           RandomAccessFile file = new RandomAccessFile("country.txt", "r");
           while((s1=file.readUTF())!=null){
               
           //String s=new String(file.readLine());
           //if(s1.equals("বাংলাদেশ"))
           //if(s1=="বাংলাদেশ")
           //if(s1.equals("oi"))
                System.out.println(s1);
           }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

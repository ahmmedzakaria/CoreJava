/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Zakakaria
 */
public class ReadeUnicode {
     public static void main(String args[]) {
        try {
            InputStreamReader ir=new InputStreamReader(new FileInputStream("n.txt"),"UTF-8");
            BufferedReader in=new BufferedReader(ir);
           // Reader in = new InputStreamReader(new FileInputStream("country.txt"), "UTF-8");
            //FileInputStream fin = new FileInputStream("d:/abc.txt");
            char b='j';
            char u='\n';
            int i;
            //StringBuffer coun=new StringBuffer("বাংলাদেশ");
            StringBuffer coun=new StringBuffer("oi");
            StringBuffer sb=new StringBuffer();
            while ((i = in.read()) != -1) {
                
                //if(i==(int)b)
                if(i!=(int)u){
                    char c=(char)i;
                    //sb+=(char)i;
                    sb.append(c);
                    //System.out.println(sb);
                }else{
                    System.out.println(sb.toString());
                    if(new String(sb).equals("oi")){
                        System.out.println(sb);
                    sb=new StringBuffer();
                    }
                    //System.out.println(sb);
                    //sb=new StringBuffer();
                    
                }
                //System.out.println(i+" "+(char)i);
            }

            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

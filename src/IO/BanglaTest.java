/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

/**
 *
 * @author Zakakaria
 */
public class BanglaTest {
    public static void main(String[] args) {
        String s1="বাংলাদেশ";
        String s2="বাংলাদেশ";
        StringBuffer sb1=new StringBuffer("বাংলাদেশ");
        StringBuffer sb2=new StringBuffer("বাংলাদেশ");
        if(s1==s2)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        
        if(sb1.toString().equals(sb2.toString()))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

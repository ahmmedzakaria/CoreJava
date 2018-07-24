/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava;

/**
 *
 * @author Zakakaria
 */
public class CoreJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10;
        x= ++x + ++x+ ++x;
        System.out.println("Pre Increment: "+x);
        
        int y=10;
        
        y= y++ + y++ + y++;
        
         System.out.println("Post Increment: "+x);
    }
    
}

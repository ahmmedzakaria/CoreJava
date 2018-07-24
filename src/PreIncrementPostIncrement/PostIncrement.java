/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreIncrementPostIncrement;

/**
 *
 * @author Zakakaria
 */
public class PostIncrement {
    public static void main(String[] args) {
        int i=5;
        //li=i++;
        
        int temp=i;
        i++;
        i=temp;
        
        System.out.println(i);
    }
}

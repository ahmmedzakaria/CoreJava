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
public class Expression1 {
    public static void main(String[] args) {
        int x=5,y=0,z;
        y=x++ + ++x +x;
        
        System.out.println("Value of Y "+y+" and Value of x "+x);
    }
}

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
public class PostIncrementExpression1 {
    public static void main(String[] args) {
        int i=5;
        int x=i++;// 5
        System.out.println("X: "+x+" I: "+i);
               
        i=5;
        int y=i++ + i++;// 5 + 6
        System.out.println("Y: "+y+" I: "+i);
        
        i=5;
        int z= i++ + i++ + i++;// 5 + 6 + 7
        System.out.println("Z: "+z+" I: "+i);
        
    }
}

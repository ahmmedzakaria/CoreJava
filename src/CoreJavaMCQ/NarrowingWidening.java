/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreJavaMCQ;

/**
 *
 * @author Zakakaria
 */
public class NarrowingWidening {
    public static void main(String[] args) {
        //Narrowing
         double n= 10.55555;
         int z= (int) n;

        
        //widening
        int x=3, y=2;
        Double d= (double)x/y;
        System.out.println("Narrowing: "+z);
        System.out.println("Widening: "+d);

    }
}

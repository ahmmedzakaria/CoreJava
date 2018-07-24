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
public class DoubleAssignment {
    public static void main(String[] args) {
        int[] a={2,2};
        int b=1;
        a[b]=b=0;
        System.out.println(a[0]);
        System.out.println(a[1]);
        
    }
}

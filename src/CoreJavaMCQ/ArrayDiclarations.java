/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreJavaMCQ;

import java.lang.reflect.Array;

/**
 *
 * @author Zakakaria
 */
public class ArrayDiclarations {
    public static void main(String[] args) {
        int a[]=new int[4];
        int[] b=new int[4];
        
        int a2D[][]=new int[4][];
        int[] b2D[]=new int[4][];
        
        Object arr1=Array.newInstance(Integer.TYPE, 5);
    }
}

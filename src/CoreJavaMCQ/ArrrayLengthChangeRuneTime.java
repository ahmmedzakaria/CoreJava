/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreJavaMCQ;

import java.util.Arrays;

/**
 *
 * @author Zakakaria
 */
public class ArrrayLengthChangeRuneTime {
    public static void main(String[] args) {
         int myArray[] = {1,2,3};
    myArray = Arrays.copyOf(myArray, myArray.length+1);
    
    myArray[3] = 12; 
    for(int ctr = 0; ctr<myArray.length; ctr++){
        System.out.println(myArray[ctr]);
    }
    }
}

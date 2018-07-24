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
public class Loop1 {
    public static void main(String[] args) {
        int i=1,j=10;
        do{
        if(i>j){
            System.out.println("brek");
            break;
        }
            System.out.println("i= "+i+" and j= "+j);
        j--;
        }
        while(++i<5);
        System.out.println("Finally i= "+i+" and j= "+j);
    }
}

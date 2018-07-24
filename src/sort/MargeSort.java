/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Arrays;

/**
 *
 * @author Zakakaria
 */
public class MargeSort {
    
    
    
    
    public static void main(String[] args) {
        int[] l={2,5,8,9};
        int[] r={1,3,4,6,7};
        int[] m={4,3,2,1,5,8,7,6,2,6,9};
        
        System.out.println(Arrays.toString(m));
       // margeArrays(l,r,m);
        margeSort(m);
        System.out.println(Arrays.toString(m));
        //System.out.println("Zakaria");
    }
    
    static void margeSort(int[] arrayToBeSorted){
        int length=arrayToBeSorted.length;
        if(length<2)
            return;
        int mid=length/2;
        int lArray[]=new int[mid];
        int rArray[]=new int[length-mid];
        
        for(int i=0;i<mid;i++){
            lArray[i]=arrayToBeSorted[i];
        }
        
        for(int i=mid;i<length;i++){
            rArray[i-mid]=arrayToBeSorted[i];
        }
        
        margeSort(lArray);
        margeSort(rArray);
        margeArrays(lArray, rArray, arrayToBeSorted);
    }
    
    
    
    
    static void margeArrays(int[] laftArray,int[] rightArray,int[] mainArray){
        int lenLA=laftArray.length;
        int lenRA=rightArray.length;
        int indexLA=0;
        int indexRA=0;
        int indexMA=0;
        while(indexLA<lenLA &&indexRA<lenRA){
            if(laftArray[indexLA]<=rightArray[indexRA]){
                mainArray[indexMA]=laftArray[indexLA];
                indexLA++;
            }else{
                mainArray[indexMA]=rightArray[indexRA];
                indexRA++;
            }
            indexMA++;
        }
        while(indexLA<lenLA){
            mainArray[indexMA]=laftArray[indexLA];
            indexLA++;
            indexMA++;
        }
        
        while(indexRA<lenRA){
            mainArray[indexMA]=rightArray[indexRA];
            indexRA++;
            indexMA++;
        }
        
    }
}

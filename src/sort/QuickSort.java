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
public class QuickSort {
    
    public static void main(String[] args) {
        int[] m={4,3,2,1,5,8,7,6,2,6,9,4};
        quickSort(m, 0, m.length-1);
        //partitionArray(m, 0, m.length-1);
        System.out.println(Arrays.toString(m));
    }
    
    static void quickSort(int[] array,int startIndex,int endIndex){
        if(startIndex<endIndex){
            int partitionIndex=partitionArray(array, startIndex, endIndex);
            quickSort(array, startIndex, partitionIndex-1);
            
            //quickSort(array, partitionIndex+1, endIndex);
        }
    }
    
   static int partitionArray(int[] array,int startIndex,int endIndex){
       int pivot=array[endIndex];
       int partitionIndex=startIndex;
       int temp=0;
       for (int i = startIndex; i <= endIndex; i++) {
           
           if(array[i]<=pivot){
               temp=array[i];
               array[i]=array[partitionIndex];
               array[partitionIndex]=temp;
               partitionIndex++;
           }
 
       }
       temp=array[endIndex];
           array[endIndex]=array[partitionIndex];
           array[partitionIndex]=temp;
           partitionIndex++;
       return partitionIndex;
    }
    
}

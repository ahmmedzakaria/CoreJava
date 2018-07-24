
package corejavaevidance;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        System.out.println("Please Enter How Many Number You Want To Inpute...");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println("Please Enter "+num+" Numbers");
        int arr[]=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Your Inputed Numbes:"+Arrays.toString(arr));
        System.out.println("Even Numbers:");
        for (int i = 0; i < num; i++) {
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        
         System.out.println("Odd Numbers:");
        for (int i = 0; i < num; i++) {
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        
        
    }
}

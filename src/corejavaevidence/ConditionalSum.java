
package corejavaevidence;

import java.util.Scanner;


public class ConditionalSum {
    public static void main(String[] args) {
        System.out.println("Please Enter Numbers");
        Scanner s=new Scanner(System.in);
        int sum=0;
        //when you Enter 0 the loop will break and display the reasult
        while(true){
            int x=Integer.parseInt(s.nextLine());
            if(x==0){
                System.out.println("Total is: "+sum);
                break;
            }else{
                sum+=x;
            }
        }
    }
}

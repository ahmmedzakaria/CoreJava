
package corejavaevidence;

import java.util.ArrayList;
import java.util.Scanner;


public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter Your Number");
        Scanner s = new Scanner(System.in);
        int number = Integer.parseInt(s.nextLine());
        ArrayList<Integer> arr = new ArrayList();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                arr.add(i);
            }
        }

        if (arr.size() == 2) {
            System.out.println(number + " is Prime a Number");
        } else {
            System.out.println(number + " is not a Prime Number");
            System.out.println("Its factors are ");
            for(Integer i: arr){
                System.out.println(i);
            }
        }
    }
}

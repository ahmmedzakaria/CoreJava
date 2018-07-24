
package corejavaevidence;

import java.util.Arrays;

public class Sort2 {
    public static void main(String[] args) {
        int k, a[][] = {{4, 1, 3, 7, 5}, {8, 3, 2, 9, 21}, {10, 15, 7, 6, 2}};
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);
            System.out.println(Arrays.toString(a[i]));
        }   
        
    }
   
}

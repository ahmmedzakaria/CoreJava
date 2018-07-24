
package corejavaevidence;

import java.util.ArrayList;

public class UniqueRandomNumber {

    public static void main(String[] args) {
        int loopCount = 0;
        int rand = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int len = 0;

        for (int i = 0;; i++) {
            rand = (int) Math.ceil(Math.random() * 10);
            loopCount++;
            if (arr.isEmpty()) {
                arr.add(rand);
                len++;
            } else {
                int count = 0;
                for (Integer val : arr) {
                    int x = val;
                    if (rand == x) {
                        count++;
                    }
                }
                if (count == 0) {
                    arr.add(rand);
                    len++;
                }
            }

            if (len == 10) {
                break;
            }
        }

        for (Integer val : arr) {
            System.out.println(val);
        }
    }
}

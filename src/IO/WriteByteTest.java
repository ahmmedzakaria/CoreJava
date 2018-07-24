package IO;

import java.io.*;
//Simple program of writing data into the file
public class WriteByteTest {

    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("d:/abc.txt", true);
            String s = "Shakib Al Hasan is my favourite player";

            byte b[] = s.getBytes();
            fout.write(b);
//            fout.write(b);

            fout.close();

            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

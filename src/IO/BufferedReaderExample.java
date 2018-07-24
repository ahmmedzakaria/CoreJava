
package IO;

import java.io.*;

public class BufferedReaderExample {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader
                    (new FileReader("d:\\newfilename.txt"));

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println(e);
            //System.err.println(e);
        }
    }
}

package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {

    public static void main(String[] args) {
        try {

            String content = "বাংলাদেশ";
            String content2 = "বাংলাদেশ";
            

            File file = new File("country.txt");

            //if file doesnt exists, then create it
            //if (!file.exists()) {
            //    file.createNewFile();
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.newLine();
            bw.write(content2);
            bw.newLine();
            bw.close();

            System.out.println("Done");
//            }
//            else{
//                System.out.println("File exists");
//            }           

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
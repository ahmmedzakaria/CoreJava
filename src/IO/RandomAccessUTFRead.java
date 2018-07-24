/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;
import java.io.RandomAccessFile;

/**
 *
 * @author Zakakaria
 */
public class RandomAccessUTFRead {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile(new File("country.txt"), "r");
            while(raf.readLine()!=null){
            String line = raf.readLine();
            String utf8 = new String(line.getBytes("ISO-8859-1"), "UTF-8");
            //if(utf8.equals("বাংলাদেশ"))
            //System.out.println("Line: " + line);
            System.out.println("UTF8: " + utf8);
            }
            
        } catch (Exception e) {
        }
    }
}

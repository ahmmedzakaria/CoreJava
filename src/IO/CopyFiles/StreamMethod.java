/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO.CopyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zakakaria
 */
public class StreamMethod {
    static File source=new File("D:\\question.png");
    static File destination=new File("D:\\New folder\\qus.png");
    public static void main(String[] args) {
        try {
            copyFileUsingStream();
        } catch (IOException ex) {
            Logger.getLogger(StreamMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void copyFileUsingStream() throws IOException{
        InputStream is=null;
        OutputStream os=null;
        try{
        is=new FileInputStream(source);
        os=new FileOutputStream(destination);
        byte[] buffer=new byte[1024];
        int length;
        while((length=is.read(buffer))>0){
            os.write(buffer,0,length);
        }
            System.out.println("File written using Stream");
        }finally{
            is.close();
            os.close();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO.CopyFiles;

import static IO.CopyFiles.StreamMethod.copyFileUsingStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zakakaria
 */
public class FileChennalMethod {
    static File source=new File("D:\\question.png");
    static File destination=new File("D:\\New folder\\qus.png");
    public static void main(String[] args) {
        try {
            copyFileUsingChannel(source,destination);
        } catch (IOException ex) {
            Logger.getLogger(StreamMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void copyFileUsingChannel(File source, File distination) throws FileNotFoundException, IOException{
        FileChannel sourceChannel=null;
        FileChannel destinationChennel=null;
        try{
            sourceChannel=new FileInputStream(source).getChannel();
            destinationChennel=new FileOutputStream(distination).getChannel();
            destinationChennel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }finally{}
    }
}

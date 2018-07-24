/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO.CopyFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zakakaria
 */
public class UsingJava7 {
    static File source=new File("D:\\question.png");
    static File destination=new File("D:\\New folder\\qus.png");
    public static void main(String[] args) {
        try {
            copyFileUsingJava7(source,destination);
        } catch (IOException ex) {
            Logger.getLogger(UsingJava7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void copyFileUsingJava7(File source, File distination) throws IOException{
        Files.copy(source.toPath(), distination.toPath());
        System.out.println("File Copied");
    } 
}

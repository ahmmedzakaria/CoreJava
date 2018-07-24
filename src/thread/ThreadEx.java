/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zakakaria
 */
class NewThread extends Thread{

    public NewThread() {
        super("Demo Thread");
        System.out.println("Child Thread "+ this);
        this.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("Child Thread " + i);
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Child Interrupeted");
            }
        }
        System.out.println("Exithing Child Thread");
    }
    
    
    
}

public class ThreadEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new NewThread();
        for (int i = 5; i > 0; i--) {
            System.out.println("Main Thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Main Interrupeted");
            }
        }
        System.out.println("Exithing Main Thread");
    }
    
}

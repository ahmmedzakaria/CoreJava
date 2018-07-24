/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava.Generics;

/**
 *
 * @author Zakakaria
 */
public class Guest {
    public static void main(String[] args) {
        Glass<Juce> g=new Glass<>();
        Juce juce=new Juce();
        g.liquid=juce;
        
        Juce j=g.liquid;
        
        Tray t=new Tray();
        t.add(new Glass<String>());
               
    }
}

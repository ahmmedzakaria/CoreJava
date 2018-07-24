/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava.Generics;

import java.util.ArrayList;

/**
 *
 * @author Zakakaria
 */
public class Bartender {
    public <J,W>Cocktail mix(J j, W w){
    
    return new Cocktail();
    }

    
    
    public static void main(String[] args) {
        Bartender bartender=new Bartender();
        Juce juce=new Juce();
        Water water=new Water();
        
        Cocktail cocktail=bartender.<Juce,Water>mix(juce,water );
       
    }
    
    
}
class Cocktail {

        public Cocktail() {
        }
    }
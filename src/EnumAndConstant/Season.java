/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumAndConstant;

/**
 *
 * @author Zakaria
 */
public enum Season {
    WINTER(10),SUMMER(20);
    public int value;

    private Season(int value) {
        this.value = value;
    }
    
}


    class EnumExample1{
        public static void main(String[] args) {
            for(Season s: Season.values()){
                System.out.println("Season: "+s+" Value: "+s.value);
            }
        }
    }

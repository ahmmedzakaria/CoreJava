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
public class EnumExample {
    public enum Day{
        SAT, SUN, MON, WED, TUE, THU, FRI
    }
    
    public static void main(String[] args) {
        for(Day d: Day.values()){
            System.out.println("Day Name: "+d);
        }
    }
}

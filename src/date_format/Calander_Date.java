/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date_format;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Zakaria
 */
public class Calander_Date {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //cal.add(Calendar.DATE, 1);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        //System.out.println(cal.getTime());
// Output "Wed Sep 26 14:23:28 EST 2012"

      //  String formatted = format1.format(cal.getTime());
        System.out.println(format1);
// Output "2012-09-26"

        //System.out.println(format1.parse(formatted));
       int day=cal.get(Calendar.DAY_OF_MONTH);
       int month=cal.get(Calendar.MONTH);
//       Returns a number representing the month that contains or begins with the instant in time represented by this Date object. The value returned is between 0 and 11, with the value 0 representing January.
       int year=cal.get(Calendar.YEAR);
        System.out.println("Day: "+day);
        
        System.out.println("MONTH: "+month);
        System.out.println("YEAR: "+year);
    }
}

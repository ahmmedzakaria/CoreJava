/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemInfo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Zakakaria
 */
public class DateAndTime {
    public static void main(String[] args) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);
        
        /*Date Time Formats
        "dd MMMMM yyyy", "dd.MM.yy", "MM/dd/yy",
        "yyyy.MM.dd G 'at' hh:mm:ss z", "EEE, MMM d, ''yy", "h:mm a", "H:mm:ss:SSS", "K:mm a,z",
        "yyyy.MMMMM.dd GGG hh:mm aaa"
        
        */
        
    }
}

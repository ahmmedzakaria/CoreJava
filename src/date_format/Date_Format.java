/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date_format;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Zakaria
 */
public class Date_Format {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yy");
        Date date=new Date();
        String dateString = formatter.format(date);
        System.out.println("Formated Date: "+ dateString);
        System.out.println("date: "+ date);
        //System.out.println("Day: "+date.);
    }
}

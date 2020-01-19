package utils;

import base.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils extends TestBase {
    public static String getCurrentFormatterdDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        Date date = new Date();
        return formatter.format(date);
    }
}

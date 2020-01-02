package com.kingmao.library.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qinxuan
 */
public class DateUtil {

    public static String date2String(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date);
        return str;
    }
}

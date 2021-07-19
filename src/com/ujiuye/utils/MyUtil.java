package com.ujiuye.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

/**
 * @Author Bob
 * @Create 2021-07-18-19:05
 */
public class MyUtil {

    public static QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    public static String arrayToString(String[] hobbies) {
        String str = "";
        for (String hobby : hobbies) {
            str += "," + hobby;//dfdfdf
        }
        return str.substring(1);
    }
}

package util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author wj.
 * @version 2015/12/30.
 *          日期操作工具类
 */
public class DateUtils {

    /**
     * 将date格式化为字符串
     *
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    /**
     * 将date格式化为字符串
     *
     * @param date
     * @param pattern 描述日期和时间格式的模式
     * @return
     */
    public static String dateToString(Date date, String pattern) {
        if (null == pattern) {
            pattern = "yyyy-MM-dd";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 字符串转日期
     *
     * @param text
     * @return
     */
    public static Date stringToDate(String text) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(text, new ParsePosition(0));
        if (null == date) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(0);
            date = calendar.getTime();
        }
        return date;
    }

    public static void main(String[] args) {
        //System.setProperty("user.timezone","GMT");
        System.out.println(stringToDate("1"));
        System.out.println(new Date(0));
    }
}

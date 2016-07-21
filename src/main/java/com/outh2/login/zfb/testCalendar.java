package com.outh2.login.zfb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class testCalendar {
	public static void main(String[] args){
        Calendar c1 = Calendar.getInstance();
        c1.setTime(new Date());
        
        //当Calendar中设置的时间超过每项的最大值时,会以减去最大值后的值设置时间,例如月份设置13,最后会变成13-11=02
        Calendar c2 = Calendar.getInstance();
        c2.set(1920, 13, 24, 22, 32, 22);
        //使用pattern
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        SimpleDateFormat format2 = new SimpleDateFormat("yy-MM-dd H:m:s");
        SimpleDateFormat format3 = new SimpleDateFormat("y-M-d H:m:s");
        //使用约定格式
	DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());

 
        //获取Calendar中各个属性字段的方法
        System.out.println("The year now time is " + c1.get(c1.YEAR));
        System.out.println("The month now time is " + c1.get(c1.MONTH));
        System.out.println("The day_of_month now time is " + c1.get(c1.DAY_OF_MONTH));
        System.out.println("The day_of_week now timet is " + c1.get(c1.DAY_OF_WEEK));
        System.out.println("今天是在这个月的第几个星期: " + c1.get(c1.DAY_OF_WEEK_IN_MONTH));
        System.out.println("The day_of_year now time is " + c1.get(c1.DAY_OF_YEAR));
        //不同模式对应的格式略有不同,有时间可以测试多一点模式
        System.out.println("yyyy-MM-dd H:m:s-->" + format.format(c1.getTime()));
        System.out.println("yy-MM-dd H:m:s-->" + format2.format(c1.getTime()));
        System.out.println("y-M-d H:m:s-->" + format3.format(c1.getTime()));
        System.out.println("DateFormat.FULL-->" + dateFormat.format(c1.getTime()));

        System.out.println(format.format(c2.getTime()));

}  
}

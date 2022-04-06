package com.example.recyclerview04042022;

import java.util.Calendar;

public class Ultils {
    public static long getTime(int hour, int minute, int second)
    {
        Calendar calendar=Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),hour,minute,second);
        return calendar.getTimeInMillis();
    }
}

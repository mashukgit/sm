/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.git;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;

/**
 *
 * @author Mashuk
 */
public class DayFinder {

    private String dayName[] = new String[]{"Sunday", "Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday"};

    private enum MonthNumber {

        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    };
    private static final int JAN = 0;
    private static final int FEB = 3;
    private static final int MAR = 3;
    private static final int APR = 6;
    private static final int MAY = 1;
    private static final int JUN = 4;
    private static final int JUL = 6;
    private static final int AUG = 2;
    private static final int SEP = 5;
    private static final int OCT = 0;
    private static final int NOV = 3;
    private static final int DEC = 5;

    private static final int SUN = 0;
    private static final int MON = 1;
    private static final int TUE = 2;
    private static final int WED = 3;
    private static final int THU = 4;
    private static final int FRI = 5;
    private static final int SAT = 6;

    public DayFinder() {
    }

    private int getDayNumber(int year, int month, int date) {
        int dayNum = -1;
        year = year - 1900;       
        dayNum = (month + date + year + (year / 4)) % 7;
        return dayNum;
    }

    public static void main(String[] args) {
        DayFinder df = new DayFinder();
        int i = df.getDayNumber(2014, MAY, 1);
        System.out.println(i);
        System.out.println(df.dayName[i]);
    }
}

// $Id$
package be.zatenzu.oca.js8.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class OldAPI
{
  public static void main(String[] args)
  {
      /*************************************/
     /**  java.util.Date                 **/
    /*************************************/
    /** Constructors **/
    //public Date()
    Date now = new Date();//now
    //public Date(long date)
    Date date = new Date(0L);//01/01/1970
    
    /** Methods **/
    //Long getTime();
    System.out.println(now.getTime());//get Date as milliseconds from 01/01/1970 
    
      /*************************************/
     /**  java.util.Calendar             **/
    /*************************************/
    /** Constructors **/
    Calendar cNow = Calendar.getInstance();//now
//    Calendar cNow = new Calendar();//Abstract !
    
    /** Methodes **/
    //Date getTime();
    cNow.getTime();
    //void setTime(Date date);
    cNow.setTime(new Date());
    //void roll(int field, int value)
    cNow.roll(Calendar.DAY_OF_WEEK, 4);//add 4 days without incr weeks if needed
    //void roll(int field, boolean rollUp)
    cNow.roll(Calendar.DAY_OF_WEEK, true);//add 1 days without incr weeks if needed
    cNow.roll(Calendar.DAY_OF_WEEK, false);//subtract 1 days without incr weeks if needed
    //void add(int field, int value)
    cNow.add(Calendar.DAY_OF_WEEK, 4);//add 4 days with incr weeks if needed
    //int getFirstDayOfWeek()
    cNow.getFirstDayOfWeek();//MONDAY (in France), SUNDAY (in US)
    //int get(int field)
    cNow.get(Calendar.DAY_OF_MONTH);
    
     /*************************************/
    /**  java.text.DateFormat           **/
   /*************************************/
    /** Constructors **/
    //Abstract class!
//  public static DateFormat getInstance();//get date and time format
//  public static DateFormat getDateInstance();//get date format
//  public static DateFormat getDateInstance(int style);
    DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
//  DateFormat dff = DateFormat.getDateInstance(int style, Local locale);
//  DateFormat dff = DateFormat.getDateTimeInstance();
//  DateFormat dff = DateFormat.getDateTimeInstance(int style);
//  DateFormat dff = DateFormat.getDateTimeInstance(int style, Local locale);
//  DateFormat dff = DateFormat.getTimeInstance();
//  DateFormat dff = DateFormat.getTimeInstance(int style);
//  DateFormat dff = DateFormat.getTimeInstance(int style, Local locale);
    
    /** Methods **/
    //String format(Date d);
    //public Date parse(String dateAsString) throw ParseException
    DateFormat df = DateFormat.getInstance();
    System.out.println(df.format(now));
    try
    {
      Date d = df.parse("9/01/15 16:35");
    }
    catch (ParseException e)
    {
      e.printStackTrace();
    }
  }
}


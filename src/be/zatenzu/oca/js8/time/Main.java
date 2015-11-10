package be.zatenzu.oca.js8.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Locale;

/**
 * Created by tda on 9/08/2015.
 */
public class Main{

  public static void main(String[] args){

    //LocalDate, LocalDateTime, LocalTime, Period and Duration are IMMUTABLE and thread-safe
    /** format methods are not static **/
    /** parse methods are static excepted for DateTimeFormatter **/

    /*************************************/
    /**       LocalDate                 **/
    /*************************************/

    //!\ IMMUTABLE !

    //Contains just date
    /** public static LocalDate now() */
    System.out.println(LocalDate.now());

    /** public static LocalDate of(int year, int month, int day) */
    LocalDate.of(2015, 8, 9);
//    LocalDate.of(2015, 8, 38);//throws DateTimeException

    /** public static LocalDate of(int year, Month month, int day) */
    LocalDate.of(2015, Month.AUGUST, 9);

    /** public LocalDate plusDays(long daysToAdd) */
    //create a copy, add days and return this copy. The instance isn't modified
    LocalDate localDate = LocalDate.now();
    localDate = localDate.plusDays(2);
    System.out.println(localDate);

    /** public LocalDate minusDays(long daysToSubtract) */
    //subtract days from date
    localDate = localDate.minusDays(2);
    System.out.println(localDate);

    /** public LocalDate plusWeeks(long weeksToAdd) */
    //add weeks to the date
    localDate = localDate.plusWeeks(1);
    System.out.println(localDate);

    /** public LocalDate minusWeeks(long weeksToSubstract) */
    //substract weeks to the date
    localDate = localDate.minusWeeks(1);
    System.out.println(localDate);

    /** public LocalDate plusMonths(long mountsToAdd) */
    //add months to the date
    localDate = localDate.plusMonths(1);
    System.out.println(localDate);

    /** public LocalDate minusMonths(long monthsToSubstract) */
    //substract months to the date
    localDate = localDate.plusMonths(1);
    System.out.println(localDate);

    /** public LocalDate plusYears(long yearsToAdd) */
    //add years to the date
    localDate = localDate.plusYears(1);
    System.out.println(localDate);

    /** public LocalDate minusYears(long yearsToSubstract) */
    //substract years to the date
    localDate = localDate.minusYears(1);
    System.out.println(localDate);

    /** public LocalDate minus(java.time.temporal.TemporalAmount amountToSubtract) **/
    localDate.minus(Period.of(1, 1, 1));

    /** public LocalDate minus(long amountToSubtract, java.time.temporal.TemporalUnit unit) **/
    localDate.minus(3L, ChronoUnit.DAYS);

    /**public LocalDate plus(java.time.temporal.TemporalAmount amountToAdd) **/
    localDate.plus(Period.of(1, 2, 2));

    /** public LocalDate plus(long amountToAdd, java.time.temporal.TemporalUnit unit) **/
    localDate.plus(3L, ChronoUnit.DAYS);//if ChronoUnit.HOURS --> UnsupportedTemporalTypeException because no hours in localDate

    /** public boolean isBefore(LocalDate otherDate) */
    //return true if the date is before the otherDate
    localDate.isBefore(LocalDate.now());

    /** public long toEpochDay() */
    //return the number of days since 1970/01/01
    localDate.toEpochDay();

    /** public String format(DateTimeFormatter formatter) */
    //return the date as string
    //can throw DateTimeException
    System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
    System.out.println(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

    /** public static LocalDate parse(CharSequence charSeq) throw DateTimeParseException */
    LocalDate.parse("1986-05-01");
    //the string must be a date in ISO format
    /** public static LocalDate parse(CharSequence charSeq, DateTimeFormatter dtf) throw DateTimeParseException */

    /** public static LocalDate parse(CharSequence charSeq, DateTimeFormatter formatter)*/
    DateTimeFormatter formatterA = DateTimeFormatter.ofPattern("ddMMyyyy HH:mm:ss");
    DateTimeFormatter formatterB = DateTimeFormatter.ofPattern("ddMMyyyy HH:mm:ss", Locale.FRANCE);
    LocalDate.parse("01051986 22:22:22", formatterA);//can throw DateTimeParseException
    LocalDate.parse("01051986 22:22:22", formatterB);

    /*************************************/
    /**       LocalTime                 **/
    /*************************************/
    //!\\ Immutable !

    //Contains just time
    /** public static LocalTime now() */
    System.out.println(LocalTime.now());

    /** public static LocalTime of(int hour, int minute) */
    LocalTime.of(3, 25);
//    LocalTime.of(24, 25);//DateTimeException

    /** public static LocalTime of(int hour, int minute, int second) */
    LocalTime.of(3,25,59);

    /** public static LocalTime of(int hour, int minute, int second, int nanosecond) */
    LocalTime.of(3, 25, 59, 599);//hms ns

    /** public LocalTime plusHours(long hoursToAdd) */
    //add hours ti the time
    LocalTime lt = LocalTime.now();
    lt = lt.plusHours(1);
    System.out.println(lt);

    /** public LocalTime minusHours(long hoursToSubstract) */
    //substract hours from the time
    lt = lt.minusHours(1);
    System.out.println(lt);

    /** public LocalTime plusMinutes(long minutesToAdd) */
    //add minutes to the time
    lt = lt.plusMinutes(1);
    System.out.println(lt);

    /** public LocalTime minusMinutes(long minutesToSubstract) */
    //substract minutes to the time
    lt = lt.minusMinutes(1);
    System.out.println(lt);

    /** public LocalTime plusSeconds(long secondsToAdd) */
    //add seconds to the time
    lt = lt.plusSeconds(1);
    System.out.println(lt);

    /** public LocalTime minusSeconds(long secondsToSubstract) */
    //substract seconds to the time
    lt = lt.plusSeconds(1);
    System.out.println(lt);

    /** public LocalTime plusNanos(long nanosecToAdd) */
    //add nanosec to the time
    lt = lt.plusNanos(212);
    System.out.println(lt);

    /** public LocalTime minusNanos(long nanosecToSubstract) */
    //substract nanosec to the time
    lt = lt.minusNanos(212);
    System.out.println(lt);

    /** public String format(DateTimeFormatter formatter) **/
    LocalTime.now().format(DateTimeFormatter.ISO_TIME);
    System.out.println(LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

    LocalTime.parse("23:59");
    LocalTime.parse("23:59", DateTimeFormatter.ISO_TIME);

    /*************************************/
    /**       LocalDateTime             **/
    /*************************************/
    //!\\ IMMUTABLE

    //Contains date and time
    /** public static LocalDateTime now() */
    System.out.println(LocalDateTime.now());

    /** public static LocalDateTime of(int year, int month, int day, int hour, int minute) */
    LocalDateTime.of(2015, 12, 25, 12, 55);//DateTimeException!

    /** public static LocalDateTime of(int year, int month, int day, int hour, int minute, int second) */
    LocalDateTime.of(2015, 12, 25, 12, 55, 59);//DateTimeException!

    /** public static LocalDateTime of(int year, int month, int day, int hour, int minute, int second, int nanosecond) */
    LocalDateTime.of(2015, 12, 25, 12, 55, 59, 200);//DateTimeException!

    /** public static LocalDateTime of(int year, int month, int day, int hour, int minute) */
    LocalDateTime.of(2015, Month.DECEMBER, 25, 12, 55);//DateTimeException!

    /** public static LocalDateTime of(int year, Month month, int day, int hour, int minute, int second) */
    LocalDateTime.of(2015, Month.DECEMBER, 25, 12, 55, 59);//DateTimeException!

    /** public static LocalDateTime of(int year, Month month, int day, int hour, int minute, int second, int nanosecond) */
    LocalDateTime.of(2015, Month.DECEMBER, 25, 12, 55, 59, 200);//DateTimeException!

    /** public static LocalDateTime of(LocalDate date, LocalTime time) */
    LocalDateTime.of(LocalDate.now(), LocalTime.now());

    /** LocalDateTime has all minus and plus methods */

    /** public long toEpochSecond(ZoneOffset zoneOffset) */
    //Converts this date-time to the number of seconds from the epoch of 1970-01-01
    LocalDateTime ldt = LocalDateTime.now();
    ZoneId zoneId = ZoneId.of(ZoneId.getAvailableZoneIds().toArray()[0].toString());
    ZonedDateTime zdt = ldt.atZone(zoneId);
    ldt.toEpochSecond(zdt.getOffset());


    /*************************************/
    /**       Period                    **/
    /*************************************/
    // = Date based
    //
    // class methods
    //
    /** public static Period ofYears(int years) */
    //Obtains a Period representing a number of years (+ or -)
    Period p = Period.ofYears(1);

    /** public static Period ofMonths(int months) */
    //Obtains a Period representing a number of months (+ or -)
    p = Period.ofMonths(1);

    /** public static Period ofDays(int days) */
    //Obtains a Period representing a number of days (+ or -)
    p = Period.ofDays(1);

    /** public static Period ofWeeks(int weeks) */
    //Obtains a Period representing a number of weeks (+ or -)
    p = Period.ofWeeks(1);

    /** public static Period of(int years, int months, int days) */
    //Obtains a Period representing a number of days, months, years (+ or -)
    p = Period.of(1, 1, 1);

    /** public static Period between(LocalDate fromDate, LocalDate toDate) **/
    //Return the period between fromDate(included) to toDate (excluded)
    p = Period.between(LocalDate.now(), LocalDate.now());//from and end cannot be null -> NPE

    //
    // instance methods
    //
    /** public Period withDays(int i) **/
    //returns a copy of the period and sets days to i

    /** public Period withDays(int d) **/
    //returns a copy of the period and sets days to d

    /** public Period withMonths(int m) **/
    //returns a copy of the period and sets months to m

    /** public Period withYears(int y) **/
    //returns a copy of the period and sets years to y

    /** public Period minusDays(long d) **/
    //Returns a copy of the period with d days subtracted

    /** public Period minusMonths(long m) **/
    //Returns a copy of the period with m months subtracted

    /** public Period minusYears(long y) **/
    //Returns a copy of the period with y years subtracted

    /** public Period plusDays(long d) **/
    //Returns a copy of the period with d days added

    /** public Period plusMonths(long m) **/
    //Returns a copy of the period with m months added

    /** public Period plusYears(long y) **/
    //Returns a copy of the period with y years added

    /** public String toString() **/
    //Return the period as string
    System.out.println(Period.of(1, 2, 3));//P1Y2M3D

    /** public int getDays() **/
    p.getDays();

    /** public int getMonths() **/
    p.getMonths();

    /** public int getYears() **/
    p.getYears();

    /** public long get(java.time.temporal.TemporalUnit unit) **/
    p.get(ChronoUnit.DAYS);

    /*************************************/
    /**       Duration                  **/
    /*************************************/
    // ! in 1Z0-808
    // time based
    Duration.of(0L, ChronoUnit.HOURS); //can throw UnsupportedTemporalTypeException if unit isn't time based

    /*************************************/
    /**       DateTimeFormatter         **/
    /*************************************/
    //DateTimeFormatter.ISO_DATE;
    //DateTimeFormatter.ISO_DATE_TIME;
    //ect...

    /** public static DateTimeFormatter ofLocalizedDate(FormatStyle style) */
    //Get a formatter for a date
    DateTimeFormatter shortDateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);//short -> dd/MM/yy
    DateTimeFormatter mediumDateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);//medium -> dd-Mois-yyyy
    System.out.println(shortDateFormatter.format(LocalDateTime.now()));//dd/MM/yy
    System.out.println(mediumDateFormatter.format(LocalDate.now()));//dd-mois-yyyy
//    System.out.println(shortDateTime.format(LocalTime.now())); //UnsupportedTemporalTypeException -> No date!

    /** public static DateTimeFormatter ofLocalizedDateTime(FormatStyle style) */
    //Get a formatter for a datetime
    DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);//short -> dd/MM/yy HH:mm
    DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);//medium -> dd-Mois-yy HH:mm:ss
    System.out.println(shortDateTime.format(LocalDateTime.now()));//dd/MM/yy HH:mm
    System.out.println(mediumDateTime.format(LocalDateTime.now()));//dd-Mois-yy HH:mm:ss
//    System.out.println(mediumDateTime.format(LocalDate.now()));//UnsupportedTemporalTypeException -> No time!
//    System.out.println(shortDateTime.format(LocalTime.now()));//UnsupportedTemporalTypeException -> No date!

    /** public static DateTimeFormatter ofLocalizedTime(FormatStyle style) */
    DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    DateTimeFormatter mediumTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
    System.out.println(shortTime.format(LocalDateTime.now()));//HH:mm
    System.out.println(mediumTime.format(LocalDateTime.now()));//HH:mm:ss
//    System.out.println(mediumTime.format(LocalDate.now()));//UnsupportedTemporalTypeException -> no time
    System.out.println(mediumTime.format(LocalTime.now()));//HH:mm:ss

    /** String format(LocalDateTme ldt) throw DateTimeException */
    DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now());

    /** public void parse(String s) throw DateTimeParseException **/
    DateTimeFormatter.ISO_LOCAL_DATE_TIME.parse("2015-09-11T18:03:35.995");

    /** public static DateTimeFormatter ofPattern(String s)*/
    /** public static DateTimeFormatter ofPattern(String s, Local l)*/
    DateTimeFormatter.ofPattern("yyyy-MM-ss");
    DateTimeFormatter.ofPattern("yyyy-MM-ss", Locale.FRANCE);
  }
}

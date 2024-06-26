/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 22:56:25 GMT 2024
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Month;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.setDomainDescription("C");
      assertEquals("C", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("Vj", "Vj", "Vj");
      TimeSeries timeSeries1 = new TimeSeries("Vj", "Vj", "Vj");
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(Double.NaN, timeSeries1.getMinY(), 0.01);
      assertTrue(boolean0);
      assertEquals("Vj", timeSeries1.getRangeDescription());
      assertEquals(Double.NaN, timeSeries1.getMaxY(), 0.01);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("Vj", timeSeries1.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("Vj", "Vj", "Vj");
      timeSeries0.getItems();
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Vj", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Vj", timeSeries0.getDomainDescription());
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1520), (-1520), 2, 4873, 7, 2);
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREA;
      Month month0 = new Month(mockDate0, timeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      timeSeries0.getTimePeriodClass();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, 595.4421, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period [20,14/2/2014] but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries("XSw'=2!8-^V", "XSw'=2!8-^V", "XSw'=2!8-^V");
      timeSeries0.add((RegularTimePeriod) hour0, (double) 23, false);
      timeSeries0.getValue((RegularTimePeriod) hour0);
      assertEquals(23.0, timeSeries0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("SortOrder.ASCENDING", (String) null, "SortOrder.ASCENDING");
      double double0 = timeSeries0.getMaxY();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("SortOrder.ASCENDING", timeSeries0.getRangeDescription());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("Vj", "Vj", "Null 'period' argument.");
      assertEquals("Null 'period' argument.", timeSeries0.getRangeDescription());
      
      timeSeries0.setRangeDescription("Vj");
      assertEquals("Vj", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1165), (-1165), 41, (-1165), 41);
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      double double0 = timeSeries0.getMinY();
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("", "kx?", "");
      Millisecond millisecond0 = new Millisecond();
      timeSeries0.add((RegularTimePeriod) millisecond0, (double) 999, false);
      timeSeries0.getDataItem((RegularTimePeriod) millisecond0);
      assertEquals(999.0, timeSeries0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((double) (-2002), (double) (-2002));
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.getNextTimePeriod();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(91);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "K0qTU", "K0qTU");
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      assertEquals("K0qTU", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals(Double.NaN, timeSeries1.getMaxY(), 0.01);
      assertEquals("K0qTU", timeSeries1.getDomainDescription());
      assertEquals(Double.NaN, timeSeries1.getMinY(), 0.01);
      assertNotSame(timeSeries1, timeSeries0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (double) 0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-1015));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((double) (-1943), (double) (-1943));
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1943));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("Vj", "Vj", "Vj");
      MockDate mockDate0 = new MockDate(29, 1531, 29);
      Second second0 = new Second(mockDate0);
      timeSeries0.getDataItem((RegularTimePeriod) second0);
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Vj", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals("Vj", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1165), (-1165), 41, (-1165), 41);
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      Year year0 = new Year(mockDate0);
      timeSeries0.getRawDataItem(year0);
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      Second second0 = new Second();
      timeSeries0.add((RegularTimePeriod) second0, (-1045.117751849952), false);
      timeSeries0.getRawDataItem(millisecond0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "XSw'=2!8-^V", "XSw'=2!8-^V");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.getTimePeriods();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = SerialDate.DATE_FORMAT_SYMBOLS;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(1721);
      Date date0 = mockSimpleDateFormat0.parse("kx?", parsePosition0);
      Hour hour0 = new Hour(date0);
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (double) 23, true);
      timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = SerialDate.DATE_FORMAT_SYMBOLS;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(1721);
      Date date0 = mockSimpleDateFormat0.parse("kx?", parsePosition0);
      Hour hour0 = new Hour(date0);
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (double) 23, true);
      TimeSeries timeSeries1 = new TimeSeries(date0);
      timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("Vj", "Vj", "Vj");
      Second second0 = new Second();
      timeSeries0.getValue((RegularTimePeriod) second0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Vj", timeSeries0.getRangeDescription());
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals("Vj", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("Vj", "Vj", "Vj");
      // Undeclared exception!
      try { 
        timeSeries0.add((TimeSeriesDataItem) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      Millisecond millisecond0 = new Millisecond();
      timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Millisecond.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.add(regularTimePeriod0, 595.4421, false);
      timeSeries0.addOrUpdate(regularTimePeriod0, (double) 0);
      assertEquals(0.0, timeSeries0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hour hour0 = new Hour();
      MockDate mockDate0 = new MockDate((-1165), (-1165), 41, (-1165), 41);
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      RegularTimePeriod regularTimePeriod0 = hour0.previous();
      timeSeries0.add((RegularTimePeriod) hour0, 1.5, true);
      timeSeries0.add(regularTimePeriod0, (Number) 23, true);
      assertEquals(2, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hour hour0 = new Hour();
      MockDate mockDate0 = new MockDate((-1165), (-1165), 0, (-1165), 0);
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.add((RegularTimePeriod) hour0, 1.5, true);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) hour0, (Number) 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // There is no existing value for the specified 'period'.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries("XSw'=2!8-^V", "XSw'=2!8-^V", "XSw'=2!8-^V");
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, Double.NaN);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.update((RegularTimePeriod) hour0, (Number) 0);
      assertEquals(0.0, timeSeries0.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.add(regularTimePeriod0, 595.4421, true);
      timeSeries0.update(regularTimePeriod0, (Number) 23);
      assertEquals(2, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries("XSw'=2!8-^V", "XSw'=2!8-^V", "XSw'=2!8-^V");
      timeSeries0.add((RegularTimePeriod) hour0, (double) 23, false);
      timeSeries0.addAndOrUpdate(timeSeries0);
      assertEquals(23.0, timeSeries0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((TimeSeriesDataItem) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("Vj", "Fourth", "Fourth");
      Day day0 = new Day();
      Hour hour0 = new Hour((-990), day0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 23);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) day0, (double) (-990));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of org.jfree.data.time.Hour.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries("XSw'=2!8-^V", "XSw'=2!8-^V", "XSw'=2!8-^V");
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, Double.NaN);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, Double.NaN);
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals("XSw'=2!8-^V", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals("XSw'=2!8-^V", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      Second second0 = new Second();
      timeSeries0.add((RegularTimePeriod) second0, (-1045.117751849952), false);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) millisecond0, (RegularTimePeriod) millisecond0);
      timeSeries1.setMaximumItemCount(0);
      timeSeries1.addAndOrUpdate(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.setMaximumItemAge(0);
      timeSeries0.add(regularTimePeriod0, (double) 0, false);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("");
      timeSeries0.removeAgedItems((long) 9999, true);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.removeAgedItems((long) 0, true);
      timeSeries0.removeAgedItems((long) 23, true);
      assertEquals(0.0, timeSeries0.getMinY(), 0.01);
      assertEquals(0.0, timeSeries0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "C;hE'8!u", "C;hE'8!u");
      timeSeries0.clear();
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("C;hE'8!u", timeSeries0.getRangeDescription());
      assertEquals("C;hE'8!u", timeSeries0.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "*-tntdb[+Q,", "*-tntdb[+Q,");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 23);
      timeSeries0.clear();
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.delete((RegularTimePeriod) hour0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.add(regularTimePeriod0, 595.4421, false);
      timeSeries0.delete((RegularTimePeriod) hour0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(91);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "K0qTU", "K0qTU");
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, (-989), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.delete(0, 0, false);
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-489), 23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(243, 41);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(23, 23);
      assertEquals(Double.NaN, timeSeries1.getMinY(), 0.01);
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Double.NaN, timeSeries1.getMaxY(), 0.01);
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((double) (-1943), (double) (-1943));
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, (String) null, (String) null);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries("C;hE'8!u", "", ",");
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'end' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hour hour0 = new Hour();
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) hour0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "C;hE'8!u", "C;hE'8!u");
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
      assertEquals("C;hE'8!u", timeSeries1.getRangeDescription());
      assertEquals(Double.NaN, timeSeries1.getMaxY(), 0.01);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Double.NaN, timeSeries1.getMinY(), 0.01);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("C;hE'8!u", timeSeries1.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries("Vj");
      timeSeries0.add((RegularTimePeriod) millisecond0, (double) 999, true);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) fixedMillisecond0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "C;hE'8!u", "C;hE'8!u");
      timeSeries0.add((RegularTimePeriod) hour0, (double) 23, false);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.createCopy(regularTimePeriod0, regularTimePeriod0);
      assertEquals(23.0, timeSeries0.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      boolean boolean0 = timeSeries0.equals(timeSeries0);
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertTrue(boolean0);
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Hour hour0 = new Hour();
      Instant instant0 = MockInstant.now();
      TimeSeries timeSeries0 = new TimeSeries(instant0);
      boolean boolean0 = timeSeries0.equals(hour0);
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("", "Vj", "Vj");
      TimeSeries timeSeries1 = new TimeSeries("", "Null 'period' argument.", "E[Z'~r");
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(Double.NaN, timeSeries1.getMaxY(), 0.01);
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("Null 'period' argument.", timeSeries1.getDomainDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Double.NaN, timeSeries1.getMinY(), 0.01);
      assertEquals("E[Z'~r", timeSeries1.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("Vj", "Vj", "Null 'period' argument.");
      TimeSeries timeSeries1 = new TimeSeries("Null 'period' argument.", "Vj", "L_uv1FnmPM");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals("Vj", timeSeries1.getDomainDescription());
      assertEquals(Double.NaN, timeSeries1.getMaxY(), 0.01);
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("L_uv1FnmPM", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals(Double.NaN, timeSeries1.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "'=M!8-^|V", "'=M!8-^|V");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      TimeSeries timeSeries1 = new TimeSeries("'=M!8-^|V", "'=M!8-^|V", "'=M!8-^|V");
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(0.0, timeSeries0.getMinY(), 0.01);
      assertEquals(Double.NaN, timeSeries1.getMinY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("VY", "VY", "VY");
      timeSeries0.setMaximumItemAge(1000L);
      TimeSeries timeSeries1 = new TimeSeries("VY", "VY", "VY");
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(1000L, timeSeries0.getMaximumItemAge());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("Vj", "Vj", "Vj");
      TimeSeries timeSeries1 = new TimeSeries("L_uv1FnmPM", "Vj", "Vj");
      timeSeries1.setMaximumItemCount(23);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(23, timeSeries1.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("", (String) null, "");
      timeSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("", "ue", (String) null);
      timeSeries0.hashCode();
      assertEquals("ue", timeSeries0.getDomainDescription());
      assertEquals(Double.NaN, timeSeries0.getMinY(), 0.01);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(Double.NaN, timeSeries0.getMaxY(), 0.01);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.hashCode();
      assertEquals(0.0, timeSeries0.getMinY(), 0.01);
      assertEquals(0.0, timeSeries0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.add(regularTimePeriod0, (double) 23, true);
      timeSeries0.hashCode();
      assertEquals(2, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Hour hour0 = new Hour();
      MockDate mockDate0 = new MockDate((-1165), (-1165), 0, (-1165), 2);
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      timeSeries0.add((RegularTimePeriod) hour0, (double) (-1165), true);
      assertEquals((-1165.0), timeSeries0.getMaxY(), 0.01);
      
      timeSeries0.update((RegularTimePeriod) hour0, (Number) null);
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries("XSw'=2!8-^V", "XSw'=2!8-^V", "XSw'=2!8-^V");
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, Double.NaN);
      timeSeries0.delete((RegularTimePeriod) hour0);
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.addOrUpdate(regularTimePeriod0, (-1081.39388346164));
      timeSeries0.delete((RegularTimePeriod) hour0);
      assertEquals((-1081.39388346164), timeSeries0.getMinY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "d4hG!");
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 23);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.addOrUpdate(regularTimePeriod0, Double.NaN);
      assertEquals(23.0, timeSeries0.getMaxY(), 0.01);
  }
}

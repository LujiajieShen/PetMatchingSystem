package org.jfree.data.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = org.jfree.data.time.MonthConstants.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        int int11 = day9.compareTo((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day9, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 9-April-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = org.jfree.data.time.MonthConstants.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setKey(comparable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(timeSeriesDataItem11);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = org.jfree.data.time.MonthConstants.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class1 = org.jfree.data.time.RegularTimePeriod.downsize(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.util.Calendar calendar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = day10.getMiddleMillisecond(calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jfree.data.time.Day day1 = org.jfree.data.time.Day.parseDay("Value");
        org.junit.Assert.assertNull(day1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        java.lang.Class<?> wildcardClass12 = timeSeries1.getClass();
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        int int17 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.Class class34 = timeSeries1.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(5, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712689199999L + "'", long32 == 1712689199999L);
        org.junit.Assert.assertNull(class34);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        timeSeries19.setMaximumItemCount((int) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int0 = org.jfree.data.time.Year.MINIMUM_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-9999) + "'", int0 == (-9999));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            month0.peg(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((-1), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        java.lang.String str3 = day0.toString();
        long long4 = day0.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9-April-2024" + "'", str3, "9-April-2024");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1712646000000L + "'", long4 == 1712646000000L);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries19.getValue(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        org.jfree.data.time.Year year7 = new org.jfree.data.time.Year((int) (short) -1);
        long long8 = year7.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year7, (java.lang.Number) 9223372036854775807L);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62198899200000L) + "'", long8 == (-62198899200000L));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(0, 9999, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries1.getValue(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            day3.peg(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int5 = day0.compareTo((java.lang.Object) 45391L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1712689199999L + "'", long3 == 1712689199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = day2.getLastMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        timeSeries1.setMaximumItemCount(100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException1 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException3 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException1.addSuppressed((java.lang.Throwable) timePeriodFormatException3);
        java.lang.Throwable[] throwableArray5 = timePeriodFormatException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        long long17 = day12.getLastMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1712732399999L + "'", long17 == 1712732399999L);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int5 = day0.compareTo((java.lang.Object) 45391L);
        java.util.Date date6 = day0.getEnd();
        java.util.TimeZone timeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month8 = new org.jfree.data.time.Month(date6, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1712689199999L + "'", long3 == 1712689199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year((int) (short) -1);
        long long2 = year1.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year1, (java.lang.Number) 9223372036854775807L);
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = year1.getFirstMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-62198899200000L) + "'", long2 == (-62198899200000L));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str0 = org.jfree.data.time.TimeSeries.DEFAULT_DOMAIN_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Time" + "'", str0, "Time");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        double double38 = timeSeries37.getMinY();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        long long1 = day0.getSerialIndex();
        java.util.Date date2 = day0.getEnd();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 45391L + "'", long1 == 45391L);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        timeSeries1.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        long long8 = day2.getFirstMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712646000000L + "'", long8 == 1712646000000L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        java.lang.Object obj2 = seriesChangeEvent1.getSource();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0d + "'", obj2, 10.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo2 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo2);
        java.lang.Object obj4 = seriesChangeEvent1.getSource();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo5 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo5);
        java.lang.String str7 = seriesChangeEvent1.toString();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jfree.data.event.SeriesChangeEvent[source=10.0]" + "'", str7, "org.jfree.data.event.SeriesChangeEvent[source=10.0]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        int int6 = day2.getDayOfMonth();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = day2.getLastMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month9 = new org.jfree.data.time.Month(date6, timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        timeSeries1.setMaximumItemCount(9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        long long7 = day3.getSerialIndex();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 45391L + "'", long7 == 45391L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        java.util.List list42 = timeSeries41.data;
        timeSeries1.data = list42;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        timeSeries1.setMaximumItemCount(0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        long long20 = month4.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1711954800000L + "'", long20 == 1711954800000L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod6, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            year9.peg(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day40 = new org.jfree.data.time.Day();
        timeSeries39.add((org.jfree.data.time.RegularTimePeriod) day40, (double) (short) 0, false);
        timeSeries39.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = timeSeries39.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent48 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean49 = timeSeries39.equals((java.lang.Object) seriesChangeEvent48);
        org.jfree.data.time.Day day50 = new org.jfree.data.time.Day();
        int int52 = day50.compareTo((java.lang.Object) (short) 100);
        java.lang.String str53 = day50.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = timeSeries39.getDataItem((org.jfree.data.time.RegularTimePeriod) day50);
        java.lang.Number number55 = timeSeriesDataItem54.getValue();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.add(timeSeriesDataItem54, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 9-April-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(regularTimePeriod46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "9-April-2024" + "'", str53, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem54);
        org.junit.Assert.assertEquals("'" + number55 + "' != '" + 0.0d + "'", number55, 0.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener38);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        double double10 = timeSeries1.getMaxY();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries9.addChangeListener(seriesChangeListener10);
        long long12 = timeSeries9.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries16.addChangeListener(seriesChangeListener17);
        long long19 = timeSeries16.getMaximumItemAge();
        java.lang.String str20 = timeSeries16.getDescription();
        double double21 = timeSeries16.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day24 = new org.jfree.data.time.Day();
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day24, (double) (short) 0, false);
        timeSeries23.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries23.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent32 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean33 = timeSeries23.equals((java.lang.Object) seriesChangeEvent32);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day();
        int int36 = day34.compareTo((java.lang.Object) (short) 100);
        java.lang.String str37 = day34.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries23.getDataItem((org.jfree.data.time.RegularTimePeriod) day34);
        timeSeries16.add(timeSeriesDataItem38);
        timeSeries9.add(timeSeriesDataItem38, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem38, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 9-April-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(regularTimePeriod30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "9-April-2024" + "'", str37, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem38);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int5 = day0.compareTo((java.lang.Object) 45391L);
        java.util.Date date6 = day0.getEnd();
        int int7 = day0.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1712689199999L + "'", long3 == 1712689199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2024 + "'", int7 == 2024);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list12 = timeSeries11.data;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        timeSeries14.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries14.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent23 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean24 = timeSeries14.equals((java.lang.Object) seriesChangeEvent23);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        int int27 = day25.compareTo((java.lang.Object) (short) 100);
        java.lang.String str28 = day25.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries14.getDataItem((org.jfree.data.time.RegularTimePeriod) day25);
        boolean boolean30 = timeSeriesDataItem29.isSelected();
        int int32 = timeSeriesDataItem29.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries11.addOrUpdate(timeSeriesDataItem29);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries1.addAndOrUpdate(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries11.getRawDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "9-April-2024" + "'", str28, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem33);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getTimePeriod(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        java.util.TimeZone timeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month8 = new org.jfree.data.time.Month(date6, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.Month month7 = new org.jfree.data.time.Month(date6);
        java.lang.String str8 = month7.toString();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "April 2024" + "'", str8, "April 2024");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8);
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = month10.getFirstMillisecond(calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        java.lang.Number number17 = timeSeriesDataItem16.getValue();
        java.lang.Object obj18 = timeSeriesDataItem16.clone();
        java.lang.Number number19 = timeSeriesDataItem16.getValue();
        timeSeriesDataItem16.setValue((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0.0d + "'", number17, 0.0d);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 0.0d + "'", number19, 0.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        timeSeries5.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries5.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent14 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean15 = timeSeries5.equals((java.lang.Object) seriesChangeEvent14);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        int int18 = day16.compareTo((java.lang.Object) (short) 100);
        java.lang.String str19 = day16.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries5.getDataItem((org.jfree.data.time.RegularTimePeriod) day16);
        int int21 = day16.getDayOfMonth();
        java.lang.Number number22 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day16, number22);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries1.removeChangeListener(seriesChangeListener24);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "9-April-2024" + "'", str19, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date6, timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        long long6 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        double double10 = timeSeries1.getMinY();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        timeSeries1.removeAgedItems(true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year((int) (byte) -1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo2 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo2);
        java.lang.Object obj4 = seriesChangeEvent1.getSource();
        java.lang.String str5 = seriesChangeEvent1.toString();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jfree.data.event.SeriesChangeEvent[source=10.0]" + "'", str5, "org.jfree.data.event.SeriesChangeEvent[source=10.0]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        long long8 = day2.getLastMillisecond();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712732399999L + "'", long8 == 1712732399999L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jfree.data.time.Day day1 = org.jfree.data.time.Day.parseDay("hi!");
        org.junit.Assert.assertNull(day1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate8 = day2.getSerialDate();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = day2.getLastMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(serialDate8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        timeSeries19.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries19.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent28 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean29 = timeSeries19.equals((java.lang.Object) seriesChangeEvent28);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        int int32 = day30.compareTo((java.lang.Object) (short) 100);
        java.lang.String str33 = day30.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries19.getDataItem((org.jfree.data.time.RegularTimePeriod) day30);
        int int35 = day10.compareTo((java.lang.Object) day30);
        java.util.Calendar calendar36 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long37 = day10.getFirstMillisecond(calendar36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "9-April-2024" + "'", str33, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        timeSeries5.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries5.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent14 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean15 = timeSeries5.equals((java.lang.Object) seriesChangeEvent14);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        int int18 = day16.compareTo((java.lang.Object) (short) 100);
        java.lang.String str19 = day16.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries5.getDataItem((org.jfree.data.time.RegularTimePeriod) day16);
        int int21 = day16.getDayOfMonth();
        java.lang.Number number22 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day16, number22);
        java.util.Date date24 = day16.getStart();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "9-April-2024" + "'", str19, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Tue Apr 09 00:00:00 PDT 2024");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        long long18 = day10.getFirstMillisecond();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712646000000L + "'", long18 == 1712646000000L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        java.util.TimeZone timeZone10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(date8, timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent3 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo4 = null;
        seriesChangeEvent3.setSummary(seriesChangeInfo4);
        int int6 = month0.compareTo((java.lang.Object) seriesChangeInfo4);
        java.lang.String str7 = month0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "April 2024" + "'", str7, "April 2024");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1711954800000L + "'", long2 == 1711954800000L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        long long3 = month0.getFirstMillisecond();
        org.jfree.data.time.Year year4 = month0.getYear();
        org.jfree.data.time.Month month6 = new org.jfree.data.time.Month();
        long long7 = month6.getFirstMillisecond();
        long long8 = month6.getLastMillisecond();
        long long9 = month6.getFirstMillisecond();
        org.jfree.data.time.Year year10 = month6.getYear();
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(10, year10);
        boolean boolean12 = year4.equals((java.lang.Object) 10);
        java.lang.String str13 = year4.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711954800000L + "'", long3 == 1711954800000L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1714546799999L + "'", long8 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1711954800000L + "'", long9 == 1711954800000L);
        org.junit.Assert.assertNotNull(year10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2024" + "'", str13, "2024");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.previous();
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = day12.getLastMillisecond(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        java.util.List list5 = timeSeries1.getItems();
        java.util.List list6 = timeSeries1.data;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day13 = new org.jfree.data.time.Day();
        timeSeries12.add((org.jfree.data.time.RegularTimePeriod) day13, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries8.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day13, (java.lang.Number) 10L);
        long long19 = day13.getMiddleMillisecond();
        int int20 = day13.getMonth();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day13, (double) 100, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 9-April-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNull(timeSeriesDataItem18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1712689199999L + "'", long19 == 1712689199999L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        java.lang.Number number17 = timeSeriesDataItem16.getValue();
        java.lang.Object obj18 = timeSeriesDataItem16.clone();
        timeSeriesDataItem16.setValue((java.lang.Number) 45392L);
        timeSeriesDataItem16.setSelected(true);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        java.lang.Number number27 = null;
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day26, number27, false);
        timeSeries24.removeAgedItems(true);
        int int32 = timeSeries24.getMaximumItemCount();
        boolean boolean33 = timeSeriesDataItem16.equals((java.lang.Object) timeSeries24);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0.0d + "'", number17, 0.0d);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent39 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean40 = timeSeries30.equals((java.lang.Object) seriesChangeEvent39);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int43 = day41.compareTo((java.lang.Object) (short) 100);
        java.lang.String str44 = day41.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries30.getDataItem((org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (double) 4);
        int int48 = day41.getMonth();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "9-April-2024" + "'", str44, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem45);
        org.junit.Assert.assertNotNull(timeSeriesDataItem47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int int0 = org.jfree.data.time.MonthConstants.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        java.util.List list35 = timeSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries38 = timeSeries1.createCopy(9, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712689199999L + "'", long32 == 1712689199999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year((int) (short) -1);
        long long2 = year1.getFirstMillisecond();
        java.text.DateFormat dateFormat3 = org.jfree.data.time.Day.DATE_FORMAT_SHORT;
        int int4 = year1.compareTo((java.lang.Object) dateFormat3);
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = year1.getFirstMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-62198899200000L) + "'", long2 == (-62198899200000L));
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year3 = new org.jfree.data.time.Year((int) (short) -1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) year3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list7 = timeSeries6.data;
        timeSeries1.data = list7;
        org.junit.Assert.assertNull(timeSeriesDataItem4);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        timeSeries5.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries5.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent14 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean15 = timeSeries5.equals((java.lang.Object) seriesChangeEvent14);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        int int18 = day16.compareTo((java.lang.Object) (short) 100);
        java.lang.String str19 = day16.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries5.getDataItem((org.jfree.data.time.RegularTimePeriod) day16);
        int int21 = day16.getDayOfMonth();
        java.lang.Number number22 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day16, number22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        timeSeries25.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries25.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent34 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean35 = timeSeries25.equals((java.lang.Object) seriesChangeEvent34);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        int int38 = day36.compareTo((java.lang.Object) (short) 100);
        java.lang.String str39 = day36.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries25.getDataItem((org.jfree.data.time.RegularTimePeriod) day36);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = day36.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries1.getRawDataItem(regularTimePeriod41);
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent43 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) timeSeries1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "9-April-2024" + "'", str19, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "9-April-2024" + "'", str39, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem40);
        org.junit.Assert.assertNotNull(regularTimePeriod41);
        org.junit.Assert.assertNull(timeSeriesDataItem42);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo2 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo2);
        java.lang.Object obj4 = seriesChangeEvent1.getSource();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo5 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo5);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo7 = null;
        seriesChangeEvent1.setSummary(seriesChangeInfo7);
        java.lang.Object obj9 = seriesChangeEvent1.getSource();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.previous();
        java.util.Date date18 = regularTimePeriod17.getStart();
        java.util.TimeZone timeZone19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day20 = new org.jfree.data.time.Day(date18, timeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Mon Apr 08 00:00:00 PDT 2024");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond((long) (byte) -1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year((int) (short) -1);
        long long2 = year1.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year1, (java.lang.Number) 9223372036854775807L);
        long long5 = year1.getSerialIndex();
        boolean boolean7 = year1.equals((java.lang.Object) 9999);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-62198899200000L) + "'", long2 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year3 = new org.jfree.data.time.Year((int) (short) -1);
        long long4 = year3.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year3, (java.lang.Number) 9223372036854775807L);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year3, 0.0d);
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            year3.peg(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-62198899200000L) + "'", long4 == (-62198899200000L));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = timeSeries1.data;
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = month0.previous();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year3 = new org.jfree.data.time.Year((int) (short) -1);
        long long4 = year3.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year3, (java.lang.Number) 9223372036854775807L);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year3, 0.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, false);
        timeSeries10.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        java.util.Date date23 = day19.getStart();
        org.jfree.data.time.SerialDate serialDate24 = day19.getSerialDate();
        java.lang.Number number25 = null;
        timeSeries10.update((org.jfree.data.time.RegularTimePeriod) day19, number25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        timeSeries28.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries28.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent37 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean38 = timeSeries28.equals((java.lang.Object) seriesChangeEvent37);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        int int41 = day39.compareTo((java.lang.Object) (short) 100);
        java.lang.String str42 = day39.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries28.getDataItem((org.jfree.data.time.RegularTimePeriod) day39);
        int int44 = day19.compareTo((java.lang.Object) day39);
        org.jfree.data.time.Month month45 = new org.jfree.data.time.Month();
        long long46 = month45.getFirstMillisecond();
        long long47 = month45.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = month45.next();
        boolean boolean49 = day39.equals((java.lang.Object) regularTimePeriod48);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries1.getDataItem(regularTimePeriod48);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries1.removeChangeListener(seriesChangeListener51);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-62198899200000L) + "'", long4 == (-62198899200000L));
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate24);
        org.junit.Assert.assertNotNull(regularTimePeriod35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "9-April-2024" + "'", str42, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1711954800000L + "'", long46 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1714546799999L + "'", long47 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(timeSeriesDataItem50);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent39 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean40 = timeSeries30.equals((java.lang.Object) seriesChangeEvent39);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int43 = day41.compareTo((java.lang.Object) (short) 100);
        java.lang.String str44 = day41.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries30.getDataItem((org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (double) 4);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double50 = timeSeries49.getMaxY();
        org.jfree.data.time.Day day51 = new org.jfree.data.time.Day();
        java.lang.Number number52 = null;
        timeSeries49.add((org.jfree.data.time.RegularTimePeriod) day51, number52, false);
        int int55 = day51.getMonth();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = day51.next();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem58 = timeSeries1.addOrUpdate(regularTimePeriod56, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "9-April-2024" + "'", str44, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem45);
        org.junit.Assert.assertNotNull(timeSeriesDataItem47);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(regularTimePeriod56);
        org.junit.Assert.assertNull(timeSeriesDataItem58);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jfree.data.time.Month month1 = new org.jfree.data.time.Month();
        long long2 = month1.getFirstMillisecond();
        long long3 = month1.getLastMillisecond();
        long long4 = month1.getFirstMillisecond();
        org.jfree.data.time.Year year5 = month1.getYear();
        long long6 = year5.getSerialIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month7 = new org.jfree.data.time.Month((int) ' ', year5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Month outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1711954800000L + "'", long2 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1714546799999L + "'", long3 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1711954800000L + "'", long4 == 1711954800000L);
        org.junit.Assert.assertNotNull(year5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2024L + "'", long6 == 2024L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year3 = new org.jfree.data.time.Year((int) (short) -1);
        long long4 = year3.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year3, (java.lang.Number) 9223372036854775807L);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year3, 0.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, false);
        timeSeries10.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries10.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent19 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean20 = timeSeries10.equals((java.lang.Object) seriesChangeEvent19);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        int int23 = day21.compareTo((java.lang.Object) (short) 100);
        java.lang.String str24 = day21.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries10.getDataItem((org.jfree.data.time.RegularTimePeriod) day21);
        java.lang.Number number26 = timeSeriesDataItem25.getValue();
        java.lang.Object obj27 = timeSeriesDataItem25.clone();
        timeSeriesDataItem25.setValue((java.lang.Number) 45392L);
        timeSeriesDataItem25.setSelected(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem25, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of org.jfree.data.time.Year.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-62198899200000L) + "'", long4 == (-62198899200000L));
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "9-April-2024" + "'", str24, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        java.lang.Number number17 = timeSeriesDataItem16.getValue();
        java.lang.Number number18 = timeSeriesDataItem16.getValue();
        timeSeriesDataItem16.setSelected(true);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0.0d + "'", number17, 0.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        java.util.List list25 = timeSeries1.getItems();
        int int26 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        timeSeries28.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries28.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent37 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean38 = timeSeries28.equals((java.lang.Object) seriesChangeEvent37);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        int int41 = day39.compareTo((java.lang.Object) (short) 100);
        java.lang.String str42 = day39.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries28.getDataItem((org.jfree.data.time.RegularTimePeriod) day39);
        java.lang.Number number44 = timeSeriesDataItem43.getValue();
        boolean boolean45 = timeSeries1.equals((java.lang.Object) number44);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "9-April-2024" + "'", str42, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
        org.junit.Assert.assertEquals("'" + number44 + "' != '" + 0.0d + "'", number44, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        boolean boolean17 = timeSeriesDataItem16.isSelected();
        int int19 = timeSeriesDataItem16.compareTo((java.lang.Object) 2);
        boolean boolean20 = timeSeriesDataItem16.isSelected();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day1 = new org.jfree.data.time.Day(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'time' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        timeSeries19.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries19.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent28 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean29 = timeSeries19.equals((java.lang.Object) seriesChangeEvent28);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        int int32 = day30.compareTo((java.lang.Object) (short) 100);
        java.lang.String str33 = day30.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries19.getDataItem((org.jfree.data.time.RegularTimePeriod) day30);
        int int35 = day10.compareTo((java.lang.Object) day30);
        java.util.Calendar calendar36 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long37 = day10.getFirstMillisecond(calendar36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "9-April-2024" + "'", str33, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        boolean boolean5 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems((-1L), false);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries10.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day15, (java.lang.Number) 10L);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day15, (java.lang.Number) (-62198899200000L), true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(timeSeriesDataItem20);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year3 = new org.jfree.data.time.Year((int) (short) -1);
        long long4 = year3.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year3, (java.lang.Number) 9223372036854775807L);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year3, 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-62198899200000L) + "'", long4 == (-62198899200000L));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        java.lang.Class class17 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        java.util.TimeZone timeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day8 = new org.jfree.data.time.Day(date6, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo12 = seriesChangeEvent10.getSummary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = seriesChangeInfo12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(seriesChangeInfo12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list12 = timeSeries11.data;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        timeSeries14.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries14.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent23 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean24 = timeSeries14.equals((java.lang.Object) seriesChangeEvent23);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        int int27 = day25.compareTo((java.lang.Object) (short) 100);
        java.lang.String str28 = day25.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries14.getDataItem((org.jfree.data.time.RegularTimePeriod) day25);
        boolean boolean30 = timeSeriesDataItem29.isSelected();
        int int32 = timeSeriesDataItem29.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries11.addOrUpdate(timeSeriesDataItem29);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries1.addAndOrUpdate(timeSeries11);
        boolean boolean36 = timeSeries1.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "9-April-2024" + "'", str28, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8);
        java.lang.String str11 = month10.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = month10.previous();
        java.util.Date date13 = month10.getEnd();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "April 2024" + "'", str11, "April 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 23:59:59 PDT 2024");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        java.util.Calendar calendar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = month21.getMiddleMillisecond(calendar25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int5 = day0.compareTo((java.lang.Object) 45391L);
        java.util.Date date6 = day0.getEnd();
        java.util.Date date7 = day0.getEnd();
        java.util.TimeZone timeZone8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day9 = new org.jfree.data.time.Day(date7, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1712689199999L + "'", long3 == 1712689199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(1711954800000L, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        boolean boolean5 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems((-1L), false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(date8, timeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        java.lang.String str3 = day0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = day0.next();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day0, "Time", "Value");
        boolean boolean8 = timeSeries7.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9-April-2024" + "'", str3, "9-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("Value");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double27 = timeSeries26.getMaxY();
        java.lang.Comparable comparable28 = timeSeries26.getKey();
        boolean boolean29 = timeSeries26.getNotify();
        java.lang.Object obj30 = timeSeries26.clone();
        int int31 = timeSeries26.getMaximumItemCount();
        boolean boolean32 = timeSeries1.equals((java.lang.Object) timeSeries26);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 100L + "'", comparable28, 100L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year1 = org.jfree.data.time.Year.parseYear("Time");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException; message: Cannot parse string.");
        } catch (org.jfree.data.time.TimePeriodFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        timeSeries18.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries18.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent27 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean28 = timeSeries18.equals((java.lang.Object) seriesChangeEvent27);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        int int31 = day29.compareTo((java.lang.Object) (short) 100);
        java.lang.String str32 = day29.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries18.getDataItem((org.jfree.data.time.RegularTimePeriod) day29);
        java.lang.Number number34 = timeSeriesDataItem33.getValue();
        java.lang.Object obj35 = timeSeriesDataItem33.clone();
        java.lang.Number number36 = timeSeriesDataItem33.getValue();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem33, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: You are attempting to add an observation for the time period 9-April-2024 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.");
        } catch (org.jfree.data.general.SeriesException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "9-April-2024" + "'", str32, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem33);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 0.0d + "'", number34, 0.0d);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + 0.0d + "'", number36, 0.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        long long12 = timeSeries1.getMaximumItemAge();
        int int13 = timeSeries1.getItemCount();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        int int8 = day2.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = day2.previous();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2024 + "'", int8 == 2024);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day3 = new org.jfree.data.time.Day(12, 9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        int int7 = day3.getMonth();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = day3.next();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            day3.peg(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.addChangeListener(seriesChangeListener9);
        long long11 = timeSeries8.getMaximumItemAge();
        java.lang.String str12 = timeSeries8.getDescription();
        double double13 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day16, (double) (short) 0, false);
        timeSeries15.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent24 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) seriesChangeEvent24);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        int int28 = day26.compareTo((java.lang.Object) (short) 100);
        java.lang.String str29 = day26.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries15.getDataItem((org.jfree.data.time.RegularTimePeriod) day26);
        timeSeries8.add(timeSeriesDataItem30);
        timeSeries1.add(timeSeriesDataItem30, false);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener34);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "9-April-2024" + "'", str29, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        java.util.Date date16 = day10.getStart();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) date16);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo18 = seriesChangeEvent17.getSummary();
        java.lang.Object obj19 = seriesChangeEvent17.getSource();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNull(seriesChangeInfo18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "Tue Apr 09 00:00:00 PDT 2024");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list12 = timeSeries11.data;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        timeSeries14.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries14.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent23 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean24 = timeSeries14.equals((java.lang.Object) seriesChangeEvent23);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        int int27 = day25.compareTo((java.lang.Object) (short) 100);
        java.lang.String str28 = day25.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries14.getDataItem((org.jfree.data.time.RegularTimePeriod) day25);
        boolean boolean30 = timeSeriesDataItem29.isSelected();
        int int32 = timeSeriesDataItem29.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries11.addOrUpdate(timeSeriesDataItem29);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries1.addAndOrUpdate(timeSeries11);
        boolean boolean35 = timeSeries11.getNotify();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "9-April-2024" + "'", str28, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = fixedMillisecond1.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = fixedMillisecond1.next();
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int5 = day0.compareTo((java.lang.Object) 45391L);
        java.util.Date date6 = day0.getEnd();
        int int7 = day0.getMonth();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            day0.peg(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1712689199999L + "'", long3 == 1712689199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day6, (java.lang.Number) 10L);
        long long12 = day6.getMiddleMillisecond();
        int int13 = day6.getMonth();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = day6.next();
        org.junit.Assert.assertNull(timeSeriesDataItem11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1712689199999L + "'", long12 == 1712689199999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        java.util.List list4 = timeSeries3.data;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double7 = timeSeries6.getMaxY();
        java.lang.Comparable comparable8 = timeSeries6.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, false);
        timeSeries10.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries10.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent19 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean20 = timeSeries10.equals((java.lang.Object) seriesChangeEvent19);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        int int23 = day21.compareTo((java.lang.Object) (short) 100);
        java.lang.String str24 = day21.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries10.getDataItem((org.jfree.data.time.RegularTimePeriod) day21);
        int int26 = day21.getDayOfMonth();
        java.lang.Number number27 = null;
        timeSeries6.add((org.jfree.data.time.RegularTimePeriod) day21, number27);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries3.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = day21.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = day21.next();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100L + "'", comparable8, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "9-April-2024" + "'", str24, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertNull(timeSeriesDataItem29);
        org.junit.Assert.assertNotNull(regularTimePeriod30);
        org.junit.Assert.assertNotNull(regularTimePeriod31);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int int0 = org.jfree.data.time.MonthConstants.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = year9.getFirstMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year3 = new org.jfree.data.time.Year((int) (short) -1);
        long long4 = year3.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year3, (java.lang.Number) 9223372036854775807L);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year3, 0.0d);
        int int9 = year3.getYear();
        long long10 = year3.getSerialIndex();
        java.util.Date date11 = year3.getStart();
        java.util.TimeZone timeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month14 = new org.jfree.data.time.Month(date11, timeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-62198899200000L) + "'", long4 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Jan 01 00:00:00 PST 2");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries30.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.Month month33 = new org.jfree.data.time.Month();
        long long34 = month33.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries36.removeChangeListener(seriesChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        timeSeries40.add((org.jfree.data.time.RegularTimePeriod) day41, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries36.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (java.lang.Number) 10L);
        long long47 = day41.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries30.createCopy((org.jfree.data.time.RegularTimePeriod) month33, (org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries50.removeChangeListener(seriesChangeListener51);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day55 = new org.jfree.data.time.Day();
        timeSeries54.add((org.jfree.data.time.RegularTimePeriod) day55, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem60 = timeSeries50.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day55, (java.lang.Number) 10L);
        long long61 = day55.getMiddleMillisecond();
        timeSeries30.setKey((java.lang.Comparable) long61);
        java.lang.String str63 = timeSeries30.getDomainDescription();
        java.util.List list64 = timeSeries30.getItems();
        double double65 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries1.addAndOrUpdate(timeSeries30);
        timeSeries30.clear();
        java.lang.String str68 = timeSeries30.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number70 = timeSeries30.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1711954800000L + "'", long34 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1712689199999L + "'", long47 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNull(timeSeriesDataItem60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1712689199999L + "'", long61 == 1712689199999L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Time" + "'", str63, "Time");
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        java.util.List list36 = timeSeries35.getItems();
        java.util.Collection collection37 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        timeSeries35.removeAgedItems(true);
        boolean boolean41 = timeSeries35.equals((java.lang.Object) 1712732399999L);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries35.delete(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712689199999L + "'", long32 == 1712689199999L);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year3 = new org.jfree.data.time.Year((int) (short) -1);
        long long4 = year3.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year3, (java.lang.Number) 9223372036854775807L);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year3, 0.0d);
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-62198899200000L) + "'", long4 == (-62198899200000L));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8);
        java.lang.String str11 = month10.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = month10.previous();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        timeSeries14.add((org.jfree.data.time.RegularTimePeriod) day15, (double) (short) 0, false);
        timeSeries14.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries14.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent23 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean24 = timeSeries14.equals((java.lang.Object) seriesChangeEvent23);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        int int27 = day25.compareTo((java.lang.Object) (short) 100);
        java.lang.String str28 = day25.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries14.getDataItem((org.jfree.data.time.RegularTimePeriod) day25);
        boolean boolean30 = timeSeriesDataItem29.isSelected();
        int int32 = timeSeriesDataItem29.compareTo((java.lang.Object) 12);
        int int33 = month10.compareTo((java.lang.Object) int32);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "April 2024" + "'", str11, "April 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "9-April-2024" + "'", str28, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8);
        java.util.TimeZone timeZone11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month12 = new org.jfree.data.time.Month(date8, timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.Day day5 = new org.jfree.data.time.Day();
        java.lang.Number number6 = null;
        timeSeries3.add((org.jfree.data.time.RegularTimePeriod) day5, number6, false);
        int int9 = day5.getMonth();
        int int10 = day5.getYear();
        boolean boolean11 = year1.equals((java.lang.Object) day5);
        org.jfree.data.time.Month month12 = new org.jfree.data.time.Month(7, year1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2024 + "'", int10 == 2024);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8);
        java.lang.String str11 = month10.toString();
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = month10.getFirstMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "April 2024" + "'", str11, "April 2024");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent39 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean40 = timeSeries30.equals((java.lang.Object) seriesChangeEvent39);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int43 = day41.compareTo((java.lang.Object) (short) 100);
        java.lang.String str44 = day41.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries30.getDataItem((org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (double) 4);
        int int48 = day41.getDayOfMonth();
        java.lang.String str49 = day41.toString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "9-April-2024" + "'", str44, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem45);
        org.junit.Assert.assertNotNull(timeSeriesDataItem47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "9-April-2024" + "'", str49, "9-April-2024");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year((int) (short) -1);
        long long2 = year1.getFirstMillisecond();
        java.text.DateFormat dateFormat3 = org.jfree.data.time.Day.DATE_FORMAT_SHORT;
        int int4 = year1.compareTo((java.lang.Object) dateFormat3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = year1.next();
        long long6 = regularTimePeriod5.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-62198899200000L) + "'", long2 == (-62198899200000L));
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62135784000001L) + "'", long6 == (-62135784000001L));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        java.util.List list9 = timeSeries1.data;
        java.lang.Class class10 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        long long2 = fixedMillisecond1.getLastMillisecond();
        java.util.Calendar calendar3 = null;
        long long4 = fixedMillisecond1.getFirstMillisecond(calendar3);
        long long5 = fixedMillisecond1.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1714546799999L + "'", long4 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1714546799999L + "'", long5 == 1714546799999L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.previous();
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date18);
        long long21 = fixedMillisecond20.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Mon Apr 08 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1712559600000L + "'", long21 == 1712559600000L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        double double10 = timeSeries1.getMaxY();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        long long10 = month4.getFirstMillisecond();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1711954800000L + "'", long10 == 1711954800000L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries30.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.Month month33 = new org.jfree.data.time.Month();
        long long34 = month33.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries36.removeChangeListener(seriesChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        timeSeries40.add((org.jfree.data.time.RegularTimePeriod) day41, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries36.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (java.lang.Number) 10L);
        long long47 = day41.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries30.createCopy((org.jfree.data.time.RegularTimePeriod) month33, (org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries50.removeChangeListener(seriesChangeListener51);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day55 = new org.jfree.data.time.Day();
        timeSeries54.add((org.jfree.data.time.RegularTimePeriod) day55, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem60 = timeSeries50.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day55, (java.lang.Number) 10L);
        long long61 = day55.getMiddleMillisecond();
        timeSeries30.setKey((java.lang.Comparable) long61);
        java.lang.String str63 = timeSeries30.getDomainDescription();
        java.util.List list64 = timeSeries30.getItems();
        double double65 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries1.addAndOrUpdate(timeSeries30);
        timeSeries30.clear();
        timeSeries30.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1711954800000L + "'", long34 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1712689199999L + "'", long47 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNull(timeSeriesDataItem60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1712689199999L + "'", long61 == 1712689199999L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Time" + "'", str63, "Time");
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(timeSeries66);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        long long1 = day0.getSerialIndex();
        long long2 = day0.getLastMillisecond();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = day0.getFirstMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 45391L + "'", long1 == 45391L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1712732399999L + "'", long2 == 1712732399999L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int5 = day0.compareTo((java.lang.Object) 45391L);
        java.util.Date date6 = day0.getEnd();
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month9 = new org.jfree.data.time.Month(date6, timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1712689199999L + "'", long3 == 1712689199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.previous();
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day(date18);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Mon Apr 08 00:00:00 PDT 2024");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        java.util.List list35 = timeSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener36);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) '#', (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712689199999L + "'", long32 == 1712689199999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        java.lang.String str18 = day10.toString();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "9-April-2024" + "'", str18, "9-April-2024");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        java.lang.Object obj25 = timeSeries1.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries1.getRawDataItem(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        int int7 = day3.getMonth();
        int int8 = day3.getYear();
        long long9 = day3.getFirstMillisecond();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2024 + "'", int8 == 2024);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1712646000000L + "'", long9 == 1712646000000L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = day2.getFirstMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.addChangeListener(seriesChangeListener19);
        long long21 = timeSeries18.getMaximumItemAge();
        java.lang.String str22 = timeSeries18.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day25, (double) (short) 0, false);
        int int29 = day25.getDayOfMonth();
        long long30 = day25.getFirstMillisecond();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day25, (double) 45392L);
        int int33 = timeSeriesDataItem16.compareTo((java.lang.Object) 45392L);
        timeSeriesDataItem16.setValue((java.lang.Number) 1);
        int int37 = timeSeriesDataItem16.compareTo((java.lang.Object) 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1712646000000L + "'", long30 == 1712646000000L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        long long3 = day0.getMiddleMillisecond();
        int int5 = day0.compareTo((java.lang.Object) 45391L);
        java.util.Date date6 = day0.getEnd();
        java.util.Date date7 = day0.getEnd();
        org.jfree.data.time.Year year8 = new org.jfree.data.time.Year(date7);
        long long9 = year8.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1712689199999L + "'", long3 == 1712689199999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1704096000000L + "'", long9 == 1704096000000L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        java.util.List list18 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day21 = new org.jfree.data.time.Day();
        timeSeries20.add((org.jfree.data.time.RegularTimePeriod) day21, (double) (short) 0, false);
        timeSeries20.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries20.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent29 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean30 = timeSeries20.equals((java.lang.Object) seriesChangeEvent29);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        int int33 = day31.compareTo((java.lang.Object) (short) 100);
        java.lang.String str34 = day31.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries20.getDataItem((org.jfree.data.time.RegularTimePeriod) day31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = day31.previous();
        java.util.Date date37 = regularTimePeriod36.getStart();
        org.jfree.data.time.Month month38 = new org.jfree.data.time.Month(date37);
        org.jfree.data.time.FixedMillisecond fixedMillisecond39 = new org.jfree.data.time.FixedMillisecond(date37);
        org.jfree.data.time.Day day40 = new org.jfree.data.time.Day();
        int int42 = day40.compareTo((java.lang.Object) (short) 100);
        java.lang.String str43 = day40.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = day40.next();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) day40, "Time", "Value");
        boolean boolean48 = fixedMillisecond39.equals((java.lang.Object) day40);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) fixedMillisecond39);
        timeSeriesDataItem49.setValue((java.lang.Number) (-62072668800001L));
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "9-April-2024" + "'", str34, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem35);
        org.junit.Assert.assertNotNull(regularTimePeriod36);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Mon Apr 08 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "9-April-2024" + "'", str43, "9-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeSeriesDataItem49);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        boolean boolean11 = year9.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent39 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean40 = timeSeries30.equals((java.lang.Object) seriesChangeEvent39);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int43 = day41.compareTo((java.lang.Object) (short) 100);
        java.lang.String str44 = day41.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries30.getDataItem((org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (double) 4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeriesDataItem47.getPeriod();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = timeSeriesDataItem47.getPeriod();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "9-April-2024" + "'", str44, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem45);
        org.junit.Assert.assertNotNull(timeSeriesDataItem47);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
        org.junit.Assert.assertNotNull(regularTimePeriod49);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.String str1 = day0.toString();
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getRangeDescription();
        java.util.List list7 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        timeSeries9.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries9.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent18 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean19 = timeSeries9.equals((java.lang.Object) seriesChangeEvent18);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        int int22 = day20.compareTo((java.lang.Object) (short) 100);
        java.lang.String str23 = day20.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries9.getDataItem((org.jfree.data.time.RegularTimePeriod) day20);
        java.lang.Number number25 = timeSeriesDataItem24.getValue();
        boolean boolean26 = timeSeries3.equals((java.lang.Object) number25);
        boolean boolean27 = day0.equals((java.lang.Object) number25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9-April-2024" + "'", str1, "9-April-2024");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "9-April-2024" + "'", str23, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 0.0d + "'", number25, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        int int2 = timeSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        java.util.Date date3 = day0.getEnd();
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day5 = new org.jfree.data.time.Day(date3, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        int int6 = day2.getDayOfMonth();
        long long7 = day2.getFirstMillisecond();
        int int8 = day2.getMonth();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        java.util.List list25 = timeSeries1.getItems();
        int int26 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        timeSeries28.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries28.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent37 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean38 = timeSeries28.equals((java.lang.Object) seriesChangeEvent37);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        int int41 = day39.compareTo((java.lang.Object) (short) 100);
        java.lang.String str42 = day39.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries28.getDataItem((org.jfree.data.time.RegularTimePeriod) day39);
        java.lang.Class<?> wildcardClass44 = day39.getClass();
        timeSeries1.timePeriodClass = wildcardClass44;
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries49.addChangeListener(seriesChangeListener50);
        org.jfree.data.time.Month month52 = new org.jfree.data.time.Month();
        long long53 = month52.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries55.removeChangeListener(seriesChangeListener56);
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day60 = new org.jfree.data.time.Day();
        timeSeries59.add((org.jfree.data.time.RegularTimePeriod) day60, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = timeSeries55.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day60, (java.lang.Number) 10L);
        long long66 = day60.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries49.createCopy((org.jfree.data.time.RegularTimePeriod) month52, (org.jfree.data.time.RegularTimePeriod) day60);
        long long68 = timeSeries49.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries1.addAndOrUpdate(timeSeries49);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem71 = timeSeries49.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "9-April-2024" + "'", str42, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1711954800000L + "'", long53 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1712689199999L + "'", long66 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 9223372036854775807L + "'", long68 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries69);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        java.util.List list35 = timeSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener36);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712689199999L + "'", long32 == 1712689199999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        java.util.List list25 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list28 = timeSeries27.data;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent39 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean40 = timeSeries30.equals((java.lang.Object) seriesChangeEvent39);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int43 = day41.compareTo((java.lang.Object) (short) 100);
        java.lang.String str44 = day41.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries30.getDataItem((org.jfree.data.time.RegularTimePeriod) day41);
        boolean boolean46 = timeSeriesDataItem45.isSelected();
        int int48 = timeSeriesDataItem45.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries27.addOrUpdate(timeSeriesDataItem45);
        java.lang.Object obj50 = timeSeriesDataItem45.clone();
        boolean boolean51 = timeSeries1.equals((java.lang.Object) timeSeriesDataItem45);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "9-April-2024" + "'", str44, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        timeSeries11.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries11.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent20 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) seriesChangeEvent20);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        int int24 = day22.compareTo((java.lang.Object) (short) 100);
        java.lang.String str25 = day22.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries11.getDataItem((org.jfree.data.time.RegularTimePeriod) day22);
        java.lang.Class<?> wildcardClass27 = day22.getClass();
        int int28 = month4.compareTo((java.lang.Object) day22);
        java.util.Calendar calendar29 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long30 = month4.getFirstMillisecond(calendar29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "9-April-2024" + "'", str25, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.clear();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double8 = timeSeries7.getMaxY();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        timeSeries11.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries11.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent20 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) seriesChangeEvent20);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        int int24 = day22.compareTo((java.lang.Object) (short) 100);
        java.lang.String str25 = day22.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries11.getDataItem((org.jfree.data.time.RegularTimePeriod) day22);
        int int27 = day22.getDayOfMonth();
        java.lang.Number number28 = null;
        timeSeries7.add((org.jfree.data.time.RegularTimePeriod) day22, number28);
        java.lang.String str30 = day22.toString();
        timeSeries1.setKey((java.lang.Comparable) day22);
        timeSeries1.setDescription("org.jfree.data.event.SeriesChangeEvent[source=10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 100L + "'", comparable9, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "9-April-2024" + "'", str25, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "9-April-2024" + "'", str30, "9-April-2024");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(7, 7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 100L + "'", comparable3, 100L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int int0 = org.jfree.data.time.MonthConstants.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        java.lang.Object obj25 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.addChangeListener(seriesChangeListener28);
        long long30 = timeSeries27.getMaximumItemAge();
        java.lang.String str31 = timeSeries27.getDescription();
        double double32 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day35 = new org.jfree.data.time.Day();
        timeSeries34.add((org.jfree.data.time.RegularTimePeriod) day35, (double) (short) 0, false);
        timeSeries34.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = timeSeries34.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent43 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean44 = timeSeries34.equals((java.lang.Object) seriesChangeEvent43);
        org.jfree.data.time.Day day45 = new org.jfree.data.time.Day();
        int int47 = day45.compareTo((java.lang.Object) (short) 100);
        java.lang.String str48 = day45.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries34.getDataItem((org.jfree.data.time.RegularTimePeriod) day45);
        timeSeries27.add(timeSeriesDataItem49);
        java.util.List list51 = timeSeries27.getItems();
        timeSeries1.data = list51;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day55 = new org.jfree.data.time.Day();
        timeSeries54.add((org.jfree.data.time.RegularTimePeriod) day55, (double) (short) 0, false);
        java.util.Date date59 = day55.getStart();
        long long60 = day55.getFirstMillisecond();
        org.jfree.data.time.SerialDate serialDate61 = day55.getSerialDate();
        org.jfree.data.time.Day day62 = new org.jfree.data.time.Day(serialDate61);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem63 = timeSeries1.getRawDataItem((org.jfree.data.time.RegularTimePeriod) day62);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(regularTimePeriod41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "9-April-2024" + "'", str48, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1712646000000L + "'", long60 == 1712646000000L);
        org.junit.Assert.assertNotNull(serialDate61);
        org.junit.Assert.assertNotNull(timeSeriesDataItem63);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.Class class0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day3, (double) (short) 0, false);
        java.util.Date date7 = day3.getStart();
        long long8 = day3.getFirstMillisecond();
        java.util.Date date9 = day3.getEnd();
        org.jfree.data.time.Year year10 = new org.jfree.data.time.Year(date9);
        org.jfree.data.time.Month month11 = new org.jfree.data.time.Month(date9);
        java.util.TimeZone timeZone12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = org.jfree.data.time.RegularTimePeriod.createInstance(class0, date9, timeZone12);
        org.jfree.data.time.FixedMillisecond fixedMillisecond14 = new org.jfree.data.time.FixedMillisecond(date9);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day17 = new org.jfree.data.time.Day();
        timeSeries16.add((org.jfree.data.time.RegularTimePeriod) day17, (double) (short) 0, false);
        timeSeries16.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day25, (double) (short) 0, false);
        java.util.Date date29 = day25.getStart();
        org.jfree.data.time.SerialDate serialDate30 = day25.getSerialDate();
        java.lang.Number number31 = null;
        timeSeries16.update((org.jfree.data.time.RegularTimePeriod) day25, number31);
        java.util.List list33 = timeSeries16.getItems();
        boolean boolean34 = fixedMillisecond14.equals((java.lang.Object) timeSeries16);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712646000000L + "'", long8 == 1712646000000L);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate30);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.next();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean22 = timeSeries21.isEmpty();
        long long23 = timeSeries21.getMaximumItemAge();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) long23);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        java.lang.String str3 = day0.toString();
        int int4 = day0.getMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9-April-2024" + "'", str3, "9-April-2024");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries8.addChangeListener(seriesChangeListener9);
        long long11 = timeSeries8.getMaximumItemAge();
        java.lang.String str12 = timeSeries8.getDescription();
        double double13 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day16 = new org.jfree.data.time.Day();
        timeSeries15.add((org.jfree.data.time.RegularTimePeriod) day16, (double) (short) 0, false);
        timeSeries15.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent24 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) seriesChangeEvent24);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        int int28 = day26.compareTo((java.lang.Object) (short) 100);
        java.lang.String str29 = day26.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries15.getDataItem((org.jfree.data.time.RegularTimePeriod) day26);
        timeSeries8.add(timeSeriesDataItem30);
        timeSeries1.add(timeSeriesDataItem30, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeriesDataItem30.getPeriod();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "9-April-2024" + "'", str29, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem30);
        org.junit.Assert.assertNotNull(regularTimePeriod34);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month0, (java.lang.Number) (short) 100);
        timeSeriesDataItem2.setValue((java.lang.Number) 0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeriesDataItem2.getPeriod();
        org.junit.Assert.assertNotNull(regularTimePeriod5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.isEmpty();
        java.util.List list3 = timeSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jfree.data.time.Month month1 = org.jfree.data.time.Month.parseMonth("April 2024");
        java.lang.String str2 = month1.toString();
        long long3 = month1.getLastMillisecond();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            month1.peg(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(month1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "April 2024" + "'", str2, "April 2024");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1714546799999L + "'", long3 == 1714546799999L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries30);
        double double38 = timeSeries1.getMinY();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day5 = new org.jfree.data.time.Day();
        timeSeries4.add((org.jfree.data.time.RegularTimePeriod) day5, (double) (short) 0, false);
        timeSeries4.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries4.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent13 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean14 = timeSeries4.equals((java.lang.Object) seriesChangeEvent13);
        org.jfree.data.time.Day day15 = new org.jfree.data.time.Day();
        int int17 = day15.compareTo((java.lang.Object) (short) 100);
        java.lang.String str18 = day15.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries4.getDataItem((org.jfree.data.time.RegularTimePeriod) day15);
        boolean boolean20 = timeSeriesDataItem19.isSelected();
        int int22 = timeSeriesDataItem19.compareTo((java.lang.Object) 2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries1.addOrUpdate(timeSeriesDataItem19);
        org.jfree.data.time.FixedMillisecond fixedMillisecond25 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        long long26 = fixedMillisecond25.getLastMillisecond();
        org.jfree.data.time.FixedMillisecond fixedMillisecond28 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = fixedMillisecond28.previous();
        java.util.Calendar calendar30 = null;
        long long31 = fixedMillisecond28.getLastMillisecond(calendar30);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) fixedMillisecond25, (org.jfree.data.time.RegularTimePeriod) fixedMillisecond28);
        java.util.Calendar calendar33 = null;
        long long34 = fixedMillisecond28.getLastMillisecond(calendar33);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "9-April-2024" + "'", str18, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1714546799999L + "'", long26 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1714546799999L + "'", long31 == 1714546799999L);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1714546799999L + "'", long34 == 1714546799999L);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        int int27 = timeSeries1.getItemCount();
        boolean boolean28 = timeSeries1.isEmpty();
        java.lang.String str29 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        java.lang.String str1 = day0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = day0.previous();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day0, (java.lang.Number) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9-April-2024" + "'", str1, "9-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        long long10 = month4.getSerialIndex();
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = month4.getLastMillisecond(calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 24292L + "'", long10 == 24292L);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        timeSeries1.removeAgedItems(0L, false);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        org.jfree.data.time.Month month5 = new org.jfree.data.time.Month();
        long long6 = month5.getFirstMillisecond();
        long long7 = month5.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = month5.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = month5.next();
        org.jfree.data.time.Year year11 = new org.jfree.data.time.Year((int) (short) -1);
        long long12 = year11.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year11, (java.lang.Number) 9223372036854775807L);
        long long15 = year11.getSerialIndex();
        java.util.Date date16 = year11.getEnd();
        int int17 = month5.compareTo((java.lang.Object) year11);
        int int18 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) year11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1711954800000L + "'", long6 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1714546799999L + "'", long7 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-62198899200000L) + "'", long12 == (-62198899200000L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Dec 31 23:59:59 PST 2");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        long long20 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.Month month21 = new org.jfree.data.time.Month();
        long long22 = month21.getFirstMillisecond();
        long long23 = month21.getLastMillisecond();
        boolean boolean24 = timeSeries1.equals((java.lang.Object) month21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.addChangeListener(seriesChangeListener27);
        long long29 = timeSeries26.getMaximumItemAge();
        java.lang.String str30 = timeSeries26.getDescription();
        double double31 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day();
        timeSeries33.add((org.jfree.data.time.RegularTimePeriod) day34, (double) (short) 0, false);
        timeSeries33.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = timeSeries33.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent42 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean43 = timeSeries33.equals((java.lang.Object) seriesChangeEvent42);
        org.jfree.data.time.Day day44 = new org.jfree.data.time.Day();
        int int46 = day44.compareTo((java.lang.Object) (short) 100);
        java.lang.String str47 = day44.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem48 = timeSeries33.getDataItem((org.jfree.data.time.RegularTimePeriod) day44);
        timeSeries26.add(timeSeriesDataItem48);
        java.util.List list50 = timeSeries26.getItems();
        int int51 = timeSeries26.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day54 = new org.jfree.data.time.Day();
        timeSeries53.add((org.jfree.data.time.RegularTimePeriod) day54, (double) (short) 0, false);
        timeSeries53.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = timeSeries53.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent62 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean63 = timeSeries53.equals((java.lang.Object) seriesChangeEvent62);
        org.jfree.data.time.Day day64 = new org.jfree.data.time.Day();
        int int66 = day64.compareTo((java.lang.Object) (short) 100);
        java.lang.String str67 = day64.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = timeSeries53.getDataItem((org.jfree.data.time.RegularTimePeriod) day64);
        java.lang.Class<?> wildcardClass69 = day64.getClass();
        timeSeries26.timePeriodClass = wildcardClass69;
        timeSeries26.removeAgedItems(true);
        java.util.Collection collection73 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1711954800000L + "'", long22 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1714546799999L + "'", long23 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(regularTimePeriod40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "9-April-2024" + "'", str47, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem48);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "9-April-2024" + "'", str67, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(collection73);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        long long6 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        java.lang.String str9 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        int int2 = day0.compareTo((java.lang.Object) (short) 100);
        java.lang.String str3 = day0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = day0.next();
        long long5 = day0.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9-April-2024" + "'", str3, "9-April-2024");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1712732399999L + "'", long5 == 1712732399999L);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8);
        java.lang.String str11 = month10.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month10, (double) '#');
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = month10.getFirstMillisecond(calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "April 2024" + "'", str11, "April 2024");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent39 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean40 = timeSeries30.equals((java.lang.Object) seriesChangeEvent39);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int43 = day41.compareTo((java.lang.Object) (short) 100);
        java.lang.String str44 = day41.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries30.getDataItem((org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (double) 4);
        int int48 = day41.getDayOfMonth();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = day41.next();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "9-April-2024" + "'", str44, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem45);
        org.junit.Assert.assertNotNull(timeSeriesDataItem47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertNotNull(regularTimePeriod49);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = month0.next();
        long long4 = month0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = month0.next();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1714546799999L + "'", long4 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        long long10 = month4.getSerialIndex();
        java.util.Date date11 = month4.getStart();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 24292L + "'", long10 == 24292L);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 01 00:00:00 PDT 2024");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        timeSeries1.setDescription("");
        timeSeries1.setDescription("9-April-2024");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day31 = new org.jfree.data.time.Day();
        timeSeries30.add((org.jfree.data.time.RegularTimePeriod) day31, (double) (short) 0, false);
        timeSeries30.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries30.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent39 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean40 = timeSeries30.equals((java.lang.Object) seriesChangeEvent39);
        org.jfree.data.time.Day day41 = new org.jfree.data.time.Day();
        int int43 = day41.compareTo((java.lang.Object) (short) 100);
        java.lang.String str44 = day41.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries30.getDataItem((org.jfree.data.time.RegularTimePeriod) day41);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day41, (double) 4);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) day41, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(regularTimePeriod37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "9-April-2024" + "'", str44, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem45);
        org.junit.Assert.assertNotNull(timeSeriesDataItem47);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        int int15 = timeSeries1.getIndex((org.jfree.data.time.RegularTimePeriod) day10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean18 = timeSeries17.isEmpty();
        timeSeries17.clear();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double24 = timeSeries23.getMaxY();
        java.lang.Comparable comparable25 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day28 = new org.jfree.data.time.Day();
        timeSeries27.add((org.jfree.data.time.RegularTimePeriod) day28, (double) (short) 0, false);
        timeSeries27.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeries27.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent36 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean37 = timeSeries27.equals((java.lang.Object) seriesChangeEvent36);
        org.jfree.data.time.Day day38 = new org.jfree.data.time.Day();
        int int40 = day38.compareTo((java.lang.Object) (short) 100);
        java.lang.String str41 = day38.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries27.getDataItem((org.jfree.data.time.RegularTimePeriod) day38);
        int int43 = day38.getDayOfMonth();
        java.lang.Number number44 = null;
        timeSeries23.add((org.jfree.data.time.RegularTimePeriod) day38, number44);
        java.lang.String str46 = day38.toString();
        timeSeries17.setKey((java.lang.Comparable) day38);
        boolean boolean48 = day10.equals((java.lang.Object) day38);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 100L + "'", comparable25, 100L);
        org.junit.Assert.assertNotNull(regularTimePeriod34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "9-April-2024" + "'", str41, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "9-April-2024" + "'", str46, "9-April-2024");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Day day3 = new org.jfree.data.time.Day((int) (short) 100, (-9999), (-9999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day6 = new org.jfree.data.time.Day();
        timeSeries5.add((org.jfree.data.time.RegularTimePeriod) day6, (double) (short) 0, false);
        java.util.Date date10 = day6.getStart();
        long long11 = day6.getFirstMillisecond();
        java.util.Date date12 = day6.getEnd();
        org.jfree.data.time.Year year13 = new org.jfree.data.time.Year(date12);
        org.jfree.data.time.Month month14 = new org.jfree.data.time.Month(date12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = month14.previous();
        timeSeries3.add(regularTimePeriod15, (double) '4', true);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1712646000000L + "'", long11 == 1712646000000L);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod15);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("org.jfree.data.event.SeriesChangeEvent[source=10.0]");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException3 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException5 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException3.addSuppressed((java.lang.Throwable) timePeriodFormatException5);
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException8 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException10 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException8.addSuppressed((java.lang.Throwable) timePeriodFormatException10);
        timePeriodFormatException5.addSuppressed((java.lang.Throwable) timePeriodFormatException10);
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException14 = new org.jfree.data.time.TimePeriodFormatException("");
        org.jfree.data.time.TimePeriodFormatException timePeriodFormatException16 = new org.jfree.data.time.TimePeriodFormatException("");
        timePeriodFormatException14.addSuppressed((java.lang.Throwable) timePeriodFormatException16);
        timePeriodFormatException5.addSuppressed((java.lang.Throwable) timePeriodFormatException14);
        seriesException1.addSuppressed((java.lang.Throwable) timePeriodFormatException5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.String str5 = timeSeries1.getDescription();
        double double6 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day9 = new org.jfree.data.time.Day();
        timeSeries8.add((org.jfree.data.time.RegularTimePeriod) day9, (double) (short) 0, false);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries8.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent17 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean18 = timeSeries8.equals((java.lang.Object) seriesChangeEvent17);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        int int21 = day19.compareTo((java.lang.Object) (short) 100);
        java.lang.String str22 = day19.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries8.getDataItem((org.jfree.data.time.RegularTimePeriod) day19);
        timeSeries1.add(timeSeriesDataItem23);
        java.util.List list25 = timeSeries1.getItems();
        int int26 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        timeSeries28.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries28.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent37 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean38 = timeSeries28.equals((java.lang.Object) seriesChangeEvent37);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        int int41 = day39.compareTo((java.lang.Object) (short) 100);
        java.lang.String str42 = day39.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries28.getDataItem((org.jfree.data.time.RegularTimePeriod) day39);
        java.lang.Class<?> wildcardClass44 = day39.getClass();
        timeSeries1.timePeriodClass = wildcardClass44;
        int int46 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "9-April-2024" + "'", str22, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "9-April-2024" + "'", str42, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.addChangeListener(seriesChangeListener19);
        long long21 = timeSeries18.getMaximumItemAge();
        java.lang.String str22 = timeSeries18.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day25 = new org.jfree.data.time.Day();
        timeSeries24.add((org.jfree.data.time.RegularTimePeriod) day25, (double) (short) 0, false);
        int int29 = day25.getDayOfMonth();
        long long30 = day25.getFirstMillisecond();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day25, (double) 45392L);
        int int33 = timeSeriesDataItem16.compareTo((java.lang.Object) 45392L);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day36 = new org.jfree.data.time.Day();
        timeSeries35.add((org.jfree.data.time.RegularTimePeriod) day36, (double) (short) 0, false);
        boolean boolean40 = timeSeriesDataItem16.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1712646000000L + "'", long30 == 1712646000000L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jfree.data.time.FixedMillisecond fixedMillisecond1 = new org.jfree.data.time.FixedMillisecond(1714546799999L);
        long long2 = fixedMillisecond1.getLastMillisecond();
        java.util.Calendar calendar3 = null;
        fixedMillisecond1.peg(calendar3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        java.lang.Object obj17 = timeSeriesDataItem16.clone();
        timeSeriesDataItem16.setValue((java.lang.Number) 1712646000000L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = timeSeriesDataItem16.getPeriod();
        java.util.Date date21 = regularTimePeriod20.getEnd();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Apr 09 23:59:59 PDT 2024");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent1 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo2 = seriesChangeEvent1.getSummary();
        org.junit.Assert.assertNull(seriesChangeInfo2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = day12.previous();
        java.util.Date date18 = regularTimePeriod17.getStart();
        org.jfree.data.time.Month month19 = new org.jfree.data.time.Month(date18);
        org.jfree.data.time.FixedMillisecond fixedMillisecond20 = new org.jfree.data.time.FixedMillisecond(date18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = fixedMillisecond20.previous();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries23.addChangeListener(seriesChangeListener24);
        org.jfree.data.time.Month month26 = new org.jfree.data.time.Month();
        long long27 = month26.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries29.removeChangeListener(seriesChangeListener30);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day34 = new org.jfree.data.time.Day();
        timeSeries33.add((org.jfree.data.time.RegularTimePeriod) day34, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries29.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day34, (java.lang.Number) 10L);
        long long40 = day34.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries23.createCopy((org.jfree.data.time.RegularTimePeriod) month26, (org.jfree.data.time.RegularTimePeriod) day34);
        long long42 = timeSeries23.getMaximumItemAge();
        org.jfree.data.time.Month month43 = new org.jfree.data.time.Month();
        long long44 = month43.getFirstMillisecond();
        long long45 = month43.getLastMillisecond();
        boolean boolean46 = timeSeries23.equals((java.lang.Object) month43);
        java.lang.Object obj47 = timeSeries23.clone();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries49.addChangeListener(seriesChangeListener50);
        long long52 = timeSeries49.getMaximumItemAge();
        java.lang.String str53 = timeSeries49.getDescription();
        double double54 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day57 = new org.jfree.data.time.Day();
        timeSeries56.add((org.jfree.data.time.RegularTimePeriod) day57, (double) (short) 0, false);
        timeSeries56.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = timeSeries56.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent65 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean66 = timeSeries56.equals((java.lang.Object) seriesChangeEvent65);
        org.jfree.data.time.Day day67 = new org.jfree.data.time.Day();
        int int69 = day67.compareTo((java.lang.Object) (short) 100);
        java.lang.String str70 = day67.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem71 = timeSeries56.getDataItem((org.jfree.data.time.RegularTimePeriod) day67);
        timeSeries49.add(timeSeriesDataItem71);
        java.util.List list73 = timeSeries49.getItems();
        timeSeries23.data = list73;
        int int75 = fixedMillisecond20.compareTo((java.lang.Object) timeSeries23);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Mon Apr 08 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1711954800000L + "'", long27 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1712689199999L + "'", long40 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1711954800000L + "'", long44 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1714546799999L + "'", long45 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 9223372036854775807L + "'", long52 == 9223372036854775807L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(regularTimePeriod63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "9-April-2024" + "'", str70, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem71);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        java.util.List list35 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day38 = new org.jfree.data.time.Day();
        timeSeries37.add((org.jfree.data.time.RegularTimePeriod) day38, (double) (short) 0, false);
        timeSeries37.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = timeSeries37.getNextTimePeriod();
        long long45 = regularTimePeriod44.getSerialIndex();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate(regularTimePeriod44, (java.lang.Number) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeries1.getNextTimePeriod();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712689199999L + "'", long32 == 1712689199999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(regularTimePeriod44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 45392L + "'", long45 == 45392L);
        org.junit.Assert.assertNull(timeSeriesDataItem47);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Month month1 = org.jfree.data.time.Month.parseMonth("org.jfree.data.event.SeriesChangeEvent[source=10.0]");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException; message: Can't evaluate the month.");
        } catch (org.jfree.data.time.TimePeriodFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        boolean boolean5 = timeSeries1.isEmpty();
        long long6 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day10 = new org.jfree.data.time.Day();
        timeSeries9.add((org.jfree.data.time.RegularTimePeriod) day10, (double) (short) 0, false);
        java.util.Date date14 = day10.getStart();
        org.jfree.data.time.SerialDate serialDate15 = day10.getSerialDate();
        java.lang.Number number16 = null;
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day10, number16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day20 = new org.jfree.data.time.Day();
        timeSeries19.add((org.jfree.data.time.RegularTimePeriod) day20, (double) (short) 0, false);
        timeSeries19.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries19.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent28 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean29 = timeSeries19.equals((java.lang.Object) seriesChangeEvent28);
        org.jfree.data.time.Day day30 = new org.jfree.data.time.Day();
        int int32 = day30.compareTo((java.lang.Object) (short) 100);
        java.lang.String str33 = day30.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries19.getDataItem((org.jfree.data.time.RegularTimePeriod) day30);
        int int35 = day10.compareTo((java.lang.Object) day30);
        int int36 = day30.getYear();
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate15);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "9-April-2024" + "'", str33, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2024 + "'", int36 == 2024);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) month0, (java.lang.Number) (short) 100);
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            month0.peg(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double3 = timeSeries2.getMaxY();
        org.jfree.data.time.Day day4 = new org.jfree.data.time.Day();
        java.lang.Number number5 = null;
        timeSeries2.add((org.jfree.data.time.RegularTimePeriod) day4, number5, false);
        int int8 = day4.getMonth();
        int int9 = day4.getYear();
        boolean boolean10 = year0.equals((java.lang.Object) day4);
        long long11 = year0.getSerialIndex();
        long long12 = year0.getLastMillisecond();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2024 + "'", int9 == 2024);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2024L + "'", long11 == 2024L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1735718399999L + "'", long12 == 1735718399999L);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        long long7 = day2.getFirstMillisecond();
        java.util.Date date8 = day2.getEnd();
        org.jfree.data.time.Year year9 = new org.jfree.data.time.Year(date8);
        org.jfree.data.time.Month month10 = new org.jfree.data.time.Month(date8);
        int int11 = month10.getYearValue();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712646000000L + "'", long7 == 1712646000000L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Apr 09 23:59:59 PDT 2024");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2024 + "'", int11 == 2024);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Year year1 = new org.jfree.data.time.Year(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        double double2 = timeSeries1.getMaxY();
        org.jfree.data.time.Day day3 = new org.jfree.data.time.Day();
        java.lang.Number number4 = null;
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day3, number4, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = day3.previous();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(regularTimePeriod7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        java.util.Date date6 = day2.getStart();
        org.jfree.data.time.SerialDate serialDate7 = day2.getSerialDate();
        int int8 = day2.getYear();
        long long9 = day2.getLastMillisecond();
        org.jfree.data.time.SerialDate serialDate10 = day2.getSerialDate();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2024 + "'", int8 == 2024);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1712732399999L + "'", long9 == 1712732399999L);
        org.junit.Assert.assertNotNull(serialDate10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.List list2 = timeSeries1.data;
        int int3 = timeSeries1.getItemCount();
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        long long6 = month4.getLastMillisecond();
        long long7 = month4.getFirstMillisecond();
        org.jfree.data.time.Year year8 = month4.getYear();
        timeSeries1.delete((org.jfree.data.time.RegularTimePeriod) month4);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        timeSeries11.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries11.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent20 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean21 = timeSeries11.equals((java.lang.Object) seriesChangeEvent20);
        org.jfree.data.time.Day day22 = new org.jfree.data.time.Day();
        int int24 = day22.compareTo((java.lang.Object) (short) 100);
        java.lang.String str25 = day22.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries11.getDataItem((org.jfree.data.time.RegularTimePeriod) day22);
        java.lang.Class<?> wildcardClass27 = day22.getClass();
        int int28 = month4.compareTo((java.lang.Object) day22);
        long long29 = month4.getLastMillisecond();
        long long30 = month4.getSerialIndex();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1714546799999L + "'", long6 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1711954800000L + "'", long7 == 1711954800000L);
        org.junit.Assert.assertNotNull(year8);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "9-April-2024" + "'", str25, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1714546799999L + "'", long29 == 1714546799999L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 24292L + "'", long30 == 24292L);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.Month month4 = new org.jfree.data.time.Month();
        long long5 = month4.getFirstMillisecond();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries7.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        timeSeries11.add((org.jfree.data.time.RegularTimePeriod) day12, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day12, (java.lang.Number) 10L);
        long long18 = day12.getMiddleMillisecond();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((org.jfree.data.time.RegularTimePeriod) month4, (org.jfree.data.time.RegularTimePeriod) day12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day26 = new org.jfree.data.time.Day();
        timeSeries25.add((org.jfree.data.time.RegularTimePeriod) day26, (double) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries21.addOrUpdate((org.jfree.data.time.RegularTimePeriod) day26, (java.lang.Number) 10L);
        long long32 = day26.getMiddleMillisecond();
        timeSeries1.setKey((java.lang.Comparable) long32);
        java.lang.String str34 = timeSeries1.getDomainDescription();
        boolean boolean35 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1711954800000L + "'", long5 == 1711954800000L);
        org.junit.Assert.assertNull(timeSeriesDataItem17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712689199999L + "'", long18 == 1712689199999L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(timeSeriesDataItem31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1712689199999L + "'", long32 == 1712689199999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        long long1 = month0.getFirstMillisecond();
        long long2 = month0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = month0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = regularTimePeriod3.previous();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1711954800000L + "'", long1 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1714546799999L + "'", long2 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day2 = new org.jfree.data.time.Day();
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) day2, (double) (short) 0, false);
        timeSeries1.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent10 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean11 = timeSeries1.equals((java.lang.Object) seriesChangeEvent10);
        org.jfree.data.time.Day day12 = new org.jfree.data.time.Day();
        int int14 = day12.compareTo((java.lang.Object) (short) 100);
        java.lang.String str15 = day12.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((org.jfree.data.time.RegularTimePeriod) day12);
        java.lang.Number number17 = timeSeriesDataItem16.getValue();
        java.lang.Object obj18 = timeSeriesDataItem16.clone();
        boolean boolean19 = timeSeriesDataItem16.isSelected();
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9-April-2024" + "'", str15, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem16);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0.0d + "'", number17, 0.0d);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Year year3 = new org.jfree.data.time.Year((int) (short) -1);
        long long4 = year3.getFirstMillisecond();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = new org.jfree.data.time.TimeSeriesDataItem((org.jfree.data.time.RegularTimePeriod) year3, (java.lang.Number) 9223372036854775807L);
        timeSeries1.add((org.jfree.data.time.RegularTimePeriod) year3, 0.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day11 = new org.jfree.data.time.Day();
        timeSeries10.add((org.jfree.data.time.RegularTimePeriod) day11, (double) (short) 0, false);
        timeSeries10.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day19 = new org.jfree.data.time.Day();
        timeSeries18.add((org.jfree.data.time.RegularTimePeriod) day19, (double) (short) 0, false);
        java.util.Date date23 = day19.getStart();
        org.jfree.data.time.SerialDate serialDate24 = day19.getSerialDate();
        java.lang.Number number25 = null;
        timeSeries10.update((org.jfree.data.time.RegularTimePeriod) day19, number25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day29 = new org.jfree.data.time.Day();
        timeSeries28.add((org.jfree.data.time.RegularTimePeriod) day29, (double) (short) 0, false);
        timeSeries28.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries28.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent37 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean38 = timeSeries28.equals((java.lang.Object) seriesChangeEvent37);
        org.jfree.data.time.Day day39 = new org.jfree.data.time.Day();
        int int41 = day39.compareTo((java.lang.Object) (short) 100);
        java.lang.String str42 = day39.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries28.getDataItem((org.jfree.data.time.RegularTimePeriod) day39);
        int int44 = day19.compareTo((java.lang.Object) day39);
        org.jfree.data.time.Month month45 = new org.jfree.data.time.Month();
        long long46 = month45.getFirstMillisecond();
        long long47 = month45.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = month45.next();
        boolean boolean49 = day39.equals((java.lang.Object) regularTimePeriod48);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries1.getDataItem(regularTimePeriod48);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day53 = new org.jfree.data.time.Day();
        timeSeries52.add((org.jfree.data.time.RegularTimePeriod) day53, (double) (short) 0, false);
        timeSeries52.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day61 = new org.jfree.data.time.Day();
        timeSeries60.add((org.jfree.data.time.RegularTimePeriod) day61, (double) (short) 0, false);
        java.util.Date date65 = day61.getStart();
        org.jfree.data.time.SerialDate serialDate66 = day61.getSerialDate();
        java.lang.Number number67 = null;
        timeSeries52.update((org.jfree.data.time.RegularTimePeriod) day61, number67);
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.Day day71 = new org.jfree.data.time.Day();
        timeSeries70.add((org.jfree.data.time.RegularTimePeriod) day71, (double) (short) 0, false);
        timeSeries70.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod77 = timeSeries70.getNextTimePeriod();
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent79 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) 10.0d);
        boolean boolean80 = timeSeries70.equals((java.lang.Object) seriesChangeEvent79);
        org.jfree.data.time.Day day81 = new org.jfree.data.time.Day();
        int int83 = day81.compareTo((java.lang.Object) (short) 100);
        java.lang.String str84 = day81.toString();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem85 = timeSeries70.getDataItem((org.jfree.data.time.RegularTimePeriod) day81);
        int int86 = day61.compareTo((java.lang.Object) day81);
        timeSeries1.update((org.jfree.data.time.RegularTimePeriod) day81, (java.lang.Number) (byte) 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-62198899200000L) + "'", long4 == (-62198899200000L));
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate24);
        org.junit.Assert.assertNotNull(regularTimePeriod35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "9-April-2024" + "'", str42, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1711954800000L + "'", long46 == 1711954800000L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1714546799999L + "'", long47 == 1714546799999L);
        org.junit.Assert.assertNotNull(regularTimePeriod48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(timeSeriesDataItem50);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Tue Apr 09 00:00:00 PDT 2024");
        org.junit.Assert.assertNotNull(serialDate66);
        org.junit.Assert.assertNotNull(regularTimePeriod77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "9-April-2024" + "'", str84, "9-April-2024");
        org.junit.Assert.assertNotNull(timeSeriesDataItem85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }
}


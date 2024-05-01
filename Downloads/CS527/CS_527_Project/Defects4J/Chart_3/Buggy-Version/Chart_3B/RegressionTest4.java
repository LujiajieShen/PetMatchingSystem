import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener13);
        timeSeries10.setDescription("");
        double double17 = timeSeries10.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        double double6 = timeSeries3.getMinY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.removeChangeListener(seriesChangeListener7);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Class<?> wildcardClass9 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        double double10 = timeSeries3.getMaxY();
        java.lang.String str11 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        timeSeries3.setDomainDescription("Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        timeSeries28.setDescription("");
        double double31 = timeSeries28.getMaxY();
        timeSeries28.removeAgedItems(true);
        java.util.Collection collection34 = timeSeries28.getTimePeriods();
        java.lang.Class<?> wildcardClass35 = timeSeries28.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        timeSeries10.removeAgedItems(true);
        double double16 = timeSeries10.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        long long5 = timeSeries4.getMaximumItemAge();
        timeSeries4.removeAgedItems(false);
        int int8 = timeSeries4.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.String str16 = timeSeries8.getDescription();
        java.util.Collection collection17 = timeSeries8.getTimePeriods();
        timeSeries8.removeAgedItems((long) ' ', false);
        int int21 = timeSeries8.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries8.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        long long10 = timeSeries3.getMaximumItemAge();
        timeSeries3.setKey((java.lang.Comparable) (-1));
        java.lang.Comparable comparable13 = timeSeries3.getKey();
        java.lang.String str14 = timeSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1) + "'", comparable13, (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries14.setMaximumItemAge(10L);
        timeSeries14.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection20 = timeSeries14.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(timeSeriesDataItem21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        boolean boolean14 = timeSeries3.isEmpty();
        java.util.List list15 = timeSeries3.getItems();
        java.lang.Class class16 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries3.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "Value", "Overwritten values from:  ");
        timeSeries3.setDescription("Time");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries14.setMaximumItemAge(10L);
        timeSeries14.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        java.util.Collection collection23 = timeSeries21.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener24);
        java.util.Collection collection26 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod27, (java.lang.Number) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "Overwritten values from:  ", "Overwritten values from:  ");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) -1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.setNotify(false);
        java.lang.String str19 = timeSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries10.removeAgedItems(100L, false);
        java.lang.String str14 = timeSeries10.getRangeDescription();
        int int15 = timeSeries10.getMaximumItemCount();
        java.util.Collection collection16 = timeSeries10.getTimePeriods();
        timeSeries10.clear();
        java.util.Collection collection18 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries10.removeAgedItems(true);
        java.lang.Object obj21 = timeSeries10.clone();
        double double22 = timeSeries10.getMaxY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.lang.Object obj5 = timeSeries3.clone();
        int int6 = timeSeries3.getItemCount();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        java.lang.String str10 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setKey((java.lang.Comparable) 1.0f);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener13);
        double double15 = timeSeries12.getMaxY();
        timeSeries12.removeAgedItems(true);
        timeSeries12.setRangeDescription("hi!");
        timeSeries12.removeAgedItems((long) 97, true);
        boolean boolean23 = timeSeries1.equals((java.lang.Object) 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        java.lang.Object obj46 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number48 = timeSeries3.getValue(regularTimePeriod47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDescription("");
        int int13 = timeSeries10.getMaximumItemCount();
        timeSeries10.clear();
        timeSeries10.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        long long2 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries6.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries6.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries6.createCopy(0, 10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double29 = timeSeries28.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double34 = timeSeries33.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries28.addAndOrUpdate(timeSeries33);
        java.util.Collection collection36 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class41 = timeSeries40.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries24.addAndOrUpdate(timeSeries40);
        timeSeries42.setDescription("");
        double double45 = timeSeries42.getMaxY();
        timeSeries42.setMaximumItemAge((long) (short) 0);
        java.util.Collection collection48 = timeSeries42.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries13.addAndOrUpdate(timeSeries42);
        boolean boolean50 = timeSeries42.getNotify();
        java.util.Collection collection51 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        timeSeries1.setKey((java.lang.Comparable) (byte) 10);
        timeSeries1.setMaximumItemAge(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(class41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries10.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        long long5 = timeSeries4.getMaximumItemAge();
        timeSeries4.removeAgedItems((long) 100, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod9, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        timeSeries3.setRangeDescription("");
        timeSeries3.setNotify(false);
        java.lang.String str10 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        timeSeries8.removeAgedItems(true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries8.removeChangeListener(seriesChangeListener18);
        int int20 = timeSeries8.getItemCount();
        double double21 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries8.createCopy((int) 'a', 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = timeSeries24.getValue(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.String str16 = timeSeries8.getDescription();
        java.util.Collection collection17 = timeSeries8.getTimePeriods();
        timeSeries8.removeAgedItems((long) ' ', false);
        timeSeries8.removeAgedItems(false);
        int int23 = timeSeries8.getMaximumItemCount();
        timeSeries8.setMaximumItemCount(10);
        timeSeries8.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries8.addOrUpdate(regularTimePeriod28, (java.lang.Number) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge((long) (short) 10);
        double double13 = timeSeries3.getMinY();
        double double14 = timeSeries3.getMaxY();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener15);
        java.lang.Object obj17 = timeSeries3.clone();
        java.util.Collection collection18 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries17.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.addChangeListener(seriesChangeListener20);
        int int22 = timeSeries17.getItemCount();
        boolean boolean23 = timeSeries10.equals((java.lang.Object) int22);
        timeSeries10.removeAgedItems(10L, true);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "Value");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries10.addAndOrUpdate(timeSeries30);
        timeSeries31.setKey((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.List list12 = timeSeries10.getItems();
        java.lang.String str13 = timeSeries10.getDescription();
        java.util.List list14 = timeSeries10.getItems();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        timeSeries3.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Overwritten values from:  ", "Time");
        double double4 = timeSeries3.getMaxY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        java.lang.Object obj6 = timeSeries3.clone();
        int int7 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        timeSeries11.setKey((java.lang.Comparable) 10.0d);
        java.util.Collection collection15 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        java.lang.String str16 = timeSeries3.getDescription();
        double double17 = timeSeries3.getMinY();
        java.lang.String str18 = timeSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        timeSeries3.setKey((java.lang.Comparable) "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        timeSeries10.setMaximumItemAge(1L);
        int int16 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries10.addOrUpdate(regularTimePeriod17, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(false);
        double double14 = timeSeries3.getMinY();
        int int15 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("hi!");
        timeSeries10.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        timeSeries22.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double32 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double37 = timeSeries36.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries31.addAndOrUpdate(timeSeries36);
        double double39 = timeSeries38.getMinY();
        boolean boolean40 = timeSeries38.getNotify();
        java.util.Collection collection41 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        boolean boolean42 = timeSeries10.equals((java.lang.Object) collection41);
        java.lang.Object obj43 = timeSeries10.clone();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.setRangeDescription("Value");
        timeSeries3.setMaximumItemAge((long) 2147483647);
        java.lang.String str38 = timeSeries3.getRangeDescription();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries3.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries31.fireSeriesChanged();
        boolean boolean35 = timeSeries31.isEmpty();
        timeSeries31.setMaximumItemAge((long) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries31.add(timeSeriesDataItem38, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.String str16 = timeSeries8.getDescription();
        java.util.Collection collection17 = timeSeries8.getTimePeriods();
        timeSeries8.removeAgedItems((long) '4', false);
        java.lang.Class class21 = timeSeries8.getTimePeriodClass();
        timeSeries8.setNotify(true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        boolean boolean20 = timeSeries3.equals((java.lang.Object) comparable19);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries3.removeChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.createCopy((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        boolean boolean20 = timeSeries3.equals((java.lang.Object) comparable19);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries3.removeChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double32 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.addAndOrUpdate(timeSeries31);
        timeSeries31.setDomainDescription("hi!");
        java.util.List list36 = timeSeries31.getItems();
        timeSeries31.setRangeDescription("");
        java.lang.String str39 = timeSeries31.getDescription();
        java.util.Collection collection40 = timeSeries31.getTimePeriods();
        timeSeries31.removeAgedItems((long) '4', false);
        java.lang.Class class44 = timeSeries31.getTimePeriodClass();
        java.util.Collection collection45 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        timeSeries49.removePropertyChangeListener(propertyChangeListener50);
        java.lang.Comparable comparable52 = timeSeries49.getKey();
        timeSeries49.removeAgedItems(100L, true);
        timeSeries49.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries49.removeChangeListener(seriesChangeListener58);
        long long60 = timeSeries49.getMaximumItemAge();
        timeSeries49.setDomainDescription("hi!");
        java.lang.String str63 = timeSeries49.getDomainDescription();
        java.lang.String str64 = timeSeries49.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries31.addAndOrUpdate(timeSeries49);
        timeSeries65.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + ' ' + "'", comparable52, ' ');
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 9223372036854775807L + "'", long60 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(timeSeries65);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries10.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update(regularTimePeriod25, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        java.lang.String str9 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries3.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries15.addAndOrUpdate(timeSeries20);
        java.util.Collection collection23 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.lang.Comparable comparable30 = timeSeries27.getKey();
        timeSeries27.removeAgedItems(100L, true);
        timeSeries27.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries38.removeAgedItems(100L, false);
        java.lang.String str42 = timeSeries38.getRangeDescription();
        double double43 = timeSeries38.getMaxY();
        double double44 = timeSeries38.getMinY();
        java.lang.Object obj45 = timeSeries38.clone();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double50 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries49.addAndOrUpdate(timeSeries54);
        timeSeries56.removeAgedItems((long) (short) -1, false);
        boolean boolean60 = timeSeries56.getNotify();
        timeSeries56.setDomainDescription("Value");
        java.util.Collection collection63 = timeSeries38.getTimePeriodsUniqueToOtherSeries(timeSeries56);
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries27.addAndOrUpdate(timeSeries38);
        double double65 = timeSeries38.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries8.addAndOrUpdate(timeSeries38);
        int int67 = timeSeries38.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.add(timeSeriesDataItem68, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + ' ' + "'", comparable30, ' ');
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        timeSeries3.setDomainDescription("Value");
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.addChangeListener(seriesChangeListener14);
        java.util.Collection collection16 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setKey((java.lang.Comparable) 10);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries10.setDescription("");
        timeSeries10.clear();
        java.lang.String str14 = timeSeries10.getDomainDescription();
        java.util.List list15 = timeSeries10.getItems();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        java.lang.String str23 = timeSeries19.getRangeDescription();
        java.util.Collection collection24 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries28.removeAgedItems(100L, false);
        java.lang.String str32 = timeSeries28.getRangeDescription();
        timeSeries28.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double39 = timeSeries38.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double44 = timeSeries43.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries38.addAndOrUpdate(timeSeries43);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double50 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries49.addAndOrUpdate(timeSeries54);
        java.util.Collection collection57 = timeSeries45.getTimePeriodsUniqueToOtherSeries(timeSeries56);
        java.util.Collection collection58 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries56);
        long long59 = timeSeries56.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries56.createCopy(10, (int) (short) 100);
        java.util.Collection collection63 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries62);
        java.util.Collection collection64 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.setMaximumItemAge((long) 10);
        java.lang.String str67 = timeSeries19.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 9223372036854775807L + "'", long59 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        timeSeries1.setDescription("");
        timeSeries1.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemAge((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        timeSeries18.setDomainDescription("hi!");
        java.util.List list23 = timeSeries18.getItems();
        timeSeries18.setRangeDescription("");
        java.lang.String str26 = timeSeries18.getDescription();
        java.util.Collection collection27 = timeSeries18.getTimePeriods();
        timeSeries18.removeAgedItems((long) '4', false);
        java.lang.Class class31 = timeSeries18.getTimePeriodClass();
        boolean boolean32 = timeSeries3.equals((java.lang.Object) timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        int int6 = timeSeries1.getItemCount();
        java.lang.Object obj7 = timeSeries1.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (double) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        int int12 = timeSeries3.getMaximumItemCount();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        timeSeries19.removeAgedItems(100L, true);
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries19.removeChangeListener(seriesChangeListener28);
        long long30 = timeSeries19.getMaximumItemAge();
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries10.addAndOrUpdate(timeSeries19);
        boolean boolean34 = timeSeries19.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries10.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries3.addChangeListener(seriesChangeListener17);
        java.lang.String str19 = timeSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double50 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries49.addAndOrUpdate(timeSeries54);
        java.lang.Comparable comparable57 = timeSeries54.getKey();
        timeSeries54.clear();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries54);
        timeSeries54.removeAgedItems(0L, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener63 = null;
        timeSeries54.removeChangeListener(seriesChangeListener63);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + ' ' + "'", comparable57, ' ');
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        boolean boolean20 = timeSeries3.equals((java.lang.Object) comparable19);
        timeSeries3.setKey((java.lang.Comparable) (short) 10);
        java.lang.String str23 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDescription("hi!");
        java.lang.Class<?> wildcardClass13 = timeSeries8.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener15);
        java.lang.String str17 = timeSeries3.getDescription();
        java.util.Collection collection18 = timeSeries3.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        java.lang.Object obj11 = timeSeries3.clone();
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        boolean boolean14 = timeSeries3.getNotify();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener23);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries10.addChangeListener(seriesChangeListener25);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge((long) (short) 10);
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod17, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double10 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries9.addAndOrUpdate(timeSeries14);
        timeSeries14.setDomainDescription("hi!");
        timeSeries14.setRangeDescription("");
        timeSeries14.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries26.removeAgedItems(100L, false);
        timeSeries26.setNotify(false);
        timeSeries26.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries14.addAndOrUpdate(timeSeries26);
        java.lang.Class<?> wildcardClass35 = timeSeries34.getClass();
        boolean boolean36 = timeSeries1.equals((java.lang.Object) wildcardClass35);
        double double37 = timeSeries1.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries1.addOrUpdate(regularTimePeriod38, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        timeSeries3.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.lang.Comparable comparable23 = timeSeries20.getKey();
        timeSeries20.removeAgedItems(100L, true);
        timeSeries20.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries20.removeChangeListener(seriesChangeListener29);
        timeSeries20.removeAgedItems((long) 100, true);
        java.lang.Class class34 = timeSeries20.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries3.addAndOrUpdate(timeSeries20);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries3.removeChangeListener(seriesChangeListener36);
        java.lang.Class<?> wildcardClass38 = timeSeries3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        java.lang.String str14 = timeSeries10.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod15, (java.lang.Number) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries3.removeChangeListener(seriesChangeListener41);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.clear();
        timeSeries8.removeAgedItems((-1L), false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeSeries8.getIndex(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(false);
        java.lang.String str12 = timeSeries3.getDescription();
        java.lang.Object obj13 = timeSeries3.clone();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener8);
        timeSeries3.setMaximumItemAge(0L);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = timeSeries3.getKey();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 100 + "'", comparable7, 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        int int15 = timeSeries10.getItemCount();
        java.util.Collection collection16 = timeSeries10.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries5.removeAgedItems(100L, false);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        double double10 = timeSeries5.getMaxY();
        timeSeries5.setDomainDescription("");
        java.util.Collection collection13 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.addOrUpdate(regularTimePeriod14, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "Overwritten values from:  ");
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDomainDescription("");
        int int8 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Overwritten values from:  ", "Time");
        boolean boolean4 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setKey((java.lang.Comparable) 100L);
        java.lang.String str15 = timeSeries8.getRangeDescription();
        java.lang.Class class16 = timeSeries8.getTimePeriodClass();
        long long17 = timeSeries8.getMaximumItemAge();
        timeSeries8.removeAgedItems((long) 100, true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setRangeDescription("");
        timeSeries8.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries20.removeAgedItems(100L, false);
        timeSeries20.setNotify(false);
        timeSeries20.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries8.addAndOrUpdate(timeSeries20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(regularTimePeriod29, (java.lang.Number) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        java.lang.Object obj10 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        timeSeries21.removeAgedItems((long) (short) -1, false);
        boolean boolean25 = timeSeries21.getNotify();
        timeSeries21.setDomainDescription("Value");
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener29);
        int int31 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        timeSeries8.clear();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries8.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        java.lang.String str5 = timeSeries3.getRangeDescription();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double22 = timeSeries21.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries21.addAndOrUpdate(timeSeries26);
        java.util.Collection collection29 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class34 = timeSeries33.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries17.addAndOrUpdate(timeSeries33);
        timeSeries35.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries35.createCopy((int) (byte) 0, (int) (byte) 100);
        boolean boolean40 = timeSeries3.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.removeAgedItems((long) '#', false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) Double.NaN, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.removeAgedItems(false);
        timeSeries3.setMaximumItemAge(0L);
        java.lang.Class<?> wildcardClass38 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries17.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.addChangeListener(seriesChangeListener20);
        int int22 = timeSeries17.getItemCount();
        boolean boolean23 = timeSeries10.equals((java.lang.Object) int22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double33 = timeSeries32.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries27.addAndOrUpdate(timeSeries32);
        timeSeries34.setDomainDescription("");
        timeSeries34.setKey((java.lang.Comparable) 1);
        boolean boolean39 = timeSeries34.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries43.removePropertyChangeListener(propertyChangeListener44);
        java.lang.Comparable comparable46 = timeSeries43.getKey();
        timeSeries43.removeAgedItems(100L, true);
        timeSeries43.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries43.removeChangeListener(seriesChangeListener52);
        long long54 = timeSeries43.getMaximumItemAge();
        timeSeries43.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries34.addAndOrUpdate(timeSeries43);
        double double58 = timeSeries34.getMinY();
        boolean boolean59 = timeSeries10.equals((java.lang.Object) double58);
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double64 = timeSeries63.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double69 = timeSeries68.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries63.addAndOrUpdate(timeSeries68);
        timeSeries68.setDomainDescription("hi!");
        java.util.List list73 = timeSeries68.getItems();
        timeSeries68.setRangeDescription("");
        timeSeries68.removeAgedItems(1L, true);
        timeSeries68.setMaximumItemAge((long) 1);
        timeSeries68.fireSeriesChanged();
        java.util.Collection collection82 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries68);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem84 = timeSeries10.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + ' ' + "'", comparable46, ' ');
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 9223372036854775807L + "'", long54 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertNotNull(collection82);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries12.addAndOrUpdate(timeSeries17);
        double double20 = timeSeries19.getMinY();
        boolean boolean21 = timeSeries19.getNotify();
        java.util.Collection collection22 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '4', (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        long long2 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries6.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries6.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries6.createCopy(0, 10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double29 = timeSeries28.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double34 = timeSeries33.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries28.addAndOrUpdate(timeSeries33);
        java.util.Collection collection36 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class41 = timeSeries40.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries24.addAndOrUpdate(timeSeries40);
        timeSeries42.setDescription("");
        double double45 = timeSeries42.getMaxY();
        timeSeries42.setMaximumItemAge((long) (short) 0);
        java.util.Collection collection48 = timeSeries42.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries13.addAndOrUpdate(timeSeries42);
        boolean boolean50 = timeSeries42.getNotify();
        java.util.Collection collection51 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        java.util.Collection collection52 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(class41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(collection52);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.String str16 = timeSeries8.getDescription();
        java.util.Collection collection17 = timeSeries8.getTimePeriods();
        timeSeries8.removeAgedItems((long) ' ', false);
        timeSeries8.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries8.getDataItem(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems((long) '4', false);
        java.util.Collection collection25 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        timeSeries10.setMaximumItemAge((long) 1);
        java.util.Collection collection28 = timeSeries10.getTimePeriods();
        java.util.List list29 = timeSeries10.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries10.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems((long) '4', false);
        java.util.Collection collection25 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        java.lang.Comparable comparable26 = timeSeries10.getKey();
        timeSeries10.setRangeDescription("");
        double double29 = timeSeries10.getMaxY();
        java.lang.String str30 = timeSeries10.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "Overwritten values from:  " + "'", comparable26, "Overwritten values from:  ");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        int int16 = timeSeries10.getMaximumItemCount();
        java.lang.String str17 = timeSeries10.getDomainDescription();
        boolean boolean18 = timeSeries10.getNotify();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        int int15 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries3.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDescription();
        timeSeries3.setNotify(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.addChangeListener(seriesChangeListener11);
        timeSeries3.clear();
        java.lang.String str14 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems((long) '4', false);
        java.util.Collection collection25 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries10.addOrUpdate(regularTimePeriod26, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, "hi!", "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod4, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 1, 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries1.getValue(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "Overwritten values from: Overwritten values from:  ", "hi!");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "hi!", "Value");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries3.getMinY();
        java.lang.Class class17 = timeSeries3.getTimePeriodClass();
        long long18 = timeSeries3.getMaximumItemAge();
        java.util.List list19 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ");
        timeSeries23.setKey((java.lang.Comparable) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener26);
        timeSeries23.setMaximumItemAge((long) 2147483647);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries23.addChangeListener(seriesChangeListener30);
        java.util.Collection collection32 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener33);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        boolean boolean14 = timeSeries3.isEmpty();
        timeSeries3.setRangeDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener17);
        java.lang.Class class19 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries3.addOrUpdate(regularTimePeriod20, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(class19);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        timeSeries3.removeAgedItems((long) 2147483647, false);
        timeSeries3.setRangeDescription("Overwritten values from: Overwritten values from:  ");
        timeSeries3.setKey((java.lang.Comparable) (byte) 100);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems((long) ' ', false);
        int int14 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries17.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.addChangeListener(seriesChangeListener20);
        int int22 = timeSeries17.getItemCount();
        boolean boolean23 = timeSeries10.equals((java.lang.Object) int22);
        timeSeries10.removeAgedItems(10L, true);
        timeSeries10.fireSeriesChanged();
        long long28 = timeSeries10.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9223372036854775807L + "'", long28 == 9223372036854775807L);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.setMaximumItemAge((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        timeSeries1.clear();
        timeSeries1.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries3.getMinY();
        timeSeries3.setRangeDescription("Time");
        java.lang.String str14 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setMaximumItemCount((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        int int16 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries20.removeAgedItems(100L, false);
        int int24 = timeSeries20.getItemCount();
        java.lang.String str25 = timeSeries20.getDescription();
        boolean boolean26 = timeSeries10.equals((java.lang.Object) timeSeries20);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "", "hi!");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries34.removePropertyChangeListener(propertyChangeListener35);
        java.lang.Comparable comparable37 = timeSeries34.getKey();
        timeSeries34.removeAgedItems(100L, true);
        timeSeries34.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries34.removePropertyChangeListener(propertyChangeListener43);
        java.util.Collection collection45 = timeSeries34.getTimePeriods();
        boolean boolean46 = timeSeries30.equals((java.lang.Object) timeSeries34);
        boolean boolean47 = timeSeries10.equals((java.lang.Object) timeSeries30);
        double double48 = timeSeries10.getMaxY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + ' ' + "'", comparable37, ' ');
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        double double46 = timeSeries3.getMinY();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class49 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNull(class49);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        timeSeries20.removeAgedItems((long) (short) -1, false);
        boolean boolean24 = timeSeries20.getNotify();
        timeSeries20.removeAgedItems((long) (-1), false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        double double29 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.lang.Comparable comparable36 = timeSeries33.getKey();
        timeSeries33.removeAgedItems(100L, true);
        int int40 = timeSeries33.getItemCount();
        java.lang.Object obj41 = timeSeries33.clone();
        java.lang.Class class42 = timeSeries33.getTimePeriodClass();
        java.util.Collection collection43 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries33);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + ' ' + "'", comparable36, ' ');
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(class42);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.setMaximumItemAge((long) (short) 100);
        timeSeries3.setNotify(false);
        double double38 = timeSeries3.getMinY();
        int int39 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        int int16 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries20.removeAgedItems(100L, false);
        int int24 = timeSeries20.getItemCount();
        java.lang.String str25 = timeSeries20.getDescription();
        boolean boolean26 = timeSeries10.equals((java.lang.Object) timeSeries20);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "", "hi!");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries34.removePropertyChangeListener(propertyChangeListener35);
        java.lang.Comparable comparable37 = timeSeries34.getKey();
        timeSeries34.removeAgedItems(100L, true);
        timeSeries34.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries34.removePropertyChangeListener(propertyChangeListener43);
        java.util.Collection collection45 = timeSeries34.getTimePeriods();
        boolean boolean46 = timeSeries30.equals((java.lang.Object) timeSeries34);
        boolean boolean47 = timeSeries10.equals((java.lang.Object) timeSeries30);
        java.lang.String str48 = timeSeries30.getRangeDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + ' ' + "'", comparable37, ' ');
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        timeSeries10.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries10.getDataItem(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        timeSeries3.setNotify(false);
        timeSeries3.removeAgedItems((long) (byte) 100, false);
        java.lang.Class<?> wildcardClass12 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        timeSeries19.removeAgedItems(100L, true);
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries19.removeChangeListener(seriesChangeListener28);
        long long30 = timeSeries19.getMaximumItemAge();
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries10.addAndOrUpdate(timeSeries19);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries39.removeAgedItems(100L, false);
        java.lang.String str43 = timeSeries39.getRangeDescription();
        int int44 = timeSeries39.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries39.addChangeListener(seriesChangeListener45);
        double double47 = timeSeries39.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries19.addAndOrUpdate(timeSeries39);
        timeSeries39.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number52 = timeSeries39.getValue(regularTimePeriod51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(timeSeries48);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = timeSeries12.getKey();
        timeSeries12.setRangeDescription("");
        timeSeries12.setRangeDescription("");
        timeSeries12.removeAgedItems((long) (byte) 0, false);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.addAndOrUpdate(timeSeries12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.update(regularTimePeriod24, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.lang.String str10 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        long long2 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries6.addAndOrUpdate(timeSeries11);
        timeSeries11.setDomainDescription("hi!");
        java.util.List list16 = timeSeries11.getItems();
        timeSeries11.setRangeDescription("");
        java.lang.Class class19 = timeSeries11.getTimePeriodClass();
        timeSeries11.clear();
        java.lang.String str21 = timeSeries11.getDescription();
        timeSeries11.removeAgedItems(true);
        boolean boolean24 = timeSeries11.getNotify();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries1.addAndOrUpdate(timeSeries11);
        java.lang.Comparable comparable26 = timeSeries11.getKey();
        boolean boolean27 = timeSeries11.getNotify();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + ' ' + "'", comparable26, ' ');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = timeSeries12.getKey();
        timeSeries12.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.addAndOrUpdate(timeSeries12);
        timeSeries3.setRangeDescription("Overwritten values from: Overwritten values from:  ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        java.lang.String str8 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries12);
        java.lang.String str14 = timeSeries3.getDomainDescription();
        boolean boolean15 = timeSeries3.getNotify();
        timeSeries3.clear();
        int int17 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        timeSeries10.removeAgedItems((long) (-1), false);
        java.lang.Object obj18 = timeSeries10.clone();
        java.lang.String str19 = timeSeries10.getRangeDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "hi!", "Overwritten values from: Overwritten values from:  ");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setRangeDescription("Overwritten values from:  ");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries3.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Time", "");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        timeSeries1.setDomainDescription("");
        timeSeries1.setMaximumItemCount((int) (short) 100);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries3.getMinY();
        java.lang.Class class17 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        timeSeries27.setNotify(false);
        timeSeries27.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries35.removeAgedItems(100L, false);
        int int39 = timeSeries35.getItemCount();
        java.lang.String str40 = timeSeries35.getDescription();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries44.removePropertyChangeListener(propertyChangeListener45);
        java.lang.Comparable comparable47 = timeSeries44.getKey();
        timeSeries44.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries35.addAndOrUpdate(timeSeries44);
        boolean boolean51 = timeSeries50.isEmpty();
        java.util.Collection collection52 = timeSeries27.getTimePeriodsUniqueToOtherSeries(timeSeries50);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        timeSeries54.removePropertyChangeListener(propertyChangeListener55);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries54.removeChangeListener(seriesChangeListener57);
        timeSeries54.setNotify(true);
        timeSeries54.removeAgedItems(true);
        java.util.Collection collection63 = timeSeries50.getTimePeriodsUniqueToOtherSeries(timeSeries54);
        boolean boolean64 = timeSeries3.equals((java.lang.Object) timeSeries54);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod66 = timeSeries54.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + ' ' + "'", comparable47, ' ');
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.removeAgedItems((long) ' ', true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.addChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '4', (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.lang.Comparable comparable18 = timeSeries15.getKey();
        timeSeries15.removeAgedItems(100L, true);
        timeSeries15.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries26.removeAgedItems(100L, false);
        java.lang.String str30 = timeSeries26.getRangeDescription();
        double double31 = timeSeries26.getMaxY();
        double double32 = timeSeries26.getMinY();
        java.lang.Object obj33 = timeSeries26.clone();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries37.addAndOrUpdate(timeSeries42);
        timeSeries44.removeAgedItems((long) (short) -1, false);
        boolean boolean48 = timeSeries44.getNotify();
        timeSeries44.setDomainDescription("Value");
        java.util.Collection collection51 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries15.addAndOrUpdate(timeSeries26);
        timeSeries15.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries15.removeChangeListener(seriesChangeListener56);
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double62 = timeSeries61.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double67 = timeSeries66.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries61.addAndOrUpdate(timeSeries66);
        java.lang.Comparable comparable69 = timeSeries66.getKey();
        timeSeries66.clear();
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries15.addAndOrUpdate(timeSeries66);
        timeSeries71.setDomainDescription("Time");
        boolean boolean74 = timeSeries71.isEmpty();
        boolean boolean75 = timeSeries71.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        timeSeries71.removePropertyChangeListener(propertyChangeListener76);
        boolean boolean78 = timeSeries3.equals((java.lang.Object) propertyChangeListener76);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + ' ' + "'", comparable18, ' ');
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(timeSeries68);
        org.junit.Assert.assertEquals("'" + comparable69 + "' != '" + ' ' + "'", comparable69, ' ');
        org.junit.Assert.assertNotNull(timeSeries71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setRangeDescription("");
        timeSeries8.setDomainDescription("Value");
        java.lang.Comparable comparable17 = timeSeries8.getKey();
        java.util.List list18 = timeSeries8.getItems();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + ' ' + "'", comparable17, ' ');
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.getDataItem(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries12.addAndOrUpdate(timeSeries17);
        double double20 = timeSeries19.getMinY();
        boolean boolean21 = timeSeries19.getNotify();
        java.util.Collection collection22 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries19.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        boolean boolean29 = timeSeries28.isEmpty();
        boolean boolean30 = timeSeries19.equals((java.lang.Object) timeSeries28);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        long long8 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int9 = timeSeries8.getItemCount();
        java.lang.Comparable comparable10 = timeSeries8.getKey();
        long long11 = timeSeries8.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries8.removeChangeListener(seriesChangeListener12);
        java.util.Collection collection14 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 100L + "'", comparable10, 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.clear();
        timeSeries8.removeAgedItems((-1L), false);
        timeSeries8.setMaximumItemCount(10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "", "hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
        java.lang.Class class6 = timeSeries3.getTimePeriodClass();
        java.lang.Object obj7 = timeSeries3.clone();
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        boolean boolean7 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setNotify(true);
        boolean boolean14 = timeSeries10.isEmpty();
        java.lang.String str15 = timeSeries10.getDomainDescription();
        double double16 = timeSeries10.getMaxY();
        java.lang.String str17 = timeSeries10.getDescription();
        java.util.Collection collection18 = timeSeries10.getTimePeriods();
        java.lang.Class<?> wildcardClass19 = timeSeries10.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        double double10 = timeSeries3.getMaxY();
        timeSeries3.setDomainDescription("Value");
        long long13 = timeSeries3.getMaximumItemAge();
        java.lang.String str14 = timeSeries3.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        timeSeries18.setDomainDescription("hi!");
        java.util.List list23 = timeSeries18.getItems();
        timeSeries18.setRangeDescription("");
        java.lang.String str26 = timeSeries18.getDescription();
        java.util.Collection collection27 = timeSeries18.getTimePeriods();
        timeSeries18.removeAgedItems((long) '4', false);
        java.lang.Class class31 = timeSeries18.getTimePeriodClass();
        boolean boolean32 = timeSeries3.equals((java.lang.Object) timeSeries18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(timeSeriesDataItem33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double8 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries7.addAndOrUpdate(timeSeries12);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double24 = timeSeries23.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries18.addAndOrUpdate(timeSeries23);
        java.util.Collection collection26 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class31 = timeSeries30.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries14.addAndOrUpdate(timeSeries30);
        timeSeries32.clear();
        timeSeries32.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries3.addAndOrUpdate(timeSeries32);
        timeSeries32.delete((int) (byte) -1, 2147483647, false);
        double double41 = timeSeries32.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries31.fireSeriesChanged();
        boolean boolean35 = timeSeries31.isEmpty();
        timeSeries31.setMaximumItemAge((long) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries31.addOrUpdate(timeSeriesDataItem38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setRangeDescription("Value");
        timeSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        java.lang.String str9 = timeSeries3.getDescription();
        int int10 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        java.lang.String str16 = timeSeries14.getRangeDescription();
        timeSeries14.clear();
        java.util.Collection collection18 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.addOrUpdate(regularTimePeriod19, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        long long2 = timeSeries1.getMaximumItemAge();
        java.lang.String str3 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener8);
        timeSeries7.setRangeDescription("");
        timeSeries7.setNotify(false);
        java.lang.String str14 = timeSeries7.getRangeDescription();
        timeSeries7.clear();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        double double11 = timeSeries3.getMaxY();
        int int12 = timeSeries3.getItemCount();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "", "");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double6 = timeSeries5.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries5.addAndOrUpdate(timeSeries10);
        double double13 = timeSeries12.getMinY();
        timeSeries12.setNotify(true);
        boolean boolean16 = timeSeries12.isEmpty();
        java.lang.String str17 = timeSeries12.getDomainDescription();
        java.lang.Comparable comparable18 = timeSeries12.getKey();
        int int19 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries1.addAndOrUpdate(timeSeries12);
        timeSeries20.setDomainDescription("Overwritten values from:  ");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Overwritten values from:  " + "'", comparable18, "Overwritten values from:  ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double17 = timeSeries16.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries16);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double24 = timeSeries23.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double29 = timeSeries28.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries23.addAndOrUpdate(timeSeries28);
        java.util.Collection collection31 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.lang.Comparable comparable38 = timeSeries35.getKey();
        timeSeries35.removeAgedItems(100L, true);
        timeSeries35.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries46.removeAgedItems(100L, false);
        java.lang.String str50 = timeSeries46.getRangeDescription();
        double double51 = timeSeries46.getMaxY();
        double double52 = timeSeries46.getMinY();
        java.lang.Object obj53 = timeSeries46.clone();
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double58 = timeSeries57.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double63 = timeSeries62.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries57.addAndOrUpdate(timeSeries62);
        timeSeries64.removeAgedItems((long) (short) -1, false);
        boolean boolean68 = timeSeries64.getNotify();
        timeSeries64.setDomainDescription("Value");
        java.util.Collection collection71 = timeSeries46.getTimePeriodsUniqueToOtherSeries(timeSeries64);
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries35.addAndOrUpdate(timeSeries46);
        double double73 = timeSeries46.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries16.addAndOrUpdate(timeSeries46);
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries3.addAndOrUpdate(timeSeries74);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod76 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries75.update(regularTimePeriod76, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + ' ' + "'", comparable38, ' ');
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertNotNull(timeSeries75);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries6.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries22);
        java.util.Collection collection25 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class30 = timeSeries29.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries13.addAndOrUpdate(timeSeries29);
        timeSeries31.setDescription("");
        double double34 = timeSeries31.getMaxY();
        int int35 = timeSeries31.getItemCount();
        double double36 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries31);
        int int38 = timeSeries31.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        double double6 = timeSeries3.getMaxY();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(1, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.Object obj7 = timeSeries3.clone();
        timeSeries3.setDescription("Overwritten values from:  ");
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setDescription("");
        java.lang.String str13 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setNotify(true);
        boolean boolean14 = timeSeries10.isEmpty();
        int int15 = timeSeries10.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        boolean boolean7 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double17 = timeSeries16.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries22.addAndOrUpdate(timeSeries27);
        java.util.Collection collection30 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class35 = timeSeries34.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries18.addAndOrUpdate(timeSeries34);
        boolean boolean37 = timeSeries18.isEmpty();
        timeSeries18.setDomainDescription("Overwritten values from:  ");
        boolean boolean40 = timeSeries18.isEmpty();
        java.util.Collection collection41 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries18.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.removeAgedItems(false);
        timeSeries3.setMaximumItemAge(0L);
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.setRangeDescription("Value");
        timeSeries3.setMaximumItemAge((long) 2147483647);
        java.lang.String str38 = timeSeries3.getRangeDescription();
        java.util.Collection collection39 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.createCopy((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "", "");
        java.lang.Comparable comparable4 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "" + "'", comparable4, "");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        java.lang.String str8 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries12);
        java.lang.String str14 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class21 = timeSeries20.getTimePeriodClass();
        double double22 = timeSeries20.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries20.addChangeListener(seriesChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        boolean boolean26 = timeSeries20.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = timeSeries20.getIndex(regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries(comparable0, "Value", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double17 = timeSeries16.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries16);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double24 = timeSeries23.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double29 = timeSeries28.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries23.addAndOrUpdate(timeSeries28);
        java.util.Collection collection31 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.lang.Comparable comparable38 = timeSeries35.getKey();
        timeSeries35.removeAgedItems(100L, true);
        timeSeries35.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries46.removeAgedItems(100L, false);
        java.lang.String str50 = timeSeries46.getRangeDescription();
        double double51 = timeSeries46.getMaxY();
        double double52 = timeSeries46.getMinY();
        java.lang.Object obj53 = timeSeries46.clone();
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double58 = timeSeries57.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double63 = timeSeries62.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries57.addAndOrUpdate(timeSeries62);
        timeSeries64.removeAgedItems((long) (short) -1, false);
        boolean boolean68 = timeSeries64.getNotify();
        timeSeries64.setDomainDescription("Value");
        java.util.Collection collection71 = timeSeries46.getTimePeriodsUniqueToOtherSeries(timeSeries64);
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries35.addAndOrUpdate(timeSeries46);
        double double73 = timeSeries46.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries16.addAndOrUpdate(timeSeries46);
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries3.addAndOrUpdate(timeSeries74);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem76 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries74.add(timeSeriesDataItem76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + ' ' + "'", comparable38, ' ');
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertNotNull(timeSeries75);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        timeSeries1.setDescription("Value");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        timeSeries3.setNotify(false);
        boolean boolean9 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.createCopy(2147483647, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        java.lang.Object obj10 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        timeSeries21.removeAgedItems((long) (short) -1, false);
        boolean boolean25 = timeSeries21.getNotify();
        timeSeries21.setDomainDescription("Value");
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        java.util.Collection collection29 = timeSeries21.getTimePeriods();
        java.util.List list30 = timeSeries21.getItems();
        java.util.Collection collection31 = timeSeries21.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str36 = timeSeries35.getDomainDescription();
        int int37 = timeSeries35.getItemCount();
        java.util.Collection collection38 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries3.createCopy(0, 10);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(timeSeries48);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        timeSeries10.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        java.util.List list8 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = timeSeries12.getKey();
        java.lang.String str16 = timeSeries12.getRangeDescription();
        java.util.Collection collection17 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries21.removeAgedItems(100L, false);
        java.lang.String str25 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double32 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double37 = timeSeries36.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries31.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double48 = timeSeries47.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries42.addAndOrUpdate(timeSeries47);
        java.util.Collection collection50 = timeSeries38.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        java.util.Collection collection51 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        long long52 = timeSeries49.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries49.createCopy(10, (int) (short) 100);
        java.util.Collection collection56 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        java.lang.Class<?> wildcardClass57 = timeSeries12.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 9223372036854775807L + "'", long52 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.delete((int) (short) -1, 2147483647);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries3.removeChangeListener(seriesChangeListener20);
        timeSeries3.fireSeriesChanged();
        int int23 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timeSeries3.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        java.lang.String str8 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries12);
        java.lang.String str14 = timeSeries3.getDomainDescription();
        boolean boolean15 = timeSeries3.getNotify();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.addOrUpdate(regularTimePeriod17, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        boolean boolean14 = timeSeries3.isEmpty();
        java.util.List list15 = timeSeries3.getItems();
        java.lang.Class class16 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        double double9 = timeSeries3.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.Collection collection12 = timeSeries10.getTimePeriods();
        java.lang.Object obj13 = timeSeries10.clone();
        long long14 = timeSeries10.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.setMaximumItemAge((long) (short) 100);
        timeSeries3.setNotify(false);
        java.util.List list38 = timeSeries3.getItems();
        double double39 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries3.addOrUpdate(regularTimePeriod44, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        timeSeries8.clear();
        timeSeries8.setRangeDescription("Value");
        java.lang.Class class16 = timeSeries8.getTimePeriodClass();
        boolean boolean18 = timeSeries8.equals((java.lang.Object) "Value");
        timeSeries8.setNotify(true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.String str16 = timeSeries8.getDescription();
        timeSeries8.setNotify(false);
        java.lang.String str19 = timeSeries8.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener15);
        java.lang.String str17 = timeSeries3.getDescription();
        java.lang.String str18 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        java.lang.Object obj4 = timeSeries3.clone();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        java.lang.Object obj8 = timeSeries3.clone();
        boolean boolean9 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (double) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        timeSeries8.setDomainDescription("Overwritten values from:  ");
        java.util.Collection collection18 = timeSeries8.getTimePeriods();
        java.lang.Class class19 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.lang.Comparable comparable26 = timeSeries23.getKey();
        timeSeries23.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries23.removeChangeListener(seriesChangeListener29);
        boolean boolean31 = timeSeries8.equals((java.lang.Object) seriesChangeListener29);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + ' ' + "'", comparable26, ' ');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("");
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        java.lang.String str6 = timeSeries3.getDescription();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setNotify(true);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d));
        java.lang.Object obj2 = timeSeries1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries5.removeAgedItems(100L, false);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        double double10 = timeSeries5.getMaxY();
        timeSeries5.setDomainDescription("");
        java.util.Collection collection13 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        boolean boolean14 = timeSeries1.getNotify();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        timeSeries19.removeAgedItems(100L, true);
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries19.removeChangeListener(seriesChangeListener28);
        long long30 = timeSeries19.getMaximumItemAge();
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries10.addAndOrUpdate(timeSeries19);
        double double34 = timeSeries10.getMaxY();
        java.util.Collection collection35 = timeSeries10.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem36, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        timeSeries3.setKey((java.lang.Comparable) 100.0f);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 0, (int) ' ');
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries12.removeAgedItems(100L, false);
        timeSeries12.setNotify(false);
        boolean boolean18 = timeSeries12.isEmpty();
        double double19 = timeSeries12.getMinY();
        java.util.Collection collection20 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries12.addAndOrUpdate(timeSeries17);
        double double20 = timeSeries19.getMinY();
        boolean boolean21 = timeSeries19.getNotify();
        java.util.Collection collection22 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.util.Collection collection23 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries3.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.String str16 = timeSeries8.getDescription();
        java.util.Collection collection17 = timeSeries8.getTimePeriods();
        timeSeries8.removeAgedItems((long) ' ', false);
        timeSeries8.removeAgedItems(false);
        int int23 = timeSeries8.getMaximumItemCount();
        java.lang.String str24 = timeSeries8.getDescription();
        java.lang.Object obj25 = timeSeries8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries8.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.removeAgedItems(false);
        double double12 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setKey((java.lang.Comparable) 1.0f);
        timeSeries1.removeAgedItems(true);
        java.util.Collection collection8 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries1.createCopy(0, 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 1, 100);
        timeSeries6.setMaximumItemAge((long) 2147483647);
        int int9 = timeSeries6.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries6.addChangeListener(seriesChangeListener10);
        double double12 = timeSeries6.getMinY();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setKey((java.lang.Comparable) 10);
        java.lang.Object obj6 = timeSeries1.clone();
        java.lang.String str7 = timeSeries1.getDescription();
        double double8 = timeSeries1.getMinY();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries10.isEmpty();
        java.lang.String str30 = timeSeries10.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries10.addOrUpdate(regularTimePeriod31, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        java.lang.Object obj6 = timeSeries3.clone();
        int int7 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        timeSeries11.setKey((java.lang.Comparable) 10.0d);
        java.util.Collection collection15 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        int int6 = timeSeries1.getItemCount();
        int int7 = timeSeries1.getItemCount();
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.setKey((java.lang.Comparable) "");
        java.util.List list18 = timeSeries3.getItems();
        java.lang.String str19 = timeSeries3.getRangeDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries3.removeChangeListener(seriesChangeListener20);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        java.lang.Object obj10 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        timeSeries21.removeAgedItems((long) (short) -1, false);
        boolean boolean25 = timeSeries21.getNotify();
        timeSeries21.setDomainDescription("Value");
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener29);
        timeSeries3.setDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener33);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = timeSeries3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        boolean boolean9 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        boolean boolean20 = timeSeries3.equals((java.lang.Object) comparable19);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries3.removeChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double32 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.addAndOrUpdate(timeSeries31);
        timeSeries31.setDomainDescription("hi!");
        java.util.List list36 = timeSeries31.getItems();
        timeSeries31.setRangeDescription("");
        java.lang.String str39 = timeSeries31.getDescription();
        java.util.Collection collection40 = timeSeries31.getTimePeriods();
        timeSeries31.removeAgedItems((long) '4', false);
        java.lang.Class class44 = timeSeries31.getTimePeriodClass();
        java.util.Collection collection45 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        timeSeries49.removePropertyChangeListener(propertyChangeListener50);
        java.lang.Comparable comparable52 = timeSeries49.getKey();
        timeSeries49.removeAgedItems(100L, true);
        timeSeries49.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries49.removeChangeListener(seriesChangeListener58);
        long long60 = timeSeries49.getMaximumItemAge();
        timeSeries49.setDomainDescription("hi!");
        java.lang.String str63 = timeSeries49.getDomainDescription();
        java.lang.String str64 = timeSeries49.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries31.addAndOrUpdate(timeSeries49);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener66);
        java.util.Collection collection68 = timeSeries31.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + ' ' + "'", comparable52, ' ');
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 9223372036854775807L + "'", long60 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries14.setMaximumItemAge(10L);
        timeSeries14.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries14);
        int int20 = timeSeries19.getItemCount();
        timeSeries19.setMaximumItemCount(1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.util.List list7 = timeSeries1.getItems();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries3.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries3.removeChangeListener(seriesChangeListener15);
        java.lang.Class class17 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.lang.Comparable comparable24 = timeSeries21.getKey();
        timeSeries21.removeAgedItems(100L, true);
        timeSeries21.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries21.removeChangeListener(seriesChangeListener30);
        long long32 = timeSeries21.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener33);
        java.lang.String str35 = timeSeries21.getDescription();
        java.lang.String str36 = timeSeries21.getRangeDescription();
        timeSeries21.removeAgedItems((long) (-1), true);
        timeSeries21.clear();
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries3.addAndOrUpdate(timeSeries21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number43 = timeSeries41.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + ' ' + "'", comparable24, ' ');
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223372036854775807L + "'", long32 == 9223372036854775807L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "", "hi!");
        double double4 = timeSeries3.getMinY();
        int int5 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        java.lang.Object obj10 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener11);
        timeSeries3.clear();
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries14.getMinY();
        boolean boolean17 = timeSeries14.isEmpty();
        double double18 = timeSeries14.getMaxY();
        java.lang.Class class19 = timeSeries14.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNull(class19);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries3.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        int int4 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries3.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.removeAgedItems(false);
        java.util.List list36 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = timeSeries3.getIndex(regularTimePeriod37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        java.lang.Object obj11 = timeSeries3.clone();
        timeSeries3.setMaximumItemAge(0L);
        long long14 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod15, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        double double15 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries19.addAndOrUpdate(timeSeries24);
        timeSeries24.setDomainDescription("hi!");
        timeSeries24.setRangeDescription("");
        timeSeries24.setDomainDescription("Value");
        java.lang.Comparable comparable33 = timeSeries24.getKey();
        java.util.Collection collection34 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = timeSeries10.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + ' ' + "'", comparable33, ' ');
        org.junit.Assert.assertNotNull(collection34);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        java.util.List list8 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = timeSeries12.getKey();
        java.lang.String str16 = timeSeries12.getRangeDescription();
        java.util.Collection collection17 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries21.removeAgedItems(100L, false);
        java.lang.String str25 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double32 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double37 = timeSeries36.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries31.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double48 = timeSeries47.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries42.addAndOrUpdate(timeSeries47);
        java.util.Collection collection50 = timeSeries38.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        java.util.Collection collection51 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        long long52 = timeSeries49.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries49.createCopy(10, (int) (short) 100);
        java.util.Collection collection56 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        java.lang.Object obj57 = timeSeries12.clone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 9223372036854775807L + "'", long52 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        double double13 = timeSeries11.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries11.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        java.util.List list14 = timeSeries3.getItems();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge((long) (short) 10);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy((int) ' ', 97);
        java.util.List list16 = timeSeries3.getItems();
        java.util.Collection collection17 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        int int6 = timeSeries1.getItemCount();
        int int7 = timeSeries1.getItemCount();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries3.getDomainDescription();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        long long6 = timeSeries3.getMaximumItemAge();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.setMaximumItemAge((long) ' ');
        java.lang.Object obj11 = timeSeries3.clone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        timeSeries3.removeAgedItems(false);
        int int17 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        timeSeries3.setNotify(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        int int12 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemCount(10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries6.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries22);
        java.util.Collection collection25 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class30 = timeSeries29.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries13.addAndOrUpdate(timeSeries29);
        timeSeries31.setDescription("");
        double double34 = timeSeries31.getMaxY();
        int int35 = timeSeries31.getItemCount();
        double double36 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries1.addAndOrUpdate(timeSeries31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries40 = timeSeries1.createCopy(regularTimePeriod38, regularTimePeriod39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = timeSeries12.getKey();
        timeSeries12.setRangeDescription("");
        timeSeries12.setRangeDescription("");
        timeSeries12.removeAgedItems((long) (byte) 0, false);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.lang.String str24 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.getDataItem(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Value", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) (short) -1);
        timeSeries3.removeAgedItems((-1L), true);
        double double10 = timeSeries3.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.addOrUpdate(timeSeriesDataItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setRangeDescription("");
        java.lang.Object obj7 = null;
        boolean boolean8 = timeSeries3.equals(obj7);
        int int9 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        timeSeries3.setNotify(false);
        double double16 = timeSeries3.getMaxY();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double6 = timeSeries5.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries5.addAndOrUpdate(timeSeries10);
        timeSeries10.setDomainDescription("hi!");
        java.util.List list15 = timeSeries10.getItems();
        timeSeries10.setNotify(true);
        int int18 = timeSeries10.getItemCount();
        java.util.Collection collection19 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries1.removeAgedItems(false);
        java.lang.String str22 = timeSeries1.getDescription();
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries28.removePropertyChangeListener(propertyChangeListener29);
        java.lang.Comparable comparable31 = timeSeries28.getKey();
        timeSeries28.removeAgedItems(100L, true);
        timeSeries28.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries28.removeChangeListener(seriesChangeListener37);
        long long39 = timeSeries28.getMaximumItemAge();
        timeSeries28.setDomainDescription("hi!");
        timeSeries28.delete((int) (short) -1, 2147483647);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener45);
        java.lang.Class<?> wildcardClass47 = timeSeries28.getClass();
        boolean boolean48 = timeSeries1.equals((java.lang.Object) timeSeries28);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries28.addChangeListener(seriesChangeListener49);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + ' ' + "'", comparable31, ' ');
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 9223372036854775807L + "'", long39 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj6 = timeSeries3.clone();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeSeries3.getIndex(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems((long) '4', false);
        java.util.Collection collection25 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        java.lang.Comparable comparable26 = timeSeries10.getKey();
        timeSeries10.removeAgedItems((long) (short) 100, false);
        int int30 = timeSeries10.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = timeSeries10.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "Overwritten values from:  " + "'", comparable26, "Overwritten values from:  ");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setDescription("Overwritten values from:  ");
        timeSeries3.setDomainDescription("");
        java.lang.String str15 = timeSeries3.getDescription();
        java.lang.Object obj16 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Overwritten values from:  " + "'", str15, "Overwritten values from:  ");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Time", "");
        int int4 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemCount((int) (short) 0);
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        long long5 = timeSeries4.getMaximumItemAge();
        boolean boolean6 = timeSeries4.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        boolean boolean14 = timeSeries3.isEmpty();
        java.util.List list15 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double8 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries7.addAndOrUpdate(timeSeries12);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double24 = timeSeries23.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries18.addAndOrUpdate(timeSeries23);
        java.util.Collection collection26 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class31 = timeSeries30.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries14.addAndOrUpdate(timeSeries30);
        timeSeries32.clear();
        timeSeries32.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries3.addAndOrUpdate(timeSeries32);
        timeSeries3.setMaximumItemAge(0L);
        double double39 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = timeSeries3.getValue(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setMaximumItemCount((int) 'a');
        boolean boolean15 = timeSeries10.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        timeSeries1.setMaximumItemAge((long) 0);
        int int10 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double17 = timeSeries16.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries16);
        timeSeries16.setDomainDescription("hi!");
        java.util.List list21 = timeSeries16.getItems();
        timeSeries16.setRangeDescription("");
        java.lang.String str24 = timeSeries16.getDescription();
        java.util.Collection collection25 = timeSeries16.getTimePeriods();
        timeSeries16.removeAgedItems((long) ' ', false);
        timeSeries16.removeAgedItems(false);
        java.util.Collection collection31 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        double double32 = timeSeries16.getMaxY();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = timeSeries10.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.setMaximumItemAge((long) (short) 100);
        timeSeries3.setNotify(false);
        java.util.List list38 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) "hi!");
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener41);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.lang.String str34 = timeSeries3.getDescription();
        int int35 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f);
        timeSeries1.setRangeDescription("Overwritten values from:  ");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries15.addAndOrUpdate(timeSeries20);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double32 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.addAndOrUpdate(timeSeries31);
        java.util.Collection collection34 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class39 = timeSeries38.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries22.addAndOrUpdate(timeSeries38);
        boolean boolean41 = timeSeries22.isEmpty();
        timeSeries22.setDomainDescription("Overwritten values from:  ");
        boolean boolean44 = timeSeries22.isEmpty();
        java.util.Collection collection45 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(class39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        double double7 = timeSeries3.getMinY();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        int int6 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timeSeries3.getNotify();
        boolean boolean11 = timeSeries3.getNotify();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries22.removeAgedItems(100L, false);
        java.lang.String str26 = timeSeries22.getRangeDescription();
        int int27 = timeSeries22.getMaximumItemCount();
        timeSeries22.clear();
        timeSeries22.setDescription("");
        boolean boolean31 = timeSeries3.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries34 = timeSeries3.createCopy(2147483647, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = timeSeries1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.getNotify();
        java.lang.Comparable comparable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setKey(comparable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        timeSeries19.removeAgedItems(100L, true);
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries19.removeChangeListener(seriesChangeListener28);
        long long30 = timeSeries19.getMaximumItemAge();
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries10.addAndOrUpdate(timeSeries19);
        double double34 = timeSeries10.getMaxY();
        java.util.Collection collection35 = timeSeries10.getTimePeriods();
        timeSeries10.setDomainDescription("");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        timeSeries10.setNotify(true);
        java.lang.Object obj16 = timeSeries10.clone();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        timeSeries4.fireSeriesChanged();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        int int7 = timeSeries4.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) '#', (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class21 = timeSeries20.getTimePeriodClass();
        double double22 = timeSeries20.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries20.addChangeListener(seriesChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener26);
        java.lang.Class class28 = timeSeries20.getTimePeriodClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(class28);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        boolean boolean20 = timeSeries3.equals((java.lang.Object) comparable19);
        timeSeries3.setKey((java.lang.Comparable) (short) 10);
        double double23 = timeSeries3.getMinY();
        timeSeries3.setDomainDescription("Overwritten values from:  ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.setKey((java.lang.Comparable) "");
        java.util.List list18 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod19, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries14.setMaximumItemAge(10L);
        timeSeries14.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        java.lang.Comparable comparable21 = timeSeries19.getKey();
        java.util.Collection collection22 = timeSeries19.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + "Overwritten values from: Overwritten values from:  " + "'", comparable21, "Overwritten values from: Overwritten values from:  ");
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        timeSeries1.setMaximumItemAge((long) 0);
        java.util.Collection collection10 = timeSeries1.getTimePeriods();
        java.lang.Class class11 = timeSeries1.getTimePeriodClass();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries1.addChangeListener(seriesChangeListener12);
        java.lang.Class<?> wildcardClass14 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries1.createCopy(0, 10);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries12.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double24 = timeSeries23.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double29 = timeSeries28.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries23.addAndOrUpdate(timeSeries28);
        java.util.Collection collection31 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class36 = timeSeries35.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries19.addAndOrUpdate(timeSeries35);
        timeSeries37.setDescription("");
        double double40 = timeSeries37.getMaxY();
        timeSeries37.setMaximumItemAge((long) (short) 0);
        java.util.Collection collection43 = timeSeries37.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries8.addAndOrUpdate(timeSeries37);
        int int45 = timeSeries37.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener48 = null;
        timeSeries47.addChangeListener(seriesChangeListener48);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries37.addAndOrUpdate(timeSeries47);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener51);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries50);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries15.addAndOrUpdate(timeSeries20);
        java.util.Collection collection23 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod24, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, "hi!", "Overwritten values from:  ");
        int int4 = timeSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries31.fireSeriesChanged();
        boolean boolean35 = timeSeries31.isEmpty();
        int int36 = timeSeries31.getMaximumItemCount();
        long long37 = timeSeries31.getMaximumItemAge();
        timeSeries31.setMaximumItemCount((int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 9223372036854775807L + "'", long37 == 9223372036854775807L);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setNotify(true);
        boolean boolean14 = timeSeries10.isEmpty();
        java.lang.String str15 = timeSeries10.getDomainDescription();
        int int16 = timeSeries10.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        long long10 = timeSeries3.getMaximumItemAge();
        long long11 = timeSeries3.getMaximumItemAge();
        java.lang.Object obj12 = timeSeries3.clone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 0 + "'", comparable7, (short) 0);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        boolean boolean9 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        boolean boolean14 = timeSeries3.isEmpty();
        java.util.List list15 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((-1), (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.Class class16 = timeSeries8.getTimePeriodClass();
        timeSeries8.clear();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries21.removeAgedItems(100L, false);
        java.lang.String str25 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double32 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double37 = timeSeries36.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries31.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double48 = timeSeries47.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries42.addAndOrUpdate(timeSeries47);
        java.util.Collection collection50 = timeSeries38.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        java.util.Collection collection51 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        timeSeries49.fireSeriesChanged();
        boolean boolean53 = timeSeries49.isEmpty();
        int int54 = timeSeries49.getMaximumItemCount();
        boolean boolean55 = timeSeries8.equals((java.lang.Object) timeSeries49);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries49.removeChangeListener(seriesChangeListener56);
        timeSeries49.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = null;
        java.lang.Number number61 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries49.add(regularTimePeriod60, number61, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries14.setMaximumItemAge(10L);
        timeSeries14.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.lang.String str20 = timeSeries19.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener25);
        java.lang.Comparable comparable27 = timeSeries24.getKey();
        timeSeries24.setRangeDescription("");
        timeSeries24.setRangeDescription("");
        timeSeries24.removeAgedItems((long) (byte) 0, false);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries19.addAndOrUpdate(timeSeries24);
        timeSeries24.setNotify(true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + ' ' + "'", comparable27, ' ');
        org.junit.Assert.assertNotNull(timeSeries35);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        timeSeries3.removeAgedItems(false);
        int int17 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(10L, false);
        timeSeries3.setNotify(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        timeSeries1.fireSeriesChanged();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries1.getValue(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries3.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems((long) 10, false);
        timeSeries3.setDomainDescription("Overwritten values from:  ");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount((int) (byte) 1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = timeSeries3.getItems();
        timeSeries3.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (java.lang.Number) Double.NaN, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setNotify(true);
        int int16 = timeSeries8.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        timeSeries28.clear();
        timeSeries28.setNotify(false);
        timeSeries28.setMaximumItemCount((int) 'a');
        timeSeries28.fireSeriesChanged();
        double double35 = timeSeries28.getMaxY();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries28.removePropertyChangeListener(propertyChangeListener36);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries28.addChangeListener(seriesChangeListener38);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.List list12 = timeSeries10.getItems();
        java.lang.String str13 = timeSeries10.getDescription();
        timeSeries10.clear();
        java.lang.Class<?> wildcardClass15 = timeSeries10.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) (short) -1);
        timeSeries3.removeAgedItems((-1L), true);
        long long10 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(false);
        java.lang.String str12 = timeSeries3.getDescription();
        java.lang.Object obj13 = timeSeries3.clone();
        int int14 = timeSeries3.getMaximumItemCount();
        java.lang.String str15 = timeSeries3.getDomainDescription();
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("");
        timeSeries3.fireSeriesChanged();
        timeSeries3.setKey((java.lang.Comparable) 0L);
        java.lang.String str15 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount(10);
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        long long10 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str15 = timeSeries14.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener16);
        timeSeries14.fireSeriesChanged();
        timeSeries14.setMaximumItemAge((long) (short) 1);
        java.util.List list21 = timeSeries14.getItems();
        boolean boolean22 = timeSeries3.equals((java.lang.Object) list21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setKey((java.lang.Comparable) "Overwritten values from:  ");
        long long5 = timeSeries1.getMaximumItemAge();
        double double6 = timeSeries1.getMaxY();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries10.isEmpty();
        timeSeries10.setDomainDescription("Overwritten values from:  ");
        boolean boolean32 = timeSeries10.isEmpty();
        timeSeries10.fireSeriesChanged();
        java.lang.String str34 = timeSeries10.getDomainDescription();
        timeSeries10.setKey((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Overwritten values from:  " + "'", str34, "Overwritten values from:  ");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.Class class16 = timeSeries8.getTimePeriodClass();
        timeSeries8.clear();
        java.lang.String str18 = timeSeries8.getDescription();
        timeSeries8.removeAgedItems(true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries8.removeChangeListener(seriesChangeListener21);
        timeSeries8.removeAgedItems((long) (short) 100, false);
        timeSeries8.setMaximumItemAge((long) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries8.addOrUpdate(regularTimePeriod28, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.List list12 = timeSeries10.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries10.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        timeSeries3.clear();
        java.lang.Class class47 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNull(class47);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems((long) '4', false);
        java.util.Collection collection25 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        java.lang.Comparable comparable26 = timeSeries10.getKey();
        timeSeries10.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener29);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "Overwritten values from:  " + "'", comparable26, "Overwritten values from:  ");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries19.removeAgedItems(100L, false);
        java.lang.String str23 = timeSeries19.getRangeDescription();
        double double24 = timeSeries19.getMaxY();
        double double25 = timeSeries19.getMinY();
        java.lang.Object obj26 = timeSeries19.clone();
        timeSeries19.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries10.addAndOrUpdate(timeSeries19);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries19.addChangeListener(seriesChangeListener30);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        boolean boolean34 = timeSeries31.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener35);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = timeSeries31.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries14.setMaximumItemAge(10L);
        timeSeries14.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int24 = timeSeries23.getItemCount();
        java.util.Collection collection25 = timeSeries23.getTimePeriods();
        java.lang.Object obj26 = timeSeries23.clone();
        timeSeries23.removeAgedItems((long) (byte) 10, false);
        int int30 = timeSeries23.getMaximumItemCount();
        boolean boolean31 = timeSeries19.equals((java.lang.Object) timeSeries23);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries23.addChangeListener(seriesChangeListener32);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(timeSeriesDataItem34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double50 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries49.addAndOrUpdate(timeSeries54);
        timeSeries54.setDomainDescription("hi!");
        timeSeries54.setRangeDescription("");
        boolean boolean61 = timeSeries3.equals((java.lang.Object) timeSeries54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number63 = timeSeries3.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries14.setMaximumItemAge(10L);
        timeSeries14.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries14);
        timeSeries10.setDomainDescription("Overwritten values from:  ");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems((long) '4', false);
        java.util.Collection collection25 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        java.lang.Comparable comparable26 = timeSeries10.getKey();
        timeSeries10.removeAgedItems((long) (short) 100, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update(regularTimePeriod30, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "Overwritten values from:  " + "'", comparable26, "Overwritten values from:  ");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN, "hi!", "Overwritten values from:  ");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener23);
        java.lang.Object obj25 = timeSeries10.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod26, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems((long) '4', false);
        java.util.Collection collection25 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        timeSeries16.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.delete(0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (java.lang.Number) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Value");
        boolean boolean4 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries10.isEmpty();
        int int30 = timeSeries10.getMaximumItemCount();
        long long31 = timeSeries10.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        timeSeries8.removeAgedItems(1L, true);
        timeSeries8.setMaximumItemAge((long) 1);
        double double21 = timeSeries8.getMinY();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener26);
        double double28 = timeSeries25.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries25.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries8.addAndOrUpdate(timeSeries25);
        java.lang.String str32 = timeSeries31.getDomainDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Overwritten values from:  ");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        java.util.Collection collection11 = timeSeries3.getTimePeriods();
        int int12 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "hi!", "Time");
        java.lang.Object obj4 = timeSeries3.clone();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        double double6 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        int int15 = timeSeries10.getMaximumItemCount();
        double double16 = timeSeries10.getMinY();
        java.lang.Object obj17 = timeSeries10.clone();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries10.isEmpty();
        timeSeries10.setDomainDescription("Overwritten values from:  ");
        boolean boolean32 = timeSeries10.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        java.lang.Number number34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod33, number34, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        timeSeries3.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.lang.Comparable comparable23 = timeSeries20.getKey();
        timeSeries20.removeAgedItems(100L, true);
        timeSeries20.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries20.removeChangeListener(seriesChangeListener29);
        timeSeries20.removeAgedItems((long) 100, true);
        java.lang.Class class34 = timeSeries20.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries3.addAndOrUpdate(timeSeries20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(regularTimePeriod36, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(timeSeries35);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ");
        timeSeries1.setKey((java.lang.Comparable) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        timeSeries1.setMaximumItemAge((long) 2147483647);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        double double10 = timeSeries1.getMaxY();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setRangeDescription("");
        timeSeries8.setDomainDescription("Value");
        double double17 = timeSeries8.getMaxY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.util.List list7 = timeSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.setRangeDescription("");
        timeSeries1.setDescription("Overwritten values from:  ");
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(1L, false);
        java.lang.String str14 = timeSeries3.getDescription();
        double double15 = timeSeries3.getMinY();
        double double16 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod17, (java.lang.Number) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "", "hi!");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        timeSeries7.removeAgedItems(100L, true);
        timeSeries7.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener16);
        java.util.Collection collection18 = timeSeries7.getTimePeriods();
        boolean boolean19 = timeSeries3.equals((java.lang.Object) timeSeries7);
        double double20 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener25);
        double double27 = timeSeries24.getMaxY();
        timeSeries24.removeAgedItems(true);
        timeSeries24.removeAgedItems((long) 10, false);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        timeSeries3.setKey((java.lang.Comparable) 0L);
        java.lang.Comparable comparable36 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod37, (java.lang.Number) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + ' ' + "'", comparable10, ' ');
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + 0L + "'", comparable36, 0L);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries26.isEmpty();
        java.lang.Class class30 = timeSeries26.getTimePeriodClass();
        timeSeries26.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod32, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(class30);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        double double10 = timeSeries3.getMaxY();
        java.lang.String str11 = timeSeries3.getRangeDescription();
        int int12 = timeSeries3.getMaximumItemCount();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setRangeDescription("Overwritten values from:  ");
        int int13 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries17.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.addChangeListener(seriesChangeListener20);
        int int22 = timeSeries17.getItemCount();
        boolean boolean23 = timeSeries10.equals((java.lang.Object) int22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double33 = timeSeries32.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries27.addAndOrUpdate(timeSeries32);
        timeSeries34.setDomainDescription("");
        timeSeries34.setKey((java.lang.Comparable) 1);
        boolean boolean39 = timeSeries34.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries43.removePropertyChangeListener(propertyChangeListener44);
        java.lang.Comparable comparable46 = timeSeries43.getKey();
        timeSeries43.removeAgedItems(100L, true);
        timeSeries43.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries43.removeChangeListener(seriesChangeListener52);
        long long54 = timeSeries43.getMaximumItemAge();
        timeSeries43.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries34.addAndOrUpdate(timeSeries43);
        double double58 = timeSeries34.getMinY();
        boolean boolean59 = timeSeries10.equals((java.lang.Object) double58);
        java.lang.String str60 = timeSeries10.getDescription();
        timeSeries10.fireSeriesChanged();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + ' ' + "'", comparable46, ' ');
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 9223372036854775807L + "'", long54 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        timeSeries3.removeAgedItems((long) 2147483647, false);
        timeSeries3.setRangeDescription("Overwritten values from: Overwritten values from:  ");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries15.addAndOrUpdate(timeSeries20);
        double double23 = timeSeries22.getMinY();
        boolean boolean24 = timeSeries22.getNotify();
        timeSeries22.setDomainDescription("hi!");
        java.util.Collection collection27 = timeSeries22.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries3.addAndOrUpdate(timeSeries22);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ", "hi!", "Time");
        timeSeries3.setRangeDescription("Overwritten values from:  ");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double50 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries49.addAndOrUpdate(timeSeries54);
        java.lang.Comparable comparable57 = timeSeries54.getKey();
        timeSeries54.clear();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries54);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries59.removeChangeListener(seriesChangeListener60);
        java.lang.Object obj62 = timeSeries59.clone();
        boolean boolean63 = timeSeries59.getNotify();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + ' ' + "'", comparable57, ' ');
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries15.setRangeDescription("hi!");
        timeSeries15.clear();
        long long19 = timeSeries15.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setNotify(true);
        boolean boolean14 = timeSeries10.isEmpty();
        java.lang.String str15 = timeSeries10.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries10.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.addOrUpdate(regularTimePeriod6, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) '4', 2147483647);
        java.lang.Class class16 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("");
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries16.removeAgedItems(100L, false);
        java.lang.String str20 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double32 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.addAndOrUpdate(timeSeries31);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries37.addAndOrUpdate(timeSeries42);
        java.util.Collection collection45 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        java.util.Collection collection46 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        long long47 = timeSeries44.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries44.createCopy(10, (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries3.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = timeSeries51.addOrUpdate(regularTimePeriod52, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 9223372036854775807L + "'", long47 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(timeSeries51);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        timeSeries3.clear();
        double double8 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.setRangeDescription("Value");
        timeSeries3.setMaximumItemAge((long) 2147483647);
        java.lang.String str38 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        timeSeries3.removeAgedItems(false);
        int int17 = timeSeries3.getMaximumItemCount();
        java.lang.Class class18 = timeSeries3.getTimePeriodClass();
        timeSeries3.setNotify(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(class18);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "", "hi!");
        double double4 = timeSeries3.getMinY();
        timeSeries3.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries10.removeAgedItems(100L, false);
        java.lang.String str14 = timeSeries10.getRangeDescription();
        java.util.Collection collection15 = timeSeries10.getTimePeriods();
        java.lang.Comparable comparable16 = timeSeries10.getKey();
        timeSeries10.setNotify(false);
        timeSeries10.setDescription("");
        boolean boolean21 = timeSeries3.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + ' ' + "'", comparable16, ' ');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str2 = timeSeries1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems(1L, false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        timeSeries19.removeAgedItems(100L, true);
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries19.removeChangeListener(seriesChangeListener28);
        long long30 = timeSeries19.getMaximumItemAge();
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries10.addAndOrUpdate(timeSeries19);
        double double34 = timeSeries10.getMinY();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double39 = timeSeries38.getMaxY();
        boolean boolean40 = timeSeries38.getNotify();
        timeSeries38.removeAgedItems((long) (byte) 1, false);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries10.addAndOrUpdate(timeSeries38);
        timeSeries10.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        java.lang.Number number48 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod47, number48, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(timeSeries44);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        timeSeries3.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.lang.Comparable comparable23 = timeSeries20.getKey();
        timeSeries20.removeAgedItems(100L, true);
        timeSeries20.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries20.removeChangeListener(seriesChangeListener29);
        timeSeries20.removeAgedItems((long) 100, true);
        java.lang.Class class34 = timeSeries20.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries3.addAndOrUpdate(timeSeries20);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries39.setDescription("");
        timeSeries39.clear();
        java.lang.String str43 = timeSeries39.getDomainDescription();
        java.util.List list44 = timeSeries39.getItems();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries48.removePropertyChangeListener(propertyChangeListener49);
        java.lang.Comparable comparable51 = timeSeries48.getKey();
        java.lang.String str52 = timeSeries48.getRangeDescription();
        java.util.Collection collection53 = timeSeries39.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        boolean boolean54 = timeSeries20.equals((java.lang.Object) timeSeries39);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + ' ' + "'", comparable51, ' ');
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries17.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.addChangeListener(seriesChangeListener20);
        int int22 = timeSeries17.getItemCount();
        boolean boolean23 = timeSeries10.equals((java.lang.Object) int22);
        timeSeries10.setRangeDescription("Overwritten values from:  ");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries15.addAndOrUpdate(timeSeries20);
        java.util.Collection collection23 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.clear();
        java.lang.String str25 = timeSeries15.getDescription();
        java.lang.String str26 = timeSeries15.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double36 = timeSeries35.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.addAndOrUpdate(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double42 = timeSeries41.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double47 = timeSeries46.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries41.addAndOrUpdate(timeSeries46);
        java.util.Collection collection49 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries15.addAndOrUpdate(timeSeries48);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries53 = timeSeries15.createCopy(regularTimePeriod51, regularTimePeriod52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(timeSeries50);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        long long10 = timeSeries3.getMaximumItemAge();
        timeSeries3.setKey((java.lang.Comparable) (-1));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        timeSeries3.setKey((java.lang.Comparable) 0.0f);
        timeSeries3.removeAgedItems(0L, true);
        java.lang.String str19 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, "hi!", "Value");
        java.lang.String str4 = timeSeries3.getDescription();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        java.lang.Comparable comparable10 = timeSeries3.getKey();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + ' ' + "'", comparable10, ' ');
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setNotify(false);
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries3.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries10.isEmpty();
        java.lang.String str30 = timeSeries10.getDescription();
        timeSeries10.setMaximumItemAge((long) '#');
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double37 = timeSeries36.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double42 = timeSeries41.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries36.addAndOrUpdate(timeSeries41);
        timeSeries41.setDomainDescription("hi!");
        java.util.List list46 = timeSeries41.getItems();
        timeSeries41.setRangeDescription("");
        java.lang.String str49 = timeSeries41.getDescription();
        java.util.Collection collection50 = timeSeries41.getTimePeriods();
        timeSeries41.removeAgedItems((long) ' ', false);
        java.util.Collection collection54 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        java.util.Collection collection55 = timeSeries41.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(collection55);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries10.isEmpty();
        java.lang.String str30 = timeSeries10.getDescription();
        timeSeries10.setMaximumItemAge((long) '#');
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double37 = timeSeries36.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double42 = timeSeries41.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries36.addAndOrUpdate(timeSeries41);
        timeSeries41.setDomainDescription("hi!");
        java.util.List list46 = timeSeries41.getItems();
        timeSeries41.setRangeDescription("");
        java.lang.String str49 = timeSeries41.getDescription();
        java.util.Collection collection50 = timeSeries41.getTimePeriods();
        timeSeries41.removeAgedItems((long) ' ', false);
        java.util.Collection collection54 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        java.util.List list55 = timeSeries41.getItems();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(list55);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries11.removeAgedItems(100L, false);
        int int15 = timeSeries11.getItemCount();
        java.lang.String str16 = timeSeries11.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.lang.Comparable comparable23 = timeSeries20.getKey();
        timeSeries20.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries11.addAndOrUpdate(timeSeries20);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries28.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries28.addChangeListener(seriesChangeListener31);
        java.lang.String str33 = timeSeries28.getRangeDescription();
        java.util.Collection collection34 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        boolean boolean35 = timeSeries1.equals((java.lang.Object) timeSeries28);
        java.util.List list36 = timeSeries28.getItems();
        java.lang.Class<?> wildcardClass37 = list36.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries10.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj13 = timeSeries10.clone();
        java.util.Collection collection14 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.createCopy((int) (byte) 1, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries17.getDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = timeSeries12.getKey();
        timeSeries12.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.addAndOrUpdate(timeSeries12);
        timeSeries18.removeAgedItems((long) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.delete(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries14.setMaximumItemAge(10L);
        timeSeries14.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.List list20 = timeSeries19.getItems();
        int int21 = timeSeries19.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        int int16 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries20.removeAgedItems(100L, false);
        int int24 = timeSeries20.getItemCount();
        java.lang.String str25 = timeSeries20.getDescription();
        boolean boolean26 = timeSeries10.equals((java.lang.Object) timeSeries20);
        java.lang.Object obj27 = timeSeries20.clone();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "", "Overwritten values from:  ");
        java.lang.Class<?> wildcardClass4 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries10.isEmpty();
        timeSeries10.setDomainDescription("Overwritten values from:  ");
        int int32 = timeSeries10.getMaximumItemCount();
        java.lang.Comparable comparable33 = timeSeries10.getKey();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + "Overwritten values from:  " + "'", comparable33, "Overwritten values from:  ");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDomainDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        int int15 = timeSeries10.getMaximumItemCount();
        double double16 = timeSeries10.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener17);
        timeSeries10.setDomainDescription("");
        long long21 = timeSeries10.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge((long) (short) 10);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy((int) ' ', 97);
        java.util.List list16 = timeSeries3.getItems();
        double double17 = timeSeries3.getMaxY();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.List list12 = timeSeries10.getItems();
        java.lang.String str13 = timeSeries10.getDescription();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        java.util.Collection collection18 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.clear();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener15);
        java.lang.String str17 = timeSeries8.getDescription();
        java.lang.Comparable comparable18 = timeSeries8.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeSeries8.getIndex(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + ' ' + "'", comparable18, ' ');
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems((long) '4', false);
        java.util.Collection collection25 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        java.util.Collection collection26 = timeSeries10.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        timeSeries19.removeAgedItems(100L, true);
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries19.removeChangeListener(seriesChangeListener28);
        long long30 = timeSeries19.getMaximumItemAge();
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries10.addAndOrUpdate(timeSeries19);
        double double34 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double39 = timeSeries38.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double44 = timeSeries43.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries38.addAndOrUpdate(timeSeries43);
        timeSeries43.setDomainDescription("hi!");
        java.util.List list48 = timeSeries43.getItems();
        timeSeries43.setRangeDescription("");
        java.lang.Class class51 = timeSeries43.getTimePeriodClass();
        timeSeries43.clear();
        java.lang.Object obj53 = timeSeries43.clone();
        double double54 = timeSeries43.getMaxY();
        timeSeries43.removeAgedItems((long) 100, false);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries10.addAndOrUpdate(timeSeries43);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNull(class51);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(timeSeries58);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#');
        boolean boolean2 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        java.lang.String str16 = timeSeries14.getRangeDescription();
        java.lang.String str17 = timeSeries14.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "", "hi!");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        long long2 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries6.addAndOrUpdate(timeSeries11);
        timeSeries11.setDomainDescription("hi!");
        java.util.List list16 = timeSeries11.getItems();
        timeSeries11.setRangeDescription("");
        java.lang.Class class19 = timeSeries11.getTimePeriodClass();
        timeSeries11.clear();
        java.lang.String str21 = timeSeries11.getDescription();
        timeSeries11.removeAgedItems(true);
        boolean boolean24 = timeSeries11.getNotify();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries1.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod26, (java.lang.Number) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "", "");
        int int4 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.Class class16 = timeSeries8.getTimePeriodClass();
        timeSeries8.clear();
        java.lang.String str18 = timeSeries8.getDescription();
        timeSeries8.removeAgedItems(true);
        java.lang.Class class21 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod22, (java.lang.Number) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.Class class16 = timeSeries8.getTimePeriodClass();
        timeSeries8.clear();
        java.lang.String str18 = timeSeries8.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        timeSeries8.removeAgedItems(1L, true);
        timeSeries8.setMaximumItemAge((long) 1);
        double double21 = timeSeries8.getMinY();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener26);
        double double28 = timeSeries25.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries25.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries8.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries25.addOrUpdate(regularTimePeriod32, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 100, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f);
        timeSeries1.setRangeDescription("Overwritten values from:  ");
        java.lang.Object obj4 = timeSeries1.clone();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        timeSeries28.setDescription("");
        double double31 = timeSeries28.getMaxY();
        timeSeries28.setMaximumItemAge((long) (short) 0);
        int int34 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete(regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        int int5 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        double double2 = timeSeries1.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        timeSeries7.clear();
        java.util.Collection collection10 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries3.addChangeListener(seriesChangeListener17);
        java.lang.String str19 = timeSeries3.getRangeDescription();
        timeSeries3.setRangeDescription("Overwritten values from:  ");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        timeSeries28.setDescription("");
        double double31 = timeSeries28.getMaxY();
        int int32 = timeSeries28.getItemCount();
        java.util.Collection collection33 = timeSeries28.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        timeSeries28.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries28.createCopy((int) (byte) 0, (int) (byte) 100);
        double double33 = timeSeries28.getMinY();
        java.util.List list34 = timeSeries28.getItems();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries6.addAndOrUpdate(timeSeries11);
        double double14 = timeSeries13.getMinY();
        java.util.List list15 = timeSeries13.getItems();
        java.lang.String str16 = timeSeries13.getDescription();
        timeSeries13.clear();
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double50 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries49.addAndOrUpdate(timeSeries54);
        java.lang.Comparable comparable57 = timeSeries54.getKey();
        timeSeries54.clear();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries54);
        timeSeries59.setDomainDescription("Time");
        boolean boolean62 = timeSeries59.isEmpty();
        boolean boolean63 = timeSeries59.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        timeSeries59.removePropertyChangeListener(propertyChangeListener64);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod66 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries59.add(regularTimePeriod66, (java.lang.Number) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + ' ' + "'", comparable57, ' ');
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        timeSeries19.removeAgedItems(100L, true);
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries19.removeChangeListener(seriesChangeListener28);
        long long30 = timeSeries19.getMaximumItemAge();
        timeSeries19.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries10.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.add(regularTimePeriod34, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        boolean boolean4 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        timeSeries3.setNotify(false);
        timeSeries3.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries11.removeAgedItems(100L, false);
        int int15 = timeSeries11.getItemCount();
        java.lang.String str16 = timeSeries11.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.lang.Comparable comparable23 = timeSeries20.getKey();
        timeSeries20.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries11.addAndOrUpdate(timeSeries20);
        boolean boolean27 = timeSeries26.isEmpty();
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries26.setMaximumItemAge((long) 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("");
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries16.removeAgedItems(100L, false);
        java.lang.String str20 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double32 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.addAndOrUpdate(timeSeries31);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries37.addAndOrUpdate(timeSeries42);
        java.util.Collection collection45 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        java.util.Collection collection46 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        long long47 = timeSeries44.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries44.createCopy(10, (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries3.addAndOrUpdate(timeSeries44);
        double double52 = timeSeries44.getMinY();
        timeSeries44.setKey((java.lang.Comparable) '4');
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Overwritten values from:  ", "Time");
        boolean boolean59 = timeSeries44.equals((java.lang.Object) "Overwritten values from:  ");
        timeSeries44.setMaximumItemCount((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 9223372036854775807L + "'", long47 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.fireSeriesChanged();
        double double9 = timeSeries1.getMaxY();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 0 + "'", comparable7, (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "Value");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        timeSeries3.setDescription("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from:  ", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.List list12 = timeSeries10.getItems();
        timeSeries10.clear();
        java.lang.String str14 = timeSeries10.getDomainDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDescription("");
        int int13 = timeSeries10.getMaximumItemCount();
        timeSeries10.clear();
        timeSeries10.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries21.setDescription("hi!");
        java.lang.String str24 = timeSeries21.getDomainDescription();
        double double25 = timeSeries21.getMaxY();
        java.util.Collection collection26 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries21.getDataItem(regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "Overwritten values from:  ", "Overwritten values from:  ");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.String str16 = timeSeries8.getDescription();
        java.util.Collection collection17 = timeSeries8.getTimePeriods();
        timeSeries8.removeAgedItems((long) '4', false);
        java.lang.Class class21 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod22, (double) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries31.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries31.add(timeSeriesDataItem35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.lang.Comparable comparable5 = timeSeries3.getKey();
        long long6 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.removeChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        timeSeries12.setNotify(false);
        int int15 = timeSeries12.getMaximumItemCount();
        timeSeries12.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.addAndOrUpdate(timeSeries12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.addOrUpdate(regularTimePeriod19, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 100L + "'", comparable5, 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(1L, false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.lang.String str20 = timeSeries17.getDomainDescription();
        java.util.Collection collection21 = timeSeries17.getTimePeriods();
        boolean boolean22 = timeSeries3.equals((java.lang.Object) collection21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeSeries3.getIndex(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setKey((java.lang.Comparable) 1.0f);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setDescription("Time");
        timeSeries1.setDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        timeSeries1.removeAgedItems((long) 10, true);
        java.lang.String str5 = timeSeries1.getDomainDescription();
        timeSeries1.setRangeDescription("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        java.lang.Object obj10 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        timeSeries21.removeAgedItems((long) (short) -1, false);
        boolean boolean25 = timeSeries21.getNotify();
        timeSeries21.setDomainDescription("Value");
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        java.lang.String str29 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(0, (int) ' ');
        timeSeries1.clear();
        java.util.List list8 = timeSeries1.getItems();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries17.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.addChangeListener(seriesChangeListener20);
        int int22 = timeSeries17.getItemCount();
        boolean boolean23 = timeSeries10.equals((java.lang.Object) int22);
        java.lang.String str24 = timeSeries10.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        timeSeries28.removeAgedItems((long) 100, false);
        timeSeries28.removeAgedItems(false);
        int int35 = timeSeries28.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries10.addAndOrUpdate(timeSeries28);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries36);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        timeSeries3.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries16.removeAgedItems(100L, false);
        java.lang.String str20 = timeSeries16.getRangeDescription();
        double double21 = timeSeries16.getMinY();
        int int22 = timeSeries16.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries16.removeChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries8.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean29 = timeSeries27.equals((java.lang.Object) (-1L));
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.createCopy((int) (short) 1, 100);
        boolean boolean33 = timeSeries25.equals((java.lang.Object) timeSeries32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = timeSeries25.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        boolean boolean20 = timeSeries3.equals((java.lang.Object) comparable19);
        timeSeries3.setKey((java.lang.Comparable) (short) 10);
        timeSeries3.setMaximumItemAge((long) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Overwritten values from:  ", "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener15);
        java.lang.String str17 = timeSeries3.getDescription();
        java.util.Collection collection18 = timeSeries3.getTimePeriods();
        timeSeries3.clear();
        java.lang.Class class20 = timeSeries3.getTimePeriodClass();
        timeSeries3.clear();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(class20);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "Overwritten values from: Overwritten values from:  ", "Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.setRangeDescription("Value");
        timeSeries3.setDescription("Value");
        int int38 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class43 = timeSeries42.getTimePeriodClass();
        double double44 = timeSeries42.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries42.addChangeListener(seriesChangeListener45);
        timeSeries42.setMaximumItemCount((int) (short) 100);
        java.util.Collection collection49 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        timeSeries42.removeAgedItems(0L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int54 = timeSeries42.getIndex(regularTimePeriod53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        double double10 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.addAndOrUpdate(timeSeries9);
        int int12 = timeSeries11.getItemCount();
        java.lang.String str13 = timeSeries11.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        timeSeries28.clear();
        timeSeries28.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener36);
        double double38 = timeSeries35.getMaxY();
        java.lang.String str39 = timeSeries35.getDescription();
        java.lang.Object obj40 = timeSeries35.clone();
        java.util.Collection collection41 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number43 = timeSeries28.getValue(regularTimePeriod42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.lang.Comparable comparable5 = timeSeries3.getKey();
        long long6 = timeSeries3.getMaximumItemAge();
        java.util.List list7 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, (java.lang.Number) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 100L + "'", comparable5, 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "", "hi!");
        boolean boolean4 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries14.getMinY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries20.removeAgedItems(100L, false);
        java.lang.String str24 = timeSeries20.getRangeDescription();
        int int25 = timeSeries20.getMaximumItemCount();
        java.util.Collection collection26 = timeSeries20.getTimePeriods();
        java.lang.Class class27 = timeSeries20.getTimePeriodClass();
        java.lang.Comparable comparable28 = timeSeries20.getKey();
        java.util.Collection collection29 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + ' ' + "'", comparable28, ' ');
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        timeSeries8.removeAgedItems(1L, true);
        long long19 = timeSeries8.getMaximumItemAge();
        timeSeries8.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "", "hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries9.setNotify(false);
        boolean boolean12 = timeSeries3.equals((java.lang.Object) false);
        timeSeries3.setMaximumItemAge(1L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "", "hi!");
        timeSeries3.setRangeDescription("");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "Overwritten values from:  ");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries7.removeAgedItems(100L, false);
        java.lang.String str11 = timeSeries7.getRangeDescription();
        timeSeries7.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double29 = timeSeries28.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double34 = timeSeries33.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries28.addAndOrUpdate(timeSeries33);
        java.util.Collection collection36 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        java.util.Collection collection37 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        boolean boolean38 = timeSeries35.isEmpty();
        java.util.Collection collection39 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        boolean boolean40 = timeSeries35.isEmpty();
        int int41 = timeSeries35.getItemCount();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        java.lang.String str4 = timeSeries1.getDomainDescription();
        double double5 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        java.lang.String str15 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemAge(9223372036854775807L);
        timeSeries3.setNotify(true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries3.setRangeDescription("Overwritten values from: Overwritten values from:  ");
        long long13 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("hi!");
        timeSeries3.setKey((java.lang.Comparable) 10.0f);
        int int11 = timeSeries3.getItemCount();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDomainDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Value");
        boolean boolean4 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod5, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        long long34 = timeSeries31.getMaximumItemAge();
        java.lang.String str35 = timeSeries31.getDescription();
        int int36 = timeSeries31.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries14.setMaximumItemAge(10L);
        timeSeries14.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries14);
        int int20 = timeSeries19.getItemCount();
        java.lang.String str21 = timeSeries19.getDomainDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Time" + "'", str21, "Time");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems((long) '4', false);
        java.util.Collection collection25 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        timeSeries10.setKey((java.lang.Comparable) false);
        timeSeries10.fireSeriesChanged();
        java.lang.Class class29 = timeSeries10.getTimePeriodClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(class29);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "", "Time");
        timeSeries3.setKey((java.lang.Comparable) (byte) 100);
        timeSeries3.setDescription("");
        timeSeries3.setMaximumItemCount((int) (byte) 0);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod8, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        boolean boolean29 = timeSeries10.isEmpty();
        timeSeries10.setDomainDescription("Overwritten values from:  ");
        boolean boolean32 = timeSeries10.isEmpty();
        timeSeries10.fireSeriesChanged();
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries10.addOrUpdate(timeSeriesDataItem35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.setDescription("hi!");
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        timeSeries1.clear();
        timeSeries1.removeAgedItems(true);
        timeSeries1.setRangeDescription("Time");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        boolean boolean7 = timeSeries3.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems((long) ' ', false);
        java.lang.String str14 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries10.addChangeListener(seriesChangeListener23);
        timeSeries10.setDescription("");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ", "hi!", "Time");
        boolean boolean4 = timeSeries3.getNotify();
        long long5 = timeSeries3.getMaximumItemAge();
        timeSeries3.setKey((java.lang.Comparable) "Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.clear();
        double double8 = timeSeries1.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.setNotify(false);
        timeSeries1.setMaximumItemCount((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge((long) (short) 10);
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDomainDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries3.removeChangeListener(seriesChangeListener19);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries3.addOrUpdate(timeSeriesDataItem21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener10);
        double double12 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        timeSeries28.setDescription("");
        double double31 = timeSeries28.getMaxY();
        timeSeries28.removeAgedItems(true);
        int int34 = timeSeries28.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries28.removeChangeListener(seriesChangeListener35);
        java.util.List list37 = timeSeries28.getItems();
        int int38 = timeSeries28.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setMaximumItemAge((long) (short) 10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.clear();
        double double8 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries12.addAndOrUpdate(timeSeries17);
        timeSeries17.setMaximumItemAge(0L);
        boolean boolean22 = timeSeries1.equals((java.lang.Object) timeSeries17);
        java.lang.Object obj23 = timeSeries17.clone();
        java.lang.Comparable comparable24 = timeSeries17.getKey();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + ' ' + "'", comparable24, ' ');
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double17 = timeSeries16.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries16);
        timeSeries16.setDomainDescription("hi!");
        java.util.List list21 = timeSeries16.getItems();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems(true);
        timeSeries16.setNotify(true);
        boolean boolean28 = timeSeries3.equals((java.lang.Object) timeSeries16);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems(false);
        java.util.Collection collection12 = timeSeries3.getTimePeriods();
        timeSeries3.setDescription("Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        timeSeries16.setRangeDescription("");
        timeSeries16.removeAgedItems((long) '4', false);
        java.util.Collection collection25 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        java.lang.Comparable comparable26 = timeSeries10.getKey();
        timeSeries10.setRangeDescription("");
        java.lang.Class class29 = timeSeries10.getTimePeriodClass();
        int int30 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries34.removePropertyChangeListener(propertyChangeListener35);
        java.lang.Comparable comparable37 = timeSeries34.getKey();
        timeSeries34.removeAgedItems(100L, true);
        timeSeries34.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries34.removeChangeListener(seriesChangeListener43);
        long long45 = timeSeries34.getMaximumItemAge();
        timeSeries34.setDomainDescription("hi!");
        java.lang.String str48 = timeSeries34.getDomainDescription();
        java.lang.String str49 = timeSeries34.getDomainDescription();
        java.lang.String str50 = timeSeries34.getRangeDescription();
        java.util.Collection collection51 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        timeSeries34.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "Overwritten values from:  " + "'", comparable26, "Overwritten values from:  ");
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + ' ' + "'", comparable37, ' ');
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 9223372036854775807L + "'", long45 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.removeAgedItems(false);
        timeSeries3.setMaximumItemAge(0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries3.addOrUpdate(regularTimePeriod38, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        timeSeries3.setDomainDescription("Value");
        java.lang.String str6 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("hi!");
        double double15 = timeSeries10.getMinY();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((int) (short) 10, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        timeSeries18.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries10.addAndOrUpdate(timeSeries18);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        java.util.List list15 = timeSeries3.getItems();
        timeSeries3.setMaximumItemCount(0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries26);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        timeSeries28.setDomainDescription("Overwritten values from:  ");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.update(regularTimePeriod33, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener13);
        timeSeries10.setDescription("");
        double double17 = timeSeries10.getMinY();
        timeSeries10.removeAgedItems(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        boolean boolean14 = timeSeries3.isEmpty();
        timeSeries3.setRangeDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener17);
        timeSeries3.setMaximumItemAge((long) 1);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries13.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection32 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection33 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries3.setRangeDescription("Value");
        timeSeries3.setMaximumItemAge((long) 2147483647);
        java.lang.String str38 = timeSeries3.getRangeDescription();
        timeSeries3.setNotify(false);
        timeSeries3.clear();
        java.lang.Class class42 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
        org.junit.Assert.assertNull(class42);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        java.lang.Object obj6 = timeSeries3.clone();
        timeSeries3.removeAgedItems((long) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.createCopy(1, 10);
        java.lang.Class<?> wildcardClass17 = timeSeries16.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        timeSeries3.setDomainDescription("Value");
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        java.lang.Class class14 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("hi!");
        double double15 = timeSeries10.getMinY();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.createCopy(1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries18.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.Class class16 = timeSeries8.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        double double46 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries3.addOrUpdate(regularTimePeriod47, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries3.getDomainDescription();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        double double8 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(0L, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        long long5 = timeSeries4.getMaximumItemAge();
        timeSeries4.clear();
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setKey((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double50 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries49.addAndOrUpdate(timeSeries54);
        java.lang.Comparable comparable57 = timeSeries54.getKey();
        timeSeries54.clear();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries54);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries59.removeChangeListener(seriesChangeListener60);
        java.lang.Object obj62 = timeSeries59.clone();
        timeSeries59.setDomainDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + ' ' + "'", comparable57, ' ');
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        boolean boolean6 = timeSeries3.isEmpty();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        double double10 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.addAndOrUpdate(timeSeries9);
        timeSeries9.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod14, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        double double19 = timeSeries14.getMaxY();
        double double20 = timeSeries14.getMinY();
        java.lang.Object obj21 = timeSeries14.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.setDomainDescription("Value");
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries3.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double50 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries49.addAndOrUpdate(timeSeries54);
        java.lang.Comparable comparable57 = timeSeries54.getKey();
        timeSeries54.clear();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries54);
        timeSeries59.setDomainDescription("Time");
        boolean boolean62 = timeSeries59.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries59.add(regularTimePeriod63, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + ' ' + "'", comparable57, ' ');
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = timeSeries12.getKey();
        timeSeries12.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.addAndOrUpdate(timeSeries12);
        timeSeries18.removeAgedItems((long) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries18.getDataItem(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries3.getMinY();
        java.lang.Class class17 = timeSeries3.getTimePeriodClass();
        long long18 = timeSeries3.getMaximumItemAge();
        java.util.List list19 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ");
        timeSeries23.setKey((java.lang.Comparable) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener26);
        timeSeries23.setMaximumItemAge((long) 2147483647);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries23.addChangeListener(seriesChangeListener30);
        java.util.Collection collection32 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        timeSeries23.setDescription("");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) '#', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        timeSeries4.fireSeriesChanged();
        int int6 = timeSeries4.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries4.removeChangeListener(seriesChangeListener7);
        timeSeries4.setNotify(true);
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(1L, false);
        boolean boolean14 = timeSeries3.getNotify();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int20 = timeSeries19.getItemCount();
        java.util.Collection collection21 = timeSeries19.getTimePeriods();
        java.util.Collection collection22 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        timeSeries1.setDescription("");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        timeSeries1.setNotify(true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        timeSeries3.setKey((java.lang.Comparable) 100.0f);
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) -1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "Overwritten values from:  ", "Value");
        timeSeries3.clear();
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemAge((long) ' ');
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod14, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.lang.Comparable comparable18 = timeSeries15.getKey();
        timeSeries15.removeAgedItems(100L, true);
        timeSeries15.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries15.removeChangeListener(seriesChangeListener24);
        long long26 = timeSeries15.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.addAndOrUpdate(timeSeries15);
        timeSeries3.removeAgedItems(100L, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + ' ' + "'", comparable18, ' ');
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.removeAgedItems(10L, false);
        boolean boolean14 = timeSeries3.getNotify();
        java.util.List list15 = timeSeries3.getItems();
        long long16 = timeSeries3.getMaximumItemAge();
        timeSeries3.removeAgedItems(0L, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        java.util.Collection collection17 = timeSeries3.getTimePeriods();
        java.lang.Object obj18 = timeSeries3.clone();
        timeSeries3.setRangeDescription("Time");
        double double21 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems((long) 10, false);
        timeSeries3.setDomainDescription("Overwritten values from:  ");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries15.addAndOrUpdate(timeSeries20);
        timeSeries22.removeAgedItems((long) (short) -1, false);
        timeSeries22.removeAgedItems(true);
        java.lang.Class<?> wildcardClass28 = timeSeries22.getClass();
        boolean boolean29 = timeSeries3.equals((java.lang.Object) wildcardClass28);
        timeSeries3.removeAgedItems(true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems((long) 100, false);
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod24, (double) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries8.getValue(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.fireSeriesChanged();
        timeSeries3.setMaximumItemAge((long) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        int int19 = timeSeries18.getMaximumItemCount();
        java.util.Collection collection20 = timeSeries18.getTimePeriods();
        java.lang.Class<?> wildcardClass21 = collection20.getClass();
        boolean boolean22 = timeSeries3.equals((java.lang.Object) collection20);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        double double24 = timeSeries23.getMinY();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        timeSeries8.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod21, (double) 0.0f, true);
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
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        timeSeries8.setKey((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        double double32 = timeSeries21.getMaxY();
        long long33 = timeSeries21.getMaximumItemAge();
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
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        java.util.List list13 = timeSeries8.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries8.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        long long5 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries4.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        timeSeries28.setMaximumItemAge((long) '4');
        java.lang.Comparable comparable36 = timeSeries28.getKey();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + "Overwritten values from: Overwritten values from:  " + "'", comparable36, "Overwritten values from: Overwritten values from:  ");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "Value");
        long long4 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(true);
        timeSeries1.removeAgedItems((long) 100, true);
        long long11 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        timeSeries8.removeAgedItems(1L, true);
        timeSeries8.setMaximumItemAge(0L);
        timeSeries8.removeAgedItems((long) 2147483647, false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 0 + "'", comparable7, (short) 0);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        timeSeries3.removeAgedItems((long) 100, true);
        long long17 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        timeSeries42.removeAgedItems((long) (short) 0, false);
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
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int11 = timeSeries10.getItemCount();
        java.util.Collection collection12 = timeSeries10.getTimePeriods();
        java.lang.Object obj13 = timeSeries10.clone();
        int int14 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        timeSeries18.setKey((java.lang.Comparable) 10.0d);
        java.util.Collection collection22 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.util.Collection collection23 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod24, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        java.lang.Class class13 = timeSeries12.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries15.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries15.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries15.createCopy(0, 10);
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
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class50 = timeSeries49.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries33.addAndOrUpdate(timeSeries49);
        timeSeries51.setDescription("");
        double double54 = timeSeries51.getMaxY();
        timeSeries51.setMaximumItemAge((long) (short) 0);
        java.util.Collection collection57 = timeSeries51.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries22.addAndOrUpdate(timeSeries51);
        int int59 = timeSeries51.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries61.addChangeListener(seriesChangeListener62);
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries51.addAndOrUpdate(timeSeries61);
        boolean boolean65 = timeSeries12.equals((java.lang.Object) timeSeries51);
        int int66 = timeSeries51.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(class50);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        timeSeries3.setRangeDescription("Overwritten values from:  ");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.createCopy(regularTimePeriod37, regularTimePeriod38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        java.lang.Object obj34 = timeSeries24.clone();
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + ' ' + "'", comparable10, ' ');
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "Overwritten values from: Overwritten values from:  ", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = timeSeries3.getIndex(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 100, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.lang.Comparable comparable12 = timeSeries9.getKey();
        java.lang.String str13 = timeSeries9.getRangeDescription();
        java.lang.Object obj14 = timeSeries9.clone();
        boolean boolean15 = timeSeries3.equals((java.lang.Object) timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + ' ' + "'", comparable12, ' ');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries15.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = timeSeries15.getIndex(regularTimePeriod27);
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
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        double double19 = timeSeries8.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries8.addOrUpdate(regularTimePeriod20, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        java.lang.Comparable comparable39 = timeSeries3.getKey();
        java.util.Collection collection40 = timeSeries3.getTimePeriods();
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
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + ' ' + "'", comparable39, ' ');
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setDescription("Overwritten values from:  ");
        timeSeries3.setDomainDescription("");
        java.lang.String str15 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod16, (java.lang.Number) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Overwritten values from:  " + "'", str15, "Overwritten values from:  ");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems((long) '4', true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        timeSeries17.setMaximumItemCount((int) (short) 100);
        boolean boolean21 = timeSeries17.getNotify();
        timeSeries17.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries17.addAndOrUpdate(timeSeries25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener27);
        timeSeries17.removeAgedItems(false);
        int int31 = timeSeries17.getMaximumItemCount();
        boolean boolean32 = timeSeries3.equals((java.lang.Object) timeSeries17);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries3.removeChangeListener(seriesChangeListener33);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries3.addChangeListener(seriesChangeListener35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem61 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem61, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(0L, false);
        timeSeries3.setMaximumItemCount((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        timeSeries1.setDescription("");
        java.lang.String str6 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries8.addOrUpdate(regularTimePeriod22, (double) (-1L));
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
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        timeSeries3.setKey((java.lang.Comparable) '4');
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        timeSeries3.setMaximumItemAge((long) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + '4' + "'", comparable11, '4');
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        long long5 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries3.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "", "hi!");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries12);
        boolean boolean15 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = timeSeries1.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        timeSeries3.removeAgedItems(0L, true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        timeSeries8.setDescription("hi!");
        java.util.Collection collection26 = timeSeries8.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        double double41 = timeSeries14.getMaxY();
        timeSeries14.setMaximumItemAge((long) 0);
        timeSeries14.removeAgedItems(true);
        double double46 = timeSeries14.getMinY();
        timeSeries14.setDescription("");
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
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "Overwritten values from:  ", "Overwritten values from:  ");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        timeSeries7.removeAgedItems(100L, true);
        int int14 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems(1L, false);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int22 = timeSeries21.getItemCount();
        java.util.Collection collection23 = timeSeries21.getTimePeriods();
        timeSeries21.removeAgedItems((long) (short) -1, false);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries7.addAndOrUpdate(timeSeries21);
        timeSeries21.setMaximumItemCount((int) 'a');
        java.util.Collection collection30 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double35 = timeSeries34.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double40 = timeSeries39.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries34.addAndOrUpdate(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double46 = timeSeries45.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double51 = timeSeries50.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries45.addAndOrUpdate(timeSeries50);
        java.util.Collection collection53 = timeSeries41.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener54 = null;
        timeSeries41.addChangeListener(seriesChangeListener54);
        java.lang.String str56 = timeSeries41.getDomainDescription();
        boolean boolean57 = timeSeries21.equals((java.lang.Object) timeSeries41);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + ' ' + "'", comparable10, ' ');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Time" + "'", str56, "Time");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        boolean boolean9 = timeSeries1.equals((java.lang.Object) timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries8.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries3.removeChangeListener(seriesChangeListener41);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = timeSeries3.getIndex(regularTimePeriod43);
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
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) -1, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        java.lang.Class class13 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.lang.Comparable comparable20 = timeSeries17.getKey();
        timeSeries17.removeAgedItems(100L, true);
        timeSeries17.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries17.removeChangeListener(seriesChangeListener26);
        long long28 = timeSeries17.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener29);
        java.util.Collection collection31 = timeSeries17.getTimePeriods();
        java.lang.Object obj32 = timeSeries17.clone();
        timeSeries17.setRangeDescription("Time");
        boolean boolean35 = timeSeries8.equals((java.lang.Object) timeSeries17);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + ' ' + "'", comparable20, ' ');
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9223372036854775807L + "'", long28 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        timeSeries10.setMaximumItemCount(1);
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
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("hi!");
        long long13 = timeSeries10.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        boolean boolean9 = timeSeries3.getNotify();
        timeSeries3.setDescription("Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        java.lang.String str9 = timeSeries3.getDescription();
        int int10 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener15);
        java.lang.Comparable comparable17 = timeSeries14.getKey();
        timeSeries14.setRangeDescription("");
        timeSeries14.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries14.addAndOrUpdate(timeSeries25);
        timeSeries26.setRangeDescription("hi!");
        timeSeries26.clear();
        int int30 = timeSeries26.getMaximumItemCount();
        boolean boolean31 = timeSeries3.equals((java.lang.Object) timeSeries26);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + ' ' + "'", comparable17, ' ');
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries49.createCopy(100, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(timeSeries62);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        int int15 = timeSeries10.getMaximumItemCount();
        double double16 = timeSeries10.getMinY();
        java.lang.String str17 = timeSeries10.getDomainDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(regularTimePeriod31);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.removeChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries42.removeAgedItems(100L, false);
        java.lang.String str46 = timeSeries42.getRangeDescription();
        double double47 = timeSeries42.getMaxY();
        timeSeries42.setNotify(false);
        timeSeries42.setMaximumItemAge((long) ' ');
        java.lang.String str52 = timeSeries42.getDescription();
        timeSeries42.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries3.addAndOrUpdate(timeSeries42);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(timeSeries54);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        long long2 = timeSeries1.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, 97, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        java.util.Collection collection49 = timeSeries28.getTimePeriods();
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
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries10.getDataItem(regularTimePeriod20);
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
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        boolean boolean5 = timeSeries3.getNotify();
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.Object obj7 = timeSeries3.clone();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ");
        timeSeries1.setKey((java.lang.Comparable) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        timeSeries1.setMaximumItemCount(0);
        java.lang.Number number9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(0, number9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        java.lang.String str21 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries32.removeAgedItems((long) (short) -1, false);
        boolean boolean36 = timeSeries32.getNotify();
        timeSeries32.removeAgedItems((long) (-1), false);
        java.util.Collection collection40 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        timeSeries3.removeAgedItems(true);
        boolean boolean43 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        timeSeries10.clear();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries10.addChangeListener(seriesChangeListener20);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        java.lang.String str43 = timeSeries3.getRangeDescription();
        timeSeries3.setDomainDescription("Overwritten values from: Overwritten values from:  ");
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        boolean boolean26 = timeSeries16.getNotify();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries16.addAndOrUpdate(timeSeries28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = timeSeries29.getValue(0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        double double67 = timeSeries38.getMaxY();
        boolean boolean68 = timeSeries38.getNotify();
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
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        timeSeries3.removeAgedItems((long) 2147483647, false);
        long long10 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timeSeries3.getValue(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("");
        java.util.List list11 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount((int) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries28.removeChangeListener(seriesChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries38.setDescription("");
        timeSeries38.clear();
        java.lang.String str42 = timeSeries38.getDomainDescription();
        java.util.List list43 = timeSeries38.getItems();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries47.removeAgedItems(100L, false);
        java.lang.String str51 = timeSeries47.getRangeDescription();
        timeSeries47.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double58 = timeSeries57.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double63 = timeSeries62.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries57.addAndOrUpdate(timeSeries62);
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double69 = timeSeries68.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double74 = timeSeries73.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries68.addAndOrUpdate(timeSeries73);
        java.util.Collection collection76 = timeSeries64.getTimePeriodsUniqueToOtherSeries(timeSeries75);
        java.util.Collection collection77 = timeSeries47.getTimePeriodsUniqueToOtherSeries(timeSeries75);
        timeSeries75.fireSeriesChanged();
        boolean boolean79 = timeSeries75.isEmpty();
        boolean boolean80 = timeSeries75.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries81 = timeSeries38.addAndOrUpdate(timeSeries75);
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries28.addAndOrUpdate(timeSeries81);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(timeSeries75);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(timeSeries81);
        org.junit.Assert.assertNotNull(timeSeries82);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        java.lang.Comparable comparable18 = timeSeries8.getKey();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        timeSeries22.setMaximumItemCount((int) (short) 100);
        boolean boolean26 = timeSeries22.getNotify();
        timeSeries22.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries22.addAndOrUpdate(timeSeries30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener32);
        timeSeries22.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class40 = timeSeries39.getTimePeriodClass();
        double double41 = timeSeries39.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries39.addChangeListener(seriesChangeListener42);
        java.util.Collection collection44 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries8.addAndOrUpdate(timeSeries22);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + ' ' + "'", comparable18, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNull(class40);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(timeSeries45);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.lang.Comparable comparable23 = timeSeries20.getKey();
        timeSeries20.removeAgedItems(100L, true);
        timeSeries20.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries20.removeChangeListener(seriesChangeListener29);
        long long31 = timeSeries20.getMaximumItemAge();
        timeSeries20.setDomainDescription("hi!");
        java.lang.String str34 = timeSeries20.getDomainDescription();
        int int35 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries3.addAndOrUpdate(timeSeries20);
        java.util.Collection collection37 = timeSeries36.getTimePeriods();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries52.removeAgedItems(100L, false);
        java.lang.String str56 = timeSeries52.getRangeDescription();
        double double57 = timeSeries52.getMaxY();
        boolean boolean58 = timeSeries52.getNotify();
        java.util.Collection collection59 = timeSeries48.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem61 = timeSeries52.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(collection59);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "Value");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        timeSeries3.addChangeListener(seriesChangeListener41);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = timeSeries3.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.isEmpty();
        java.util.List list13 = timeSeries10.getItems();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.addOrUpdate(regularTimePeriod12, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        timeSeries1.setDomainDescription("");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries8.createCopy((int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        boolean boolean30 = timeSeries10.getNotify();
        java.lang.Class<?> wildcardClass31 = timeSeries10.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        timeSeries10.removeAgedItems(true);
        boolean boolean22 = timeSeries10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries10.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        java.lang.String str8 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries3.addOrUpdate(regularTimePeriod24, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        timeSeries24.setMaximumItemCount((int) (short) 100);
        boolean boolean28 = timeSeries24.getNotify();
        timeSeries24.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries24.addAndOrUpdate(timeSeries32);
        java.lang.Class class34 = timeSeries33.getTimePeriodClass();
        boolean boolean35 = timeSeries19.equals((java.lang.Object) timeSeries33);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries19.addOrUpdate(regularTimePeriod36, (double) 10L);
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
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "hi!", "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries19.removeChangeListener(seriesChangeListener34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update(regularTimePeriod36, (java.lang.Number) 1.0d);
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
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        java.lang.Class class18 = timeSeries8.getTimePeriodClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(class18);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        java.lang.String str43 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 100);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries3.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double36 = timeSeries35.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries30.addAndOrUpdate(timeSeries35);
        java.lang.Comparable comparable38 = timeSeries35.getKey();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double48 = timeSeries47.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries42.addAndOrUpdate(timeSeries47);
        java.util.Collection collection50 = timeSeries35.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        timeSeries54.removePropertyChangeListener(propertyChangeListener55);
        java.lang.Comparable comparable57 = timeSeries54.getKey();
        timeSeries54.removeAgedItems(100L, true);
        timeSeries54.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries65.removeAgedItems(100L, false);
        java.lang.String str69 = timeSeries65.getRangeDescription();
        double double70 = timeSeries65.getMaxY();
        double double71 = timeSeries65.getMinY();
        java.lang.Object obj72 = timeSeries65.clone();
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double77 = timeSeries76.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double82 = timeSeries81.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries83 = timeSeries76.addAndOrUpdate(timeSeries81);
        timeSeries83.removeAgedItems((long) (short) -1, false);
        boolean boolean87 = timeSeries83.getNotify();
        timeSeries83.setDomainDescription("Value");
        java.util.Collection collection90 = timeSeries65.getTimePeriodsUniqueToOtherSeries(timeSeries83);
        org.jfree.data.time.TimeSeries timeSeries91 = timeSeries54.addAndOrUpdate(timeSeries65);
        double double92 = timeSeries65.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries93 = timeSeries35.addAndOrUpdate(timeSeries65);
        java.lang.Object obj94 = timeSeries35.clone();
        java.util.Collection collection95 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "Overwritten values from:  " + "'", comparable26, "Overwritten values from:  ");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + ' ' + "'", comparable38, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + ' ' + "'", comparable57, ' ');
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(timeSeries83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(timeSeries91);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertNotNull(timeSeries93);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertNotNull(collection95);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        java.util.List list8 = timeSeries3.getItems();
        timeSeries3.setMaximumItemCount((int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "", "Overwritten values from: Overwritten values from:  ");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "", "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries3.getValue(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        boolean boolean10 = timeSeries3.isEmpty();
        double double11 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries3.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        java.lang.String str17 = timeSeries10.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries19.addAndOrUpdate(timeSeries24);
        timeSeries24.setDomainDescription("hi!");
        java.util.List list29 = timeSeries24.getItems();
        timeSeries24.setRangeDescription("");
        java.lang.String str32 = timeSeries24.getDescription();
        java.util.Collection collection33 = timeSeries24.getTimePeriods();
        timeSeries24.removeAgedItems((long) ' ', false);
        timeSeries24.removeAgedItems(false);
        java.util.Collection collection39 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries11);
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "Time", "Overwritten values from:  ");
        double double4 = timeSeries3.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        timeSeries3.setKey((java.lang.Comparable) 97);
        timeSeries3.setMaximumItemAge((long) ' ');
        double double8 = timeSeries3.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        long long10 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        java.util.Collection collection13 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener29);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setKey((java.lang.Comparable) 1.0f);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        int int7 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (double) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries28.createCopy(0, (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries28.removePropertyChangeListener(propertyChangeListener45);
        int int47 = timeSeries28.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener48 = null;
        timeSeries28.addChangeListener(seriesChangeListener48);
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
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.Object obj7 = timeSeries3.clone();
        timeSeries3.setDescription("Overwritten values from:  ");
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries3.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries10.createCopy(0, 10);
        timeSeries31.setMaximumItemAge(10L);
        java.lang.Comparable comparable34 = timeSeries31.getKey();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + "Overwritten values from:  " + "'", comparable34, "Overwritten values from:  ");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        timeSeries3.setKey((java.lang.Comparable) 97);
        timeSeries3.setMaximumItemAge(100L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        java.util.Collection collection11 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (double) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) (byte) 0, false);
        timeSeries3.removeAgedItems(true);
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        timeSeries10.setRangeDescription("Time");
        boolean boolean28 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double33 = timeSeries32.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries32.addAndOrUpdate(timeSeries37);
        java.lang.Comparable comparable40 = timeSeries37.getKey();
        long long41 = timeSeries37.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries45.removeAgedItems(100L, false);
        java.lang.String str49 = timeSeries45.getRangeDescription();
        double double50 = timeSeries45.getMinY();
        int int51 = timeSeries45.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries45.removeChangeListener(seriesChangeListener52);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries37.addAndOrUpdate(timeSeries45);
        boolean boolean55 = timeSeries10.equals((java.lang.Object) timeSeries45);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + ' ' + "'", comparable40, ' ');
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 9223372036854775807L + "'", long41 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.createCopy(regularTimePeriod17, regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        timeSeries32.setKey((java.lang.Comparable) 10.0f);
        timeSeries32.removeAgedItems(false);
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
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str2 = timeSeries1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setRangeDescription("Overwritten values from: Overwritten values from:  ");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        java.lang.Object obj6 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (double) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries10.removeChangeListener(seriesChangeListener15);
        timeSeries10.setKey((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "");
        java.lang.Object obj2 = timeSeries1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "hi!", "");
        java.util.List list4 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(regularTimePeriod5, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.lang.Comparable comparable18 = timeSeries15.getKey();
        timeSeries15.removeAgedItems(100L, true);
        timeSeries15.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries15.removeChangeListener(seriesChangeListener24);
        java.lang.String str26 = timeSeries15.getDomainDescription();
        boolean boolean27 = timeSeries3.equals((java.lang.Object) str26);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + ' ' + "'", comparable18, ' ');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.addChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries17.removeAgedItems(false);
        boolean boolean21 = timeSeries17.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries17.addChangeListener(seriesChangeListener22);
        java.lang.String str24 = timeSeries17.getDescription();
        double double25 = timeSeries17.getMaxY();
        timeSeries17.fireSeriesChanged();
        timeSeries17.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries3.addAndOrUpdate(timeSeries17);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        java.lang.String str44 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries47 = timeSeries3.createCopy(regularTimePeriod45, regularTimePeriod46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "", "hi!");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.lang.String str15 = timeSeries3.getRangeDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries3.removeChangeListener(seriesChangeListener16);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        boolean boolean10 = timeSeries3.isEmpty();
        double double11 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        timeSeries4.clear();
        org.junit.Assert.assertNotNull(timeSeries4);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        java.util.List list35 = timeSeries10.getItems();
        java.lang.Comparable comparable36 = timeSeries10.getKey();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + 1 + "'", comparable36, 1);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setDescription("Value");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries10.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj13 = timeSeries10.clone();
        java.util.Collection collection14 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        java.lang.String str15 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries3.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries28.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ", "hi!", "Time");
        java.lang.Comparable comparable4 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener9);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        timeSeries8.setRangeDescription("");
        timeSeries8.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries8.addAndOrUpdate(timeSeries19);
        double double21 = timeSeries19.getMinY();
        boolean boolean22 = timeSeries19.isEmpty();
        timeSeries19.removeAgedItems((long) (byte) 0, true);
        boolean boolean26 = timeSeries19.isEmpty();
        boolean boolean27 = timeSeries3.equals((java.lang.Object) timeSeries19);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Overwritten values from:  " + "'", comparable4, "Overwritten values from:  ");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        boolean boolean5 = timeSeries3.getNotify();
        timeSeries3.removeAgedItems((long) '#', false);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener12);
        timeSeries3.clear();
        timeSeries3.setKey((java.lang.Comparable) 2147483647);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener17);
        timeSeries3.setMaximumItemCount((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener24);
        double double26 = timeSeries10.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        int int5 = timeSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        timeSeries8.fireSeriesChanged();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        double double6 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = timeSeries1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries23.removeChangeListener(seriesChangeListener34);
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
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "", "Overwritten values from:  ");
        timeSeries3.setDescription("");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        timeSeries8.clear();
        timeSeries8.setRangeDescription("Value");
        long long16 = timeSeries8.getMaximumItemAge();
        timeSeries8.clear();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener18);
        timeSeries8.removeAgedItems(9223372036854775807L, false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        timeSeries3.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeSeries3.getIndex(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        java.lang.String str41 = timeSeries35.getDescription();
        double double42 = timeSeries35.getMinY();
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
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "Value", "hi!");
        long long4 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        double double6 = timeSeries3.getMinY();
        java.lang.Object obj7 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeSeries3.getIndex(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("Value");
        timeSeries10.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod18, 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ");
        double double2 = timeSeries1.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("Overwritten values from:  ");
        boolean boolean13 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ");
        timeSeries1.setKey((java.lang.Comparable) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        timeSeries1.setMaximumItemCount(0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        int int26 = timeSeries8.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        timeSeries19.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.createCopy(regularTimePeriod27, regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(0L, false);
        timeSeries3.setMaximumItemAge(100L);
        double double10 = timeSeries3.getMaxY();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(10, 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        timeSeries3.setKey((java.lang.Comparable) (short) 10);
        double double52 = timeSeries3.getMaxY();
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
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 10, (java.lang.Number) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries(comparable0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        java.util.Collection collection21 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.createCopy(0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setKey((java.lang.Comparable) (-1.0f));
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        timeSeries8.setDomainDescription("Time");
        timeSeries8.setDescription("");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        timeSeries39.setRangeDescription("Overwritten values from: Overwritten values from:  ");
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
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        boolean boolean9 = timeSeries3.getNotify();
        timeSeries3.setDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.removeChangeListener(seriesChangeListener14);
        timeSeries13.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.addAndOrUpdate(timeSeries13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        timeSeries3.removeAgedItems((-1L), false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener20);
        timeSeries3.removeAgedItems((long) (short) 0, true);
        java.util.Collection collection25 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        java.lang.Class<?> wildcardClass32 = timeSeries21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) 1, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        timeSeries42.clear();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double60 = timeSeries59.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries54.addAndOrUpdate(timeSeries59);
        timeSeries59.setDomainDescription("hi!");
        java.util.List list64 = timeSeries59.getItems();
        timeSeries59.setRangeDescription("");
        timeSeries59.setDomainDescription("Overwritten values from:  ");
        java.util.Collection collection69 = timeSeries59.getTimePeriods();
        timeSeries59.setDomainDescription("");
        java.util.Collection collection72 = timeSeries42.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        java.util.List list73 = timeSeries42.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries76 = timeSeries42.createCopy((-1), (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(list73);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems((long) ' ', false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.lang.Comparable comparable20 = timeSeries17.getKey();
        timeSeries17.removeAgedItems(100L, true);
        timeSeries17.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries17.removeChangeListener(seriesChangeListener26);
        long long28 = timeSeries17.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener29);
        java.util.Collection collection31 = timeSeries17.getTimePeriods();
        timeSeries17.setRangeDescription("hi!");
        boolean boolean34 = timeSeries3.equals((java.lang.Object) timeSeries17);
        java.lang.Class class35 = timeSeries17.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = timeSeries17.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + ' ' + "'", comparable20, ' ');
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9223372036854775807L + "'", long28 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(class35);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        timeSeries19.setRangeDescription("");
        timeSeries19.setRangeDescription("");
        timeSeries19.removeAgedItems((long) (byte) 0, false);
        boolean boolean30 = timeSeries10.equals((java.lang.Object) false);
        timeSeries10.setNotify(false);
        java.lang.String str33 = timeSeries10.getDomainDescription();
        int int34 = timeSeries10.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        java.lang.Number number17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod16, number17);
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
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 10);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setKey((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries42.removeAgedItems(100L, false);
        java.lang.String str46 = timeSeries42.getRangeDescription();
        double double47 = timeSeries42.getMaxY();
        timeSeries42.setNotify(false);
        timeSeries42.setMaximumItemAge((long) ' ');
        java.lang.String str52 = timeSeries42.getDescription();
        timeSeries42.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries3.addAndOrUpdate(timeSeries42);
        java.util.List list55 = timeSeries42.getItems();
        timeSeries42.setDomainDescription("Value");
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(list55);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        timeSeries1.setNotify(false);
        long long22 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems((long) (short) -1, true);
        timeSeries1.removeAgedItems(false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.lang.Comparable comparable18 = timeSeries15.getKey();
        timeSeries15.removeAgedItems(100L, true);
        timeSeries15.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries15.removeChangeListener(seriesChangeListener24);
        long long26 = timeSeries15.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries3.addAndOrUpdate(timeSeries15);
        java.lang.Comparable comparable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.setKey(comparable30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + ' ' + "'", comparable18, ' ');
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setNotify(false);
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        java.lang.Class<?> wildcardClass35 = timeSeries31.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        java.lang.String str8 = timeSeries3.getRangeDescription();
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        long long13 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries12);
        java.lang.Class class15 = timeSeries14.getTimePeriodClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.setRangeDescription("");
        double double6 = timeSeries1.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        timeSeries10.setNotify(true);
        java.lang.Class class35 = timeSeries10.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener36);
        timeSeries10.setDescription("Overwritten values from: Overwritten values from:  ");
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
        org.junit.Assert.assertNull(class35);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        java.lang.String str24 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.String str7 = timeSeries1.getDomainDescription();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        java.lang.String str13 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        java.util.List list14 = timeSeries3.getItems();
        java.lang.String str15 = timeSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener29);
        long long31 = timeSeries26.getMaximumItemAge();
        timeSeries26.setMaximumItemAge((long) (short) 1);
        java.lang.Object obj34 = null;
        boolean boolean35 = timeSeries26.equals(obj34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod36, (java.lang.Number) (short) -1, true);
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.fireSeriesChanged();
        timeSeries3.setRangeDescription("Overwritten values from:  ");
        java.lang.String str19 = timeSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "Overwritten values from:  ", "Value");
        java.util.List list4 = timeSeries3.getItems();
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        timeSeries10.setMaximumItemAge(1L);
        int int16 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.lang.Comparable comparable23 = timeSeries20.getKey();
        timeSeries20.removeAgedItems(100L, true);
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries31.removeAgedItems(100L, false);
        java.lang.String str35 = timeSeries31.getRangeDescription();
        double double36 = timeSeries31.getMaxY();
        double double37 = timeSeries31.getMinY();
        java.lang.Object obj38 = timeSeries31.clone();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double48 = timeSeries47.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries42.addAndOrUpdate(timeSeries47);
        timeSeries49.removeAgedItems((long) (short) -1, false);
        boolean boolean53 = timeSeries49.getNotify();
        timeSeries49.setDomainDescription("Value");
        java.util.Collection collection56 = timeSeries31.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries20.addAndOrUpdate(timeSeries31);
        timeSeries20.removeAgedItems((long) 0, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener61 = null;
        timeSeries20.removeChangeListener(seriesChangeListener61);
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double67 = timeSeries66.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double72 = timeSeries71.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries66.addAndOrUpdate(timeSeries71);
        java.lang.Comparable comparable74 = timeSeries71.getKey();
        timeSeries71.clear();
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries20.addAndOrUpdate(timeSeries71);
        timeSeries76.setDomainDescription("Time");
        boolean boolean79 = timeSeries76.isEmpty();
        boolean boolean80 = timeSeries10.equals((java.lang.Object) timeSeries76);
        java.util.Collection collection81 = timeSeries76.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertEquals("'" + comparable74 + "' != '" + ' ' + "'", comparable74, ' ');
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(collection81);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        timeSeries1.setMaximumItemAge((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        timeSeries3.clear();
        java.util.List list24 = timeSeries3.getItems();
        int int25 = timeSeries3.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod28, (java.lang.Number) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries42.addChangeListener(seriesChangeListener52);
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
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries28.createCopy(0, (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries28.removePropertyChangeListener(propertyChangeListener45);
        int int47 = timeSeries28.getItemCount();
        timeSeries28.setDomainDescription("hi!");
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
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setMaximumItemCount(1);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = timeSeries10.getIndex(regularTimePeriod33);
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
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        java.lang.String str16 = timeSeries8.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod17, (double) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries3.addChangeListener(seriesChangeListener39);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries43 = timeSeries3.createCopy(regularTimePeriod41, regularTimePeriod42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double38));
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        java.lang.Object obj35 = timeSeries28.clone();
        java.util.Collection collection36 = timeSeries28.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(regularTimePeriod37, (double) 1.0f, true);
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
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.Collection collection12 = timeSeries10.getTimePeriods();
        java.lang.Object obj13 = timeSeries10.clone();
        timeSeries10.setNotify(true);
        timeSeries10.removeAgedItems((long) (short) 1, false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        timeSeries1.setDescription("");
        timeSeries1.removeAgedItems(true);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        timeSeries28.fireSeriesChanged();
        boolean boolean31 = timeSeries28.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        java.util.Collection collection45 = timeSeries38.getTimePeriods();
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
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        boolean boolean5 = timeSeries3.getNotify();
        int int6 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) '4', false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        timeSeries3.setKey((java.lang.Comparable) "Time");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 1, 100);
        timeSeries6.setMaximumItemAge((long) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries6.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem78 = timeSeries75.addOrUpdate(regularTimePeriod76, (double) (byte) 10);
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
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.delete(regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setKey((java.lang.Comparable) 100L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod16, (double) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ");
        timeSeries1.setKey((java.lang.Comparable) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        timeSeries1.setMaximumItemAge((long) 2147483647);
        java.lang.String str8 = timeSeries1.getDomainDescription();
        java.lang.Object obj9 = timeSeries1.clone();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener9);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        timeSeries8.removeAgedItems(100L, true);
        timeSeries8.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries8.removeChangeListener(seriesChangeListener17);
        timeSeries8.removeAgedItems((long) 100, true);
        timeSeries8.setKey((java.lang.Comparable) "Value");
        boolean boolean24 = timeSeries3.equals((java.lang.Object) "Value");
        boolean boolean25 = timeSeries3.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Overwritten values from:  " + "'", str4, "Overwritten values from:  ");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "");
        timeSeries1.removeAgedItems(true);
        java.lang.String str4 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setKey((java.lang.Comparable) 0);
        long long6 = timeSeries1.getMaximumItemAge();
        java.lang.String str7 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.addOrUpdate(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        timeSeries3.setRangeDescription("Time");
        java.util.Collection collection11 = timeSeries3.getTimePeriods();
        timeSeries3.setDomainDescription("");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        timeSeries8.setMaximumItemCount((int) ' ');
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries8.removeChangeListener(seriesChangeListener26);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod20, (double) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        timeSeries11.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries20.addAndOrUpdate(timeSeries25);
        double double28 = timeSeries27.getMinY();
        boolean boolean29 = timeSeries27.getNotify();
        java.util.Collection collection30 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        java.lang.String str31 = timeSeries11.getDescription();
        timeSeries11.setNotify(false);
        java.util.Collection collection34 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(collection34);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        java.lang.Object obj32 = timeSeries16.clone();
        double double33 = timeSeries16.getMinY();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        double double33 = timeSeries28.getMaxY();
        timeSeries28.removeAgedItems((long) '4', true);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double41 = timeSeries40.getMaxY();
        boolean boolean42 = timeSeries40.getNotify();
        long long43 = timeSeries40.getMaximumItemAge();
        java.util.Collection collection44 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries40.removePropertyChangeListener(propertyChangeListener45);
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
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 9223372036854775807L + "'", long43 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        timeSeries8.removeAgedItems(true);
        timeSeries8.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "Overwritten values from:  ", "Overwritten values from:  ");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        timeSeries7.removeAgedItems(100L, true);
        int int14 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems(1L, false);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int22 = timeSeries21.getItemCount();
        java.util.Collection collection23 = timeSeries21.getTimePeriods();
        timeSeries21.removeAgedItems((long) (short) -1, false);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries7.addAndOrUpdate(timeSeries21);
        timeSeries21.setMaximumItemCount((int) 'a');
        java.util.Collection collection30 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        long long31 = timeSeries21.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + ' ' + "'", comparable10, ' ');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, "Time", "Time");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod26, (java.lang.Number) (short) 10);
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
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries14.getMinY();
        boolean boolean17 = timeSeries14.getNotify();
        java.util.List list18 = timeSeries14.getItems();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        timeSeries3.setDescription("Value");
        timeSeries3.clear();
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
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems((long) 100, false);
        timeSeries3.removeAgedItems(false);
        int int10 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) -1, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        timeSeries35.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries35.removeChangeListener(seriesChangeListener44);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries35.update(regularTimePeriod46, (java.lang.Number) (-1.0f));
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
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
        timeSeries3.clear();
        timeSeries3.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setNotify(true);
        boolean boolean14 = timeSeries10.isEmpty();
        java.lang.String str15 = timeSeries10.getDomainDescription();
        java.lang.Comparable comparable16 = timeSeries10.getKey();
        timeSeries10.clear();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Overwritten values from:  " + "'", comparable16, "Overwritten values from:  ");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        timeSeries1.fireSeriesChanged();
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
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        int int15 = timeSeries10.getMaximumItemCount();
        double double16 = timeSeries10.getMinY();
        timeSeries10.setMaximumItemAge((long) (short) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries10.addChangeListener(seriesChangeListener19);
        java.lang.String str21 = timeSeries10.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        boolean boolean2 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        timeSeries8.clear();
        timeSeries8.setRangeDescription("Value");
        long long16 = timeSeries8.getMaximumItemAge();
        java.lang.Object obj17 = timeSeries8.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod18, (java.lang.Number) 97, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.addOrUpdate(timeSeriesDataItem2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class55 = timeSeries54.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries38.addAndOrUpdate(timeSeries54);
        boolean boolean57 = timeSeries54.isEmpty();
        java.lang.Class class58 = timeSeries54.getTimePeriodClass();
        timeSeries54.clear();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries8.addAndOrUpdate(timeSeries54);
        int int61 = timeSeries60.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(class55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(class58);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        double double10 = timeSeries3.getMaxY();
        java.lang.String str11 = timeSeries3.getRangeDescription();
        int int12 = timeSeries3.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        timeSeries3.setKey((java.lang.Comparable) 0.0f);
        java.lang.String str16 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(97, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        timeSeries8.setDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries8.removeChangeListener(seriesChangeListener26);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.addChangeListener(seriesChangeListener11);
        java.util.Collection collection13 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        long long60 = timeSeries54.getMaximumItemAge();
        java.lang.String str61 = timeSeries54.getRangeDescription();
        timeSeries54.setMaximumItemCount((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 9223372036854775807L + "'", long60 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge((long) (short) 10);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries3.addChangeListener(seriesChangeListener13);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        timeSeries8.removeAgedItems((long) (-1), true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems((long) (short) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double17 = timeSeries16.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries16);
        timeSeries18.setDomainDescription("");
        timeSeries18.setKey((java.lang.Comparable) 1);
        boolean boolean23 = timeSeries18.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.lang.Comparable comparable30 = timeSeries27.getKey();
        timeSeries27.removeAgedItems(100L, true);
        timeSeries27.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries27.removeChangeListener(seriesChangeListener36);
        long long38 = timeSeries27.getMaximumItemAge();
        timeSeries27.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries18.addAndOrUpdate(timeSeries27);
        int int42 = timeSeries27.getMaximumItemCount();
        java.util.Collection collection43 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod44, (java.lang.Number) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + ' ' + "'", comparable30, ' ');
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 9223372036854775807L + "'", long38 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        long long5 = timeSeries4.getMaximumItemAge();
        timeSeries4.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod8, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        timeSeries10.setKey((java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable49 = timeSeries10.getKey();
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
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + (byte) -1 + "'", comparable49, (byte) -1);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("hi!");
        java.lang.String str13 = timeSeries10.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries22);
        timeSeries22.setDomainDescription("hi!");
        java.util.List list27 = timeSeries22.getItems();
        timeSeries22.setRangeDescription("");
        timeSeries22.removeAgedItems(true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries22.removeChangeListener(seriesChangeListener32);
        int int34 = timeSeries22.getItemCount();
        double double35 = timeSeries22.getMaxY();
        boolean boolean36 = timeSeries10.equals((java.lang.Object) double35);
        java.util.Collection collection37 = timeSeries10.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        timeSeries28.fireSeriesChanged();
        timeSeries28.removeAgedItems(false);
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
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener12);
        timeSeries3.clear();
        timeSeries3.setKey((java.lang.Comparable) 2147483647);
        boolean boolean17 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemAge(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries1.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "", "Time");
        java.util.List list4 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) "Time");
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        java.lang.Comparable comparable39 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries3.createCopy((int) (byte) 1, (int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + ' ' + "'", comparable39, ' ');
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "Overwritten values from:  ");
        timeSeries3.removeAgedItems(0L, true);
        int int7 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        timeSeries28.fireSeriesChanged();
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
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDescription("Overwritten values from:  ");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        timeSeries8.clear();
        timeSeries8.setRangeDescription("Time");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.clear();
        timeSeries8.removeAgedItems((-1L), false);
        timeSeries8.removeAgedItems(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        java.lang.Class class19 = timeSeries12.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNull(class19);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        double double18 = timeSeries17.getMinY();
        boolean boolean19 = timeSeries17.getNotify();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries21.setMaximumItemAge(10L);
        timeSeries21.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries17.addAndOrUpdate(timeSeries21);
        int int27 = timeSeries26.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries3.addAndOrUpdate(timeSeries26);
        java.lang.String str29 = timeSeries28.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        timeSeries10.setRangeDescription("Time");
        timeSeries10.setMaximumItemCount((int) (byte) 100);
        timeSeries10.clear();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double35 = timeSeries34.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double40 = timeSeries39.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries34.addAndOrUpdate(timeSeries39);
        timeSeries41.setDomainDescription("");
        timeSeries41.setKey((java.lang.Comparable) 1);
        boolean boolean46 = timeSeries41.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries50.removePropertyChangeListener(propertyChangeListener51);
        java.lang.Comparable comparable53 = timeSeries50.getKey();
        timeSeries50.removeAgedItems(100L, true);
        timeSeries50.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener59 = null;
        timeSeries50.removeChangeListener(seriesChangeListener59);
        long long61 = timeSeries50.getMaximumItemAge();
        timeSeries50.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries41.addAndOrUpdate(timeSeries50);
        double double65 = timeSeries41.getMinY();
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double70 = timeSeries69.getMaxY();
        boolean boolean71 = timeSeries69.getNotify();
        timeSeries69.removeAgedItems((long) (byte) 1, false);
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries41.addAndOrUpdate(timeSeries69);
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries10.addAndOrUpdate(timeSeries41);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + ' ' + "'", comparable53, ' ');
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 9223372036854775807L + "'", long61 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(timeSeries75);
        org.junit.Assert.assertNotNull(timeSeries76);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        long long21 = timeSeries8.getMaximumItemAge();
        boolean boolean22 = timeSeries8.getNotify();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        double double10 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.addAndOrUpdate(timeSeries9);
        java.lang.Comparable comparable12 = timeSeries3.getKey();
        java.util.Collection collection13 = timeSeries3.getTimePeriods();
        java.util.List list14 = timeSeries3.getItems();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("Value");
        int int17 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double22 = timeSeries21.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries21.addAndOrUpdate(timeSeries26);
        timeSeries28.removeAgedItems((long) (short) -1, false);
        java.lang.String str32 = timeSeries28.getDomainDescription();
        java.util.Collection collection33 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
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
        timeSeries26.setKey((java.lang.Comparable) 97);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries32.removePropertyChangeListener(propertyChangeListener33);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries32.removeChangeListener(seriesChangeListener35);
        timeSeries32.setNotify(true);
        timeSeries32.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries44.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries32.addAndOrUpdate(timeSeries44);
        timeSeries47.clear();
        java.lang.Comparable comparable49 = timeSeries47.getKey();
        java.util.Collection collection50 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + "Overwritten values from: 0" + "'", comparable49, "Overwritten values from: 0");
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries3.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "Value", "Overwritten values from:  ");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.addOrUpdate(regularTimePeriod4, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        java.lang.String str17 = timeSeries3.getDomainDescription();
        int int18 = timeSeries3.getItemCount();
        timeSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double27 = timeSeries26.getMaxY();
        timeSeries26.setMaximumItemCount((int) (short) 100);
        boolean boolean30 = timeSeries26.getNotify();
        timeSeries26.setDomainDescription("hi!");
        double double33 = timeSeries26.getMaxY();
        timeSeries26.setDomainDescription("Value");
        long long36 = timeSeries26.getMaximumItemAge();
        java.util.Collection collection37 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9223372036854775807L + "'", long36 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        java.lang.Object obj11 = timeSeries3.clone();
        timeSeries3.setMaximumItemAge(0L);
        timeSeries3.setRangeDescription("");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        java.lang.String str15 = timeSeries10.getDescription();
        java.util.List list16 = timeSeries10.getItems();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems((long) 100, false);
        timeSeries3.removeAgedItems(false);
        int int10 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setDescription("Value");
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy((int) (short) 10, 10);
        timeSeries9.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        timeSeries3.clear();
        long long24 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setNotify(false);
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "Overwritten values from:  ", "Overwritten values from:  ");
        timeSeries3.removeAgedItems((long) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod7, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        java.lang.Object obj63 = timeSeries54.clone();
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
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double35 = timeSeries34.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries29.addAndOrUpdate(timeSeries34);
        double double37 = timeSeries36.getMinY();
        boolean boolean38 = timeSeries36.getNotify();
        timeSeries36.setDomainDescription("hi!");
        double double41 = timeSeries36.getMinY();
        boolean boolean42 = timeSeries1.equals((java.lang.Object) double41);
        timeSeries1.setDescription("");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        int int15 = timeSeries10.getMaximumItemCount();
        double double16 = timeSeries10.getMinY();
        long long17 = timeSeries10.getMaximumItemAge();
        timeSeries10.removeAgedItems(true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.createCopy((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries20.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries20.addChangeListener(seriesChangeListener23);
        java.lang.String str25 = timeSeries20.getRangeDescription();
        java.util.Collection collection26 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        timeSeries20.setRangeDescription("Overwritten values from:  ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        timeSeries3.setDomainDescription("");
        double double11 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "", "Time");
        timeSeries3.setKey((java.lang.Comparable) (byte) 100);
        timeSeries3.setDescription("");
        boolean boolean8 = timeSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
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
        java.util.List list36 = timeSeries3.getItems();
        timeSeries3.setNotify(true);
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
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries3.createCopy(0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number53 = timeSeries3.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        java.lang.Class class33 = timeSeries3.getTimePeriodClass();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries3.addChangeListener(seriesChangeListener34);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(class33);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.fireSeriesChanged();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        timeSeries3.removeAgedItems(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        timeSeries3.removeAgedItems((long) 10, false);
        java.lang.String str12 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = timeSeries44.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
        java.util.List list6 = timeSeries3.getItems();
        long long7 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        java.util.List list8 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((-1), (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        int int8 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems((long) '4', true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        timeSeries17.setMaximumItemCount((int) (short) 100);
        boolean boolean21 = timeSeries17.getNotify();
        timeSeries17.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries17.addAndOrUpdate(timeSeries25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener27);
        timeSeries17.removeAgedItems(false);
        int int31 = timeSeries17.getMaximumItemCount();
        boolean boolean32 = timeSeries3.equals((java.lang.Object) timeSeries17);
        timeSeries17.setNotify(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        java.lang.String str23 = timeSeries8.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries8.removeChangeListener(seriesChangeListener24);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
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
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries20.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries20.addChangeListener(seriesChangeListener23);
        java.lang.String str25 = timeSeries20.getRangeDescription();
        java.util.Collection collection26 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        int int27 = timeSeries12.getItemCount();
        timeSeries12.setKey((java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        java.util.List list34 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod35);
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
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries1.addOrUpdate(regularTimePeriod25, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        boolean boolean5 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries3.getTimePeriod(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(1L, false);
        java.lang.String str14 = timeSeries3.getDescription();
        double double15 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        timeSeries3.fireSeriesChanged();
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
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemAge((long) ' ');
        java.lang.String str13 = timeSeries3.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener34);
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
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDomainDescription("hi!");
        boolean boolean8 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        java.lang.String str8 = timeSeries3.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.removeAgedItems((long) 97, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener14);
        java.util.List list16 = timeSeries3.getItems();
        boolean boolean17 = timeSeries3.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.fireSeriesChanged();
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener11);
        java.lang.String str13 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        java.lang.Object obj49 = timeSeries48.clone();
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
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Value", "hi!");
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
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries44.removePropertyChangeListener(propertyChangeListener45);
        double double47 = timeSeries44.getMaxY();
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries44.addPropertyChangeListener(propertyChangeListener48);
        java.util.Collection collection50 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries44.clear();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems(false);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.addOrUpdate(regularTimePeriod14, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        java.lang.Comparable comparable13 = timeSeries3.getKey();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + ' ' + "'", comparable13, ' ');
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 97, "Value", "hi!");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        double double12 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        long long60 = timeSeries54.getMaximumItemAge();
        java.lang.String str61 = timeSeries54.getRangeDescription();
        int int62 = timeSeries54.getMaximumItemCount();
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
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 9223372036854775807L + "'", long60 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2147483647 + "'", int62 == 2147483647);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
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
        timeSeries3.setDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = timeSeries3.getValue((int) (byte) -1);
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
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setNotify(false);
        timeSeries3.setRangeDescription("Value");
        timeSeries3.clear();
        java.util.List list9 = timeSeries3.getItems();
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        java.util.List list35 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries1.removeChangeListener(seriesChangeListener25);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) (byte) 0, false);
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + ' ' + "'", comparable14, ' ');
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Value");
        java.util.List list4 = timeSeries3.getItems();
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.createCopy((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        timeSeries19.setRangeDescription("");
        timeSeries19.setRangeDescription("");
        timeSeries19.removeAgedItems((long) (byte) 0, false);
        boolean boolean30 = timeSeries10.equals((java.lang.Object) false);
        timeSeries10.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener33);
        java.lang.String str35 = timeSeries10.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        timeSeries3.setMaximumItemCount((int) '#');
        java.lang.String str12 = timeSeries3.getRangeDescription();
        java.lang.String str13 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        long long2 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(10L, true);
        int int6 = timeSeries1.getMaximumItemCount();
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.addOrUpdate(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Value", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        timeSeries7.setRangeDescription("");
        timeSeries7.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries7.addAndOrUpdate(timeSeries18);
        double double20 = timeSeries7.getMinY();
        java.lang.Class class21 = timeSeries7.getTimePeriodClass();
        long long22 = timeSeries7.getMaximumItemAge();
        timeSeries7.setNotify(true);
        boolean boolean25 = timeSeries3.equals((java.lang.Object) timeSeries7);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries3.addOrUpdate(timeSeriesDataItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + ' ' + "'", comparable10, ' ');
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener11);
        java.lang.String str13 = timeSeries1.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        long long17 = timeSeries3.getMaximumItemAge();
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
        double double52 = timeSeries21.getMinY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries56.removeAgedItems(100L, false);
        java.lang.String str60 = timeSeries56.getRangeDescription();
        java.util.Collection collection61 = timeSeries56.getTimePeriods();
        java.lang.Comparable comparable62 = timeSeries56.getKey();
        timeSeries56.setNotify(false);
        double double65 = timeSeries56.getMinY();
        timeSeries56.removeAgedItems((long) '#', false);
        boolean boolean69 = timeSeries21.equals((java.lang.Object) false);
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double74 = timeSeries73.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double79 = timeSeries78.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries73.addAndOrUpdate(timeSeries78);
        double double81 = timeSeries80.getMinY();
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries21.addAndOrUpdate(timeSeries80);
        java.util.Collection collection83 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries80);
        timeSeries80.removeAgedItems(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertEquals("'" + comparable62 + "' != '" + ' ' + "'", comparable62, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(timeSeries82);
        org.junit.Assert.assertNotNull(collection83);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, "hi!", "Value");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod5, (java.lang.Number) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
        boolean boolean28 = timeSeries10.isEmpty();
        timeSeries10.setKey((java.lang.Comparable) (short) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries10.removeChangeListener(seriesChangeListener31);
        int int33 = timeSeries10.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        timeSeries3.clear();
        timeSeries3.setDomainDescription("hi!");
        java.lang.Object obj12 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
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
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod21, (java.lang.Number) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
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
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class55 = timeSeries54.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries38.addAndOrUpdate(timeSeries54);
        boolean boolean57 = timeSeries54.isEmpty();
        java.lang.Class class58 = timeSeries54.getTimePeriodClass();
        timeSeries54.clear();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries8.addAndOrUpdate(timeSeries54);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries63 = timeSeries54.createCopy(regularTimePeriod61, regularTimePeriod62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(class55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(class58);
        org.junit.Assert.assertNotNull(timeSeries60);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries15.setRangeDescription("hi!");
        double double18 = timeSeries15.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(0, (int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        timeSeries1.setDescription("");
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        timeSeries22.removeAgedItems(false);
        timeSeries22.setDescription("Overwritten values from: 0");
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
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries20.addOrUpdate(timeSeriesDataItem36);
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
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
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
        java.lang.String str17 = timeSeries3.getDomainDescription();
        int int18 = timeSeries3.getItemCount();
        timeSeries3.setKey((java.lang.Comparable) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod23, (double) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries1.createCopy(0, 10);
        int int9 = timeSeries8.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries19.addAndOrUpdate(timeSeries24);
        double double27 = timeSeries26.getMinY();
        timeSeries26.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener30);
        boolean boolean32 = timeSeries3.equals((java.lang.Object) timeSeries26);
        timeSeries26.setMaximumItemAge((long) 2147483647);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener35);
        timeSeries26.setMaximumItemCount((int) (short) 10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(timeSeriesDataItem39, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) (short) -1);
        timeSeries3.removeAgedItems((-1L), true);
        timeSeries3.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) '#', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries15.setRangeDescription("hi!");
        double double18 = timeSeries15.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete((int) (byte) 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double6 = timeSeries5.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries5.addAndOrUpdate(timeSeries10);
        double double13 = timeSeries12.getMinY();
        boolean boolean14 = timeSeries12.getNotify();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener19);
        java.lang.Comparable comparable21 = timeSeries18.getKey();
        timeSeries18.setRangeDescription("");
        timeSeries18.removeAgedItems((long) '4', false);
        java.util.Collection collection27 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.lang.Comparable comparable28 = timeSeries12.getKey();
        timeSeries12.setRangeDescription("");
        java.lang.Class class31 = timeSeries12.getTimePeriodClass();
        int int32 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries1.addAndOrUpdate(timeSeries12);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + ' ' + "'", comparable21, ' ');
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Overwritten values from:  " + "'", comparable28, "Overwritten values from:  ");
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries33);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems(true);
        double double9 = timeSeries3.getMinY();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        int int11 = timeSeries3.getMaximumItemCount();
        boolean boolean12 = timeSeries3.isEmpty();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries32 = timeSeries10.createCopy(regularTimePeriod30, regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ");
        timeSeries1.setKey((java.lang.Comparable) (short) 1);
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
        timeSeries32.setMaximumItemCount((int) 'a');
        timeSeries32.fireSeriesChanged();
        java.lang.Object obj39 = timeSeries32.clone();
        int int40 = timeSeries32.getMaximumItemCount();
        java.lang.String str41 = timeSeries32.getDomainDescription();
        boolean boolean42 = timeSeries1.equals((java.lang.Object) timeSeries32);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries1.addChangeListener(seriesChangeListener43);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Time" + "'", str41, "Time");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
        timeSeries3.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener19);
        java.lang.String str21 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        timeSeries8.removeAgedItems(true);
        timeSeries8.setNotify(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries8.removeChangeListener(seriesChangeListener17);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) (short) -1);
        timeSeries3.removeAgedItems((-1L), true);
        timeSeries3.setKey((java.lang.Comparable) 1.0d);
        timeSeries3.clear();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.String str14 = timeSeries3.getDomainDescription();
        java.lang.Class class15 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "Overwritten values from:  ", "Overwritten values from:  ");
        timeSeries3.removeAgedItems((long) 0, false);
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
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.util.List list6 = timeSeries1.getItems();
        double double7 = timeSeries1.getMaxY();
        int int8 = timeSeries1.getItemCount();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        timeSeries12.setNotify(false);
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
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        double double11 = timeSeries3.getMaxY();
        timeSeries3.setDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries3.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        timeSeries3.setRangeDescription("");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        timeSeries3.setDomainDescription("Value");
        timeSeries3.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        java.util.Collection collection45 = timeSeries44.getTimePeriods();
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
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj6 = timeSeries3.clone();
        double double7 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        java.lang.String str15 = timeSeries10.getDescription();
        timeSeries10.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "Overwritten values from: Overwritten values from:  ", "hi!");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems((long) 10, false);
        boolean boolean10 = timeSeries3.isEmpty();
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double36 = timeSeries35.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double41 = timeSeries40.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries35.addAndOrUpdate(timeSeries40);
        double double43 = timeSeries42.getMinY();
        timeSeries42.setNotify(true);
        boolean boolean46 = timeSeries42.isEmpty();
        java.lang.String str47 = timeSeries42.getDomainDescription();
        double double48 = timeSeries42.getMaxY();
        java.lang.String str49 = timeSeries42.getDescription();
        java.util.Collection collection50 = timeSeries42.getTimePeriods();
        boolean boolean51 = timeSeries26.equals((java.lang.Object) timeSeries42);
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
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Time" + "'", str47, "Time");
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getDataItem(regularTimePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries24.addOrUpdate(regularTimePeriod25, (java.lang.Number) 0L);
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
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        java.lang.String str7 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries11.removeAgedItems(100L, false);
        int int15 = timeSeries11.getItemCount();
        int int16 = timeSeries11.getItemCount();
        timeSeries11.removeAgedItems(false);
        java.util.Collection collection19 = timeSeries11.getTimePeriods();
        java.util.Collection collection20 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        long long41 = timeSeries14.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.update(10, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 9223372036854775807L + "'", long41 == 9223372036854775807L);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.fireSeriesChanged();
        timeSeries3.setRangeDescription("Overwritten values from:  ");
        boolean boolean19 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries3.getValue(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        timeSeries3.setKey((java.lang.Comparable) false);
        int int8 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        java.lang.Object obj67 = timeSeries8.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod68 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod68, (double) 1);
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
        org.junit.Assert.assertNotNull(obj67);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        timeSeries1.setDescription("");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        timeSeries1.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (java.lang.Number) 97, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
        boolean boolean35 = timeSeries3.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy(regularTimePeriod2, regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener31);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries30.removeChangeListener(seriesChangeListener33);
        timeSeries30.setNotify(true);
        timeSeries30.removeAgedItems(true);
        java.util.Collection collection39 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        timeSeries30.setMaximumItemCount((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = timeSeries30.getTimePeriod((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 0, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries8.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(regularTimePeriod16);
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
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Time", "");
        int int4 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemCount((int) (short) 0);
        java.lang.Object obj7 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setMaximumItemCount((int) ' ');
        java.util.List list9 = timeSeries1.getItems();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        double double11 = timeSeries1.getMinY();
        timeSeries1.setDomainDescription("Overwritten values from: Overwritten values from:  ");
        long long14 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
        java.lang.String str19 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries3.addOrUpdate(regularTimePeriod20, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.addOrUpdate(regularTimePeriod13, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        java.lang.Comparable comparable31 = timeSeries26.getKey();
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
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + ' ' + "'", comparable31, ' ');
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries15.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        timeSeries3.setKey((java.lang.Comparable) 100.0f);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 0, (int) ' ');
        java.lang.String str9 = timeSeries8.getDomainDescription();
        timeSeries8.setKey((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        boolean boolean19 = timeSeries18.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        int int24 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries18.addAndOrUpdate(timeSeries23);
        java.lang.String str26 = timeSeries18.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Time" + "'", str26, "Time");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        java.lang.Object obj6 = timeSeries3.clone();
        timeSeries3.removeAgedItems((long) (byte) 10, false);
        int int10 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(1L, false);
        boolean boolean14 = timeSeries3.getNotify();
        int int15 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        double double11 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        timeSeries1.setDescription("");
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.addOrUpdate(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDescription("hi!");
        timeSeries8.clear();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries17.removeAgedItems(100L, false);
        java.lang.String str21 = timeSeries17.getRangeDescription();
        timeSeries17.setMaximumItemAge((long) 1);
        timeSeries17.removeAgedItems(false);
        timeSeries17.removeAgedItems(false);
        boolean boolean28 = timeSeries8.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        timeSeries10.setRangeDescription("Time");
        timeSeries10.setMaximumItemCount((int) (byte) 100);
        java.lang.String str30 = timeSeries10.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) (byte) 0, false);
        timeSeries3.removeAgedItems(true);
        java.lang.Class class16 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj6 = timeSeries3.clone();
        double double7 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries11.removeAgedItems(100L, false);
        java.lang.String str15 = timeSeries11.getRangeDescription();
        int int16 = timeSeries11.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries11.addChangeListener(seriesChangeListener17);
        double double19 = timeSeries11.getMaxY();
        timeSeries11.setDescription("Time");
        boolean boolean22 = timeSeries3.equals((java.lang.Object) timeSeries11);
        timeSeries3.setNotify(true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        timeSeries12.removeAgedItems(false);
        java.lang.String str15 = timeSeries12.getRangeDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries1.removeAgedItems(false);
        timeSeries1.fireSeriesChanged();
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        timeSeries10.removeAgedItems((long) (-1), false);
        java.lang.Object obj18 = timeSeries10.clone();
        boolean boolean19 = timeSeries10.getNotify();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.lang.Comparable comparable5 = timeSeries3.getKey();
        java.lang.Object obj6 = timeSeries3.clone();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 100L + "'", comparable5, 100L);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        java.lang.String str20 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener31);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries30.removeChangeListener(seriesChangeListener33);
        timeSeries30.setNotify(true);
        timeSeries30.removeAgedItems(true);
        java.util.Collection collection39 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries41.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries41.addChangeListener(seriesChangeListener44);
        int int46 = timeSeries41.getItemCount();
        timeSeries41.removeAgedItems((long) (byte) 0, false);
        boolean boolean50 = timeSeries26.equals((java.lang.Object) timeSeries41);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
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
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        java.lang.String str23 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries3.addChangeListener(seriesChangeListener19);
        java.lang.Object obj21 = timeSeries3.clone();
        int int22 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries11.removeAgedItems(100L, false);
        java.lang.String str15 = timeSeries11.getRangeDescription();
        double double16 = timeSeries11.getMinY();
        java.lang.String str17 = timeSeries11.getDescription();
        int int18 = timeSeries11.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        java.lang.String str24 = timeSeries22.getRangeDescription();
        timeSeries22.clear();
        java.util.Collection collection26 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        java.util.Collection collection27 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener28);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        java.lang.Object obj9 = timeSeries3.clone();
        long long10 = timeSeries3.getMaximumItemAge();
        int int11 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemCount((int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        double double9 = timeSeries3.getMinY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener29);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener31);
        timeSeries26.setMaximumItemAge((long) '#');
        double double35 = timeSeries26.getMinY();
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
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        java.util.Collection collection34 = timeSeries28.getTimePeriods();
        long long35 = timeSeries28.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double40 = timeSeries39.getMaxY();
        timeSeries39.setMaximumItemCount((int) (short) 100);
        boolean boolean43 = timeSeries39.getNotify();
        timeSeries39.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        boolean boolean50 = timeSeries39.equals((java.lang.Object) "");
        java.lang.Class class51 = timeSeries39.getTimePeriodClass();
        java.util.Collection collection52 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        boolean boolean53 = timeSeries28.isEmpty();
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
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(class51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.addOrUpdate(regularTimePeriod16, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries3.removeChangeListener(seriesChangeListener17);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries3.addChangeListener(seriesChangeListener19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.createCopy(regularTimePeriod21, regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
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
        timeSeries3.setDomainDescription("");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        java.lang.Object obj7 = timeSeries3.clone();
        timeSeries3.clear();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        timeSeries28.setDomainDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries28.removeChangeListener(seriesChangeListener34);
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
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries20.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries10.removeChangeListener(seriesChangeListener14);
        java.lang.Class class16 = timeSeries10.getTimePeriodClass();
        java.lang.String str17 = timeSeries10.getRangeDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
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
        timeSeries19.removePropertyChangeListener(propertyChangeListener34);
        timeSeries19.setMaximumItemAge((long) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
            timeSeries8.delete((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setDescription("Overwritten values from:  ");
        timeSeries3.setDomainDescription("");
        java.lang.Comparable comparable15 = timeSeries3.getKey();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(regularTimePeriod38, (double) 0.0f);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from:  ", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
        long long6 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries8.removeAgedItems(100L, false);
        java.lang.String str12 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double24 = timeSeries23.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries18.addAndOrUpdate(timeSeries23);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double35 = timeSeries34.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries29.addAndOrUpdate(timeSeries34);
        java.util.Collection collection37 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        java.util.Collection collection38 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        timeSeries8.setMaximumItemAge((long) (short) 100);
        timeSeries8.setNotify(false);
        java.util.List list43 = timeSeries8.getItems();
        timeSeries8.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries1.addAndOrUpdate(timeSeries8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries14.getMinY();
        long long17 = timeSeries14.getMaximumItemAge();
        java.util.List list18 = timeSeries14.getItems();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries33.removeAgedItems(100L, false);
        java.lang.String str37 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double44 = timeSeries43.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double49 = timeSeries48.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries43.addAndOrUpdate(timeSeries48);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double60 = timeSeries59.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries54.addAndOrUpdate(timeSeries59);
        java.util.Collection collection62 = timeSeries50.getTimePeriodsUniqueToOtherSeries(timeSeries61);
        java.util.Collection collection63 = timeSeries33.getTimePeriodsUniqueToOtherSeries(timeSeries61);
        java.lang.String str64 = timeSeries33.getDescription();
        java.lang.Class<?> wildcardClass65 = timeSeries33.getClass();
        boolean boolean66 = timeSeries21.equals((java.lang.Object) wildcardClass65);
        timeSeries21.setMaximumItemAge(0L);
        java.lang.String str69 = timeSeries21.getDescription();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        timeSeries3.setDomainDescription("Value");
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.createCopy(0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        timeSeries50.setMaximumItemAge((long) ' ');
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries50.addAndOrUpdate(timeSeries56);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number59 = timeSeries57.getValue(regularTimePeriod58);
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
        org.junit.Assert.assertNotNull(timeSeries57);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems((long) 10, false);
        timeSeries3.setDomainDescription("Overwritten values from:  ");
        timeSeries3.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener14);
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries25.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj28 = timeSeries25.clone();
        java.util.Collection collection29 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries10.addAndOrUpdate(timeSeries18);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        long long5 = timeSeries3.getMaximumItemAge();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        java.lang.String str8 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries12);
        java.lang.String str14 = timeSeries3.getDomainDescription();
        java.util.Collection collection15 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
        java.lang.Object obj39 = null;
        boolean boolean40 = timeSeries3.equals(obj39);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }
}


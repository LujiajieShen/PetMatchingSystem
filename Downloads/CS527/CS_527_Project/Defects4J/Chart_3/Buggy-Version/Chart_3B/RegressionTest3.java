import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        java.lang.Class class33 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod34, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
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
        org.junit.Assert.assertNull(class33);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem37, true);
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
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        java.lang.Class<?> wildcardClass17 = timeSeries10.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries20 = timeSeries8.createCopy(regularTimePeriod18, regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        timeSeries10.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries40.removeAgedItems(100L, false);
        java.lang.String str44 = timeSeries40.getRangeDescription();
        timeSeries40.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double51 = timeSeries50.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double56 = timeSeries55.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries50.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double62 = timeSeries61.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double67 = timeSeries66.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries61.addAndOrUpdate(timeSeries66);
        java.util.Collection collection69 = timeSeries57.getTimePeriodsUniqueToOtherSeries(timeSeries68);
        java.util.Collection collection70 = timeSeries40.getTimePeriodsUniqueToOtherSeries(timeSeries68);
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener71);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries10.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem74 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem74);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(timeSeries68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(timeSeries73);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        java.util.List list8 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries12.removeAgedItems(100L, false);
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries22.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double34 = timeSeries33.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double39 = timeSeries38.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries33.addAndOrUpdate(timeSeries38);
        java.util.Collection collection41 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        java.util.Collection collection42 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        timeSeries40.fireSeriesChanged();
        boolean boolean44 = timeSeries40.isEmpty();
        boolean boolean45 = timeSeries40.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries46.add(timeSeriesDataItem47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (double) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod19, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.lang.Comparable comparable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.setKey(comparable32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
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
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.addChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        java.lang.String str8 = timeSeries3.getRangeDescription();
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        long long13 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries12);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener19);
        timeSeries18.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.lang.Class<?> wildcardClass26 = timeSeries18.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj6 = timeSeries3.clone();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setNotify(true);
        java.lang.Comparable comparable10 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod11, (java.lang.Number) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 100 + "'", comparable10, 100);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number77 = timeSeries75.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(true);
        timeSeries3.setDomainDescription("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        timeSeries3.setRangeDescription("Value");
        boolean boolean16 = timeSeries3.getNotify();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        double double27 = timeSeries15.getMinY();
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
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries28.getNextTimePeriod();
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        long long2 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(10L, true);
        int int6 = timeSeries1.getMaximumItemCount();
        double double7 = timeSeries1.getMaxY();
        timeSeries1.setRangeDescription("Time");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        java.util.List list8 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries12.removeAgedItems(100L, false);
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries22.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double34 = timeSeries33.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double39 = timeSeries38.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries33.addAndOrUpdate(timeSeries38);
        java.util.Collection collection41 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        java.util.Collection collection42 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        timeSeries40.fireSeriesChanged();
        boolean boolean44 = timeSeries40.isEmpty();
        boolean boolean45 = timeSeries40.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries40);
        timeSeries3.removeAgedItems((long) 2147483647, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.addChangeListener(seriesChangeListener26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod28, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        timeSeries28.setKey((java.lang.Comparable) 100.0d);
        timeSeries28.setDomainDescription("Value");
        java.lang.Class<?> wildcardClass36 = timeSeries28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        java.lang.Object obj6 = timeSeries3.clone();
        int int7 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        timeSeries11.setKey((java.lang.Comparable) 10.0d);
        java.util.Collection collection15 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update(regularTimePeriod16, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        java.lang.Class<?> wildcardClass19 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Value");
        boolean boolean4 = timeSeries3.isEmpty();
        double double5 = timeSeries3.getMaxY();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        timeSeries4.fireSeriesChanged();
        java.util.Collection collection6 = timeSeries4.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        java.util.List list51 = timeSeries26.getItems();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(list51);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(1L, false);
        boolean boolean14 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "", "");
        timeSeries3.setMaximumItemAge((long) 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        int int36 = timeSeries28.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries28.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener12);
        timeSeries3.clear();
        java.lang.Comparable comparable15 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.addOrUpdate(regularTimePeriod17, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem63 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries59.add(timeSeriesDataItem63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setNotify(true);
        timeSeries10.setNotify(true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        java.lang.Object obj11 = timeSeries3.clone();
        timeSeries3.setMaximumItemAge(0L);
        long long14 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) '4', 2147483647);
        timeSeries15.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries15.removeChangeListener(seriesChangeListener20);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        timeSeries1.setMaximumItemAge((long) 0);
        java.util.Collection collection10 = timeSeries1.getTimePeriods();
        java.lang.Class class11 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.addOrUpdate(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 1, 100);
        timeSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(timeSeriesDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        boolean boolean9 = timeSeries1.getNotify();
        java.lang.String str10 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from:  ", "");
        timeSeries3.setKey((java.lang.Comparable) 100.0d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        timeSeries1.setDescription("");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "", "Value");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries36.add(regularTimePeriod37, (double) 10, true);
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
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
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
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries15.removeAgedItems(100L, false);
        java.lang.String str19 = timeSeries15.getRangeDescription();
        double double20 = timeSeries15.getMinY();
        int int21 = timeSeries15.getMaximumItemCount();
        boolean boolean22 = timeSeries10.equals((java.lang.Object) int21);
        timeSeries10.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries10.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        timeSeries3.setDomainDescription("");
        timeSeries3.setMaximumItemAge((long) 0);
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries1.getValue(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        timeSeries3.setNotify(false);
        timeSeries3.setDescription("");
        double double11 = timeSeries3.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        boolean boolean41 = timeSeries3.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        timeSeries1.clear();
        timeSeries1.removeAgedItems(true);
        timeSeries1.setRangeDescription("Time");
        timeSeries1.setMaximumItemAge((long) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate(regularTimePeriod9, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number55 = timeSeries1.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "");
        timeSeries1.setRangeDescription("");
        java.lang.String str4 = timeSeries1.getDescription();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("hi!");
        int int13 = timeSeries10.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.fireSeriesChanged();
        java.lang.Object obj17 = timeSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = timeSeries5.getKey();
        timeSeries5.setRangeDescription("");
        timeSeries5.removeAgedItems((long) '4', false);
        timeSeries5.setDomainDescription("Value");
        java.util.Collection collection16 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        java.lang.String str17 = timeSeries5.getDescription();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + ' ' + "'", comparable8, ' ');
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.String str14 = timeSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        timeSeries1.setDescription("");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        timeSeries1.setNotify(true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        timeSeries15.setDomainDescription("hi!");
        long long27 = timeSeries15.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.util.List list6 = timeSeries1.getItems();
        java.lang.String str7 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        timeSeries3.setDescription("Overwritten values from: Overwritten values from:  ");
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
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries3.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.Object obj9 = timeSeries3.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        double double14 = timeSeries3.getMaxY();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries35.addPropertyChangeListener(propertyChangeListener36);
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemAge(0L);
        java.util.List list9 = timeSeries1.getItems();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setKey((java.lang.Comparable) 10);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        timeSeries3.removeAgedItems((long) 10, false);
        java.lang.Comparable comparable12 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + ' ' + "'", comparable12, ' ');
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        boolean boolean7 = timeSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener8);
        timeSeries3.setKey((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(false);
        double double12 = timeSeries3.getMinY();
        timeSeries3.removeAgedItems((long) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        double double11 = timeSeries1.getMinY();
        long long12 = timeSeries1.getMaximumItemAge();
        java.lang.String str13 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Overwritten values from:  " + "'", str13, "Overwritten values from:  ");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.String str7 = timeSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.addChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + ' ' + "'", comparable14, ' ');
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "", "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "Overwritten values from: Overwritten values from:  ", "Value");
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
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) 0, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setKey((java.lang.Comparable) (-1.0f));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        boolean boolean7 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) 'a', 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.clear();
        double double8 = timeSeries1.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        int int4 = timeSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "Overwritten values from:  ");
        timeSeries3.removeAgedItems(0L, true);
        int int7 = timeSeries3.getItemCount();
        java.lang.Object obj8 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        double double10 = timeSeries3.getMaxY();
        timeSeries3.setDomainDescription("Value");
        long long13 = timeSeries3.getMaximumItemAge();
        timeSeries3.removeAgedItems((long) '#', true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod21, (double) (-1.0f));
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem51 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries42.add(timeSeriesDataItem51, false);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.setMaximumItemAge((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener31);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries10.removeChangeListener(seriesChangeListener33);
        boolean boolean35 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem36, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        long long15 = timeSeries10.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        boolean boolean32 = timeSeries21.isEmpty();
        timeSeries21.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(timeSeriesDataItem35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) '4', 2147483647);
        timeSeries15.setMaximumItemCount((int) ' ');
        long long18 = timeSeries15.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries22.removeAgedItems(100L, false);
        java.lang.String str26 = timeSeries22.getRangeDescription();
        int int27 = timeSeries22.getMaximumItemCount();
        timeSeries22.clear();
        timeSeries22.setDomainDescription("Value");
        java.util.Collection collection31 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 1, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries14.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
            timeSeries3.update(regularTimePeriod20, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries28.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(true);
        timeSeries1.removeAgedItems(true);
        timeSeries1.setMaximumItemCount(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        boolean boolean37 = timeSeries20.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem43, true);
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
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        int int24 = timeSeries8.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        timeSeries10.setDomainDescription("Overwritten values from: Overwritten values from:  ");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        java.lang.Class class35 = timeSeries31.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(class35);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        timeSeries3.removeAgedItems(false);
        boolean boolean41 = timeSeries3.getNotify();
        java.lang.Object obj42 = timeSeries3.clone();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) '4', false);
        timeSeries3.setDomainDescription("Value");
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries55.update((int) (short) -1, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("hi!");
        timeSeries3.setMaximumItemAge((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = timeSeries5.getKey();
        timeSeries5.setRangeDescription("");
        timeSeries5.removeAgedItems((long) '4', false);
        timeSeries5.setDomainDescription("Value");
        java.util.Collection collection16 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries1.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + ' ' + "'", comparable8, ' ');
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        double double15 = timeSeries10.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(2147483647, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) '4', 2147483647);
        timeSeries15.setMaximumItemCount((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(97, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.createCopy(regularTimePeriod17, regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries28.getDataItem(regularTimePeriod37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setNotify(true);
        boolean boolean14 = timeSeries10.isEmpty();
        java.lang.String str15 = timeSeries10.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy((int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        java.lang.Class class33 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod34, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
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
        org.junit.Assert.assertNull(class33);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries3.getDomainDescription();
        java.lang.Comparable comparable15 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.addOrUpdate(regularTimePeriod16, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        timeSeries8.removeAgedItems(true);
        timeSeries8.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod20, (double) (byte) 100);
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
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod6, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#');
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries5.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries5.addAndOrUpdate(timeSeries11);
        java.lang.String str14 = timeSeries11.getDomainDescription();
        java.lang.Comparable comparable15 = timeSeries11.getKey();
        java.util.Collection collection16 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0.0f + "'", comparable15, 0.0f);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "", "hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
        java.lang.Class class6 = timeSeries3.getTimePeriodClass();
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy(regularTimePeriod9, regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener31);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries10.removeChangeListener(seriesChangeListener33);
        java.lang.Comparable comparable35 = timeSeries10.getKey();
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
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + "Overwritten values from:  " + "'", comparable35, "Overwritten values from:  ");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.createCopy((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double42 = timeSeries41.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double47 = timeSeries46.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries41.addAndOrUpdate(timeSeries46);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double53 = timeSeries52.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double58 = timeSeries57.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries52.addAndOrUpdate(timeSeries57);
        java.util.Collection collection60 = timeSeries48.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class65 = timeSeries64.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries48.addAndOrUpdate(timeSeries64);
        timeSeries66.clear();
        timeSeries66.setNotify(false);
        timeSeries66.setMaximumItemCount((int) 'a');
        timeSeries66.fireSeriesChanged();
        java.lang.Object obj73 = timeSeries66.clone();
        int int74 = timeSeries66.getMaximumItemCount();
        java.lang.String str75 = timeSeries66.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries3.addAndOrUpdate(timeSeries66);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(class65);
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 97 + "'", int74 == 97);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Time" + "'", str75, "Time");
        org.junit.Assert.assertNotNull(timeSeries76);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeSeries1.getIndex(regularTimePeriod23);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int56 = timeSeries54.getIndex(regularTimePeriod55);
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(timeSeries54);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.removeAgedItems(true);
        java.lang.String str13 = timeSeries8.getRangeDescription();
        timeSeries8.setDescription("Overwritten values from:  ");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.clear();
        double double8 = timeSeries1.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        timeSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (double) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        java.util.List list26 = timeSeries15.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.update((int) (short) 100, (java.lang.Number) (short) 100);
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        timeSeries10.setDomainDescription("Time");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries26.removeChangeListener(seriesChangeListener35);
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        timeSeries3.setMaximumItemCount(1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("");
        timeSeries3.setNotify(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "Time", "Time");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "hi!");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        timeSeries16.setKey((java.lang.Comparable) (short) -1);
        timeSeries16.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = timeSeries16.getValue(regularTimePeriod32);
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries9.setNotify(false);
        boolean boolean12 = timeSeries3.equals((java.lang.Object) false);
        timeSeries3.removeAgedItems(false);
        timeSeries3.clear();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from:  ");
        java.util.List list18 = timeSeries3.getItems();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.setRangeDescription("");
        timeSeries1.setDescription("Overwritten values from:  ");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        timeSeries3.removeAgedItems((long) 100, true);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        int int19 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(2147483647, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        java.lang.Class<?> wildcardClass65 = collection64.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Comparable comparable13 = timeSeries10.getKey();
        timeSeries10.removeAgedItems(100L, true);
        timeSeries10.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries10.removeChangeListener(seriesChangeListener19);
        boolean boolean21 = timeSeries10.isEmpty();
        timeSeries10.setRangeDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener24);
        boolean boolean26 = timeSeries3.equals((java.lang.Object) timeSeries10);
        double double27 = timeSeries3.getMinY();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + ' ' + "'", comparable13, ' ');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems(false);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.addOrUpdate(regularTimePeriod13, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener12);
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries3.setDescription("");
        java.lang.Class<?> wildcardClass13 = timeSeries3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener27);
        timeSeries16.setKey((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries16.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "Overwritten values from:  ", "Overwritten values from:  ");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        int int34 = timeSeries31.getItemCount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.lang.Comparable comparable5 = timeSeries3.getKey();
        long long6 = timeSeries3.getMaximumItemAge();
        double double7 = timeSeries3.getMaxY();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 100L + "'", comparable5, 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        boolean boolean7 = timeSeries3.isEmpty();
        long long8 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        double double11 = timeSeries3.getMaxY();
        timeSeries3.setDescription("Time");
        timeSeries3.removeAgedItems(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        boolean boolean36 = timeSeries19.getNotify();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + ' ' + "'", comparable27, ' ');
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod23, (double) ' ', false);
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
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        int int35 = timeSeries28.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete(100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj6 = timeSeries3.clone();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setNotify(true);
        java.lang.Comparable comparable10 = timeSeries3.getKey();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.addChangeListener(seriesChangeListener11);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 100 + "'", comparable10, 100);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        double double7 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double17 = timeSeries16.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries16);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries11.addChangeListener(seriesChangeListener19);
        boolean boolean21 = timeSeries3.equals((java.lang.Object) timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod22, (java.lang.Number) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "", "hi!");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.addAndOrUpdate(timeSeries12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries3.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "Overwritten values from:  ", "Overwritten values from: Overwritten values from:  ");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.addOrUpdate(regularTimePeriod19, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries20.getTimePeriod((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        timeSeries3.setKey((java.lang.Comparable) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries31.removeChangeListener(seriesChangeListener35);
        timeSeries31.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries31.addOrUpdate(regularTimePeriod39, (java.lang.Number) 1L);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("");
        boolean boolean12 = timeSeries3.getNotify();
        timeSeries3.setRangeDescription("Value");
        double double15 = timeSeries3.getMaxY();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        timeSeries3.fireSeriesChanged();
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Overwritten values from:  " + "'", str4, "Overwritten values from:  ");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        boolean boolean26 = timeSeries25.isEmpty();
        java.util.List list27 = timeSeries25.getItems();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setKey((java.lang.Comparable) 10);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (double) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from:  ", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        java.lang.String str8 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "", "Time");
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries12);
        boolean boolean14 = timeSeries12.isEmpty();
        timeSeries12.clear();
        timeSeries12.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        java.lang.String str6 = timeSeries3.getDescription();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.setMaximumItemAge((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries10.addOrUpdate(timeSeriesDataItem33);
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
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.lang.Object obj5 = timeSeries3.clone();
        int int6 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (double) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 97);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        double double20 = timeSeries10.getMaxY();
        long long21 = timeSeries10.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj6 = timeSeries3.clone();
        double double7 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries11.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries11.addAndOrUpdate(timeSeries17);
        java.lang.String str20 = timeSeries17.getDomainDescription();
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod22, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        long long8 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setDomainDescription("hi!");
        int int9 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        timeSeries10.removeAgedItems(true);
        java.lang.String str25 = timeSeries10.getDomainDescription();
        java.lang.String str26 = timeSeries10.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem36, false);
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
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        timeSeries3.setDescription("Time");
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
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        java.lang.String str10 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy(97, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.delete((int) (byte) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("hi!");
        double double9 = timeSeries3.getMinY();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        java.lang.Class class11 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from:  ", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeSeries3.getIndex(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod17, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setDescription("Overwritten values from:  ");
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        timeSeries3.setDescription("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(timeSeriesDataItem31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        timeSeries10.setMaximumItemAge(1L);
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
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        java.lang.String str9 = timeSeries3.getDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        int int25 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Overwritten values from:  " + "'", str4, "Overwritten values from:  ");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries8.getTimePeriod((int) (byte) -1);
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
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("Value");
        java.util.List list17 = timeSeries10.getItems();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setMaximumItemAge((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries3.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        java.lang.Class class13 = timeSeries8.getTimePeriodClass();
        java.util.List list14 = timeSeries8.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod15, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod2, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(true);
        timeSeries1.removeAgedItems(true);
        double double10 = timeSeries1.getMinY();
        boolean boolean11 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod8, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        timeSeries1.setMaximumItemAge(1L);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timeSeries1.equals((java.lang.Object) propertyChangeListener8);
        java.lang.String str11 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        java.lang.Object obj18 = timeSeries8.clone();
        java.lang.String str19 = timeSeries8.getRangeDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.List list12 = timeSeries10.getItems();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        timeSeries24.removeAgedItems(0L, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.update((int) ' ', (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
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
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        java.lang.String str14 = timeSeries10.getDomainDescription();
        java.util.Collection collection15 = timeSeries10.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        timeSeries1.clear();
        timeSeries1.removeAgedItems(true);
        timeSeries1.setRangeDescription("Time");
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Comparable comparable13 = timeSeries10.getKey();
        timeSeries10.removeAgedItems(100L, true);
        timeSeries10.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries10.removeChangeListener(seriesChangeListener19);
        boolean boolean21 = timeSeries10.isEmpty();
        timeSeries10.setRangeDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener24);
        boolean boolean26 = timeSeries3.equals((java.lang.Object) timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod27, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + ' ' + "'", comparable13, ' ');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener41);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries3.addChangeListener(seriesChangeListener43);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries3.addOrUpdate(regularTimePeriod45, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        java.lang.String str19 = timeSeries18.getRangeDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        java.lang.String str35 = timeSeries10.getDescription();
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
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        java.lang.Object obj11 = timeSeries3.clone();
        timeSeries3.setMaximumItemAge(0L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        timeSeries3.removeAgedItems((long) (short) 0, false);
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
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem50);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        java.lang.Comparable comparable45 = timeSeries28.getKey();
        timeSeries28.setNotify(false);
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
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + "Overwritten values from: Overwritten values from:  " + "'", comparable45, "Overwritten values from: Overwritten values from:  ");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(2147483647, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        timeSeries35.setRangeDescription("Overwritten values from:  ");
        java.lang.Comparable comparable43 = timeSeries35.getKey();
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
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + "Overwritten values from:  " + "'", comparable43, "Overwritten values from:  ");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = timeSeries3.getIndex(regularTimePeriod39);
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
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) '4', 2147483647);
        timeSeries15.removeAgedItems(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDescription("hi!");
        timeSeries8.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries8.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        double double8 = timeSeries1.getMinY();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 1, 100);
        timeSeries6.setMaximumItemAge((long) 2147483647);
        int int9 = timeSeries6.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries6.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener12);
        timeSeries3.clear();
        java.lang.Comparable comparable15 = timeSeries3.getKey();
        java.lang.Class<?> wildcardClass16 = timeSeries3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        timeSeries1.setMaximumItemAge(1L);
        java.lang.Comparable comparable8 = timeSeries1.getKey();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.String str6 = timeSeries3.getDomainDescription();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        double double8 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries12.removeAgedItems(100L, false);
        java.lang.String str16 = timeSeries12.getRangeDescription();
        java.util.Collection collection17 = timeSeries12.getTimePeriods();
        java.lang.Comparable comparable18 = timeSeries12.getKey();
        timeSeries12.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries24.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double36 = timeSeries35.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double41 = timeSeries40.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries35.addAndOrUpdate(timeSeries40);
        java.util.Collection collection43 = timeSeries31.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class48 = timeSeries47.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries31.addAndOrUpdate(timeSeries47);
        boolean boolean50 = timeSeries31.isEmpty();
        timeSeries31.setDomainDescription("Overwritten values from:  ");
        boolean boolean53 = timeSeries31.isEmpty();
        java.util.Collection collection54 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        timeSeries31.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries3.addAndOrUpdate(timeSeries31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + ' ' + "'", comparable18, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(class48);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(timeSeries57);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        long long34 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries8.addOrUpdate(timeSeriesDataItem19);
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
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "", "hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
        timeSeries3.removeAgedItems(true);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) (short) -1);
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod9, number10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "Overwritten values from:  ", "");
        timeSeries3.fireSeriesChanged();
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = timeSeries3.getValue(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        timeSeries3.setNotify(false);
        int int6 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "Time", "Overwritten values from:  ");
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
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        timeSeries4.fireSeriesChanged();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        timeSeries4.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "hi!");
        boolean boolean4 = timeSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        boolean boolean13 = timeSeries3.getNotify();
        java.util.Collection collection14 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, (double) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.delete((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, "hi!", "Value");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        timeSeries3.setDescription("Overwritten values from: Overwritten values from:  ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems(false);
        java.util.Collection collection12 = timeSeries3.getTimePeriods();
        timeSeries3.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double24 = timeSeries23.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries18.addAndOrUpdate(timeSeries23);
        timeSeries25.setDomainDescription("");
        long long28 = timeSeries25.getMaximumItemAge();
        java.lang.Object obj29 = timeSeries25.clone();
        int int30 = timeSeries25.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries34.removeAgedItems(100L, false);
        java.lang.String str38 = timeSeries34.getRangeDescription();
        double double39 = timeSeries34.getMaxY();
        double double40 = timeSeries34.getMinY();
        java.lang.Object obj41 = timeSeries34.clone();
        timeSeries34.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries25.addAndOrUpdate(timeSeries34);
        java.util.Collection collection45 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9223372036854775807L + "'", long28 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        double double13 = timeSeries11.getMinY();
        java.lang.Class<?> wildcardClass14 = timeSeries11.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        java.lang.String str26 = timeSeries8.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries29 = timeSeries8.createCopy((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.Object obj7 = timeSeries3.clone();
        timeSeries3.setDescription("Overwritten values from:  ");
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        timeSeries26.fireSeriesChanged();
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.lang.Class<?> wildcardClass4 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        timeSeries1.setDescription("Overwritten values from: Overwritten values from:  ");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getDescription();
        double double11 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        timeSeries10.removeAgedItems(true);
        java.lang.String str25 = timeSeries10.getDomainDescription();
        timeSeries10.setRangeDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod28, (java.lang.Number) 0.0d);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(true);
        timeSeries1.removeAgedItems(true);
        double double10 = timeSeries1.getMinY();
        java.lang.Comparable comparable11 = timeSeries1.getKey();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 0 + "'", comparable11, (short) 0);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        double double7 = timeSeries3.getMaxY();
        int int8 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        double double14 = timeSeries3.getMaxY();
        double double15 = timeSeries3.getMinY();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries15.addOrUpdate(regularTimePeriod27, (java.lang.Number) Double.NaN);
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
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
            timeSeries10.delete((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "", "Time");
        java.util.List list4 = timeSeries3.getItems();
        java.lang.String str5 = timeSeries3.getDescription();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod3, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        timeSeries1.fireSeriesChanged();
        int int3 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries3.getMinY();
        java.lang.Comparable comparable12 = timeSeries3.getKey();
        boolean boolean13 = timeSeries3.isEmpty();
        int int14 = timeSeries3.getItemCount();
        java.lang.String str15 = timeSeries3.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + ' ' + "'", comparable12, ' ');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setMaximumItemAge((long) '4');
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        timeSeries8.setDescription("Overwritten values from: Overwritten values from:  ");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener10);
        timeSeries3.setDomainDescription("Value");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        timeSeries3.setKey((java.lang.Comparable) 'a');
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        timeSeries44.setKey((java.lang.Comparable) 97);
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
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        timeSeries3.setRangeDescription("");
        timeSeries3.setNotify(false);
        java.lang.String str10 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries14.removeAgedItems(100L, false);
        int int18 = timeSeries14.getItemCount();
        java.lang.String str19 = timeSeries14.getDescription();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.lang.Comparable comparable26 = timeSeries23.getKey();
        timeSeries23.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries14.addAndOrUpdate(timeSeries23);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener32);
        java.lang.Class class34 = timeSeries31.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = timeSeries14.equals((java.lang.Object) propertyChangeListener35);
        timeSeries14.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + ' ' + "'", comparable26, ' ');
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries3.getMinY();
        timeSeries3.setRangeDescription("Time");
        timeSeries3.removeAgedItems((long) (byte) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) -1, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setKey((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        int int6 = timeSeries1.getItemCount();
        timeSeries1.removeAgedItems((long) (byte) 0, false);
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod22, (java.lang.Number) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries25.addChangeListener(seriesChangeListener26);
        int int28 = timeSeries25.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        timeSeries10.removeAgedItems(true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        java.lang.Object obj9 = timeSeries3.clone();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.fireSeriesChanged();
        timeSeries3.setMaximumItemAge((long) 2147483647);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener15);
        timeSeries3.removeAgedItems(true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        timeSeries4.removeAgedItems((long) '4', true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries4.addOrUpdate(regularTimePeriod8, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        timeSeries10.setMaximumItemAge((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries33 = timeSeries10.createCopy(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries31.delete((int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) '4', 2147483647);
        timeSeries15.setRangeDescription("hi!");
        timeSeries15.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        timeSeries1.setMaximumItemCount((int) '4');
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        timeSeries7.clear();
        java.util.Collection collection9 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        java.lang.Class class39 = timeSeries3.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener40);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number43 = timeSeries3.getValue(regularTimePeriod42);
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
        org.junit.Assert.assertNull(class39);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(0, (int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        timeSeries3.removeAgedItems((long) 2147483647, false);
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int16 = timeSeries15.getItemCount();
        java.lang.Comparable comparable17 = timeSeries15.getKey();
        long long18 = timeSeries15.getMaximumItemAge();
        boolean boolean19 = timeSeries3.equals((java.lang.Object) timeSeries15);
        timeSeries15.setMaximumItemCount(0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries15.removeChangeListener(seriesChangeListener22);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 100L + "'", comparable17, 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        double double9 = timeSeries3.getMaxY();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        timeSeries10.setDescription("hi!");
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
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries31.addOrUpdate(regularTimePeriod35, (java.lang.Number) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.addOrUpdate(regularTimePeriod19, (java.lang.Number) (short) 10);
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
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        timeSeries3.setRangeDescription("Time");
        java.util.Collection collection11 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.addOrUpdate(regularTimePeriod12, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod24, (-1.0d));
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
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        java.util.List list17 = timeSeries3.getItems();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod45, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Value", "Value");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = timeSeries3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 100.0d + "'", comparable7, 100.0d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        timeSeries16.setKey((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeries16.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.addChangeListener(seriesChangeListener10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        timeSeries3.removeAgedItems(false);
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
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        java.lang.Object obj11 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeSeries3.getIndex(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) (short) -1);
        timeSeries3.removeAgedItems((-1L), true);
        timeSeries3.setKey((java.lang.Comparable) 1.0d);
        timeSeries3.clear();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Time", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.setKey((java.lang.Comparable) (-1.0f));
        java.lang.String str13 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries8.addChangeListener(seriesChangeListener22);
        java.lang.Class class24 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod25, (double) 100.0f, true);
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
        org.junit.Assert.assertNull(class24);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        java.lang.Number number15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries10.addOrUpdate(regularTimePeriod14, number15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = timeSeries10.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Class class6 = timeSeries3.getTimePeriodClass();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        timeSeries8.setDescription("Time");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        java.util.List list14 = timeSeries3.getItems();
        java.lang.Class class15 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries3.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj6 = timeSeries3.clone();
        double double7 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries11.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries11.addAndOrUpdate(timeSeries17);
        java.lang.String str20 = timeSeries17.getDomainDescription();
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        double double22 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "Overwritten values from:  ", "");
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
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        double double10 = timeSeries3.getMaxY();
        java.lang.String str11 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, number13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        long long5 = timeSeries3.getMaximumItemAge();
        timeSeries3.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries3.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        timeSeries8.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener13);
        java.lang.String str15 = timeSeries10.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries10.addOrUpdate(regularTimePeriod16, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        int int17 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge((long) ' ');
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        timeSeries8.removeAgedItems(true);
        timeSeries8.setNotify(true);
        java.lang.String str20 = timeSeries8.getDescription();
        double double21 = timeSeries8.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        timeSeries10.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener16);
        boolean boolean18 = timeSeries10.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod15, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.removeChangeListener(seriesChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "Overwritten values from:  ", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod4, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries49.delete(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + ' ' + "'", comparable52, ' ');
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 9223372036854775807L + "'", long60 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(timeSeries65);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        timeSeries3.setNotify(false);
        boolean boolean9 = timeSeries3.isEmpty();
        double double10 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) '4', 2147483647);
        timeSeries15.setRangeDescription("hi!");
        int int18 = timeSeries15.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries15.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        int int17 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "Value");
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
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener41);
        java.lang.Class class43 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(class43);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.setRangeDescription("");
        timeSeries1.setDescription("Overwritten values from:  ");
        timeSeries1.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        java.lang.String str8 = timeSeries3.getDomainDescription();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        int int30 = timeSeries29.getMaximumItemCount();
        java.util.Collection collection31 = timeSeries29.getTimePeriods();
        boolean boolean32 = timeSeries8.equals((java.lang.Object) collection31);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries1.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        timeSeries35.fireSeriesChanged();
        double double43 = timeSeries35.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries35.addOrUpdate(regularTimePeriod44, (java.lang.Number) (byte) -1);
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
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        java.lang.String str8 = timeSeries3.getRangeDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
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
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        java.lang.Class<?> wildcardClass22 = timeSeries8.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "", "Time");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries3.addChangeListener(seriesChangeListener24);
        java.util.List list26 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("hi!");
        int int13 = timeSeries10.getMaximumItemCount();
        java.util.Collection collection14 = timeSeries10.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        java.lang.Class<?> wildcardClass26 = timeSeries11.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries31.createCopy(10, (int) (short) 100);
        timeSeries37.setMaximumItemAge((long) ' ');
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
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries10.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "", "Overwritten values from:  ");
        int int4 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries3.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.update(regularTimePeriod36, (java.lang.Number) (-1.0d));
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
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(0, (int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = timeSeries10.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries32.addPropertyChangeListener(propertyChangeListener41);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = timeSeries21.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        timeSeries19.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries24.setDescription("hi!");
        java.lang.String str27 = timeSeries24.getDomainDescription();
        double double28 = timeSeries24.getMaxY();
        java.util.Collection collection29 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries3.getDomainDescription();
        int int15 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems((long) 97, false);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        java.lang.Object obj9 = timeSeries3.clone();
        java.lang.String str10 = timeSeries3.getDomainDescription();
        java.lang.String str11 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        org.jfree.data.time.TimeSeries timeSeries35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection36 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        timeSeries1.setDescription("");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        timeSeries1.setRangeDescription("hi!");
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(false);
        java.lang.String str12 = timeSeries3.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        timeSeries1.setRangeDescription("Overwritten values from:  ");
        timeSeries1.setMaximumItemCount((int) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        timeSeries10.removePropertyChangeListener(propertyChangeListener34);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries10.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries10.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener30);
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
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        timeSeries3.setKey((java.lang.Comparable) (byte) 0);
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
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        double double34 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries3.addOrUpdate(timeSeriesDataItem35);
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
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        timeSeries1.clear();
        timeSeries1.removeAgedItems(true);
        timeSeries1.setRangeDescription("Time");
        timeSeries1.setMaximumItemAge((long) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        double double11 = timeSeries3.getMaxY();
        java.lang.String str12 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems(0L, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getDataItem(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        int int60 = timeSeries48.getMaximumItemCount();
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        timeSeries49.removePropertyChangeListener(propertyChangeListener66);
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
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        timeSeries26.setKey((java.lang.Comparable) (-1L));
        timeSeries26.fireSeriesChanged();
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
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        long long6 = timeSeries3.getMaximumItemAge();
        timeSeries3.setDomainDescription("Time");
        timeSeries3.setMaximumItemAge((long) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        timeSeries1.removeAgedItems((long) 10, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.addOrUpdate(regularTimePeriod5, number6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(false);
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
            java.lang.Number number16 = timeSeries3.getValue(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
            org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries32.getTimePeriod((int) (byte) 1);
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
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener41);
        java.lang.Object obj43 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem51 = timeSeries42.addOrUpdate(timeSeriesDataItem50);
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        long long25 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries3.getTimePeriod(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Overwritten values from:  " + "'", str4, "Overwritten values from:  ");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223372036854775807L + "'", long25 == 9223372036854775807L);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        timeSeries10.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDescription("");
        int int13 = timeSeries10.getMaximumItemCount();
        timeSeries10.clear();
        java.lang.Comparable comparable15 = timeSeries10.getKey();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Overwritten values from:  " + "'", comparable15, "Overwritten values from:  ");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "Value");
        timeSeries3.setMaximumItemAge((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries19);
        double double22 = timeSeries21.getMinY();
        boolean boolean23 = timeSeries21.getNotify();
        timeSeries21.setDomainDescription("hi!");
        boolean boolean26 = timeSeries3.equals((java.lang.Object) "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries3.addOrUpdate(regularTimePeriod27, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener42);
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
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        java.lang.Comparable comparable49 = timeSeries1.getKey();
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
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 10 + "'", comparable49, 10);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        long long2 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(true);
        int int5 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        timeSeries3.setMaximumItemCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod46, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setKey((java.lang.Comparable) "Overwritten values from:  ");
        int int5 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        double double10 = timeSeries3.getMaxY();
        timeSeries3.setDomainDescription("Value");
        java.lang.String str13 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries3.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100);
        timeSeries1.clear();
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
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
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        java.lang.Comparable comparable30 = timeSeries10.getKey();
        timeSeries10.setMaximumItemCount((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + "Overwritten values from:  " + "'", comparable30, "Overwritten values from:  ");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Class class6 = timeSeries3.getTimePeriodClass();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertNull(class6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        timeSeries19.setDomainDescription("Overwritten values from: Overwritten values from:  ");
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
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Time", "");
        int int4 = timeSeries3.getItemCount();
        java.lang.String str5 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener12);
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "");
        boolean boolean19 = timeSeries3.equals((java.lang.Object) "");
        java.util.Collection collection20 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDescription("hi!");
        timeSeries8.fireSeriesChanged();
        java.lang.String str14 = timeSeries8.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries3.addOrUpdate(regularTimePeriod44, (java.lang.Number) (-1.0d));
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
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) '4', 2147483647);
        timeSeries15.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod20, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "", "Time");
        timeSeries3.setKey((java.lang.Comparable) (byte) 100);
        java.util.Collection collection6 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries3.createCopy((int) (byte) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries31.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("");
        java.util.List list11 = timeSeries3.getItems();
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = timeSeries31.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(true);
        timeSeries1.removeAgedItems(true);
        double double10 = timeSeries1.getMinY();
        java.lang.String str11 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("hi!");
        double double9 = timeSeries3.getMinY();
        int int10 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(2147483647, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        boolean boolean17 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod18, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        double double34 = timeSeries26.getMaxY();
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
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete(regularTimePeriod38);
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
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.lang.Comparable comparable5 = timeSeries3.getKey();
        java.lang.Object obj6 = timeSeries3.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 100L + "'", comparable5, 100L);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.clear();
        double double8 = timeSeries1.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener22);
        timeSeries8.setNotify(true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double49 = timeSeries48.getMaxY();
        timeSeries48.setMaximumItemCount((int) (short) 100);
        boolean boolean52 = timeSeries48.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries48.removeChangeListener(seriesChangeListener53);
        timeSeries48.setKey((java.lang.Comparable) "Value");
        timeSeries48.fireSeriesChanged();
        java.lang.Class class58 = timeSeries48.getTimePeriodClass();
        double double59 = timeSeries48.getMinY();
        java.util.Collection collection60 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries8.getDataItem(regularTimePeriod61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(class58);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        timeSeries3.setNotify(false);
        int int6 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("Value");
        long long9 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries10.addChangeListener(seriesChangeListener21);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        java.util.Collection collection29 = timeSeries10.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries32 = timeSeries10.createCopy(2147483647, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("");
        int int12 = timeSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = timeSeries3.clone();
        java.lang.Class class16 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        java.lang.String str27 = timeSeries14.getRangeDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        timeSeries10.setNotify(false);
        int int37 = timeSeries10.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number50 = timeSeries39.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        boolean boolean34 = timeSeries28.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener35);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        timeSeries3.removeAgedItems((long) (short) -1, true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str2 = timeSeries1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setMaximumItemAge((long) (short) 1);
        java.util.List list8 = timeSeries1.getItems();
        java.lang.Class class9 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.Object obj7 = timeSeries3.clone();
        timeSeries3.setKey((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setKey((java.lang.Comparable) 0);
        long long6 = timeSeries1.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        long long5 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod6, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        boolean boolean36 = timeSeries31.isEmpty();
        java.lang.String str37 = timeSeries31.getDescription();
        java.lang.Class class38 = timeSeries31.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries31.add(timeSeriesDataItem39, false);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(class38);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setKey((java.lang.Comparable) 10);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.addOrUpdate(regularTimePeriod8, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 1, 100);
        timeSeries1.setNotify(false);
        int int9 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem(regularTimePeriod13);
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.lang.Object obj5 = timeSeries3.clone();
        int int6 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemAge(0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (double) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        timeSeries9.clear();
        boolean boolean11 = timeSeries9.isEmpty();
        timeSeries9.setDomainDescription("hi!");
        boolean boolean14 = timeSeries3.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries9.addOrUpdate(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setKey((java.lang.Comparable) 100L);
        java.lang.String str15 = timeSeries8.getRangeDescription();
        timeSeries8.setNotify(true);
        boolean boolean18 = timeSeries8.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries15.setRangeDescription("hi!");
        java.lang.String str18 = timeSeries15.getDomainDescription();
        timeSeries15.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries15.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Time", "hi!");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        timeSeries16.setKey((java.lang.Comparable) (short) -1);
        timeSeries16.setDescription("");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries31.createCopy(10, (int) (short) 100);
        timeSeries31.setNotify(false);
        java.lang.Object obj40 = timeSeries31.clone();
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
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries16.addOrUpdate(regularTimePeriod17, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        timeSeries8.clear();
        int int13 = timeSeries8.getItemCount();
        java.lang.Object obj14 = timeSeries8.clone();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        timeSeries16.setKey((java.lang.Comparable) (short) -1);
        timeSeries16.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries16.addOrUpdate(regularTimePeriod32, (double) 100.0f);
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
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Overwritten values from: Overwritten values from:  ", "Overwritten values from:  ");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.delete(regularTimePeriod21);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Overwritten values from: Overwritten values from:  ", "hi!");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem51 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries50.add(timeSeriesDataItem51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        double double14 = timeSeries3.getMaxY();
        java.lang.Object obj15 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "Overwritten values from:  ", "Overwritten values from: Overwritten values from:  ");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Overwritten values from: Overwritten values from:  " + "'", str4, "Overwritten values from: Overwritten values from:  ");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries10.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        timeSeries28.setKey((java.lang.Comparable) 100.0d);
        timeSeries28.setDomainDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
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
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double13 = timeSeries12.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries12.addAndOrUpdate(timeSeries17);
        timeSeries19.setDomainDescription("");
        long long22 = timeSeries19.getMaximumItemAge();
        java.lang.Object obj23 = timeSeries19.clone();
        int int24 = timeSeries19.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries28.removeAgedItems(100L, false);
        java.lang.String str32 = timeSeries28.getRangeDescription();
        double double33 = timeSeries28.getMaxY();
        double double34 = timeSeries28.getMinY();
        java.lang.Object obj35 = timeSeries28.clone();
        timeSeries28.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries19.addAndOrUpdate(timeSeries28);
        java.util.Collection collection39 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        timeSeries28.setNotify(true);
        java.util.Collection collection42 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries3.addOrUpdate(regularTimePeriod43, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        double double47 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((-1), (java.lang.Number) (byte) -1);
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
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems(true);
        double double9 = timeSeries3.getMinY();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        int int11 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        timeSeries10.removeAgedItems((long) (-1), false);
        timeSeries10.setNotify(true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        java.lang.Comparable comparable26 = timeSeries8.getKey();
        timeSeries8.setDomainDescription("");
        timeSeries8.removeAgedItems((long) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries8.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + ' ' + "'", comparable26, ' ');
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(true);
        timeSeries1.removeAgedItems(true);
        timeSeries1.setMaximumItemCount(0);
        double double12 = timeSeries1.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((-1), (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDescription("");
        double double13 = timeSeries10.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries10.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "");
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        double double10 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.addAndOrUpdate(timeSeries9);
        java.lang.String str12 = timeSeries9.getDomainDescription();
        java.lang.Comparable comparable13 = timeSeries9.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.update(regularTimePeriod14, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0.0f + "'", comparable13, 0.0f);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Time", "Value");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        timeSeries1.removeAgedItems((long) 0, true);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries5.addChangeListener(seriesChangeListener6);
        java.util.Collection collection8 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN, "Overwritten values from: Overwritten values from:  ", "Overwritten values from:  ");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        timeSeries3.clear();
        timeSeries3.setRangeDescription("Time");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "Overwritten values from: Overwritten values from:  ", "hi!");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries5.removeAgedItems(100L, false);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        double double10 = timeSeries5.getMaxY();
        timeSeries5.setDomainDescription("");
        java.util.Collection collection13 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(timeSeriesDataItem14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj6 = timeSeries3.clone();
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = timeSeries26.getIndex(regularTimePeriod31);
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
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        long long2 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(10L, true);
        int int6 = timeSeries1.getMaximumItemCount();
        double double7 = timeSeries1.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        boolean boolean9 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries3.setRangeDescription("Overwritten values from: Overwritten values from:  ");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from:  ");
        timeSeries1.setKey((java.lang.Comparable) (short) 1);
        long long4 = timeSeries1.getMaximumItemAge();
        java.lang.Object obj5 = timeSeries1.clone();
        timeSeries1.setNotify(false);
        double double8 = timeSeries1.getMinY();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener12);
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "");
        boolean boolean19 = timeSeries3.equals((java.lang.Object) "");
        timeSeries3.setRangeDescription("hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        int int18 = timeSeries14.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.removeAgedItems(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        timeSeries3.setRangeDescription("Overwritten values from: Overwritten values from:  ");
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
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.fireSeriesChanged();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        double double14 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries18.setDescription("");
        timeSeries18.clear();
        java.lang.String str22 = timeSeries18.getDomainDescription();
        timeSeries18.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries18.createCopy(0, 0);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries3.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries27.addOrUpdate(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "", "Overwritten values from: Overwritten values from:  ");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod2, (java.lang.Number) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        double double7 = timeSeries3.getMinY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(regularTimePeriod10, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        timeSeries3.clear();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        java.util.List list8 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries12.removeAgedItems(100L, false);
        java.lang.String str16 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries22.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double34 = timeSeries33.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double39 = timeSeries38.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries33.addAndOrUpdate(timeSeries38);
        java.util.Collection collection41 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        java.util.Collection collection42 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        timeSeries40.fireSeriesChanged();
        boolean boolean44 = timeSeries40.isEmpty();
        boolean boolean45 = timeSeries40.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries40);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) '4', 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeSeries15.getIndex(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems((long) (short) -1, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "", "Time");
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
        timeSeries7.setRangeDescription("Value");
        timeSeries7.setMaximumItemAge((long) 2147483647);
        java.lang.String str42 = timeSeries7.getRangeDescription();
        timeSeries7.setNotify(false);
        timeSeries7.clear();
        java.lang.String str46 = timeSeries7.getDescription();
        java.util.Collection collection47 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod48, (java.lang.Number) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value" + "'", str42, "Value");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection54);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        timeSeries3.setKey((java.lang.Comparable) "Time");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        int int34 = timeSeries28.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries28.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        double double42 = timeSeries3.getMaxY();
        java.lang.String str43 = timeSeries3.getDescription();
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
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        double double18 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(timeSeriesDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        timeSeries75.removeAgedItems(true);
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(true);
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries13.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries13);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.delete((int) '#', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDescription();
        timeSeries3.setNotify(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.addChangeListener(seriesChangeListener11);
        long long13 = timeSeries3.getMaximumItemAge();
        timeSeries3.setNotify(false);
        double double16 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries3.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setKey((java.lang.Comparable) "Overwritten values from:  ");
        long long5 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod6, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        timeSeries10.setDomainDescription("Value");
        double double22 = timeSeries10.getMaxY();
        int int23 = timeSeries10.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }
}


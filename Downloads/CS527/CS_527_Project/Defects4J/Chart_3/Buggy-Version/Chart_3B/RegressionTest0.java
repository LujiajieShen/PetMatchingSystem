import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.addOrUpdate(regularTimePeriod4, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries3.getValue(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.getDataItem(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, number8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries3.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.addOrUpdate(timeSeriesDataItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        java.lang.Class<?> wildcardClass5 = timeSeries3.getClass();
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (java.lang.Number) 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries8.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries8.createCopy((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries10.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries8.addOrUpdate(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries8.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries3.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(timeSeriesDataItem31);
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries8.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) (short) 100, 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(regularTimePeriod6, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (double) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = timeSeries31.getIndex(regularTimePeriod34);
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod13, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.delete((int) (short) 0, 1, false);
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
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.update(regularTimePeriod30, (java.lang.Number) 0.0d);
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries10.getNextTimePeriod();
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
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod36, (-1.0d), true);
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (double) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries26.addOrUpdate(regularTimePeriod29, (java.lang.Number) 0.0d);
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries8.createCopy((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy(regularTimePeriod4, regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (java.lang.Number) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.Collection collection12 = timeSeries10.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries10.addOrUpdate(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(timeSeriesDataItem32, false);
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.Collection collection12 = timeSeries10.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries10.getTimePeriod(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod12, (double) (-1L));
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (double) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod12, (java.lang.Number) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries3.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.update(regularTimePeriod29, (java.lang.Number) (byte) -1);
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(regularTimePeriod30, (java.lang.Number) (-1L), false);
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries3.addOrUpdate(regularTimePeriod34, (java.lang.Number) (-1));
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(regularTimePeriod34, (java.lang.Number) (short) 100);
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
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.update(regularTimePeriod34, (java.lang.Number) (short) -1);
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
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        java.lang.Class<?> wildcardClass4 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(0, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) Double.NaN, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries28.getDataItem((int) (byte) 0);
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries10.getTimePeriod((int) (short) 10);
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
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(regularTimePeriod10, Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        java.lang.Object obj7 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) -1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        java.lang.Number number11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod10, number11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries8.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.Class<?> wildcardClass8 = timeSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        java.util.Collection collection12 = timeSeries10.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries10.getDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        timeSeries31.clear();
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries10.addOrUpdate(regularTimePeriod13, (java.lang.Number) (-1));
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries10.getNextTimePeriod();
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
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries3.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.createCopy((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries3.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete((int) 'a', (int) '#', false);
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.addOrUpdate(regularTimePeriod12, (java.lang.Number) 0L);
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeSeries3.getIndex(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries3.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod13, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "", "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem35);
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
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        timeSeries8.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries8.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries10.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        boolean boolean11 = timeSeries3.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        timeSeries8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries8.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries3.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (java.lang.Number) 1L, false);
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        timeSeries10.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeSeries10.getIndex(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        boolean boolean11 = timeSeries3.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod11, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod7, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries10.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        java.lang.Class<?> wildcardClass11 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        timeSeries3.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries3.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod6, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod13, (double) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        timeSeries28.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.update((int) (byte) 0, (java.lang.Number) 10);
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
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries3.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        timeSeries3.removeAgedItems((long) (short) 100, false);
        boolean boolean13 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDomainDescription("");
        java.lang.Class<?> wildcardClass12 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod13, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries3.getDataItem(10);
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
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries8.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (java.lang.Number) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = timeSeries1.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries3.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class<?> wildcardClass4 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries10.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        boolean boolean7 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries3.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries3.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        java.lang.Number number17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries14.addOrUpdate(regularTimePeriod16, number17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        java.lang.Class<?> wildcardClass34 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(1L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries11.addOrUpdate(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod17, 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries8.addOrUpdate(regularTimePeriod11, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(regularTimePeriod33, (java.lang.Number) (short) -1, true);
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.update((int) (byte) -1, (java.lang.Number) 100.0f);
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (java.lang.Number) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries3.createCopy(regularTimePeriod5, regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (java.lang.Number) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod30, (double) (byte) 1);
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
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        timeSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        long long11 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries3.getNextTimePeriod();
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = timeSeries1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem25, false);
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
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = timeSeries28.getValue((int) (short) 10);
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
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        boolean boolean7 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod29, (java.lang.Number) (byte) 1);
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
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(100, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "Value", "hi!");
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.addOrUpdate(regularTimePeriod12, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
            java.lang.Number number13 = timeSeries3.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries3.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod36, (java.lang.Number) (byte) 0);
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        double double13 = timeSeries11.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries11.addOrUpdate(regularTimePeriod14, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemCount((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = timeSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Value", "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.addOrUpdate(regularTimePeriod4, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries28.getDataItem(regularTimePeriod32);
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
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
            org.jfree.data.time.TimeSeries timeSeries32 = timeSeries10.createCopy((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
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
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(regularTimePeriod6, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        java.lang.Class<?> wildcardClass23 = timeSeries21.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries3.getTimePeriod((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries3.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod38, (java.lang.Number) 1.0d);
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.update(1, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        boolean boolean14 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries3.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
            org.jfree.data.time.TimeSeries timeSeries36 = timeSeries28.createCopy((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        long long35 = timeSeries31.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = timeSeries31.getIndex(regularTimePeriod36);
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
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod30, (double) 100, false);
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
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries8.removeAgedItems(100L, false);
        java.lang.String str12 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemAge((long) 1);
        timeSeries8.removeAgedItems(false);
        boolean boolean17 = timeSeries3.equals((java.lang.Object) false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries3.getValue(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = timeSeries1.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) (byte) 10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        timeSeries10.removeAgedItems((long) (-1), false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update(0, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
            timeSeries3.add(regularTimePeriod16, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) (byte) 0, false);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem34, true);
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
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        java.lang.Object obj8 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setNotify(false);
        java.util.List list12 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries3.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.clear();
        java.lang.Comparable comparable15 = timeSeries8.getKey();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries1.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.addOrUpdate(timeSeriesDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod7, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = timeSeries1.getIndex(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.add(regularTimePeriod28, (java.lang.Number) 1, true);
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        timeSeries10.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries10.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.addOrUpdate(regularTimePeriod5, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = timeSeries10.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        java.lang.Comparable comparable9 = timeSeries3.getKey();
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 10, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries8.addOrUpdate(timeSeriesDataItem14);
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod14, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries12.addOrUpdate(regularTimePeriod27, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        double double13 = timeSeries11.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) '4', false);
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeSeries3.getIndex(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries15.getDataItem((int) (byte) 100);
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
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(timeSeriesDataItem31);
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries15.setKey((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries8.getValue(regularTimePeriod14);
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("hi!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = timeSeries3.getValue(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setNotify(false);
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries3.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.createCopy((int) (byte) 100, (int) 'a');
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
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.jfree.data.time.TimeSeries timeSeries19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries20 = timeSeries12.addAndOrUpdate(timeSeries19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("hi!");
        int int13 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((int) (byte) 10, (java.lang.Number) Double.NaN);
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
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        timeSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("hi!");
        long long13 = timeSeries10.getMaximumItemAge();
        timeSeries10.setMaximumItemAge(0L);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete((int) '#', (int) (byte) 1, true);
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        timeSeries3.setDescription("");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = timeSeries1.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setKey((java.lang.Comparable) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries10.addOrUpdate(timeSeriesDataItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setNotify(false);
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod15, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        java.lang.Class<?> wildcardClass14 = list13.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        long long10 = timeSeries3.getMaximumItemAge();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries21.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy(regularTimePeriod9, regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) '4', false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (java.lang.Number) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        int int15 = timeSeries10.getMaximumItemCount();
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.setKey(comparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = timeSeries26.getTimePeriod((int) (short) 10);
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
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod7, number8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        timeSeries1.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.addOrUpdate(regularTimePeriod6, Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "Value");
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(regularTimePeriod6, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = timeSeries10.getIndex(regularTimePeriod28);
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries10.addOrUpdate(regularTimePeriod23, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("");
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
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        timeSeries1.setMaximumItemCount((int) '#');
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
            timeSeries19.add(regularTimePeriod20, (java.lang.Number) 100.0d, false);
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries3.getDataItem((int) (short) 10);
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
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        boolean boolean12 = timeSeries10.getNotify();
        timeSeries10.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod15, (java.lang.Number) 100);
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        long long6 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries3.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update(regularTimePeriod13, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "Value", "Overwritten values from:  ");
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(1, number5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod5, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        java.lang.Class<?> wildcardClass2 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        timeSeries3.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        int int6 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries8.getDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setNotify(false);
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries10.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemAge((long) ' ');
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.util.List list13 = timeSeries8.getItems();
        timeSeries8.setRangeDescription("");
        timeSeries8.removeAgedItems(1L, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod19, (double) 0.0f);
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
            int int16 = timeSeries10.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.addOrUpdate(regularTimePeriod12, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        timeSeries8.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod14, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries3.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        long long8 = timeSeries3.getMaximumItemAge();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeSeries19.getIndex(regularTimePeriod23);
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
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        double double11 = timeSeries10.getMinY();
        timeSeries10.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries10.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.delete(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod23, (double) (short) -1);
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        int int9 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection14 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries13.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries3.getDataItem(regularTimePeriod22);
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.addOrUpdate(regularTimePeriod12, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        java.util.List list9 = timeSeries3.getItems();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "Value", "Overwritten values from:  ");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (double) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setNotify(false);
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDescription("hi!");
        timeSeries8.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries8.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        timeSeries3.setNotify(false);
        boolean boolean9 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
            timeSeries3.update(1, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        int int16 = timeSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        boolean boolean14 = timeSeries3.isEmpty();
        java.lang.Class<?> wildcardClass15 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = timeSeries3.getTimePeriod((int) (short) -1);
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
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries10.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        timeSeries3.setDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.setMaximumItemAge((long) (byte) 1);
        java.lang.Object obj6 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        long long14 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries3.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        double double6 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod7, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(timeSeriesDataItem33);
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        java.lang.String str9 = timeSeries3.getDescription();
        int int10 = timeSeries3.getItemCount();
        boolean boolean11 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        timeSeries3.fireSeriesChanged();
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries3.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDescription("hi!");
        timeSeries8.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy(100, (int) '4');
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        long long6 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setMaximumItemAge(0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod13, (java.lang.Number) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        java.lang.Object obj31 = timeSeries28.clone();
        int int32 = timeSeries28.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
            timeSeries8.delete(regularTimePeriod17);
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        java.lang.String str7 = timeSeries3.getDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.removeAgedItems(true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) -1, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries8.removeAgedItems(100L, false);
        java.lang.String str12 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemAge((long) 1);
        timeSeries8.removeAgedItems(false);
        boolean boolean17 = timeSeries3.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass18 = timeSeries3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setMaximumItemCount((int) 'a');
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
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        java.lang.Object obj6 = timeSeries3.clone();
        int int7 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double12 = timeSeries11.getMaxY();
        timeSeries11.setKey((java.lang.Comparable) 10.0d);
        java.util.Collection collection15 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries26.addOrUpdate(timeSeriesDataItem31);
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(timeSeriesDataItem36, true);
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
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(0, (int) ' ');
        timeSeries1.setMaximumItemCount(0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate(regularTimePeriod9, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries3.createCopy(regularTimePeriod5, regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        timeSeries3.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(regularTimePeriod27, (double) 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + ' ' + "'", comparable15, ' ');
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(1L, false);
        boolean boolean14 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, (java.lang.Number) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        java.lang.Comparable comparable4 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + '#' + "'", comparable4, '#');
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        timeSeries3.setNotify(false);
        boolean boolean9 = timeSeries3.isEmpty();
        int int10 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((int) 'a', (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(0, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries6.addOrUpdate(regularTimePeriod7, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem69 = timeSeries38.addOrUpdate(regularTimePeriod67, (java.lang.Number) 100.0f);
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
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setRangeDescription("");
        timeSeries8.setDomainDescription("Value");
        java.lang.Comparable comparable17 = timeSeries8.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries8.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + ' ' + "'", comparable17, ' ');
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.util.List list19 = timeSeries3.getItems();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries15.setRangeDescription("hi!");
        long long18 = timeSeries15.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod19, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries3.createCopy(regularTimePeriod4, regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        timeSeries1.fireSeriesChanged();
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries8.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.setRangeDescription("");
        timeSeries1.setDescription("Overwritten values from:  ");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries(comparable0, "Time", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        java.lang.Comparable comparable4 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(regularTimePeriod5, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + '#' + "'", comparable4, '#');
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries8.setMaximumItemAge(0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod13, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (java.lang.Number) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) (short) -1);
        timeSeries3.removeAgedItems((-1L), true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (java.lang.Number) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries10.addOrUpdate(regularTimePeriod25, (double) (byte) -1);
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries31.getNextTimePeriod();
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
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + ' ' + "'", comparable9, ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.addOrUpdate(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        long long6 = timeSeries3.getMaximumItemAge();
        java.lang.Class class7 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries15.setRangeDescription("hi!");
        long long18 = timeSeries15.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.delete(regularTimePeriod67);
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
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        timeSeries3.removeAgedItems((long) (short) 1, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 1, (int) (short) 100);
        timeSeries4.fireSeriesChanged();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod7, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        long long13 = timeSeries10.getMaximumItemAge();
        java.lang.Object obj14 = timeSeries10.clone();
        int int15 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem16, false);
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
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        timeSeries10.removeAgedItems((long) (-1), false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod18, (java.lang.Number) 1.0f);
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) '#', (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        timeSeries28.setMaximumItemCount((int) (byte) 0);
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        timeSeries10.removeAgedItems((long) (-1), false);
        java.lang.Object obj18 = timeSeries10.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries10.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(false);
        java.lang.Comparable comparable8 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy(regularTimePeriod9, regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        java.lang.String str8 = timeSeries3.getRangeDescription();
        double double9 = timeSeries3.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Time", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
            java.lang.Number number18 = timeSeries3.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries3.getDataItem(regularTimePeriod31);
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
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 0 + "'", comparable7, (short) 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "hi!");
        int int4 = timeSeries3.getItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems((long) (short) -1, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(1L, false);
        java.lang.String str14 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.removeChangeListener(seriesChangeListener8);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(class10);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) '4', false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.delete((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        java.lang.Object obj43 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod44, (java.lang.Number) (short) -1);
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
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.clear();
        timeSeries3.setDomainDescription("");
        double double12 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod41, (java.lang.Number) (-1.0d), false);
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setDomainDescription("Overwritten values from:  ");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (java.lang.Number) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        int int18 = timeSeries8.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.removeAgedItems((long) (short) -1, false);
        boolean boolean14 = timeSeries10.getNotify();
        int int15 = timeSeries10.getMaximumItemCount();
        double double16 = timeSeries10.getMinY();
        java.lang.Class<?> wildcardClass17 = timeSeries10.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Value", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (double) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.Class<?> wildcardClass20 = timeSeries10.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMinY();
        java.lang.String str9 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.createCopy(regularTimePeriod10, regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Overwritten values from:  ");
        java.lang.Comparable comparable4 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '#', (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + '#' + "'", comparable4, '#');
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.lang.Class<?> wildcardClass47 = timeSeries3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.addAndOrUpdate(timeSeries11);
        double double13 = timeSeries11.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(timeSeriesDataItem14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        double double5 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("hi!");
        timeSeries3.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod21, (double) (short) 10, false);
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod17, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        timeSeries8.clear();
        int int13 = timeSeries8.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries8.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + ' ' + "'", comparable11, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries19.getDataItem(regularTimePeriod36);
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries28.addOrUpdate(regularTimePeriod36, (double) 10L);
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
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries3.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        timeSeries3.setNotify(false);
        timeSeries3.removeAgedItems((long) (byte) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) -1, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod29, (java.lang.Number) (short) 1, false);
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
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Time", "Overwritten values from:  ");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(false);
        java.lang.Comparable comparable8 = timeSeries1.getKey();
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(2147483647, number10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem68 = timeSeries8.getDataItem(regularTimePeriod67);
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
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        int int25 = timeSeries10.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        java.lang.Comparable comparable11 = timeSeries8.getKey();
        long long12 = timeSeries8.getMaximumItemAge();
        java.lang.Class class13 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = timeSeries8.getIndex(regularTimePeriod14);
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
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = timeSeries3.getDataItem(regularTimePeriod37);
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.util.Collection collection8 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries15.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        java.util.List list14 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries3.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        boolean boolean5 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries3.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
            timeSeries5.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        timeSeries3.setNotify(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.createCopy(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDomainDescription("");
        timeSeries10.setMaximumItemCount((int) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod15, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries29 = timeSeries15.createCopy(regularTimePeriod27, regularTimePeriod28);
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
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(false);
        boolean boolean7 = timeSeries3.equals((java.lang.Object) 100.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries3.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries3.getDescription();
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        boolean boolean9 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.addOrUpdate(regularTimePeriod10, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.clear();
        double double8 = timeSeries1.getMaxY();
        java.lang.String str9 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        timeSeries3.setDescription("Overwritten values from:  ");
        java.lang.Class<?> wildcardClass13 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 1, 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.addOrUpdate(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod19);
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(1L, false);
        boolean boolean14 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 100 + "'", comparable7, 100);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        timeSeries28.removeChangeListener(seriesChangeListener29);
        java.lang.Class class31 = timeSeries28.getTimePeriodClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        int int10 = timeSeries3.getItemCount();
        java.lang.Object obj11 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        long long10 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 0, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        timeSeries3.removeAgedItems((long) (byte) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeSeries3.getIndex(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Value", "Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries3.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries8);
        timeSeries10.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries10.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
            java.lang.Number number15 = timeSeries3.getValue(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.addOrUpdate(regularTimePeriod8, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 0 + "'", comparable7, (short) 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(100L, true);
        timeSeries3.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod14, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        timeSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.String str41 = timeSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + ' ' + "'", comparable19, ' ');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries3.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double16 = timeSeries14.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.delete((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = timeSeries3.getIndex(regularTimePeriod41);
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.setDescription("hi!");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries3.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.setRangeDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        java.lang.String str11 = timeSeries3.getDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems(true);
        timeSeries3.removeAgedItems((long) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean7 = timeSeries3.getNotify();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("");
        java.util.List list11 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        java.lang.Number number28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod27, number28);
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
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
        boolean boolean3 = timeSeries1.equals((java.lang.Object) (-1L));
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timeSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        timeSeries38.removeAgedItems(100L, false);
        java.lang.String str42 = timeSeries38.getRangeDescription();
        double double43 = timeSeries38.getMinY();
        int int44 = timeSeries38.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, "Value", "Value");
        java.util.Collection collection49 = timeSeries38.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        boolean boolean50 = timeSeries10.equals((java.lang.Object) collection49);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + ' ' + "'", comparable22, ' ');
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "hi!", "");
        timeSeries3.removeAgedItems(100L, false);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        double double8 = timeSeries3.getMaxY();
        double double9 = timeSeries3.getMinY();
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (java.lang.Number) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
    }
}


package org.jfree.data.general;

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
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, list1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        boolean boolean1 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        boolean boolean1 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(xYDataset0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        org.jfree.data.Range range2 = null;
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (double) 100);
        double double6 = range4.constrain((double) '4');
        double double7 = range4.getLength();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 1, (double) (short) 10, 0, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(xYDataset0, list1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset0, list1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        org.jfree.data.Range range2 = null;
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (double) 100);
        double double6 = range4.constrain((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem7 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (short) 100, 0.0d, 0, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        org.jfree.data.Range range2 = null;
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(xYDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset3 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset0, (java.lang.Comparable) 0L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        boolean boolean1 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset3 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset0, (java.lang.Comparable) "hi!", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset0, list1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        org.jfree.data.KeyedValues keyedValues7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) 100, keyedValues7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowData' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset21, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jfree.data.KeyedValues keyedValues1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset2 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) 0, keyedValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowData' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = categoryDataset21.getRowKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        double double25 = range24.getLowerBound();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Comparable comparable0 = null;
        org.jfree.data.KeyedValues keyedValues1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset2 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparable0, keyedValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray9, numberArray12, numberArray15, numberArray18, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem31 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int33 = xYIntervalDataItem31.compareTo((java.lang.Object) 1.0f);
        double double34 = xYIntervalDataItem31.getXHighValue();
        org.jfree.data.Range range35 = null;
        org.jfree.data.Range range37 = org.jfree.data.Range.expandToInclude(range35, (double) 100);
        double double39 = range37.constrain((double) '4');
        boolean boolean40 = xYIntervalDataItem31.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number42 = categoryDataset24.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (4) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset22, (double) (short) -1);
        java.util.List list26 = categoryDataset22.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(xYDataset0, list26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jfree.data.KeyedValues keyedValues1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset2 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 32, keyedValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowData' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem7 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int9 = xYIntervalDataItem7.compareTo((java.lang.Object) 1.0f);
        double double10 = xYIntervalDataItem7.getXHighValue();
        org.jfree.data.Range range11 = null;
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 100);
        double double15 = range13.constrain((double) '4');
        boolean boolean16 = xYIntervalDataItem7.equals((java.lang.Object) '4');
        org.jfree.data.Range range17 = null;
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 100);
        double double21 = range19.constrain((double) '4');
        int int22 = xYIntervalDataItem7.compareTo((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset0, (java.lang.Comparable) '4', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.general.DatasetGroup datasetGroup48 = categoryDataset46.getGroup();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(datasetGroup48);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        int int26 = categoryDataset21.getColumnIndex((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable28 = categoryDataset21.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset0, list23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 10L, (double) 10, (int) (short) -1, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset22, (double) (short) -1);
        java.util.List list26 = categoryDataset22.getRowKeys();
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        org.jfree.data.Range range50 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset48, true);
        org.jfree.data.Range range52 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset48, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range54 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list26, range52, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(categoryDataset48);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range52);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        double double25 = range24.getUpperBound();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.0d + "'", double25 == 32.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) 0.0f, (double) (short) 10);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        java.util.List list48 = categoryDataset46.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = categoryDataset46.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        java.util.List list48 = categoryDataset46.getColumnKeys();
        org.jfree.data.Range range49 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(range49);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray9, numberArray12, numberArray15, numberArray18, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray22);
        java.util.List list24 = categoryDataset23.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, list24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        double double30 = range29.getLowerBound();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-1.0d) + "'", number26, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = xYIntervalSeriesCollection0.getXValue(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener25 = null;
        categoryDataset21.removeChangeListener(datasetChangeListener25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = categoryDataset21.getValue((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray9, numberArray12, numberArray15, numberArray18, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray22);
        java.util.List list24 = categoryDataset23.getRowKeys();
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) (short) -1);
        java.util.List list27 = categoryDataset23.getRowKeys();
        org.jfree.data.Range range28 = null;
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range28, (double) 100);
        double double32 = range30.constrain((double) '4');
        double double33 = range30.getLength();
        org.jfree.data.Range range34 = null;
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range34, (double) 100);
        double double38 = range36.constrain((double) '4');
        boolean boolean39 = range30.intersects(range36);
        double double40 = range30.getUpperBound();
        java.lang.Object obj41 = null;
        boolean boolean42 = range30.equals(obj41);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range44 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, list27, range30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset21);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 32.0d + "'", number25, 32.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = xYIntervalSeriesCollection0.getStartXValue((int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        java.lang.Comparable comparable8 = xYIntervalSeries3.getKey();
        int int10 = xYIntervalSeries3.indexOf((java.lang.Comparable) 0.0f);
        xYIntervalSeries3.setNotify(true);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        java.util.List list35 = categoryDataset34.getRowKeys();
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset34, (double) (short) -1);
        boolean boolean38 = xYIntervalSeries3.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10 + "'", comparable8, 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jfree.data.ComparableObjectSeries comparableObjectSeries1 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection2 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection2, true);
        java.lang.Object obj5 = xYIntervalSeriesCollection2.clone();
        // The following exception was thrown during execution in test generation
        try {
            comparableObjectSeries1.removeChangeListener((org.jfree.data.event.SeriesChangeListener) xYIntervalSeriesCollection2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.data.xy.XYIntervalSeriesCollection@14cc25d3 is not of type class org.jfree.data.xy.XYIntervalSeries");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = xYIntervalSeriesCollection0.getSeriesKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, 0.0d);
        java.util.List list26 = categoryDataset21.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable28 = categoryDataset21.getRowKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (byte) 0);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset21, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = xYIntervalSeriesCollection0.getYValue((int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = xYIntervalSeriesCollection0.getStartXValue(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(range5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = xYIntervalSeriesCollection0.getEndY(32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener25 = null;
        categoryDataset21.removeChangeListener(datasetChangeListener25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem7 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int9 = xYIntervalDataItem7.compareTo((java.lang.Object) 1.0f);
        double double10 = xYIntervalDataItem7.getXHighValue();
        org.jfree.data.Range range11 = null;
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 100);
        double double15 = range13.constrain((double) '4');
        boolean boolean16 = xYIntervalDataItem7.equals((java.lang.Object) '4');
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { 100.0d, '4', 0.0d, (-1), ' ' };
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem30 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        java.lang.Comparable[] comparableArray33 = new java.lang.Comparable[] { 1L, 2147483647, (byte) 1, (short) 1, (-1), (byte) 0 };
        double[] doubleArray39 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray40 = new double[][] { doubleArray39 };
        org.jfree.data.category.CategoryDataset categoryDataset41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray40);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray20, comparableArray33, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertNotNull(comparableArray33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(categoryDataset41);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryDataset21.getGroup();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener25 = null;
        categoryDataset21.removeChangeListener(datasetChangeListener25);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(datasetGroup24);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = xYIntervalSeriesCollection0.getEndXValue((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, 0.0d);
        java.util.List list26 = categoryDataset21.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset21, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, 0.0d);
        double double26 = range25.getCentralValue();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 15.5d + "'", double26 == 15.5d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = xYIntervalSeriesCollection0.getEndYValue(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = xYIntervalSeriesCollection0.getSeriesKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        categoryDataset22.addChangeListener(datasetChangeListener34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable37 = categoryDataset22.getColumnKey(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.DomainOrder domainOrder18 = xYIntervalSeriesCollection0.getDomainOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYIntervalSeriesCollection0.getX(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(domainOrder18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = xYIntervalSeriesCollection0.getX(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        int int49 = categoryDataset46.getRowIndex((java.lang.Comparable) "org.jfree.data.event.DatasetChangeEvent[source=-1]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number52 = categoryDataset46.getValue((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 10L, 32.0d, (int) (byte) -1, (java.lang.Comparable) "NOID");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range24, (double) 10, (double) (byte) 1);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22);
        org.jfree.data.KeyToGroupMap keyToGroupMap34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset22, keyToGroupMap34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        int int24 = categoryDataset21.getRowIndex((java.lang.Comparable) 32);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 1.0f, 1.0d);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState24);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertNotNull(pieDataset31);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Comparable[] comparableArray0 = new java.lang.Comparable[] {};
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray9, numberArray12, numberArray15, numberArray18, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray22);
        java.util.List list24 = categoryDataset23.getRowKeys();
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, false);
        int int28 = categoryDataset23.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset30 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo31 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset30, datasetChangeInfo31);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent33 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset23, datasetChangeInfo31);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem40 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int42 = xYIntervalDataItem40.compareTo((java.lang.Object) 1.0f);
        int int43 = categoryDataset23.getColumnIndex((java.lang.Comparable) xYIntervalDataItem40);
        java.lang.Comparable[] comparableArray46 = new java.lang.Comparable[] { xYIntervalDataItem40, (-1.0d), 93.0d };
        double[] doubleArray52 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray53 = new double[][] { doubleArray52 };
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray53);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray46, doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray0);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(comparableArray46);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertNotNull(categoryDataset54);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryDataset21.getGroup();
        java.lang.Comparable comparable26 = categoryDataset21.getRowKey((int) (short) 0);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + "hi!1" + "'", comparable26, "hi!1");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = xYIntervalSeriesCollection0.getStartXValue(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNull(range2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        int int31 = categoryDataset21.getColumnIndex((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-1.0d) + "'", number26, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = xYIntervalSeriesCollection0.getEndYValue((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, 0.0d);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range23, (double) 1L, (double) (-1L));
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYIntervalSeriesCollection0.getX((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        double double28 = range27.getUpperBound();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 32.0d + "'", double28 == 32.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup13 = xYIntervalSeriesCollection0.getGroup();
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYIntervalSeriesCollection0.getX((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = xYIntervalSeriesCollection0.getEndYValue(32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        categoryDataset22.addChangeListener(datasetChangeListener34);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset22);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + 32.0d + "'", number36, 32.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = xYIntervalSeriesCollection0.getSeriesKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.DomainOrder domainOrder18 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj20 = xYIntervalSeriesCollection0.clone();
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(domainOrder18);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.Range range48 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset46);
        double double49 = range48.getLength();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 198.0d + "'", double49 == 198.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.DomainOrder domainOrder18 = xYIntervalSeriesCollection0.getDomainOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = xYIntervalSeriesCollection0.getYValue((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(domainOrder18);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = xYIntervalSeriesCollection0.getSeriesKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + (-1.0d) + "'", number25, (-1.0d));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        boolean boolean22 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem29 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int31 = xYIntervalDataItem29.compareTo((java.lang.Object) 1.0f);
        double double32 = xYIntervalDataItem29.getXHighValue();
        org.jfree.data.Range range33 = null;
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) 100);
        double double37 = range35.constrain((double) '4');
        boolean boolean38 = xYIntervalDataItem29.equals((java.lang.Object) '4');
        org.jfree.data.Range range39 = null;
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range39, (double) 100);
        double double43 = range41.constrain((double) '4');
        int int44 = xYIntervalDataItem29.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray57 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray60 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray63 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray67 = new java.lang.Number[][] { numberArray51, numberArray54, numberArray57, numberArray60, numberArray63, numberArray66 };
        org.jfree.data.category.CategoryDataset categoryDataset68 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray67);
        org.jfree.data.category.CategoryDataset categoryDataset69 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray67);
        int int70 = xYIntervalDataItem29.compareTo((java.lang.Object) categoryDataset69);
        java.util.List list71 = categoryDataset69.getColumnKeys();
        org.jfree.data.Range range73 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset21, list71, true);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberArray54);
        org.junit.Assert.assertNotNull(numberArray57);
        org.junit.Assert.assertNotNull(numberArray60);
        org.junit.Assert.assertNotNull(numberArray63);
        org.junit.Assert.assertNotNull(numberArray66);
        org.junit.Assert.assertNotNull(numberArray67);
        org.junit.Assert.assertNotNull(categoryDataset68);
        org.junit.Assert.assertNotNull(categoryDataset69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(range73);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries3.setMaximumItemCount((int) ' ');
        xYIntervalSeries3.setDescription("hi!");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8, true);
        java.lang.Object obj11 = xYIntervalSeriesCollection8.clone();
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray19, numberArray22, numberArray25, numberArray28, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        java.util.List list34 = categoryDataset33.getRowKeys();
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset33, false);
        int int38 = categoryDataset33.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean39 = xYIntervalSeriesCollection8.equals((java.lang.Object) categoryDataset33);
        org.jfree.data.Range range41 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8, true);
        // The following exception was thrown during execution in test generation
        try {
            xYIntervalSeries3.addChangeListener((org.jfree.data.event.SeriesChangeListener) xYIntervalSeriesCollection8);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.data.xy.XYIntervalSeriesCollection@4651107a is not of type class org.jfree.data.xy.XYIntervalSeries");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(range41);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jfree.data.Range range0 = null;
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, true);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, 0.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range0, range24);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = xYIntervalSeriesCollection0.getSeriesKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        xYIntervalSeries3.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries3.add((double) 100, (double) 0, (double) (byte) -1, (double) (short) -1, (double) 100, (double) 0);
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, (double) 100);
        double double22 = range20.constrain((double) '4');
        boolean boolean24 = range20.contains((double) 0.0f);
        xYIntervalSeries3.firePropertyChange("org.jfree.data.event.DatasetChangeEvent[source=-1]", (java.lang.Object) 0.0f, (java.lang.Object) true);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection27 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection27, true);
        java.lang.Object obj30 = xYIntervalSeriesCollection27.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem37 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int39 = xYIntervalDataItem37.compareTo((java.lang.Object) 1.0f);
        double double40 = xYIntervalDataItem37.getXHighValue();
        java.lang.Object obj41 = xYIntervalDataItem37.clone();
        boolean boolean43 = xYIntervalDataItem37.equals((java.lang.Object) 0);
        int int44 = xYIntervalSeriesCollection27.indexOf((java.lang.Comparable) xYIntervalDataItem37);
        org.jfree.data.DomainOrder domainOrder45 = xYIntervalSeriesCollection27.getDomainOrder();
        // The following exception was thrown during execution in test generation
        try {
            xYIntervalSeries3.removeChangeListener((org.jfree.data.event.SeriesChangeListener) xYIntervalSeriesCollection27);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.data.xy.XYIntervalSeriesCollection@27db7c00 is not of type class org.jfree.data.xy.XYIntervalSeries");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(domainOrder45);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.DomainOrder domainOrder18 = xYIntervalSeriesCollection0.getDomainOrder();
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = xYIntervalSeriesCollection0.getStartYValue((int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(domainOrder18);
        org.junit.Assert.assertNull(number19);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (byte) 0);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range29, 0.0d);
        double double32 = range29.getCentralValue();
        double double33 = range29.getLowerBound();
        org.jfree.data.Range range34 = null;
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range34, (double) 100);
        double double38 = range36.constrain((double) '4');
        double double39 = range36.getLength();
        double double40 = range36.getCentralValue();
        double double42 = range36.constrain(1.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range29, range36);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 93.0d + "'", double32 == 93.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-6.0d) + "'", double33 == (-6.0d));
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertNotNull(range43);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryDataset21.getGroup();
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = xYIntervalSeriesCollection0.getYValue((-1), 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(range5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (byte) 0);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = categoryDataset21.getValue((java.lang.Comparable) 32, (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (32) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, 0.0d);
        java.util.List list26 = categoryDataset21.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable28 = categoryDataset21.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        int int49 = categoryDataset46.getRowIndex((java.lang.Comparable) "org.jfree.data.event.DatasetChangeEvent[source=-1]");
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset46, 15.5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(range51);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem9 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int11 = xYIntervalDataItem9.compareTo((java.lang.Object) 1.0f);
        double double12 = xYIntervalDataItem9.getXHighValue();
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, (double) 100);
        double double17 = range15.constrain((double) '4');
        boolean boolean18 = xYIntervalDataItem9.equals((java.lang.Object) '4');
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range19, (double) 100);
        double double23 = range21.constrain((double) '4');
        int int24 = xYIntervalDataItem9.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray47);
        int int50 = xYIntervalDataItem9.compareTo((java.lang.Object) categoryDataset49);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener51 = null;
        categoryDataset49.removeChangeListener(datasetChangeListener51);
        org.jfree.data.general.DatasetGroup datasetGroup53 = categoryDataset49.getGroup();
        xYIntervalSeriesCollection0.setGroup(datasetGroup53);
        // The following exception was thrown during execution in test generation
        try {
            double double57 = xYIntervalSeriesCollection0.getYValue((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(categoryDataset48);
        org.junit.Assert.assertNotNull(categoryDataset49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(datasetGroup53);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState29 = pieDataset28.getSelectionState();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState24);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState29);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        double[] doubleArray5 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray6 = new double[][] { doubleArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray6);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem14 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int16 = xYIntervalDataItem14.compareTo((java.lang.Object) 1.0f);
        double double17 = xYIntervalDataItem14.getXHighValue();
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, (double) 100);
        double double22 = range20.constrain((double) '4');
        boolean boolean23 = xYIntervalDataItem14.equals((java.lang.Object) '4');
        org.jfree.data.Range range24 = null;
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range24, (double) 100);
        double double28 = range26.constrain((double) '4');
        int int29 = xYIntervalDataItem14.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray52 = new java.lang.Number[][] { numberArray36, numberArray39, numberArray42, numberArray45, numberArray48, numberArray51 };
        org.jfree.data.category.CategoryDataset categoryDataset53 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray52);
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray52);
        int int55 = xYIntervalDataItem14.compareTo((java.lang.Object) categoryDataset54);
        java.util.List list56 = categoryDataset54.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range58 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset7, list56, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(categoryDataset53);
        org.junit.Assert.assertNotNull(categoryDataset54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range24 = null;
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range24, (double) 100);
        double double28 = range26.constrain((double) '4');
        double double29 = range26.getLength();
        org.jfree.data.Range range30 = null;
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range30, (double) 100);
        double double34 = range32.constrain((double) '4');
        boolean boolean35 = range26.intersects(range32);
        double double37 = range26.constrain((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list23, range26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        java.util.List list48 = categoryDataset46.getColumnKeys();
        java.util.List list49 = categoryDataset46.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(list49);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset21);
        org.jfree.data.KeyToGroupMap keyToGroupMap26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, keyToGroupMap26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + (-6.0d) + "'", number25, (-6.0d));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, false);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        boolean boolean17 = xYIntervalDataItem6.equals((java.lang.Object) 0.0f);
        java.lang.Object obj18 = xYIntervalDataItem6.clone();
        double double19 = xYIntervalDataItem6.getYLowValue();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem27 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int29 = xYIntervalDataItem27.compareTo((java.lang.Object) 1.0f);
        double double30 = xYIntervalDataItem27.getXHighValue();
        java.lang.Object obj31 = xYIntervalDataItem27.clone();
        boolean boolean33 = xYIntervalDataItem27.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray44 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray47 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray50 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray54 = new java.lang.Number[][] { numberArray38, numberArray41, numberArray44, numberArray47, numberArray50, numberArray53 };
        org.jfree.data.category.CategoryDataset categoryDataset55 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray54);
        org.jfree.data.pie.PieDataset pieDataset57 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset55, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState58 = pieDataset57.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset62 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset57, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset63 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem27, (org.jfree.data.KeyedValues) pieDataset62);
        java.lang.Comparable[] comparableArray67 = new java.lang.Comparable[] { double19, false, xYIntervalDataItem27, 10, (byte) -1, (-1) };
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem75 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int77 = xYIntervalDataItem75.compareTo((java.lang.Object) 1.0f);
        double double78 = xYIntervalDataItem75.getXHighValue();
        java.lang.Object obj79 = xYIntervalDataItem75.clone();
        java.lang.Comparable[] comparableArray83 = new java.lang.Comparable[] { (-1.0f), xYIntervalDataItem75, (-1), 93.0d, 0 };
        double[] doubleArray91 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray92 = new double[][] { doubleArray91 };
        org.jfree.data.category.CategoryDataset categoryDataset93 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray92);
        org.jfree.data.category.CategoryDataset categoryDataset94 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("org.jfree.data.general.SeriesException: ", "", doubleArray92);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset95 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray67, comparableArray83, doubleArray92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberArray41);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(numberArray50);
        org.junit.Assert.assertNotNull(numberArray53);
        org.junit.Assert.assertNotNull(numberArray54);
        org.junit.Assert.assertNotNull(categoryDataset55);
        org.junit.Assert.assertNotNull(pieDataset57);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState58);
        org.junit.Assert.assertNotNull(pieDataset62);
        org.junit.Assert.assertNotNull(categoryDataset63);
        org.junit.Assert.assertNotNull(comparableArray67);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 100.0d + "'", double78 == 100.0d);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(comparableArray83);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertNotNull(categoryDataset93);
        org.junit.Assert.assertNotNull(categoryDataset94);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 100, false);
        org.jfree.data.Range range9 = null;
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range9, (double) 100);
        double double13 = range11.constrain((double) '4');
        double double14 = range11.getLength();
        org.jfree.data.Range range15 = null;
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (double) 100);
        double double19 = range17.constrain((double) '4');
        boolean boolean20 = range11.intersects(range17);
        boolean boolean21 = range2.intersects(range11);
        org.jfree.data.Range range22 = null;
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) 100);
        double double26 = range24.constrain((double) '4');
        double double27 = range24.getLength();
        double double28 = range24.getCentralValue();
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray49 = new java.lang.Number[][] { numberArray33, numberArray36, numberArray39, numberArray42, numberArray45, numberArray48 };
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray49);
        java.util.List list51 = categoryDataset50.getRowKeys();
        org.jfree.data.Range range53 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset50, (double) (short) -1);
        java.lang.Number number54 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset50);
        org.jfree.data.Range range55 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset50);
        boolean boolean56 = range24.intersects(range55);
        boolean boolean57 = range2.intersects(range55);
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertNotNull(categoryDataset50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertEquals("'" + number54 + "' != '" + (-1.0d) + "'", number54, (-1.0d));
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        boolean boolean29 = range27.contains((double) (byte) 1);
        double double31 = range27.constrain((double) 10L);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries3 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        java.lang.Object obj5 = null;
        xYIntervalSeries3.firePropertyChange("", obj5, (java.lang.Object) "hi!");
        xYIntervalSeries3.setKey((java.lang.Comparable) (short) 1);
        xYIntervalSeries3.firePropertyChange("", (java.lang.Object) 100L, (java.lang.Object) 100.0f);
        xYIntervalSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem21 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int23 = xYIntervalDataItem21.compareTo((java.lang.Object) 1.0f);
        double double24 = xYIntervalDataItem21.getXHighValue();
        org.jfree.data.Range range25 = null;
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 100);
        double double29 = range27.constrain((double) '4');
        boolean boolean30 = xYIntervalDataItem21.equals((java.lang.Object) '4');
        org.jfree.data.Range range31 = null;
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range31, (double) 100);
        double double35 = range33.constrain((double) '4');
        int int36 = xYIntervalDataItem21.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray55 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray59 = new java.lang.Number[][] { numberArray43, numberArray46, numberArray49, numberArray52, numberArray55, numberArray58 };
        org.jfree.data.category.CategoryDataset categoryDataset60 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray59);
        org.jfree.data.category.CategoryDataset categoryDataset61 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray59);
        int int62 = xYIntervalDataItem21.compareTo((java.lang.Object) categoryDataset61);
        xYIntervalSeries3.setKey((java.lang.Comparable) int62);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(numberArray55);
        org.junit.Assert.assertNotNull(numberArray58);
        org.junit.Assert.assertNotNull(numberArray59);
        org.junit.Assert.assertNotNull(categoryDataset60);
        org.junit.Assert.assertNotNull(categoryDataset61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        org.jfree.data.KeyToGroupMap keyToGroupMap29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, keyToGroupMap29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-1.0d) + "'", number26, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.general.DatasetGroup datasetGroup2 = xYIntervalSeriesCollection0.getGroup();
        boolean boolean3 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        java.lang.Number number33 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset22);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + 192.0d + "'", number33, 192.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, 0.0d);
        double double26 = range25.getLength();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 33.0d + "'", double26 == 33.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray9, numberArray12, numberArray15, numberArray18, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("NOID", "org.jfree.data.event.SeriesChangeEvent[source= ]", numberArray22);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset24);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        double double6 = range2.getCentralValue();
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray11, numberArray14, numberArray17, numberArray20, numberArray23, numberArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray27);
        java.util.List list29 = categoryDataset28.getRowKeys();
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28, (double) (short) -1);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset28);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset28);
        boolean boolean34 = range2.intersects(range33);
        boolean boolean37 = range2.intersects(32.0d, (double) (byte) 100);
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + (-1.0d) + "'", number32, (-1.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYIntervalSeriesCollection0.getEndY((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener48 = null;
        categoryDataset46.removeChangeListener(datasetChangeListener48);
        java.util.List list50 = categoryDataset46.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(list50);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = xYIntervalSeriesCollection0.getYValue((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        boolean boolean22 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + (-1.0d) + "'", number23, (-1.0d));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = xYIntervalSeriesCollection0.getSeriesKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(range15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = xYIntervalSeriesCollection0.getSeriesKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo10 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = xYIntervalSeriesCollection0.getItemCount((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range5 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = xYIntervalSeriesCollection0.getEndXValue((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(range5);
        org.junit.Assert.assertNull(range6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.general.Dataset dataset33 = datasetChangeEvent32.getDataset();
        org.jfree.data.general.Dataset dataset34 = datasetChangeEvent32.getDataset();
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(dataset33);
        org.junit.Assert.assertNotNull(dataset34);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem28 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int30 = xYIntervalDataItem28.compareTo((java.lang.Object) 1.0f);
        double double31 = xYIntervalDataItem28.getXHighValue();
        org.jfree.data.Range range32 = null;
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range32, (double) 100);
        double double36 = range34.constrain((double) '4');
        boolean boolean37 = xYIntervalDataItem28.equals((java.lang.Object) '4');
        boolean boolean39 = xYIntervalDataItem28.equals((java.lang.Object) 0.0f);
        java.lang.Object obj40 = xYIntervalDataItem28.clone();
        java.lang.Object obj41 = null;
        int int42 = xYIntervalDataItem28.compareTo(obj41);
        double double43 = xYIntervalDataItem28.getXLowValue();
        org.jfree.data.ComparableObjectSeries comparableObjectSeries44 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) xYIntervalDataItem28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number46 = categoryDataset21.getValue((java.lang.Comparable) xYIntervalDataItem28, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (org.jfree.data.xy.XYIntervalDataItem@121f4fbd) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener12 = null;
        xYIntervalSeriesCollection0.addChangeListener(datasetChangeListener12);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem39 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int41 = xYIntervalDataItem39.compareTo((java.lang.Object) 1.0f);
        int int42 = categoryDataset22.getColumnIndex((java.lang.Comparable) xYIntervalDataItem39);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries45 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) xYIntervalDataItem39, false, false);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray53 = new java.lang.Number[][] { numberArray37, numberArray40, numberArray43, numberArray46, numberArray49, numberArray52 };
        org.jfree.data.category.CategoryDataset categoryDataset54 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray53);
        java.util.List list55 = categoryDataset54.getRowKeys();
        org.jfree.data.Range range57 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset54, (double) (short) -1);
        java.util.List list58 = categoryDataset54.getRowKeys();
        org.jfree.data.Range range60 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, list58, false);
        org.jfree.data.Range range62 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset22, 67.0d);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(numberArray53);
        org.junit.Assert.assertNotNull(categoryDataset54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo10 = new org.jfree.chart.event.DatasetChangeInfo();
        xYIntervalSeriesCollection0.fireDatasetChanged(datasetChangeInfo10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYIntervalSeriesCollection0.getY(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.validateObject();
        xYIntervalSeriesCollection0.validateObject();
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries17 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries17.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo20 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent21 = new org.jfree.data.event.SeriesChangeEvent((java.lang.Object) ' ', seriesChangeInfo20);
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = xYIntervalSeriesCollection0.getSeriesKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        org.jfree.data.DomainOrder domainOrder18 = xYIntervalSeriesCollection0.getDomainOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYIntervalSeriesCollection0.getStartY((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(domainOrder18);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(range15);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = xYIntervalSeriesCollection0.getStartYValue(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray9, numberArray12, numberArray15, numberArray18, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset24, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 32.0d + "'", number25, 32.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        boolean boolean22 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem29 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        double double30 = xYIntervalDataItem29.getYLowValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset21, (java.lang.Comparable) xYIntervalDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState25 = pieDataset23.getSelectionState();
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray47 = new java.lang.Number[][] { numberArray31, numberArray34, numberArray37, numberArray40, numberArray43, numberArray46 };
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray47);
        java.util.List list49 = categoryDataset48.getRowKeys();
        org.jfree.data.Range range51 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset48, false);
        int int53 = categoryDataset48.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset55 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo56 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent57 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset55, datasetChangeInfo56);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent58 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset48, datasetChangeInfo56);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem65 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int67 = xYIntervalDataItem65.compareTo((java.lang.Object) 1.0f);
        int int68 = categoryDataset48.getColumnIndex((java.lang.Comparable) xYIntervalDataItem65);
        double double69 = xYIntervalDataItem65.getXLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection70 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder71 = xYIntervalSeriesCollection70.getDomainOrder();
        org.jfree.data.ComparableObjectItem comparableObjectItem72 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem65, (java.lang.Object) domainOrder71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number73 = pieDataset23.getValue((java.lang.Comparable) comparableObjectItem72);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (org.jfree.data.ComparableObjectItem@a972434c) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState24);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState25);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertNotNull(categoryDataset48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertNotNull(domainOrder71);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection26 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset28 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo29 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent30 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset28, datasetChangeInfo29);
        xYIntervalSeriesCollection26.notifyListeners(datasetChangeEvent30);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState32 = xYIntervalSeriesCollection26.getSelectionState();
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection26);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection34 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder35 = xYIntervalSeriesCollection34.getDomainOrder();
        int int36 = xYIntervalSeriesCollection34.getSeriesCount();
        boolean boolean37 = xYIntervalSeriesCollection26.hasListener((java.util.EventListener) xYIntervalSeriesCollection34);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo38 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list25, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection34, datasetChangeInfo38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number42 = xYIntervalSeriesCollection34.getStartX((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(xYDatasetSelectionState32);
        org.junit.Assert.assertNull(range33);
        org.junit.Assert.assertNotNull(domainOrder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYIntervalSeriesCollection0.getY(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(range9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYIntervalSeriesCollection0.getStartX(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = xYIntervalSeriesCollection0.getEndXValue(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = xYIntervalSeriesCollection0.getEndYValue(2147483647, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNull(range2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener48 = null;
        categoryDataset46.removeChangeListener(datasetChangeListener48);
        org.jfree.data.general.DatasetGroup datasetGroup50 = categoryDataset46.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset52 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset46, (java.lang.Comparable) 15.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(datasetGroup50);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            double double36 = xYIntervalSeriesCollection0.getYValue(1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(range33);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.removeAllSeries();
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        java.lang.Object obj48 = xYIntervalDataItem6.clone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) (short) 10, (double) 100, 100);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState24);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertNull(number30);
        org.junit.Assert.assertNotNull(pieDataset34);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = xYIntervalSeriesCollection0.getItemCount((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYIntervalSeriesCollection0.getY(2147483647, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483647, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, true);
        org.jfree.data.general.DatasetGroup datasetGroup25 = categoryDataset22.getGroup();
        java.util.List list26 = categoryDataset22.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset0, list26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(datasetGroup25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState7 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState7);
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray17, numberArray20, numberArray23, numberArray26, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        java.util.List list32 = categoryDataset31.getRowKeys();
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset31, false);
        int int36 = categoryDataset31.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset38 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo39 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent40 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset38, datasetChangeInfo39);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent41 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset31, datasetChangeInfo39);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem48 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int50 = xYIntervalDataItem48.compareTo((java.lang.Object) 1.0f);
        int int51 = categoryDataset31.getColumnIndex((java.lang.Comparable) xYIntervalDataItem48);
        double double52 = xYIntervalDataItem48.getXLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection53 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder54 = xYIntervalSeriesCollection53.getDomainOrder();
        org.jfree.data.ComparableObjectItem comparableObjectItem55 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem48, (java.lang.Object) domainOrder54);
        int int56 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) comparableObjectItem55);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(domainOrder54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = categoryDataset21.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj8 = xYIntervalSeriesCollection0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYIntervalSeriesCollection0.getEndY((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        double double48 = xYIntervalDataItem6.getXHighValue();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, true);
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryDataset21.getGroup();
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        java.lang.Comparable comparable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = categoryDataset21.getValue(comparable27, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        int int2 = xYIntervalSeriesCollection0.getSeriesCount();
        java.lang.Number number3 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(number3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries35 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        boolean boolean36 = xYIntervalSeries35.getNotify();
        int int37 = xYIntervalSeries35.getItemCount();
        boolean boolean38 = xYIntervalSeries35.getAutoSort();
        xYIntervalSeries35.fireSeriesChanged();
        xYIntervalSeries35.setMaximumItemCount((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYIntervalSeriesCollection0.addSeries(xYIntervalSeries35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.data.xy.XYIntervalSeriesCollection@4171dfe4 is not of type class org.jfree.data.xy.XYIntervalSeries");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem29 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int31 = xYIntervalDataItem29.compareTo((java.lang.Object) 1.0f);
        double double32 = xYIntervalDataItem29.getXHighValue();
        java.lang.Object obj33 = xYIntervalDataItem29.clone();
        boolean boolean35 = xYIntervalDataItem29.equals((java.lang.Object) 0);
        java.lang.Object obj36 = xYIntervalDataItem29.clone();
        int int37 = categoryDataset21.getColumnIndex((java.lang.Comparable) xYIntervalDataItem29);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem39 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int41 = xYIntervalDataItem39.compareTo((java.lang.Object) 1.0f);
        int int42 = categoryDataset22.getColumnIndex((java.lang.Comparable) xYIntervalDataItem39);
        double double43 = xYIntervalDataItem39.getXLowValue();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection44 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder45 = xYIntervalSeriesCollection44.getDomainOrder();
        org.jfree.data.ComparableObjectItem comparableObjectItem46 = new org.jfree.data.ComparableObjectItem((java.lang.Comparable) xYIntervalDataItem39, (java.lang.Object) domainOrder45);
        double double47 = xYIntervalDataItem39.getYValue();
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(domainOrder45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        int int4 = xYIntervalSeriesCollection0.getSeriesCount();
        int int6 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) 100.0d);
        org.jfree.data.DomainOrder domainOrder7 = xYIntervalSeriesCollection0.getDomainOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = xYIntervalSeriesCollection0.getYValue((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(domainOrder7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        double[] doubleArray9 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.general.SeriesException: ", doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        double[] doubleArray9 = new double[] { 1.0d, (byte) -1, 1.0d };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!1", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("Range[100.0,100.0]", "org.jfree.data.event.SeriesChangeEvent[source= ]", doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 100);
        double double4 = range2.constrain((double) '4');
        double double5 = range2.getLength();
        double double6 = range2.getCentralValue();
        boolean boolean9 = range2.intersects((double) 2147483647, (double) (short) 10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection10 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset12 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo13 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent14 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset12, datasetChangeInfo13);
        xYIntervalSeriesCollection10.notifyListeners(datasetChangeEvent14);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState16 = xYIntervalSeriesCollection10.getSelectionState();
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection10);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection18 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset20 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo21 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent22 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset20, datasetChangeInfo21);
        xYIntervalSeriesCollection18.notifyListeners(datasetChangeEvent22);
        org.jfree.data.general.Dataset dataset24 = datasetChangeEvent22.getDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo25 = datasetChangeEvent22.getInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent26 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) range2, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection10, datasetChangeInfo25);
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState16);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNull(dataset24);
        org.junit.Assert.assertNotNull(datasetChangeInfo25);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = xYIntervalSeriesCollection0.getYValue((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj8 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray17, numberArray20, numberArray23, numberArray26, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        java.util.List list32 = categoryDataset31.getRowKeys();
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset31, (double) (short) -1);
        java.util.List list35 = categoryDataset31.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, list35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        int int10 = xYIntervalSeriesCollection0.getSeriesCount();
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray31 = new java.lang.Number[][] { numberArray15, numberArray18, numberArray21, numberArray24, numberArray27, numberArray30 };
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray31);
        java.util.List list33 = categoryDataset32.getRowKeys();
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset32, (double) (short) -1);
        java.util.List list36 = categoryDataset32.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, list36, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(categoryDataset32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        boolean boolean22 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = categoryDataset21.getValue(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        java.lang.Class<?> wildcardClass23 = range22.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection8 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection8.getDomainOrder();
        int int10 = xYIntervalSeriesCollection8.getSeriesCount();
        boolean boolean11 = xYIntervalSeriesCollection0.hasListener((java.util.EventListener) xYIntervalSeriesCollection8);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection8);
        xYIntervalSeriesCollection8.validateObject();
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(domainOrder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem15 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int17 = xYIntervalDataItem15.compareTo((java.lang.Object) 1.0f);
        double double18 = xYIntervalDataItem15.getXHighValue();
        java.lang.Object obj19 = xYIntervalDataItem15.clone();
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo20 = null;
        org.jfree.data.event.SeriesChangeEvent seriesChangeEvent21 = new org.jfree.data.event.SeriesChangeEvent(obj19, seriesChangeInfo20);
        org.jfree.data.general.SeriesChangeInfo seriesChangeInfo22 = seriesChangeEvent21.getSummary();
        xYIntervalSeriesCollection0.seriesChanged(seriesChangeEvent21);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries27 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) 10, false, false);
        xYIntervalSeries27.setMaximumItemCount((int) ' ');
        int int30 = xYIntervalSeries27.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYIntervalSeries27.removePropertyChangeListener(propertyChangeListener31);
        xYIntervalSeriesCollection0.removeSeries(xYIntervalSeries27);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(seriesChangeInfo22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNull(number34);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder1 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = xYIntervalSeriesCollection0.getEndXValue(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(domainOrder1);
        org.junit.Assert.assertNull(range2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        java.lang.Object obj10 = xYIntervalDataItem6.clone();
        boolean boolean12 = xYIntervalDataItem6.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray17, numberArray20, numberArray23, numberArray26, numberArray29, numberArray32 };
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray33);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset34, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState37 = pieDataset36.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem6, (org.jfree.data.KeyedValues) pieDataset41);
        int int44 = pieDataset41.getIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(pieDataset36);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState37);
        org.junit.Assert.assertNotNull(pieDataset41);
        org.junit.Assert.assertNotNull(categoryDataset42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        xYIntervalSeriesCollection0.validateObject();
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYIntervalSeriesCollection0.getX((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        java.lang.Number number30 = pieDataset28.getValue((int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 'a', (double) 100L);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState24);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertNull(number30);
        org.junit.Assert.assertNotNull(pieDataset33);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        boolean boolean29 = range27.contains((double) (byte) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range27, 1.0d, true);
        org.jfree.data.Range range33 = null;
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) 100);
        double double37 = range35.constrain((double) '4');
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range35, (double) (byte) 1, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range27, range40);
        org.jfree.data.Range range42 = null;
        org.jfree.data.Range range44 = org.jfree.data.Range.expandToInclude(range42, (double) 100);
        double double46 = range44.constrain((double) '4');
        double double47 = range44.getLength();
        org.jfree.data.Range range50 = org.jfree.data.Range.shift(range44, (double) 100, false);
        org.jfree.data.Range range51 = org.jfree.data.Range.combine(range40, range44);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range51);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener48 = null;
        categoryDataset46.removeChangeListener(datasetChangeListener48);
        int int50 = categoryDataset46.getColumnCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState7 = null;
        xYIntervalSeriesCollection0.setSelectionState(xYDatasetSelectionState7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYIntervalSeriesCollection0.getEndX(1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray5, numberArray8, numberArray11, numberArray14, numberArray17, numberArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray21);
        java.util.List list23 = categoryDataset22.getRowKeys();
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22, false);
        int int27 = categoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.Dataset dataset29 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo30 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset29, datasetChangeInfo30);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent32 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) 10L, (org.jfree.data.general.Dataset) categoryDataset22, datasetChangeInfo30);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset22);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener34 = null;
        categoryDataset22.removeChangeListener(datasetChangeListener34);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset22);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + (-6.0d) + "'", number36, (-6.0d));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = xYIntervalSeriesCollection0.getYValue((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset21);
        int int30 = categoryDataset21.getColumnCount();
        java.util.List list31 = categoryDataset21.getRowKeys();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (-1.0d) + "'", number26, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + (-1.0d) + "'", number29, (-1.0d));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray9, numberArray12, numberArray15, numberArray18, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset24);
        org.jfree.data.KeyToGroupMap keyToGroupMap26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset24, keyToGroupMap26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 32.0d + "'", number25, 32.0d);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, 0.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range26, (double) '#', true);
        double double30 = range29.getUpperBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.scale(range29, (double) 10L);
        java.lang.Class<?> wildcardClass33 = range32.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 67.0d + "'", double30 == 67.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jfree.data.ComparableObjectSeries comparableObjectSeries3 = new org.jfree.data.ComparableObjectSeries((java.lang.Comparable) 0L, true, true);
        comparableObjectSeries3.fireSeriesChanged();
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray25 = new java.lang.Number[][] { numberArray9, numberArray12, numberArray15, numberArray18, numberArray21, numberArray24 };
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26, true);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range28, 0.0d);
        boolean boolean31 = comparableObjectSeries3.equals((java.lang.Object) range28);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray14 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray11, numberArray14, numberArray17, numberArray20, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray24);
        java.util.List list26 = categoryDataset25.getRowKeys();
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        int int30 = categoryDataset25.getColumnIndex((java.lang.Comparable) (-1L));
        boolean boolean31 = xYIntervalSeriesCollection0.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray54 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray55 = new java.lang.Number[][] { numberArray39, numberArray42, numberArray45, numberArray48, numberArray51, numberArray54 };
        org.jfree.data.category.CategoryDataset categoryDataset56 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray55);
        java.util.List list57 = categoryDataset56.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range59 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, list57, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(range33);
        org.junit.Assert.assertNull(number34);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberArray54);
        org.junit.Assert.assertNotNull(numberArray55);
        org.junit.Assert.assertNotNull(categoryDataset56);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (byte) 0);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range29, 0.0d);
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range31, (double) 1L);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range33, (double) 10.0f, true);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        org.jfree.data.Range range48 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset46);
        org.jfree.data.Range range50 = org.jfree.data.Range.shift(range48, (double) 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range50);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        java.lang.Object obj8 = xYIntervalSeriesCollection0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYIntervalSeriesCollection0.getEndX(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        java.lang.Number number9 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = xYIntervalSeriesCollection0.getEndXValue((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(range15);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset21);
        double double23 = range22.getLength();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 32.0d + "'", double23 == 32.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.DomainOrder domainOrder9 = xYIntervalSeriesCollection0.getDomainOrder();
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNotNull(domainOrder9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Object obj3 = xYIntervalSeriesCollection0.clone();
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem10 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int12 = xYIntervalDataItem10.compareTo((java.lang.Object) 1.0f);
        double double13 = xYIntervalDataItem10.getXHighValue();
        java.lang.Object obj14 = xYIntervalDataItem10.clone();
        boolean boolean16 = xYIntervalDataItem10.equals((java.lang.Object) 0);
        int int17 = xYIntervalSeriesCollection0.indexOf((java.lang.Comparable) xYIntervalDataItem10);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = xYIntervalSeriesCollection0.getEndXValue(6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray9, numberArray12, numberArray15, numberArray18, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("NOID", "org.jfree.data.event.SeriesChangeEvent[source= ]", numberArray22);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset24, false);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        boolean boolean10 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = xYIntervalSeriesCollection0.getSeriesKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Series index out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        int int24 = categoryDataset21.getRowCount();
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset21);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 32.0d + "'", number25, 32.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset21, false);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset21);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21, true);
        boolean boolean29 = range27.contains((double) (byte) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range27, 1.0d, true);
        org.jfree.data.Range range33 = null;
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) 100);
        double double37 = range35.constrain((double) '4');
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range35, (double) (byte) 1, false);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range27, range40);
        java.lang.Class<?> wildcardClass42 = range41.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        org.jfree.data.event.DatasetChangeListener datasetChangeListener25 = null;
        categoryDataset21.removeChangeListener(datasetChangeListener25);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset21);
        java.lang.Class<?> wildcardClass28 = categoryDataset21.getClass();
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 32.0d + "'", number27, 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, true);
        java.lang.Number number3 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0);
        org.junit.Assert.assertNull(range2);
        org.junit.Assert.assertNull(number3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset21);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset2 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo3 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset2, datasetChangeInfo3);
        xYIntervalSeriesCollection0.notifyListeners(datasetChangeEvent4);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState6 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener7 = null;
        xYIntervalSeriesCollection0.removeChangeListener(datasetChangeListener7);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState9 = xYIntervalSeriesCollection0.getSelectionState();
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findDomainBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection0, false);
        org.jfree.data.xy.XYIntervalSeries xYIntervalSeries13 = new org.jfree.data.xy.XYIntervalSeries((java.lang.Comparable) "");
        xYIntervalSeries13.add((double) (byte) 10, (double) 1L, (double) (-1), (double) (-1), 1.0d, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            xYIntervalSeriesCollection0.addSeries(xYIntervalSeries13);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.data.xy.XYIntervalSeriesCollection@667093be is not of type class org.jfree.data.Range");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(xYDatasetSelectionState6);
        org.junit.Assert.assertNull(xYDatasetSelectionState9);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem6 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int8 = xYIntervalDataItem6.compareTo((java.lang.Object) 1.0f);
        double double9 = xYIntervalDataItem6.getXHighValue();
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, (double) 100);
        double double14 = range12.constrain((double) '4');
        boolean boolean15 = xYIntervalDataItem6.equals((java.lang.Object) '4');
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 100);
        double double20 = range18.constrain((double) '4');
        int int21 = xYIntervalDataItem6.compareTo((java.lang.Object) '4');
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray37 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray28, numberArray31, numberArray34, numberArray37, numberArray40, numberArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray44);
        int int47 = xYIntervalDataItem6.compareTo((java.lang.Object) categoryDataset46);
        java.util.List list48 = categoryDataset46.getColumnKeys();
        boolean boolean49 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(categoryDataset45);
        org.junit.Assert.assertNotNull(categoryDataset46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jfree.data.xy.XYIntervalDataItem xYIntervalDataItem7 = new org.jfree.data.xy.XYIntervalDataItem((double) (-1L), (double) (short) 1, (double) (byte) 100, (double) 0L, (double) (short) 100, (double) 100.0f);
        int int9 = xYIntervalDataItem7.compareTo((java.lang.Object) 1.0f);
        double double10 = xYIntervalDataItem7.getXHighValue();
        java.lang.Object obj11 = xYIntervalDataItem7.clone();
        boolean boolean13 = xYIntervalDataItem7.equals((java.lang.Object) 0);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray34 = new java.lang.Number[][] { numberArray18, numberArray21, numberArray24, numberArray27, numberArray30, numberArray33 };
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray34);
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset35, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState38 = pieDataset37.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset42 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) (short) 0, (double) (short) 100, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) xYIntervalDataItem7, (org.jfree.data.KeyedValues) pieDataset42);
        boolean boolean44 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset42);
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 1, (org.jfree.data.KeyedValues) pieDataset42);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(categoryDataset35);
        org.junit.Assert.assertNotNull(pieDataset37);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState38);
        org.junit.Assert.assertNotNull(pieDataset42);
        org.junit.Assert.assertNotNull(categoryDataset43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(categoryDataset45);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 2, 32.0d, 6, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        java.util.List list22 = categoryDataset21.getRowKeys();
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset21, (double) (short) -1);
        java.util.List list25 = categoryDataset21.getRowKeys();
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection26 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.general.Dataset dataset28 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo29 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent30 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) (-1L), dataset28, datasetChangeInfo29);
        xYIntervalSeriesCollection26.notifyListeners(datasetChangeEvent30);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState32 = xYIntervalSeriesCollection26.getSelectionState();
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection26);
        org.jfree.data.xy.XYIntervalSeriesCollection xYIntervalSeriesCollection34 = new org.jfree.data.xy.XYIntervalSeriesCollection();
        org.jfree.data.DomainOrder domainOrder35 = xYIntervalSeriesCollection34.getDomainOrder();
        int int36 = xYIntervalSeriesCollection34.getSeriesCount();
        boolean boolean37 = xYIntervalSeriesCollection26.hasListener((java.util.EventListener) xYIntervalSeriesCollection34);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo38 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent39 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) list25, (org.jfree.data.general.Dataset) xYIntervalSeriesCollection34, datasetChangeInfo38);
        org.jfree.data.xy.XYDatasetSelectionState xYDatasetSelectionState40 = xYIntervalSeriesCollection34.getSelectionState();
        org.jfree.data.Range range41 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset) xYIntervalSeriesCollection34);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(xYDatasetSelectionState32);
        org.junit.Assert.assertNull(range33);
        org.junit.Assert.assertNotNull(domainOrder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(xYDatasetSelectionState40);
        org.junit.Assert.assertNull(range41);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.lang.Number[] numberArray4 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (short) -1, 32 };
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10, numberArray13, numberArray16, numberArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray20);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, 1);
        org.jfree.data.pie.PieDatasetSelectionState pieDatasetSelectionState24 = pieDataset23.getSelectionState();
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 'a', (double) 10.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 192.0d, 0.0d);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDatasetSelectionState24);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertNotNull(pieDataset31);
    }
}

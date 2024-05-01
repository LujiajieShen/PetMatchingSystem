package org.apache.commons.math.linear;

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
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix1 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = openMapRealMatrix2.walkInOptimizedOrder(realMatrixPreservingVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        double[] doubleArray9 = new double[] { (-1), 100 };
        double[] doubleArray12 = new double[] { (-1), 100 };
        double[] doubleArray15 = new double[] { (-1), 100 };
        double[] doubleArray18 = new double[] { (-1), 100 };
        double[] doubleArray21 = new double[] { (-1), 100 };
        double[][] doubleArray22 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.setSubMatrix(doubleArray22, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix2.createMatrix((-1), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = realMatrix6.walkInOptimizedOrder(realMatrixPreservingVisitor7, (int) (byte) 1, 100, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = openMapRealMatrix2.walkInRowOrder(realMatrixChangingVisitor5, (int) (short) 10, 100, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector15);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector19.mapDivide(0.0d);
        arrayRealVector15.checkVectorDimensions(realVector21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = arrayRealVector11.ebeMultiply(realVector21);
        double[] doubleArray24 = arrayRealVector23.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector10, doubleArray24);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24, true);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.setColumn((int) (short) 100, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertNotNull(realVector17);
        org.junit.Assert.assertNotNull(realVector21);
        org.junit.Assert.assertNotNull(arrayRealVector23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix2.createMatrix((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapDivide(0.0d);
        arrayRealVector8.checkVectorDimensions(realVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapDivide(0.0d);
        arrayRealVector20.checkVectorDimensions(realVector26);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = arrayRealVector16.ebeMultiply(realVector26);
        double[] doubleArray29 = arrayRealVector28.data;
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector8.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector28);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.setColumnVector((int) '4', realVector30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(realVector26);
        org.junit.Assert.assertNotNull(arrayRealVector28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(realVector30);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        arrayRealVector4.checkVectorDimensions(realVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector0.ebeMultiply(realVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector13);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector21.mapDivide(0.0d);
        arrayRealVector17.checkVectorDimensions(realVector23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = arrayRealVector13.ebeMultiply(realVector23);
        double[] doubleArray26 = arrayRealVector25.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapDivide(0.0d);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector25.append((org.apache.commons.math.linear.RealVector) arrayRealVector27);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = arrayRealVector0.ebeDivide(realVector30);
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(arrayRealVector12);
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(realVector19);
        org.junit.Assert.assertNotNull(realVector23);
        org.junit.Assert.assertNotNull(arrayRealVector25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(realVector29);
        org.junit.Assert.assertNotNull(realVector30);
        org.junit.Assert.assertNotNull(arrayRealVector31);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int[] intArray11 = new int[] { (byte) -1, 'a', (byte) 100, '#' };
        int[] intArray14 = new int[] { (short) -1, (byte) 0 };
        double[] doubleArray18 = new double[] { 100.0d, (-1), (byte) 10 };
        double[] doubleArray22 = new double[] { 100.0d, (-1), (byte) 10 };
        double[] doubleArray26 = new double[] { 100.0d, (-1), (byte) 10 };
        double[][] doubleArray27 = new double[][] { doubleArray18, doubleArray22, doubleArray26 };
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.copySubMatrix(intArray11, intArray14, doubleArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 100, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = openMapRealMatrix2.getEntry((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (35)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.multiplyEntry(0, 1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = openMapRealMatrix5.walkInRowOrder(realMatrixChangingVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = openMapRealMatrix5.getRow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrix6.preMultiply(realMatrix7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        boolean boolean5 = openMapRealMatrix2.isSquare();
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = openMapRealMatrix2.walkInRowOrder(realMatrixPreservingVisitor6, (int) '4', 10, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = realMatrix6.walkInRowOrder(realMatrixPreservingVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        boolean boolean5 = openMapRealMatrix2.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix8 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix11 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = openMapRealMatrix8.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix13 = openMapRealMatrix2.multiply(openMapRealMatrix11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.map(univariateRealFunction12);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector11.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector16);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapAddToSelf((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.setRowVector((int) (byte) 10, realVector19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertNotNull(arrayRealVector17);
        org.junit.Assert.assertNotNull(realVector19);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = openMapRealMatrix5.walkInColumnOrder(realMatrixPreservingVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = openMapRealMatrix2.walkInRowOrder(realMatrixPreservingVisitor5, 0, 0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        arrayRealVector4.checkVectorDimensions(realVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector0.ebeMultiply(realVector10);
        double[] doubleArray13 = arrayRealVector12.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.copy();
        double[] doubleArray16 = arrayRealVector14.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector12.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector14);
        double double18 = arrayRealVector12.getNorm();
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(arrayRealVector12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(arrayRealVector17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.multiplyEntry((int) (byte) 0, (int) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_SET_AT_NEGATIVE_INDEX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_SET_AT_NEGATIVE_INDEX + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_SET_AT_NEGATIVE_INDEX));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int[] intArray6 = new int[] { (byte) 10 };
        int[] intArray11 = new int[] { 'a', (byte) 100, '#', (byte) 0 };
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray15 = openMapRealMatrix14.getData();
        // The following exception was thrown during execution in test generation
        try {
            realMatrix4.copySubMatrix(intArray6, intArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 35, 0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector13 = openMapRealMatrix7.getColumnVector((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.multiplyEntry((int) ' ', 0, Double.NaN);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = openMapRealMatrix9.walkInColumnOrder(realMatrixPreservingVisitor10, (int) (byte) 1, (int) (short) 10, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 100);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = realMatrix4.walkInColumnOrder(realMatrixPreservingVisitor5, (int) (byte) 100, (int) 'a', (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        boolean boolean5 = openMapRealMatrix2.isSquare();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = openMapRealMatrix2.walkInOptimizedOrder(realMatrixChangingVisitor6, 1, (int) (short) 1, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double30 = openMapRealMatrix7.walkInColumnOrder(realMatrixPreservingVisitor25, (int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapSubtract((double) 10L);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.map(univariateRealFunction11);
        int int13 = realVector12.getMaxIndex();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4, realVector12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector15 = openMapRealMatrix2.preMultiply(realVector12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        arrayRealVector0.checkVectorDimensions(realVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapDivide(0.0d);
        arrayRealVector12.checkVectorDimensions(realVector18);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = arrayRealVector8.ebeMultiply(realVector18);
        double[] doubleArray21 = arrayRealVector20.data;
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector0.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector20);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction23 = null;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = arrayRealVector20.map(univariateRealFunction23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector25);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector29.mapDivide(0.0d);
        arrayRealVector25.checkVectorDimensions(realVector31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector37.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector37);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapDivide(0.0d);
        arrayRealVector37.checkVectorDimensions(realVector43);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = arrayRealVector33.ebeMultiply(realVector43);
        double[] doubleArray46 = arrayRealVector45.data;
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector25.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector45);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction48 = null;
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector25.mapToSelf(univariateRealFunction48);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = arrayRealVector24.ebeMultiply(realVector49);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector51.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector51);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector55.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector55);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector59.mapDivide(0.0d);
        arrayRealVector55.checkVectorDimensions(realVector61);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector63 = arrayRealVector51.ebeMultiply(realVector61);
        double[] doubleArray64 = arrayRealVector63.data;
        double double65 = arrayRealVector63.getMinValue();
        double double66 = arrayRealVector50.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector63);
        int int67 = arrayRealVector63.getMinIndex();
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(arrayRealVector20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(arrayRealVector24);
        org.junit.Assert.assertNotNull(realVector27);
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertNotNull(realVector43);
        org.junit.Assert.assertNotNull(arrayRealVector45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(realVector47);
        org.junit.Assert.assertNotNull(realVector49);
        org.junit.Assert.assertNotNull(arrayRealVector50);
        org.junit.Assert.assertNotNull(realVector53);
        org.junit.Assert.assertNotNull(realVector57);
        org.junit.Assert.assertNotNull(realVector61);
        org.junit.Assert.assertNotNull(arrayRealVector63);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 0.0d, (-1.0d) };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray2);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math.exception.util.LocalizedFormats.NAN_ELEMENT_AT_INDEX;
        boolean boolean5 = arrayRealVector3.equals((java.lang.Object) localizedFormats4);
        arrayRealVector3.unitize();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NAN_ELEMENT_AT_INDEX + "'", localizedFormats4.equals(org.apache.commons.math.exception.util.LocalizedFormats.NAN_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((-1), 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = openMapRealMatrix5.walkInColumnOrder(realMatrixPreservingVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        // The following exception was thrown during execution in test generation
        try {
            realMatrix6.addToEntry((int) ' ', (int) (byte) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector9.mapDivide(0.0d);
        arrayRealVector5.checkVectorDimensions(realVector11);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.setRowVector((int) '#', realVector11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (35)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realVector7);
        org.junit.Assert.assertNotNull(realVector11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix8 = openMapRealMatrix2.power(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.NonSquareMatrixException; message: non square (10x1) matrix");
        } catch (org.apache.commons.math.linear.NonSquareMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.copy();
        double[] doubleArray6 = arrayRealVector4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.setColumnVector((int) (byte) 0, (org.apache.commons.math.linear.RealVector) arrayRealVector4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixDimensionMismatchException; message: got 0x1 but expected 10x1");
        } catch (org.apache.commons.math.linear.MatrixDimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realVector5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        openMapRealMatrix2.multiplyEntry(0, 0, (double) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix11 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = openMapRealMatrix11.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix16 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = openMapRealMatrix16.getRowMatrix(1);
        boolean boolean19 = openMapRealMatrix16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = openMapRealMatrix11.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix16);
        double[][] doubleArray21 = openMapRealMatrix11.getData();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.setSubMatrix(doubleArray21, 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix2.getRowMatrix((int) (short) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapDivide(0.0d);
        arrayRealVector12.checkVectorDimensions(realVector18);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = arrayRealVector8.ebeMultiply(realVector18);
        arrayRealVector8.set((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector23 = openMapRealMatrix2.operate((org.apache.commons.math.linear.RealVector) arrayRealVector8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(arrayRealVector20);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        int int26 = openMapRealMatrix25.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = openMapRealMatrix25.transpose();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix32 = openMapRealMatrix25.getSubMatrix((int) 'a', (int) (byte) 0, 1, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (97)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(realMatrix27);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix2.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.multiplyEntry((int) (short) -1, 0, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix2.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = openMapRealMatrix2.walkInRowOrder(realMatrixChangingVisitor8, (int) (byte) -1, 0, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix2.getRowMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = realMatrix7.walkInRowOrder(realMatrixPreservingVisitor8, 10, (int) (short) 10, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = realMatrix24.walkInColumnOrder(realMatrixPreservingVisitor25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix8 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray9 = openMapRealMatrix8.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix8.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrix5.subtract(realMatrix11);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = realMatrix12.walkInColumnOrder(realMatrixPreservingVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = openMapRealMatrix2.walkInRowOrder(realMatrixPreservingVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix5.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = openMapRealMatrix5.walkInRowOrder(realMatrixChangingVisitor8, (-1), (int) (short) 10, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.math.linear.MatrixDimensionMismatchException matrixDimensionMismatchException4 = new org.apache.commons.math.linear.MatrixDimensionMismatchException((int) (byte) -1, (int) (short) 100, (int) (byte) 0, (int) '4');
        int int5 = matrixDimensionMismatchException4.getExpectedColumnDimension();
        int int6 = matrixDimensionMismatchException4.getExpectedColumnDimension();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_POSITIVE_DEGREES_OF_FREEDOM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_POSITIVE_DEGREES_OF_FREEDOM + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POSITIVE_DEGREES_OF_FREEDOM));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.BINOMIAL_INVALID_PARAMETERS_ORDER;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.BINOMIAL_INVALID_PARAMETERS_ORDER + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.BINOMIAL_INVALID_PARAMETERS_ORDER));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = null;
        // The following exception was thrown during execution in test generation
        try {
            realMatrix5.setRowMatrix((int) 'a', realMatrix7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (97)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        boolean boolean5 = openMapRealMatrix2.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix8 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix11 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = openMapRealMatrix8.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix13 = openMapRealMatrix2.multiply((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix8 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray9 = openMapRealMatrix8.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix8.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrix5.subtract(realMatrix11);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrix5.multiply(realMatrix13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        int int9 = openMapRealMatrix5.getRowDimension();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.copy();
        double[] doubleArray12 = arrayRealVector10.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector15);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = arrayRealVector10.combineToSelf((double) 100, (double) 100L, (org.apache.commons.math.linear.RealVector) arrayRealVector15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector20 = openMapRealMatrix5.preMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(realVector11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(realVector17);
        org.junit.Assert.assertNotNull(arrayRealVector19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.DENOMINATOR;
        java.lang.Integer[] intArray1 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 10, (-1) };
        org.apache.commons.math.exception.MultiDimensionMismatchException multiDimensionMismatchException6 = new org.apache.commons.math.exception.MultiDimensionMismatchException((org.apache.commons.math.exception.util.Localizable) localizedFormats0, intArray1, intArray5);
        int int8 = multiDimensionMismatchException6.getExpectedDimension((int) (short) 0);
        java.lang.Integer[] intArray9 = multiDimensionMismatchException6.getWrongDimensions();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.DENOMINATOR + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.DENOMINATOR));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getColumnDimension();
        int[] intArray6 = null;
        int[] intArray8 = new int[] { '4' };
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix11 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = openMapRealMatrix11.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix16 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = openMapRealMatrix16.getRowMatrix(1);
        boolean boolean19 = openMapRealMatrix16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = openMapRealMatrix11.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix16);
        double[][] doubleArray21 = openMapRealMatrix11.getData();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.copySubMatrix(intArray6, intArray8, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52]");
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix2.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = openMapRealMatrix2.walkInColumnOrder(realMatrixChangingVisitor8, (int) (byte) 0, (int) '4', (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        boolean boolean25 = realMatrix24.isSquare();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector27);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction31 = null;
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector30.map(univariateRealFunction31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = arrayRealVector30.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector35);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector36.append((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            realMatrix24.setRowVector((int) (byte) 1, (org.apache.commons.math.linear.RealVector) arrayRealVector36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixDimensionMismatchException; message: got 1x0 but expected 1x1");
        } catch (org.apache.commons.math.linear.MatrixDimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(realVector29);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(arrayRealVector36);
        org.junit.Assert.assertNotNull(realVector38);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = realMatrix6.walkInOptimizedOrder(realMatrixChangingVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealVector realVector5 = null;
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.setColumnVector((int) (byte) 100, realVector5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getRowDimension();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = openMapRealMatrix2.walkInOptimizedOrder(realMatrixChangingVisitor6, (int) ' ', (int) 'a', (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrix24.getSubMatrix((int) (short) 0, (int) (byte) 0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        arrayRealVector4.checkVectorDimensions(realVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector0.ebeMultiply(realVector10);
        double[] doubleArray13 = arrayRealVector12.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector18);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector22.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector22);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapDivide(0.0d);
        arrayRealVector22.checkVectorDimensions(realVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = arrayRealVector18.ebeMultiply(realVector28);
        double[] doubleArray31 = arrayRealVector30.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector30);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector14.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector32);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector14.mapAddToSelf(0.0d);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector12.append(realVector35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector38.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector38);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector42.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector42);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector46.mapDivide(0.0d);
        arrayRealVector42.checkVectorDimensions(realVector48);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = arrayRealVector38.ebeMultiply(realVector48);
        double[] doubleArray51 = arrayRealVector50.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector52.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector56.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector56);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector60.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector63 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector60);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector64.mapDivide(0.0d);
        arrayRealVector60.checkVectorDimensions(realVector66);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector68 = arrayRealVector56.ebeMultiply(realVector66);
        double[] doubleArray69 = arrayRealVector68.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector70 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector68);
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector52.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector70);
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector52.mapAddToSelf(0.0d);
        org.apache.commons.math.linear.RealVector realVector74 = arrayRealVector50.append(realVector73);
        // The following exception was thrown during execution in test generation
        try {
            arrayRealVector12.setSubVector((int) (byte) -1, realVector73);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(arrayRealVector12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector24);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertNotNull(arrayRealVector30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(realVector33);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(realVector36);
        org.junit.Assert.assertNotNull(realVector40);
        org.junit.Assert.assertNotNull(realVector44);
        org.junit.Assert.assertNotNull(realVector48);
        org.junit.Assert.assertNotNull(arrayRealVector50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(realVector54);
        org.junit.Assert.assertNotNull(realVector58);
        org.junit.Assert.assertNotNull(realVector62);
        org.junit.Assert.assertNotNull(realVector66);
        org.junit.Assert.assertNotNull(arrayRealVector68);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertNotNull(realVector71);
        org.junit.Assert.assertNotNull(realVector73);
        org.junit.Assert.assertNotNull(realVector74);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        int int26 = openMapRealMatrix25.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = openMapRealMatrix25.transpose();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double33 = realMatrix27.walkInColumnOrder(realMatrixChangingVisitor28, 1, (int) ' ', (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(realMatrix27);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_REAL_VECTOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_REAL_VECTOR + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_REAL_VECTOR));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.math.linear.MatrixDimensionMismatchException matrixDimensionMismatchException4 = new org.apache.commons.math.linear.MatrixDimensionMismatchException((int) (byte) 1, 10, (int) (short) -1, (int) (byte) 0);
        java.lang.Throwable[] throwableArray5 = matrixDimensionMismatchException4.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = matrixDimensionMismatchException4.getExpectedDimension(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        int int6 = openMapRealMatrix2.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix2.createMatrix(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix2.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = openMapRealMatrix2.walkInRowOrder(realMatrixPreservingVisitor8, (int) (byte) 1, (int) (byte) -1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix28 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = openMapRealMatrix28.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix33 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = openMapRealMatrix33.getRowMatrix(1);
        boolean boolean36 = openMapRealMatrix33.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = openMapRealMatrix28.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix33);
        double[][] doubleArray38 = openMapRealMatrix28.getData();
        double[] doubleArray40 = openMapRealMatrix28.getRow((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = openMapRealMatrix7.preMultiply(doubleArray40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math.exception.NumberIsTooSmallException numberIsTooSmallException3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number) 100, (java.lang.Number) (byte) 10, false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_OF_POINTS));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        int int6 = openMapRealMatrix2.getRowDimension();
        double[] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.setRow((int) (short) 1, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = openMapRealMatrix2.walkInColumnOrder(realMatrixChangingVisitor12, (int) ' ', (int) (short) 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = openMapRealMatrix2.getTrace();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.NonSquareMatrixException; message: non square (10x1) matrix");
        } catch (org.apache.commons.math.linear.NonSquareMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = openMapRealMatrix2.walkInColumnOrder(realMatrixChangingVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED;
        org.apache.commons.math.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math.exception.NumberIsTooSmallException((org.apache.commons.math.exception.util.Localizable) localizedFormats0, (java.lang.Number) (byte) 100, (java.lang.Number) 10, true);
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext5 = numberIsTooSmallException4.getContext();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapDivide(0.0d);
        arrayRealVector14.checkVectorDimensions(realVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = arrayRealVector10.ebeMultiply(realVector20);
        double[] doubleArray23 = arrayRealVector22.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector9, doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23, true);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector27, false);
        double double30 = arrayRealVector29.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector31.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector35.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector39.mapDivide(0.0d);
        arrayRealVector35.checkVectorDimensions(realVector41);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = arrayRealVector31.ebeMultiply(realVector41);
        double[] doubleArray44 = arrayRealVector43.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector43);
        double double46 = arrayRealVector43.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector29, (org.apache.commons.math.linear.RealVector) arrayRealVector43);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23, arrayRealVector29);
        exceptionContext5.setValue("hi!", (java.lang.Object) doubleArray23);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.DIGEST_NOT_INITIALIZED));
        org.junit.Assert.assertNotNull(exceptionContext5);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(arrayRealVector22);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(realVector33);
        org.junit.Assert.assertNotNull(realVector37);
        org.junit.Assert.assertNotNull(realVector41);
        org.junit.Assert.assertNotNull(arrayRealVector43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        double double9 = openMapRealMatrix2.getEntry(0, 0);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 0.0d, (-1.0d) };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray2);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math.exception.util.LocalizedFormats.NAN_ELEMENT_AT_INDEX;
        boolean boolean5 = arrayRealVector3.equals((java.lang.Object) localizedFormats4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.copy();
        double double10 = realVector7.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = arrayRealVector3.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NAN_ELEMENT_AT_INDEX + "'", localizedFormats4.equals(org.apache.commons.math.exception.util.LocalizedFormats.NAN_ELEMENT_AT_INDEX));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(realVector7);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = openMapRealMatrix2.walkInOptimizedOrder(realMatrixPreservingVisitor4, (int) (short) 100, (int) (byte) 1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector1 = arrayRealVector0.copy();
        double[] doubleArray2 = arrayRealVector0.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = arrayRealVector0.combineToSelf((double) 100, (double) 100L, (org.apache.commons.math.linear.RealVector) arrayRealVector5);
        double double10 = arrayRealVector9.getL1Norm();
        org.junit.Assert.assertNotNull(realVector1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realVector7);
        org.junit.Assert.assertNotNull(arrayRealVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        double[][] doubleArray12 = openMapRealMatrix2.getData();
        double[] doubleArray14 = openMapRealMatrix2.getRow((int) (byte) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix16 = openMapRealMatrix2.subtract(openMapRealMatrix15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getColumnDimension();
        double double6 = openMapRealMatrix2.getFrobeniusNorm();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.createMatrix((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        int int26 = openMapRealMatrix25.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix25.addToEntry(32, 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        int int9 = openMapRealMatrix5.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.multiplyEntry((int) '#', (int) (byte) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (35)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        double[][] doubleArray12 = openMapRealMatrix2.getData();
        double[] doubleArray14 = openMapRealMatrix2.getRow((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix19 = openMapRealMatrix2.getSubMatrix((int) (short) 10, (int) (byte) 10, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector1 = arrayRealVector0.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector2 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector2.copy();
        double double4 = realVector1.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector2);
        org.apache.commons.math.linear.RealVector realVector5 = realVector1.copy();
        // The following exception was thrown during execution in test generation
        try {
            realVector1.setEntry(52, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realVector1);
        org.junit.Assert.assertNotNull(realVector3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(realVector5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.RealVector realVector4 = realVector2.mapMultiply((double) 10);
        org.apache.commons.math.linear.RealVector realVector6 = realVector2.mapDivideToSelf((double) 10.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapDivide(0.0d);
        arrayRealVector14.checkVectorDimensions(realVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = arrayRealVector10.ebeMultiply(realVector20);
        double[] doubleArray23 = arrayRealVector22.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector9, doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23, true);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector27, false);
        double double30 = arrayRealVector29.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector31.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector35.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector39.mapDivide(0.0d);
        arrayRealVector35.checkVectorDimensions(realVector41);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = arrayRealVector31.ebeMultiply(realVector41);
        double[] doubleArray44 = arrayRealVector43.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector43);
        double double46 = arrayRealVector43.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector29, (org.apache.commons.math.linear.RealVector) arrayRealVector43);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23, arrayRealVector29);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector(realVector6, arrayRealVector48);
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector4);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(arrayRealVector22);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(realVector33);
        org.junit.Assert.assertNotNull(realVector37);
        org.junit.Assert.assertNotNull(realVector41);
        org.junit.Assert.assertNotNull(arrayRealVector43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        openMapRealMatrix2.multiplyEntry(0, 0, (double) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix2.transpose();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix13 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray14 = openMapRealMatrix13.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix13.scalarMultiply(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray20 = openMapRealMatrix19.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = openMapRealMatrix19.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrix16.subtract(realMatrix22);
        // The following exception was thrown during execution in test generation
        try {
            realMatrix9.setRowMatrix(100, realMatrix22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply((double) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapDivide(0.0d);
        arrayRealVector14.checkVectorDimensions(realVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = arrayRealVector10.ebeMultiply(realVector20);
        double[] doubleArray23 = arrayRealVector22.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector9, doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23, true);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.setRow((int) (short) 1, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixDimensionMismatchException; message: got 1x0 but expected 1x1");
        } catch (org.apache.commons.math.linear.MatrixDimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(arrayRealVector22);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getRowDimension();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        arrayRealVector10.checkVectorDimensions(realVector16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = arrayRealVector6.ebeMultiply(realVector16);
        double[] doubleArray19 = arrayRealVector18.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.copy();
        double[] doubleArray22 = arrayRealVector20.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = arrayRealVector18.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector20);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction24 = null;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = arrayRealVector20.map(univariateRealFunction24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector26 = openMapRealMatrix2.operate((org.apache.commons.math.linear.RealVector) arrayRealVector25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(arrayRealVector18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(realVector21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(arrayRealVector23);
        org.junit.Assert.assertNotNull(arrayRealVector25);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math.linear.MatrixDimensionMismatchException matrixDimensionMismatchException4 = new org.apache.commons.math.linear.MatrixDimensionMismatchException((int) (short) -1, (int) (byte) 100, (int) (byte) 1, (int) ' ');
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext5 = matrixDimensionMismatchException4.getContext();
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS;
        org.apache.commons.math.linear.MatrixDimensionMismatchException matrixDimensionMismatchException11 = new org.apache.commons.math.linear.MatrixDimensionMismatchException((int) (byte) 1, 10, (int) (short) -1, (int) (byte) 0);
        java.lang.Integer[] intArray12 = matrixDimensionMismatchException11.getExpectedDimensions();
        java.lang.Integer[] intArray13 = matrixDimensionMismatchException11.getExpectedDimensions();
        java.lang.Object[] objArray14 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[]) intArray13);
        exceptionContext5.addMessage((org.apache.commons.math.exception.util.Localizable) localizedFormats6, objArray14);
        org.junit.Assert.assertNotNull(exceptionContext5);
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS + "'", localizedFormats6.equals(org.apache.commons.math.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1, 0]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        double[][] doubleArray12 = openMapRealMatrix2.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector14 = openMapRealMatrix2.getColumnVector((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (97)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix2.getRowMatrix((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix2.preMultiply(realMatrix8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix8 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray9 = openMapRealMatrix8.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix8.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrix5.subtract(realMatrix11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector14 = realMatrix12.getRowVector(100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = openMapRealMatrix2.getColumn(32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        int int9 = openMapRealMatrix5.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix5.getColumnMatrix(1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        int int9 = openMapRealMatrix5.getRowDimension();
        int[] intArray16 = new int[] { 10, 52, (byte) 10, (short) -1, 0, 100 };
        int[] intArray23 = new int[] { ' ', 32, (byte) 1, '4', 52, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix5.getSubMatrix(intArray16, intArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 52, 10, -1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 32, 1, 52, 52, 52]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = openMapRealMatrix5.copy();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = openMapRealMatrix5.walkInOptimizedOrder(realMatrixChangingVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        int int6 = openMapRealMatrix2.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix8 = openMapRealMatrix2.power(1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.NonSquareMatrixException; message: non square (10x1) matrix");
        } catch (org.apache.commons.math.linear.NonSquareMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 100 };
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1 };
        org.apache.commons.math.exception.MultiDimensionMismatchException multiDimensionMismatchException4 = new org.apache.commons.math.exception.MultiDimensionMismatchException(intArray1, intArray3);
        java.lang.Integer[] intArray5 = multiDimensionMismatchException4.getExpectedDimensions();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix9.getRowMatrix(1);
        int int12 = openMapRealMatrix9.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = openMapRealMatrix5.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix9);
        int int14 = openMapRealMatrix9.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = openMapRealMatrix9.getEntry((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = openMapRealMatrix5.getEntry((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        int int26 = openMapRealMatrix25.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = openMapRealMatrix25.transpose();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector28.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector32);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector36.mapDivide(0.0d);
        arrayRealVector32.checkVectorDimensions(realVector38);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = arrayRealVector28.ebeMultiply(realVector38);
        double[] doubleArray41 = arrayRealVector40.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector40);
        double double43 = arrayRealVector40.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector40.mapDivide((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector46 = openMapRealMatrix25.operate((org.apache.commons.math.linear.RealVector) arrayRealVector40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realVector30);
        org.junit.Assert.assertNotNull(realVector34);
        org.junit.Assert.assertNotNull(realVector38);
        org.junit.Assert.assertNotNull(arrayRealVector40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(realVector45);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix2.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.multiplyEntry(32, 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix5.createMatrix((int) (byte) 1, (int) ' ');
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix15 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = openMapRealMatrix15.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix20 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = openMapRealMatrix20.getRowMatrix(1);
        boolean boolean23 = openMapRealMatrix20.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix15.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix20);
        double[][] doubleArray25 = openMapRealMatrix15.getData();
        double[] doubleArray27 = openMapRealMatrix15.getRow((int) (byte) 1);
        openMapRealMatrix5.setColumnMatrix((int) (byte) 0, (org.apache.commons.math.linear.RealMatrix) openMapRealMatrix15);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector29.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector29);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapDivide(0.0d);
        arrayRealVector29.checkVectorDimensions(realVector35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector37.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector37);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector44 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector41);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector45.mapDivide(0.0d);
        arrayRealVector41.checkVectorDimensions(realVector47);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = arrayRealVector37.ebeMultiply(realVector47);
        double[] doubleArray50 = arrayRealVector49.data;
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector29.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector49);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction52 = null;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = arrayRealVector49.map(univariateRealFunction52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector54.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector54);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector58.mapDivide(0.0d);
        arrayRealVector54.checkVectorDimensions(realVector60);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector62 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector62.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector62);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector66.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector69 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector66);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector70 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector70.mapDivide(0.0d);
        arrayRealVector66.checkVectorDimensions(realVector72);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector74 = arrayRealVector62.ebeMultiply(realVector72);
        double[] doubleArray75 = arrayRealVector74.data;
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector54.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector74);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction77 = null;
        org.apache.commons.math.linear.RealVector realVector78 = arrayRealVector54.mapToSelf(univariateRealFunction77);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector79 = arrayRealVector53.ebeMultiply(realVector78);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector80 = openMapRealMatrix5.operate(realVector78);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0]");
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertNotNull(realVector43);
        org.junit.Assert.assertNotNull(realVector47);
        org.junit.Assert.assertNotNull(arrayRealVector49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(realVector51);
        org.junit.Assert.assertNotNull(arrayRealVector53);
        org.junit.Assert.assertNotNull(realVector56);
        org.junit.Assert.assertNotNull(realVector60);
        org.junit.Assert.assertNotNull(realVector64);
        org.junit.Assert.assertNotNull(realVector68);
        org.junit.Assert.assertNotNull(realVector72);
        org.junit.Assert.assertNotNull(arrayRealVector74);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertNotNull(realVector76);
        org.junit.Assert.assertNotNull(realVector78);
        org.junit.Assert.assertNotNull(arrayRealVector79);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        int int3 = openMapRealMatrix2.getColumnDimension();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix6 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = openMapRealMatrix6.getRowMatrix(1);
        int int9 = openMapRealMatrix6.getColumnDimension();
        double double10 = openMapRealMatrix6.getFrobeniusNorm();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.multiply((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.addToEntry((int) '4', 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix5.createMatrix((int) (byte) 1, (int) ' ');
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12, false);
        double double15 = arrayRealVector14.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapDivide(0.0d);
        arrayRealVector20.checkVectorDimensions(realVector26);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = arrayRealVector16.ebeMultiply(realVector26);
        double[] doubleArray29 = arrayRealVector28.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector28);
        double double31 = arrayRealVector28.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14, (org.apache.commons.math.linear.RealVector) arrayRealVector28);
        double[] doubleArray33 = arrayRealVector28.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector34.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = arrayRealVector28.ebeDivide(realVector35);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix39 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = openMapRealMatrix39.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix44 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = openMapRealMatrix44.getRowMatrix(1);
        boolean boolean47 = openMapRealMatrix44.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = openMapRealMatrix39.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix44);
        double[][] doubleArray49 = openMapRealMatrix39.getData();
        double[] doubleArray51 = openMapRealMatrix39.getRow((int) (byte) 1);
        arrayRealVector36.data = doubleArray51;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray51, true);
        double[] doubleArray55 = realMatrix11.preMultiply(doubleArray51);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix59 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix62 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = openMapRealMatrix59.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix62);
        // The following exception was thrown during execution in test generation
        try {
            realMatrix11.setRowMatrix((int) '4', (org.apache.commons.math.linear.RealMatrix) openMapRealMatrix62);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(realVector26);
        org.junit.Assert.assertNotNull(arrayRealVector28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(arrayRealVector36);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix63);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        openMapRealMatrix2.multiplyEntry(0, 0, (double) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix2.transpose();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix14 = openMapRealMatrix2.getSubMatrix((int) (short) -1, (int) '#', 10, 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix2.getRowMatrix((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = openMapRealMatrix2.getColumn((int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (35)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        arrayRealVector0.checkVectorDimensions(realVector6);
        arrayRealVector0.set((double) 1L);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12, false);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector0.combine(0.0d, 0.0d, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        org.apache.commons.math.linear.RealVector realVector17 = realVector15.mapToSelf(univariateRealFunction16);
        double double18 = realVector17.getNorm();
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(realVector17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = openMapRealMatrix7.walkInOptimizedOrder(realMatrixChangingVisitor12, (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction4 = null;
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector3.map(univariateRealFunction4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = arrayRealVector3.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8, true);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector8.map(univariateRealFunction12);
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector5);
        org.junit.Assert.assertNotNull(arrayRealVector9);
        org.junit.Assert.assertNotNull(realVector13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector7 = openMapRealMatrix2.getColumnVector((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealMatrix7.getRowVector((int) (byte) 1);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realVector13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        arrayRealVector4.checkVectorDimensions(realVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector0.ebeMultiply(realVector10);
        double[] doubleArray13 = arrayRealVector12.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector18);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector22.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector22);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapDivide(0.0d);
        arrayRealVector22.checkVectorDimensions(realVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = arrayRealVector18.ebeMultiply(realVector28);
        double[] doubleArray31 = arrayRealVector30.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector30);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector14.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector32);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector14.mapAddToSelf(0.0d);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector12.append(realVector35);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector12.mapSubtractToSelf((double) (short) 100);
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(arrayRealVector12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector24);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertNotNull(arrayRealVector30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(realVector33);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(realVector36);
        org.junit.Assert.assertNotNull(realVector38);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.copy();
        double[] doubleArray13 = arrayRealVector11.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction18 = null;
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.map(univariateRealFunction18);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector20, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = arrayRealVector17.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector22);
        double[] doubleArray24 = arrayRealVector17.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector25);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction29 = null;
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector28.map(univariateRealFunction29);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector31, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = arrayRealVector28.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33, true);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24, arrayRealVector36);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13, doubleArray24);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.setColumn((int) (short) 100, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector19);
        org.junit.Assert.assertNotNull(arrayRealVector23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(realVector27);
        org.junit.Assert.assertNotNull(realVector30);
        org.junit.Assert.assertNotNull(arrayRealVector34);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        int int26 = openMapRealMatrix25.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = openMapRealMatrix25.transpose();
        // The following exception was thrown during execution in test generation
        try {
            realMatrix27.addToEntry(32, 0, Double.NaN);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(realMatrix27);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix2.getRowMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = openMapRealMatrix2.walkInColumnOrder(realMatrixPreservingVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        double[] doubleArray11 = openMapRealMatrix5.getRow((int) (byte) 1);
        double double12 = openMapRealMatrix5.getFrobeniusNorm();
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.ZERO_NORM;
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 100 };
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1 };
        org.apache.commons.math.exception.MultiDimensionMismatchException multiDimensionMismatchException5 = new org.apache.commons.math.exception.MultiDimensionMismatchException(intArray2, intArray4);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] {};
        org.apache.commons.math.exception.MultiDimensionMismatchException multiDimensionMismatchException7 = new org.apache.commons.math.exception.MultiDimensionMismatchException((org.apache.commons.math.exception.util.Localizable) localizedFormats0, intArray4, intArray6);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.ZERO_NORM + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.ZERO_NORM));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = openMapRealMatrix5.copy();
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = openMapRealMatrix5.walkInOptimizedOrder(realMatrixPreservingVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        arrayRealVector0.checkVectorDimensions(realVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapDivide(0.0d);
        arrayRealVector12.checkVectorDimensions(realVector18);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = arrayRealVector8.ebeMultiply(realVector18);
        double[] doubleArray21 = arrayRealVector20.data;
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector0.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector20);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction23 = null;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = arrayRealVector20.map(univariateRealFunction23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector25);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector29.mapDivide(0.0d);
        arrayRealVector25.checkVectorDimensions(realVector31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector37.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector37);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapDivide(0.0d);
        arrayRealVector37.checkVectorDimensions(realVector43);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = arrayRealVector33.ebeMultiply(realVector43);
        double[] doubleArray46 = arrayRealVector45.data;
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector25.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector45);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction48 = null;
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector25.mapToSelf(univariateRealFunction48);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = arrayRealVector24.ebeMultiply(realVector49);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector51.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector51);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector55.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector55);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector59.mapDivide(0.0d);
        arrayRealVector55.checkVectorDimensions(realVector61);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector63 = arrayRealVector51.ebeMultiply(realVector61);
        double[] doubleArray64 = arrayRealVector63.data;
        double double65 = arrayRealVector63.getMinValue();
        double double66 = arrayRealVector50.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector63);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector69 = arrayRealVector63.getSubVector((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(arrayRealVector20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(arrayRealVector24);
        org.junit.Assert.assertNotNull(realVector27);
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertNotNull(realVector43);
        org.junit.Assert.assertNotNull(arrayRealVector45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(realVector47);
        org.junit.Assert.assertNotNull(realVector49);
        org.junit.Assert.assertNotNull(arrayRealVector50);
        org.junit.Assert.assertNotNull(realVector53);
        org.junit.Assert.assertNotNull(realVector57);
        org.junit.Assert.assertNotNull(realVector61);
        org.junit.Assert.assertNotNull(arrayRealVector63);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        double[] doubleArray11 = openMapRealMatrix9.getColumn(0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapDivide(0.0d);
        arrayRealVector16.checkVectorDimensions(realVector22);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = arrayRealVector12.ebeMultiply(realVector22);
        double[] doubleArray25 = arrayRealVector24.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector24);
        double double27 = arrayRealVector24.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector24.mapDivide((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector30.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector30);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction34 = null;
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.map(univariateRealFunction34);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector36, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = arrayRealVector33.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector38);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector40.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector40);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction44 = null;
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector43.map(univariateRealFunction44);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector46, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = arrayRealVector43.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector48);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector33.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector49);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = arrayRealVector49.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector52, false);
        double double55 = arrayRealVector54.getL1Norm();
        double double56 = arrayRealVector51.getL1Distance((org.apache.commons.math.linear.RealVector) arrayRealVector54);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = arrayRealVector24.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector51);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector58.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector58);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector62 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector62.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector62);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector66.mapDivide(0.0d);
        arrayRealVector62.checkVectorDimensions(realVector68);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector70 = arrayRealVector58.ebeMultiply(realVector68);
        double[] doubleArray71 = arrayRealVector70.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector72 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector72.copy();
        double[] doubleArray74 = arrayRealVector72.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector75 = arrayRealVector70.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector72);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction76 = null;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector77 = arrayRealVector72.map(univariateRealFunction76);
        double double78 = arrayRealVector57.getL1Distance((org.apache.commons.math.linear.RealVector) arrayRealVector77);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector79 = openMapRealMatrix9.operate((org.apache.commons.math.linear.RealVector) arrayRealVector57);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(arrayRealVector24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(realVector29);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(arrayRealVector39);
        org.junit.Assert.assertNotNull(realVector42);
        org.junit.Assert.assertNotNull(realVector45);
        org.junit.Assert.assertNotNull(arrayRealVector49);
        org.junit.Assert.assertNotNull(realVector50);
        org.junit.Assert.assertNotNull(arrayRealVector51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(arrayRealVector57);
        org.junit.Assert.assertNotNull(realVector60);
        org.junit.Assert.assertNotNull(realVector64);
        org.junit.Assert.assertNotNull(realVector68);
        org.junit.Assert.assertNotNull(arrayRealVector70);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertNotNull(realVector73);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertNotNull(arrayRealVector75);
        org.junit.Assert.assertNotNull(arrayRealVector77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.N_POINTS_GAUSS_LEGENDRE_INTEGRATOR_NOT_SUPPORTED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.N_POINTS_GAUSS_LEGENDRE_INTEGRATOR_NOT_SUPPORTED + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.N_POINTS_GAUSS_LEGENDRE_INTEGRATOR_NOT_SUPPORTED));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix27 = openMapRealMatrix19.createMatrix(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix5.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.setEntry((int) (byte) 0, (int) (byte) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        int int26 = openMapRealMatrix25.getColumnDimension();
        int[] intArray31 = new int[] { ' ', '#', (byte) 1, (short) 0 };
        int[] intArray36 = new int[] { 32, (short) 1, '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix37 = openMapRealMatrix25.getSubMatrix(intArray31, intArray36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[32, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 1, 35, -1]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getColumnDimension();
        double double6 = openMapRealMatrix2.getFrobeniusNorm();
        int int7 = openMapRealMatrix2.getColumnDimension();
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_TOO_SMALL;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_TOO_SMALL + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.NUMBER_TOO_SMALL));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix5.createMatrix((int) (byte) 1, (int) ' ');
        int int12 = openMapRealMatrix5.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = openMapRealMatrix5.walkInColumnOrder(realMatrixChangingVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        arrayRealVector0.checkVectorDimensions(realVector6);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector0.map(univariateRealFunction8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapDivide(0.0d);
        arrayRealVector14.checkVectorDimensions(realVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = arrayRealVector10.ebeMultiply(realVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector27);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector31.mapDivide(0.0d);
        arrayRealVector27.checkVectorDimensions(realVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = arrayRealVector23.ebeMultiply(realVector33);
        double[] doubleArray36 = arrayRealVector35.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector37.mapDivide(0.0d);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector35.append((org.apache.commons.math.linear.RealVector) arrayRealVector37);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = arrayRealVector10.ebeDivide(realVector40);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector42.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector42);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector46.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector46);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector50.mapDivide(0.0d);
        arrayRealVector46.checkVectorDimensions(realVector52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = arrayRealVector42.ebeMultiply(realVector52);
        double[] doubleArray55 = arrayRealVector54.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector56.copy();
        double[] doubleArray58 = arrayRealVector56.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = arrayRealVector54.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector56);
        realVector40.checkVectorDimensions((org.apache.commons.math.linear.RealVector) arrayRealVector56);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0, (org.apache.commons.math.linear.RealVector) arrayRealVector56);
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(arrayRealVector22);
        org.junit.Assert.assertNotNull(realVector25);
        org.junit.Assert.assertNotNull(realVector29);
        org.junit.Assert.assertNotNull(realVector33);
        org.junit.Assert.assertNotNull(arrayRealVector35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertNotNull(realVector40);
        org.junit.Assert.assertNotNull(arrayRealVector41);
        org.junit.Assert.assertNotNull(realVector44);
        org.junit.Assert.assertNotNull(realVector48);
        org.junit.Assert.assertNotNull(realVector52);
        org.junit.Assert.assertNotNull(arrayRealVector54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(realVector57);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertNotNull(arrayRealVector59);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.multiplyEntry((int) (byte) 100, (int) ' ', (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector2 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0, false);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector2.mapSubtract((double) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.copy();
        double double7 = arrayRealVector2.getL1Distance((org.apache.commons.math.linear.RealVector) arrayRealVector5);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix12 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = openMapRealMatrix12.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix17 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = openMapRealMatrix17.getRowMatrix(1);
        boolean boolean20 = openMapRealMatrix17.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix12.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix17);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix24 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = openMapRealMatrix24.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix29 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = openMapRealMatrix29.getRowMatrix(1);
        boolean boolean32 = openMapRealMatrix29.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = openMapRealMatrix24.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix29);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = openMapRealMatrix17.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix29);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealMatrix29.getRowVector(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = arrayRealVector2.combine((double) (byte) 1, (double) '4', realVector36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realVector4);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realVector36);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector1 = arrayRealVector0.copy();
        double[] doubleArray2 = arrayRealVector0.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector3.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapDivide(0.0d);
        arrayRealVector7.checkVectorDimensions(realVector13);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = arrayRealVector3.ebeMultiply(realVector13);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapDivide(0.0d);
        arrayRealVector20.checkVectorDimensions(realVector26);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = arrayRealVector16.ebeMultiply(realVector26);
        double[] doubleArray29 = arrayRealVector28.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector30.mapDivide(0.0d);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector28.append((org.apache.commons.math.linear.RealVector) arrayRealVector30);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = arrayRealVector3.ebeDivide(realVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0, arrayRealVector3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector35.getSubVector((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realVector1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realVector5);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertNotNull(arrayRealVector15);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(realVector26);
        org.junit.Assert.assertNotNull(arrayRealVector28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(realVector33);
        org.junit.Assert.assertNotNull(arrayRealVector34);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix27 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = openMapRealMatrix27.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix32 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = openMapRealMatrix32.getRowMatrix(1);
        boolean boolean35 = openMapRealMatrix32.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = openMapRealMatrix27.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix32);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix39 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = openMapRealMatrix39.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix44 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = openMapRealMatrix44.getRowMatrix(1);
        boolean boolean47 = openMapRealMatrix44.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = openMapRealMatrix39.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix44);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = openMapRealMatrix32.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix44);
        boolean boolean50 = realMatrix49.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = openMapRealMatrix19.add(realMatrix49);
        // The following exception was thrown during execution in test generation
        try {
            realMatrix51.setEntry(10, (int) (short) 1, Double.NaN);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(realMatrix51);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double30 = openMapRealMatrix7.walkInColumnOrder(realMatrixPreservingVisitor25, (int) ' ', (int) '4', (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = openMapRealMatrix5.copy();
        int int11 = openMapRealMatrix5.getColumnDimension();
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector2 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector3, false);
        double double6 = arrayRealVector5.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapDivide(0.0d);
        arrayRealVector11.checkVectorDimensions(realVector17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = arrayRealVector7.ebeMultiply(realVector17);
        double[] doubleArray20 = arrayRealVector19.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector19);
        double double22 = arrayRealVector19.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5, (org.apache.commons.math.linear.RealVector) arrayRealVector19);
        double[] doubleArray24 = arrayRealVector19.toArray();
        arrayRealVector2.data = doubleArray24;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertNotNull(realVector17);
        org.junit.Assert.assertNotNull(arrayRealVector19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix2.getRowMatrix((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix2.getColumnMatrix((int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (35)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply((double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrix5.scalarAdd(0.0d);
        realMatrix7.addToEntry((int) (byte) 0, (int) (short) 0, (double) 32);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.math.exception.NotStrictlyPositiveException notStrictlyPositiveException1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number) 1.0f);
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext2 = notStrictlyPositiveException1.getContext();
        java.lang.Object obj4 = exceptionContext2.getValue("hi!");
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        java.lang.Double[] doubleArray8 = new java.lang.Double[] { 0.0d, (-1.0d) };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray8);
        exceptionContext2.addMessage(localizable5, (java.lang.Object[]) doubleArray8);
        org.junit.Assert.assertNotNull(exceptionContext2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix5.createMatrix((int) (byte) 1, (int) ' ');
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = realMatrix11.walkInRowOrder(realMatrixPreservingVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix5.createMatrix((int) (byte) 1, (int) ' ');
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix15 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = openMapRealMatrix15.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix20 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = openMapRealMatrix20.getRowMatrix(1);
        boolean boolean23 = openMapRealMatrix20.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix15.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix20);
        double[][] doubleArray25 = openMapRealMatrix15.getData();
        double[] doubleArray27 = openMapRealMatrix15.getRow((int) (byte) 1);
        openMapRealMatrix5.setColumnMatrix((int) (byte) 0, (org.apache.commons.math.linear.RealMatrix) openMapRealMatrix15);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = openMapRealMatrix5.getEntry((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (97)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply((double) 10);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = openMapRealMatrix2.walkInColumnOrder(realMatrixChangingVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        int int26 = openMapRealMatrix7.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector28 = openMapRealMatrix7.getColumnVector((int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (35)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply((double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrix5.scalarAdd(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix10 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix13 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = openMapRealMatrix10.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix13);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean16 = openMapRealMatrix13.equals((java.lang.Object) localizedFormats15);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = openMapRealMatrix13.createMatrix((int) (byte) 1, (int) ' ');
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix23 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = openMapRealMatrix23.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix28 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = openMapRealMatrix28.getRowMatrix(1);
        boolean boolean31 = openMapRealMatrix28.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = openMapRealMatrix23.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix28);
        double[][] doubleArray33 = openMapRealMatrix23.getData();
        double[] doubleArray35 = openMapRealMatrix23.getRow((int) (byte) 1);
        openMapRealMatrix13.setColumnMatrix((int) (byte) 0, (org.apache.commons.math.linear.RealMatrix) openMapRealMatrix23);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrix7.subtract((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix13);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix13.addToEntry((int) (byte) -1, (int) (short) -1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats15.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix5.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = openMapRealMatrix5.copy();
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction4 = null;
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector3.map(univariateRealFunction4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = arrayRealVector3.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector8);
        double[] doubleArray10 = arrayRealVector3.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector11);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.map(univariateRealFunction15);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector17, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = arrayRealVector14.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector19);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector19, true);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray10, arrayRealVector22);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = arrayRealVector22.copy();
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector5);
        org.junit.Assert.assertNotNull(arrayRealVector9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(arrayRealVector20);
        org.junit.Assert.assertNotNull(arrayRealVector24);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = openMapRealMatrix25.getRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix2.getRowMatrix((int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix11 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = openMapRealMatrix11.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix14);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean17 = openMapRealMatrix14.equals((java.lang.Object) localizedFormats16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = openMapRealMatrix14.createMatrix((int) (byte) 1, (int) ' ');
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector21, false);
        double double24 = arrayRealVector23.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector25);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector29.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector29);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapDivide(0.0d);
        arrayRealVector29.checkVectorDimensions(realVector35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = arrayRealVector25.ebeMultiply(realVector35);
        double[] doubleArray38 = arrayRealVector37.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector37);
        double double40 = arrayRealVector37.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector23, (org.apache.commons.math.linear.RealVector) arrayRealVector37);
        double[] doubleArray42 = arrayRealVector37.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = arrayRealVector37.ebeDivide(realVector44);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix48 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = openMapRealMatrix48.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix53 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = openMapRealMatrix53.getRowMatrix(1);
        boolean boolean56 = openMapRealMatrix53.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = openMapRealMatrix48.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix53);
        double[][] doubleArray58 = openMapRealMatrix48.getData();
        double[] doubleArray60 = openMapRealMatrix48.getRow((int) (byte) 1);
        arrayRealVector45.data = doubleArray60;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector63 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray60, true);
        double[] doubleArray64 = realMatrix20.preMultiply(doubleArray60);
        // The following exception was thrown during execution in test generation
        try {
            realMatrix7.setRow((int) ' ', doubleArray64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats16.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(realVector27);
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(arrayRealVector37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(realVector44);
        org.junit.Assert.assertNotNull(arrayRealVector45);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        double[] doubleArray11 = openMapRealMatrix9.getColumn(0);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        openMapRealMatrix14.multiplyEntry(0, 0, (double) 1);
        double double21 = openMapRealMatrix14.getFrobeniusNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = openMapRealMatrix14.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix9.multiply((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix5.createMatrix((int) (byte) 1, (int) ' ');
        int int12 = openMapRealMatrix5.getColumnDimension();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix15 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray16 = openMapRealMatrix15.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = openMapRealMatrix15.scalarMultiply(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix21 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray22 = openMapRealMatrix21.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix21.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrix18.subtract(realMatrix24);
        double double26 = realMatrix18.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix27 = openMapRealMatrix5.preMultiply(realMatrix18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        double[][] doubleArray12 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealMatrix2.getRowVector(1);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realVector14);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        openMapRealMatrix2.multiplyEntry(0, 0, (double) 1);
        double double9 = openMapRealMatrix2.getFrobeniusNorm();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix12 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = openMapRealMatrix12.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix17 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = openMapRealMatrix17.getRowMatrix(1);
        boolean boolean20 = openMapRealMatrix17.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix12.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix17);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix24 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = openMapRealMatrix24.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix29 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = openMapRealMatrix29.getRowMatrix(1);
        boolean boolean32 = openMapRealMatrix29.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = openMapRealMatrix24.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix29);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = openMapRealMatrix17.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix29);
        boolean boolean35 = realMatrix34.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrix34.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrix36.transpose();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix38 = openMapRealMatrix2.subtract(realMatrix36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixDimensionMismatchException; message: got 10x1 but expected 1x10");
        } catch (org.apache.commons.math.linear.MatrixDimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.scalarMultiply((double) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector13);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector21.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapDivide(0.0d);
        arrayRealVector21.checkVectorDimensions(realVector27);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = arrayRealVector17.ebeMultiply(realVector27);
        double[] doubleArray30 = arrayRealVector29.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector29);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector13.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector31);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector13.mapAddToSelf(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            realMatrix11.setColumnVector((int) '4', (org.apache.commons.math.linear.RealVector) arrayRealVector13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(realVector19);
        org.junit.Assert.assertNotNull(realVector23);
        org.junit.Assert.assertNotNull(realVector27);
        org.junit.Assert.assertNotNull(arrayRealVector29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(realVector34);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        int int26 = openMapRealMatrix7.getColumnDimension();
        int int27 = openMapRealMatrix7.getRowDimension();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix34 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray35 = openMapRealMatrix34.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = openMapRealMatrix34.scalarMultiply((double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrix37.scalarAdd(0.0d);
        double[][] doubleArray40 = realMatrix37.getData();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix7.copySubMatrix((int) (short) 1, 32, (int) (byte) 100, (int) (short) 100, doubleArray40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray40);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double31 = openMapRealMatrix25.walkInOptimizedOrder(realMatrixPreservingVisitor26, (int) (short) 100, (int) (short) -1, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply((double) 10);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix8 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = openMapRealMatrix8.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix13 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = openMapRealMatrix13.getRowMatrix(1);
        boolean boolean16 = openMapRealMatrix13.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = openMapRealMatrix8.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix13);
        double[] doubleArray19 = openMapRealMatrix8.getRow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix20 = openMapRealMatrix2.multiply(openMapRealMatrix8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        openMapRealMatrix2.multiplyEntry(0, 0, (double) 1);
        double double9 = openMapRealMatrix2.getFrobeniusNorm();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = openMapRealMatrix2.walkInColumnOrder(realMatrixChangingVisitor10, (int) (short) 1, (int) (byte) 0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: initial row 1 after final row 0");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        double[] doubleArray11 = openMapRealMatrix9.getColumn(0);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = openMapRealMatrix9.walkInColumnOrder(realMatrixChangingVisitor12, (int) (byte) 100, 1, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix5.getColumnDimension();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = openMapRealMatrix5.walkInOptimizedOrder(realMatrixChangingVisitor8, (int) 'a', 0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (97)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix9.getRowMatrix(1);
        int int12 = openMapRealMatrix9.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = openMapRealMatrix5.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix9);
        int[] intArray15 = new int[] { ' ' };
        int[] intArray17 = new int[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix18 = openMapRealMatrix9.getSubMatrix(intArray15, intArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getColumnDimension();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = openMapRealMatrix2.add(openMapRealMatrix6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        arrayRealVector4.checkVectorDimensions(realVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector0.ebeMultiply(realVector10);
        double[] doubleArray13 = arrayRealVector12.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.copy();
        double[] doubleArray16 = arrayRealVector14.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector12.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector14);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction18 = null;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = arrayRealVector14.map(univariateRealFunction18);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor20 = arrayRealVector14.iterator();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector21.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapDivide(0.0d);
        arrayRealVector21.checkVectorDimensions(realVector27);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector29.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector29);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector37.mapDivide(0.0d);
        arrayRealVector33.checkVectorDimensions(realVector39);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = arrayRealVector29.ebeMultiply(realVector39);
        double[] doubleArray42 = arrayRealVector41.data;
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector21.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector41);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction44 = null;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = arrayRealVector41.map(univariateRealFunction44);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector46.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector46);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector50.mapDivide(0.0d);
        arrayRealVector46.checkVectorDimensions(realVector52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector54.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector54);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector58.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector58);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector62 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector62.mapDivide(0.0d);
        arrayRealVector58.checkVectorDimensions(realVector64);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = arrayRealVector54.ebeMultiply(realVector64);
        double[] doubleArray67 = arrayRealVector66.data;
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector46.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector66);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction69 = null;
        org.apache.commons.math.linear.RealVector realVector70 = arrayRealVector46.mapToSelf(univariateRealFunction69);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector71 = arrayRealVector45.ebeMultiply(realVector70);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector72 = arrayRealVector14.append(arrayRealVector45);
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(arrayRealVector12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(arrayRealVector17);
        org.junit.Assert.assertNotNull(arrayRealVector19);
        org.junit.Assert.assertNotNull(entryItor20);
        org.junit.Assert.assertNotNull(realVector23);
        org.junit.Assert.assertNotNull(realVector27);
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertNotNull(arrayRealVector41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(realVector43);
        org.junit.Assert.assertNotNull(arrayRealVector45);
        org.junit.Assert.assertNotNull(realVector48);
        org.junit.Assert.assertNotNull(realVector52);
        org.junit.Assert.assertNotNull(realVector56);
        org.junit.Assert.assertNotNull(realVector60);
        org.junit.Assert.assertNotNull(realVector64);
        org.junit.Assert.assertNotNull(arrayRealVector66);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertNotNull(realVector68);
        org.junit.Assert.assertNotNull(realVector70);
        org.junit.Assert.assertNotNull(arrayRealVector71);
        org.junit.Assert.assertNotNull(arrayRealVector72);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = openMapRealMatrix2.walkInColumnOrder(realMatrixChangingVisitor7, (int) (byte) 1, 52, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix9.getRowMatrix(1);
        int int12 = openMapRealMatrix9.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = openMapRealMatrix5.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix9);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix16 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = openMapRealMatrix16.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix21 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix21.getRowMatrix(1);
        boolean boolean24 = openMapRealMatrix21.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = openMapRealMatrix16.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix21);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix28 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = openMapRealMatrix28.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix33 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = openMapRealMatrix33.getRowMatrix(1);
        boolean boolean36 = openMapRealMatrix33.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = openMapRealMatrix28.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix33);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = openMapRealMatrix21.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix39 = openMapRealMatrix5.multiply(realMatrix38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.power(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.NonSquareMatrixException; message: non square (10x1) matrix");
        } catch (org.apache.commons.math.linear.NonSquareMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix5.createMatrix((int) (byte) 1, (int) ' ');
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix15 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = openMapRealMatrix15.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix20 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = openMapRealMatrix20.getRowMatrix(1);
        boolean boolean23 = openMapRealMatrix20.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix15.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix20);
        double[][] doubleArray25 = openMapRealMatrix15.getData();
        double[] doubleArray27 = openMapRealMatrix15.getRow((int) (byte) 1);
        openMapRealMatrix5.setColumnMatrix((int) (byte) 0, (org.apache.commons.math.linear.RealMatrix) openMapRealMatrix15);
        int int29 = openMapRealMatrix5.getRowDimension();
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector1 = arrayRealVector0.copy();
        double[] doubleArray2 = arrayRealVector0.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray2, true);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapDivide(0.0d);
        arrayRealVector12.checkVectorDimensions(realVector18);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = arrayRealVector8.ebeMultiply(realVector18);
        double[] doubleArray21 = arrayRealVector20.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7, doubleArray21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray21, true);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector25, false);
        double double28 = arrayRealVector27.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector29.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector29);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector37.mapDivide(0.0d);
        arrayRealVector33.checkVectorDimensions(realVector39);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = arrayRealVector29.ebeMultiply(realVector39);
        double[] doubleArray42 = arrayRealVector41.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector41);
        double double44 = arrayRealVector41.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector27, (org.apache.commons.math.linear.RealVector) arrayRealVector41);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray21, arrayRealVector27);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray2, doubleArray21);
        org.junit.Assert.assertNotNull(realVector1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(arrayRealVector20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertNotNull(arrayRealVector41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        int int26 = openMapRealMatrix7.getColumnDimension();
        int int27 = openMapRealMatrix7.getRowDimension();
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double33 = openMapRealMatrix7.walkInRowOrder(realMatrixChangingVisitor28, (int) (short) 100, (int) (short) 100, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        arrayRealVector4.checkVectorDimensions(realVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector0.ebeMultiply(realVector10);
        double[] doubleArray13 = arrayRealVector12.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapDivide(0.0d);
        arrayRealVector14.checkVectorDimensions(realVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector22.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector22);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector26);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector30.mapDivide(0.0d);
        arrayRealVector26.checkVectorDimensions(realVector32);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = arrayRealVector22.ebeMultiply(realVector32);
        double[] doubleArray35 = arrayRealVector34.data;
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector14.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector34);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13, arrayRealVector14);
        boolean boolean38 = arrayRealVector37.isNaN();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector39.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector39);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector43.mapDivide(0.0d);
        arrayRealVector39.checkVectorDimensions(realVector45);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector47.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector47);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector51.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector51);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector55.mapDivide(0.0d);
        arrayRealVector51.checkVectorDimensions(realVector57);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = arrayRealVector47.ebeMultiply(realVector57);
        double[] doubleArray60 = arrayRealVector59.data;
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector39.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector59);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction62 = null;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector63 = arrayRealVector59.map(univariateRealFunction62);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = arrayRealVector37.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector63);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix68 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = openMapRealMatrix68.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix73 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = openMapRealMatrix73.getRowMatrix(1);
        boolean boolean76 = openMapRealMatrix73.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = openMapRealMatrix68.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix73);
        double[] doubleArray79 = openMapRealMatrix68.getRow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            arrayRealVector64.setSubVector((int) (short) 0, doubleArray79);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: index (0)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(arrayRealVector12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector24);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(arrayRealVector34);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(realVector36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(realVector41);
        org.junit.Assert.assertNotNull(realVector45);
        org.junit.Assert.assertNotNull(realVector49);
        org.junit.Assert.assertNotNull(realVector53);
        org.junit.Assert.assertNotNull(realVector57);
        org.junit.Assert.assertNotNull(arrayRealVector59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(realVector61);
        org.junit.Assert.assertNotNull(arrayRealVector63);
        org.junit.Assert.assertNotNull(arrayRealVector64);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        double[][] doubleArray12 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = openMapRealMatrix2.createMatrix((int) (short) 10, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = openMapRealMatrix2.scalarAdd((double) 100L);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        arrayRealVector4.checkVectorDimensions(realVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector0.ebeMultiply(realVector10);
        double[] doubleArray13 = arrayRealVector12.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.copy();
        double[] doubleArray16 = arrayRealVector14.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector12.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector18);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector22.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector22);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapDivide(0.0d);
        arrayRealVector22.checkVectorDimensions(realVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = arrayRealVector18.ebeMultiply(realVector28);
        double[] doubleArray31 = arrayRealVector30.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector32);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector36.mapDivide(0.0d);
        arrayRealVector32.checkVectorDimensions(realVector38);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector40.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector40);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector44 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector44.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector44);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector48.mapDivide(0.0d);
        arrayRealVector44.checkVectorDimensions(realVector50);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = arrayRealVector40.ebeMultiply(realVector50);
        double[] doubleArray53 = arrayRealVector52.data;
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector32.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31, arrayRealVector32);
        boolean boolean56 = arrayRealVector55.isNaN();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = arrayRealVector12.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector55);
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(arrayRealVector12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(arrayRealVector17);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector24);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertNotNull(arrayRealVector30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(realVector34);
        org.junit.Assert.assertNotNull(realVector38);
        org.junit.Assert.assertNotNull(realVector42);
        org.junit.Assert.assertNotNull(realVector46);
        org.junit.Assert.assertNotNull(realVector50);
        org.junit.Assert.assertNotNull(arrayRealVector52);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertNotNull(realVector54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(arrayRealVector57);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix(0, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        arrayRealVector10.checkVectorDimensions(realVector16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = arrayRealVector6.ebeMultiply(realVector16);
        double[] doubleArray19 = arrayRealVector18.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector24);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector28.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapDivide(0.0d);
        arrayRealVector28.checkVectorDimensions(realVector34);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = arrayRealVector24.ebeMultiply(realVector34);
        double[] doubleArray37 = arrayRealVector36.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector36);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector20.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector38);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector20.mapAddToSelf(0.0d);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector18.append(realVector41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector43 = openMapRealMatrix2.operate((org.apache.commons.math.linear.RealVector) arrayRealVector18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(arrayRealVector18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(realVector26);
        org.junit.Assert.assertNotNull(realVector30);
        org.junit.Assert.assertNotNull(realVector34);
        org.junit.Assert.assertNotNull(arrayRealVector36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(realVector39);
        org.junit.Assert.assertNotNull(realVector41);
        org.junit.Assert.assertNotNull(realVector42);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean8 = openMapRealMatrix5.equals((java.lang.Object) localizedFormats7);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix5.createMatrix((int) (byte) 1, (int) ' ');
        int[] intArray12 = new int[] {};
        int[] intArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrix11.getSubMatrix(intArray12, intArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats7.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix5.getColumnDimension();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray15 = openMapRealMatrix14.getData();
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.copySubMatrix(0, 0, 0, 32, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        int int25 = openMapRealMatrix7.getRowDimension();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix28 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = openMapRealMatrix28.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix33 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = openMapRealMatrix33.getRowMatrix(1);
        boolean boolean36 = openMapRealMatrix33.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = openMapRealMatrix28.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix33);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix40 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = openMapRealMatrix40.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix45 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = openMapRealMatrix45.getRowMatrix(1);
        boolean boolean48 = openMapRealMatrix45.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = openMapRealMatrix40.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix45);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = openMapRealMatrix33.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix45);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix51 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix33);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = openMapRealMatrix7.subtract((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix33);
        int int53 = openMapRealMatrix33.getRowDimension();
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        int int25 = openMapRealMatrix7.getRowDimension();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix28 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = openMapRealMatrix28.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix33 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = openMapRealMatrix33.getRowMatrix(1);
        boolean boolean36 = openMapRealMatrix33.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = openMapRealMatrix28.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix33);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix40 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = openMapRealMatrix40.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix45 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = openMapRealMatrix45.getRowMatrix(1);
        boolean boolean48 = openMapRealMatrix45.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = openMapRealMatrix40.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix45);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = openMapRealMatrix33.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix45);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix51 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix33);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = openMapRealMatrix7.subtract((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector53.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector53);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector57.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector57);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector61.mapDivide(0.0d);
        arrayRealVector57.checkVectorDimensions(realVector63);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = arrayRealVector53.ebeMultiply(realVector63);
        double[] doubleArray66 = arrayRealVector65.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector68 = openMapRealMatrix7.operate((org.apache.commons.math.linear.RealVector) arrayRealVector67);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realVector55);
        org.junit.Assert.assertNotNull(realVector59);
        org.junit.Assert.assertNotNull(realVector63);
        org.junit.Assert.assertNotNull(arrayRealVector65);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector2 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector3.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapDivide(0.0d);
        arrayRealVector7.checkVectorDimensions(realVector13);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = arrayRealVector3.ebeMultiply(realVector13);
        double[] doubleArray16 = arrayRealVector15.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector2, doubleArray16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.copy();
        double double22 = realVector19.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector20);
        boolean boolean23 = arrayRealVector20.isInfinite();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector2, arrayRealVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapSubtract((double) 10L);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector30.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector30);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction34 = null;
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.map(univariateRealFunction34);
        int int36 = realVector35.getMaxIndex();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector27, realVector35);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector20.combine((double) (short) -1, (double) (short) 1, (org.apache.commons.math.linear.RealVector) arrayRealVector37);
        org.apache.commons.math.linear.RealVector realVector40 = realVector38.mapSubtractToSelf((double) 100L);
        org.junit.Assert.assertNotNull(realVector5);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertNotNull(arrayRealVector15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(realVector19);
        org.junit.Assert.assertNotNull(realVector21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(realVector29);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(realVector38);
        org.junit.Assert.assertNotNull(realVector40);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix25 = new org.apache.commons.math.linear.OpenMapRealMatrix(openMapRealMatrix7);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = openMapRealMatrix25.walkInRowOrder(realMatrixChangingVisitor26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix2.getRowMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = openMapRealMatrix2.walkInOptimizedOrder(realMatrixPreservingVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        openMapRealMatrix2.multiplyEntry(0, 0, (double) 1);
        double double9 = openMapRealMatrix2.getFrobeniusNorm();
        int[] intArray12 = new int[] { 10, (-1) };
        int[] intArray15 = new int[] { (short) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix2.getSubMatrix(intArray12, intArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix8 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray9 = openMapRealMatrix8.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix8.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrix5.subtract(realMatrix11);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrix12.transpose();
        int int14 = realMatrix13.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.ARRAY_SUMS_TO_ZERO));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        double double7 = openMapRealMatrix5.getFrobeniusNorm();
        org.apache.commons.math.linear.RealVector realVector9 = null;
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.setColumnVector(100, realVector9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (100)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrix4.add(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = openMapRealMatrix2.subtract(openMapRealMatrix6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply((double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrix5.scalarAdd(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix10 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix13 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = openMapRealMatrix10.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix13);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean16 = openMapRealMatrix13.equals((java.lang.Object) localizedFormats15);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = openMapRealMatrix13.createMatrix((int) (byte) 1, (int) ' ');
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix23 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = openMapRealMatrix23.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix28 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = openMapRealMatrix28.getRowMatrix(1);
        boolean boolean31 = openMapRealMatrix28.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = openMapRealMatrix23.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix28);
        double[][] doubleArray33 = openMapRealMatrix23.getData();
        double[] doubleArray35 = openMapRealMatrix23.getRow((int) (byte) 1);
        openMapRealMatrix13.setColumnMatrix((int) (byte) 0, (org.apache.commons.math.linear.RealMatrix) openMapRealMatrix23);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrix7.subtract((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix13);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix13.addToEntry((-1), (int) (byte) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats15.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix15 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray16 = openMapRealMatrix15.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = openMapRealMatrix15.scalarMultiply((double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrix18.scalarAdd(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix23 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix26 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = openMapRealMatrix23.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix26);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE;
        boolean boolean29 = openMapRealMatrix26.equals((java.lang.Object) localizedFormats28);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = openMapRealMatrix26.createMatrix((int) (byte) 1, (int) ' ');
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix36 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = openMapRealMatrix36.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix41 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = openMapRealMatrix41.getRowMatrix(1);
        boolean boolean44 = openMapRealMatrix41.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix45 = openMapRealMatrix36.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix41);
        double[][] doubleArray46 = openMapRealMatrix36.getData();
        double[] doubleArray48 = openMapRealMatrix36.getRow((int) (byte) 1);
        openMapRealMatrix26.setColumnMatrix((int) (byte) 0, (org.apache.commons.math.linear.RealMatrix) openMapRealMatrix36);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrix20.subtract((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix26);
        openMapRealMatrix2.setColumnMatrix(0, realMatrix50);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector53, false);
        boolean boolean56 = arrayRealVector53.isNaN();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector58.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector58);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector62 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector62.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector62);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector66.mapDivide(0.0d);
        arrayRealVector62.checkVectorDimensions(realVector68);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector70 = arrayRealVector58.ebeMultiply(realVector68);
        double[] doubleArray71 = arrayRealVector70.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector72 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector72.copy();
        double[] doubleArray74 = arrayRealVector72.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector75 = arrayRealVector70.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector72);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction76 = null;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector77 = arrayRealVector70.map(univariateRealFunction76);
        int int78 = arrayRealVector70.getMaxIndex();
        arrayRealVector53.setSubVector(0, (org.apache.commons.math.linear.RealVector) arrayRealVector70);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix2.setRowVector(52, (org.apache.commons.math.linear.RealVector) arrayRealVector70);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE + "'", localizedFormats28.equals(org.apache.commons.math.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_SEQUENCE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(realVector60);
        org.junit.Assert.assertNotNull(realVector64);
        org.junit.Assert.assertNotNull(realVector68);
        org.junit.Assert.assertNotNull(arrayRealVector70);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertNotNull(realVector73);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertNotNull(arrayRealVector75);
        org.junit.Assert.assertNotNull(arrayRealVector77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        int int7 = openMapRealMatrix5.getColumnDimension();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix11 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        boolean boolean17 = openMapRealMatrix14.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix18 = openMapRealMatrix11.subtract(openMapRealMatrix14);
        double[] doubleArray20 = openMapRealMatrix14.getRow((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix5.setColumn((-1), doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix8 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray9 = openMapRealMatrix8.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix8.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrix5.subtract(realMatrix11);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = realMatrix12.getTrace();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.NonSquareMatrixException; message: non square (10x1) matrix");
        } catch (org.apache.commons.math.linear.NonSquareMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        openMapRealMatrix2.multiplyEntry(0, 0, (double) 1);
        int[] intArray11 = new int[] { (short) 1, 100 };
        int[] intArray12 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix13 = openMapRealMatrix2.getSubMatrix(intArray11, intArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: empty selected column index array");
        } catch (org.apache.commons.math.exception.NoDataException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        int int5 = openMapRealMatrix2.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = openMapRealMatrix2.getEntry(52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix8 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray9 = openMapRealMatrix8.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix8.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrix5.subtract(realMatrix11);
        // The following exception was thrown during execution in test generation
        try {
            realMatrix5.addToEntry(52, (-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (52)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        double[] doubleArray13 = openMapRealMatrix2.getRow((int) (byte) 0);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix16 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = openMapRealMatrix16.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        int int21 = openMapRealMatrix19.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix22 = openMapRealMatrix2.multiply((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix5);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix9.getRowMatrix(1);
        int int12 = openMapRealMatrix9.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = openMapRealMatrix5.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix9);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix16 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = openMapRealMatrix16.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrix13.add(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math.exception.util.LocalizedFormats.DENOMINATOR;
        java.lang.Integer[] intArray1 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 10, (-1) };
        org.apache.commons.math.exception.MultiDimensionMismatchException multiDimensionMismatchException6 = new org.apache.commons.math.exception.MultiDimensionMismatchException((org.apache.commons.math.exception.util.Localizable) localizedFormats0, intArray1, intArray5);
        int int8 = multiDimensionMismatchException6.getExpectedDimension((int) (short) 0);
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext9 = new org.apache.commons.math.exception.util.ExceptionContext((java.lang.Throwable) multiDimensionMismatchException6);
        org.apache.commons.math.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math.exception.util.LocalizedFormats.CROSSING_BOUNDARY_LOOPS;
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100 };
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1 };
        org.apache.commons.math.exception.MultiDimensionMismatchException multiDimensionMismatchException15 = new org.apache.commons.math.exception.MultiDimensionMismatchException(intArray12, intArray14);
        java.lang.Object[] objArray16 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[]) intArray12);
        exceptionContext9.addMessage((org.apache.commons.math.exception.util.Localizable) localizedFormats10, (java.lang.Object[]) intArray12);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.DENOMINATOR + "'", localizedFormats0.equals(org.apache.commons.math.exception.util.LocalizedFormats.DENOMINATOR));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math.exception.util.LocalizedFormats.CROSSING_BOUNDARY_LOOPS + "'", localizedFormats10.equals(org.apache.commons.math.exception.util.LocalizedFormats.CROSSING_BOUNDARY_LOOPS));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.scalarMultiply((double) 10);
        double[][] doubleArray12 = openMapRealMatrix2.getData();
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        arrayRealVector0.checkVectorDimensions(realVector6);
        arrayRealVector0.set((double) 1L);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12, false);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector0.combine(0.0d, 0.0d, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapDivide(0.0d);
        org.apache.commons.math.linear.RealVector realVector20 = realVector18.mapMultiply((double) 10);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector12.projection(realVector18);
        double double22 = realVector18.getL1Norm();
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(realVector18);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray3 = openMapRealMatrix2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrixChangingVisitor realMatrixChangingVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = openMapRealMatrix2.walkInOptimizedOrder(realMatrixChangingVisitor6, (int) '#', (int) (byte) 100, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (35)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        int int12 = openMapRealMatrix2.getColumnDimension();
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        // The following exception was thrown during execution in test generation
        try {
            openMapRealMatrix7.multiplyEntry((int) (byte) 0, (int) ' ', (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: column index (32)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        openMapRealMatrix2.multiplyEntry(0, 0, (double) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix2.transpose();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector11 = openMapRealMatrix2.getRowVector((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (-1)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        openMapRealMatrix2.multiplyEntry(0, 0, (double) 1);
        double double9 = openMapRealMatrix2.getFrobeniusNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = openMapRealMatrix2.copy();
        org.apache.commons.math.linear.RealMatrixPreservingVisitor realMatrixPreservingVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = openMapRealMatrix2.walkInOptimizedOrder(realMatrixPreservingVisitor11, (int) 'a', 32, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: row index (97)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector2 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0, false);
        double double3 = arrayRealVector2.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapDivide(0.0d);
        arrayRealVector8.checkVectorDimensions(realVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = arrayRealVector4.ebeMultiply(realVector14);
        double[] doubleArray17 = arrayRealVector16.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector16);
        double double19 = arrayRealVector16.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector2, (org.apache.commons.math.linear.RealVector) arrayRealVector16);
        double[] doubleArray21 = arrayRealVector16.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = arrayRealVector16.ebeDivide(realVector23);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix27 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = openMapRealMatrix27.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix32 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = openMapRealMatrix32.getRowMatrix(1);
        boolean boolean35 = openMapRealMatrix32.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = openMapRealMatrix27.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix32);
        double[][] doubleArray37 = openMapRealMatrix27.getData();
        double[] doubleArray39 = openMapRealMatrix27.getRow((int) (byte) 1);
        arrayRealVector24.data = doubleArray39;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray39);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(arrayRealVector16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(realVector23);
        org.junit.Assert.assertNotNull(arrayRealVector24);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        arrayRealVector4.checkVectorDimensions(realVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector0.ebeMultiply(realVector10);
        double[] doubleArray13 = arrayRealVector12.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector18);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector22.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector22);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapDivide(0.0d);
        arrayRealVector22.checkVectorDimensions(realVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = arrayRealVector18.ebeMultiply(realVector28);
        double[] doubleArray31 = arrayRealVector30.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector30);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector14.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector32);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector14.mapAddToSelf(0.0d);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector12.append(realVector35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector39 = realVector35.getSubVector((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: index (10)");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(arrayRealVector12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector24);
        org.junit.Assert.assertNotNull(realVector28);
        org.junit.Assert.assertNotNull(arrayRealVector30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(realVector33);
        org.junit.Assert.assertNotNull(realVector35);
        org.junit.Assert.assertNotNull(realVector36);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix5 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = openMapRealMatrix5.getRowMatrix(1);
        boolean boolean8 = openMapRealMatrix5.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix9 = openMapRealMatrix2.subtract(openMapRealMatrix5);
        double[] doubleArray11 = openMapRealMatrix9.getColumn(0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapSubtract((double) 10L);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector15);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.map(univariateRealFunction19);
        int int21 = realVector20.getMaxIndex();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12, realVector20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector23 = openMapRealMatrix9.preMultiply(realVector20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(openMapRealMatrix9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realVector17);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix7 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = openMapRealMatrix7.getRowMatrix(1);
        boolean boolean10 = openMapRealMatrix7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = openMapRealMatrix2.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix7);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix14 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = openMapRealMatrix14.getRowMatrix(1);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix19 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = openMapRealMatrix19.getRowMatrix(1);
        boolean boolean22 = openMapRealMatrix19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = openMapRealMatrix14.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = openMapRealMatrix7.add((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix19);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealMatrix19.getRowVector(0);
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix29 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        double[][] doubleArray30 = openMapRealMatrix29.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = openMapRealMatrix29.scalarMultiply(0.0d);
        int int33 = openMapRealMatrix29.getRowDimension();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix34 = openMapRealMatrix19.add(openMapRealMatrix29);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realVector26);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(openMapRealMatrix34);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        boolean boolean5 = openMapRealMatrix2.isSquare();
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix8 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = openMapRealMatrix8.getRowMatrix(1);
        openMapRealMatrix8.multiplyEntry(0, 0, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix15 = openMapRealMatrix2.preMultiply((org.apache.commons.math.linear.RealMatrix) openMapRealMatrix8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 10");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.math.linear.OpenMapRealMatrix openMapRealMatrix2 = new org.apache.commons.math.linear.OpenMapRealMatrix((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = openMapRealMatrix2.getRowMatrix(1);
        openMapRealMatrix2.multiplyEntry(0, 0, (double) 1);
        double double9 = openMapRealMatrix2.getFrobeniusNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = openMapRealMatrix2.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = openMapRealMatrix2.scalarMultiply(0.0d);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector0.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapDivide(0.0d);
        arrayRealVector4.checkVectorDimensions(realVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector0.ebeMultiply(realVector10);
        double[] doubleArray13 = arrayRealVector12.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector12);
        double double15 = arrayRealVector12.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector12.mapDivide((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector18);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction22 = null;
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector21.map(univariateRealFunction22);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector24, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = arrayRealVector21.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector26);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector28.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector28);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction32 = null;
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector31.map(univariateRealFunction32);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector34, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = arrayRealVector31.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector36);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector21.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector37);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = arrayRealVector37.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector40, false);
        double double43 = arrayRealVector42.getL1Norm();
        double double44 = arrayRealVector39.getL1Distance((org.apache.commons.math.linear.RealVector) arrayRealVector42);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = arrayRealVector12.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector39);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction46 = null;
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector12.map(univariateRealFunction46);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector50.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector50);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector54.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector54);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector58.mapDivide(0.0d);
        arrayRealVector54.checkVectorDimensions(realVector60);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector62 = arrayRealVector50.ebeMultiply(realVector60);
        double[] doubleArray63 = arrayRealVector62.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector64.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector64);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector68 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector70 = arrayRealVector68.mapDivide(0.0d);
        arrayRealVector64.checkVectorDimensions(realVector70);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector72 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector74 = arrayRealVector72.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector75 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector72);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector76 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector78 = arrayRealVector76.mapDivide(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector79 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector76);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector80 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.RealVector realVector82 = arrayRealVector80.mapDivide(0.0d);
        arrayRealVector76.checkVectorDimensions(realVector82);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector84 = arrayRealVector72.ebeMultiply(realVector82);
        double[] doubleArray85 = arrayRealVector84.data;
        org.apache.commons.math.linear.RealVector realVector86 = arrayRealVector64.ebeDivide((org.apache.commons.math.linear.RealVector) arrayRealVector84);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector87 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray63, arrayRealVector64);
        org.apache.commons.math.linear.RealVector realVector89 = arrayRealVector87.mapAddToSelf(0.0d);
        org.apache.commons.math.linear.RealVector realVector91 = arrayRealVector87.append((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector92 = arrayRealVector12.combine(0.0d, (double) 0, realVector91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realVector2);
        org.junit.Assert.assertNotNull(realVector6);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(arrayRealVector12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(realVector17);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertNotNull(realVector23);
        org.junit.Assert.assertNotNull(arrayRealVector27);
        org.junit.Assert.assertNotNull(realVector30);
        org.junit.Assert.assertNotNull(realVector33);
        org.junit.Assert.assertNotNull(arrayRealVector37);
        org.junit.Assert.assertNotNull(realVector38);
        org.junit.Assert.assertNotNull(arrayRealVector39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(arrayRealVector45);
        org.junit.Assert.assertNotNull(realVector47);
        org.junit.Assert.assertNotNull(realVector52);
        org.junit.Assert.assertNotNull(realVector56);
        org.junit.Assert.assertNotNull(realVector60);
        org.junit.Assert.assertNotNull(arrayRealVector62);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertNotNull(realVector66);
        org.junit.Assert.assertNotNull(realVector70);
        org.junit.Assert.assertNotNull(realVector74);
        org.junit.Assert.assertNotNull(realVector78);
        org.junit.Assert.assertNotNull(realVector82);
        org.junit.Assert.assertNotNull(arrayRealVector84);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertNotNull(realVector86);
        org.junit.Assert.assertNotNull(realVector89);
        org.junit.Assert.assertNotNull(realVector91);
    }
}


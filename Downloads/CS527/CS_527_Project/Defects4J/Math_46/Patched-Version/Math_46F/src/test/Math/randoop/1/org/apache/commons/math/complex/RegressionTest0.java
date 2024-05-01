package org.apache.commons.math.complex;

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
        double double0 = org.apache.commons.math.util.FastMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int[] intArray3 = new int[] { 10, (byte) 0, 1 };
        int[] intArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 1]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (short) -1, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex4 = complex0.add(complex3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int[] intArray6 = new int[] { 10, (short) 0, (byte) 1, '4', (short) 10, (byte) 100 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            double double10 = org.apache.commons.math.util.MathUtils.distance(intArray6, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 1, 52, 10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 0]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray21 = new double[] { 0, (short) -1 };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MathUtils.checkOrder(doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException; message: points 0 and 1 are not strictly increasing (0 >= -1)");
        } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (byte) 10, (double) 1520286529);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000000000002d + "'", double2 == 10.000000000000002d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 10, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray9 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection10 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray9, orderDirection10, true);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray9);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.math.util.MathUtils.linearCombination(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1520286529 + "'", int14 == 1520286529);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(0.0f, (float) ' ', (float) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math.exception.NullArgumentException nullArgumentException0 = new org.apache.commons.math.exception.NullArgumentException();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(0.0d);
        java.lang.Class<?> wildcardClass13 = complex12.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int[] intArray4 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray6 = org.apache.commons.math.util.MathUtils.copyOf(intArray4, (int) (short) 10);
        int[] intArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) (short) 100, (java.lang.Number) 0.16644599640410362d, true);
        boolean boolean4 = numberIsTooLargeException3.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(0.0d);
        double double13 = complex12.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        double double2 = org.apache.commons.math.util.FastMath.copySign((double) (short) -1, (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        double double8 = org.apache.commons.math.util.MathUtils.linearCombination((double) (byte) 0, (double) 100, (double) '#', 0.0d, 1.0d, (double) (byte) 0, (double) (byte) 0, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.DimensionMismatchException dimensionMismatchException3 = new org.apache.commons.math.exception.DimensionMismatchException(localizable0, (-127), 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.math.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.0f);
        java.lang.Number number2 = notPositiveException1.getMin();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 0 + "'", number2, 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5553480614894135d + "'", double2 == 3.5553480614894135d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        float float1 = org.apache.commons.math.util.FastMath.ulp((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException0 = new org.apache.commons.math.exception.MathArithmeticException();
        java.lang.Throwable[] throwableArray1 = mathArithmeticException0.getSuppressed();
        java.lang.Throwable throwable2 = mathArithmeticException0.getException();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwable2);
        org.junit.Assert.assertEquals(throwable2.getLocalizedMessage(), "arithmetic exception");
        org.junit.Assert.assertEquals(throwable2.getMessage(), "arithmetic exception");
        org.junit.Assert.assertEquals(throwable2.toString(), "org.apache.commons.math.exception.MathArithmeticException: arithmetic exception");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex8);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object[] objArray13 = new java.lang.Object[] { complex3, complex6, obj12 };
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException14 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number) 100L, objArray13);
        org.apache.commons.math.exception.NullArgumentException nullArgumentException15 = new org.apache.commons.math.exception.NullArgumentException(localizable0, objArray13);
        java.lang.Class<?> wildcardClass16 = objArray13.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        double double1 = org.apache.commons.math.util.FastMath.tanh(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = null;
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 2.718281828459045d, (java.lang.Number) 0L, 1, orderDirection3, false);
        java.lang.Throwable throwable6 = nonMonotonousSequenceException5.getException();
        java.lang.Number number7 = nonMonotonousSequenceException5.getArgument();
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.toString(), "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 2.718281828459045d + "'", number7, 2.718281828459045d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.math.exception.DimensionMismatchException dimensionMismatchException2 = new org.apache.commons.math.exception.DimensionMismatchException(100, (int) (short) 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex10.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64512240L + "'", long2 == 64512240L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(10, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.math.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.0f);
        boolean boolean2 = notPositiveException1.getBoundIsAllowed();
        java.lang.Number number3 = notPositiveException1.getMin();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext4 = notPositiveException1.getContext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertNotNull(exceptionContext4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex13 = complex11.divide((double) (-1.0f));
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) 100.0f);
        double[] doubleArray27 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray29 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray29, orderDirection30, true);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray29);
        double[] doubleArray35 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection36 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray35, orderDirection36, true);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray29, doubleArray35);
        double[] doubleArray40 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            double double41 = org.apache.commons.math.util.MathUtils.linearCombination(doubleArray14, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.0d, 10.000000000000002d);
        org.apache.commons.math.complex.Complex complex3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex4 = complex2.subtract(complex3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        float float2 = org.apache.commons.math.util.MathUtils.round(0.0f, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        boolean boolean5 = complex4.isNaN();
        boolean boolean6 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex8.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 1.52028672E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6799280044513404d) + "'", double1 == (-0.6799280044513404d));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        java.lang.Number number2 = null;
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException4 = new org.apache.commons.math.exception.NumberIsTooLargeException(localizable0, (java.lang.Number) 0.16644599640410362d, number2, true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        double double2 = org.apache.commons.math.util.MathUtils.round(1.9155040003582885E22d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9155040003582885E22d + "'", double2 == 1.9155040003582885E22d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int int1 = org.apache.commons.math.util.FastMath.getExponent((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1410065408, (double) (-0.99999994f));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        float float1 = org.apache.commons.math.util.FastMath.ulp(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math.complex.Complex complex5 = complex2.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        double double2 = org.apache.commons.math.util.FastMath.copySign((double) (-128L), (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 128.0d + "'", double2 == 128.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((float) 0, 0.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (byte) 0, 6.4512240699265294E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        float[] floatArray1 = new float[] { (byte) -1 };
        float[] floatArray7 = new float[] { 100, (short) 100, (short) -1, (byte) 10, 1.0f };
        boolean boolean8 = org.apache.commons.math.util.MathUtils.equals(floatArray1, floatArray7);
        float[] floatArray10 = new float[] { (byte) -1 };
        float[] floatArray16 = new float[] { 100, (short) 100, (short) -1, (byte) 10, 1.0f };
        boolean boolean17 = org.apache.commons.math.util.MathUtils.equals(floatArray10, floatArray16);
        float[] floatArray18 = null;
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(floatArray10, floatArray18);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(floatArray7, floatArray18);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[100.0, 100.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[100.0, 100.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 0, 1079574559);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 1,079,574,559, n = 0");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) (-0.017453292519943295d), (java.lang.Number) 7.6293945E-6f, true);
        java.lang.Number number5 = numberIsTooSmallException4.getMin();
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 7.6293945E-6f + "'", number5, 7.6293945E-6f);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int int1 = org.apache.commons.math.util.FastMath.getExponent((float) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1079574528, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079574529L + "'", long2 == 1079574529L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.DimensionMismatchException dimensionMismatchException3 = new org.apache.commons.math.exception.DimensionMismatchException(localizable0, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math.exception.DimensionMismatchException dimensionMismatchException2 = new org.apache.commons.math.exception.DimensionMismatchException(0, 6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: must have n >= 0 for n!, got n = -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int[] intArray4 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray6 = org.apache.commons.math.util.MathUtils.copyOf(intArray4, (int) (short) 10);
        int[] intArray7 = org.apache.commons.math.util.MathUtils.copyOf(intArray4);
        int[] intArray12 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray14 = org.apache.commons.math.util.MathUtils.copyOf(intArray12, (int) (short) 10);
        int int15 = org.apache.commons.math.util.MathUtils.distance1(intArray4, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = org.apache.commons.math.util.MathUtils.copyOf(intArray12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        double double0 = org.apache.commons.math.util.MathUtils.TWO_PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 6.283185307179586d + "'", double0 == 6.283185307179586d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex9.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex9);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object[] objArray14 = new java.lang.Object[] { complex4, complex7, obj13 };
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException15 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number) 100L, objArray14);
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException16 = new org.apache.commons.math.exception.NotFiniteNumberException(localizable0, (java.lang.Number) 2.2924316695611777d, objArray14);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (byte) 100, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        boolean boolean2 = complex1.isNaN();
        boolean boolean3 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract((double) (byte) 0);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.DimensionMismatchException dimensionMismatchException3 = new org.apache.commons.math.exception.DimensionMismatchException(localizable0, (int) (short) 1, 1);
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext4 = dimensionMismatchException3.getContext();
        org.junit.Assert.assertNotNull(exceptionContext4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        float[] floatArray5 = new float[] { 0.0f, 3628800L, (byte) 10, (byte) 10, 1.52028672E9f };
        float[] floatArray7 = new float[] { (byte) -1 };
        float[] floatArray13 = new float[] { 100, (short) 100, (short) -1, (byte) 10, 1.0f };
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(floatArray7, floatArray13);
        boolean boolean15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(floatArray5, floatArray7);
        float[] floatArray21 = new float[] { 0.0f, 3628800L, (byte) 10, (byte) 10, 1.52028672E9f };
        float[] floatArray23 = new float[] { (byte) -1 };
        float[] floatArray29 = new float[] { 100, (short) 100, (short) -1, (byte) 10, 1.0f };
        boolean boolean30 = org.apache.commons.math.util.MathUtils.equals(floatArray23, floatArray29);
        boolean boolean31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(floatArray21, floatArray23);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(floatArray7, floatArray21);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 3628800.0, 10.0, 10.0, 1.52028672E9]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[100.0, 100.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 3628800.0, 10.0, 10.0, 1.52028672E9]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[100.0, 100.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex4.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex4.multiply(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex13 = complex11.add(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex13.add(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        org.apache.commons.math.complex.Complex complex17 = complex0.multiply(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = complex16.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1079574528, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079574528L + "'", long2 == 1079574528L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, (double) 'a', (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        float float2 = org.apache.commons.math.util.FastMath.copySign((float) '#', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((float) 0, (float) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        int[] intArray4 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray6 = org.apache.commons.math.util.MathUtils.copyOf(intArray4, (int) (short) 10);
        int[] intArray7 = org.apache.commons.math.util.MathUtils.copyOf(intArray4);
        int[] intArray12 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray14 = org.apache.commons.math.util.MathUtils.copyOf(intArray12, (int) (short) 10);
        int int15 = org.apache.commons.math.util.MathUtils.distance1(intArray4, intArray12);
        int[] intArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray4, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((float) 'a', (float) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) (short) 100, (java.lang.Number) 0.16644599640410362d, true);
        java.lang.Number number4 = numberIsTooLargeException3.getMax();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext5 = numberIsTooLargeException3.getContext();
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.16644599640410362d + "'", number4, 0.16644599640410362d);
        org.junit.Assert.assertNotNull(exceptionContext5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray6);
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        double[] doubleArray21 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray23 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection24 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray23, orderDirection24, true);
        boolean boolean27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray21, doubleArray23);
        double[] doubleArray29 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray29, orderDirection30, true);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray23, doubleArray29);
        double[] doubleArray35 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray29, (double) 100.0f);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray35);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray35, (double) 6);
        double[] doubleArray39 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray38);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray38, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 145.14131045295133d + "'", double14 == 145.14131045295133d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[6.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[6.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 120L + "'", long1 == 120L);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        java.lang.Number number2 = null;
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException4 = new org.apache.commons.math.exception.NumberIsTooLargeException(localizable0, (java.lang.Number) (short) 1, number2, true);
        java.lang.Number number5 = numberIsTooLargeException4.getArgument();
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (short) 1 + "'", number5, (short) 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex14 = complex12.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.626860407847019d + "'", double13 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int int2 = org.apache.commons.math.util.FastMath.max(6, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        double double2 = org.apache.commons.math.util.FastMath.IEEEremainder((double) 10.0f, (double) 322561200L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        double double8 = complex7.abs();
        java.lang.Class<?> wildcardClass9 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.01760739694877812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01760557762348035d) + "'", double1 == (-0.01760557762348035d));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 0);
        boolean boolean2 = notPositiveException1.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((float) 1L, 4.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        double double4 = org.apache.commons.math.util.MathUtils.linearCombination(0.0d, 4.9E-324d, 0.0d, (double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        java.lang.String str10 = complex9.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(Infinity, Infinity)" + "'", str10, "(Infinity, Infinity)");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 97.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 100, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3921225.0d + "'", double2 == 3921225.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(52.0f, (float) 4, 1079574559);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((float) 5, (float) (byte) 10, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-127), (-52.0d), 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        float float1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean3 = complex1.equals((java.lang.Object) '#');
        double double4 = complex1.getArgument();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex7 = complex0.sin();
        java.lang.Class<?> wildcardClass8 = complex0.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        double double2 = org.apache.commons.math.util.FastMath.IEEEremainder(22025.465794806718d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex9 = complex7.multiply((-52.0d));
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex8 = complex3.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean11 = complex9.equals((java.lang.Object) '#');
        double double12 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex9.createComplex((double) 52.0f, 145.14131045295133d);
        org.apache.commons.math.complex.Complex complex16 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex8.divide(complex9);
        double double18 = complex17.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 6.451224E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex4.cos();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) 4.15912713462618d, (java.lang.Number) Double.POSITIVE_INFINITY, false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 1520286529);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1520286529 + "'", int2 == 1520286529);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math.exception.NotPositiveException(localizable0, (java.lang.Number) 10000000000L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 0L, 22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = complex6.subtract(3.626860407847019d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex6.divide(complex10);
        org.apache.commons.math.complex.Complex complex14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex15 = complex13.pow(complex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 1520286529);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1520286529 + "'", int2 == 1520286529);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        double double8 = complex7.abs();
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt1z();
        java.lang.Class<?> wildcardClass10 = complex9.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.806217383937352E-6d + "'", double1 == 4.806217383937352E-6d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math.complex.Complex complex6 = complex2.subtract(3.5553480614894135d);
        org.apache.commons.math.complex.Complex complex7 = complex2.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException1 = new org.apache.commons.math.exception.MathArithmeticException();
        java.lang.Throwable[] throwableArray2 = mathArithmeticException1.getSuppressed();
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException3 = new org.apache.commons.math.exception.MathArithmeticException(localizable0, (java.lang.Object[]) throwableArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mathArithmeticException3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1528444521, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1528444521L + "'", long2 == 1528444521L);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        double double2 = org.apache.commons.math.util.FastMath.IEEEremainder((double) '#', (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) 100, (java.lang.Number) 1528444521L, false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        double double2 = org.apache.commons.math.util.FastMath.scalb((double) 10000000000L, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0E10d + "'", double2 == 2.0E10d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex3.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex5);
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex1.nthRoot((int) '4');
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray21 = new double[] { 0, (short) -1 };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray21);
        double[] doubleArray29 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray31 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection32 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray31, orderDirection32, true);
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray29, doubleArray31);
        double[] doubleArray36 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray29);
        double double37 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray36);
        double[] doubleArray44 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray46 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection47 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray46, orderDirection47, true);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray44, doubleArray46);
        double[] doubleArray52 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection53 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray52, orderDirection53, true);
        boolean boolean56 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray46, doubleArray52);
        double[] doubleArray58 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray52, (double) 100.0f);
        boolean boolean59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray36, doubleArray58);
        double[] doubleArray61 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray58, (double) 6);
        double[] doubleArray62 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray61);
        // The following exception was thrown during execution in test generation
        try {
            double double63 = org.apache.commons.math.util.MathUtils.linearCombination(doubleArray8, doubleArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 145.14131045295133d + "'", double37 == 145.14131045295133d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[6.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[6.0]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(11013.232920103324d);
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean4 = complex2.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex2.subtract(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex14.divide(complex16);
        org.apache.commons.math.complex.Complex complex21 = complex16.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean24 = complex22.equals((java.lang.Object) '#');
        double double25 = complex22.getArgument();
        org.apache.commons.math.complex.Complex complex28 = complex22.createComplex((double) 52.0f, 145.14131045295133d);
        org.apache.commons.math.complex.Complex complex29 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex21.divide(complex22);
        org.apache.commons.math.complex.Complex complex31 = complex12.add(complex21);
        org.apache.commons.math.complex.Complex complex32 = complex1.divide(complex21);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex4 = complex2.pow((-52.0d));
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) 100.0f);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20);
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException25 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 0L, (java.lang.Number) (-0.99999994f), (int) (byte) 1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection26 = nonMonotonousSequenceException25.getDirection();
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection27 = nonMonotonousSequenceException25.getDirection();
        boolean boolean30 = org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection27, false, false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0]");
        org.junit.Assert.assertTrue("'" + orderDirection26 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection26.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection27 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection27.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex8 = complex3.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean11 = complex9.equals((java.lang.Object) '#');
        double double12 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex15 = complex9.createComplex((double) 52.0f, 145.14131045295133d);
        org.apache.commons.math.complex.Complex complex16 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex8.divide(complex9);
        org.apache.commons.math.complex.Complex complex19 = complex17.add(15.104412573075516d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray6);
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        double[] doubleArray21 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray23 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection24 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray23, orderDirection24, true);
        boolean boolean27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray21, doubleArray23);
        double[] doubleArray29 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray29, orderDirection30, true);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray23, doubleArray29);
        double[] doubleArray35 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray29, (double) 100.0f);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray35);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray35, (double) 6);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 145.14131045295133d + "'", double14 == 145.14131045295133d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[6.0]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex8 = complex3.pow(0.0d);
        java.lang.Object obj9 = complex8.readResolve();
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        org.apache.commons.math.exception.util.Localizable localizable12 = null;
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException13 = new org.apache.commons.math.exception.MathArithmeticException();
        java.lang.Throwable[] throwableArray14 = mathArithmeticException13.getSuppressed();
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException15 = new org.apache.commons.math.exception.MathArithmeticException(localizable12, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException16 = new org.apache.commons.math.exception.MathArithmeticException(localizable11, (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.util.MathUtils.checkNotNull(obj9, localizable10, (java.lang.Object[]) throwableArray14);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "(1.0, 0.0)");
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        double[] doubleArray1 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection2 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection2, true);
        org.apache.commons.math.util.MathUtils.checkFinite(doubleArray1);
        double[] doubleArray12 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray12, doubleArray14);
        double[] doubleArray20 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection21 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection21, true);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray20);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        float float2 = org.apache.commons.math.util.FastMath.nextAfter((-3.22561216E8f), (double) 6382736168262828673L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.22561184E8f) + "'", float2 == (-3.22561184E8f));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.createComplex((double) 7.6293945E-6f, (double) (-127));
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean8 = complex6.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex9.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex12);
        org.apache.commons.math.complex.Complex complex16 = complex6.subtract(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex17.pow(complex18);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex20.pow(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex20);
        org.apache.commons.math.complex.Complex complex25 = complex20.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean28 = complex26.equals((java.lang.Object) '#');
        double double29 = complex26.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex26.createComplex((double) 52.0f, 145.14131045295133d);
        org.apache.commons.math.complex.Complex complex33 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex25.divide(complex26);
        org.apache.commons.math.complex.Complex complex35 = complex16.add(complex25);
        org.apache.commons.math.complex.Complex complex36 = complex5.divide(complex35);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, (-32));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = complex0.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 10000000000L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.7189981105004d + "'", double1 == 23.7189981105004d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        long long2 = org.apache.commons.math.util.MathUtils.gcd(10L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Number number1 = null;
        org.apache.commons.math.exception.NumberIsTooSmallException numberIsTooSmallException3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number) 10.0d, number1, false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592653589793d + "'", double1 == 3.141592653589793d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray21 = new double[] { 0, (short) -1 };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray21);
        double[] doubleArray24 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray21, (double) 4.0f);
        int int25 = org.apache.commons.math.util.MathUtils.hash(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-0.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1072692287) + "'", int25 == (-1072692287));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) (-1072692287), 4.666310772197643E157d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 0L, (java.lang.Number) (-0.99999994f), (int) (byte) 1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection4 = nonMonotonousSequenceException3.getDirection();
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection5 = nonMonotonousSequenceException3.getDirection();
        java.lang.Number number6 = nonMonotonousSequenceException3.getPrevious();
        org.junit.Assert.assertTrue("'" + orderDirection4 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection4.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection5 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection5.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-0.99999994f) + "'", number6, (-0.99999994f));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(1.5667262027409901E-19d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object) 3.141592653589793d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex10.asin();
        java.lang.String str13 = complex12.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1.5707963267948966, -1.6574544541530771)" + "'", str13, "(1.5707963267948966, -1.6574544541530771)");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        float float1 = org.apache.commons.math.util.FastMath.signum((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) ' ');
        org.apache.commons.math.complex.Complex complex2 = complex1.tan();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex6.getField();
        java.lang.Object obj8 = complex6.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "(1.0, 0.0)");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.Number number0 = null;
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException1 = new org.apache.commons.math.exception.MathArithmeticException();
        java.lang.Throwable[] throwableArray2 = mathArithmeticException1.getSuppressed();
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException3 = new org.apache.commons.math.exception.NotFiniteNumberException(number0, (java.lang.Object[]) throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        double double2 = org.apache.commons.math.util.FastMath.copySign((double) 4, 0.16644599640410362d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.exp();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) 3628800.0f);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        double double12 = complex11.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException2 = new org.apache.commons.math.exception.MathArithmeticException(localizable0, objArray1);
        java.lang.Throwable throwable3 = mathArithmeticException2.getException();
        org.junit.Assert.assertNotNull(throwable3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.negate();
        org.apache.commons.math.complex.Complex complex13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex14 = complex12.subtract(complex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 0L, (java.lang.Number) (-0.99999994f), (int) (byte) 1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection4 = nonMonotonousSequenceException3.getDirection();
        java.lang.Number number5 = nonMonotonousSequenceException3.getPrevious();
        boolean boolean6 = nonMonotonousSequenceException3.getStrict();
        org.junit.Assert.assertTrue("'" + orderDirection4 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection4.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (-0.99999994f) + "'", number5, (-0.99999994f));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) 100.0f);
        org.apache.commons.math.util.MathUtils.checkFinite(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000291038d + "'", double1 == 1.0000000000291038d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math.exception.NumberIsTooSmallException(localizable0, (java.lang.Number) (-0.017453292519943295d), (java.lang.Number) 7.6293945E-6f, true);
        boolean boolean5 = numberIsTooSmallException4.getBoundIsAllowed();
        java.lang.Number number6 = numberIsTooSmallException4.getMin();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 7.6293945E-6f + "'", number6, 7.6293945E-6f);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex7.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        double double2 = org.apache.commons.math.util.FastMath.copySign((double) 1520286529, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.520286529E9d + "'", double2 == 1.520286529E9d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 1079574528);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1079574528 + "'", int2 == 1079574528);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = complex3.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 229.1831180523293d + "'", double1 == 229.1831180523293d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray25 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray27 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection28 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray27, orderDirection28, true);
        boolean boolean31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray25, doubleArray27);
        double[] doubleArray33 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection34 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray33, orderDirection34, true);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray33);
        double[] doubleArray39 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray33, (double) 100.0f);
        double double40 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray8, doubleArray33);
        double[] doubleArray47 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray49 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection50 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray49, orderDirection50, true);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray47, doubleArray49);
        double[] doubleArray55 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection56 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray55, orderDirection56, true);
        boolean boolean59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray49, doubleArray55);
        double[] doubleArray61 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray55, 0.0d);
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException65 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 0L, (java.lang.Number) (-0.99999994f), (int) (byte) 1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection66 = nonMonotonousSequenceException65.getDirection();
        org.apache.commons.math.exception.util.Localizable localizable67 = null;
        double[] doubleArray74 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray76 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection77 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray76, orderDirection77, true);
        boolean boolean80 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray74, doubleArray76);
        double[][] doubleArray81 = new double[][] {};
        org.apache.commons.math.util.MathUtils.sortInPlace(doubleArray74, doubleArray81);
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException83 = new org.apache.commons.math.exception.MathArithmeticException(localizable67, (java.lang.Object[]) doubleArray81);
        org.apache.commons.math.util.MathUtils.sortInPlace(doubleArray61, orderDirection66, doubleArray81);
        boolean boolean87 = org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection66, false, false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0]");
        org.junit.Assert.assertTrue("'" + orderDirection66 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection66.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, 10.0, 32.0, 32.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(0.0d);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean15 = complex13.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex17.divide(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex13.subtract(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex12.divide(complex23);
        double double25 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex26 = complex23.atan();
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex27.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) 1528444521, (java.lang.Number) 13, true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        double double2 = org.apache.commons.math.util.FastMath.copySign((double) (byte) 10, 128.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex3.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex5);
        boolean boolean11 = complex5.equals((java.lang.Object) 156.3608363030788d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1520286639, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.math.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) (-6.0f));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        boolean boolean5 = complex4.isNaN();
        boolean boolean6 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean10 = complex8.equals((java.lang.Object) '#');
        double double11 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex14 = complex8.createComplex((double) 52.0f, 145.14131045295133d);
        org.apache.commons.math.complex.Complex complex15 = complex14.log();
        org.apache.commons.math.complex.Complex complex16 = complex7.subtract(complex14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.math.exception.NumberIsTooSmallException numberIsTooSmallException3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number) 7.051207161862808d, (java.lang.Number) 24.0d, false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, 6382736168262829056L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6382736168262829056L) + "'", long2 == (-6382736168262829056L));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex9.negate();
        org.apache.commons.math.complex.Complex complex14 = complex9.divide(1.1752011936438014d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.Number number0 = null;
        org.apache.commons.math.exception.NumberIsTooSmallException numberIsTooSmallException3 = new org.apache.commons.math.exception.NumberIsTooSmallException(number0, (java.lang.Number) 128.0f, true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 6382736168262828673L, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        double double2 = org.apache.commons.math.util.FastMath.hypot(0.0d, (double) 1520286639);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.520286639E9d + "'", double2 == 1.520286639E9d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = complex6.subtract(3.626860407847019d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean12 = complex10.equals((java.lang.Object) '#');
        double double13 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean16 = complex14.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex17.pow(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex14.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex23 = complex21.add(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex23.add(0.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.negate();
        org.apache.commons.math.complex.Complex complex27 = complex10.multiply(complex26);
        org.apache.commons.math.complex.ComplexField complexField28 = complex26.getField();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex29.pow(complex30);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex32.pow(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex30.divide(complex32);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean38 = complex36.equals((java.lang.Object) '#');
        double double39 = complex36.getArgument();
        org.apache.commons.math.complex.Complex complex40 = complex30.add(complex36);
        org.apache.commons.math.complex.Complex complex41 = complex40.sinh();
        double double42 = complex41.getReal();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex44 = complex41.divide(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex26.multiply(complex44);
        boolean boolean46 = complex9.equals((java.lang.Object) complex45);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexField28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 3.626860407847019d + "'", double42 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(28, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray21 = new double[] { 0, (short) -1 };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray21);
        double[] doubleArray24 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray8, (double) 322561200L);
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[3.225612E8]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.225612E8d + "'", double25 == 3.225612E8d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(0.0d);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean15 = complex13.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex17.divide(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex13.subtract(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex12.divide(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex12.tanh();
        double double26 = complex25.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-52.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9155040003582885E22d) + "'", double1 == (-1.9155040003582885E22d));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean7 = complex5.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex5.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex12.exp();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex15);
        org.apache.commons.math.complex.Complex complex19 = complex2.createComplex(0.8813735870195429d, (double) 1L);
        org.apache.commons.math.complex.Complex complex21 = complex19.multiply((double) (-32));
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        int[] intArray1 = new int[] { 1520286529 };
        int[] intArray6 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray8 = org.apache.commons.math.util.MathUtils.copyOf(intArray6, (int) (short) 10);
        int[] intArray9 = org.apache.commons.math.util.MathUtils.copyOf(intArray6);
        int[] intArray14 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray16 = org.apache.commons.math.util.MathUtils.copyOf(intArray14, (int) (short) 10);
        int int17 = org.apache.commons.math.util.MathUtils.distance1(intArray6, intArray14);
        int int18 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray14);
        int[] intArray23 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray25 = org.apache.commons.math.util.MathUtils.copyOf(intArray23, (int) (short) 10);
        int[] intArray26 = org.apache.commons.math.util.MathUtils.copyOf(intArray23);
        int[] intArray31 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray33 = org.apache.commons.math.util.MathUtils.copyOf(intArray31, (int) (short) 10);
        int int34 = org.apache.commons.math.util.MathUtils.distance1(intArray23, intArray31);
        int[] intArray36 = new int[] { 1520286529 };
        int[] intArray41 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray43 = org.apache.commons.math.util.MathUtils.copyOf(intArray41, (int) (short) 10);
        int[] intArray44 = org.apache.commons.math.util.MathUtils.copyOf(intArray41);
        int[] intArray49 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray51 = org.apache.commons.math.util.MathUtils.copyOf(intArray49, (int) (short) 10);
        int int52 = org.apache.commons.math.util.MathUtils.distance1(intArray41, intArray49);
        int int53 = org.apache.commons.math.util.MathUtils.distanceInf(intArray36, intArray49);
        int int54 = org.apache.commons.math.util.MathUtils.distanceInf(intArray23, intArray49);
        int int55 = org.apache.commons.math.util.MathUtils.distance1(intArray1, intArray23);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1520286529]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1520286529]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1410065408, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = null;
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 2.718281828459045d, (java.lang.Number) 0L, 1, orderDirection3, false);
        java.lang.Throwable throwable6 = nonMonotonousSequenceException5.getException();
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection7 = nonMonotonousSequenceException5.getDirection();
        java.lang.Throwable[] throwableArray8 = nonMonotonousSequenceException5.getSuppressed();
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = nonMonotonousSequenceException5.getDirection();
        boolean boolean10 = nonMonotonousSequenceException5.getStrict();
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.toString(), "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertNull(orderDirection7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNull(orderDirection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) 1.5707963267948966d, (java.lang.Number) (short) 1, false);
        java.lang.Number number4 = numberIsTooLargeException3.getMax();
        boolean boolean5 = numberIsTooLargeException3.getBoundIsAllowed();
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (short) 1 + "'", number4, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math.complex.Complex complex5 = complex2.log();
        java.lang.String str6 = complex5.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0.0, 0.0)" + "'", str6, "(0.0, 0.0)");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.math.util.MathUtils.checkFinite((double) (-1.0f));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        float float1 = org.apache.commons.math.util.FastMath.signum((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex8);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object[] objArray13 = new java.lang.Object[] { complex3, complex6, obj12 };
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException14 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number) 100L, objArray13);
        org.apache.commons.math.exception.NullArgumentException nullArgumentException15 = new org.apache.commons.math.exception.NullArgumentException(localizable0, objArray13);
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext16 = nullArgumentException15.getContext();
        java.lang.Throwable throwable17 = nullArgumentException15.getException();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(exceptionContext16);
        org.junit.Assert.assertNotNull(throwable17);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((float) (byte) 100, (float) 5L, 127.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex15 = complex12.divide(complex14);
        double double16 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex18 = complex14.add(complex17);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.626860407847019d + "'", double13 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.5707963267948966d + "'", double16 == 1.5707963267948966d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        int[] intArray0 = null;
        int[] intArray5 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray7 = org.apache.commons.math.util.MathUtils.copyOf(intArray5, (int) (short) 10);
        int[] intArray8 = org.apache.commons.math.util.MathUtils.copyOf(intArray5);
        int[] intArray13 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray15 = org.apache.commons.math.util.MathUtils.copyOf(intArray13, (int) (short) 10);
        int int16 = org.apache.commons.math.util.MathUtils.distance1(intArray5, intArray13);
        int[] intArray18 = new int[] { 1520286529 };
        int[] intArray23 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray25 = org.apache.commons.math.util.MathUtils.copyOf(intArray23, (int) (short) 10);
        int[] intArray26 = org.apache.commons.math.util.MathUtils.copyOf(intArray23);
        int[] intArray31 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray33 = org.apache.commons.math.util.MathUtils.copyOf(intArray31, (int) (short) 10);
        int int34 = org.apache.commons.math.util.MathUtils.distance1(intArray23, intArray31);
        int int35 = org.apache.commons.math.util.MathUtils.distanceInf(intArray18, intArray31);
        int int36 = org.apache.commons.math.util.MathUtils.distanceInf(intArray5, intArray31);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1520286529]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex(6.3230649767291355E9d, 4.9E-324d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = null;
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 2.718281828459045d, (java.lang.Number) 0L, 1, orderDirection3, false);
        boolean boolean6 = nonMonotonousSequenceException5.getStrict();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: must have n >= 0 for n!, got n = -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex7.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        double double2 = org.apache.commons.math.util.FastMath.scalb(0.0d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray6);
        double[] doubleArray15 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray13, 128.0d);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray13, 3.626860407847019d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[14.733812949640289, 4.60431654676259, 44.66187050359712, 4.60431654676259, 44.66187050359712, 14.733812949640289]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.4174803347162036, 0.13046260459881365, 1.2654872646084923, 0.13046260459881365, 1.2654872646084923, 0.4174803347162036]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.01760739694877812d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01760739694877812d) + "'", double2 == (-0.01760739694877812d));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex3.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex5);
        double double10 = complex5.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        int int1 = org.apache.commons.math.util.FastMath.getExponent(1.520286639E9d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex4.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex4.multiply(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex13 = complex11.add(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex13.add(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        org.apache.commons.math.complex.Complex complex17 = complex0.multiply(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = complexField18.getOne();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(Double.POSITIVE_INFINITY, (double) 100.00001f, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 9.536743E-7f);
        org.apache.commons.math.complex.Complex complex2 = complex1.asin();
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math.exception.NotPositiveException(localizable0, (java.lang.Number) 127.0f);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(322561200L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        double double14 = complex12.abs();
        double double15 = complex12.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.626860407847019d + "'", double13 == 3.626860407847019d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.626860407847019d + "'", double14 == 3.626860407847019d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.626860407847019d + "'", double15 == 3.626860407847019d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) 52.0f, 145.14131045295133d);
        double double7 = complex6.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 145.14131045295133d + "'", double7 == 145.14131045295133d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((-0.6799280044513404d));
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(11013.232920103324d);
        double double2 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex1.sin();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex11.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex8 = complex3.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex3.tanh();
        org.apache.commons.math.complex.ComplexField complexField10 = complex3.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexField10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        double[] doubleArray7 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray9 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection10 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray9, orderDirection10, true);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray9);
        double[] doubleArray15 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection16 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray15, orderDirection16, true);
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray9, doubleArray15);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection20 = null;
        double[] doubleArray27 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray29 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray29, orderDirection30, true);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray29);
        double[][] doubleArray34 = new double[][] {};
        org.apache.commons.math.util.MathUtils.sortInPlace(doubleArray27, doubleArray34);
        org.apache.commons.math.util.MathUtils.sortInPlace(doubleArray15, orderDirection20, doubleArray34);
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException37 = new org.apache.commons.math.exception.MathArithmeticException(localizable0, (java.lang.Object[]) doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 10.0, 32.0, 32.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        double double2 = org.apache.commons.math.util.FastMath.min(9.848857801796104d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.848857801796104d + "'", double2 == 9.848857801796104d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean3 = complex1.equals((java.lang.Object) '#');
        double double4 = complex1.getArgument();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex0.divide(complex1);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex0.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: must have n >= 0 for n!, got n = -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean13 = complex11.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt();
        org.apache.commons.math.complex.Complex complex18 = complex11.multiply(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex20 = complex18.add(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex20.add(0.0d);
        org.apache.commons.math.complex.Complex complex23 = complex20.negate();
        org.apache.commons.math.complex.Complex complex24 = complex7.add(complex20);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, (float) 1079574528L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) 1.5707963267948966d, (java.lang.Number) (short) 1, false);
        java.lang.Number number4 = numberIsTooLargeException3.getArgument();
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.5707963267948966d + "'", number4, 1.5707963267948966d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 3628832L, 22025.465794806718d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.DimensionMismatchException dimensionMismatchException3 = new org.apache.commons.math.exception.DimensionMismatchException(localizable0, (int) (short) 1, 1);
        org.apache.commons.math.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.0f);
        dimensionMismatchException3.addSuppressed((java.lang.Throwable) notPositiveException5);
        int int7 = dimensionMismatchException3.getDimension();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = null;
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 2.718281828459045d, (java.lang.Number) 0L, 1, orderDirection3, false);
        java.lang.Throwable throwable6 = nonMonotonousSequenceException5.getException();
        java.lang.Number number7 = nonMonotonousSequenceException5.getArgument();
        int int8 = nonMonotonousSequenceException5.getIndex();
        boolean boolean9 = nonMonotonousSequenceException5.getStrict();
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection10 = nonMonotonousSequenceException5.getDirection();
        java.lang.Throwable throwable11 = nonMonotonousSequenceException5.getException();
        java.lang.Number number12 = nonMonotonousSequenceException5.getPrevious();
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.toString(), "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 2.718281828459045d + "'", number7, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(orderDirection10);
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable11.toString(), "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 0L + "'", number12, 0L);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex11.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) 100, (double) 53495558235L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = null;
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 2.718281828459045d, (java.lang.Number) 0L, 1, orderDirection3, false);
        java.lang.Throwable throwable6 = nonMonotonousSequenceException5.getException();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext7 = nonMonotonousSequenceException5.getContext();
        java.lang.String str8 = nonMonotonousSequenceException5.toString();
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.toString(), "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertNotNull(exceptionContext7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not decreasing (0 < 2.718)" + "'", str8, "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not decreasing (0 < 2.718)");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        boolean boolean5 = complex4.isNaN();
        boolean boolean6 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-3.22561184E8f), (float) (-20));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex2.divide((double) 100L);
        double[] doubleArray12 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray12, doubleArray14);
        double[] doubleArray19 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray12);
        double double20 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray19);
        double[] doubleArray27 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray29 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray29, orderDirection30, true);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray29);
        double[] doubleArray35 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection36 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray35, orderDirection36, true);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray29, doubleArray35);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray35, (double) 100.0f);
        boolean boolean42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray19, doubleArray41);
        double[] doubleArray44 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray41, (double) 6);
        double[] doubleArray45 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray44);
        double[] doubleArray47 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray44, (int) '#');
        double[] doubleArray54 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray56 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection57 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray56, orderDirection57, true);
        boolean boolean60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray54, doubleArray56);
        double[] doubleArray62 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection63 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray62, orderDirection63, true);
        boolean boolean66 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray56, doubleArray62);
        double[] doubleArray69 = new double[] { 0, (short) -1 };
        double double70 = org.apache.commons.math.util.MathUtils.distance(doubleArray56, doubleArray69);
        double[] doubleArray72 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray69, (double) 4.0f);
        int int73 = org.apache.commons.math.util.MathUtils.hash(doubleArray72);
        boolean boolean74 = org.apache.commons.math.util.MathUtils.equals(doubleArray47, doubleArray72);
        boolean boolean75 = complex2.equals((java.lang.Object) boolean74);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 145.14131045295133d + "'", double20 == 145.14131045295133d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[6.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[6.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 100.0d + "'", double70 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-0.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1072692287) + "'", int73 == (-1072692287));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943295d + "'", double1 == 1.7453292519943295d);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math.complex.Complex complex5 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex2.log();
        org.apache.commons.math.complex.Complex complex7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex8 = complex2.divide(complex7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex11.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-1074790400));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-12699.999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        float float1 = org.apache.commons.math.util.FastMath.nextUp((float) 1410065408L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.41006554E9f + "'", float1 == 1.41006554E9f);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(0.0d);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean15 = complex13.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex17.divide(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex13.subtract(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex12.divide(complex23);
        double double25 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex27 = complex23.add((-1.0d));
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex(11013.232920103324d);
        double double30 = complex29.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex29.pow(4.806217383937352E-6d);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean35 = complex33.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex38 = complex36.pow(complex37);
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex39.pow(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex37.divide(complex39);
        org.apache.commons.math.complex.Complex complex43 = complex33.subtract(complex42);
        org.apache.commons.math.complex.Complex complex45 = complex43.pow(0.0d);
        org.apache.commons.math.complex.Complex complex46 = complex43.sqrt();
        org.apache.commons.math.complex.Complex complex49 = complex46.createComplex((double) 6, (double) 10);
        org.apache.commons.math.complex.Complex complex50 = complex29.divide(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex27.divide(complex50);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((float) 2, (-0.99999994f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.DimensionMismatchException dimensionMismatchException3 = new org.apache.commons.math.exception.DimensionMismatchException(localizable0, (-127), 1079574559);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        double double2 = org.apache.commons.math.util.FastMath.copySign((double) 30, (-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-30.0d) + "'", double2 == (-30.0d));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex8 = complex3.multiply((double) (short) 0);
        java.lang.Object obj9 = complex3.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "(1.0, 0.0)");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) 100.0f);
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.math.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.0f);
        boolean boolean2 = notPositiveException1.getBoundIsAllowed();
        java.lang.Number number3 = notPositiveException1.getMin();
        java.lang.Number number4 = notPositiveException1.getMin();
        org.apache.commons.math.exception.util.Localizable localizable5 = null;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex13);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object[] objArray18 = new java.lang.Object[] { complex8, complex11, obj17 };
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException19 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number) 100L, objArray18);
        org.apache.commons.math.exception.NullArgumentException nullArgumentException20 = new org.apache.commons.math.exception.NullArgumentException(localizable5, objArray18);
        java.lang.Throwable throwable21 = nullArgumentException20.getException();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext22 = nullArgumentException20.getContext();
        notPositiveException1.addSuppressed((java.lang.Throwable) nullArgumentException20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(throwable21);
        org.junit.Assert.assertNotNull(exceptionContext22);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        float float1 = org.apache.commons.math.util.FastMath.ulp((float) 4L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 10.0d, (java.lang.Number) 4.787491742782046d, 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean3 = complex1.equals((java.lang.Object) '#');
        double double4 = complex1.getArgument();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt1z();
        boolean boolean9 = complex8.isNaN();
        boolean boolean10 = complex8.isInfinite();
        java.lang.String str11 = complex8.toString();
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.exception.util.Localizable localizable15 = null;
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException19 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) (short) 100, (java.lang.Number) 0.16644599640410362d, true);
        java.lang.Number number20 = numberIsTooLargeException19.getMax();
        boolean boolean21 = numberIsTooLargeException19.getBoundIsAllowed();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext22 = numberIsTooLargeException19.getContext();
        org.apache.commons.math.exception.NotPositiveException notPositiveException24 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.0f);
        boolean boolean25 = notPositiveException24.getBoundIsAllowed();
        java.lang.Number number26 = notPositiveException24.getMin();
        java.lang.Throwable throwable27 = notPositiveException24.getException();
        numberIsTooLargeException19.addSuppressed((java.lang.Throwable) notPositiveException24);
        java.lang.Throwable[] throwableArray29 = numberIsTooLargeException19.getSuppressed();
        org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object) complex13, localizable15, (java.lang.Object[]) throwableArray29);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(0.0, 0.0)" + "'", str11, "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.16644599640410362d + "'", number20, 0.16644599640410362d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(exceptionContext22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0 + "'", number26, 0);
        org.junit.Assert.assertNotNull(throwable27);
        org.junit.Assert.assertEquals(throwable27.getLocalizedMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable27.getMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable27.toString(), "org.apache.commons.math.exception.NotPositiveException: 1 is smaller than the minimum (0)");
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.math.util.MathUtils.checkFinite(0.0d);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((float) 0L, (float) (-20));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        double double6 = org.apache.commons.math.util.MathUtils.linearCombination((double) 100.00001f, (double) 1079574428L, (double) 1303825045, (double) 53495558234L, (double) (-3.22561184E8f), 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.974884872970262E19d + "'", double6 == 6.974884872970262E19d);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        double double2 = org.apache.commons.math.util.FastMath.scalb((double) 52L, 1528444521);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.math.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.5667262027409901E-19d);
        java.lang.Number number2 = notPositiveException1.getMin();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext3 = notPositiveException1.getContext();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 0 + "'", number2, 0);
        org.junit.Assert.assertNotNull(exceptionContext3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-128.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.039684199579493d) + "'", double1 == (-5.039684199579493d));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        boolean boolean2 = complex1.isNaN();
        boolean boolean3 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex1.subtract(complex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(0.0d);
        org.apache.commons.math.complex.Complex complex14 = complex12.pow((double) 100L);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray6);
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        double[] doubleArray21 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray23 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection24 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray23, orderDirection24, true);
        boolean boolean27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray21, doubleArray23);
        double[] doubleArray29 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray29, orderDirection30, true);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray23, doubleArray29);
        double[] doubleArray35 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray29, (double) 100.0f);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray35);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray35, (double) 6);
        double[] doubleArray39 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray38);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray38, (int) '#');
        org.apache.commons.math.util.MathUtils.checkFinite(doubleArray41);
        int int43 = org.apache.commons.math.util.MathUtils.hash(doubleArray41);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 145.14131045295133d + "'", double14 == 145.14131045295133d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[6.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[6.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1370015649) + "'", int43 == (-1370015649));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        boolean boolean2 = complex1.isNaN();
        boolean boolean3 = complex1.isInfinite();
        java.lang.String str4 = complex1.toString();
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex6.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.subtract(Double.NEGATIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex15 = complex1.subtract(complex12);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0.0, 0.0)" + "'", str4, "(0.0, 0.0)");
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-127), (-1068892160));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.ComplexField complexField3 = complex2.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.math.exception.NumberIsTooSmallException numberIsTooSmallException3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number) 2.8844991406148166d, (java.lang.Number) 64512240L, true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((-0.6799280044513404d));
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean17 = complex15.equals((java.lang.Object) '#');
        double double18 = complex15.getArgument();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField19 = complex15.getField();
        boolean boolean20 = complex15.isInfinite();
        org.apache.commons.math.complex.Complex complex21 = complex12.divide(complex15);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField22 = complex12.getField();
        org.apache.commons.math.complex.Complex complex23 = complexField22.getZero();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complexField22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(1520286529L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1520286533L + "'", long2 == 1520286533L);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray19 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray14);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray19);
        double[] doubleArray22 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray19, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 1.9155040003582885E22d, (java.lang.Number) 4.666310772197643E157d, 4);
        int int4 = nonMonotonousSequenceException3.getIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex2.asin();
        org.apache.commons.math.complex.Complex complex5 = complex2.sqrt1z();
        double double6 = complex2.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray6);
        double[] doubleArray14 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        double double14 = complex12.abs();
        double double15 = complex12.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.626860407847019d + "'", double13 == 3.626860407847019d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.626860407847019d + "'", double14 == 3.626860407847019d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(32, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 960 + "'", int2 == 960);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.log();
        java.lang.Object obj12 = complex11.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "(Infinity, -0.7853981633974483)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "(Infinity, -0.7853981633974483)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "(Infinity, -0.7853981633974483)");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField11 = complex8.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.multiply(0.7525988353206895d);
        double double3 = complex2.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math.exception.NotPositiveException(localizable0, (java.lang.Number) 11013.232920103324d);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean3 = complex1.equals((java.lang.Object) '#');
        double double4 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex7 = complex1.createComplex((double) 52.0f, 145.14131045295133d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList9 = complex7.nthRoot((int) (byte) 10);
        org.apache.commons.math.complex.Complex complex10 = complex0.pow(complex7);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexList9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.math.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.0f);
        boolean boolean2 = notPositiveException1.getBoundIsAllowed();
        java.lang.Throwable[] throwableArray3 = notPositiveException1.getSuppressed();
        java.lang.Number number4 = notPositiveException1.getMin();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((double) 3628832L, (double) 100.0f);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.multiply(0.7525988353206895d);
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.5422326689561365d, 0.0d, (-32));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = complex6.subtract(3.626860407847019d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex6.divide(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex13.negate();
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex15.log();
        boolean boolean17 = complex15.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.1392093224043782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4021125405347221d) + "'", double1 == (-1.4021125405347221d));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) ' ');
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply((double) (-1069547520));
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.math.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.0f);
        boolean boolean2 = notPositiveException1.getBoundIsAllowed();
        java.lang.Number number3 = notPositiveException1.getMin();
        java.lang.Throwable throwable4 = notPositiveException1.getException();
        java.lang.Number number5 = notPositiveException1.getMin();
        boolean boolean6 = notPositiveException1.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable4.toString(), "org.apache.commons.math.exception.NotPositiveException: 1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-32), (float) (-1079574525L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.07957453E9f) + "'", float2 == (-1.07957453E9f));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(5.0d);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 32L, 1520286529, (-32));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException; message: invalid rounding method -32, valid methods: ROUND_CEILING (2), ROUND_DOWN (1), ROUND_FLOOR (3), ROUND_HALF_DOWN (5), ROUND_HALF_EVEN (6), ROUND_HALF_UP (4), ROUND_UNNECESSARY (7), ROUND_UP (0)");
        } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((-1370015649), (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = null;
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 2.718281828459045d, (java.lang.Number) 0L, 1, orderDirection3, false);
        java.lang.Throwable throwable6 = nonMonotonousSequenceException5.getException();
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection7 = nonMonotonousSequenceException5.getDirection();
        java.lang.Number number8 = nonMonotonousSequenceException5.getArgument();
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.toString(), "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertNull(orderDirection7);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 2.718281828459045d + "'", number8, 2.718281828459045d);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        boolean boolean2 = complex1.isNaN();
        boolean boolean3 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (short) 100, 7.051207161862808d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean7 = complex5.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex5.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex12.exp();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex15);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField17 = complex2.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean10 = complex8.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex11.pow(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex8.multiply(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex17 = complex15.add(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex17.add(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex6.add(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.tan();
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        double double24 = complex22.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1072692286));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: must have n >= 0 for n!, got n = -1,072,692,286");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) (-127), 1.5672566699017076d);
        org.apache.commons.math.complex.Complex complex5 = complex0.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = complex6.createComplex(3.1415926487310046d, (double) 1.52028672E9f);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.math.util.MathUtils.checkFinite(1.7453292519943295d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex12.divide((-0.6799280044513404d));
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean17 = complex15.equals((java.lang.Object) '#');
        double double18 = complex15.getArgument();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField19 = complex15.getField();
        boolean boolean20 = complex15.isInfinite();
        org.apache.commons.math.complex.Complex complex21 = complex12.divide(complex15);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean24 = complex22.equals((java.lang.Object) '#');
        double double25 = complex22.getArgument();
        org.apache.commons.math.complex.Complex complex28 = complex22.createComplex((double) 52.0f, 145.14131045295133d);
        org.apache.commons.math.complex.Complex complex29 = complex28.log();
        org.apache.commons.math.complex.Complex complex30 = complex12.multiply(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex33 = complex30.pow(complex32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(complexField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-7834201334447387163L), (double) (-1072692287), 2.2924316695611777d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException4 = new org.apache.commons.math.exception.NumberIsTooLargeException(localizable0, (java.lang.Number) (short) 100, (java.lang.Number) 0.0f, true);
        boolean boolean5 = numberIsTooLargeException4.getBoundIsAllowed();
        java.lang.Number number6 = numberIsTooLargeException4.getMax();
        boolean boolean7 = numberIsTooLargeException4.getBoundIsAllowed();
        java.lang.Number number8 = numberIsTooLargeException4.getArgument();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0.0f + "'", number6, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (short) 100 + "'", number8, (short) 100);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean14 = complex12.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex15.pow(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex12.multiply(complex17);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex21.add(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex11.multiply(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex24.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        double double8 = complex7.abs();
        boolean boolean9 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
        boolean boolean13 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex14 = complex12.asin();
        org.apache.commons.math.complex.Complex complex15 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex16 = complex7.add(complex15);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.DimensionMismatchException dimensionMismatchException3 = new org.apache.commons.math.exception.DimensionMismatchException(localizable0, (int) '4', 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) 52.0f, 145.14131045295133d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) 10);
        org.apache.commons.math.complex.Complex complex9 = complex6.log();
        java.lang.Object obj10 = complex6.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "(52.0, 145.14131045295133)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "(52.0, 145.14131045295133)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "(52.0, 145.14131045295133)");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.072692287E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7808233359797914d + "'", double1 == 0.7808233359797914d);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math.complex.Complex complex6 = complex2.subtract(3.5553480614894135d);
        org.apache.commons.math.complex.Complex complex7 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex7.subtract(100.0d);
        double double10 = complex9.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        double double2 = org.apache.commons.math.util.MathUtils.round(4.638559139174709d, (-20));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex7.multiply(0.0d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        long long2 = org.apache.commons.math.util.MathUtils.pow(3628800L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.55795945611504d + "'", double1 == 81.55795945611504d);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray21 = new double[] { 0, (short) -1 };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray21);
        double[] doubleArray24 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray8, 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        boolean boolean2 = complex1.isNaN();
        boolean boolean3 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math.complex.Complex complex7 = complex1.createComplex(9.800927644708983d, (double) 1.0f);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(1.4210854715202004E-14d, (-6.3827361682628291E18d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex7 = complex0.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(4.666310772197643E157d, (-1.1392093224043782d), 1520286529);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex8 = complex3.multiply((double) (short) 0);
        double double9 = complex8.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        int[] intArray4 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray6 = org.apache.commons.math.util.MathUtils.copyOf(intArray4, (int) (short) 10);
        int[] intArray8 = org.apache.commons.math.util.MathUtils.copyOf(intArray6, 0);
        int[] intArray13 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray15 = org.apache.commons.math.util.MathUtils.copyOf(intArray13, (int) (short) 10);
        int[] intArray16 = org.apache.commons.math.util.MathUtils.copyOf(intArray13);
        int[] intArray21 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray23 = org.apache.commons.math.util.MathUtils.copyOf(intArray21, (int) (short) 10);
        int int24 = org.apache.commons.math.util.MathUtils.distance1(intArray13, intArray21);
        int[] intArray26 = new int[] { 1520286529 };
        int[] intArray31 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray33 = org.apache.commons.math.util.MathUtils.copyOf(intArray31, (int) (short) 10);
        int[] intArray34 = org.apache.commons.math.util.MathUtils.copyOf(intArray31);
        int[] intArray39 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray41 = org.apache.commons.math.util.MathUtils.copyOf(intArray39, (int) (short) 10);
        int int42 = org.apache.commons.math.util.MathUtils.distance1(intArray31, intArray39);
        int int43 = org.apache.commons.math.util.MathUtils.distanceInf(intArray26, intArray39);
        int int44 = org.apache.commons.math.util.MathUtils.distanceInf(intArray13, intArray39);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = org.apache.commons.math.util.MathUtils.distance1(intArray6, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1520286529]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int[] intArray4 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray6 = org.apache.commons.math.util.MathUtils.copyOf(intArray4, (int) (short) 10);
        int[] intArray8 = org.apache.commons.math.util.MathUtils.copyOf(intArray6, 30);
        int[] intArray10 = new int[] { 1520286529 };
        int[] intArray15 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray17 = org.apache.commons.math.util.MathUtils.copyOf(intArray15, (int) (short) 10);
        int[] intArray18 = org.apache.commons.math.util.MathUtils.copyOf(intArray15);
        int[] intArray23 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray25 = org.apache.commons.math.util.MathUtils.copyOf(intArray23, (int) (short) 10);
        int int26 = org.apache.commons.math.util.MathUtils.distance1(intArray15, intArray23);
        int int27 = org.apache.commons.math.util.MathUtils.distanceInf(intArray10, intArray23);
        int[] intArray29 = new int[] { 1520286529 };
        int[] intArray34 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray36 = org.apache.commons.math.util.MathUtils.copyOf(intArray34, (int) (short) 10);
        int[] intArray37 = org.apache.commons.math.util.MathUtils.copyOf(intArray34);
        int[] intArray42 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray44 = org.apache.commons.math.util.MathUtils.copyOf(intArray42, (int) (short) 10);
        int int45 = org.apache.commons.math.util.MathUtils.distance1(intArray34, intArray42);
        int int46 = org.apache.commons.math.util.MathUtils.distanceInf(intArray29, intArray42);
        int[] intArray48 = org.apache.commons.math.util.MathUtils.copyOf(intArray42, (int) ' ');
        int int49 = org.apache.commons.math.util.MathUtils.distanceInf(intArray23, intArray48);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = org.apache.commons.math.util.MathUtils.distanceInf(intArray8, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1520286529]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1520286529]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex8 = complex4.createComplex((double) (-1L), 156.3608363030788d);
        java.lang.Object obj9 = complex8.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "(-1.0, 156.3608363030788)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "(-1.0, 156.3608363030788)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "(-1.0, 156.3608363030788)");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.283185307179587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex4.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray15 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray6, (double) '4');
        org.apache.commons.math.util.MathUtils.checkFinite(doubleArray6);
        org.apache.commons.math.util.MathUtils.checkFinite(doubleArray6);
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1520286529 + "'", int13 == 1520286529);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[5.985611510791367, 1.870503597122302, 18.14388489208633, 1.870503597122302, 18.14388489208633, 5.985611510791367]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf((-0.7187963764108645d), (double) 5);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 30, 9.2311646426288E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.231164642678825E10d + "'", double2 == 9.231164642678825E10d);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex15 = complex12.divide(complex14);
        java.lang.Object obj16 = complex12.readResolve();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex17.tan();
        org.apache.commons.math.complex.Complex complex20 = complex12.add(complex17);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean23 = complex21.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex24.pow(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex27.pow(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex25.divide(complex27);
        org.apache.commons.math.complex.Complex complex31 = complex21.subtract(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex31.pow(0.0d);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean36 = complex34.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex37.pow(complex38);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex42 = complex40.pow(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex38.divide(complex40);
        org.apache.commons.math.complex.Complex complex44 = complex34.subtract(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex33.divide(complex44);
        double double46 = complex44.getImaginary();
        org.apache.commons.math.complex.Complex complex47 = complex44.atan();
        org.apache.commons.math.complex.Complex complex48 = complex12.add(complex47);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.626860407847019d + "'", double13 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "(3.626860407847019, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "(3.626860407847019, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "(3.626860407847019, 0.0)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException5 = new org.apache.commons.math.exception.NumberIsTooLargeException(localizable1, (java.lang.Number) (short) 100, (java.lang.Number) 0.0f, true);
        boolean boolean6 = numberIsTooLargeException5.getBoundIsAllowed();
        java.lang.Number number7 = numberIsTooLargeException5.getMax();
        java.lang.Throwable[] throwableArray8 = numberIsTooLargeException5.getSuppressed();
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException9 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number) 1410065408, (java.lang.Object[]) throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0f + "'", number7, 0.0f);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt();
        java.lang.Class<?> wildcardClass12 = complex11.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((float) (-12700), (float) 101, (float) (-1072692287));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex(11013.232920103324d);
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        double double7 = complex5.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11013.232920103324d + "'", double7 == 11013.232920103324d);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(5, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 10, n = 5");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        float float2 = org.apache.commons.math.util.FastMath.copySign((float) 6382736168262829056L, 3.22561248E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.3827359E18f + "'", float2 == 6.3827359E18f);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(32, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-68) + "'", int2 == (-68));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex2 = complexField1.getOne();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        int[] intArray2 = new int[] { 1, 1520286529 };
        int[] intArray4 = org.apache.commons.math.util.MathUtils.copyOf(intArray2, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1520286529]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1520286529, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex14 = complex11.divide(0.0d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean7 = complex5.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex5.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex12.exp();
        org.apache.commons.math.complex.Complex complex16 = complex2.subtract(complex15);
        java.lang.Object obj17 = complex16.readResolve();
        org.apache.commons.math.complex.Complex complex18 = complex16.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "(-1.718281828459045, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "(-1.718281828459045, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "(-1.718281828459045, 0.0)");
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 800 + "'", int2 == 800);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex5 = new org.apache.commons.math.complex.Complex(11013.232920103324d);
        org.apache.commons.math.complex.Complex complex6 = complex2.multiply(complex5);
        double double7 = complex2.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[][] doubleArray13 = new double[][] {};
        org.apache.commons.math.util.MathUtils.sortInPlace(doubleArray6, doubleArray13);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 10.0, 32.0, 32.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 208550721 + "'", int15 == 208550721);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField4 = complex0.getField();
        boolean boolean5 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean8 = complex6.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex9.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex6.multiply(complex11);
        org.apache.commons.math.complex.Complex complex14 = complex0.multiply(complex11);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean17 = complex15.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt1z();
        boolean boolean20 = complex19.isNaN();
        boolean boolean21 = complex19.isInfinite();
        org.apache.commons.math.complex.Complex complex22 = complex15.multiply(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex14.subtract(complex23);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex25.pow(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex23.divide(complex25);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(20.799832963471328d, 0.7525988353206895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.799832963471324d + "'", double2 == 20.799832963471324d);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex2.divide((double) 100L);
        java.lang.String str6 = complex2.toString();
        double double7 = complex2.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1.0, 0.0)" + "'", str6, "(1.0, 0.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray21 = new double[] { 0, (short) -1 };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray21);
        double[] doubleArray24 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray21, (double) 4.0f);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray21, 0.7853981633974483d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-0.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-0.0, 0.7853981633974483]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        java.lang.Number number1 = null;
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException4 = new org.apache.commons.math.exception.NumberIsTooLargeException(localizable0, number1, (java.lang.Number) 1079574529L, true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean10 = complex8.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex11.pow(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex8.multiply(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex17 = complex15.add(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex17.add(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex6.add(complex19);
        boolean boolean22 = complex6.isInfinite();
        org.apache.commons.math.complex.Complex complex24 = complex6.subtract((double) (byte) 100);
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply(6.0d);
        boolean boolean27 = complex26.isNaN();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex28.pow(complex29);
        double double31 = complex30.abs();
        org.apache.commons.math.complex.Complex complex32 = complex26.multiply(complex30);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.log();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex3.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex9.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex4.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex4.multiply(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex13 = complex11.add(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex13.add(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        org.apache.commons.math.complex.Complex complex17 = complex0.multiply(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex22.pow(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex20.divide(complex22);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean28 = complex26.equals((java.lang.Object) '#');
        double double29 = complex26.getArgument();
        org.apache.commons.math.complex.Complex complex30 = complex20.add(complex26);
        org.apache.commons.math.complex.Complex complex31 = complex30.sinh();
        double double32 = complex31.getReal();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex34 = complex31.divide(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex16.multiply(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex34.tan();
        org.apache.commons.math.complex.Complex complex37 = complex34.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 3.626860407847019d + "'", double32 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 6382736168262828673L, (double) 100L, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField4 = complex0.getField();
        boolean boolean5 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean8 = complex6.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex9.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex6.multiply(complex11);
        org.apache.commons.math.complex.Complex complex14 = complex0.multiply(complex11);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean17 = complex15.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt1z();
        boolean boolean20 = complex19.isNaN();
        boolean boolean21 = complex19.isInfinite();
        org.apache.commons.math.complex.Complex complex22 = complex15.multiply(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex14.subtract(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex23.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9645439376170786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7673521361453202d) + "'", double1 == (-0.7673521361453202d));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex4.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex4.multiply(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex13 = complex11.add(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex13.add(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        org.apache.commons.math.complex.Complex complex17 = complex0.multiply(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex22.pow(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex20.divide(complex22);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean28 = complex26.equals((java.lang.Object) '#');
        double double29 = complex26.getArgument();
        org.apache.commons.math.complex.Complex complex30 = complex20.add(complex26);
        org.apache.commons.math.complex.Complex complex31 = complex30.sinh();
        double double32 = complex31.getReal();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex34 = complex31.divide(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex16.multiply(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex16.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 3.626860407847019d + "'", double32 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(4.787491742782046d, (double) 1079574528, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.lang.Number number0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException4 = new org.apache.commons.math.exception.MathArithmeticException();
        java.lang.Throwable[] throwableArray5 = mathArithmeticException4.getSuppressed();
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException6 = new org.apache.commons.math.exception.MathArithmeticException(localizable3, (java.lang.Object[]) throwableArray5);
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException7 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number) (byte) 10, (java.lang.Object[]) throwableArray5);
        org.apache.commons.math.exception.MathIllegalArgumentException mathIllegalArgumentException8 = new org.apache.commons.math.exception.MathIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray5);
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException9 = new org.apache.commons.math.exception.NotFiniteNumberException(number0, (java.lang.Object[]) throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 10000000000L);
        org.apache.commons.math.complex.Complex complex2 = complex1.tan();
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        float float1 = org.apache.commons.math.util.FastMath.abs(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) 52.0f, 145.14131045295133d);
        org.apache.commons.math.complex.Complex complex7 = complex0.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.225612E8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 1410065408L);
        boolean boolean2 = complex1.isNaN();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((float) (-127), (-6.0f), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        boolean boolean2 = complex1.isNaN();
        boolean boolean3 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math.complex.Complex complex5 = complex1.asin();
        org.apache.commons.math.complex.Complex complex6 = complex1.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        int int2 = org.apache.commons.math.util.FastMath.max(13, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) 52.0f, 145.14131045295133d);
        org.apache.commons.math.complex.Complex complex7 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex7.exp();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex9.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex12);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField16 = complex15.getField();
        org.apache.commons.math.complex.Complex complex18 = complex15.subtract(3.626860407847019d);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex15.divide(complex19);
        org.apache.commons.math.complex.Complex complex23 = complex8.add(complex19);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complexField16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray9 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection10 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray9, orderDirection10, true);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray9);
        double[] doubleArray14 = null;
        boolean boolean15 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = org.apache.commons.math.util.MathUtils.distance1(doubleArray0, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        double double8 = complex7.abs();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField9 = complex7.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(complexField9);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        double double4 = org.apache.commons.math.util.MathUtils.linearCombination(6.283185307179586d, 11013.232920103324d, 1.5202865290000002E9d, 2.6534005504766256E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0339291129377192E16d + "'", double4 == 4.0339291129377192E16d);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = complex2.log();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField6 = complex5.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complexField6);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        long long1 = org.apache.commons.math.util.MathUtils.sign(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(1.7031839360032603E-108d);
        boolean boolean2 = complex1.isInfinite();
        java.lang.Object obj3 = null;
        boolean boolean4 = complex1.equals(obj3);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) (short) 100, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.ComplexField complexField1 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.createComplex((double) (-127), 1.5672566699017076d);
        org.apache.commons.math.complex.Complex complex5 = complex0.cos();
        boolean boolean6 = complex0.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexField1);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1520286529);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 1410065408L);
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex4 = complex1.tanh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 140);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex0.subtract(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField5 = complex4.getField();
        org.apache.commons.math.complex.Complex complex6 = complexField5.getOne();
        org.apache.commons.math.complex.Complex complex7 = complexField5.getZero();
        org.apache.commons.math.complex.Complex complex8 = complexField5.getZero();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(0.0d);
        org.apache.commons.math.complex.Complex complex13 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex13.createComplex((double) 6, (double) 10);
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        int[] intArray0 = null;
        int[] intArray5 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray7 = org.apache.commons.math.util.MathUtils.copyOf(intArray5, (int) (short) 10);
        int[] intArray9 = org.apache.commons.math.util.MathUtils.copyOf(intArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.math.util.MathUtils.distance1(intArray0, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField3 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complexField3.getZero();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        int int1 = org.apache.commons.math.util.FastMath.getExponent((double) 3628800L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(24.0d, 3628800.0d);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = null;
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 2.718281828459045d, (java.lang.Number) 0L, 1, orderDirection3, false);
        java.lang.Throwable throwable6 = nonMonotonousSequenceException5.getException();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext7 = nonMonotonousSequenceException5.getContext();
        int int8 = nonMonotonousSequenceException5.getIndex();
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertEquals(throwable6.toString(), "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not decreasing (0 < 2.718)");
        org.junit.Assert.assertNotNull(exceptionContext7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        double double5 = complex2.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-37592992), (-20));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        double double4 = complex0.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        int int1 = org.apache.commons.math.util.FastMath.abs(30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex3.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        double double1 = org.apache.commons.math.util.FastMath.signum(3628802.1254938054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex15 = complex12.divide(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        double double17 = complex16.getReal();
        org.apache.commons.math.complex.Complex complex18 = complex16.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.626860407847019d + "'", double13 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex9 = complex5.createComplex((double) (-32), (double) (-1370015649));
        org.apache.commons.math.complex.Complex complex11 = complex9.divide((-128.0d));
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 11410065408L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11410065408L + "'", long1 == 11410065408L);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((-1L), (long) (-37592991));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: exponent (-37,592,991)");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math.complex.Complex complex5 = complex2.log();
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 1.07957466E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.07957466E9f + "'", float2 == 1.07957466E9f);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((float) (byte) 0, 6.3827359E18f, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(0.6728789337653076d, (double) 100L);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = null;
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 2.718281828459045d, (java.lang.Number) 0L, 1, orderDirection3, false);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = nonMonotonousSequenceException5.getDirection();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext7 = nonMonotonousSequenceException5.getContext();
        org.junit.Assert.assertNull(orderDirection6);
        org.junit.Assert.assertNotNull(exceptionContext7);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) (short) 100, (java.lang.Number) 0.16644599640410362d, true);
        java.lang.Number number4 = numberIsTooLargeException3.getMax();
        boolean boolean5 = numberIsTooLargeException3.getBoundIsAllowed();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext6 = numberIsTooLargeException3.getContext();
        org.apache.commons.math.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.0f);
        boolean boolean9 = notPositiveException8.getBoundIsAllowed();
        java.lang.Number number10 = notPositiveException8.getMin();
        java.lang.Throwable throwable11 = notPositiveException8.getException();
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException8);
        org.apache.commons.math.exception.util.Localizable localizable13 = null;
        org.apache.commons.math.exception.DimensionMismatchException dimensionMismatchException16 = new org.apache.commons.math.exception.DimensionMismatchException(localizable13, (-127), 0);
        int int17 = dimensionMismatchException16.getDimension();
        notPositiveException8.addSuppressed((java.lang.Throwable) dimensionMismatchException16);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.16644599640410362d + "'", number4, 0.16644599640410362d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(exceptionContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 0 + "'", number10, 0);
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable11.toString(), "org.apache.commons.math.exception.NotPositiveException: 1 is smaller than the minimum (0)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.log();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField8 = complex6.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex14.log();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(4.440892098500626E-16d);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean20 = complex18.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex18.multiply(complex23);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex27 = complex25.add(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex27.add(0.0d);
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex14.multiply(complex31);
        java.lang.Object obj34 = complex14.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "(NaN, NaN)");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray6);
        double[] doubleArray20 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray22 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection23 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection23, true);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray20, doubleArray22);
        double[] doubleArray28 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection29 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection29, true);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray22, doubleArray28);
        double[] doubleArray39 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray41 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection42 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray41, orderDirection42, true);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray39, doubleArray41);
        double[] doubleArray46 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray39);
        double double47 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray46);
        double[] doubleArray54 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray56 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection57 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray56, orderDirection57, true);
        boolean boolean60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray54, doubleArray56);
        double[] doubleArray62 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection63 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray62, orderDirection63, true);
        boolean boolean66 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray56, doubleArray62);
        double[] doubleArray68 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray62, (double) 100.0f);
        boolean boolean69 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray46, doubleArray68);
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException73 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 0L, (java.lang.Number) (-0.99999994f), (int) (byte) 1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection74 = nonMonotonousSequenceException73.getDirection();
        boolean boolean77 = org.apache.commons.math.util.MathUtils.checkOrder(doubleArray46, orderDirection74, true, false);
        double double78 = org.apache.commons.math.util.MathUtils.distance1(doubleArray22, doubleArray46);
        double double79 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray6, doubleArray46);
        double double80 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 145.14131045295133d + "'", double47 == 145.14131045295133d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + orderDirection74 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection74.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 68.0d + "'", double78 == 68.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 145.14131045295133d + "'", double80 == 145.14131045295133d);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex5 = complexField4.getZero();
        org.apache.commons.math.complex.Complex complex6 = complexField4.getZero();
        org.apache.commons.math.exception.util.Localizable localizable7 = null;
        org.apache.commons.math.exception.util.Localizable localizable9 = null;
        org.apache.commons.math.exception.util.Localizable localizable10 = null;
        org.apache.commons.math.exception.util.Localizable localizable11 = null;
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException12 = new org.apache.commons.math.exception.MathArithmeticException();
        java.lang.Throwable[] throwableArray13 = mathArithmeticException12.getSuppressed();
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException14 = new org.apache.commons.math.exception.MathArithmeticException(localizable11, (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException15 = new org.apache.commons.math.exception.MathArithmeticException(localizable10, (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.exception.MathIllegalArgumentException mathIllegalArgumentException16 = new org.apache.commons.math.exception.MathIllegalArgumentException(localizable9, (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException17 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number) 1.410065408E9d, (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object) complexField4, localizable7, (java.lang.Object[]) throwableArray13);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex8 = complexField7.getOne();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex9.pow(complex10);
        double double12 = complex11.abs();
        org.apache.commons.math.complex.Complex complex13 = complex11.tan();
        boolean boolean14 = complex8.equals((java.lang.Object) complex13);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = complex6.subtract(3.626860407847019d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex6.divide(complex10);
        org.apache.commons.math.complex.Complex complex15 = complex13.pow((double) 47174400L);
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        java.lang.String str5 = complex4.toString();
        org.apache.commons.math.complex.Complex complex6 = complex4.cos();
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList9 = complex6.nthRoot(5);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(1.557407724654902, 0.0)" + "'", str5, "(1.557407724654902, 0.0)");
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexList9);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2418666067481388d + "'", double1 == 1.2418666067481388d);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex8 = complex3.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean12 = complex10.equals((java.lang.Object) '#');
        double double13 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean16 = complex14.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex17.pow(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex14.multiply(complex19);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex23 = complex21.add(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex23.add(0.0d);
        org.apache.commons.math.complex.Complex complex26 = complex23.negate();
        org.apache.commons.math.complex.Complex complex27 = complex10.multiply(complex26);
        org.apache.commons.math.complex.ComplexField complexField28 = complex26.getField();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex29.pow(complex30);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex32.pow(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex30.divide(complex32);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean38 = complex36.equals((java.lang.Object) '#');
        double double39 = complex36.getArgument();
        org.apache.commons.math.complex.Complex complex40 = complex30.add(complex36);
        org.apache.commons.math.complex.Complex complex41 = complex40.sinh();
        double double42 = complex41.getReal();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex44 = complex41.divide(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex26.multiply(complex44);
        org.apache.commons.math.complex.Complex complex48 = complex44.createComplex(Double.POSITIVE_INFINITY, 0.0d);
        org.apache.commons.math.complex.Complex complex49 = complex3.pow(complex48);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complexField28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 3.626860407847019d + "'", double42 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean14 = complex12.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex15.pow(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex12.multiply(complex17);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex21.add(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex11.multiply(complex24);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean28 = complex26.equals((java.lang.Object) '#');
        double double29 = complex26.getArgument();
        org.apache.commons.math.complex.Complex complex32 = complex26.createComplex((double) 52.0f, 145.14131045295133d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList34 = complex32.nthRoot((int) (byte) 10);
        org.apache.commons.math.complex.Complex complex35 = complex32.log();
        org.apache.commons.math.complex.Complex complex36 = complex25.subtract(complex35);
        org.apache.commons.math.complex.Complex complex38 = complex35.multiply((double) 322561200L);
        org.apache.commons.math.complex.Complex complex39 = complex35.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexList34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        float float1 = org.apache.commons.math.util.FastMath.ulp((float) (-1370015649));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 128.0f + "'", float1 == 128.0f);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex2.subtract(complex5);
        org.apache.commons.math.complex.ComplexField complexField8 = complex2.getField();
        org.apache.commons.math.complex.Complex complex9 = complexField8.getZero();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complexField8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        int int2 = org.apache.commons.math.util.MathUtils.pow(30, (long) 960);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.subtract(Double.NEGATIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex9 = complex6.sin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex15 = complex12.divide(complex14);
        double double16 = complex14.getArgument();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean20 = complex18.equals((java.lang.Object) '#');
        double double21 = complex18.getArgument();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField22 = complex18.getField();
        org.apache.commons.math.complex.Complex complex23 = complex17.divide(complex18);
        org.apache.commons.math.complex.Complex complex24 = complex14.divide(complex18);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.626860407847019d + "'", double13 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.5707963267948966d + "'", double16 == 1.5707963267948966d);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complexField22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray21 = new double[] { 0, (short) -1 };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray21);
        double[] doubleArray24 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray8, (int) ' ');
        double[][] doubleArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MathUtils.sortInPlace(doubleArray24, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = complex6.subtract(3.626860407847019d);
        org.apache.commons.math.complex.Complex complex10 = complex9.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean10 = complex8.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex11.pow(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex8.multiply(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex17 = complex15.add(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex17.add(0.0d);
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex6.add(complex19);
        boolean boolean22 = complex6.isInfinite();
        boolean boolean23 = complex6.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        double double1 = org.apache.commons.math.util.FastMath.abs(3628802.1254938054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628802.1254938054d + "'", double1 == 3628802.1254938054d);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.9999999958776927d, 9.2311646426288E10d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList4 = complex2.nthRoot((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: -1");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) 52.0f, 145.14131045295133d);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex7.multiply(complex12);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex14.add(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex6.add(complex14);
        org.apache.commons.math.complex.Complex complex18 = complex6.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        double[] doubleArray1 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection2 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection2, true);
        org.apache.commons.math.util.MathUtils.checkFinite(doubleArray1);
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        org.apache.commons.math.util.MathUtils.checkFinite(doubleArray8);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1079574559 + "'", int6 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField3 = complex0.getField();
        org.apache.commons.math.complex.Complex complex4 = complex0.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complexField3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1520286529, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.divide((double) 5L);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = complex2.log();
        double double6 = complex5.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((double) 1303825045);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((float) 6, 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow(1079574559, (-9765626L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: exponent (-9,765,626)");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math.complex.Complex complex6 = complex2.subtract(3.5553480614894135d);
        org.apache.commons.math.complex.Complex complex7 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex7.subtract(6.283185307179586d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.0E10d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex4.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(6.123233995736766E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField4 = complex3.getField();
        org.apache.commons.math.complex.Complex complex5 = complexField4.getZero();
        org.apache.commons.math.complex.Complex complex6 = complexField4.getZero();
        org.apache.commons.math.complex.Complex complex7 = complexField4.getOne();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complexField4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        double[] doubleArray1 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection2 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection2, true);
        org.apache.commons.math.util.MathUtils.checkFinite(doubleArray1);
        double[] doubleArray12 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray14 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection15, true);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray12, doubleArray14);
        double[] doubleArray20 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection21 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection21, true);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray20);
        double[] doubleArray31 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray33 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection34 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray33, orderDirection34, true);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray31, doubleArray33);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray31);
        double double39 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray38);
        double[] doubleArray46 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray48 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection49 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray48, orderDirection49, true);
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray46, doubleArray48);
        double[] doubleArray54 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection55 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray54, orderDirection55, true);
        boolean boolean58 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray48, doubleArray54);
        double[] doubleArray60 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray54, (double) 100.0f);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray38, doubleArray60);
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException65 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 0L, (java.lang.Number) (-0.99999994f), (int) (byte) 1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection66 = nonMonotonousSequenceException65.getDirection();
        boolean boolean69 = org.apache.commons.math.util.MathUtils.checkOrder(doubleArray38, orderDirection66, true, false);
        double double70 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray38);
        double[] doubleArray72 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray38, (double) (byte) 1);
        double double73 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray72);
        double[] doubleArray80 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray82 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection83 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray82, orderDirection83, true);
        boolean boolean86 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray80, doubleArray82);
        double[] doubleArray88 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection89 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray88, orderDirection89, true);
        boolean boolean92 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray82, doubleArray88);
        double[] doubleArray94 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray88, (double) 100.0f);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray94);
        double double96 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray94);
        boolean boolean97 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray72, doubleArray94);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 145.14131045295133d + "'", double39 == 145.14131045295133d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + orderDirection66 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection66.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 68.0d + "'", double70 == 68.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.11510791366906475, 0.03597122302158273, 0.3489208633093525, 0.03597122302158273, 0.3489208633093525, 0.11510791366906475]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 99.88489208633094d + "'", double73 == 99.88489208633094d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[100.0]");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 100.0d + "'", double96 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex((-640.0d));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        double double2 = org.apache.commons.math.util.FastMath.IEEEremainder(1.5667262027409901E-19d, (double) (-1370015649));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5667262027409901E-19d + "'", double2 == 1.5667262027409901E-19d);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean6 = complex4.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex4.multiply(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex13 = complex11.add(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex13.add(0.0d);
        org.apache.commons.math.complex.Complex complex16 = complex13.negate();
        org.apache.commons.math.complex.Complex complex17 = complex0.multiply(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = complex16.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex11.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MathUtils.checkFinite(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex3.multiply(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        int[] intArray4 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray6 = org.apache.commons.math.util.MathUtils.copyOf(intArray4, (int) (short) 10);
        int[] intArray7 = org.apache.commons.math.util.MathUtils.copyOf(intArray4);
        int[] intArray12 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray14 = org.apache.commons.math.util.MathUtils.copyOf(intArray12, (int) (short) 10);
        int int15 = org.apache.commons.math.util.MathUtils.distance1(intArray4, intArray12);
        int[] intArray20 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray22 = org.apache.commons.math.util.MathUtils.copyOf(intArray20, (int) (short) 10);
        int int23 = org.apache.commons.math.util.MathUtils.distanceInf(intArray12, intArray20);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex11.pow(complex12);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex12.divide(complex14);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean20 = complex18.equals((java.lang.Object) '#');
        double double21 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex12.add(complex18);
        org.apache.commons.math.complex.Complex complex23 = complex22.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex23.divide((-0.6799280044513404d));
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean28 = complex26.equals((java.lang.Object) '#');
        double double29 = complex26.getArgument();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField30 = complex26.getField();
        boolean boolean31 = complex26.isInfinite();
        org.apache.commons.math.complex.Complex complex32 = complex23.divide(complex26);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField33 = complex23.getField();
        org.apache.commons.math.complex.Complex complex34 = complex0.divide(complex23);
        org.apache.commons.math.complex.Complex complex35 = complex0.sin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(complexField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complexField33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        double double2 = org.apache.commons.math.util.FastMath.copySign((double) Float.POSITIVE_INFINITY, (double) 3628800L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex11 = complex3.multiply(complex10);
        java.lang.Object obj12 = null;
        boolean boolean13 = complex10.equals(obj12);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 10.0d, (java.lang.Number) 4.787491742782046d, 0);
        int int4 = nonMonotonousSequenceException3.getIndex();
        int int5 = nonMonotonousSequenceException3.getIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.log();
        org.apache.commons.math.complex.Complex complex8 = complex7.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = complex6.subtract(3.626860407847019d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex6.divide(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex13.negate();
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex15.log();
        java.lang.Class<?> wildcardClass17 = complex15.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        double double2 = org.apache.commons.math.util.FastMath.hypot((-6.314831475059969d), (double) 1806950656);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.806950656E9d + "'", double2 == 1.806950656E9d);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex1.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex3.asin();
        org.apache.commons.math.complex.Complex complex6 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        double[] doubleArray9 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray11 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection12 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray11, orderDirection12, true);
        boolean boolean15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray9, doubleArray11);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        double[] doubleArray23 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray25 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection26 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray25, orderDirection26, true);
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray23, doubleArray25);
        double[] doubleArray31 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection32 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray31, orderDirection32, true);
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray25, doubleArray31);
        double[] doubleArray38 = new double[] { 0, (short) -1 };
        double double39 = org.apache.commons.math.util.MathUtils.distance(doubleArray25, doubleArray38);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray25, (int) ' ');
        double double42 = org.apache.commons.math.util.MathUtils.distance(doubleArray9, doubleArray41);
        double[] doubleArray49 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray51 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection52 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray51, orderDirection52, true);
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray49, doubleArray51);
        double[] doubleArray57 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection58 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray57, orderDirection58, true);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray51, doubleArray57);
        double[] doubleArray62 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray57);
        boolean boolean63 = org.apache.commons.math.util.MathUtils.equals(doubleArray9, doubleArray62);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection64 = org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING;
        boolean boolean67 = org.apache.commons.math.util.MathUtils.checkOrder(doubleArray9, orderDirection64, false, false);
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException69 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) 3.225612E8d, (java.lang.Number) (-1.1392093224043782d), (-1370015649), orderDirection64, false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1520286529 + "'", int16 == 1520286529);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 157.05413079572278d + "'", double42 == 157.05413079572278d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + orderDirection64 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection64.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex9.add(0.0d);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex14.log();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(4.440892098500626E-16d);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex18.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex19.divide(complex21);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField25 = complex24.getField();
        org.apache.commons.math.complex.Complex complex27 = complex24.subtract(3.626860407847019d);
        org.apache.commons.math.complex.Complex complex30 = complex24.createComplex((double) 1, 2.718281828459045d);
        org.apache.commons.math.complex.Complex complex31 = complex14.add(complex24);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complexField25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) 17.982365531204298d, (java.lang.Number) 0.0d, false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(1.5707963267948966d);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray6);
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 145.14131045295133d + "'", double14 == 145.14131045295133d);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex6);
        org.apache.commons.math.complex.Complex complex10 = complex0.subtract(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean14 = complex12.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex15.pow(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex12.multiply(complex17);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex21.add(0.0d);
        org.apache.commons.math.complex.Complex complex24 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex11.multiply(complex24);
        org.apache.commons.math.complex.Complex complex27 = complex25.pow(0.0d);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean30 = complex28.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex31.pow(complex32);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex34.pow(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex32.divide(complex34);
        org.apache.commons.math.complex.Complex complex38 = complex28.subtract(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex37.tanh();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean42 = complex40.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex43.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex45.sqrt();
        org.apache.commons.math.complex.Complex complex47 = complex40.multiply(complex45);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex49 = complex47.add(complex48);
        org.apache.commons.math.complex.Complex complex51 = complex49.add(0.0d);
        org.apache.commons.math.complex.Complex complex52 = complex51.sinh();
        org.apache.commons.math.complex.Complex complex53 = complex39.multiply(complex52);
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean56 = complex54.equals((java.lang.Object) '#');
        double double57 = complex54.getArgument();
        org.apache.commons.math.complex.Complex complex60 = complex54.createComplex((double) 52.0f, 145.14131045295133d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList62 = complex60.nthRoot((int) (byte) 10);
        org.apache.commons.math.complex.Complex complex63 = complex60.log();
        org.apache.commons.math.complex.Complex complex64 = complex53.subtract(complex63);
        org.apache.commons.math.complex.Complex complex66 = complex63.multiply((double) 322561200L);
        org.apache.commons.math.complex.Complex complex67 = complex25.add(complex63);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complexList62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        double double7 = complex1.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        java.lang.Number number2 = null;
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException4 = new org.apache.commons.math.exception.NumberIsTooLargeException(localizable0, (java.lang.Number) 0.16644599640410362d, number2, true);
        boolean boolean5 = numberIsTooLargeException4.getBoundIsAllowed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = numberIsTooLargeException4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex7.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt();
        double double12 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField17 = complex16.getField();
        org.apache.commons.math.complex.ComplexField complexField18 = complex16.getField();
        org.apache.commons.math.complex.Complex complex19 = complex10.subtract(complex16);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex20.pow(complex21);
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex22.asin();
        org.apache.commons.math.complex.Complex complex25 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex26 = complex16.subtract(complex25);
        java.lang.String str27 = complex25.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complexField17);
        org.junit.Assert.assertNotNull(complexField18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0.0, 0.0)" + "'", str27, "(0.0, 0.0)");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.math.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) (-128L));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean9 = complex7.equals((java.lang.Object) '#');
        double double10 = complex7.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex1.add(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex11.sinh();
        double double13 = complex12.getReal();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex15 = complex12.divide(complex14);
        java.lang.Object obj16 = complex12.readResolve();
        double double17 = complex12.getArgument();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.626860407847019d + "'", double13 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "(3.626860407847019, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "(3.626860407847019, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "(3.626860407847019, 0.0)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException2 = new org.apache.commons.math.exception.MathArithmeticException();
        java.lang.Throwable[] throwableArray3 = mathArithmeticException2.getSuppressed();
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException4 = new org.apache.commons.math.exception.MathArithmeticException(localizable1, (java.lang.Object[]) throwableArray3);
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException5 = new org.apache.commons.math.exception.MathArithmeticException(localizable0, (java.lang.Object[]) throwableArray3);
        java.lang.Throwable throwable6 = mathArithmeticException5.getException();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext7 = mathArithmeticException5.getContext();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext8 = mathArithmeticException5.getContext();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertNotNull(exceptionContext7);
        org.junit.Assert.assertNotNull(exceptionContext8);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = complex6.subtract(3.626860407847019d);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex6.divide(complex10);
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        double double16 = complex13.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        double[] doubleArray6 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray8 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection9, true);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray8);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray20 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray22 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection23 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection23, true);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray20, doubleArray22);
        double[] doubleArray28 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection29 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection29, true);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray22, doubleArray28);
        double[] doubleArray35 = new double[] { 0, (short) -1 };
        double double36 = org.apache.commons.math.util.MathUtils.distance(doubleArray22, doubleArray35);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray22, (int) ' ');
        double double39 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray38);
        double[] doubleArray46 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray48 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection49 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray48, orderDirection49, true);
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray46, doubleArray48);
        double[] doubleArray54 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection55 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray54, orderDirection55, true);
        boolean boolean58 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray48, doubleArray54);
        double[] doubleArray59 = org.apache.commons.math.util.MathUtils.copyOf(doubleArray54);
        boolean boolean60 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray59);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray59);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1520286529 + "'", int13 == 1520286529);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 157.05413079572278d + "'", double39 == 157.05413079572278d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        boolean boolean5 = complex4.isNaN();
        boolean boolean6 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex9 = complex7.multiply(2.0E10d);
        org.apache.commons.math.complex.Complex complex10 = complex9.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        double double1 = org.apache.commons.math.util.FastMath.atan(20.799832963471328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5227560087477359d + "'", double1 == 1.5227560087477359d);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf((double) (-32));
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex8 = complex3.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex9 = complex3.tanh();
        double double10 = complex9.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }
}


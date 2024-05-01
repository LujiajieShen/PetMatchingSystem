package org.apache.commons.math.complex;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        long long2 = org.apache.commons.math.util.FastMath.max(9840L, (long) 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9840L + "'", long2 == 9840L);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        org.apache.commons.math.complex.Complex complex20 = complex16.createComplex(10.0d, 0.017453292520451254d);
        org.apache.commons.math.complex.Complex complex22 = complex16.subtract((double) (-3.22561184E8f));
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
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException1 = new org.apache.commons.math.exception.MathArithmeticException();
        java.lang.Throwable[] throwableArray2 = mathArithmeticException1.getSuppressed();
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException3 = new org.apache.commons.math.exception.MathArithmeticException(localizable0, (java.lang.Object[]) throwableArray2);
        java.lang.Throwable throwable4 = mathArithmeticException3.getException();
        java.lang.Throwable throwable5 = mathArithmeticException3.getException();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertNotNull(throwable5);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
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
        org.apache.commons.math.complex.Complex complex11 = complex0.cosh();
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
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.math.exception.NonMonotonousSequenceException nonMonotonousSequenceException3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number) (-0.7673521361453202d), (java.lang.Number) 32, 28);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField12 = complex1.getField();
        java.lang.Object obj13 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex1.divide(1.5707963267948966d);
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
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "(1.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "(1.0, 0.0)");
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        org.apache.commons.math.complex.Complex complex13 = complex3.multiply(6.283185307179587d);
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
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        double[] doubleArray8 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray10 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection11 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray10, orderDirection11, true);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray10);
        double[] doubleArray16 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection17 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray16, orderDirection17, true);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray10, doubleArray16);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection21 = null;
        double[] doubleArray28 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray30 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection31 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray30, orderDirection31, true);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray28, doubleArray30);
        double[][] doubleArray35 = new double[][] {};
        org.apache.commons.math.util.MathUtils.sortInPlace(doubleArray28, doubleArray35);
        org.apache.commons.math.util.MathUtils.sortInPlace(doubleArray16, orderDirection21, doubleArray35);
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException38 = new org.apache.commons.math.exception.NotFiniteNumberException(localizable0, (java.lang.Number) (-0.7187963764108645d), (java.lang.Object[]) doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 10.0, 32.0, 32.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField12 = complex1.getField();
        double double13 = complex1.abs();
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
        org.junit.Assert.assertNotNull(complexField12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField7 = complex6.getField();
        org.apache.commons.math.complex.Complex complex8 = complexField7.getOne();
        double double9 = complex8.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexField7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
        java.lang.Object obj15 = complex14.readResolve();
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
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "(NaN, NaN)");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { ' ', (byte) 10, 'a', 10, 97L, ' ' };
        double[] doubleArray9 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection10 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray9, orderDirection10, true);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray9);
        double[] doubleArray15 = new double[] { (short) 100 };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection16 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray15, orderDirection16, true);
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray9, doubleArray15);
        double[] doubleArray22 = new double[] { 0, (short) -1 };
        double double23 = org.apache.commons.math.util.MathUtils.distance(doubleArray9, doubleArray22);
        double[] doubleArray25 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray9, (double) 322561200L);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[32.0, 10.0, 97.0, 10.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[3.225612E8]");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        java.lang.Throwable throwable16 = nullArgumentException15.getException();
        org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object) throwable16);
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
        org.junit.Assert.assertNotNull(throwable16);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        org.apache.commons.math.util.MathUtils.checkFinite(doubleArray21);
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
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        boolean boolean5 = complex4.isNaN();
        boolean boolean6 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex0.cosh();
        double double9 = complex0.abs();
        boolean boolean10 = complex0.isInfinite();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField11 = complex0.getField();
        org.apache.commons.math.complex.Complex complex12 = complex0.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        org.apache.commons.math.complex.Complex complex14 = complex6.cos();
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
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        float float2 = org.apache.commons.math.util.MathUtils.round(35.0f, (-68));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField28 = complex26.getField();
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
        org.junit.Assert.assertNotNull(complexField28);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        float float2 = org.apache.commons.math.util.FastMath.nextAfter((float) '#', 1.5202866390000012E9d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(1.1102230246251565E-16d, 1.3244561064921736E10d);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean38 = complex36.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex39.pow(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex41.sqrt();
        org.apache.commons.math.complex.Complex complex43 = complex36.multiply(complex41);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex45 = complex43.add(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex44.conjugate();
        org.apache.commons.math.complex.Complex complex47 = complex46.log();
        org.apache.commons.math.complex.Complex complex48 = complex16.pow(complex47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.math.complex.Complex> complexList50 = complex47.nthRoot(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException; message: cannot compute nth root for null or negative n: 0");
        } catch (org.apache.commons.math.exception.NotPositiveException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(0.0d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) -1, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
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
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1079574529L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        org.apache.commons.math.complex.Complex complex17 = complex14.pow((double) 1079574528L);
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
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        int int1 = org.apache.commons.math.util.FastMath.getExponent(5.343237290762231E12d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42 + "'", int1 == 42);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.valueOf(1.7453292519943295d, (double) (-9765626L));
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11410065408L, (float) (-1079574525L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.07957453E9f) + "'", float2 == (-1.07957453E9f));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.util.Localizable localizable1 = null;
        org.apache.commons.math.exception.util.Localizable localizable3 = null;
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException4 = new org.apache.commons.math.exception.MathArithmeticException();
        java.lang.Throwable[] throwableArray5 = mathArithmeticException4.getSuppressed();
        org.apache.commons.math.exception.MathArithmeticException mathArithmeticException6 = new org.apache.commons.math.exception.MathArithmeticException(localizable3, (java.lang.Object[]) throwableArray5);
        org.apache.commons.math.exception.NotFiniteNumberException notFiniteNumberException7 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number) (byte) 10, (java.lang.Object[]) throwableArray5);
        org.apache.commons.math.exception.MathIllegalArgumentException mathIllegalArgumentException8 = new org.apache.commons.math.exception.MathIllegalArgumentException(localizable1, (java.lang.Object[]) throwableArray5);
        org.apache.commons.math.exception.MathIllegalArgumentException mathIllegalArgumentException9 = new org.apache.commons.math.exception.MathIllegalArgumentException(localizable0, (java.lang.Object[]) throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        boolean boolean5 = complex4.isNaN();
        boolean boolean6 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex7 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex8 = complex0.cosh();
        double double9 = complex0.abs();
        boolean boolean10 = complex0.isInfinite();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField11 = complex0.getField();
        org.apache.commons.math.complex.Complex complex12 = complex0.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complexField11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
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
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) (short) 100, (java.lang.Number) 0.16644599640410362d, true);
        java.lang.Number number4 = numberIsTooLargeException3.getMax();
        boolean boolean5 = numberIsTooLargeException3.getBoundIsAllowed();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext6 = numberIsTooLargeException3.getContext();
        org.apache.commons.math.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.0f);
        boolean boolean9 = notPositiveException8.getBoundIsAllowed();
        java.lang.Number number10 = notPositiveException8.getMin();
        java.lang.Throwable throwable11 = notPositiveException8.getException();
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException8);
        java.lang.Number number13 = notPositiveException8.getMin();
        java.lang.Throwable throwable14 = notPositiveException8.getException();
        java.lang.Throwable throwable15 = notPositiveException8.getException();
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.16644599640410362d + "'", number4, 0.16644599640410362d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(exceptionContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 0 + "'", number10, 0);
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable11.toString(), "org.apache.commons.math.exception.NotPositiveException: 1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0 + "'", number13, 0);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable14.toString(), "org.apache.commons.math.exception.NotPositiveException: 1 is smaller than the minimum (0)");
        org.junit.Assert.assertNotNull(throwable15);
        org.junit.Assert.assertEquals(throwable15.getLocalizedMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable15.getMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable15.toString(), "org.apache.commons.math.exception.NotPositiveException: 1 is smaller than the minimum (0)");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        org.apache.commons.math.complex.Complex complex19 = complex14.multiply((double) (short) 0);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean22 = complex20.equals((java.lang.Object) '#');
        double double23 = complex20.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex20.createComplex((double) 52.0f, 145.14131045295133d);
        org.apache.commons.math.complex.Complex complex27 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex19.divide(complex20);
        org.apache.commons.math.complex.Complex complex29 = complex10.add(complex19);
        org.apache.commons.math.exception.util.Localizable localizable30 = null;
        java.lang.Number number32 = null;
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException34 = new org.apache.commons.math.exception.NumberIsTooLargeException(localizable30, (java.lang.Number) (short) 1, number32, true);
        boolean boolean35 = complex10.equals((java.lang.Object) numberIsTooLargeException34);
        org.apache.commons.math.complex.Complex complex37 = complex10.subtract((double) 9.536743E-7f);
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
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(complex37);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean2 = complex0.equals((java.lang.Object) '#');
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) 52.0f, 145.14131045295133d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (byte) 10);
        org.apache.commons.math.complex.Complex complex9 = complex6.log();
        org.apache.commons.math.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complexList8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-37592991), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 0, n = -37,592,991");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex(4.99335807E8d, (-6.14337407855724E9d));
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean8 = complex6.equals((java.lang.Object) '#');
        double double9 = complex6.getArgument();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean12 = complex10.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex10.multiply(complex15);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex19 = complex17.add(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex19.add(0.0d);
        org.apache.commons.math.complex.Complex complex22 = complex19.negate();
        org.apache.commons.math.complex.Complex complex23 = complex6.multiply(complex22);
        org.apache.commons.math.complex.ComplexField complexField24 = complex22.getField();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex25.pow(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex28.pow(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex28);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean34 = complex32.equals((java.lang.Object) '#');
        double double35 = complex32.getArgument();
        org.apache.commons.math.complex.Complex complex36 = complex26.add(complex32);
        org.apache.commons.math.complex.Complex complex37 = complex36.sinh();
        double double38 = complex37.getReal();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex40 = complex37.divide(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex22.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex40.tan();
        org.apache.commons.math.complex.Complex complex43 = complex2.multiply(complex40);
        org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object) complex43);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complexField24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 3.626860407847019d + "'", double38 == 3.626860407847019d);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        float float1 = org.apache.commons.math.util.FastMath.nextUp((float) (-7834201334447387163L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-7.8342007E18f) + "'", float1 == (-7.8342007E18f));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = complex2.log();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex9.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex7.divide(complex9);
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex15 = complex12.subtract(3.626860407847019d);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex12.divide(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex5.subtract(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complexField13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        org.apache.commons.math.complex.Complex complex17 = complex14.asin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex18.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex20.subtract(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex17.add(complex23);
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
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
        double double12 = complex7.getArgument();
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
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1752011936438014d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1752011936438014d + "'", double2 == 1.1752011936438014d);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        org.apache.commons.math.complex.Complex complex25 = complex23.exp();
        org.apache.commons.math.complex.Complex complex26 = complex25.conjugate();
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
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        long long1 = org.apache.commons.math.util.FastMath.round((-640.0d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-640L) + "'", long1 == (-640L));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        org.apache.commons.math.complex.ComplexField complexField31 = complex29.getField();
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
        org.junit.Assert.assertNotNull(complexField31);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        int int2 = org.apache.commons.math.util.FastMath.max(1079574528, 140);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1079574528 + "'", int2 == 1079574528);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
        org.apache.commons.math.complex.Complex complex12 = complex1.sqrt();
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
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(1.2533141373155001d);
        org.junit.Assert.assertNotNull(complex1);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) (short) 100, (java.lang.Number) 0.16644599640410362d, true);
        java.lang.Number number4 = numberIsTooLargeException3.getMax();
        boolean boolean5 = numberIsTooLargeException3.getBoundIsAllowed();
        org.apache.commons.math.exception.util.ExceptionContext exceptionContext6 = numberIsTooLargeException3.getContext();
        org.apache.commons.math.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.0f);
        boolean boolean9 = notPositiveException8.getBoundIsAllowed();
        java.lang.Number number10 = notPositiveException8.getMin();
        java.lang.Throwable throwable11 = notPositiveException8.getException();
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException8);
        java.lang.Number number13 = notPositiveException8.getMin();
        boolean boolean14 = notPositiveException8.getBoundIsAllowed();
        java.lang.Number number15 = notPositiveException8.getMin();
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.16644599640410362d + "'", number4, 0.16644599640410362d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(exceptionContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 0 + "'", number10, 0);
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable11.toString(), "org.apache.commons.math.exception.NotPositiveException: 1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0 + "'", number13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 0 + "'", number15, 0);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex23.pow(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex22.pow(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean32 = complex30.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt();
        org.apache.commons.math.complex.Complex complex37 = complex30.multiply(complex35);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex39 = complex37.add(complex38);
        org.apache.commons.math.complex.Complex complex41 = complex39.add(0.0d);
        org.apache.commons.math.complex.Complex complex42 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex43 = complex28.add(complex41);
        boolean boolean44 = complex28.isInfinite();
        org.apache.commons.math.complex.Complex complex45 = complex15.add(complex28);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex46.pow(complex47);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex49.pow(complex50);
        org.apache.commons.math.complex.Complex complex52 = complex47.divide(complex49);
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean55 = complex53.equals((java.lang.Object) '#');
        double double56 = complex53.getArgument();
        org.apache.commons.math.complex.Complex complex57 = complex47.add(complex53);
        org.apache.commons.math.complex.Complex complex58 = complex57.sinh();
        org.apache.commons.math.complex.Complex complex60 = complex58.divide((-0.6799280044513404d));
        org.apache.commons.math.complex.Complex complex61 = complex15.subtract(complex58);
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
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        long long2 = org.apache.commons.math.util.MathUtils.lcm(3628832L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex9 = complex5.createComplex((double) (-32), (double) (-1370015649));
        org.apache.commons.math.complex.Complex complex10 = complex9.tan();
        org.apache.commons.math.complex.ComplexField complexField11 = complex9.getField();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complexField11);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        double double1 = org.apache.commons.math.util.FastMath.sin((-6.314831475059969d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03164088597781577d) + "'", double1 == (-0.03164088597781577d));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        org.apache.commons.math.complex.Complex complex18 = complex13.createComplex(100.19719765344917d, (double) 0.0f);
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
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.math.exception.util.Localizable localizable0 = null;
        org.apache.commons.math.exception.DimensionMismatchException dimensionMismatchException3 = new org.apache.commons.math.exception.DimensionMismatchException(localizable0, 960, 208550721);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(1.0E-8d, 0.7853981633974483d);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        int int2 = org.apache.commons.math.util.FastMath.max(39062500, 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39062500 + "'", int2 == 39062500);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        java.lang.String str5 = complex4.toString();
        org.apache.commons.math.complex.ComplexField complexField6 = complex4.getField();
        org.apache.commons.math.complex.Complex complex7 = complex4.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(1.557407724654902, 0.0)" + "'", str5, "(1.557407724654902, 0.0)");
        org.junit.Assert.assertNotNull(complexField6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        float float2 = org.apache.commons.math.util.FastMath.nextAfter((float) 208550721, (double) 53495558234L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.08550736E8f + "'", float2 == 2.08550736E8f);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.0d, 10.000000000000002d);
        double double3 = complex2.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex2.sin();
        java.lang.Object obj5 = complex4.readResolve();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.5707963267948966d + "'", double3 == 1.5707963267948966d);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "(0.0, 11013.232874703412)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "(0.0, 11013.232874703412)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "(0.0, 11013.232874703412)");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.math.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number) 0.0d, (java.lang.Number) 6.3230649767291355E9d, true);
        org.apache.commons.math.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number) 1.5667262027409901E-19d);
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException5);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        double double8 = org.apache.commons.math.util.MathUtils.linearCombination((double) (-128.0f), 2.8844991406148166d, (double) 6382736168262828673L, 1.2418666067481388d, (double) (-1072692287), (double) 42, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.9265068619961006E18d + "'", double8 == 7.9265068619961006E18d);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1410065408, 140);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1410065548 + "'", int2 == 1410065548);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex1.divide(complex3);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
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
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(21.835311912875365d, 0, (-37592992));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
        org.apache.commons.math.complex.Complex complex22 = complex6.tan();
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
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        int int1 = org.apache.commons.math.util.FastMath.getExponent((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.valueOf(1.7031839360032603E-108d);
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
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
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
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex13.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean30 = complex28.equals((java.lang.Object) '#');
        double double31 = complex28.getArgument();
        org.apache.commons.math.complex.Complex complex34 = complex28.createComplex((double) 52.0f, 145.14131045295133d);
        java.util.List<org.apache.commons.math.complex.Complex> complexList36 = complex34.nthRoot((int) (byte) 10);
        org.apache.commons.math.complex.Complex complex37 = complex34.log();
        org.apache.commons.math.complex.Complex complex38 = complex27.subtract(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex1.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean42 = complex40.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex44 = complex43.sqrt1z();
        boolean boolean45 = complex44.isNaN();
        boolean boolean46 = complex44.isInfinite();
        org.apache.commons.math.complex.Complex complex47 = complex40.multiply(complex44);
        org.apache.commons.math.complex.Complex complex48 = complex1.divide(complex47);
        org.junit.Assert.assertNotNull(complex1);
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
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complexList36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-3.22561216E8f), 1.41006554E9f, 960);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
        org.apache.commons.math.complex.Complex complex11 = complex10.log();
        org.apache.commons.math.complex.Complex complex13 = complex11.pow(23.718998110500404d);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex19.pow(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex17.divide(complex19);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean25 = complex23.equals((java.lang.Object) '#');
        double double26 = complex23.getArgument();
        org.apache.commons.math.complex.Complex complex27 = complex17.add(complex23);
        org.apache.commons.math.complex.Complex complex28 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex30 = complex28.divide((-0.6799280044513404d));
        org.apache.commons.math.complex.Complex complex31 = complex28.negate();
        org.apache.commons.math.complex.Complex complex32 = complex31.log();
        org.apache.commons.math.complex.Complex complex33 = complex14.add(complex32);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1079574559);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex21 = complex17.createComplex(0.0d, 1.7182818284590453d);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean24 = complex22.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex25.pow(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex22.multiply(complex27);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex31 = complex29.add(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex29.exp();
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt();
        double double34 = complex32.getArgument();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex35.pow(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField39 = complex38.getField();
        org.apache.commons.math.complex.ComplexField complexField40 = complex38.getField();
        org.apache.commons.math.complex.Complex complex41 = complex32.subtract(complex38);
        org.apache.commons.math.complex.Complex complex42 = complex21.add(complex38);
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
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complexField39);
        org.junit.Assert.assertNotNull(complexField40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        int[] intArray4 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray6 = org.apache.commons.math.util.MathUtils.copyOf(intArray4, (int) (short) 10);
        int[] intArray7 = org.apache.commons.math.util.MathUtils.copyOf(intArray4);
        int[] intArray9 = new int[] { 1520286529 };
        int[] intArray14 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray16 = org.apache.commons.math.util.MathUtils.copyOf(intArray14, (int) (short) 10);
        int[] intArray17 = org.apache.commons.math.util.MathUtils.copyOf(intArray14);
        int[] intArray22 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray24 = org.apache.commons.math.util.MathUtils.copyOf(intArray22, (int) (short) 10);
        int int25 = org.apache.commons.math.util.MathUtils.distance1(intArray14, intArray22);
        int int26 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray22);
        int[] intArray28 = new int[] { 1520286529 };
        int[] intArray33 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray35 = org.apache.commons.math.util.MathUtils.copyOf(intArray33, (int) (short) 10);
        int[] intArray36 = org.apache.commons.math.util.MathUtils.copyOf(intArray33);
        int[] intArray41 = new int[] { 1520286529, (byte) -1, (short) -1, (short) 0 };
        int[] intArray43 = org.apache.commons.math.util.MathUtils.copyOf(intArray41, (int) (short) 10);
        int int44 = org.apache.commons.math.util.MathUtils.distance1(intArray33, intArray41);
        int int45 = org.apache.commons.math.util.MathUtils.distanceInf(intArray28, intArray41);
        int[] intArray47 = org.apache.commons.math.util.MathUtils.copyOf(intArray41, (int) ' ');
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray47);
        int[] intArray53 = new int[] { (-1069547520), 4, (-127), 10 };
        int[] intArray54 = org.apache.commons.math.util.MathUtils.copyOf(intArray53);
        int int55 = org.apache.commons.math.util.MathUtils.distance1(intArray22, intArray53);
        int int56 = org.apache.commons.math.util.MathUtils.distance1(intArray4, intArray53);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1520286529]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1520286529]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1520286529, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1520286529, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1069547520, 4, -127, 10]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1069547520, 4, -127, 10]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1705133388 + "'", int55 == 1705133388);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1705133388 + "'", int56 == 1705133388);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean3 = complex1.equals((java.lang.Object) '#');
        double double4 = complex1.getArgument();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex8 = complex6.pow((double) 6382736168262829056L);
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex(11013.232920103324d);
        double double11 = complex10.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex6.pow(complex10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complexField5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.math.complex.Complex complex1 = new org.apache.commons.math.complex.Complex(3.626860407847019d);
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
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
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
        org.apache.commons.math.complex.Complex complex26 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex13.multiply(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex1.multiply(complex13);
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
        org.junit.Assert.assertNotNull(complex28);
    }
}


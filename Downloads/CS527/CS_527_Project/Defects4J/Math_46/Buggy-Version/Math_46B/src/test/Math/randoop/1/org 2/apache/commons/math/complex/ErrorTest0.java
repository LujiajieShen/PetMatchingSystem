package org.apache.commons.math.complex;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        boolean boolean7 = complex5.equals((java.lang.Object) '#');
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        boolean boolean10 = complex9.isNaN();
        boolean boolean11 = complex9.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex5.multiply(complex9);
        org.apache.commons.math.complex.Complex complex13 = complex5.cosh();
        double double14 = complex5.abs();
        org.apache.commons.math.complex.Complex complex15 = complex2.divide(complex5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex9", complex4.equals(complex9) ? complex4.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        boolean boolean2 = complex1.isNaN();
        boolean boolean3 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex4", complex1.equals(complex4) ? complex1.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = complex0.pow(complex1);
        boolean boolean3 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math.complex.Complex complex5 = complex2.log();
        org.apache.commons.math.Field<org.apache.commons.math.complex.Complex> complexField6 = complex2.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        java.lang.String str15 = complex13.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex14", complex12.equals(complex14) ? complex12.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex5 = complex2.createComplex(4.99335807E8d, (-5.878630512844044E9d));
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt1z();
        boolean boolean8 = complex7.isNaN();
        boolean boolean9 = complex7.isInfinite();
        org.apache.commons.math.complex.Complex complex10 = complex7.asin();
        org.apache.commons.math.complex.Complex complex11 = complex2.multiply(complex7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex10", complex1.equals(complex10) ? complex1.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt1z();
        boolean boolean13 = complex12.isNaN();
        boolean boolean14 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex12.asin();
        org.apache.commons.math.complex.Complex complex17 = complex15.subtract((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex18 = complex9.subtract(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex10", complex4.equals(complex10) ? complex4.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex3.pow(complex4);
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math.complex.Complex complex8 = complex5.log();
        org.apache.commons.math.complex.Complex complex9 = complex2.add(complex8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex7", complex1.equals(complex7) ? complex1.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex1.pow(complex2);
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex0.pow(complex4);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.cos();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex7", complex0.equals(complex7) ? complex0.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        boolean boolean2 = complex1.isNaN();
        boolean boolean3 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex8 = complex4.multiply(3.58351893845611d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex6", complex1.equals(complex6) ? complex1.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt1z();
        boolean boolean2 = complex1.isNaN();
        boolean boolean3 = complex1.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex1.asin();
        org.apache.commons.math.complex.Complex complex6 = complex4.subtract((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex7.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex9.subtract(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex6.pow(complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex4", complex1.equals(complex4) ? complex1.hashCode() == complex4.hashCode() : true);
    }
}


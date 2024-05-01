package org.apache.commons.collections4.keyvalue;

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
        java.lang.CharSequence[] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        java.lang.String str22 = strComparableMultiKey13.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MultiKey[, hi!]" + "'", str22, "MultiKey[, hi!]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "hi!", strComparable4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        boolean boolean6 = strComparableMultiKey2.equals((java.lang.Object) (-1));
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "MultiKey[, hi!]", "", "", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray11, true);
        boolean boolean14 = strComparableMultiKey2.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        int int4 = strComparableMultiKey3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey2.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMultiKey2.getKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", strComparable1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        boolean boolean6 = strComparableMultiKey4.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey7);
        int int9 = strComparableMultiKey7.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey7.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey9.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        java.lang.Class<?> wildcardClass16 = strComparableMultiKey14.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        java.lang.Class<?> wildcardClass21 = strComparableMultiKey19.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int26 = strComparableMultiKey25.size();
        java.lang.Comparable<java.lang.String> strComparable28 = strComparableMultiKey25.getKey(0);
        java.lang.Class<?> wildcardClass29 = strComparableMultiKey25.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableMultiKey32.size();
        java.lang.Class<?> wildcardClass34 = strComparableMultiKey32.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int38 = strComparableMultiKey37.size();
        java.lang.Class<?> wildcardClass39 = strComparableMultiKey37.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int43 = strComparableMultiKey42.size();
        java.lang.Class<?> wildcardClass44 = strComparableMultiKey42.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass29, (java.lang.reflect.GenericDeclaration) wildcardClass34, (java.lang.reflect.GenericDeclaration) wildcardClass39, (java.lang.reflect.GenericDeclaration) wildcardClass44);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int49 = strComparableMultiKey48.size();
        java.lang.Class<?> wildcardClass50 = strComparableMultiKey48.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int54 = strComparableMultiKey53.size();
        java.lang.Comparable<java.lang.String> strComparable56 = strComparableMultiKey53.getKey(0);
        java.lang.Class<?> wildcardClass57 = strComparableMultiKey53.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass29, (java.lang.reflect.GenericDeclaration) wildcardClass50, (java.lang.reflect.GenericDeclaration) wildcardClass57);
        java.lang.Class<?> wildcardClass59 = genericDeclarationMultiKey58.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + strComparable28 + "' != '" + "" + "'", strComparable28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertEquals("'" + strComparable56 + "' != '" + "" + "'", strComparable56, "");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        java.lang.Object obj5 = null;
        boolean boolean6 = strComparableMultiKey2.equals(obj5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMultiKey2.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMultiKey8.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable25 = strComparableMultiKey8.getKey(0);
        java.lang.Class<?> wildcardClass26 = strComparable25.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable25 + "' != '" + "" + "'", strComparable25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey9.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        java.lang.Class<?> wildcardClass16 = strComparableMultiKey14.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        java.lang.Class<?> wildcardClass21 = strComparableMultiKey19.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass21;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray25);
        java.lang.Class<?> wildcardClass29 = wildcardClassArray25.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey9.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        java.lang.Class<?> wildcardClass16 = strComparableMultiKey14.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        java.lang.Class<?> wildcardClass21 = strComparableMultiKey19.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int26 = strComparableMultiKey25.size();
        java.lang.Class<?> wildcardClass27 = strComparableMultiKey25.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass11, (java.lang.reflect.Type) wildcardClass27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.String str6 = strComparableMultiKey2.toString();
        int int7 = strComparableMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[, hi!]" + "'", str6, "MultiKey[, hi!]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        int int22 = strComparableMultiKey8.size();
        java.lang.String str23 = strComparableMultiKey8.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable25 = strComparableMultiKey8.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiKey[, hi!]" + "'", str23, "MultiKey[, hi!]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        boolean boolean11 = strComparableMultiKey2.equals((java.lang.Object) ' ');
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMultiKey2.getKey(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        boolean boolean14 = strComparableMultiKey5.equals((java.lang.Object) strComparableMultiKey13);
        java.lang.Class<?> wildcardClass15 = strComparableMultiKey13.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        java.lang.Class<?> wildcardClass22 = strComparableMultiKey8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray0, false);
        org.junit.Assert.assertNotNull(typeArray0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMultiKey12.size();
        int int14 = strComparableMultiKey12.size();
        boolean boolean16 = strComparableMultiKey12.equals((java.lang.Object) (-1));
        boolean boolean17 = strComparableMultiKey8.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey8.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.reflect.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        java.lang.Class<?> wildcardClass10 = strComparableMultiKey8.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMultiKey8.getKey((int) (byte) 1);
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey29);
        java.lang.Class<?> wildcardClass31 = strComparableMultiKey8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Comparable<java.lang.String>[] strComparableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4, false);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        int int5 = strComparableMultiKey2.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMultiKey2.getKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>(genericDeclarationArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        boolean boolean11 = strComparableMultiKey2.equals((java.lang.Object) ' ');
        int int12 = strComparableMultiKey2.size();
        int int13 = strComparableMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        int int22 = strComparableMultiKey13.size();
        java.lang.Object obj23 = null;
        boolean boolean24 = strComparableMultiKey13.equals(obj23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable26 = strComparableMultiKey13.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.String[] strArray15 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15, false);
        int int22 = strComparableMultiKey21.size();
        boolean boolean23 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey21);
        int int24 = strComparableMultiKey21.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        boolean boolean6 = strComparableMultiKey2.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass7 = strComparableMultiKey2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        boolean boolean11 = strComparableMultiKey2.equals((java.lang.Object) ' ');
        int int12 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray13, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey10.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9, false);
        int int14 = strComparableMultiKey13.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = strComparableMultiKey13.getKeys();
        boolean boolean16 = strComparableMultiKey4.equals((java.lang.Object) strComparableMultiKey13);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        int int6 = strComparableMultiKey5.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey8.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        int int16 = strComparableMultiKey14.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        int int21 = strComparableMultiKey19.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = strComparableMultiKey24.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey19, strComparableMultiKey24);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey14, strComparableMultiKey19);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableMultiKey14.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable31 = strComparableMultiKey14.getKey(0);
        boolean boolean32 = strComparableMultiKey5.equals((java.lang.Object) strComparableMultiKey14);
        java.lang.String str33 = strComparableMultiKey14.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + strComparable29 + "' != '" + "hi!" + "'", strComparable29, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable31 + "' != '" + "" + "'", strComparable31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MultiKey[, hi!]" + "'", str33, "MultiKey[, hi!]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[, hi!]", "", "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "", strComparable4);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.Comparable[][] comparableArray37 = new java.lang.Comparable[6][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray38 = (java.lang.Comparable<java.lang.String>[][]) comparableArray37;
        strComparableArray38[0] = strArray5;
        strComparableArray38[1] = strArray11;
        strComparableArray38[2] = strArray17;
        strComparableArray38[3] = strArray23;
        strComparableArray38[4] = strArray29;
        strComparableArray38[5] = strArray35;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>(strComparableArray38);
        java.lang.Class<?> wildcardClass52 = strComparableArray38.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(comparableArray37);
        org.junit.Assert.assertNotNull(strComparableArray38);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMultiKey2.getKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey7);
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = null; // flaky: strComparableMultiKey2.getKeys();
        java.lang.String str10 = strComparableMultiKey2.toString();
        int int11 = strComparableMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[, hi!]" + "'", str10, "MultiKey[, hi!]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, true);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, strComparable1, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMultiKey12.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMultiKey17.size();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableMultiKey17.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableMultiKey23.size();
        int int25 = strComparableMultiKey23.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int29 = strComparableMultiKey28.size();
        int int30 = strComparableMultiKey28.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int34 = strComparableMultiKey33.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey28, strComparableMultiKey33);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey17, strComparableMultiKey23, strComparableMultiKey28);
        boolean boolean37 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey28);
        java.lang.Comparable<java.lang.String>[] strComparableArray38 = null; // flaky: strComparableMultiKey28.getKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray38);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey8.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        int int16 = strComparableMultiKey14.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        int int21 = strComparableMultiKey19.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = strComparableMultiKey24.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey19, strComparableMultiKey24);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey14, strComparableMultiKey19);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableMultiKey14.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable31 = strComparableMultiKey14.getKey(0);
        boolean boolean32 = strComparableMultiKey5.equals((java.lang.Object) strComparableMultiKey14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable34 = strComparableMultiKey14.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + strComparable29 + "' != '" + "hi!" + "'", strComparable29, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable31 + "' != '" + "" + "'", strComparable31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        int int5 = strComparableMultiKey4.size();
        int int6 = strComparableMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", strComparable1, (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey3.getKey(0);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey3.getKeys();
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", strComparable5, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMultiKey8.getKey((int) (byte) 1);
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int34 = strComparableMultiKey33.size();
        int int35 = strComparableMultiKey33.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int39 = strComparableMultiKey38.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey33, strComparableMultiKey38);
        java.lang.Comparable<java.lang.String>[] strComparableArray41 = null; // flaky: strComparableMultiKey33.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray41);
        boolean boolean43 = strComparableMultiKey8.equals((java.lang.Object) strComparableArray41);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int47 = strComparableMultiKey46.size();
        java.lang.Comparable<java.lang.String> strComparable49 = strComparableMultiKey46.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int53 = strComparableMultiKey52.size();
        int int54 = strComparableMultiKey52.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int58 = strComparableMultiKey57.size();
        int int59 = strComparableMultiKey57.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int63 = strComparableMultiKey62.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey57, strComparableMultiKey62);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey46, strComparableMultiKey52, strComparableMultiKey57);
        int int66 = strComparableMultiKey52.size();
        java.lang.String str67 = strComparableMultiKey52.toString();
        boolean boolean68 = strComparableMultiKey8.equals((java.lang.Object) str67);
        int int69 = strComparableMultiKey8.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertEquals("'" + strComparable49 + "' != '" + "hi!" + "'", strComparable49, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "MultiKey[, hi!]" + "'", str67, "MultiKey[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMultiKey2.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMultiKey8.equals((java.lang.Object) strComparableMultiKey13);
        int int15 = strComparableMultiKey13.size();
        boolean boolean16 = strComparableMultiKey5.equals((java.lang.Object) int15);
        java.lang.Comparable<java.lang.String>[] strComparableArray17 = null; // flaky: strComparableMultiKey5.getKeys();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey9.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        java.lang.Class<?> wildcardClass16 = strComparableMultiKey14.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        java.lang.Class<?> wildcardClass21 = strComparableMultiKey19.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int26 = strComparableMultiKey25.size();
        java.lang.Comparable<java.lang.String> strComparable28 = strComparableMultiKey25.getKey(0);
        java.lang.Class<?> wildcardClass29 = strComparableMultiKey25.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableMultiKey32.size();
        java.lang.Class<?> wildcardClass34 = strComparableMultiKey32.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int38 = strComparableMultiKey37.size();
        java.lang.Class<?> wildcardClass39 = strComparableMultiKey37.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int43 = strComparableMultiKey42.size();
        java.lang.Class<?> wildcardClass44 = strComparableMultiKey42.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass29, (java.lang.reflect.GenericDeclaration) wildcardClass34, (java.lang.reflect.GenericDeclaration) wildcardClass39, (java.lang.reflect.GenericDeclaration) wildcardClass44);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass16, (java.lang.reflect.AnnotatedElement) wildcardClass34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + strComparable28 + "' != '" + "" + "'", strComparable28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMultiKey6.getKey((int) (short) 0);
        int int9 = strComparableMultiKey6.size();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "MultiKey[, hi!]" + "'", strComparable8, "MultiKey[, hi!]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey8.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        int int16 = strComparableMultiKey14.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        int int21 = strComparableMultiKey19.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = strComparableMultiKey24.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey19, strComparableMultiKey24);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey14, strComparableMultiKey19);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableMultiKey14.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable31 = strComparableMultiKey14.getKey(0);
        boolean boolean32 = strComparableMultiKey5.equals((java.lang.Object) strComparableMultiKey14);
        java.lang.Comparable<java.lang.String>[] strComparableArray33 = null; // flaky: strComparableMultiKey5.getKeys();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + strComparable29 + "' != '" + "hi!" + "'", strComparable29, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable31 + "' != '" + "" + "'", strComparable31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray33);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        boolean boolean6 = strComparableMultiKey2.equals((java.lang.Object) (-1));
        int int7 = strComparableMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        java.lang.String str3 = strComparableMultiKey2.toString();
        int int4 = strComparableMultiKey2.size();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]" + "'", str3, "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass4 = strComparableMultiKey3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "MultiKey[, hi!]", "MultiKey[, hi!]", "hi!", "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.Comparable[][] comparableArray37 = new java.lang.Comparable[6][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray38 = (java.lang.Comparable<java.lang.String>[][]) comparableArray37;
        strComparableArray38[0] = strArray5;
        strComparableArray38[1] = strArray11;
        strComparableArray38[2] = strArray17;
        strComparableArray38[3] = strArray23;
        strComparableArray38[4] = strArray29;
        strComparableArray38[5] = strArray35;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>(strComparableArray38);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>(strComparableArray38);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>(strComparableArray38, false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(comparableArray37);
        org.junit.Assert.assertNotNull(strComparableArray38);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMultiKey8.getKey((int) (byte) 1);
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int34 = strComparableMultiKey33.size();
        int int35 = strComparableMultiKey33.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int39 = strComparableMultiKey38.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey33, strComparableMultiKey38);
        java.lang.Comparable<java.lang.String>[] strComparableArray41 = null; // flaky: strComparableMultiKey33.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray41);
        boolean boolean43 = strComparableMultiKey8.equals((java.lang.Object) strComparableArray41);
        java.lang.String[] strArray48 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray48);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray48);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray48, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) strArray48, (java.lang.Object) 'a');
        boolean boolean57 = strComparableMultiKey8.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String[] strArray2 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray8 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray11 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.String[] strArray17 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]" };
        java.lang.Comparable[][] comparableArray19 = new java.lang.Comparable[6][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray20 = (java.lang.Comparable<java.lang.String>[][]) comparableArray19;
        strComparableArray20[0] = strArray2;
        strComparableArray20[1] = strArray5;
        strComparableArray20[2] = strArray8;
        strComparableArray20[3] = strArray11;
        strComparableArray20[4] = strArray14;
        strComparableArray20[5] = strArray17;
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.lang.Comparable[][] comparableArray40 = new java.lang.Comparable[6][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray41 = (java.lang.Comparable<java.lang.String>[][]) comparableArray40;
        strComparableArray41[0] = strArray33;
        strComparableArray41[1] = strArray34;
        strComparableArray41[2] = strArray35;
        strComparableArray41[3] = strArray36;
        strComparableArray41[4] = strArray37;
        strComparableArray41[5] = strArray38;
        java.lang.String[] strArray55 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray57 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray59 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.String[] strArray61 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]" };
        java.lang.Comparable[][] comparableArray63 = new java.lang.Comparable[4][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray64 = (java.lang.Comparable<java.lang.String>[][]) comparableArray63;
        strComparableArray64[0] = strArray55;
        strComparableArray64[1] = strArray57;
        strComparableArray64[2] = strArray59;
        strComparableArray64[3] = strArray61;
        java.lang.String[][] strArray73 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray73);
        java.lang.String[][] strArray75 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey76 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray75);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey77 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray20, strComparableArray41, strComparableArray64, (java.lang.Comparable<java.lang.String>[][]) strArray73, (java.lang.Comparable<java.lang.String>[][]) strArray75);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(comparableArray19);
        org.junit.Assert.assertNotNull(strComparableArray20);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(comparableArray40);
        org.junit.Assert.assertNotNull(strComparableArray41);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(comparableArray63);
        org.junit.Assert.assertNotNull(strComparableArray64);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray75);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        boolean boolean7 = strComparableMultiKey5.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = strComparableMultiKey2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        int int5 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey9);
        java.lang.Comparable<java.lang.String>[] strComparableArray11 = null; // flaky: strComparableMultiKey9.getKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]" + "'", str6, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]", strComparable2, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.Comparable<java.lang.String>[] strComparableArray11 = strComparableMultiKey10.getKeys();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strComparableArray11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        int int22 = strComparableMultiKey13.size();
        java.lang.String str23 = strComparableMultiKey13.toString();
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28, false);
        boolean boolean34 = strComparableMultiKey13.equals((java.lang.Object) false);
        java.lang.Object obj35 = null;
        boolean boolean36 = strComparableMultiKey13.equals(obj35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiKey[, hi!]" + "'", str23, "MultiKey[, hi!]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.String str10 = strComparableMultiKey9.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str10, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
        java.lang.String[] strArray7 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray7, false);
        boolean boolean11 = strComparableMultiKey2.equals((java.lang.Object) strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, hi!]", (java.lang.CharSequence) "MultiKey[, hi!, MultiKey[, hi!], null, ]", charSequence2, (java.lang.CharSequence) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Comparable<java.lang.String>[] strComparableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMultiKey10.getKey(3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "MultiKey[, hi!]" + "'", strComparable12, "MultiKey[, hi!]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey7);
        boolean boolean11 = strComparableMultiKey2.equals((java.lang.Object) ' ');
        int int12 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = null; // flaky: strComparableMultiKey2.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray13, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "", "hi!", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" };
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray22);
        java.lang.String[] strArray31 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, false);
        int int36 = strComparableMultiKey35.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray37 = strComparableMultiKey35.getKeys();
        java.lang.String[] strArray42 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray42);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        java.lang.String[] strArray59 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey67 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray42, (java.lang.CharSequence[]) strArray49, (java.lang.CharSequence[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey68 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[]) strArray5, (java.lang.Comparable<java.lang.String>[]) strArray10, (java.lang.Comparable<java.lang.String>[]) strArray22, strComparableArray37, (java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey70 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22, true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(strComparableArray37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray59);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMultiKey2.getKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey5.getKeys();
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        int int22 = strComparableMultiKey13.size();
        int int23 = strComparableMultiKey13.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        int int4 = strComparableMultiKey2.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMultiKey2.equals((java.lang.Object) strComparableMultiKey7);
        java.lang.String str9 = strComparableMultiKey2.toString();
        java.lang.Object obj10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray26);
        int int31 = strComparableMultiKey30.size();
        java.lang.String str32 = strComparableMultiKey30.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) str9, obj10, (java.lang.Object) strArray15, (java.lang.Object) str32, (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, hi!]" + "'", str9, "MultiKey[, hi!]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str32, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        java.lang.String str6 = strComparableMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]" + "'", str6, "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey5.getKeys();
        java.lang.String str7 = strComparableMultiKey5.toString();
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, hi!, MultiKey[, hi!], null, ]" + "'", str7, "MultiKey[, hi!, MultiKey[, hi!], null, ]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", strComparable3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], MultiKey[, hi!, MultiKey[, hi!], null, ]]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        java.lang.String str10 = strComparableMultiKey8.toString();
        java.lang.String str11 = strComparableMultiKey8.toString();
        java.lang.Comparable<java.lang.String>[] strComparableArray12 = strComparableMultiKey8.getKeys();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str10, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str11, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertNotNull(strComparableArray12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMultiKey4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, true);
        java.lang.Comparable<java.lang.String>[] strComparableArray9 = strComparableMultiKey8.getKeys();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strComparableArray9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        java.lang.String str10 = strComparableMultiKey8.toString();
        boolean boolean12 = strComparableMultiKey8.equals((java.lang.Object) false);
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = strComparableMultiKey8.getKeys();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str10, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableArray13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMultiKey5.getKey(1);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "" + "'", strComparable7, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMultiKey2.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        int int22 = strComparableMultiKey13.size();
        java.lang.String str23 = strComparableMultiKey13.toString();
        int int24 = strComparableMultiKey13.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiKey[, hi!]" + "'", str23, "MultiKey[, hi!]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        java.lang.CharSequence[][] charSequenceArray35 = new java.lang.CharSequence[][] { charSequenceArray6, charSequenceArray13, charSequenceArray20, charSequenceArray27, charSequenceArray34 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray35, false);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray40 = new java.lang.CharSequence[][] { charSequenceArray39 };
        java.lang.String[][] strArray41 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray41);
        java.lang.String[][] strArray43 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray43);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray50 = new java.lang.CharSequence[][] { charSequenceArray45, charSequenceArray46, charSequenceArray47, charSequenceArray48, charSequenceArray49 };
        java.lang.String[][] strArray51 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray51);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray40, (java.lang.CharSequence[][]) strArray41, (java.lang.CharSequence[][]) strArray43, charSequenceArray50, (java.lang.CharSequence[][]) strArray51);
        java.lang.String[][] strArray54 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray54);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray35, (java.lang.CharSequence[][]) strArray51, (java.lang.CharSequence[][]) strArray54);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray54);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMultiKey4.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMultiKey8.getKey(0);
        java.lang.Comparable<java.lang.String>[] strComparableArray12 = null; // flaky: strComparableMultiKey8.getKeys();
        java.lang.String[] strArray17 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray17, false);
        int int22 = strComparableMultiKey21.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray23 = strComparableMultiKey21.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) strComparableMultiKey4, (java.lang.Object) strComparableMultiKey8, (java.lang.Object) strComparableArray23);
        java.lang.Class<?> wildcardClass25 = strComparableMultiKey4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
// flaky:         org.junit.Assert.assertNotNull(strComparableArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(strComparableArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMultiKey10.size();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMultiKey10.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMultiKey16.size();
        int int18 = strComparableMultiKey16.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableMultiKey21.size();
        int int23 = strComparableMultiKey21.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int27 = strComparableMultiKey26.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey21, strComparableMultiKey26);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey10, strComparableMultiKey16, strComparableMultiKey21);
        java.lang.Comparable<java.lang.String> strComparable31 = strComparableMultiKey16.getKey((int) (byte) 1);
        boolean boolean32 = strComparableMultiKey7.equals((java.lang.Object) strComparableMultiKey16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertEquals("'" + strComparable31 + "' != '" + "hi!" + "'", strComparable31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", strComparable1, (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        java.lang.Object obj7 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Object) 100L, obj7, (java.lang.Object) 10.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "", "hi!", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" };
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray22);
        java.lang.String[] strArray31 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, false);
        int int36 = strComparableMultiKey35.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray37 = strComparableMultiKey35.getKeys();
        java.lang.String[] strArray42 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray42);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        java.lang.String[] strArray59 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey67 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray42, (java.lang.CharSequence[]) strArray49, (java.lang.CharSequence[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey68 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[]) strArray5, (java.lang.Comparable<java.lang.String>[]) strArray10, (java.lang.Comparable<java.lang.String>[]) strArray22, strComparableArray37, (java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey71 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int72 = strComparableMultiKey71.size();
        int int73 = strComparableMultiKey71.size();
        int int74 = strComparableMultiKey71.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey71, strComparableMultiKey78);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey80 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) strComparableArrayMultiKey68, (java.io.Serializable) strComparableMultiKeyMultiKey79);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(strComparableArray37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "", "hi!", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" };
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray22);
        java.lang.String[] strArray31 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray31, false);
        int int36 = strComparableMultiKey35.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray37 = strComparableMultiKey35.getKeys();
        java.lang.String[] strArray42 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray42);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey54 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray49);
        java.lang.String[] strArray59 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey60 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey61 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey64 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray59, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey67 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray42, (java.lang.CharSequence[]) strArray49, (java.lang.CharSequence[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey68 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[]) strArray5, (java.lang.Comparable<java.lang.String>[]) strArray10, (java.lang.Comparable<java.lang.String>[]) strArray22, strComparableArray37, (java.lang.Comparable<java.lang.String>[]) strArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey69 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(strComparableArray37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray59);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray8);
        boolean boolean10 = strComparableMultiKey3.equals((java.lang.Object) strArray8);
        java.lang.String str11 = strComparableMultiKey3.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" + "'", str11, "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray0, false);
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = null; // flaky: strComparableMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray6, false);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" };
        java.lang.Comparable[][] comparableArray13 = new java.lang.Comparable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray14 = (java.lang.Comparable<java.lang.String>[][]) comparableArray13;
        strComparableArray14[0] = strArray3;
        strComparableArray14[1] = strArray7;
        strComparableArray14[2] = strArray11;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" };
        java.lang.String[] strArray28 = new java.lang.String[] { "", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" };
        java.lang.String[] strArray32 = new java.lang.String[] { "", "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" };
        java.lang.Comparable[][] comparableArray34 = new java.lang.Comparable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray35 = (java.lang.Comparable<java.lang.String>[][]) comparableArray34;
        strComparableArray35[0] = strArray24;
        strComparableArray35[1] = strArray28;
        strComparableArray35[2] = strArray32;
        java.lang.Comparable[][][] comparableArray43 = new java.lang.Comparable[2][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray44 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray43;
        strComparableArray44[0] = strComparableArray14;
        strComparableArray44[1] = strComparableArray35;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]> strComparableArrayMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][]>(strComparableArray44);
        java.lang.Comparable[][][] comparableArray51 = new java.lang.Comparable[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray52 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray51;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][][]> strComparableArrayMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[][][]>(strComparableArray44, strComparableArray52);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(comparableArray13);
        org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(comparableArray34);
        org.junit.Assert.assertNotNull(strComparableArray35);
        org.junit.Assert.assertNotNull(comparableArray43);
        org.junit.Assert.assertNotNull(strComparableArray44);
        org.junit.Assert.assertNotNull(comparableArray51);
        org.junit.Assert.assertNotNull(strComparableArray52);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMultiKey7.size();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMultiKey7.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        int int20 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableMultiKey23.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey18, strComparableMultiKey23);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey7, strComparableMultiKey13, strComparableMultiKey18);
        java.lang.Comparable<java.lang.String> strComparable28 = strComparableMultiKey13.getKey((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable30 = strComparableMultiKey13.getKey(0);
        java.lang.Comparable<java.lang.String> strComparable32 = strComparableMultiKey13.getKey(0);
        boolean boolean33 = strComparableMultiKey4.equals((java.lang.Object) strComparableMultiKey13);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + strComparable28 + "' != '" + "hi!" + "'", strComparable28, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable30 + "' != '" + "" + "'", strComparable30, "");
        org.junit.Assert.assertEquals("'" + strComparable32 + "' != '" + "" + "'", strComparable32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!, MultiKey[, hi!], null, ], hi!, MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], hi!, MultiKey[, hi!, MultiKey[, hi!], null, ]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!, MultiKey[, hi!], null, ]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMultiKey6.size();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMultiKey6.getKey(0);
        java.lang.Class<?> wildcardClass10 = strComparableMultiKey6.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        java.lang.Class<?> wildcardClass15 = strComparableMultiKey13.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        java.lang.Class<?> wildcardClass20 = strComparableMultiKey18.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableMultiKey23.size();
        java.lang.Class<?> wildcardClass25 = strComparableMultiKey23.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass10, (java.lang.reflect.GenericDeclaration) wildcardClass15, (java.lang.reflect.GenericDeclaration) wildcardClass20, (java.lang.reflect.GenericDeclaration) wildcardClass25);
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass25;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey36 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int37 = strComparableMultiKey36.size();
        java.lang.Comparable<java.lang.String> strComparable39 = strComparableMultiKey36.getKey(0);
        java.lang.Class<?> wildcardClass40 = strComparableMultiKey36.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int44 = strComparableMultiKey43.size();
        java.lang.Class<?> wildcardClass45 = strComparableMultiKey43.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int49 = strComparableMultiKey48.size();
        java.lang.Class<?> wildcardClass50 = strComparableMultiKey48.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int54 = strComparableMultiKey53.size();
        java.lang.Class<?> wildcardClass55 = strComparableMultiKey53.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass40, (java.lang.reflect.GenericDeclaration) wildcardClass45, (java.lang.reflect.GenericDeclaration) wildcardClass50, (java.lang.reflect.GenericDeclaration) wildcardClass55);
        java.lang.Class[] classArray58 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray59 = (java.lang.Class<?>[]) classArray58;
        wildcardClassArray59[0] = wildcardClass55;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey63 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray59);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int67 = strComparableMultiKey66.size();
        java.lang.Comparable<java.lang.String> strComparable69 = strComparableMultiKey66.getKey(0);
        java.lang.Class<?> wildcardClass70 = strComparableMultiKey66.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int74 = strComparableMultiKey73.size();
        java.lang.Class<?> wildcardClass75 = strComparableMultiKey73.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey78 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int79 = strComparableMultiKey78.size();
        java.lang.Class<?> wildcardClass80 = strComparableMultiKey78.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey83 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int84 = strComparableMultiKey83.size();
        java.lang.Class<?> wildcardClass85 = strComparableMultiKey83.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey86 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass70, (java.lang.reflect.GenericDeclaration) wildcardClass75, (java.lang.reflect.GenericDeclaration) wildcardClass80, (java.lang.reflect.GenericDeclaration) wildcardClass85);
        java.lang.Class[] classArray88 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray89 = (java.lang.Class<?>[]) classArray88;
        wildcardClassArray89[0] = wildcardClass85;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey92 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray89);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey93 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray89);
        java.lang.Class[] classArray95 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray96 = (java.lang.Class<?>[]) classArray95;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]> wildcardClassArrayMultiKey97 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]>(wildcardClassArray29, wildcardClassArray59, wildcardClassArray89, wildcardClassArray96);
        boolean boolean98 = strComparableMultiKey3.equals((java.lang.Object) wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertEquals("'" + strComparable39 + "' != '" + "" + "'", strComparable39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertEquals("'" + strComparable69 + "' != '" + "" + "'", strComparable69, "");
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2 + "'", int84 == 2);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(classArray88);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(classArray95);
        org.junit.Assert.assertNotNull(wildcardClassArray96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey(0);
        java.lang.Class<?> wildcardClass6 = strComparableMultiKey2.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMultiKey9.size();
        java.lang.Class<?> wildcardClass11 = strComparableMultiKey9.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMultiKey14.size();
        java.lang.Class<?> wildcardClass16 = strComparableMultiKey14.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMultiKey19.size();
        java.lang.Class<?> wildcardClass21 = strComparableMultiKey19.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.reflect.GenericDeclaration) wildcardClass11, (java.lang.reflect.GenericDeclaration) wildcardClass16, (java.lang.reflect.GenericDeclaration) wildcardClass21);
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass21;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray25);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey32 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableMultiKey32.size();
        java.lang.Comparable<java.lang.String> strComparable35 = strComparableMultiKey32.getKey(0);
        java.lang.Class<?> wildcardClass36 = strComparableMultiKey32.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int40 = strComparableMultiKey39.size();
        java.lang.Class<?> wildcardClass41 = strComparableMultiKey39.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int45 = strComparableMultiKey44.size();
        java.lang.Class<?> wildcardClass46 = strComparableMultiKey44.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey49 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableMultiKey49.size();
        java.lang.Class<?> wildcardClass51 = strComparableMultiKey49.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass36, (java.lang.reflect.GenericDeclaration) wildcardClass41, (java.lang.reflect.GenericDeclaration) wildcardClass46, (java.lang.reflect.GenericDeclaration) wildcardClass51);
        java.lang.Class[] classArray54 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass51;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey59 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray55);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey62 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int63 = strComparableMultiKey62.size();
        java.lang.Comparable<java.lang.String> strComparable65 = strComparableMultiKey62.getKey(0);
        java.lang.Class<?> wildcardClass66 = strComparableMultiKey62.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey69 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int70 = strComparableMultiKey69.size();
        java.lang.Class<?> wildcardClass71 = strComparableMultiKey69.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int75 = strComparableMultiKey74.size();
        java.lang.Class<?> wildcardClass76 = strComparableMultiKey74.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey79 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int80 = strComparableMultiKey79.size();
        java.lang.Class<?> wildcardClass81 = strComparableMultiKey79.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey82 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass66, (java.lang.reflect.GenericDeclaration) wildcardClass71, (java.lang.reflect.GenericDeclaration) wildcardClass76, (java.lang.reflect.GenericDeclaration) wildcardClass81);
        java.lang.Class[] classArray84 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray85 = (java.lang.Class<?>[]) classArray84;
        wildcardClassArray85[0] = wildcardClass81;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>> wildcardClassMultiKey88 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>>(wildcardClassArray85);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement> annotatedElementMultiKey89 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement[]) wildcardClassArray85);
        java.lang.Class[] classArray91 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray92 = (java.lang.Class<?>[]) classArray91;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]> wildcardClassArrayMultiKey93 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Class<?>[]>(wildcardClassArray25, wildcardClassArray55, wildcardClassArray85, wildcardClassArray92);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration> genericDeclarationMultiKey95 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration[]) wildcardClassArray55, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + strComparable35 + "' != '" + "" + "'", strComparable35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertEquals("'" + strComparable65 + "' != '" + "" + "'", strComparable65, "");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(classArray84);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertNotNull(classArray91);
        org.junit.Assert.assertNotNull(wildcardClassArray92);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ]", (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]" + "'", str5, "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMultiKey10.getKey(0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "MultiKey[, hi!]" + "'", strComparable12, "MultiKey[, hi!]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        int int9 = strComparableMultiKey8.size();
        java.lang.String str10 = strComparableMultiKey8.toString();
        boolean boolean12 = strComparableMultiKey8.equals((java.lang.Object) false);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMultiKey8.getKey(2);
        int int15 = strComparableMultiKey8.size();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]" + "'", str10, "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "MultiKey[, hi!]" + "'", strComparable14, "MultiKey[, hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]");
        int int3 = strComparableMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        int int22 = strComparableMultiKey13.size();
        java.lang.String str23 = strComparableMultiKey13.toString();
        java.lang.String str24 = strComparableMultiKey13.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MultiKey[, hi!]" + "'", str23, "MultiKey[, hi!]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MultiKey[, hi!]" + "'", str24, "MultiKey[, hi!]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4, false);
        int int9 = strComparableMultiKey8.size();
        java.lang.Comparable<java.lang.String>[] strComparableArray10 = strComparableMultiKey8.getKeys();
        int int11 = strComparableMultiKey8.size();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(strComparableArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray8);
        boolean boolean10 = strComparableMultiKey3.equals((java.lang.Object) strArray8);
        int int11 = strComparableMultiKey3.size();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] { charSequenceArray1 };
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray3);
        java.lang.String[][] strArray5 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray12 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray8, charSequenceArray9, charSequenceArray10, charSequenceArray11 };
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray13);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray2, (java.lang.CharSequence[][]) strArray3, (java.lang.CharSequence[][]) strArray5, charSequenceArray12, (java.lang.CharSequence[][]) strArray13);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]> strComparableArrayMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>[]>((java.lang.Comparable<java.lang.String>[][]) strArray13);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray22, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray5, (java.lang.CharSequence[]) strArray12, (java.lang.CharSequence[]) strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray0, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String[] strArray5 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray5 };
        java.lang.String[] strArray12 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray12 };
        java.lang.String[] strArray19 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray19 };
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray27 = new java.lang.String[][] { strArray26 };
        java.lang.String[] strArray33 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray34 = new java.lang.String[][] { strArray33 };
        java.lang.String[] strArray40 = new java.lang.String[] { "MultiKey[, hi!, MultiKey[, hi!], null, ]", "MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]", "MultiKey[, , MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], hi!, ], ]", "MultiKey[MultiKey[MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!], MultiKey[, hi!]], , hi!]" };
        java.lang.String[][] strArray41 = new java.lang.String[][] { strArray40 };
        java.lang.String[][][] strArray42 = new java.lang.String[][][] { strArray6, strArray13, strArray20, strArray27, strArray34, strArray41 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]> strArrayMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[][]>(strArray42);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] { charSequenceArray1 };
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray3);
        java.lang.String[][] strArray5 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5);
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray12 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray8, charSequenceArray9, charSequenceArray10, charSequenceArray11 };
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray13);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray2, (java.lang.CharSequence[][]) strArray3, (java.lang.CharSequence[][]) strArray5, charSequenceArray12, (java.lang.CharSequence[][]) strArray13);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray2, false);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "MultiKey[, hi!]", strComparable3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableMultiKey5.toString();
        int int7 = strComparableMultiKey5.size();
        int int8 = strComparableMultiKey5.size();
        java.lang.Class<?> wildcardClass9 = strComparableMultiKey5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[, hi!, MultiKey[, hi!], null, ]" + "'", str6, "MultiKey[, hi!, MultiKey[, hi!], null, ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableMultiKey2.size();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMultiKey2.getKey((int) (short) 1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMultiKey8.size();
        int int10 = strComparableMultiKey8.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMultiKey13.size();
        int int15 = strComparableMultiKey13.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMultiKey18.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey13, strComparableMultiKey18);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey2, strComparableMultiKey8, strComparableMultiKey13);
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMultiKey8.getKey((int) (byte) 1);
        java.lang.String[] strArray28 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey8, strComparableMultiKey29);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int34 = strComparableMultiKey33.size();
        int int35 = strComparableMultiKey33.size();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int39 = strComparableMultiKey38.size();
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>> strComparableMultiKeyMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>>(strComparableMultiKey33, strComparableMultiKey38);
        java.lang.Comparable<java.lang.String>[] strComparableArray41 = null; // flaky: strComparableMultiKey33.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey42 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray41);
        boolean boolean43 = strComparableMultiKey8.equals((java.lang.Object) strComparableArray41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable45 = strComparableMultiKey8.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
// flaky:         org.junit.Assert.assertNotNull(strComparableArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String[] strArray4 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.String[] strArray10 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable[]) strArray10);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        java.lang.String[] strArray19 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray26, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray26);
        java.lang.String[] strArray36 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey41 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray36, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray36, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey44 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray19, (java.lang.CharSequence[]) strArray26, (java.lang.CharSequence[]) strArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey45 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray50 = new java.lang.String[] { "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]", "MultiKey[, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray50);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey52 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray50);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey53 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray50);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray50, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey57 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray50, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>((java.lang.CharSequence[]) strArray4, (java.lang.CharSequence[]) strArray10, (java.lang.CharSequence[]) strArray36, (java.lang.CharSequence[]) strArray50);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray50);
    }
}

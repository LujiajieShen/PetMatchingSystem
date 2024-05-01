package org.apache.commons.codec.binary;

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
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray4 = new byte[] { (byte) 10 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            base64OutputStream2.write(byteArray6, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        // The following exception was thrown during execution in test generation
        try {
            base64OutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = base64InputStream2.skip((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (byte) 10, byteArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [Cg==]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[67, 103, 61, 61]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray2);
        int int6 = base64_0.readResults(byteArray3, (int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = byteArray3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, true);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        byte[] byteArray9 = null;
        base64_5.encode(byteArray9, (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = base64_5.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = base64InputStream2.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        byte[] byteArray9 = null;
        base64_5.encode(byteArray9, (int) (byte) 100, (int) (byte) 0);
        byte[] byteArray13 = null;
        byte[] byteArray14 = base64_5.decode(byteArray13);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNull(byteArray14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream3 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            base64OutputStream3.write(byteArray4, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(0, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray12);
        byte[] byteArray14 = base64_11.decode(byteArray13);
        boolean boolean15 = base64_11.hasData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = base64_5.encode((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 10);
        byte[] byteArray4 = new byte[] { (byte) 10 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(0, byteArray4);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.decode(byteArray4, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        int int1 = base64_0.avail();
        int int2 = base64_0.avail();
        boolean boolean3 = base64_0.isUrlSafe();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        int int1 = base64_0.avail();
        int int2 = base64_0.avail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base64_0.decode((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[]");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        boolean boolean9 = base64_5.hasData();
        byte[] byteArray12 = new byte[] { (byte) 10 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(0, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray16);
        byte[] byteArray18 = base64_15.decode(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        byte[] byteArray20 = base64_5.encode(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = base64_5.encode((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        // The following exception was thrown during execution in test generation
        try {
            base64OutputStream2.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        boolean boolean16 = base64InputStream15.markSupported();
        byte[] byteArray19 = new byte[] { (byte) 10 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray19);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64(0, byteArray19);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray23);
        byte[] byteArray25 = base64_22.decode(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = base64InputStream15.read(byteArray25, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = base64InputStream15.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = base64InputStream15.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64();
        boolean boolean7 = base64_6.isUrlSafe();
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        java.lang.Object obj12 = base64_6.encode((java.lang.Object) byteArray9);
        base64_5.decode(byteArray9, 10, (-1));
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = base64InputStream12.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        boolean boolean9 = base64_5.hasData();
        byte[] byteArray12 = new byte[] { (byte) 10 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(0, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray16);
        byte[] byteArray18 = base64_15.decode(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        byte[] byteArray20 = base64_5.encode(byteArray19);
        boolean boolean21 = base64_5.hasData();
        java.io.InputStream inputStream22 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream(inputStream22, false);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray25);
        int int27 = base64InputStream24.read(byteArray26);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray31);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray31);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream24, false, 10, byteArray31);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = base64_5.decode((java.lang.Object) base64InputStream34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[]");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream(inputStream1, false);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray4);
        int int6 = base64InputStream3.read(byteArray5);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray5);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream3 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray6 = new byte[] { (byte) 10 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray6);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray6);
        boolean boolean10 = base64_9.hasData();
        byte[] byteArray13 = new byte[] { (byte) 10 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray13);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(0, byteArray13);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray13);
        byte[] byteArray18 = base64_9.encode(byteArray17);
        base64OutputStream3.write(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            base64OutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = base64InputStream1.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream3 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream4 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = base64InputStream2.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        boolean boolean7 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray6);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[81, 50, 99, 57, 80, 81, 61, 61]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        int int1 = base64_0.avail();
        boolean boolean2 = base64_0.hasData();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        boolean boolean9 = base64_5.hasData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = base64_5.encode((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) 10 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray5);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64(0, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = base64_8.decode(byteArray10);
        boolean boolean12 = base64_8.hasData();
        byte[] byteArray15 = new byte[] { (byte) 10 };
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray15);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(0, byteArray15);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray19);
        byte[] byteArray21 = base64_18.decode(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray20);
        byte[] byteArray23 = base64_8.encode(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray22);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray22, false);
        base64_1.decode(byteArray22, (int) 'a', (int) (short) -1);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[67, 103, 61, 61]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        boolean boolean9 = base64_5.hasData();
        byte[] byteArray12 = new byte[] { (byte) 10 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(0, byteArray12);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray12);
        byte[] byteArray17 = base64_5.encode(byteArray12);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(0, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray24);
        byte[] byteArray26 = base64_23.decode(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray25);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger28);
        java.math.BigInteger bigInteger30 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray29);
        int int33 = base64_5.readResults(byteArray29, (int) (byte) 100, 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        boolean boolean6 = base64_5.hasData();
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) 10);
        byte[] byteArray10 = new byte[] { (byte) 10 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10);
        java.lang.Object obj12 = base64_8.decode((java.lang.Object) byteArray10);
        java.lang.Object obj13 = base64_5.encode((java.lang.Object) byteArray10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64();
        boolean boolean18 = base64_17.isUrlSafe();
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        java.lang.Object obj23 = base64_17.encode((java.lang.Object) byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, (int) '#', byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = base64InputStream12.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        boolean boolean14 = base64InputStream13.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = base64InputStream13.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream2, true, (int) (byte) 0, byteArray13);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream15 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray18);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(0, byteArray18);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray22);
        byte[] byteArray24 = base64_21.decode(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            base64OutputStream14.write(byteArray23, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray3);
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64(0, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = base64_6.decode(byteArray8);
        boolean boolean10 = base64_6.hasData();
        byte[] byteArray13 = new byte[] { (byte) 10 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray13);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(0, byteArray13);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray17);
        byte[] byteArray19 = base64_16.decode(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray18);
        byte[] byteArray21 = base64_6.encode(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray20);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray22);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.mark((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream2, true, (int) (byte) 0, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64();
        boolean boolean18 = base64_17.isUrlSafe();
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray19);
        int int23 = base64_17.readResults(byteArray20, (int) (short) 10, (int) (short) 100);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray20);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream25 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14, true, 76, byteArray20);
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) (short) 10);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29);
        java.lang.Object obj31 = base64_27.decode((java.lang.Object) byteArray29);
        base64OutputStream25.write(byteArray29);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream2, true, (int) (byte) 0, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64();
        boolean boolean18 = base64_17.isUrlSafe();
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray19);
        int int23 = base64_17.readResults(byteArray20, (int) (short) 10, (int) (short) 100);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray20);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream25 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14, true, 76, byteArray20);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            base64OutputStream25.write(byteArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, -1, 1, 0, 1, 1]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        boolean boolean9 = base64_5.hasData();
        byte[] byteArray12 = new byte[] { (byte) 10 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(0, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray16);
        byte[] byteArray18 = base64_15.decode(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        byte[] byteArray20 = base64_5.encode(byteArray19);
        java.lang.Class<?> wildcardClass21 = byteArray19.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream2, true, (int) (byte) 0, byteArray13);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream15 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14);
        base64OutputStream15.write((int) (byte) 0);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream19 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream15, false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray2);
        int int6 = base64_0.readResults(byteArray3, (int) (short) 10, (int) (short) 100);
        boolean boolean7 = base64_0.isUrlSafe();
        boolean boolean8 = base64_0.hasData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream8 = new org.apache.commons.codec.binary.Base64InputStream(inputStream6, false);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        int int11 = base64InputStream8.read(byteArray10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray15);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream8, false, 10, byteArray15);
        byte[] byteArray19 = base64_5.encode(byteArray15);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream20 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, true, (-1), byteArray15);
        java.io.InputStream inputStream21 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream23 = new org.apache.commons.codec.binary.Base64InputStream(inputStream21, false);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray24);
        int int26 = base64InputStream23.read(byteArray25);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream23, false, 10, byteArray30);
        boolean boolean34 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray30);
        base64OutputStream20.write(byteArray30);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64();
        boolean boolean18 = base64_17.isUrlSafe();
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        java.lang.Object obj23 = base64_17.encode((java.lang.Object) byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, (int) '#', byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream26 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream24, true);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = base64InputStream26.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray2);
        int int6 = base64_0.readResults(byteArray3, (int) (short) 10, (int) (short) 100);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray3);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        boolean boolean15 = base64InputStream14.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64();
        boolean boolean18 = base64_17.isUrlSafe();
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        java.lang.Object obj23 = base64_17.encode((java.lang.Object) byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, (int) '#', byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger28);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = base64InputStream12.read(byteArray30, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[81, 50, 99, 57, 80, 81, 61, 61]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 10);
        byte[] byteArray2 = null;
        byte[] byteArray3 = base64_1.encode(byteArray2);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = base64InputStream13.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(100);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        boolean boolean14 = base64_10.hasData();
        byte[] byteArray17 = new byte[] { (byte) 10 };
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray17);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(0, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray21);
        byte[] byteArray23 = base64_20.decode(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray22);
        byte[] byteArray25 = base64_10.encode(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray24);
        org.apache.commons.codec.binary.Base64 base64_28 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray24, false);
        base64_3.decode(byteArray24, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = base64_1.decode((java.lang.Object) base64_3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[]");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream2, true, (int) (byte) 0, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64();
        boolean boolean18 = base64_17.isUrlSafe();
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray19);
        int int23 = base64_17.readResults(byteArray20, (int) (short) 10, (int) (short) 100);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray20);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream25 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14, true, 76, byteArray20);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream26 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream28 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream26, false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        boolean boolean9 = base64_5.hasData();
        byte[] byteArray12 = new byte[] { (byte) 10 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(0, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray16);
        byte[] byteArray18 = base64_15.decode(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        byte[] byteArray20 = base64_5.encode(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray19);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray21);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64();
        boolean boolean18 = base64_17.isUrlSafe();
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        java.lang.Object obj23 = base64_17.encode((java.lang.Object) byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, (int) '#', byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream26 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream24, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream24.mark(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        int int1 = base64_0.avail();
        int int2 = base64_0.avail();
        int int3 = base64_0.avail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray2);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(76, byteArray2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[13, 10]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 10);
        byte[] byteArray3 = new byte[] { (byte) 10 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        java.lang.Object obj5 = base64_1.decode((java.lang.Object) byteArray3);
        byte[] byteArray8 = new byte[] { (byte) 10 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(0, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray12);
        byte[] byteArray14 = base64_11.decode(byteArray13);
        boolean boolean15 = base64_11.hasData();
        byte[] byteArray18 = new byte[] { (byte) 10 };
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray18);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(0, byteArray18);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray18);
        byte[] byteArray23 = base64_11.encode(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = base64_1.decode((java.lang.Object) base64_11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[]");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[67, 103, 61, 61]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64();
        int int3 = base64_2.avail();
        byte[] byteArray6 = new byte[] { (byte) 10 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray6);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        byte[] byteArray12 = base64_9.decode(byteArray11);
        boolean boolean13 = base64_9.hasData();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(0, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray20);
        byte[] byteArray22 = base64_19.decode(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray21);
        byte[] byteArray24 = base64_9.encode(byteArray23);
        int int27 = base64_2.readResults(byteArray23, (int) '#', 76);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray30);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64(0, byteArray30);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray34);
        byte[] byteArray36 = base64_33.decode(byteArray35);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray35);
        java.math.BigInteger bigInteger38 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray35);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger38);
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray39);
        int int43 = base64_2.readResults(byteArray39, (int) (short) 10, 10);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray39);
        base64_1.setInitialBuffer(byteArray44, (int) (byte) 0, (int) (short) 100);
        byte[] byteArray50 = new byte[] { (byte) 10 };
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray50);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray50);
        org.apache.commons.codec.binary.Base64 base64_53 = new org.apache.commons.codec.binary.Base64(0, byteArray50);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray54);
        byte[] byteArray56 = base64_53.decode(byteArray55);
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray55);
        byte[] byteArray58 = base64_1.decode(byteArray55);
        org.apache.commons.codec.binary.Base64 base64_59 = new org.apache.commons.codec.binary.Base64();
        boolean boolean60 = base64_59.isUrlSafe();
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray61);
        int int65 = base64_59.readResults(byteArray62, (int) (short) 10, (int) (short) 100);
        byte[] byteArray66 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray62);
        base64_1.setInitialBuffer(byteArray62, (int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        boolean boolean17 = base64InputStream14.markSupported();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64();
        int int3 = base64_2.avail();
        byte[] byteArray6 = new byte[] { (byte) 10 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray6);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        byte[] byteArray12 = base64_9.decode(byteArray11);
        boolean boolean13 = base64_9.hasData();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(0, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray20);
        byte[] byteArray22 = base64_19.decode(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray21);
        byte[] byteArray24 = base64_9.encode(byteArray23);
        int int27 = base64_2.readResults(byteArray23, (int) '#', 76);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray30);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64(0, byteArray30);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray34);
        byte[] byteArray36 = base64_33.decode(byteArray35);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray35);
        java.math.BigInteger bigInteger38 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray35);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger38);
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray39);
        int int43 = base64_2.readResults(byteArray39, (int) (short) 10, 10);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray39);
        base64_1.setInitialBuffer(byteArray44, (int) (byte) 0, (int) (short) 100);
        byte[] byteArray50 = new byte[] { (byte) 10 };
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray50);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray50);
        org.apache.commons.codec.binary.Base64 base64_53 = new org.apache.commons.codec.binary.Base64(0, byteArray50);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray54);
        byte[] byteArray56 = base64_53.decode(byteArray55);
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray55);
        byte[] byteArray58 = base64_1.decode(byteArray55);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        byte[] byteArray4 = new byte[] { (byte) 10 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(0, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = base64_7.decode(byteArray9);
        boolean boolean11 = base64_7.hasData();
        byte[] byteArray14 = new byte[] { (byte) 10 };
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(0, byteArray14);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray18);
        byte[] byteArray20 = base64_17.decode(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray19);
        byte[] byteArray22 = base64_7.encode(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray21);
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray21, false);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray21);
        boolean boolean27 = base64_26.isUrlSafe();
        boolean boolean28 = base64_26.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        byte[] byteArray5 = new byte[] { (byte) 10 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray5);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64(0, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = base64_8.decode(byteArray10);
        boolean boolean12 = base64_8.hasData();
        byte[] byteArray15 = new byte[] { (byte) 10 };
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray15);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(0, byteArray15);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray19);
        byte[] byteArray21 = base64_18.decode(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray20);
        byte[] byteArray23 = base64_8.encode(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray22);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray22, false);
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray22);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray22, false);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray32);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray32);
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64(0, byteArray32);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray36);
        byte[] byteArray38 = base64_35.decode(byteArray37);
        byte[] byteArray39 = null;
        base64_35.encode(byteArray39, (int) (byte) 100, (int) (byte) 0);
        byte[] byteArray45 = new byte[] { (byte) 10 };
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray45);
        org.apache.commons.codec.binary.Base64 base64_48 = new org.apache.commons.codec.binary.Base64(0, byteArray45);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray45);
        byte[] byteArray50 = base64_35.encode(byteArray45);
        byte[] byteArray51 = base64_29.decode(byteArray50);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[10]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 10);
        byte[] byteArray3 = new byte[] { (byte) 10 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        java.lang.Object obj5 = base64_1.decode((java.lang.Object) byteArray3);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[67, 103, 61, 61, 13, 10]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream2, true, (int) (byte) 0, byteArray13);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream15 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream16 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream15);
        base64OutputStream15.write(100);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream2, true, (int) (byte) 0, byteArray13);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream15 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(0, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray24);
        byte[] byteArray26 = base64_23.decode(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray25);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger28);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream31 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14, true, 76, byteArray30);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream32 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream31);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray18);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(0, byteArray18);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray22);
        byte[] byteArray24 = base64_21.decode(byteArray23);
        int int25 = base64InputStream12.read(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = base64_5.decode((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[]");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 100);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = base64InputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = base64InputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray0);
        boolean boolean2 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1);
        boolean boolean3 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray1);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[67, 103, 61, 61]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[67, 103, 61, 61, 13, 10]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        boolean boolean9 = base64_5.hasData();
        byte[] byteArray12 = new byte[] { (byte) 10 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(0, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray16);
        byte[] byteArray18 = base64_15.decode(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        byte[] byteArray20 = base64_5.decode(byteArray19);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream23 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream21, false);
        byte[] byteArray28 = new byte[] { (byte) 10 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray28);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64(0, byteArray28);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray32);
        byte[] byteArray34 = base64_31.decode(byteArray33);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream35 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream23, true, (int) (byte) 0, byteArray34);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream38 = new org.apache.commons.codec.binary.Base64InputStream(inputStream36, false);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray39);
        int int41 = base64InputStream38.read(byteArray40);
        byte[] byteArray45 = new byte[] { (byte) 10 };
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray45);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream38, false, 10, byteArray45);
        boolean boolean49 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray45);
        base64OutputStream35.write(byteArray45);
        base64_5.decode(byteArray45, (int) (byte) 100, (-1));
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[10]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64();
        boolean boolean18 = base64_17.isUrlSafe();
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        java.lang.Object obj23 = base64_17.encode((java.lang.Object) byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, (int) '#', byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream26 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream24, false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray2);
        int int6 = base64_0.readResults(byteArray3, (int) (short) 10, (int) (short) 100);
        boolean boolean7 = base64_0.isUrlSafe();
        byte[] byteArray11 = new byte[] { (byte) 10 };
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(0, byteArray11);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray15);
        byte[] byteArray17 = base64_14.decode(byteArray16);
        boolean boolean18 = base64_14.hasData();
        byte[] byteArray21 = new byte[] { (byte) 10 };
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray21);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(0, byteArray21);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray25);
        byte[] byteArray27 = base64_24.decode(byteArray26);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray26);
        byte[] byteArray29 = base64_14.encode(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray28);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray28, false);
        base64_0.encode(byteArray28, (int) (byte) 0, 0);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '4');
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(true);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64();
        int int4 = base64_3.avail();
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        boolean boolean14 = base64_10.hasData();
        byte[] byteArray17 = new byte[] { (byte) 10 };
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray17);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(0, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray21);
        byte[] byteArray23 = base64_20.decode(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray22);
        byte[] byteArray25 = base64_10.encode(byteArray24);
        int int28 = base64_3.readResults(byteArray24, (int) '#', 76);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray31);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray31);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(0, byteArray31);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray35);
        byte[] byteArray37 = base64_34.decode(byteArray36);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray36);
        java.math.BigInteger bigInteger39 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray36);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger39);
        java.math.BigInteger bigInteger41 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray40);
        int int44 = base64_3.readResults(byteArray40, (int) (short) 10, 10);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray40);
        base64_2.setInitialBuffer(byteArray45, (int) (byte) 0, (int) (short) 100);
        byte[] byteArray51 = new byte[] { (byte) 10 };
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray51);
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray51);
        org.apache.commons.codec.binary.Base64 base64_54 = new org.apache.commons.codec.binary.Base64(0, byteArray51);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray55);
        byte[] byteArray57 = base64_54.decode(byteArray56);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray56);
        byte[] byteArray59 = base64_2.decode(byteArray56);
        org.apache.commons.codec.binary.Base64 base64_60 = new org.apache.commons.codec.binary.Base64(10, byteArray56);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[81, 50, 99, 57, 80, 81, 61, 61, 13, 10]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        int int1 = base64_0.avail();
        byte[] byteArray4 = new byte[] { (byte) 10 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(0, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = base64_7.decode(byteArray9);
        boolean boolean11 = base64_7.hasData();
        byte[] byteArray14 = new byte[] { (byte) 10 };
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(0, byteArray14);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray18);
        byte[] byteArray20 = base64_17.decode(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray19);
        byte[] byteArray22 = base64_7.encode(byteArray21);
        int int25 = base64_0.readResults(byteArray21, (int) '#', 76);
        byte[] byteArray28 = new byte[] { (byte) 10 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray28);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64(0, byteArray28);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray32);
        byte[] byteArray34 = base64_31.decode(byteArray33);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray33);
        java.math.BigInteger bigInteger36 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray33);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger36);
        java.math.BigInteger bigInteger38 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray37);
        int int41 = base64_0.readResults(byteArray37, (int) (short) 10, 10);
        byte[] byteArray44 = new byte[] { (byte) 10 };
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray44);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray44);
        org.apache.commons.codec.binary.Base64 base64_47 = new org.apache.commons.codec.binary.Base64(0, byteArray44);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray48);
        byte[] byteArray50 = base64_47.decode(byteArray49);
        boolean boolean51 = base64_47.hasData();
        byte[] byteArray54 = new byte[] { (byte) 10 };
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray54);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray54);
        org.apache.commons.codec.binary.Base64 base64_57 = new org.apache.commons.codec.binary.Base64(0, byteArray54);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray58);
        byte[] byteArray60 = base64_57.decode(byteArray59);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray59);
        byte[] byteArray62 = base64_47.decode(byteArray61);
        byte[] byteArray63 = base64_0.encode(byteArray62);
        byte[] byteArray69 = new byte[] { (byte) 10 };
        byte[] byteArray70 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray69);
        byte[] byteArray71 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray69);
        org.apache.commons.codec.binary.Base64 base64_72 = new org.apache.commons.codec.binary.Base64(0, byteArray69);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray73);
        byte[] byteArray75 = base64_72.decode(byteArray74);
        boolean boolean76 = base64_72.hasData();
        byte[] byteArray79 = new byte[] { (byte) 10 };
        byte[] byteArray80 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray79);
        byte[] byteArray81 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray79);
        org.apache.commons.codec.binary.Base64 base64_82 = new org.apache.commons.codec.binary.Base64(0, byteArray79);
        byte[] byteArray83 = new byte[] {};
        byte[] byteArray84 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray83);
        byte[] byteArray85 = base64_82.decode(byteArray84);
        byte[] byteArray86 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray84);
        byte[] byteArray87 = base64_72.encode(byteArray86);
        byte[] byteArray88 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray86);
        org.apache.commons.codec.binary.Base64 base64_90 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray86, false);
        org.apache.commons.codec.binary.Base64 base64_91 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray86);
        org.apache.commons.codec.binary.Base64 base64_93 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray86, false);
        byte[] byteArray94 = base64_0.decode(byteArray86);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[10]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[10]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[10]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[10]");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[]");
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[]");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[]");
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[]");
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[]");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[]");
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[]");
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray94), "[]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(0, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray24);
        byte[] byteArray26 = base64_23.decode(byteArray25);
        boolean boolean27 = base64_23.hasData();
        byte[] byteArray30 = new byte[] { (byte) 10 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray30);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64(0, byteArray30);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray34);
        byte[] byteArray36 = base64_33.decode(byteArray35);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray35);
        byte[] byteArray38 = base64_23.encode(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray37);
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray37, false);
        base64_16.decode(byteArray37, (int) 'a', (int) (short) -1);
        boolean boolean45 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = base64InputStream14.read(byteArray37, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        int int1 = base64_0.avail();
        int int2 = base64_0.avail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base64_0.encode((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream2, true, (int) (byte) 0, byteArray13);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream(inputStream15, false);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray18);
        int int20 = base64InputStream17.read(byteArray19);
        byte[] byteArray24 = new byte[] { (byte) 10 };
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray24);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream27 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, false, 10, byteArray24);
        boolean boolean28 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray24);
        base64OutputStream14.write(byteArray24);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64();
        int int33 = base64_32.avail();
        byte[] byteArray36 = new byte[] { (byte) 10 };
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray36);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray36);
        org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64(0, byteArray36);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray40);
        byte[] byteArray42 = base64_39.decode(byteArray41);
        boolean boolean43 = base64_39.hasData();
        byte[] byteArray46 = new byte[] { (byte) 10 };
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray46);
        org.apache.commons.codec.binary.Base64 base64_49 = new org.apache.commons.codec.binary.Base64(0, byteArray46);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray50);
        byte[] byteArray52 = base64_49.decode(byteArray51);
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray51);
        byte[] byteArray54 = base64_39.encode(byteArray53);
        int int57 = base64_32.readResults(byteArray53, (int) '#', 76);
        org.apache.commons.codec.binary.Base64 base64_59 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray63 = new byte[] { (byte) 10 };
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray63);
        byte[] byteArray65 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray63);
        org.apache.commons.codec.binary.Base64 base64_66 = new org.apache.commons.codec.binary.Base64(0, byteArray63);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray67);
        byte[] byteArray69 = base64_66.decode(byteArray68);
        boolean boolean70 = base64_66.hasData();
        byte[] byteArray73 = new byte[] { (byte) 10 };
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray73);
        byte[] byteArray75 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray73);
        org.apache.commons.codec.binary.Base64 base64_76 = new org.apache.commons.codec.binary.Base64(0, byteArray73);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray77);
        byte[] byteArray79 = base64_76.decode(byteArray78);
        byte[] byteArray80 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray78);
        byte[] byteArray81 = base64_66.encode(byteArray80);
        byte[] byteArray82 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray80);
        org.apache.commons.codec.binary.Base64 base64_84 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray80, false);
        base64_59.decode(byteArray80, (int) 'a', (int) (short) -1);
        byte[] byteArray88 = base64_32.decode(byteArray80);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream89 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14, false, (-1), byteArray88);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[10]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[10]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[10]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[]");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[]");
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[]");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[]");
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[]");
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(0, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray20);
        byte[] byteArray22 = base64_19.decode(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray21);
        java.math.BigInteger bigInteger24 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray21);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger24);
        java.math.BigInteger bigInteger26 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        int int27 = base64InputStream13.read(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = base64InputStream13.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(0, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = base64_5.decode(byteArray7);
        boolean boolean9 = base64_5.hasData();
        byte[] byteArray12 = new byte[] { (byte) 10 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(0, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray16);
        byte[] byteArray18 = base64_15.decode(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        byte[] byteArray20 = base64_5.decode(byteArray19);
        java.math.BigInteger bigInteger21 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray19);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(bigInteger21);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        byte[] byteArray4 = new byte[] { (byte) 10 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(0, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = base64_7.decode(byteArray9);
        boolean boolean11 = base64_7.hasData();
        byte[] byteArray14 = new byte[] { (byte) 10 };
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(0, byteArray14);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray18);
        byte[] byteArray20 = base64_17.decode(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray19);
        byte[] byteArray22 = base64_7.encode(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray21);
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray21, false);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray21);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray29);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64(0, byteArray29);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray33);
        byte[] byteArray35 = base64_32.decode(byteArray34);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray34);
        java.math.BigInteger bigInteger37 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray34);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray34);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray38);
        byte[] byteArray40 = base64_26.encode(byteArray39);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(100);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(true);
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64();
        int int5 = base64_4.avail();
        byte[] byteArray8 = new byte[] { (byte) 10 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(0, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray12);
        byte[] byteArray14 = base64_11.decode(byteArray13);
        boolean boolean15 = base64_11.hasData();
        byte[] byteArray18 = new byte[] { (byte) 10 };
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray18);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(0, byteArray18);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray22);
        byte[] byteArray24 = base64_21.decode(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray23);
        byte[] byteArray26 = base64_11.encode(byteArray25);
        int int29 = base64_4.readResults(byteArray25, (int) '#', 76);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray32);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray32);
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64(0, byteArray32);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray36);
        byte[] byteArray38 = base64_35.decode(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray37);
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray37);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger40);
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        int int45 = base64_4.readResults(byteArray41, (int) (short) 10, 10);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray41);
        base64_3.setInitialBuffer(byteArray46, (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray46, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream2, true, (int) (byte) 0, byteArray13);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream15 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(0, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray24);
        byte[] byteArray26 = base64_23.decode(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray25);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger28);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream31 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14, true, 76, byteArray30);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64();
        java.io.OutputStream outputStream33 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream35 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream33, false);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream36 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream33);
        byte[] byteArray39 = new byte[] { (byte) 10 };
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray39);
        org.apache.commons.codec.binary.Base64 base64_42 = new org.apache.commons.codec.binary.Base64(0, byteArray39);
        boolean boolean43 = base64_42.hasData();
        byte[] byteArray46 = new byte[] { (byte) 10 };
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray46);
        org.apache.commons.codec.binary.Base64 base64_49 = new org.apache.commons.codec.binary.Base64(0, byteArray46);
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray46);
        byte[] byteArray51 = base64_42.encode(byteArray50);
        base64OutputStream36.write(byteArray51);
        base64_32.setInitialBuffer(byteArray51, (int) (short) 0, 76);
        base64OutputStream14.write(byteArray51);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, true);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64();
        boolean boolean18 = base64_17.isUrlSafe();
        byte[] byteArray20 = new byte[] { (byte) 10 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        java.lang.Object obj23 = base64_17.encode((java.lang.Object) byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, (int) '#', byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream26 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream24, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream26.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray3);
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64(0, byteArray3);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64();
        boolean boolean8 = base64_7.isUrlSafe();
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        int int13 = base64_7.readResults(byteArray10, (int) (short) 10, (int) (short) 100);
        boolean boolean14 = base64_7.isUrlSafe();
        byte[] byteArray18 = new byte[] { (byte) 10 };
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray18);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(0, byteArray18);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray22);
        byte[] byteArray24 = base64_21.decode(byteArray23);
        boolean boolean25 = base64_21.hasData();
        byte[] byteArray28 = new byte[] { (byte) 10 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray28);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64(0, byteArray28);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray32);
        byte[] byteArray34 = base64_31.decode(byteArray33);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray33);
        byte[] byteArray36 = base64_21.encode(byteArray35);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray35);
        org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray35, false);
        base64_7.encode(byteArray35, (int) (byte) 0, 0);
        byte[] byteArray43 = base64_6.encode(byteArray35);
        org.apache.commons.codec.binary.Base64 base64_45 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray43, true);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(76, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [Q2c9PQ==??]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[81, 50, 99, 57, 80, 81, 61, 61, 13, 10]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(0, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray20);
        byte[] byteArray22 = base64_19.decode(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray21);
        java.math.BigInteger bigInteger24 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray21);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger24);
        java.math.BigInteger bigInteger26 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        int int27 = base64InputStream13.read(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = base64InputStream13.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream2 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        byte[] byteArray13 = base64_10.decode(byteArray12);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream2, true, (int) (byte) 0, byteArray13);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream15 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream16 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream15);
        byte[] byteArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64OutputStream base64OutputStream20 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream15, true, (int) (short) 100, byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream5 = new org.apache.commons.codec.binary.Base64InputStream(inputStream3, false);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        int int8 = base64InputStream5.read(byteArray7);
        byte[] byteArray12 = new byte[] { (byte) 10 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream5, false, 10, byteArray12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream15);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray19);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64(0, byteArray19);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray23);
        byte[] byteArray25 = base64_22.decode(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray24);
        java.math.BigInteger bigInteger27 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray24);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger27);
        java.math.BigInteger bigInteger29 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        int int30 = base64InputStream16.read(byteArray28);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false, (int) ' ', byteArray28);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray28);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 100);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        int int5 = base64InputStream2.read(byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, 10, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64();
        boolean boolean16 = base64_15.isUrlSafe();
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray17);
        int int21 = base64_15.readResults(byteArray18, (int) (short) 10, (int) (short) 100);
        boolean boolean22 = base64_15.isUrlSafe();
        byte[] byteArray27 = new byte[] { (byte) 10 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray27);
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64(0, byteArray27);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray31);
        byte[] byteArray33 = base64_30.decode(byteArray32);
        boolean boolean34 = base64_30.hasData();
        byte[] byteArray37 = new byte[] { (byte) 10 };
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray37);
        org.apache.commons.codec.binary.Base64 base64_40 = new org.apache.commons.codec.binary.Base64(0, byteArray37);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray41);
        byte[] byteArray43 = base64_40.decode(byteArray42);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray42);
        byte[] byteArray45 = base64_30.encode(byteArray44);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray44);
        org.apache.commons.codec.binary.Base64 base64_48 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray44, false);
        org.apache.commons.codec.binary.Base64 base64_49 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray44);
        byte[] byteArray50 = base64_15.encode(byteArray44);
        int int51 = base64InputStream14.read(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream53 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) 10);
        byte[] byteArray5 = new byte[] { (byte) 10 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray5);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64(0, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = base64_8.decode(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray10);
        base64_2.setInitialBuffer(byteArray12, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray12);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[67, 103, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }
}


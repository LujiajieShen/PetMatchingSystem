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
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, true, true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (10) than the specified maxium size of 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = base64_1.decode((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: encodeInteger called with null parameter");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str1 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = base64_1.decode((java.lang.Object) 76);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, false, 10);
        java.lang.String str5 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray4);
        boolean boolean6 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray4);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(100, byteArray8);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray12 = new byte[] {};
        base64_11.decode(byteArray12, (int) 'a', (-1));
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, true, true, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            base64_9.decode(byteArray12, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, false, false);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.decode(byteArray23, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[65, 71, 81, 66, 65, 65, 61, 61]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(10, byteArray1);
        java.lang.Class<?> wildcardClass3 = base64_2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-122]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = base64_1.decode((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 10);
        byte[] byteArray9 = base64_3.decode(byteArray8);
        byte[] byteArray11 = base64_3.decode("");
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_3.decode(byteArray16);
        base64_1.setInitialBuffer(byteArray17, 1, 0);
        java.lang.String str21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray17);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        byte[] byteArray3 = base64_1.decode("");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 10);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray4, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        byte[] byteArray0 = null;
        java.lang.String str1 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, true);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray11);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        base64_3.decode(byteArray4, (int) 'a', (-1));
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, true, true, (int) (byte) 100);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, true, false, 1);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray11, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray6);
        boolean boolean8 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = base64_1.decode((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        org.apache.commons.codec.DecoderException decoderException7 = new org.apache.commons.codec.DecoderException("org.apache.commons.codec.EncoderException");
        org.apache.commons.codec.DecoderException decoderException8 = new org.apache.commons.codec.DecoderException((java.lang.Throwable) decoderException7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = base64_1.decode((java.lang.Object) decoderException7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("QUdRQkFBPT0");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100, 1, 0]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray8 = new byte[] {};
        base64_7.decode(byteArray8, (int) 'a', (-1));
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, true, (int) (byte) 100);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, true, false, 1);
        base64_1.setInitialBuffer(byteArray19, (int) (byte) 10, 100);
        org.apache.commons.codec.DecoderException decoderException24 = new org.apache.commons.codec.DecoderException("org.apache.commons.codec.DecoderException");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = base64_1.decode((java.lang.Object) decoderException24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, true, false, 1);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        boolean boolean2 = base64_1.isUrlSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base64_1.decode((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        base64_2.decode(byteArray3, (int) 'a', (-1));
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray11);
        byte[] byteArray16 = base64_2.encode(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [?d??]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[65, 71, 81, 66, 65, 65, 61, 61, 13, 10]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        byte[] byteArray0 = null;
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, true);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 10);
        byte[] byteArray9 = base64_3.decode(byteArray8);
        byte[] byteArray11 = base64_3.decode("");
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_3.decode(byteArray16);
        base64_1.setInitialBuffer(byteArray17, 1, 0);
        java.lang.String str21 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray17);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(100, byteArray8);
        boolean boolean10 = base64_9.hasData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = base64_9.encode((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray4 = base64_1.decode(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        boolean boolean2 = base64_1.isUrlSafe();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base64_1.encode(obj3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray7 = base64_1.decode("QUdRQkFBPT0");
        byte[] byteArray9 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, false);
        java.math.BigInteger bigInteger21 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger21);
        java.lang.Object obj24 = base64_11.encode((java.lang.Object) byteArray23);
        java.lang.Object obj25 = base64_10.encode((java.lang.Object) byteArray23);
        java.lang.Object obj26 = base64_1.encode((java.lang.Object) byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = base64_1.decode((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, false);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray18);
        base64_0.encode(byteArray22, 0, 10);
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, true);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray30);
        byte[] byteArray32 = base64_0.decode(byteArray30);
        java.lang.String str33 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray30);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "QUE" + "'", str33, "QUE");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, false);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray18);
        base64_0.encode(byteArray22, 0, 10);
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, true);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray30);
        byte[] byteArray32 = base64_0.decode(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = base64_0.decode((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0, byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [/2QK/2Q=]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[47, 50, 81, 75, 47, 50, 81, 61]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        boolean boolean6 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray5);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        byte[] byteArray3 = base64_1.decode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = base64_1.encode((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        int int8 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_11.decode(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(100, byteArray17);
        byte[] byteArray19 = base64_1.encode(byteArray17);
        int int20 = base64_1.avail();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray7 = base64_1.decode("QUdRQkFBPT0");
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        byte[] byteArray21 = base64_1.encode(byteArray20);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray24 = new byte[] {};
        base64_23.decode(byteArray24, (int) 'a', (-1));
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, true, true, (int) (byte) 100);
        java.lang.String str32 = base64_1.encodeToString(byteArray31);
        byte[] byteArray34 = new byte[] { (byte) 0 };
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray34, false, true);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray37);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, true);
        base64_1.setInitialBuffer(byteArray40, (int) (byte) -1, 0);
        org.apache.commons.codec.binary.Base64 base64_45 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46, false, false, 10);
        byte[] byteArray51 = base64_45.decode(byteArray50);
        byte[] byteArray53 = base64_45.decode("");
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray54, false, false, 10);
        byte[] byteArray59 = base64_45.decode(byteArray58);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray60, false, false, 10);
        byte[] byteArray65 = base64_45.encode(byteArray64);
        org.apache.commons.codec.binary.Base64 base64_67 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray68 = new byte[] {};
        base64_67.decode(byteArray68, (int) 'a', (-1));
        byte[] byteArray75 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray68, true, true, (int) (byte) 100);
        java.lang.String str76 = base64_45.encodeToString(byteArray75);
        byte[] byteArray78 = new byte[] { (byte) 0 };
        byte[] byteArray81 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray78, false, true);
        byte[] byteArray82 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray81);
        byte[] byteArray84 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray81, true);
        base64_45.setInitialBuffer(byteArray84, (int) (byte) -1, 0);
        int int90 = base64_1.readResults(byteArray84, 76, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[]");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0]");
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, false);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray18);
        base64_0.encode(byteArray22, 0, 10);
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, true);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray30);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30, true);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray33, true, true);
        base64_0.encode(byteArray36, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[85, 86, 86, 70, 80, 81, 48, 75, 13, 10]");
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
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        java.lang.String str21 = base64_1.encodeToString(byteArray16);
        boolean boolean22 = base64_1.isUrlSafe();
        byte[] byteArray23 = null;
        int int26 = base64_1.readResults(byteArray23, (int) (byte) 1, 76);
        boolean boolean27 = base64_1.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("org.apache.commons.codec.DecoderException: org.apache.commons.codec.EncoderException");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88, -98, -118, -32, 106, -106, -100, -123, -25, 40, -102, 106, 39, -79, -54, 29, 121, -63, 39, 114, -121, 94, -84, 76, 92, 122, -101, 98, -94]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray10);
        byte[] byteArray15 = base64_1.encode(byteArray10);
        byte[] byteArray17 = new byte[] { (byte) 0 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, true);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        java.math.BigInteger bigInteger22 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = base64_1.decode((java.lang.Object) bigInteger22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[65, 71, 81, 66, 65, 65, 61, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(bigInteger22);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AGQBAA==]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[65, 71, 81, 66, 65, 65, 61, 61]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray8 = new byte[] {};
        base64_7.decode(byteArray8, (int) 'a', (-1));
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, true, (int) (byte) 100);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, true, false, 1);
        base64_1.setInitialBuffer(byteArray19, (int) (byte) 10, 100);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, true, 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 10);
        byte[] byteArray9 = base64_3.decode(byteArray8);
        byte[] byteArray11 = base64_3.decode("");
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_3.decode(byteArray16);
        base64_1.setInitialBuffer(byteArray17, 1, 0);
        int int21 = base64_1.avail();
        byte[] byteArray22 = null;
        byte[] byteArray23 = base64_1.encode(byteArray22);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(byteArray23);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        java.lang.Class<?> wildcardClass12 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(0, byteArray10);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14, false, false, 10);
        byte[] byteArray19 = base64_13.decode(byteArray18);
        byte[] byteArray21 = base64_13.decode("");
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22, false, false, 10);
        byte[] byteArray27 = base64_13.decode(byteArray26);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray30 = new byte[] {};
        base64_29.decode(byteArray30, (int) 'a', (-1));
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30, true, true, (int) (byte) 100);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, true, false, 1);
        java.lang.Object obj42 = base64_13.encode((java.lang.Object) byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = base64_11.decode((java.lang.Object) base64_13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray13);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/2QK/2Q=\r\n" + "'", str14, "/2QK/2Q=\r\n");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(100, byteArray8);
        boolean boolean10 = base64_9.hasData();
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, false, false);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray15);
        java.lang.String str20 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            base64_9.encode(byteArray15, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 100, 1, 0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AGQBAA==\r\n" + "'", str20, "AGQBAA==\r\n");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("LzJRSy8yUT0");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[47, 50, 81, 75, 47, 50, 81, 61]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("QUE");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[65, 65]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean2 = base64_1.hasData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        byte[] byteArray3 = base64_1.decode("");
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray6 = new byte[] {};
        base64_5.decode(byteArray6, (int) 'a', (-1));
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, true, true, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray13);
        byte[] byteArray16 = base64_1.encode(byteArray15);
        java.lang.String str17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray15);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray15);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, false);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray18);
        base64_0.encode(byteArray22, 0, 10);
        java.lang.Class<?> wildcardClass26 = byteArray22.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        base64_2.decode(byteArray3, (int) 'a', (-1));
        byte[] byteArray8 = base64_2.decode("QUdRQkFBPT0");
        byte[] byteArray10 = null;
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(10, byteArray10);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, false);
        java.math.BigInteger bigInteger22 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger22);
        java.lang.Object obj25 = base64_12.encode((java.lang.Object) byteArray24);
        java.lang.Object obj26 = base64_11.encode((java.lang.Object) byteArray24);
        java.lang.Object obj27 = base64_2.encode((java.lang.Object) byteArray24);
        java.lang.String str28 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64(1, byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [/2QK/2Q=]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LzJRSy8yUT0" + "'", str28, "LzJRSy8yUT0");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(10, byteArray1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, false);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        java.lang.Object obj16 = base64_3.encode((java.lang.Object) byteArray15);
        java.lang.Object obj17 = base64_2.encode((java.lang.Object) byteArray15);
        byte[] byteArray18 = null;
        base64_2.encode(byteArray18, (-1), 0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, false, false);
        java.math.BigInteger bigInteger30 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray26);
        byte[] byteArray31 = base64_2.decode(byteArray26);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        base64_3.decode(byteArray4, (int) 'a', (-1));
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray12);
        byte[] byteArray17 = base64_3.encode(byteArray12);
        java.lang.Object obj18 = base64_1.encode((java.lang.Object) byteArray12);
        byte[] byteArray20 = base64_1.decode("LzJRSy8yUT0");
        org.apache.commons.codec.DecoderException decoderException25 = new org.apache.commons.codec.DecoderException("org.apache.commons.codec.DecoderException");
        org.apache.commons.codec.DecoderException decoderException26 = new org.apache.commons.codec.DecoderException("hi!", (java.lang.Throwable) decoderException25);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.DecoderException", (java.lang.Throwable) decoderException25);
        org.apache.commons.codec.DecoderException decoderException28 = new org.apache.commons.codec.DecoderException("AGQBAA==\r\n", (java.lang.Throwable) decoderException25);
        org.apache.commons.codec.DecoderException decoderException30 = new org.apache.commons.codec.DecoderException("");
        decoderException25.addSuppressed((java.lang.Throwable) decoderException30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = base64_1.encode((java.lang.Object) decoderException25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[65, 71, 81, 66, 65, 65, 61, 61, 13, 10]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[47, 50, 81, 75, 47, 50, 81, 61]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        boolean boolean2 = base64_1.isUrlSafe();
        boolean boolean3 = base64_1.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, false, 10);
        byte[] byteArray12 = base64_6.decode(byteArray11);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(100, byteArray12);
        int int16 = base64_1.readResults(byteArray12, 1, (int) (byte) 1);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray18 = new byte[] {};
        base64_17.decode(byteArray18, (int) 'a', (-1));
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) (byte) 100);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, true, false, 1);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray25);
        java.lang.String str31 = base64_1.encodeToString(byteArray30);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, false);
        base64_1.setInitialBuffer(byteArray10, (int) '#', (int) (byte) -1);
        byte[] byteArray14 = null;
        base64_1.setInitialBuffer(byteArray14, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[47, 50, 81, 75, 47, 50, 81, 61]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        base64_3.decode(byteArray4, (int) 'a', (-1));
        byte[] byteArray9 = base64_3.decode("QUdRQkFBPT0");
        java.lang.String str10 = base64_1.encodeToString(byteArray9);
        boolean boolean11 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray14 = new byte[] {};
        base64_13.decode(byteArray14, (int) 'a', (-1));
        byte[] byteArray19 = base64_13.decode("QUdRQkFBPT0");
        base64_1.decode(byteArray19, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "QUdRQkFBPT0=\r\n" + "'", str10, "QUdRQkFBPT0=\r\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[65, 71, 81, 66, 65, 65, 61, 61]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        int int8 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_11.decode(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(100, byteArray17);
        byte[] byteArray19 = base64_1.encode(byteArray17);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray22 = new byte[] {};
        base64_21.decode(byteArray22, (int) 'a', (-1));
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22, true, true, (int) (byte) 100);
        base64_1.setInitialBuffer(byteArray29, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str33 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray29);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        base64_2.decode(byteArray3, (int) 'a', (-1));
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, true, (int) (byte) 100);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(100, byteArray10, true);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray13);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LzJRSy8yUT0" + "'", str14, "LzJRSy8yUT0");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        int int8 = base64_1.avail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = base64_1.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        base64_3.decode(byteArray4, (int) 'a', (-1));
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray12);
        byte[] byteArray17 = base64_3.encode(byteArray12);
        java.lang.Object obj18 = base64_1.encode((java.lang.Object) byteArray12);
        byte[] byteArray20 = base64_1.decode("LzJRSy8yUT0");
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, false, 10);
        byte[] byteArray29 = base64_23.decode(byteArray28);
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64(100, byteArray29);
        boolean boolean31 = base64_30.hasData();
        byte[] byteArray33 = base64_30.decode("QUdRQkFBPT0=\r\n");
        byte[] byteArray34 = base64_1.decode(byteArray33);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[65, 71, 81, 66, 65, 65, 61, 61, 13, 10]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 100, 1, 0]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, false, 10);
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray5);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(0, byteArray5);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 10);
        byte[] byteArray9 = base64_3.decode(byteArray8);
        byte[] byteArray11 = base64_3.decode("");
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_3.decode(byteArray16);
        base64_1.setInitialBuffer(byteArray17, 1, 0);
        int int21 = base64_1.avail();
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22, false, false, 10);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray26);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray28, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        java.lang.String str21 = base64_1.encodeToString(byteArray16);
        boolean boolean22 = base64_1.isUrlSafe();
        byte[] byteArray23 = null;
        int int26 = base64_1.readResults(byteArray23, (int) (byte) 1, 76);
        org.apache.commons.codec.binary.Base64 base64_28 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray29 = new byte[] {};
        base64_28.decode(byteArray29, (int) 'a', (-1));
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, true, true, (int) (byte) 100);
        byte[] byteArray37 = base64_1.decode(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = base64_1.decode((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray18 = new byte[] {};
        base64_17.decode(byteArray18, (int) 'a', (-1));
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) (byte) 100);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, true, false, 1);
        java.lang.Object obj30 = base64_1.encode((java.lang.Object) byteArray29);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray31, false, false, 10);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray35);
        java.lang.Object obj37 = base64_1.encode((java.lang.Object) byteArray35);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35, false);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray39, true);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        java.lang.String str21 = base64_1.encodeToString(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, false, false);
        java.math.BigInteger bigInteger32 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray31);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger32);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger32);
        java.lang.Object obj35 = base64_22.encode((java.lang.Object) byteArray34);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, false);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray40);
        base64_22.encode(byteArray44, 0, 10);
        byte[] byteArray49 = new byte[] { (byte) 0 };
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray49, false, true);
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray52);
        byte[] byteArray54 = base64_22.decode(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.decode(byteArray52, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray18 = new byte[] {};
        base64_17.decode(byteArray18, (int) 'a', (-1));
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) (byte) 100);
        boolean boolean26 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray25);
        byte[] byteArray27 = base64_1.encode(byteArray25);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = base64_1.decode((java.lang.Object) base64_29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true);
        boolean boolean5 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, true, false, (int) '#');
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[65, 65]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[85, 86, 86, 70, 80, 81, 48, 75]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray15);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[117]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray18 = new byte[] {};
        base64_17.decode(byteArray18, (int) 'a', (-1));
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) (byte) 100);
        boolean boolean26 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray25);
        byte[] byteArray27 = base64_1.encode(byteArray25);
        byte[] byteArray29 = base64_1.decode("QUE");
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35, false, false);
        java.math.BigInteger bigInteger39 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray38);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger39);
        java.lang.Object obj42 = base64_1.encode((java.lang.Object) byteArray41);
        boolean boolean43 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray41);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        boolean boolean2 = base64_1.hasData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, false, 10);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray5);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray8);
        boolean boolean10 = base64_9.hasData();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, false);
        base64_1.setInitialBuffer(byteArray10, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = base64_1.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[47, 50, 81, 75, 47, 50, 81, 61]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        java.lang.String str9 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray4);
        java.lang.String str10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 1, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AGQBAA==\r\n" + "'", str9, "AGQBAA==\r\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AGQBAA" + "'", str10, "AGQBAA");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100, 10, -1, 100]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[47, 50, 81, 75, 47, 50, 81, 61]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [/2QK/2Q=]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray8 = new byte[] {};
        base64_7.decode(byteArray8, (int) 'a', (-1));
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, true, (int) (byte) 100);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, true, false, 1);
        base64_1.setInitialBuffer(byteArray19, (int) (byte) 10, 100);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, false);
        base64_1.setInitialBuffer(byteArray27, 100, 1);
        boolean boolean34 = base64_1.hasData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        int int8 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_11.decode(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(100, byteArray17);
        byte[] byteArray19 = base64_1.encode(byteArray17);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray22 = new byte[] {};
        base64_21.decode(byteArray22, (int) 'a', (-1));
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22, true, true, (int) (byte) 100);
        base64_1.setInitialBuffer(byteArray29, (int) (byte) 100, (int) (byte) 0);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64((int) ' ');
        byte[] byteArray36 = base64_34.decode("");
        org.apache.commons.codec.binary.Base64 base64_38 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray39 = new byte[] {};
        base64_38.decode(byteArray39, (int) 'a', (-1));
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray39, true, true, (int) (byte) 100);
        boolean boolean47 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray46);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray46);
        byte[] byteArray49 = base64_34.encode(byteArray48);
        byte[] byteArray50 = new byte[] {};
        int int53 = base64_34.readResults(byteArray50, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            base64_1.decode(byteArray50, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(0, byteArray1, false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, false);
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        java.lang.Object obj29 = base64_0.decode((java.lang.Object) byteArray28);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray34, false, false);
        java.lang.String str38 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray37);
        byte[] byteArray40 = base64_0.encode(byteArray37);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46, false, false);
        java.math.BigInteger bigInteger50 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray49);
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray49);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray51);
        base64_0.decode(byteArray51, (-1), (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "QUdRQkFBPT0" + "'", str38, "QUdRQkFBPT0");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[81, 85, 100, 82, 81, 107, 70, 66, 80, 84, 48]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[81, 85, 100, 82, 81, 107, 70, 66, 80, 84, 48, 61]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1, 100, 10, -1, 100]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        int int8 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_11.decode(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(100, byteArray17);
        byte[] byteArray19 = base64_1.encode(byteArray17);
        java.math.BigInteger bigInteger20 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray17);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(bigInteger20);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        boolean boolean16 = base64_1.isUrlSafe();
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, false, 10);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray22);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64(0, byteArray25);
        java.lang.String str27 = base64_1.encodeToString(byteArray25);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, false);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray18);
        base64_0.encode(byteArray22, 0, 10);
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray28 = new byte[] {};
        base64_27.decode(byteArray28, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray34 = new byte[] {};
        base64_33.decode(byteArray34, (int) 'a', (-1));
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray34, true, true, (int) (byte) 100);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray41, true, false, 1);
        base64_27.setInitialBuffer(byteArray45, (int) (byte) 10, 100);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray49, false, false, 10);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray53);
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray53);
        java.lang.String str56 = base64_27.encodeToString(byteArray55);
        org.apache.commons.codec.binary.Base64 base64_58 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray59, false, false, 10);
        byte[] byteArray64 = base64_58.decode(byteArray63);
        byte[] byteArray66 = base64_58.decode("");
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray71 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67, false, false, 10);
        byte[] byteArray72 = base64_58.decode(byteArray71);
        byte[] byteArray73 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray72);
        byte[] byteArray74 = base64_27.decode(byteArray72);
        java.lang.Object obj75 = base64_0.decode((java.lang.Object) byteArray72);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[]");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[]");
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray8, false);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray13 = new byte[] {};
        base64_12.decode(byteArray13, (int) 'a', (-1));
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, true, true, (int) (byte) 100);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, true, false, 1);
        java.lang.Object obj25 = base64_10.encode((java.lang.Object) byteArray20);
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, false, false, 10);
        byte[] byteArray33 = base64_27.decode(byteArray32);
        int int36 = base64_10.readResults(byteArray32, 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        boolean boolean2 = base64_1.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(1);
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray7 = new byte[] {};
        base64_6.decode(byteArray7, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray13 = new byte[] {};
        base64_12.decode(byteArray13, (int) 'a', (-1));
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, true, true, (int) (byte) 100);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, true, false, 1);
        base64_6.setInitialBuffer(byteArray24, (int) (byte) 10, 100);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, false, false, 10);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray32);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray32);
        java.lang.String str35 = base64_6.encodeToString(byteArray34);
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray38, false, false, 10);
        byte[] byteArray43 = base64_37.decode(byteArray42);
        byte[] byteArray45 = base64_37.decode("");
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46, false, false, 10);
        byte[] byteArray51 = base64_37.decode(byteArray50);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray51);
        byte[] byteArray53 = base64_6.decode(byteArray51);
        byte[] byteArray54 = base64_4.decode(byteArray51);
        int int57 = base64_1.readResults(byteArray51, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
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
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray18 = new byte[] {};
        base64_17.decode(byteArray18, (int) 'a', (-1));
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) (byte) 100);
        boolean boolean26 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray25);
        byte[] byteArray27 = base64_1.encode(byteArray25);
        java.lang.String str28 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray27);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        byte[] byteArray0 = null;
        java.lang.String str1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, false);
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        java.lang.Object obj29 = base64_0.decode((java.lang.Object) byteArray28);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray34, false, false);
        java.lang.String str38 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray37);
        byte[] byteArray40 = base64_0.encode(byteArray37);
        org.apache.commons.codec.binary.Base64 base64_42 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43, false, false, 10);
        byte[] byteArray48 = base64_42.decode(byteArray47);
        byte[] byteArray50 = base64_42.decode("");
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray51, false, false, 10);
        byte[] byteArray56 = base64_42.decode(byteArray55);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray57, false, false, 10);
        byte[] byteArray62 = base64_42.encode(byteArray61);
        org.apache.commons.codec.binary.Base64 base64_64 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray65 = new byte[] {};
        base64_64.decode(byteArray65, (int) 'a', (-1));
        byte[] byteArray72 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray65, true, true, (int) (byte) 100);
        java.lang.String str73 = base64_42.encodeToString(byteArray72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = base64_0.encode((java.lang.Object) base64_42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "QUdRQkFBPT0" + "'", str38, "QUdRQkFBPT0");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[81, 85, 100, 82, 81, 107, 70, 66, 80, 84, 48]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[81, 85, 100, 82, 81, 107, 70, 66, 80, 84, 48, 61]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        byte[] byteArray10 = base64_2.decode("");
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, 10);
        byte[] byteArray16 = base64_2.decode(byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, false, 10);
        byte[] byteArray22 = base64_2.encode(byteArray21);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(100, byteArray22, false);
        byte[] byteArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            base64_24.decode(byteArray25, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false);
        java.lang.String str8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray7);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "QUdRQkFBPT0" + "'", str8, "QUdRQkFBPT0");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[81, 85, 100, 82, 81, 107, 70, 66, 80, 84, 48, 61, 13, 10]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        java.lang.String str21 = base64_1.encodeToString(byteArray16);
        boolean boolean22 = base64_1.isUrlSafe();
        byte[] byteArray24 = base64_1.decode("org.apache.commons.codec.DecoderException: org.apache.commons.codec.DecoderException: org.apache.commons.codec.EncoderException");
        byte[] byteArray25 = null;
        base64_1.setInitialBuffer(byteArray25, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88, -98, -118, -32, 106, -106, -100, -123, -25, 40, -102, 106, 39, -79, -54, 29, 121, -64, -34, 114, -121, 94, -84, 76, 92, 122, -101, 98, -94, 122, 43, -127, -86, 90, 114, 23, -100, -94, 105, -88, -98, -57, 40, 117, -25, 4, -99, -54, 29, 122, -79, 49, 113, -22, 109, -118, -119]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        java.lang.Class<?> wildcardClass12 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64((int) '#', byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [?d??d]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100, 10, -1, 100]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.lang.String str9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AGQBAA==]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "QUdRQkFBPT0" + "'", str9, "QUdRQkFBPT0");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[81, 85, 100, 82, 81, 107, 70, 66, 80, 84, 48]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("org.apache.commons.codec.DecoderException: hi!");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88, -98, 24]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[111, 114, 103, 97, 112, 97, 99, 104, 101, 99, 111, 109, 109, 111, 110, 115, 99, 111, 100, 101, 99, 68, 101, 99, 111, 100, 101, 114, 69, 120, 99, 101, 112, 116, 105, 111, 110, 104, 103]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, false);
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        java.lang.Object obj29 = base64_0.decode((java.lang.Object) byteArray28);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray34, false, false);
        java.lang.String str38 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray37);
        byte[] byteArray40 = base64_0.encode(byteArray37);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "QUdRQkFBPT0" + "'", str38, "QUdRQkFBPT0");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[81, 85, 100, 82, 81, 107, 70, 66, 80, 84, 48]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[81, 85, 100, 82, 81, 107, 70, 66, 80, 84, 48, 61]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[81, 85, 100, 82, 81, 107, 70, 66, 80, 84, 48, 61, 13, 10]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        int int8 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_11.decode(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(100, byteArray17);
        byte[] byteArray19 = base64_1.encode(byteArray17);
        boolean boolean20 = base64_1.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray18 = new byte[] {};
        base64_17.decode(byteArray18, (int) 'a', (-1));
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) (byte) 100);
        boolean boolean26 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray25);
        byte[] byteArray27 = base64_1.encode(byteArray25);
        byte[] byteArray29 = base64_1.decode("QUE");
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35, false, false);
        java.math.BigInteger bigInteger39 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray38);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger39);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger39);
        java.lang.Object obj42 = base64_1.encode((java.lang.Object) byteArray41);
        java.lang.Class<?> wildcardClass43 = base64_1.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) -1);
        int int2 = base64_1.avail();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray7 = base64_1.decode("QUdRQkFBPT0");
        byte[] byteArray9 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, false);
        java.math.BigInteger bigInteger21 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger21);
        java.lang.Object obj24 = base64_11.encode((java.lang.Object) byteArray23);
        java.lang.Object obj25 = base64_10.encode((java.lang.Object) byteArray23);
        java.lang.Object obj26 = base64_1.encode((java.lang.Object) byteArray23);
        org.apache.commons.codec.binary.Base64 base64_28 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray29 = new byte[] {};
        base64_28.decode(byteArray29, (int) 'a', (-1));
        byte[] byteArray34 = base64_28.decode("QUdRQkFBPT0");
        base64_1.encode(byteArray34, 10, 10);
        org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64((int) ' ');
        byte[] byteArray41 = base64_39.decode("");
        java.lang.Object obj42 = base64_1.decode((java.lang.Object) byteArray41);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray8 = new byte[] {};
        base64_7.decode(byteArray8, (int) 'a', (-1));
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, true, (int) (byte) 100);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, true, false, 1);
        base64_1.setInitialBuffer(byteArray19, (int) (byte) 10, 100);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, false, false, 10);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray27);
        java.lang.String str30 = base64_1.encodeToString(byteArray29);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray33, false, false, 10);
        byte[] byteArray38 = base64_32.decode(byteArray37);
        byte[] byteArray40 = base64_32.decode("");
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray41, false, false, 10);
        byte[] byteArray46 = base64_32.decode(byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray46);
        byte[] byteArray48 = base64_1.decode(byteArray46);
        boolean boolean49 = base64_1.hasData();
        byte[] byteArray51 = base64_1.decode("org.apache.commons.codec.DecoderException: ");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        int int8 = base64_1.avail();
        byte[] byteArray10 = base64_1.decode("org.apache.commons.codec.DecoderException: org.apache.commons.codec.EncoderException");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88, -98, -118, -32, 106, -106, -100, -123, -25, 40, -102, 106, 39, -79, -54, 29, 121, -63, 39, 114, -121, 94, -84, 76, 92, 122, -101, 98, -94]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        byte[] byteArray10 = base64_2.decode("");
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, 10);
        byte[] byteArray16 = base64_2.decode(byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, false, 10);
        byte[] byteArray22 = base64_2.encode(byteArray21);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(100, byteArray22, false);
        byte[] byteArray25 = null;
        base64_24.setInitialBuffer(byteArray25, (int) (short) 1, (int) (byte) 100);
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray31 = new byte[] {};
        base64_30.decode(byteArray31, (int) 'a', (-1));
        byte[] byteArray36 = base64_30.decode("QUdRQkFBPT0");
        byte[] byteArray38 = null;
        org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64(10, byteArray38);
        org.apache.commons.codec.binary.Base64 base64_40 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46, false, false);
        java.math.BigInteger bigInteger50 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray49);
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger50);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger50);
        java.lang.Object obj53 = base64_40.encode((java.lang.Object) byteArray52);
        java.lang.Object obj54 = base64_39.encode((java.lang.Object) byteArray52);
        java.lang.Object obj55 = base64_30.encode((java.lang.Object) byteArray52);
        java.lang.Object obj56 = base64_24.encode(obj55);
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray65 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray62, false, false);
        java.math.BigInteger bigInteger66 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray65);
        byte[] byteArray67 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger66);
        byte[] byteArray68 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger66);
        base64_24.decode(byteArray68, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[47, 50, 81, 75, 47, 50, 81, 61]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        byte[] byteArray10 = base64_2.decode("");
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, 10);
        byte[] byteArray16 = base64_2.decode(byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, false, 10);
        byte[] byteArray22 = base64_2.encode(byteArray21);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(100, byteArray22, false);
        byte[] byteArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            base64_24.decode(byteArray25, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, false, 10);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, true, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        java.lang.String str21 = base64_1.encodeToString(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, false, 10);
        byte[] byteArray29 = base64_23.decode(byteArray28);
        byte[] byteArray31 = base64_23.decode("");
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray32, false, false, 10);
        byte[] byteArray37 = base64_23.decode(byteArray36);
        org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray40 = new byte[] {};
        base64_39.decode(byteArray40, (int) 'a', (-1));
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, true, true, (int) (byte) 100);
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47, true, false, 1);
        java.lang.Object obj52 = base64_23.encode((java.lang.Object) byteArray51);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray53, false, false, 10);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray57);
        java.lang.Object obj59 = base64_23.encode((java.lang.Object) byteArray57);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray57, false);
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray61, false, false);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.decode(byteArray64, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        byte[] byteArray10 = base64_2.decode("");
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, 10);
        byte[] byteArray16 = base64_2.decode(byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray17, false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray8, false);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = base64_10.encode((java.lang.Object) encoderException11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray5);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[85, 86, 86, 70, 80, 81, 48, 75]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray7 = base64_1.decode("QUdRQkFBPT0");
        byte[] byteArray9 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, false);
        java.math.BigInteger bigInteger21 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger21);
        java.lang.Object obj24 = base64_11.encode((java.lang.Object) byteArray23);
        java.lang.Object obj25 = base64_10.encode((java.lang.Object) byteArray23);
        java.lang.Object obj26 = base64_1.encode((java.lang.Object) byteArray23);
        org.apache.commons.codec.binary.Base64 base64_28 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, false, false, 10);
        byte[] byteArray34 = base64_28.decode(byteArray33);
        byte[] byteArray36 = base64_28.decode("");
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, false, false, 10);
        byte[] byteArray42 = base64_28.decode(byteArray41);
        org.apache.commons.codec.binary.Base64 base64_44 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray45 = new byte[] {};
        base64_44.decode(byteArray45, (int) 'a', (-1));
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray45, true, true, (int) (byte) 100);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray52, true, false, 1);
        java.lang.Object obj57 = base64_28.encode((java.lang.Object) byteArray56);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray62 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray58, false, false, 10);
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray62);
        java.lang.Object obj64 = base64_28.encode((java.lang.Object) byteArray62);
        byte[] byteArray66 = org.apache.commons.codec.binary.Base64.decodeBase64("org.apache.commons.codec.DecoderException: org.apache.commons.codec.DecoderException: org.apache.commons.codec.EncoderException");
        int int69 = base64_28.readResults(byteArray66, (int) (byte) 0, 10);
        java.lang.Object obj70 = base64_1.decode((java.lang.Object) byteArray66);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[]");
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88, -98, -118, -32, 106, -106, -100, -123, -25, 40, -102, 106, 39, -79, -54, 29, 121, -64, -34, 114, -121, 94, -84, 76, 92, 122, -101, 98, -94, 122, 43, -127, -86, 90, 114, 23, -100, -94, 105, -88, -98, -57, 40, 117, -25, 4, -99, -54, 29, 122, -79, 49, 113, -22, 109, -118, -119]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(obj70);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        byte[] byteArray10 = base64_2.decode("");
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, 10);
        byte[] byteArray16 = base64_2.decode(byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, false, 10);
        byte[] byteArray22 = base64_2.encode(byteArray21);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray22, false);
        byte[] byteArray26 = base64_24.decode("QUdRQkFBPT0");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[65, 71, 81, 66, 65, 65, 61, 61]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 10);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false, 10);
        byte[] byteArray11 = base64_5.decode(byteArray10);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray11, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray11);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(76, byteArray11, true);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, true, true, (int) (byte) 100);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray20);
        java.lang.Object obj22 = base64_1.decode((java.lang.Object) byteArray20);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray10);
        byte[] byteArray15 = base64_1.encode(byteArray10);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray18 = new byte[] {};
        base64_17.decode(byteArray18, (int) 'a', (-1));
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) (byte) 100);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, true, false, 1);
        byte[] byteArray30 = base64_1.encode(byteArray29);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray33 = new byte[] {};
        base64_32.decode(byteArray33, (int) 'a', (-1));
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray33, true, true, (int) (byte) 100);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, true, false, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = base64_1.decode((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[65, 71, 81, 66, 65, 65, 61, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        byte[] byteArray10 = base64_2.decode("");
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, 10);
        byte[] byteArray16 = base64_2.decode(byteArray15);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray19 = new byte[] {};
        base64_18.decode(byteArray19, (int) 'a', (-1));
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, true, true, (int) (byte) 100);
        boolean boolean27 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray26);
        byte[] byteArray28 = base64_2.encode(byteArray26);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, false);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray30);
        java.lang.Class<?> wildcardClass32 = byteArray30.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, false);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray18);
        base64_0.encode(byteArray22, 0, 10);
        boolean boolean26 = base64_0.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100, 10, -1, 100]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true);
        boolean boolean5 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, true, false, (int) '#');
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        java.lang.Class<?> wildcardClass11 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[65, 65]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[85, 86, 86, 70, 80, 81, 48, 75]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        java.lang.String str21 = base64_1.encodeToString(byteArray16);
        boolean boolean22 = base64_1.isUrlSafe();
        byte[] byteArray23 = null;
        int int26 = base64_1.readResults(byteArray23, (int) (byte) 1, 76);
        org.apache.commons.codec.DecoderException decoderException28 = new org.apache.commons.codec.DecoderException("org.apache.commons.codec.EncoderException");
        org.apache.commons.codec.DecoderException decoderException29 = new org.apache.commons.codec.DecoderException((java.lang.Throwable) decoderException28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = base64_1.decode((java.lang.Object) decoderException29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray1);
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false, 10);
        byte[] byteArray10 = base64_4.decode(byteArray9);
        byte[] byteArray12 = base64_4.decode("");
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, false, false, 10);
        byte[] byteArray18 = base64_4.decode(byteArray17);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray21 = new byte[] {};
        base64_20.decode(byteArray21, (int) 'a', (-1));
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21, true, true, (int) (byte) 100);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, true, false, 1);
        java.lang.Object obj33 = base64_4.encode((java.lang.Object) byteArray32);
        byte[] byteArray35 = new byte[] { (byte) 0 };
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35, false, true);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray38);
        int int42 = base64_4.readResults(byteArray38, 1, (int) (short) -1);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray38, true, false);
        // The following exception was thrown during execution in test generation
        try {
            base64_2.decode(byteArray38, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[81, 85, 69, 61, 13, 10]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, false, 10);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray5);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray8);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray7 = base64_1.decode("QUdRQkFBPT0");
        byte[] byteArray9 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, false);
        java.math.BigInteger bigInteger21 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger21);
        java.lang.Object obj24 = base64_11.encode((java.lang.Object) byteArray23);
        java.lang.Object obj25 = base64_10.encode((java.lang.Object) byteArray23);
        java.lang.Object obj26 = base64_1.encode((java.lang.Object) byteArray23);
        byte[] byteArray28 = base64_1.decode("org.apache.commons.codec.EncoderException");
        boolean boolean29 = base64_1.hasData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 73, -36, -95, -41, -85, 19, 23, 30, -90, -40, -88]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray8, false);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 10);
        byte[] byteArray9 = base64_3.decode(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(100, byteArray9);
        boolean boolean11 = base64_10.hasData();
        byte[] byteArray13 = base64_10.decode("QUdRQkFBPT0=\r\n");
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AGQBAA==]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "QUdRQkFBPT0=\r\n" + "'", str14, "QUdRQkFBPT0=\r\n");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        base64_3.decode(byteArray4, (int) 'a', (-1));
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray12);
        byte[] byteArray17 = base64_3.encode(byteArray12);
        java.lang.Object obj18 = base64_1.encode((java.lang.Object) byteArray12);
        byte[] byteArray20 = base64_1.decode("LzJRSy8yUT0");
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[65, 71, 81, 66, 65, 65, 61, 61, 13, 10]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[76, 122, 74, 82, 83, 121, 56, 121, 85, 84, 48, 61]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("org.apache.commons.codec.DecoderException: org.apache.commons.codec.DecoderException: ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88, -98, -118, -32, 106, -106, -100, -123, -25, 40, -102, 106, 39, -79, -54, 29, 121, -64, -34, 114, -121, 94, -84, 76, 92, 122, -101, 98, -94]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        byte[] byteArray3 = base64_1.decode("");
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray6 = new byte[] {};
        base64_5.decode(byteArray6, (int) 'a', (-1));
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, true, true, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray13);
        byte[] byteArray16 = base64_1.encode(byteArray15);
        byte[] byteArray17 = new byte[] {};
        int int20 = base64_1.readResults(byteArray17, 1, (int) '4');
        java.lang.String str21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray17);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray18 = new byte[] {};
        base64_17.decode(byteArray18, (int) 'a', (-1));
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) (byte) 100);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, true, false, 1);
        java.lang.Object obj30 = base64_1.encode((java.lang.Object) byteArray29);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray33, false, false, 10);
        byte[] byteArray38 = base64_32.decode(byteArray37);
        byte[] byteArray40 = base64_32.decode("");
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray41, false, false, 10);
        byte[] byteArray46 = base64_32.decode(byteArray45);
        org.apache.commons.codec.binary.Base64 base64_48 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray49 = new byte[] {};
        base64_48.decode(byteArray49, (int) 'a', (-1));
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray49, true, true, (int) (byte) 100);
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray56, true, false, 1);
        java.lang.Object obj61 = base64_32.encode((java.lang.Object) byteArray60);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray66 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray62, false, false, 10);
        byte[] byteArray67 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray66);
        java.lang.Object obj68 = base64_32.encode((java.lang.Object) byteArray66);
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray66);
        byte[] byteArray70 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray66);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray70, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[]");
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray9);
        boolean boolean12 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0, byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [/2QK/2Q=]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(100, byteArray8);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, false, false, 10);
        byte[] byteArray18 = base64_12.decode(byteArray17);
        byte[] byteArray20 = base64_12.decode("");
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21, false, false, 10);
        byte[] byteArray26 = base64_12.decode(byteArray25);
        org.apache.commons.codec.binary.Base64 base64_28 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray29 = new byte[] {};
        base64_28.decode(byteArray29, (int) 'a', (-1));
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, true, true, (int) (byte) 100);
        boolean boolean37 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray36);
        byte[] byteArray38 = base64_12.encode(byteArray36);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray36, false);
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray40);
        java.lang.Object obj42 = base64_9.encode((java.lang.Object) byteArray40);
        boolean boolean43 = base64_9.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false, 10);
        byte[] byteArray10 = base64_4.decode(byteArray9);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray10, false);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(76, byteArray10, true);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, true, (int) (byte) 100);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((-1), byteArray19);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, false);
        java.math.BigInteger bigInteger31 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger31);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger31);
        java.lang.Object obj34 = base64_21.encode((java.lang.Object) byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray39, false, false);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray39);
        base64_21.encode(byteArray43, 0, 10);
        byte[] byteArray48 = new byte[] { (byte) 0 };
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray48, false, true);
        byte[] byteArray52 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray51);
        byte[] byteArray53 = base64_21.decode(byteArray51);
        java.lang.Object obj54 = base64_20.decode((java.lang.Object) byteArray51);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray56, false, false, 10);
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray60, false, false, 100);
        org.apache.commons.codec.binary.Base64 base64_66 = new org.apache.commons.codec.binary.Base64((int) (short) 0, byteArray60, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = base64_20.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0]");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray18 = new byte[] {};
        base64_17.decode(byteArray18, (int) 'a', (-1));
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) (byte) 100);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, true, false, 1);
        java.lang.Object obj30 = base64_1.encode((java.lang.Object) byteArray29);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray31, false, false, 10);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray35);
        java.lang.Object obj37 = base64_1.encode((java.lang.Object) byteArray35);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray35);
        java.lang.String str39 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray35);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        byte[] byteArray21 = base64_1.encode(byteArray20);
        int int22 = base64_1.avail();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, false, 10);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray4);
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray4);
        boolean boolean7 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray4);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("org.apache.commons.codec.DecoderException: ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, false, 10);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 100);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray4);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) ' ');
        byte[] byteArray4 = base64_2.decode("");
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray7 = new byte[] {};
        base64_6.decode(byteArray7, (int) 'a', (-1));
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, true, true, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        byte[] byteArray17 = base64_2.encode(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray17);
        boolean boolean19 = base64_18.hasData();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray7 = base64_1.decode("QUdRQkFBPT0");
        boolean boolean8 = base64_1.isUrlSafe();
        boolean boolean9 = base64_1.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 10);
        byte[] byteArray9 = base64_3.decode(byteArray8);
        byte[] byteArray11 = base64_3.decode("");
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_3.decode(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray20 = new byte[] {};
        base64_19.decode(byteArray20, (int) 'a', (-1));
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, true, true, (int) (byte) 100);
        boolean boolean28 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray27);
        byte[] byteArray29 = base64_3.encode(byteArray27);
        byte[] byteArray30 = base64_1.decode(byteArray27);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 10);
        int int2 = base64_1.avail();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (14) than the specified maxium size of 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[47, 50, 81, 75, 47, 50, 81, 61]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 10);
        byte[] byteArray9 = base64_3.decode(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(100, byteArray9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray9);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray7 = new byte[] { (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, true);
        base64_1.setInitialBuffer(byteArray7, (int) (byte) -1, (int) '#');
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, false);
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = base64_1.decode((java.lang.Object) bigInteger23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 100, 10, -1, 100]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[95, 50, 81, 75, 95, 50, 81]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, false);
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        byte[] byteArray29 = base64_0.decode(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray29);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 100, -1, 100]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray8 = new byte[] {};
        base64_7.decode(byteArray8, (int) 'a', (-1));
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, true, (int) (byte) 100);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, true, false, 1);
        base64_1.setInitialBuffer(byteArray19, (int) (byte) 10, 100);
        int int23 = base64_1.avail();
        byte[] byteArray24 = null;
        int int27 = base64_1.readResults(byteArray24, (int) (short) 10, (int) (byte) -1);
        boolean boolean28 = base64_1.hasData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("/2QK/2Q=\r\n");
        boolean boolean2 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        base64_3.decode(byteArray4, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray10 = new byte[] {};
        base64_9.decode(byteArray10, (int) 'a', (-1));
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, true, (int) (byte) 100);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, true, false, 1);
        base64_3.setInitialBuffer(byteArray21, (int) (byte) 10, 100);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, false, 10);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray29);
        java.lang.String str32 = base64_3.encodeToString(byteArray31);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35, false, false, 10);
        byte[] byteArray40 = base64_34.decode(byteArray39);
        byte[] byteArray42 = base64_34.decode("");
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43, false, false, 10);
        byte[] byteArray48 = base64_34.decode(byteArray47);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray48);
        byte[] byteArray50 = base64_3.decode(byteArray48);
        byte[] byteArray51 = base64_1.decode(byteArray48);
        org.apache.commons.codec.DecoderException decoderException54 = new org.apache.commons.codec.DecoderException("org.apache.commons.codec.EncoderException");
        org.apache.commons.codec.DecoderException decoderException55 = new org.apache.commons.codec.DecoderException("", (java.lang.Throwable) decoderException54);
        java.lang.Throwable[] throwableArray56 = decoderException54.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = base64_1.encode((java.lang.Object) throwableArray56);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, false, 10);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray4);
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray4);
        java.lang.String str7 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray4);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, true, false, 1);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        java.lang.String str21 = base64_1.encodeToString(byteArray16);
        boolean boolean22 = base64_1.isUrlSafe();
        byte[] byteArray24 = base64_1.decode("org.apache.commons.codec.DecoderException: org.apache.commons.codec.DecoderException: org.apache.commons.codec.EncoderException");
        java.lang.String str25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray24);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88, -98, -118, -32, 106, -106, -100, -123, -25, 40, -102, 106, 39, -79, -54, 29, 121, -64, -34, 114, -121, 94, -84, 76, 92, 122, -101, 98, -94, 122, 43, -127, -86, 90, 114, 23, -100, -94, 105, -88, -98, -57, 40, 117, -25, 4, -99, -54, 29, 122, -79, 49, 113, -22, 109, -118, -119]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "orgapachecommonscodecDecoderExceptionorgapachecommonscodecDecoderExceptionorgapachecommonscodecEncoderExceptiok" + "'", str25, "orgapachecommonscodecDecoderExceptionorgapachecommonscodecDecoderExceptionorgapachecommonscodecEncoderExceptiok");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 10);
        byte[] byteArray9 = base64_3.decode(byteArray8);
        byte[] byteArray11 = base64_3.decode("");
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_3.decode(byteArray16);
        base64_1.setInitialBuffer(byteArray17, 1, 0);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, false, 10);
        byte[] byteArray29 = base64_23.decode(byteArray28);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray29, false);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray34 = new byte[] {};
        base64_33.decode(byteArray34, (int) 'a', (-1));
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray34, true, true, (int) (byte) 100);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray41, true, false, 1);
        java.lang.Object obj46 = base64_31.encode((java.lang.Object) byteArray41);
        byte[] byteArray47 = base64_1.encode(byteArray41);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, false, false);
        base64_1.setInitialBuffer(byteArray10, (int) '#', (int) (byte) -1);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) ' ');
        byte[] byteArray17 = base64_15.decode("");
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray20 = new byte[] {};
        base64_19.decode(byteArray20, (int) 'a', (-1));
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, true, true, (int) (byte) 100);
        boolean boolean28 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        byte[] byteArray30 = base64_15.encode(byteArray29);
        byte[] byteArray31 = base64_1.decode(byteArray30);
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException("LzJRSy8yUT0");
        org.apache.commons.codec.DecoderException decoderException34 = new org.apache.commons.codec.DecoderException((java.lang.Throwable) encoderException33);
        org.apache.commons.codec.DecoderException decoderException35 = new org.apache.commons.codec.DecoderException((java.lang.Throwable) decoderException34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = base64_1.encode((java.lang.Object) decoderException34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 100, 10, -1, 100]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        byte[] byteArray21 = base64_1.encode(byteArray20);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray24 = new byte[] {};
        base64_23.decode(byteArray24, (int) 'a', (-1));
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, true, true, (int) (byte) 100);
        java.lang.String str32 = base64_1.encodeToString(byteArray31);
        byte[] byteArray34 = new byte[] { (byte) 0 };
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray34, false, true);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray37);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, true);
        base64_1.setInitialBuffer(byteArray40, (int) (byte) -1, 0);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray40);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[81, 85, 69, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[81, 85, 69, 61]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray8 = new byte[] {};
        base64_7.decode(byteArray8, (int) 'a', (-1));
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, true, (int) (byte) 100);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, true, false, 1);
        base64_1.setInitialBuffer(byteArray19, (int) (byte) 10, 100);
        byte[] byteArray23 = null;
        byte[] byteArray24 = base64_1.encode(byteArray23);
        byte[] byteArray26 = new byte[] { (byte) 0 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, false, true);
        boolean boolean30 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray29);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, true, false, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            base64_1.decode(byteArray34, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[65, 65]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[81, 85, 69, 61, 13, 10]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        int int8 = base64_1.avail();
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false, 10);
        byte[] byteArray17 = base64_11.decode(byteArray16);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(100, byteArray17);
        byte[] byteArray19 = base64_1.encode(byteArray17);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21, false, false, 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        byte[] byteArray21 = base64_1.encode(byteArray20);
        java.lang.String str22 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray20);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, true, true, 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[47, 50, 81, 75, 47, 50, 81, 61]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray18 = new byte[] {};
        base64_17.decode(byteArray18, (int) 'a', (-1));
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, true, true, (int) (byte) 100);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, true, false, 1);
        java.lang.Object obj30 = base64_1.encode((java.lang.Object) byteArray29);
        byte[] byteArray32 = new byte[] { (byte) 0 };
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray32, false, true);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray35);
        int int39 = base64_1.readResults(byteArray35, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray42 = new byte[] {};
        base64_41.decode(byteArray42, (int) 'a', (-1));
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray50, false, false);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray50);
        byte[] byteArray55 = base64_41.encode(byteArray50);
        org.apache.commons.codec.binary.Base64 base64_57 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray58 = new byte[] {};
        base64_57.decode(byteArray58, (int) 'a', (-1));
        byte[] byteArray65 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray58, true, true, (int) (byte) 100);
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray65, true, false, 1);
        byte[] byteArray70 = base64_41.encode(byteArray69);
        byte[] byteArray71 = base64_1.decode(byteArray70);
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray79 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray76, false, false);
        java.math.BigInteger bigInteger80 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray76);
        java.lang.Object obj81 = base64_1.encode((java.lang.Object) byteArray76);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[65, 71, 81, 66, 65, 65, 61, 61, 13, 10]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[]");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[]");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(obj81);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[76, 122, 74, 82, 83, 121, 56, 121, 85, 84, 48]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, false);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger9);
        java.math.BigInteger bigInteger11 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 81, 61, 61]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        base64_3.decode(byteArray4, (int) 'a', (-1));
        byte[] byteArray9 = base64_3.decode("QUdRQkFBPT0");
        java.lang.String str10 = base64_1.encodeToString(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray9);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "QUdRQkFBPT0=\r\n" + "'", str10, "QUdRQkFBPT0=\r\n");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[65, 71, 81, 66, 65, 65, 61, 61]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("AGQBAA==\r\n");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[65, 71, 81, 66, 65, 65, 61, 61]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        java.lang.String str21 = base64_1.encodeToString(byteArray16);
        boolean boolean22 = base64_1.isUrlSafe();
        byte[] byteArray23 = null;
        int int26 = base64_1.readResults(byteArray23, (int) (byte) 1, 76);
        org.apache.commons.codec.binary.Base64 base64_28 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray29 = new byte[] {};
        base64_28.decode(byteArray29, (int) 'a', (-1));
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, true, true, (int) (byte) 100);
        byte[] byteArray37 = base64_1.decode(byteArray29);
        byte[] byteArray38 = null;
        byte[] byteArray39 = base64_1.decode(byteArray38);
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = base64_1.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNull(byteArray39);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, false, 10);
        byte[] byteArray13 = base64_7.decode(byteArray12);
        byte[] byteArray15 = base64_7.decode("");
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        byte[] byteArray21 = base64_7.decode(byteArray20);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray24 = new byte[] {};
        base64_23.decode(byteArray24, (int) 'a', (-1));
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, true, true, (int) (byte) 100);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray31, true, false, 1);
        java.lang.Object obj36 = base64_7.encode((java.lang.Object) byteArray35);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray37, false, false, 10);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray41);
        java.lang.Object obj43 = base64_7.encode((java.lang.Object) byteArray41);
        java.lang.Object obj44 = base64_1.encode((java.lang.Object) byteArray41);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[81, 85, 100, 82, 81, 107, 70, 66, 80, 84, 48, 61]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray8 = new byte[] {};
        base64_7.decode(byteArray8, (int) 'a', (-1));
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, true, (int) (byte) 100);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, true, false, 1);
        base64_1.setInitialBuffer(byteArray19, (int) (byte) 10, 100);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, false, false, 10);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray27);
        java.lang.String str30 = base64_1.encodeToString(byteArray29);
        boolean boolean31 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray29);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 10);
        byte[] byteArray9 = base64_3.decode(byteArray8);
        byte[] byteArray10 = base64_1.encode(byteArray9);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        byte[] byteArray10 = base64_2.decode("");
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, false, 10);
        byte[] byteArray16 = base64_2.decode(byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray15);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64((int) (short) 0, byteArray17);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.decodeBase64("org.apache.commons.codec.DecoderException: hi!");
        java.math.BigInteger bigInteger21 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray20);
        byte[] byteArray22 = base64_18.encode(byteArray20);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88, -98, 24]");
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[111, 114, 103, 97, 112, 97, 99, 104, 101, 99, 111, 109, 109, 111, 110, 115, 99, 111, 100, 101, 99, 68, 101, 99, 111, 100, 101, 114, 69, 120, 99, 101, 112, 116, 105, 111, 110, 104, 103, 61]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray7 = base64_1.decode("QUdRQkFBPT0");
        byte[] byteArray9 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17, false, false);
        java.math.BigInteger bigInteger21 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger21);
        java.lang.Object obj24 = base64_11.encode((java.lang.Object) byteArray23);
        java.lang.Object obj25 = base64_10.encode((java.lang.Object) byteArray23);
        java.lang.Object obj26 = base64_1.encode((java.lang.Object) byteArray23);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, true);
        java.lang.String str29 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray28);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, false, false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[76, 122, 74, 82, 83, 121, 56, 121, 85, 84, 48, 61, 13, 10]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "THpKUlN5OHlVVDA9DQo=\r\n" + "'", str29, "THpKUlN5OHlVVDA9DQo=\r\n");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[84, 72, 112, 75, 85, 108, 78, 53, 79, 72, 108, 86, 86, 68, 65, 57, 68, 81, 111, 61]");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray8);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[65, 71, 81, 66, 65, 65, 61, 61, 13, 10]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray8 = new byte[] {};
        base64_7.decode(byteArray8, (int) 'a', (-1));
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, true, (int) (byte) 100);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, true, false, 1);
        base64_1.setInitialBuffer(byteArray19, (int) (byte) 10, 100);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, false, false, 10);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray27);
        java.lang.String str30 = base64_1.encodeToString(byteArray29);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray33, false, false, 10);
        byte[] byteArray38 = base64_32.decode(byteArray37);
        byte[] byteArray40 = base64_32.decode("");
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray41, false, false, 10);
        byte[] byteArray46 = base64_32.decode(byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray46);
        byte[] byteArray48 = base64_1.decode(byteArray46);
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray51 = new byte[] {};
        base64_50.decode(byteArray51, (int) 'a', (-1));
        byte[] byteArray56 = base64_50.decode("QUdRQkFBPT0");
        byte[] byteArray58 = null;
        org.apache.commons.codec.binary.Base64 base64_59 = new org.apache.commons.codec.binary.Base64(10, byteArray58);
        org.apache.commons.codec.binary.Base64 base64_60 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray66, false, false);
        java.math.BigInteger bigInteger70 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray69);
        byte[] byteArray71 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger70);
        byte[] byteArray72 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger70);
        java.lang.Object obj73 = base64_60.encode((java.lang.Object) byteArray72);
        java.lang.Object obj74 = base64_59.encode((java.lang.Object) byteArray72);
        java.lang.Object obj75 = base64_50.encode((java.lang.Object) byteArray72);
        byte[] byteArray76 = base64_1.encode(byteArray72);
        boolean boolean77 = base64_1.hasData();
        byte[] byteArray83 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray86 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray83, false, false);
        java.math.BigInteger bigInteger87 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray86);
        byte[] byteArray88 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray86);
        byte[] byteArray89 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray88);
        base64_1.setInitialBuffer(byteArray88, 0, (int) '#');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[76, 122, 74, 82, 83, 121, 56, 121, 85, 84, 48, 61, 13, 10]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[-1, 100, 10, -1, 100]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("org.apache.commons.codec.DecoderException: LzJRSy8yUT0");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88, -100, -68, -55, 69, 44, -68, -55, 68, -12]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        base64_3.decode(byteArray4, (int) 'a', (-1));
        byte[] byteArray9 = base64_3.decode("QUdRQkFBPT0");
        java.lang.String str10 = base64_1.encodeToString(byteArray9);
        boolean boolean11 = base64_1.hasData();
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.decodeBase64("org.apache.commons.codec.DecoderException: hi!");
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger14);
        byte[] byteArray16 = base64_1.encode(byteArray15);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "QUdRQkFBPT0=\r\n" + "'", str10, "QUdRQkFBPT0=\r\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88, -98, 24]");
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[121, 114, 112, 55]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[101, 88, 74, 119, 78, 119, 61, 61, 13, 10]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, false, false, 10);
        byte[] byteArray7 = base64_1.decode(byteArray6);
        byte[] byteArray9 = base64_1.decode("");
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, false, 10);
        byte[] byteArray15 = base64_1.decode(byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, 10);
        java.lang.String str21 = base64_1.encodeToString(byteArray16);
        boolean boolean22 = base64_1.isUrlSafe();
        boolean boolean23 = base64_1.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("AGQBAA==\r\n");
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[65, 71, 81, 66, 65, 65, 61, 61]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray4 = new byte[] {};
        base64_3.decode(byteArray4, (int) 'a', (-1));
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, false);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray12);
        byte[] byteArray17 = base64_3.encode(byteArray12);
        java.lang.Object obj18 = base64_1.encode((java.lang.Object) byteArray12);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24, false, false);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray27);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray27);
        byte[] byteArray31 = base64_1.encode(byteArray27);
        java.lang.Object obj32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = base64_1.decode(obj32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[65, 71, 81, 66, 65, 65, 61, 61, 13, 10]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[76, 122, 74, 82, 83, 121, 56, 121, 85, 84, 48]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[76, 122, 74, 82, 83, 121, 56, 121, 85, 84, 48, 61, 13, 10]");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("org.apache.commons.codec.DecoderException");
        java.lang.String str2 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-94, -72, 26, -91, -89, 33, 121, -54, 38, -102, -119, -20, 114, -121, 94, 112, 55, -100, -95, -41, -85, 19, 23, 30, -90, -40, -88]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "orgapachecommonscodecDecoderExceptio\r\n" + "'", str2, "orgapachecommonscodecDecoderExceptio\r\n");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(10, byteArray1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, false);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        java.lang.Object obj16 = base64_3.encode((java.lang.Object) byteArray15);
        java.lang.Object obj17 = base64_2.encode((java.lang.Object) byteArray15);
        byte[] byteArray18 = null;
        base64_2.encode(byteArray18, (-1), 0);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, false, 10);
        byte[] byteArray30 = base64_24.decode(byteArray29);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64(100, byteArray30);
        boolean boolean32 = base64_31.hasData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = base64_2.decode((java.lang.Object) boolean32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false, 10);
        byte[] byteArray8 = base64_2.decode(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(100, byteArray8);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, false, false, 10);
        byte[] byteArray18 = base64_12.decode(byteArray17);
        byte[] byteArray20 = base64_12.decode("");
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray21, false, false, 10);
        byte[] byteArray26 = base64_12.decode(byteArray25);
        org.apache.commons.codec.binary.Base64 base64_28 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray29 = new byte[] {};
        base64_28.decode(byteArray29, (int) 'a', (-1));
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, true, true, (int) (byte) 100);
        boolean boolean37 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray36);
        byte[] byteArray38 = base64_12.encode(byteArray36);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray36, false);
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray40);
        java.lang.Object obj42 = base64_9.encode((java.lang.Object) byteArray40);
        int int43 = base64_9.avail();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, false, 10);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false, 100);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray4);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false, false, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray2 = new byte[] {};
        base64_1.decode(byteArray2, (int) 'a', (-1));
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, false);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger10);
        java.lang.Object obj13 = base64_0.encode((java.lang.Object) byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, false);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray18);
        base64_0.encode(byteArray22, 0, 10);
        byte[] byteArray27 = new byte[] { (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, true);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray30);
        byte[] byteArray32 = base64_0.decode(byteArray30);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64((int) ' ');
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray37 = new byte[] {};
        base64_36.decode(byteArray37, (int) 'a', (-1));
        byte[] byteArray42 = base64_36.decode("QUdRQkFBPT0");
        java.lang.String str43 = base64_34.encodeToString(byteArray42);
        org.apache.commons.codec.binary.Base64 base64_45 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46, false, false, 10);
        byte[] byteArray51 = base64_45.decode(byteArray50);
        byte[] byteArray53 = base64_45.decode("");
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray54, false, false, 10);
        byte[] byteArray59 = base64_45.decode(byteArray58);
        org.apache.commons.codec.binary.Base64 base64_61 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray62 = new byte[] {};
        base64_61.decode(byteArray62, (int) 'a', (-1));
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray62, true, true, (int) (byte) 100);
        boolean boolean70 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray69);
        byte[] byteArray71 = base64_45.encode(byteArray69);
        byte[] byteArray72 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray71);
        base64_34.decode(byteArray71, (int) (short) 10, (int) 'a');
        byte[] byteArray76 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray71);
        base64_0.setInitialBuffer(byteArray76, (int) ' ', (int) (byte) 100);
        boolean boolean80 = base64_0.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100, 10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[47, 50, 81, 75, 47, 50, 81, 61]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[65, 65]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "QUdRQkFBPT0=\r\n" + "'", str43, "QUdRQkFBPT0=\r\n");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[]");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false);
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[65, 71, 81, 66, 65, 65, 61, 61]");
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }
}


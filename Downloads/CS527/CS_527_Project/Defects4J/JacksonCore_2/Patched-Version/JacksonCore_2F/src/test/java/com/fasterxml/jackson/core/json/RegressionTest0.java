package com.fasterxml.jackson.core.json;

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
        int[] intArray4 = new int[] { ' ', 56319, (short) 10, (byte) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 56319, 10, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 56319, 10, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long33 = jsonParser30.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@3d63becf; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator32.writeEndObject();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Current context not an object but ROOT");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        // The following exception was thrown during execution in test generation
        try {
            uTF32Reader18.freeBuffers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        jsonGenerator32.writeOmittedField("");
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator36 = jsonFactory35.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext37 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext38 = null;
        java.io.InputStream inputStream39 = null;
        byte[] byteArray40 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream43 = new com.fasterxml.jackson.core.io.MergedStream(iOContext38, inputStream39, byteArray40, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext44 = null;
        java.io.InputStream inputStream45 = null;
        byte[] byteArray46 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream49 = new com.fasterxml.jackson.core.io.MergedStream(iOContext44, inputStream45, byteArray46, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader53 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext37, inputStream39, byteArray46, 0, 0, false);
        char[] charArray56 = new char[] { ' ', '#' };
        int int57 = uTF32Reader53.read(charArray56);
        char[] charArray61 = new char[] { ' ', '#', '4' };
        int int64 = uTF32Reader53.read(charArray61, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser65 = jsonFactory35.createParser((java.io.Reader) uTF32Reader53);
        int int67 = jsonParser65.nextIntValue((int) 'a');
        jsonParser65.close();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator32.copyCurrentStructure(jsonParser65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNull(inputDecorator36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[ , #]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(jsonParser65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.JsonFactory.Feature feature33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory0.disable(feature33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        jsonGenerator32.writeObjectFieldStart("");
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator36 = jsonFactory35.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext37 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext38 = null;
        java.io.InputStream inputStream39 = null;
        byte[] byteArray40 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream43 = new com.fasterxml.jackson.core.io.MergedStream(iOContext38, inputStream39, byteArray40, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext44 = null;
        java.io.InputStream inputStream45 = null;
        byte[] byteArray46 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream49 = new com.fasterxml.jackson.core.io.MergedStream(iOContext44, inputStream45, byteArray46, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader53 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext37, inputStream39, byteArray46, 0, 0, false);
        char[] charArray56 = new char[] { ' ', '#' };
        int int57 = uTF32Reader53.read(charArray56);
        char[] charArray61 = new char[] { ' ', '#', '4' };
        int int64 = uTF32Reader53.read(charArray61, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser65 = jsonFactory35.createParser((java.io.Reader) uTF32Reader53);
        java.lang.Object obj66 = jsonParser65.getTypeId();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator32.copyCurrentStructure(jsonParser65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNull(inputDecorator36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[ , #]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(jsonParser65);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.close();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        com.fasterxml.jackson.core.io.IOContext iOContext31 = null;
        java.io.InputStream inputStream32 = null;
        byte[] byteArray33 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream36 = new com.fasterxml.jackson.core.io.MergedStream(iOContext31, inputStream32, byteArray33, 0, (int) (short) -1);
        int int37 = mergedStream36.available();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory0.createParser((java.io.InputStream) mergedStream36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType20 = jsonParser19.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@540be484; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        int int33 = jsonParser30.getFeatureMask();
        int int35 = jsonParser30.getValueAsInt(3);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        boolean boolean35 = jsonGenerator32.isClosed();
        jsonGenerator32.writeNumber(100.0d);
        char[] charArray42 = new char[] { 'a', 'a', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator32.writeRaw(charArray42, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "aaa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "aaa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, a, a, 4]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.Object obj31 = jsonParser30.getTypeId();
        char[] charArray32 = jsonParser30.getTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean33 = jsonParser30.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(charArray32);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        java.io.InputStream inputStream41 = null;
        byte[] byteArray42 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream45 = new com.fasterxml.jackson.core.io.MergedStream(iOContext40, inputStream41, byteArray42, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader49 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext33, inputStream35, byteArray42, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory0.createParser(byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = jsonParser50.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@67553940; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(jsonParser50);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.Object obj31 = jsonParser30.getTypeId();
        com.fasterxml.jackson.core.Base64Variant base64Variant32 = null;
        java.io.OutputStream outputStream33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = jsonParser30.readBinaryValue(base64Variant32, outputStream33);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@7717aa0e; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        java.io.InputStream inputStream41 = null;
        byte[] byteArray42 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream45 = new com.fasterxml.jackson.core.io.MergedStream(iOContext40, inputStream41, byteArray42, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader49 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext33, inputStream35, byteArray42, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory0.createParser(byteArray42);
        com.fasterxml.jackson.core.io.IOContext iOContext51 = null;
        java.io.InputStream inputStream52 = null;
        byte[] byteArray53 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream56 = new com.fasterxml.jackson.core.io.MergedStream(iOContext51, inputStream52, byteArray53, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser57 = jsonFactory0.createJsonParser((java.io.InputStream) mergedStream56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.format.InputAccessor inputAccessor33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.format.MatchStrength matchStrength34 = jsonFactory0.hasFormat(inputAccessor33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        boolean boolean20 = jsonFactory0.requiresPropertyOrdering();
        java.lang.String str21 = jsonFactory0.getFormatName();
        java.io.File file22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory0.createParser(file22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "JSON" + "'", str21, "JSON");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.String str31 = jsonParser30.nextTextValue();
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = jsonParser30.getSchema();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(formatSchema32);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory0.createJsonParser("JSON");
        java.io.File file35 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding36 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonFactory0.createJsonGenerator(file35, jsonEncoding36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertTrue("'" + jsonEncoding36 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF32_LE + "'", jsonEncoding36.equals(com.fasterxml.jackson.core.JsonEncoding.UTF32_LE));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = jsonFactory5.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream13 = new com.fasterxml.jackson.core.io.MergedStream(iOContext8, inputStream9, byteArray10, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream19 = new com.fasterxml.jackson.core.io.MergedStream(iOContext14, inputStream15, byteArray16, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader23 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext7, inputStream9, byteArray16, 0, 0, false);
        char[] charArray26 = new char[] { ' ', '#' };
        int int27 = uTF32Reader23.read(charArray26);
        char[] charArray31 = new char[] { ' ', '#', '4' };
        int int34 = uTF32Reader23.read(charArray31, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory5.createParser((java.io.Reader) uTF32Reader23);
        java.io.Writer writer36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonFactory5.createJsonGenerator(writer36);
        boolean boolean38 = jsonGenerator37.isClosed();
        defaultPrettyPrinter4.writeObjectFieldValueSeparator(jsonGenerator37);
        com.fasterxml.jackson.core.SerializableString serializableString40 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = jsonGenerator37.setRootValueSeparator(serializableString40);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator41.writeEndArray();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Current context not an ARRAY but ROOT");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonGenerator41);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory0.setCodec(objectCodec33);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory34.createGenerator(writer35);
        java.io.Writer writer37 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = jsonFactory34.createGenerator(writer37);
        java.io.File file39 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = jsonFactory34.createGenerator(file39, jsonEncoding40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(jsonGenerator38);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.SerializableString serializableString3 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0, serializableString3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = jsonFactory5.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream13 = new com.fasterxml.jackson.core.io.MergedStream(iOContext8, inputStream9, byteArray10, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream19 = new com.fasterxml.jackson.core.io.MergedStream(iOContext14, inputStream15, byteArray16, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader23 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext7, inputStream9, byteArray16, 0, 0, false);
        char[] charArray26 = new char[] { ' ', '#' };
        int int27 = uTF32Reader23.read(charArray26);
        char[] charArray31 = new char[] { ' ', '#', '4' };
        int int34 = uTF32Reader23.read(charArray31, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory5.createParser((java.io.Reader) uTF32Reader23);
        java.io.Writer writer36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonFactory5.createJsonGenerator(writer36);
        boolean boolean38 = jsonGenerator37.isClosed();
        jsonGenerator37.writeStartObject();
        boolean boolean40 = jsonGenerator37.isClosed();
        defaultPrettyPrinter4.writeEndObject(jsonGenerator37, (int) (short) 0);
        org.junit.Assert.assertNull(inputDecorator6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        boolean boolean35 = jsonGenerator32.isClosed();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext36 = jsonGenerator32.getOutputContext();
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator38 = jsonFactory37.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        java.io.InputStream inputStream41 = null;
        byte[] byteArray42 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream45 = new com.fasterxml.jackson.core.io.MergedStream(iOContext40, inputStream41, byteArray42, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext46 = null;
        java.io.InputStream inputStream47 = null;
        byte[] byteArray48 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream51 = new com.fasterxml.jackson.core.io.MergedStream(iOContext46, inputStream47, byteArray48, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader55 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext39, inputStream41, byteArray48, 0, 0, false);
        char[] charArray58 = new char[] { ' ', '#' };
        int int59 = uTF32Reader55.read(charArray58);
        char[] charArray63 = new char[] { ' ', '#', '4' };
        int int66 = uTF32Reader55.read(charArray63, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser67 = jsonFactory37.createParser((java.io.Reader) uTF32Reader55);
        int int69 = jsonParser67.nextIntValue((int) 'a');
        int int70 = jsonParser67.getFeatureMask();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator32.copyCurrentEvent(jsonParser67);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext36);
        org.junit.Assert.assertNull(inputDecorator38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[ , #]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(jsonParser67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 97 + "'", int69 == 97);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = jsonParser19.readBinaryValue(outputStream20);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@3a396c32; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = jsonFactory5.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream13 = new com.fasterxml.jackson.core.io.MergedStream(iOContext8, inputStream9, byteArray10, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream19 = new com.fasterxml.jackson.core.io.MergedStream(iOContext14, inputStream15, byteArray16, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader23 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext7, inputStream9, byteArray16, 0, 0, false);
        char[] charArray26 = new char[] { ' ', '#' };
        int int27 = uTF32Reader23.read(charArray26);
        char[] charArray31 = new char[] { ' ', '#', '4' };
        int int34 = uTF32Reader23.read(charArray31, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory5.createParser((java.io.Reader) uTF32Reader23);
        java.io.Writer writer36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonFactory5.createJsonGenerator(writer36);
        boolean boolean38 = jsonGenerator37.isClosed();
        defaultPrettyPrinter4.writeObjectFieldValueSeparator(jsonGenerator37);
        com.fasterxml.jackson.core.SerializableString serializableString40 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = jsonGenerator37.setRootValueSeparator(serializableString40);
        jsonGenerator37.writeNumber((long) 56319);
        org.junit.Assert.assertNull(inputDecorator6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonGenerator41);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory0.setCodec(objectCodec33);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory34.createGenerator(writer35);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory34.setInputDecorator(inputDecorator37);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator39 = jsonFactory34.getInputDecorator();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNull(inputDecorator39);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        boolean boolean35 = jsonGenerator32.isClosed();
        jsonGenerator32.writeNumber(100.0d);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonGenerator32.setCodec(objectCodec38);
        com.fasterxml.jackson.core.TreeNode treeNode40 = null;
        jsonGenerator39.writeTree(treeNode40);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter42 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = jsonGenerator39.setPrettyPrinter(prettyPrinter42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = jsonGenerator43.getCodec();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(jsonGenerator43);
        org.junit.Assert.assertNull(objectCodec44);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        com.fasterxml.jackson.core.JsonGenerator.Feature feature35 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean36 = jsonGenerator32.isEnabled(feature35);
        boolean boolean37 = jsonGenerator32.isClosed();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature35.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory0.setCodec(objectCodec33);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory34.createGenerator(writer35);
        jsonGenerator36.writeArrayFieldStart("");
        jsonGenerator36.writeNumberField("hi!", (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator36.writeTypeId((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No native support for writing Type Ids");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = defaultPrettyPrinter1.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator4 = jsonFactory3.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream11 = new com.fasterxml.jackson.core.io.MergedStream(iOContext6, inputStream7, byteArray8, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader21 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext5, inputStream7, byteArray14, 0, 0, false);
        char[] charArray24 = new char[] { ' ', '#' };
        int int25 = uTF32Reader21.read(charArray24);
        char[] charArray29 = new char[] { ' ', '#', '4' };
        int int32 = uTF32Reader21.read(charArray29, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory3.createParser((java.io.Reader) uTF32Reader21);
        java.io.Writer writer34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonFactory3.createJsonGenerator(writer34);
        jsonGenerator35.writeString("");
        jsonGenerator35.writeBoolean(false);
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator35);
        jsonGenerator35.writeNumberField("hi!", (float) ' ');
        org.junit.Assert.assertNotNull(defaultPrettyPrinter1);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter2);
        org.junit.Assert.assertNull(inputDecorator4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.Object obj31 = jsonParser30.getTypeId();
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = jsonParser30.getTokenLocation();
        // The following exception was thrown during execution in test generation
        try {
            short short33 = jsonParser30.getShortValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@6368d29a; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(jsonLocation32);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        java.io.InputStream inputStream41 = null;
        byte[] byteArray42 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream45 = new com.fasterxml.jackson.core.io.MergedStream(iOContext40, inputStream41, byteArray42, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader49 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext33, inputStream35, byteArray42, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory0.createParser(byteArray42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = jsonFactory0.getCodec();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNull(objectCodec51);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        jsonGenerator32.writeObjectFieldStart("hi!");
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        com.fasterxml.jackson.core.io.IOContext iOContext31 = null;
        java.io.InputStream inputStream32 = null;
        byte[] byteArray33 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream36 = new com.fasterxml.jackson.core.io.MergedStream(iOContext31, inputStream32, byteArray33, 0, (int) (short) -1);
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory0.createJsonParser(inputStream32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean38 = jsonParser37.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(jsonParser37);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        int int33 = jsonParser30.getFeatureMask();
        double double34 = jsonParser30.getValueAsDouble();
        java.lang.Object obj35 = jsonParser30.getEmbeddedObject();
        // The following exception was thrown during execution in test generation
        try {
            short short36 = jsonParser30.getShortValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@7161268a; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        com.fasterxml.jackson.core.TreeNode treeNode35 = null;
        jsonGenerator32.writeTree(treeNode35);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.Version version33 = jsonFactory0.version();
        com.fasterxml.jackson.core.format.InputAccessor inputAccessor34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.format.MatchStrength matchStrength35 = jsonFactory0.hasFormat(inputAccessor34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(version33);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.String str31 = jsonParser30.nextTextValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = jsonParser30.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@1dc13e6a; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = jsonFactory5.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream13 = new com.fasterxml.jackson.core.io.MergedStream(iOContext8, inputStream9, byteArray10, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream19 = new com.fasterxml.jackson.core.io.MergedStream(iOContext14, inputStream15, byteArray16, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader23 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext7, inputStream9, byteArray16, 0, 0, false);
        char[] charArray26 = new char[] { ' ', '#' };
        int int27 = uTF32Reader23.read(charArray26);
        char[] charArray31 = new char[] { ' ', '#', '4' };
        int int34 = uTF32Reader23.read(charArray31, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory5.createParser((java.io.Reader) uTF32Reader23);
        java.io.Writer writer36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonFactory5.createJsonGenerator(writer36);
        boolean boolean38 = jsonGenerator37.isClosed();
        defaultPrettyPrinter4.writeObjectFieldValueSeparator(jsonGenerator37);
        com.fasterxml.jackson.core.SerializableString serializableString40 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = jsonGenerator37.setRootValueSeparator(serializableString40);
        jsonGenerator41.writeRawValue("JSON");
        jsonGenerator41.writeRaw('4');
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator41.writeRaw("hi!", (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonGenerator41);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator32.writeRaw("hi!", (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = jsonFactory5.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream13 = new com.fasterxml.jackson.core.io.MergedStream(iOContext8, inputStream9, byteArray10, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream19 = new com.fasterxml.jackson.core.io.MergedStream(iOContext14, inputStream15, byteArray16, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader23 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext7, inputStream9, byteArray16, 0, 0, false);
        char[] charArray26 = new char[] { ' ', '#' };
        int int27 = uTF32Reader23.read(charArray26);
        char[] charArray31 = new char[] { ' ', '#', '4' };
        int int34 = uTF32Reader23.read(charArray31, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory5.createParser((java.io.Reader) uTF32Reader23);
        java.io.Writer writer36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonFactory5.createJsonGenerator(writer36);
        boolean boolean38 = jsonGenerator37.isClosed();
        defaultPrettyPrinter4.writeObjectFieldValueSeparator(jsonGenerator37);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator40 = jsonGenerator37.useDefaultPrettyPrinter();
        org.junit.Assert.assertNull(inputDecorator6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonGenerator40);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.setRootValueSeparator("");
        boolean boolean22 = jsonFactory21.requiresCustomCodec();
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.String str31 = jsonParser30.nextTextValue();
        java.io.Writer writer32 = null;
        int int33 = jsonParser30.releaseBuffered(writer32);
        int int35 = jsonParser30.getValueAsInt(56319);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext36 = jsonParser30.getParsingContext();
        java.lang.String str37 = jsonParser30.getText();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 56319 + "'", int35 == 56319);
        org.junit.Assert.assertNotNull(jsonStreamContext36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.String str31 = jsonParser30.nextTextValue();
        java.io.Writer writer32 = null;
        int int33 = jsonParser30.releaseBuffered(writer32);
        int int35 = jsonParser30.getValueAsInt(56319);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext36 = jsonParser30.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType37 = jsonParser30.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@683b8f72; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 56319 + "'", int35 == 56319);
        org.junit.Assert.assertNotNull(jsonStreamContext36);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.OutputStream outputStream31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createGenerator(outputStream31);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer20 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int21 = charsToNameCanonicalizer20.collisionCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser22 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -17, (java.io.Reader) uTF32Reader18, objectCodec19, charsToNameCanonicalizer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        boolean boolean35 = jsonGenerator32.isClosed();
        jsonGenerator32.writeNumber(100.0d);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonGenerator32.setCodec(objectCodec38);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter40 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter41 = defaultPrettyPrinter40.createInstance();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonGenerator32.setPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultPrettyPrinter41);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes43 = jsonGenerator32.getCharacterEscapes();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter41);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNull(characterEscapes43);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = defaultPrettyPrinter1.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator4 = jsonFactory3.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream11 = new com.fasterxml.jackson.core.io.MergedStream(iOContext6, inputStream7, byteArray8, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader21 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext5, inputStream7, byteArray14, 0, 0, false);
        char[] charArray24 = new char[] { ' ', '#' };
        int int25 = uTF32Reader21.read(charArray24);
        char[] charArray29 = new char[] { ' ', '#', '4' };
        int int32 = uTF32Reader21.read(charArray29, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory3.createParser((java.io.Reader) uTF32Reader21);
        java.io.Writer writer34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonFactory3.createJsonGenerator(writer34);
        jsonGenerator35.writeString("");
        jsonGenerator35.writeBoolean(false);
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator35);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator35.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter1);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter2);
        org.junit.Assert.assertNull(inputDecorator4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        jsonParser30.close();
        com.fasterxml.jackson.core.Version version34 = jsonParser30.version();
        com.fasterxml.jackson.core.Base64Variant base64Variant35 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray36 = jsonParser30.getBinaryValue(base64Variant35);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@47a05be5; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(version34);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory0.setCodec(objectCodec33);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory34.createGenerator(writer35);
        jsonGenerator36.writeArrayFieldStart("");
        com.fasterxml.jackson.core.io.IOContext iOContext39 = null;
        java.io.InputStream inputStream40 = null;
        byte[] byteArray41 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream44 = new com.fasterxml.jackson.core.io.MergedStream(iOContext39, inputStream40, byteArray41, 0, (int) (short) -1);
        int int45 = mergedStream44.available();
        boolean boolean46 = mergedStream44.markSupported();
        int int47 = mergedStream44.available();
        // The following exception was thrown during execution in test generation
        try {
            int int49 = jsonGenerator36.writeBinary((java.io.InputStream) mergedStream44, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        com.fasterxml.jackson.core.FormatSchema formatSchema34 = null;
        boolean boolean35 = jsonGenerator32.canUseSchema(formatSchema34);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter5.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = jsonFactory9.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext18 = null;
        java.io.InputStream inputStream19 = null;
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream23 = new com.fasterxml.jackson.core.io.MergedStream(iOContext18, inputStream19, byteArray20, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader27 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext11, inputStream13, byteArray20, 0, 0, false);
        char[] charArray30 = new char[] { ' ', '#' };
        int int31 = uTF32Reader27.read(charArray30);
        char[] charArray35 = new char[] { ' ', '#', '4' };
        int int38 = uTF32Reader27.read(charArray35, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory9.createParser((java.io.Reader) uTF32Reader27);
        java.io.Writer writer40 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = jsonFactory9.createJsonGenerator(writer40);
        boolean boolean42 = jsonGenerator41.isClosed();
        jsonGenerator41.writeStartObject();
        boolean boolean44 = jsonGenerator41.isClosed();
        jsonGenerator41.writeNumber(100.0d);
        defaultPrettyPrinter8.writeObjectFieldValueSeparator(jsonGenerator41);
        jsonGenerator41.writeBooleanField("JSON", true);
        defaultPrettyPrinter4.writeEndObject(jsonGenerator41, 1);
        org.junit.Assert.assertNull(inputDecorator10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , #]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertNotNull(jsonGenerator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.setRootValueSeparator("");
        java.io.File file22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory21.createJsonParser(file22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonFactory21);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.Object obj31 = jsonParser30.getTypeId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        jsonParser30.setCodec(objectCodec32);
        com.fasterxml.jackson.core.FormatSchema formatSchema34 = jsonParser30.getSchema();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(formatSchema34);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = jsonParser30.getCodec();
        com.fasterxml.jackson.core.JsonToken jsonToken34 = jsonParser30.getLastClearedToken();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNull(objectCodec33);
        org.junit.Assert.assertNull(jsonToken34);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.Version version33 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory0.createParser(byteArray36);
        com.fasterxml.jackson.core.JsonToken jsonToken41 = jsonParser40.getCurrentToken();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNull(jsonToken41);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.Object obj31 = jsonParser30.getTypeId();
        boolean boolean32 = jsonParser30.isExpectedStartArrayToken();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        java.io.InputStream inputStream41 = null;
        byte[] byteArray42 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream45 = new com.fasterxml.jackson.core.io.MergedStream(iOContext40, inputStream41, byteArray42, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader49 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext33, inputStream35, byteArray42, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory0.createParser(byteArray42);
        java.io.Writer writer51 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = jsonFactory0.createGenerator(writer51);
        com.fasterxml.jackson.core.io.IOContext iOContext53 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext54 = null;
        java.io.InputStream inputStream55 = null;
        byte[] byteArray56 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream59 = new com.fasterxml.jackson.core.io.MergedStream(iOContext54, inputStream55, byteArray56, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext60 = null;
        java.io.InputStream inputStream61 = null;
        byte[] byteArray62 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream65 = new com.fasterxml.jackson.core.io.MergedStream(iOContext60, inputStream61, byteArray62, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader69 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext53, inputStream55, byteArray62, 0, 0, false);
        char[] charArray72 = new char[] { ' ', '#' };
        int int73 = uTF32Reader69.read(charArray72);
        char[] charArray77 = new char[] { ' ', '#', '4' };
        int int80 = uTF32Reader69.read(charArray77, (int) (short) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator52.writeRaw(charArray77, (int) ' ', 56319);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(jsonGenerator52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[ , #]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream12 = new com.fasterxml.jackson.core.io.MergedStream(iOContext7, inputStream8, byteArray9, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream18 = new com.fasterxml.jackson.core.io.MergedStream(iOContext13, inputStream14, byteArray15, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader22 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext6, inputStream8, byteArray15, 0, 0, false);
        char[] charArray25 = new char[] { ' ', '#' };
        int int26 = uTF32Reader22.read(charArray25);
        char[] charArray30 = new char[] { ' ', '#', '4' };
        int int33 = uTF32Reader22.read(charArray30, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory4.createParser((java.io.Reader) uTF32Reader22);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory4.createJsonGenerator(writer35);
        jsonGenerator36.writeObjectFieldStart("");
        jsonGenerator36.writeObjectFieldStart("hi!");
        defaultPrettyPrinter0.beforeObjectEntries(jsonGenerator36);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator43 = jsonFactory42.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext44 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext45 = null;
        java.io.InputStream inputStream46 = null;
        byte[] byteArray47 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream50 = new com.fasterxml.jackson.core.io.MergedStream(iOContext45, inputStream46, byteArray47, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext51 = null;
        java.io.InputStream inputStream52 = null;
        byte[] byteArray53 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream56 = new com.fasterxml.jackson.core.io.MergedStream(iOContext51, inputStream52, byteArray53, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader60 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext44, inputStream46, byteArray53, 0, 0, false);
        char[] charArray63 = new char[] { ' ', '#' };
        int int64 = uTF32Reader60.read(charArray63);
        char[] charArray68 = new char[] { ' ', '#', '4' };
        int int71 = uTF32Reader60.read(charArray68, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser72 = jsonFactory42.createParser((java.io.Reader) uTF32Reader60);
        java.io.Writer writer73 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator74 = jsonFactory42.createJsonGenerator(writer73);
        com.fasterxml.jackson.core.io.IOContext iOContext75 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext76 = null;
        java.io.InputStream inputStream77 = null;
        byte[] byteArray78 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream81 = new com.fasterxml.jackson.core.io.MergedStream(iOContext76, inputStream77, byteArray78, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext82 = null;
        java.io.InputStream inputStream83 = null;
        byte[] byteArray84 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream87 = new com.fasterxml.jackson.core.io.MergedStream(iOContext82, inputStream83, byteArray84, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader91 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext75, inputStream77, byteArray84, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser92 = jsonFactory42.createParser(byteArray84);
        jsonGenerator36.writeBinary(byteArray84);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , #]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNull(inputDecorator43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[ , #]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(jsonParser72);
        org.junit.Assert.assertNotNull(jsonGenerator74);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[]");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[]");
        org.junit.Assert.assertNotNull(jsonParser92);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        int int33 = jsonParser30.getFeatureMask();
        double double34 = jsonParser30.getValueAsDouble();
        java.lang.Object obj35 = jsonParser30.getEmbeddedObject();
        int int36 = jsonParser30.getFeatureMask();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory0.setCodec(objectCodec33);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory34.createGenerator(writer35);
        java.io.Writer writer37 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = jsonFactory34.createGenerator(writer37);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory34.createParser("hi!");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature41 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean42 = jsonFactory34.isEnabled(feature41);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.Version version33 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory0.createParser(byteArray36);
        int int41 = jsonParser40.getFeatureMask();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory0.setCodec(objectCodec33);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory34.createGenerator(writer35);
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator38 = jsonFactory37.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        java.io.InputStream inputStream41 = null;
        byte[] byteArray42 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream45 = new com.fasterxml.jackson.core.io.MergedStream(iOContext40, inputStream41, byteArray42, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext46 = null;
        java.io.InputStream inputStream47 = null;
        byte[] byteArray48 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream51 = new com.fasterxml.jackson.core.io.MergedStream(iOContext46, inputStream47, byteArray48, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader55 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext39, inputStream41, byteArray48, 0, 0, false);
        char[] charArray58 = new char[] { ' ', '#' };
        int int59 = uTF32Reader55.read(charArray58);
        char[] charArray63 = new char[] { ' ', '#', '4' };
        int int66 = uTF32Reader55.read(charArray63, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser67 = jsonFactory37.createParser((java.io.Reader) uTF32Reader55);
        java.lang.Object obj68 = jsonParser67.getTypeId();
        com.fasterxml.jackson.core.JsonLocation jsonLocation69 = jsonParser67.getTokenLocation();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator36.writeObject((java.lang.Object) jsonParser67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed com.fasterxml.jackson.core.json.ReaderBasedJsonParser)");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNull(inputDecorator38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[ , #]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(jsonParser67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(jsonLocation69);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        jsonGenerator32.writeObjectFieldStart("");
        jsonGenerator32.writeObjectFieldStart("hi!");
        jsonGenerator32.writeStringField("ARRAY", "JSON");
        java.lang.Object obj40 = jsonGenerator32.getOutputTarget();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.Version version33 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory0.createParser(byteArray36);
        boolean boolean41 = jsonParser40.canReadObjectId();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter fixedSpaceIndenter1 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        defaultPrettyPrinter0.indentArraysWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) fixedSpaceIndenter1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator4 = jsonFactory3.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream11 = new com.fasterxml.jackson.core.io.MergedStream(iOContext6, inputStream7, byteArray8, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader21 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext5, inputStream7, byteArray14, 0, 0, false);
        char[] charArray24 = new char[] { ' ', '#' };
        int int25 = uTF32Reader21.read(charArray24);
        char[] charArray29 = new char[] { ' ', '#', '4' };
        int int32 = uTF32Reader21.read(charArray29, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory3.createParser((java.io.Reader) uTF32Reader21);
        java.io.Writer writer34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonFactory3.createJsonGenerator(writer34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory3.setCodec(objectCodec36);
        java.io.Writer writer38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory37.createGenerator(writer38);
        jsonGenerator39.writeArrayFieldStart("");
        fixedSpaceIndenter1.writeIndentation(jsonGenerator39, (int) (short) 0);
        org.junit.Assert.assertNotNull(fixedSpaceIndenter1);
        org.junit.Assert.assertNull(inputDecorator4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = defaultPrettyPrinter1.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator4 = jsonFactory3.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream11 = new com.fasterxml.jackson.core.io.MergedStream(iOContext6, inputStream7, byteArray8, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader21 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext5, inputStream7, byteArray14, 0, 0, false);
        char[] charArray24 = new char[] { ' ', '#' };
        int int25 = uTF32Reader21.read(charArray24);
        char[] charArray29 = new char[] { ' ', '#', '4' };
        int int32 = uTF32Reader21.read(charArray29, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory3.createParser((java.io.Reader) uTF32Reader21);
        java.io.Writer writer34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonFactory3.createJsonGenerator(writer34);
        jsonGenerator35.writeString("");
        jsonGenerator35.writeBoolean(false);
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator35);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter41 = defaultPrettyPrinter2.createInstance();
        org.junit.Assert.assertNotNull(defaultPrettyPrinter1);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter2);
        org.junit.Assert.assertNull(inputDecorator4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter41);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter fixedSpaceIndenter1 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        defaultPrettyPrinter0.indentArraysWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) fixedSpaceIndenter1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator4 = jsonFactory3.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream11 = new com.fasterxml.jackson.core.io.MergedStream(iOContext6, inputStream7, byteArray8, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader21 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext5, inputStream7, byteArray14, 0, 0, false);
        char[] charArray24 = new char[] { ' ', '#' };
        int int25 = uTF32Reader21.read(charArray24);
        char[] charArray29 = new char[] { ' ', '#', '4' };
        int int32 = uTF32Reader21.read(charArray29, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory3.createParser((java.io.Reader) uTF32Reader21);
        java.io.Writer writer34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonFactory3.createJsonGenerator(writer34);
        boolean boolean36 = jsonGenerator35.isClosed();
        jsonGenerator35.writeStartObject();
        boolean boolean38 = jsonGenerator35.isClosed();
        jsonGenerator35.writeNumber(100.0d);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonGenerator35.setCodec(objectCodec41);
        fixedSpaceIndenter1.writeIndentation(jsonGenerator35, 55296);
        org.junit.Assert.assertNotNull(fixedSpaceIndenter1);
        org.junit.Assert.assertNull(inputDecorator4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonGenerator42);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory0.createJsonParser("JSON");
        // The following exception was thrown during execution in test generation
        try {
            int int36 = jsonParser34.nextIntValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'JSON': was expecting ? at [Source: java.io.StringReader@595742a3; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonParser34);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        int int33 = jsonParser30.getFeatureMask();
        double double34 = jsonParser30.getValueAsDouble();
        java.lang.Object obj35 = jsonParser30.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        boolean boolean37 = jsonParser30.isEnabled(feature36);
        boolean boolean38 = feature36.enabledByDefault();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = jsonFactory5.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream13 = new com.fasterxml.jackson.core.io.MergedStream(iOContext8, inputStream9, byteArray10, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream19 = new com.fasterxml.jackson.core.io.MergedStream(iOContext14, inputStream15, byteArray16, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader23 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext7, inputStream9, byteArray16, 0, 0, false);
        char[] charArray26 = new char[] { ' ', '#' };
        int int27 = uTF32Reader23.read(charArray26);
        char[] charArray31 = new char[] { ' ', '#', '4' };
        int int34 = uTF32Reader23.read(charArray31, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory5.createParser((java.io.Reader) uTF32Reader23);
        java.io.Writer writer36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonFactory5.createJsonGenerator(writer36);
        boolean boolean38 = jsonGenerator37.isClosed();
        defaultPrettyPrinter4.writeObjectFieldValueSeparator(jsonGenerator37);
        com.fasterxml.jackson.core.io.SerializedString serializedString40 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter41 = defaultPrettyPrinter4.withRootSeparator((com.fasterxml.jackson.core.SerializableString) serializedString40);
        org.junit.Assert.assertNull(inputDecorator6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializedString40);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter41);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        jsonParser30.close();
        boolean boolean34 = jsonParser30.canReadTypeId();
        int int35 = jsonParser30.getTextLength();
        java.lang.Object obj36 = jsonParser30.getInputSource();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        long long31 = jsonParser30.getValueAsLong();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        boolean boolean20 = jsonFactory0.requiresPropertyOrdering();
        java.lang.String str21 = jsonFactory0.getFormatName();
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory0.createParser("");
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator24 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory0.copy();
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory25.enable(feature26);
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "JSON" + "'", str21, "JSON");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNull(inputDecorator24);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE + "'", feature26.equals(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE));
        org.junit.Assert.assertNotNull(jsonFactory27);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        boolean boolean35 = jsonGenerator32.isClosed();
        jsonGenerator32.writeNumber(100.0d);
        jsonGenerator32.writeNumber((long) (byte) 100);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        jsonParser30.close();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream12 = new com.fasterxml.jackson.core.io.MergedStream(iOContext7, inputStream8, byteArray9, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream18 = new com.fasterxml.jackson.core.io.MergedStream(iOContext13, inputStream14, byteArray15, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader22 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext6, inputStream8, byteArray15, 0, 0, false);
        char[] charArray25 = new char[] { ' ', '#' };
        int int26 = uTF32Reader22.read(charArray25);
        char[] charArray30 = new char[] { ' ', '#', '4' };
        int int33 = uTF32Reader22.read(charArray30, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory4.createParser((java.io.Reader) uTF32Reader22);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory4.createJsonGenerator(writer35);
        jsonGenerator36.writeObjectFieldStart("");
        jsonGenerator36.writeObjectFieldStart("hi!");
        defaultPrettyPrinter0.beforeObjectEntries(jsonGenerator36);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator43 = jsonFactory42.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext44 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext45 = null;
        java.io.InputStream inputStream46 = null;
        byte[] byteArray47 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream50 = new com.fasterxml.jackson.core.io.MergedStream(iOContext45, inputStream46, byteArray47, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext51 = null;
        java.io.InputStream inputStream52 = null;
        byte[] byteArray53 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream56 = new com.fasterxml.jackson.core.io.MergedStream(iOContext51, inputStream52, byteArray53, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader60 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext44, inputStream46, byteArray53, 0, 0, false);
        char[] charArray63 = new char[] { ' ', '#' };
        int int64 = uTF32Reader60.read(charArray63);
        char[] charArray68 = new char[] { ' ', '#', '4' };
        int int71 = uTF32Reader60.read(charArray68, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser72 = jsonFactory42.createParser((java.io.Reader) uTF32Reader60);
        java.io.Writer writer73 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator74 = jsonFactory42.createJsonGenerator(writer73);
        defaultPrettyPrinter0.writeArrayValueSeparator(jsonGenerator74);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , #]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNull(inputDecorator43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[ , #]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(jsonParser72);
        org.junit.Assert.assertNotNull(jsonGenerator74);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        java.io.InputStream inputStream41 = null;
        byte[] byteArray42 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream45 = new com.fasterxml.jackson.core.io.MergedStream(iOContext40, inputStream41, byteArray42, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader49 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext33, inputStream35, byteArray42, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory0.createParser(byteArray42);
        java.io.Writer writer51 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = jsonFactory0.createGenerator(writer51);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature53 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = jsonFactory0.enable(feature53);
        com.fasterxml.jackson.core.io.IOContext iOContext55 = null;
        java.io.InputStream inputStream56 = null;
        byte[] byteArray57 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream60 = new com.fasterxml.jackson.core.io.MergedStream(iOContext55, inputStream56, byteArray57, 0, (int) (short) -1);
        int int61 = mergedStream60.available();
        boolean boolean62 = mergedStream60.markSupported();
        mergedStream60.mark(100);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser65 = jsonFactory0.createParser((java.io.InputStream) mergedStream60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(jsonGenerator52);
        org.junit.Assert.assertTrue("'" + feature53 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature53.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory54);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        jsonParser30.close();
        com.fasterxml.jackson.core.JsonLocation jsonLocation34 = jsonParser30.getCurrentLocation();
        // The following exception was thrown during execution in test generation
        try {
            byte byte35 = jsonParser30.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@4bf49716; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(jsonLocation34);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.Version version33 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory0.createParser(byteArray36);
        java.lang.Object obj41 = jsonParser40.getInputSource();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        int int33 = jsonParser30.getFeatureMask();
        double double34 = jsonParser30.getValueAsDouble();
        java.lang.Object obj35 = jsonParser30.getEmbeddedObject();
        // The following exception was thrown during execution in test generation
        try {
            byte byte36 = jsonParser30.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@ff8aff6; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        jsonParser30.close();
        com.fasterxml.jackson.core.JsonLocation jsonLocation34 = jsonParser30.getCurrentLocation();
        long long35 = jsonLocation34.getByteOffset();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(jsonLocation34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.Object obj31 = jsonParser30.getTypeId();
        char[] charArray32 = jsonParser30.getTextCharacters();
        com.fasterxml.jackson.core.JsonParser.Feature feature33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonParser30.disable(feature33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(charArray32);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter fixedSpaceIndenter1 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        defaultPrettyPrinter0.indentArraysWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) fixedSpaceIndenter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter3.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator8 = jsonFactory7.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream15 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray12, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext16 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray18 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream21 = new com.fasterxml.jackson.core.io.MergedStream(iOContext16, inputStream17, byteArray18, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader25 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext9, inputStream11, byteArray18, 0, 0, false);
        char[] charArray28 = new char[] { ' ', '#' };
        int int29 = uTF32Reader25.read(charArray28);
        char[] charArray33 = new char[] { ' ', '#', '4' };
        int int36 = uTF32Reader25.read(charArray33, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory7.createParser((java.io.Reader) uTF32Reader25);
        java.io.Writer writer38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory7.createJsonGenerator(writer38);
        boolean boolean40 = jsonGenerator39.isClosed();
        jsonGenerator39.writeStartObject();
        boolean boolean42 = jsonGenerator39.isClosed();
        jsonGenerator39.writeNumber(100.0d);
        defaultPrettyPrinter6.writeObjectFieldValueSeparator(jsonGenerator39);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator47 = jsonGenerator39.setFeatureMask((int) (short) 1);
        fixedSpaceIndenter1.writeIndentation(jsonGenerator47, (int) (byte) 10);
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator51 = jsonFactory50.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext52 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext53 = null;
        java.io.InputStream inputStream54 = null;
        byte[] byteArray55 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream58 = new com.fasterxml.jackson.core.io.MergedStream(iOContext53, inputStream54, byteArray55, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext59 = null;
        java.io.InputStream inputStream60 = null;
        byte[] byteArray61 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream64 = new com.fasterxml.jackson.core.io.MergedStream(iOContext59, inputStream60, byteArray61, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader68 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext52, inputStream54, byteArray61, 0, 0, false);
        char[] charArray71 = new char[] { ' ', '#' };
        int int72 = uTF32Reader68.read(charArray71);
        char[] charArray76 = new char[] { ' ', '#', '4' };
        int int79 = uTF32Reader68.read(charArray76, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser80 = jsonFactory50.createParser((java.io.Reader) uTF32Reader68);
        java.io.Writer writer81 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator82 = jsonFactory50.createJsonGenerator(writer81);
        boolean boolean83 = jsonGenerator82.isClosed();
        jsonGenerator82.writeStartObject();
        boolean boolean85 = jsonGenerator82.isClosed();
        com.fasterxml.jackson.core.TreeNode treeNode86 = null;
        jsonGenerator82.writeTree(treeNode86);
        fixedSpaceIndenter1.writeIndentation(jsonGenerator82, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fixedSpaceIndenter1);
        org.junit.Assert.assertNull(inputDecorator8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , #]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jsonGenerator47);
        org.junit.Assert.assertNull(inputDecorator51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[ , #]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(jsonParser80);
        org.junit.Assert.assertNotNull(jsonGenerator82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = jsonParser30.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@255b201b; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        boolean boolean35 = jsonGenerator32.isClosed();
        jsonGenerator32.writeNumber(100.0d);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonGenerator32.setCodec(objectCodec38);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter40 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter41 = defaultPrettyPrinter40.createInstance();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonGenerator32.setPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultPrettyPrinter41);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter43 = jsonGenerator42.getPrettyPrinter();
        jsonGenerator42.writeRaw("hi!");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature46 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = jsonGenerator42.configure(feature46, false);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter41);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNotNull(prettyPrinter43);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature46.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonGenerator48);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator2 = jsonFactory1.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext4 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray6 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream9 = new com.fasterxml.jackson.core.io.MergedStream(iOContext4, inputStream5, byteArray6, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream15 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray12, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader19 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, inputStream5, byteArray12, 0, 0, false);
        char[] charArray22 = new char[] { ' ', '#' };
        int int23 = uTF32Reader19.read(charArray22);
        char[] charArray27 = new char[] { ' ', '#', '4' };
        int int30 = uTF32Reader19.read(charArray27, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory1.createParser((java.io.Reader) uTF32Reader19);
        java.io.Writer writer32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonFactory1.createJsonGenerator(writer32);
        boolean boolean34 = jsonGenerator33.isClosed();
        jsonGenerator33.writeStartObject();
        boolean boolean36 = jsonGenerator33.isClosed();
        defaultPrettyPrinter0.writeEndObject(jsonGenerator33, (int) (byte) -1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator40 = jsonFactory39.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext41 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext42 = null;
        java.io.InputStream inputStream43 = null;
        byte[] byteArray44 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream47 = new com.fasterxml.jackson.core.io.MergedStream(iOContext42, inputStream43, byteArray44, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext48 = null;
        java.io.InputStream inputStream49 = null;
        byte[] byteArray50 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream53 = new com.fasterxml.jackson.core.io.MergedStream(iOContext48, inputStream49, byteArray50, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader57 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext41, inputStream43, byteArray50, 0, 0, false);
        char[] charArray60 = new char[] { ' ', '#' };
        int int61 = uTF32Reader57.read(charArray60);
        char[] charArray65 = new char[] { ' ', '#', '4' };
        int int68 = uTF32Reader57.read(charArray65, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser69 = jsonFactory39.createParser((java.io.Reader) uTF32Reader57);
        java.io.Writer writer70 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator71 = jsonFactory39.createJsonGenerator(writer70);
        boolean boolean72 = jsonGenerator71.isClosed();
        jsonGenerator71.writeStartObject();
        boolean boolean74 = jsonGenerator71.isClosed();
        jsonGenerator71.writeNumber(100.0d);
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator78 = jsonGenerator71.setCodec(objectCodec77);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter79 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter80 = defaultPrettyPrinter79.createInstance();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator81 = jsonGenerator71.setPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultPrettyPrinter80);
        defaultPrettyPrinter0.writeObjectFieldValueSeparator(jsonGenerator81);
        org.junit.Assert.assertNull(inputDecorator2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , #]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputDecorator40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[ , #]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(jsonParser69);
        org.junit.Assert.assertNotNull(jsonGenerator71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jsonGenerator78);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter80);
        org.junit.Assert.assertNotNull(jsonGenerator81);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.String str31 = jsonParser30.nextTextValue();
        boolean boolean32 = jsonParser30.canReadObjectId();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator4 = jsonFactory3.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream11 = new com.fasterxml.jackson.core.io.MergedStream(iOContext6, inputStream7, byteArray8, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader21 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext5, inputStream7, byteArray14, 0, 0, false);
        char[] charArray24 = new char[] { ' ', '#' };
        int int25 = uTF32Reader21.read(charArray24);
        char[] charArray29 = new char[] { ' ', '#', '4' };
        int int32 = uTF32Reader21.read(charArray29, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory3.createParser((java.io.Reader) uTF32Reader21);
        java.io.Writer writer34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonFactory3.createJsonGenerator(writer34);
        boolean boolean36 = jsonGenerator35.isClosed();
        jsonGenerator35.writeStartObject();
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator39 = jsonFactory38.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext41 = null;
        java.io.InputStream inputStream42 = null;
        byte[] byteArray43 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream46 = new com.fasterxml.jackson.core.io.MergedStream(iOContext41, inputStream42, byteArray43, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext47 = null;
        java.io.InputStream inputStream48 = null;
        byte[] byteArray49 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream52 = new com.fasterxml.jackson.core.io.MergedStream(iOContext47, inputStream48, byteArray49, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader56 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext40, inputStream42, byteArray49, 0, 0, false);
        char[] charArray59 = new char[] { ' ', '#' };
        int int60 = uTF32Reader56.read(charArray59);
        char[] charArray64 = new char[] { ' ', '#', '4' };
        int int67 = uTF32Reader56.read(charArray64, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser68 = jsonFactory38.createParser((java.io.Reader) uTF32Reader56);
        java.io.Writer writer69 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator70 = jsonFactory38.createJsonGenerator(writer69);
        com.fasterxml.jackson.core.io.IOContext iOContext71 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext72 = null;
        java.io.InputStream inputStream73 = null;
        byte[] byteArray74 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream77 = new com.fasterxml.jackson.core.io.MergedStream(iOContext72, inputStream73, byteArray74, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext78 = null;
        java.io.InputStream inputStream79 = null;
        byte[] byteArray80 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream83 = new com.fasterxml.jackson.core.io.MergedStream(iOContext78, inputStream79, byteArray80, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader87 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext71, inputStream73, byteArray80, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser88 = jsonFactory38.createParser(byteArray80);
        jsonGenerator35.writeBinary(byteArray80);
        defaultPrettyPrinter0.writeStartArray(jsonGenerator35);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator91 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter0.writeEndArray(jsonGenerator91, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputDecorator39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[ , #]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(jsonParser68);
        org.junit.Assert.assertNotNull(jsonGenerator70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[]");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[]");
        org.junit.Assert.assertNotNull(jsonParser88);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        boolean boolean2 = jsonFactory0.requiresPropertyOrdering();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator4 = jsonFactory3.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream11 = new com.fasterxml.jackson.core.io.MergedStream(iOContext6, inputStream7, byteArray8, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader21 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext5, inputStream7, byteArray14, 0, 0, false);
        char[] charArray24 = new char[] { ' ', '#' };
        int int25 = uTF32Reader21.read(charArray24);
        char[] charArray29 = new char[] { ' ', '#', '4' };
        int int32 = uTF32Reader21.read(charArray29, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory3.createParser((java.io.Reader) uTF32Reader21);
        int int35 = jsonParser33.nextIntValue((int) 'a');
        int int36 = jsonParser33.getFeatureMask();
        double double37 = jsonParser33.getValueAsDouble();
        java.lang.Object obj38 = jsonParser33.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        boolean boolean40 = jsonParser33.isEnabled(feature39);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory0.disable(feature39);
        java.io.Writer writer42 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = jsonFactory41.createJsonGenerator(writer42);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputDecorator4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(jsonGenerator43);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        java.io.InputStream inputStream41 = null;
        byte[] byteArray42 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream45 = new com.fasterxml.jackson.core.io.MergedStream(iOContext40, inputStream41, byteArray42, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader49 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext33, inputStream35, byteArray42, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory0.createParser(byteArray42);
        java.io.Writer writer51 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = jsonFactory0.createGenerator(writer51);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter53 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter54 = defaultPrettyPrinter53.createInstance();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = jsonGenerator52.setPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultPrettyPrinter54);
        com.fasterxml.jackson.core.io.SerializedString serializedString56 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -65, (byte) 1, (byte) 0, (byte) 0 };
        int int65 = serializedString56.appendQuotedUTF8(byteArray63, (int) ' ');
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator66 = jsonGenerator52.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString56);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator52.writeObjectRef((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No native support for writing Object Ids");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(jsonGenerator52);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter54);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertNotNull(serializedString56);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, 1, -65, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(jsonGenerator66);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.String str31 = jsonParser30.nextTextValue();
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = null;
        boolean boolean33 = jsonParser30.canUseSchema(formatSchema32);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger34 = jsonParser30.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: com.fasterxml.jackson.core.io.UTF32Reader@294ec4a1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = jsonParser30.getCodec();
        jsonParser30.close();
        double double36 = jsonParser30.getValueAsDouble((double) (short) 10);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNull(objectCodec33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        boolean boolean35 = jsonGenerator32.isClosed();
        jsonGenerator32.writeNumber(100.0d);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonGenerator32.setCodec(objectCodec38);
        com.fasterxml.jackson.core.TreeNode treeNode40 = null;
        jsonGenerator39.writeTree(treeNode40);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter42 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = jsonGenerator39.setPrettyPrinter(prettyPrinter42);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = jsonGenerator39.setFeatureMask(64);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(jsonGenerator43);
        org.junit.Assert.assertNotNull(jsonGenerator45);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int20 = jsonParser19.getFeatureMask();
        java.lang.String str21 = jsonParser19.getCurrentName();
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream12 = new com.fasterxml.jackson.core.io.MergedStream(iOContext7, inputStream8, byteArray9, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream18 = new com.fasterxml.jackson.core.io.MergedStream(iOContext13, inputStream14, byteArray15, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader22 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext6, inputStream8, byteArray15, 0, 0, false);
        char[] charArray25 = new char[] { ' ', '#' };
        int int26 = uTF32Reader22.read(charArray25);
        char[] charArray30 = new char[] { ' ', '#', '4' };
        int int33 = uTF32Reader22.read(charArray30, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory4.createParser((java.io.Reader) uTF32Reader22);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory4.createJsonGenerator(writer35);
        boolean boolean37 = jsonGenerator36.isClosed();
        jsonGenerator36.writeStartObject();
        boolean boolean39 = jsonGenerator36.isClosed();
        jsonGenerator36.writeNumber(100.0d);
        defaultPrettyPrinter3.writeObjectFieldValueSeparator(jsonGenerator36);
        jsonGenerator36.writeBooleanField("JSON", true);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = jsonGenerator36.useDefaultPrettyPrinter();
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , #]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonGenerator46);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory0.createJsonParser("JSON");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory0.enable(feature35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonParser34);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory0.createJsonParser("JSON");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes35 = jsonFactory0.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonLocation jsonLocation39 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) characterEscapes35, (long) (short) 100, (int) '4', 2000);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNull(characterEscapes35);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) (short) 100);
        boolean boolean33 = jsonParser30.requiresCustomCodec();
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        jsonParser30.setCodec(objectCodec34);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.String str31 = jsonParser30.nextTextValue();
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = null;
        boolean boolean33 = jsonParser30.canUseSchema(formatSchema32);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonParser30.setFeatureMask((int) (short) 100);
        int int36 = jsonParser30.getFeatureMask();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator32 = jsonFactory31.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream39 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray36, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        java.io.InputStream inputStream41 = null;
        byte[] byteArray42 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream45 = new com.fasterxml.jackson.core.io.MergedStream(iOContext40, inputStream41, byteArray42, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader49 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext33, inputStream35, byteArray42, 0, 0, false);
        char[] charArray52 = new char[] { ' ', '#' };
        int int53 = uTF32Reader49.read(charArray52);
        char[] charArray57 = new char[] { ' ', '#', '4' };
        int int60 = uTF32Reader49.read(charArray57, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser61 = jsonFactory31.createParser((java.io.Reader) uTF32Reader49);
        int int63 = jsonParser61.nextIntValue((int) 'a');
        int int64 = jsonParser61.getFeatureMask();
        double double65 = jsonParser61.getValueAsDouble();
        java.lang.Object obj66 = jsonParser61.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature67 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        boolean boolean68 = jsonParser61.isEnabled(feature67);
        com.fasterxml.jackson.core.JsonParser jsonParser69 = jsonParser30.enable(feature67);
        int int71 = jsonParser69.getValueAsInt(55296);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(inputDecorator32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[ , #]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(jsonParser61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature67.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jsonParser69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 55296 + "'", int71 == 55296);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        boolean boolean35 = jsonGenerator32.isClosed();
        com.fasterxml.jackson.core.TreeNode treeNode36 = null;
        jsonGenerator32.writeTree(treeNode36);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature38 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
        boolean boolean39 = jsonGenerator32.isEnabled(feature38);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN + "'", feature38.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory0.setCodec(objectCodec33);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory34.createGenerator(writer35);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory34.setInputDecorator(inputDecorator37);
        java.io.OutputStream outputStream39 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator40 = jsonFactory38.createJsonGenerator(outputStream39);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.lang.Object obj31 = jsonParser30.getTypeId();
        char[] charArray32 = jsonParser30.getTextCharacters();
        char[] charArray33 = jsonParser30.getTextCharacters();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertNull(charArray33);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        int int32 = jsonParser30.nextIntValue((int) 'a');
        jsonParser30.close();
        com.fasterxml.jackson.core.Version version34 = jsonParser30.version();
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonParser30.skipChildren();
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(version34);
        org.junit.Assert.assertNotNull(jsonParser35);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        boolean boolean2 = jsonFactory0.requiresPropertyOrdering();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator4 = jsonFactory3.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream11 = new com.fasterxml.jackson.core.io.MergedStream(iOContext6, inputStream7, byteArray8, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader21 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext5, inputStream7, byteArray14, 0, 0, false);
        char[] charArray24 = new char[] { ' ', '#' };
        int int25 = uTF32Reader21.read(charArray24);
        char[] charArray29 = new char[] { ' ', '#', '4' };
        int int32 = uTF32Reader21.read(charArray29, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory3.createParser((java.io.Reader) uTF32Reader21);
        int int35 = jsonParser33.nextIntValue((int) 'a');
        int int36 = jsonParser33.getFeatureMask();
        double double37 = jsonParser33.getValueAsDouble();
        java.lang.Object obj38 = jsonParser33.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        boolean boolean40 = jsonParser33.isEnabled(feature39);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory0.disable(feature39);
        boolean boolean42 = jsonFactory41.requiresPropertyOrdering();
        com.fasterxml.jackson.core.io.IOContext iOContext43 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext44 = null;
        java.io.InputStream inputStream45 = null;
        byte[] byteArray46 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream49 = new com.fasterxml.jackson.core.io.MergedStream(iOContext44, inputStream45, byteArray46, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext50 = null;
        java.io.InputStream inputStream51 = null;
        byte[] byteArray52 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream55 = new com.fasterxml.jackson.core.io.MergedStream(iOContext50, inputStream51, byteArray52, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader59 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext43, inputStream45, byteArray52, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser62 = jsonFactory41.createParser(byteArray52, 0, (int) (byte) 0);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputDecorator4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(jsonParser62);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        boolean boolean33 = jsonGenerator32.isClosed();
        jsonGenerator32.writeStartObject();
        boolean boolean35 = jsonGenerator32.isClosed();
        jsonGenerator32.writeNumber(100.0d);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonGenerator32.setCodec(objectCodec38);
        com.fasterxml.jackson.core.TreeNode treeNode40 = null;
        jsonGenerator39.writeTree(treeNode40);
        com.fasterxml.jackson.core.io.IOContext iOContext43 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext44 = null;
        java.io.InputStream inputStream45 = null;
        byte[] byteArray46 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream49 = new com.fasterxml.jackson.core.io.MergedStream(iOContext44, inputStream45, byteArray46, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext50 = null;
        java.io.InputStream inputStream51 = null;
        byte[] byteArray52 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream55 = new com.fasterxml.jackson.core.io.MergedStream(iOContext50, inputStream51, byteArray52, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader59 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext43, inputStream45, byteArray52, 0, 0, false);
        jsonGenerator39.writeBinaryField("", byteArray52);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator4 = jsonFactory3.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream11 = new com.fasterxml.jackson.core.io.MergedStream(iOContext6, inputStream7, byteArray8, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader21 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext5, inputStream7, byteArray14, 0, 0, false);
        char[] charArray24 = new char[] { ' ', '#' };
        int int25 = uTF32Reader21.read(charArray24);
        char[] charArray29 = new char[] { ' ', '#', '4' };
        int int32 = uTF32Reader21.read(charArray29, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory3.createParser((java.io.Reader) uTF32Reader21);
        java.io.Writer writer34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonFactory3.createJsonGenerator(writer34);
        boolean boolean36 = jsonGenerator35.isClosed();
        jsonGenerator35.writeStartObject();
        com.fasterxml.jackson.core.JsonGenerator.Feature feature38 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean39 = jsonGenerator35.isEnabled(feature38);
        defaultPrettyPrinter0.writeObjectFieldValueSeparator(jsonGenerator35);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator42 = jsonFactory41.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext43 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext44 = null;
        java.io.InputStream inputStream45 = null;
        byte[] byteArray46 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream49 = new com.fasterxml.jackson.core.io.MergedStream(iOContext44, inputStream45, byteArray46, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext50 = null;
        java.io.InputStream inputStream51 = null;
        byte[] byteArray52 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream55 = new com.fasterxml.jackson.core.io.MergedStream(iOContext50, inputStream51, byteArray52, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader59 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext43, inputStream45, byteArray52, 0, 0, false);
        char[] charArray62 = new char[] { ' ', '#' };
        int int63 = uTF32Reader59.read(charArray62);
        char[] charArray67 = new char[] { ' ', '#', '4' };
        int int70 = uTF32Reader59.read(charArray67, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser71 = jsonFactory41.createParser((java.io.Reader) uTF32Reader59);
        int int73 = jsonParser71.nextIntValue((int) 'a');
        jsonParser71.close();
        com.fasterxml.jackson.core.JsonLocation jsonLocation75 = jsonParser71.getCurrentLocation();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator35.copyCurrentEvent(jsonParser71);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature38.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputDecorator42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[ , #]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(jsonParser71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertNotNull(jsonLocation75);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        defaultPrettyPrinter0.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = jsonFactory5.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream13 = new com.fasterxml.jackson.core.io.MergedStream(iOContext8, inputStream9, byteArray10, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream19 = new com.fasterxml.jackson.core.io.MergedStream(iOContext14, inputStream15, byteArray16, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader23 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext7, inputStream9, byteArray16, 0, 0, false);
        char[] charArray26 = new char[] { ' ', '#' };
        int int27 = uTF32Reader23.read(charArray26);
        char[] charArray31 = new char[] { ' ', '#', '4' };
        int int34 = uTF32Reader23.read(charArray31, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory5.createParser((java.io.Reader) uTF32Reader23);
        java.io.Writer writer36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonFactory5.createJsonGenerator(writer36);
        boolean boolean38 = jsonGenerator37.isClosed();
        defaultPrettyPrinter4.writeObjectFieldValueSeparator(jsonGenerator37);
        jsonGenerator37.writeNumberField("[Source: false; line: 1, column: 0]", (int) (short) 100);
        org.junit.Assert.assertNull(inputDecorator6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator2 = jsonFactory1.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext4 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray6 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream9 = new com.fasterxml.jackson.core.io.MergedStream(iOContext4, inputStream5, byteArray6, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream15 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray12, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader19 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, inputStream5, byteArray12, 0, 0, false);
        char[] charArray22 = new char[] { ' ', '#' };
        int int23 = uTF32Reader19.read(charArray22);
        char[] charArray27 = new char[] { ' ', '#', '4' };
        int int30 = uTF32Reader19.read(charArray27, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory1.createParser((java.io.Reader) uTF32Reader19);
        java.io.Writer writer32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonFactory1.createJsonGenerator(writer32);
        boolean boolean34 = jsonGenerator33.isClosed();
        jsonGenerator33.writeStartObject();
        boolean boolean36 = jsonGenerator33.isClosed();
        defaultPrettyPrinter0.writeEndObject(jsonGenerator33, (int) (byte) -1);
        com.fasterxml.jackson.core.FormatSchema formatSchema39 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator33.setSchema(formatSchema39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(inputDecorator2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , #]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        boolean boolean20 = jsonFactory0.requiresPropertyOrdering();
        com.fasterxml.jackson.core.io.IOContext iOContext21 = null;
        java.io.InputStream inputStream22 = null;
        byte[] byteArray23 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream26 = new com.fasterxml.jackson.core.io.MergedStream(iOContext21, inputStream22, byteArray23, 0, (int) (short) -1);
        int int27 = mergedStream26.available();
        boolean boolean28 = mergedStream26.markSupported();
        int int29 = mergedStream26.available();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createJsonParser((java.io.InputStream) mergedStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator1 = jsonFactory0.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream8 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray5, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream14 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray11, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream4, byteArray11, 0, 0, false);
        char[] charArray21 = new char[] { ' ', '#' };
        int int22 = uTF32Reader18.read(charArray21);
        char[] charArray26 = new char[] { ' ', '#', '4' };
        int int29 = uTF32Reader18.read(charArray26, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory0.createParser((java.io.Reader) uTF32Reader18);
        java.io.Writer writer31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory0.createJsonGenerator(writer31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory0.setCodec(objectCodec33);
        java.io.Writer writer35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory34.createGenerator(writer35);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory34.setInputDecorator(inputDecorator37);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator39 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory38.setInputDecorator(inputDecorator39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory38.setCodec(objectCodec41);
        org.junit.Assert.assertNull(inputDecorator1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonFactory42);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = defaultPrettyPrinter0.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = defaultPrettyPrinter1.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator4 = jsonFactory3.getInputDecorator();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream11 = new com.fasterxml.jackson.core.io.MergedStream(iOContext6, inputStream7, byteArray8, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        com.fasterxml.jackson.core.io.MergedStream mergedStream17 = new com.fasterxml.jackson.core.io.MergedStream(iOContext12, inputStream13, byteArray14, 0, (int) (short) -1);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader21 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext5, inputStream7, byteArray14, 0, 0, false);
        char[] charArray24 = new char[] { ' ', '#' };
        int int25 = uTF32Reader21.read(charArray24);
        char[] charArray29 = new char[] { ' ', '#', '4' };
        int int32 = uTF32Reader21.read(charArray29, (int) (short) 100, (int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory3.createParser((java.io.Reader) uTF32Reader21);
        java.io.Writer writer34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonFactory3.createJsonGenerator(writer34);
        boolean boolean36 = jsonGenerator35.isClosed();
        jsonGenerator35.writeStartObject();
        boolean boolean38 = jsonGenerator35.isClosed();
        jsonGenerator35.writeNumber(100.0d);
        defaultPrettyPrinter2.beforeArrayValues(jsonGenerator35);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter1);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter2);
        org.junit.Assert.assertNull(inputDecorator4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }
}


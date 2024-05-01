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
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = jsonParser3.releaseBuffered(outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.JsonParser.Feature feature4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jsonFactory0.isEnabled(feature4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = jsonParser3.readBinaryValue(outputStream4);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@18811c42; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.JsonParser.Feature feature4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.disable(feature4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader9 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext0, inputStream1, byteArray4, (int) (short) 10, (int) (short) 10, false);
        char[] charArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = uTF32Reader9.read(charArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        com.fasterxml.jackson.core.FormatSchema formatSchema7 = jsonParser3.getSchema();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(formatSchema7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonParser3.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonParser3.nextIntValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'd': was expecting ('true', 'false' or 'null')? at [Source: [B@5a70976a; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.String str8 = jsonParser3.getValueAsString("N/A");
        com.fasterxml.jackson.core.Version version9 = jsonParser3.version();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "N/A" + "'", str8, "N/A");
        org.junit.Assert.assertNotNull(version9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        int int4 = jsonParser3.getTextOffset();
        java.lang.String str5 = jsonParser3.getText();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jsonParser3.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'd': was expecting ('true', 'false' or 'null')? at [Source: [B@36e6ea6c; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = jsonParser11.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@5df5fe8; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = uTF8StreamJsonParser12.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.Object obj7 = jsonParser3.getObjectId();
        boolean boolean8 = jsonParser3.hasTextCharacters();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken17 = uTF8StreamJsonParser12._handleUnexpectedValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected character ((CTRL-CHAR, code 1)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        int int4 = jsonParser3.getTextOffset();
        jsonParser3.overrideCurrentName("hi!");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser("hi!");
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory5.configure(feature8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature6 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory0.enable(feature6);
        boolean boolean9 = feature6.enabledIn(2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature6.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.Object obj7 = jsonParser3.getObjectId();
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = jsonParser3.getSchema();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken9 = jsonParser3.nextValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'd': was expecting ('true', 'false' or 'null')? at [Source: [B@78eb757e; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(formatSchema8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory0.createJsonGenerator(outputStream4, jsonEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.JsonFactory.Feature feature4 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.enable(feature4);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory0.createJsonParser(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature4.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.String str7 = jsonParser3.getText();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = jsonParser3.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@1561d672; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        int int8 = jsonParser3.getValueAsInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.Name name16 = uTF8StreamJsonParser12._handleOddName(79);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected character ('O' (code 79)): was expecting double-quote to start field name? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.Name name17 = uTF8StreamJsonParser12._handleOddName(56319);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected character ('?' (code 56319 / 0xdbff)): was expecting double-quote to start field name? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._reportInvalidInitial((int) '4');
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Invalid UTF-8 start byte 0x34? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = jsonParser7.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: java.io.StringReader@7af1786; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = uTF8StreamJsonParser12.nextLongValue((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._reportInvalidToken("");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token '': was expecting 'null', 'true', 'false' or NaN? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        int int4 = jsonParser3.getTextOffset();
        long long5 = jsonParser3.getValueAsLong();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken15 = uTF8StreamJsonParser12.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.format.InputAccessor inputAccessor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.format.MatchStrength matchStrength20 = jsonFactory18.hasFormat(inputAccessor19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        int int17 = uTF8StreamJsonParser12.getValueAsInt(56320);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = uTF8StreamJsonParser12.nextLongValue((long) 56319);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 56320 + "'", int17 == 56320);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = jsonFactory5.isEnabled(feature30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader9 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext0, inputStream1, byteArray4, (int) (short) 10, (int) (short) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            uTF32Reader9.freeBuffers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = uTF8StreamJsonParser12.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = uTF8StreamJsonParser12._decodeCharForError((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Invalid UTF-8 start byte 0xff? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.Object obj7 = jsonParser3.getObjectId();
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = jsonParser3.getCurrentLocation();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonParser3.nextLongValue(1L);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'd': was expecting ('true', 'false' or 'null')? at [Source: [B@4668fe0d; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(jsonLocation8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        double double17 = uTF8StreamJsonParser12.getValueAsDouble((double) (byte) 100);
        com.fasterxml.jackson.core.Base64Variant base64Variant18 = null;
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = uTF8StreamJsonParser12._readBinary(base64Variant18, outputStream19, byteArray22);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected end-of-input in null? at [Source: 4; line: 1, column: 67]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.String str8 = jsonParser3.getValueAsString("N/A");
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) "N/A", 0L, (int) (byte) 10, 0);
        java.lang.String str13 = jsonLocation12.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "N/A" + "'", str8, "N/A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Source: N/A; line: 10, column: 0]" + "'", str13, "[Source: N/A; line: 10, column: 0]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.io.IOContext iOContext13 = null;
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray17 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory15.createParser(byteArray17);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader22 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext13, inputStream14, byteArray17, (int) (short) 10, (int) (short) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseReadIOBuffer(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(jsonParser18);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken30 = jsonParser29.nextValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Invalid numeric value: Leading zeroes not allowed? at [Source: [B@169ddbb6; line: 1, column: 2]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = uTF8StreamJsonParser12.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.Name name18 = uTF8StreamJsonParser12._parseAposName();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected end-of-input: was expecting closing ''' for name? at [Source: 4; line: 1, column: 67]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory18.createJsonGenerator(outputStream20);
        jsonGenerator21.writeFieldName("[Source: N/A; line: 10, column: 0]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        double double17 = uTF8StreamJsonParser12.getValueAsDouble((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.Name name18 = uTF8StreamJsonParser12.slowParseName();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected end-of-input: was expecting closing '\"' for name? at [Source: 4; line: 1, column: 67]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = uTF8StreamJsonParser12.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        int int17 = uTF8StreamJsonParser12.getValueAsInt(56320);
        com.fasterxml.jackson.core.Version version18 = uTF8StreamJsonParser12.version();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 56320 + "'", int17 == 56320);
        org.junit.Assert.assertNotNull(version18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = iOContext3.allocNameCopyBuffer((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.JsonFactory.Feature feature4 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.enable(feature4);
        int int6 = feature4.getMask();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature4.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken4 = jsonParser3.nextValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'd': was expecting ('true', 'false' or 'null')? at [Source: [B@59cfcb58; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        boolean boolean6 = jsonFactory5.requiresCustomCodec();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.Name name17 = uTF8StreamJsonParser12.slowParseName();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected end-of-input: was expecting closing '\"' for name? at [Source: 4; line: 1, column: 67]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.Name name18 = uTF8StreamJsonParser12.slowParseName();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected end-of-input: was expecting closing '\"' for name? at [Source: 4; line: 1, column: 67]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        com.fasterxml.jackson.core.Base64Variant base64Variant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = uTF8StreamJsonParser12.getBinaryValue(base64Variant18);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        com.fasterxml.jackson.core.Base64Variant base64Variant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = uTF8StreamJsonParser12.getBinaryValue(base64Variant15);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        byte[] byteArray30 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory5.createJsonParser(byteArray30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory5.copy();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonFactory32);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = uTF8StreamJsonParser12.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.JsonFactory.Feature feature4 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.enable(feature4);
        byte[] byteArray6 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory5.createJsonParser(byteArray6, 2, 10);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = jsonParser9.getSchema();
        jsonParser9.overrideCurrentName("");
        com.fasterxml.jackson.core.Version version13 = jsonParser9.version();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature4.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(version13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        int int4 = jsonParser3.getTextOffset();
        java.lang.String str5 = jsonParser3.getText();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken6 = jsonParser3.nextToken();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'd': was expecting ('true', 'false' or 'null')? at [Source: [B@5b60460; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser("hi!");
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = jsonParser7.getTokenLocation();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser7.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonParser9.nextIntValue((int) (byte) -65);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'hi': was expecting ? at [Source: java.io.StringReader@7cf2fe7f; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonLocation8);
        org.junit.Assert.assertNotNull(jsonParser9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory20.createJsonGenerator(outputStream22);
        defaultPrettyPrinter1.writeObjectEntrySeparator(jsonGenerator23);
        char[] charArray29 = new char[] { 'a', ' ', '#', ' ' };
        jsonGenerator23.writeRaw(charArray29, 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString33 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator23.writeRaw(serializableString33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a,  , #,  ]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        uTF8StreamJsonParser12.overrideCurrentName("ROOT");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory20.createJsonGenerator(outputStream22);
        defaultPrettyPrinter1.writeObjectEntrySeparator(jsonGenerator23);
        char[] charArray29 = new char[] { 'a', ' ', '#', ' ' };
        jsonGenerator23.writeRaw(charArray29, 1, (int) (short) 0);
        boolean boolean33 = jsonGenerator23.canOmitFields();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a,  , #,  ]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF8StreamJsonParser12, (long) 33, (int) (byte) -1, (int) (short) 1);
        int int19 = jsonLocation18.getLineNr();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        java.io.InputStream inputStream15 = uTF8StreamJsonParser12._inputStream;
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.String str8 = jsonParser3.getValueAsString("N/A");
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = jsonParser3.getSchema();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "N/A" + "'", str8, "N/A");
        org.junit.Assert.assertNull(formatSchema9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        int int17 = uTF8StreamJsonParser12.getValueAsInt(56320);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.Name name19 = uTF8StreamJsonParser12._parseName(79);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected character ('O' (code 79)): was expecting double-quote to start field name? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 56320 + "'", int17 == 56320);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser("hi!");
        boolean boolean8 = jsonFactory5.requiresCustomCodec();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray6 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser(byteArray6);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser("hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes8 = jsonFactory5.getCharacterEscapes();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(characterEscapes8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        java.io.InputStream inputStream12 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory5.createParser(inputStream12);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(jsonParser13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        int int19 = uTF8StreamJsonParser12._decodeCharForError((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        boolean boolean18 = uTF8StreamJsonParser12.hasCurrentToken();
        java.lang.String str20 = uTF8StreamJsonParser12.getValueAsString("false");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "false" + "'", str20, "false");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = uTF8StreamJsonParser12.nextLongValue((long) 56320);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory5.createParser(byteArray7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory5.setCodec(objectCodec9);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory10.createParser(byteArray13, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray19 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory17.createParser(byteArray19);
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory17.enable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory10.enable(feature21);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = jsonFactory23._getBufferRecycler();
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = jsonFactory23.createJsonGenerator(outputStream25);
        jsonGenerator26.flush();
        defaultPrettyPrinter4.writeEndArray(jsonGenerator26, (int) '4');
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(bufferRecycler24);
        org.junit.Assert.assertNotNull(jsonGenerator26);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray5 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory3.createParser(byteArray5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory3.setCodec(objectCodec7);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray17 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory15.createParser(byteArray17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory15.enable(feature19);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory8.enable(feature19);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = jsonFactory21._getBufferRecycler();
        java.io.OutputStream outputStream23 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = jsonFactory21.createJsonGenerator(outputStream23);
        jsonGenerator24.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator24);
        boolean boolean27 = jsonGenerator24.isClosed();
        java.io.InputStream inputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = jsonGenerator24.writeBinary(inputStream28, (int) (byte) -65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(bufferRecycler22);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory5.setRootValueSeparator(" ");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonFactory31);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.JsonFactory.Feature feature4 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.enable(feature4);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = jsonFactory0.getCharacterEscapes();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature4.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNull(characterEscapes6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = null;
        boolean boolean31 = jsonParser29.canUseSchema(formatSchema30);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader9 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext0, inputStream1, byteArray4, (int) (short) 10, (int) (short) 10, false);
        boolean boolean10 = uTF32Reader9.markSupported();
        long long12 = uTF32Reader9.skip((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            uTF32Reader9.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reset() not supported");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = jsonParser3.getTokenLocation();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonLocation6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        java.lang.String str40 = serializedString0.getValue();
        com.fasterxml.jackson.core.SerializableString serializableString41 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter42 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString41);
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray45 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser46 = jsonFactory43.createParser(byteArray45);
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory43.setCodec(objectCodec47);
        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory48.createParser(byteArray51, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray57 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser58 = jsonFactory55.createParser(byteArray57);
        com.fasterxml.jackson.core.JsonFactory.Feature feature59 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = jsonFactory55.enable(feature59);
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = jsonFactory48.enable(feature59);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler62 = jsonFactory61._getBufferRecycler();
        java.io.OutputStream outputStream63 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator64 = jsonFactory61.createJsonGenerator(outputStream63);
        defaultPrettyPrinter42.writeObjectEntrySeparator(jsonGenerator64);
        jsonGenerator64.writeString("");
        char[] charArray72 = new char[] { '#', 'a', ' ', '4' };
        jsonGenerator64.writeRawValue(charArray72, (int) (short) 10, (int) (byte) 0);
        int int77 = serializedString0.appendUnquoted(charArray72, 56320);
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " " + "'", str40, " ");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100]");
        org.junit.Assert.assertNotNull(jsonParser46);
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100]");
        org.junit.Assert.assertNotNull(jsonParser58);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertNotNull(jsonFactory61);
        org.junit.Assert.assertNotNull(bufferRecycler62);
        org.junit.Assert.assertNotNull(jsonGenerator64);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "#a 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "#a 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[#, a,  , 4]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        com.fasterxml.jackson.core.io.SerializedString serializedString15 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.setCodec(objectCodec20);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory21.createParser(byteArray24, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray30 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory28.createParser(byteArray30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory28.enable(feature32);
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory21.enable(feature32);
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray37 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory35.createParser(byteArray37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory35.enable(feature39);
        byte[] byteArray41 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory40.createJsonParser(byteArray41, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser45 = jsonFactory21.createParser(byteArray41);
        int int47 = serializedString15.appendUnquotedUTF8(byteArray41, 56319);
        byte[] byteArray48 = serializedString15.asUnquotedUTF8();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = uTF8StreamJsonParser12.nextFieldName((com.fasterxml.jackson.core.SerializableString) serializedString15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(serializedString15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100]");
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[32]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        int int4 = jsonParser3.getTextOffset();
        int int5 = jsonParser3.getTextOffset();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        java.lang.String str40 = serializedString0.getValue();
        com.fasterxml.jackson.core.io.SerializedString serializedString41 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray44 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser45 = jsonFactory42.createParser(byteArray44);
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = jsonFactory42.setCodec(objectCodec46);
        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory47.createParser(byteArray50, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray56 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser57 = jsonFactory54.createParser(byteArray56);
        com.fasterxml.jackson.core.JsonFactory.Feature feature58 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory54.enable(feature58);
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = jsonFactory47.enable(feature58);
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray63 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser64 = jsonFactory61.createParser(byteArray63);
        com.fasterxml.jackson.core.JsonFactory.Feature feature65 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = jsonFactory61.enable(feature65);
        byte[] byteArray67 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonFactory66.createJsonParser(byteArray67, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser71 = jsonFactory47.createParser(byteArray67);
        int int73 = serializedString41.appendUnquotedUTF8(byteArray67, 56319);
        int int75 = serializedString0.appendUnquotedUTF8(byteArray67, (int) '4');
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " " + "'", str40, " ");
        org.junit.Assert.assertNotNull(serializedString41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100]");
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[100]");
        org.junit.Assert.assertNotNull(jsonParser57);
        org.junit.Assert.assertTrue("'" + feature58 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature58.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[100]");
        org.junit.Assert.assertNotNull(jsonParser64);
        org.junit.Assert.assertTrue("'" + feature65 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature65.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory66);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(jsonParser71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        com.fasterxml.jackson.core.Base64Variant base64Variant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = uTF8StreamJsonParser12.getBinaryValue(base64Variant16);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        java.lang.String str16 = uTF8StreamJsonParser12.getText();
        boolean boolean17 = uTF8StreamJsonParser12.loadMore();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.String str8 = jsonParser3.getValueAsString("N/A");
        double double10 = jsonParser3.getValueAsDouble((double) (short) 100);
        java.lang.String str11 = jsonParser3.getCurrentName();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "N/A" + "'", str8, "N/A");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) '4', true);
        java.io.InputStream inputStream13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer15 = null;
        byte[] byteArray16 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser20 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext11, 0, inputStream13, objectCodec14, bytesToNameCanonicalizer15, byteArray16, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken21 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str22 = uTF8StreamJsonParser20._getText2(jsonToken21);
        com.fasterxml.jackson.core.JsonLocation jsonLocation26 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF8StreamJsonParser20, (long) 33, (int) (byte) -1, (int) (short) 1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray29 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory27.createParser(byteArray29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory27.setCodec(objectCodec31);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory32.createJsonParser("hi!");
        java.lang.Object obj35 = jsonParser34.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonParser34.disable(feature36);
        com.fasterxml.jackson.core.JsonParser jsonParser39 = uTF8StreamJsonParser20.configure(feature36, false);
        boolean boolean40 = jsonFactory5.isEnabled(feature36);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken21 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken21.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        com.fasterxml.jackson.core.io.IOContext iOContext4 = null;
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser(byteArray8);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader13 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext4, inputStream5, byteArray8, (int) (short) 10, (int) (short) 10, false);
        boolean boolean14 = uTF32Reader13.markSupported();
        long long16 = uTF32Reader13.skip((long) ' ');
        char[] charArray17 = new char[] {};
        int int20 = uTF32Reader13.read(charArray17, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseTokenBuffer(charArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        java.io.OutputStream outputStream40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = serializedString0.writeUnquotedUTF8(outputStream40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.core.sym.Name name0 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.getEmptyName();
        boolean boolean2 = name0.equals((java.lang.Object) 10L);
        int[] intArray3 = com.fasterxml.jackson.core.io.CharTypes.getInputCodeComment();
        int[] intArray5 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray3, 100);
        boolean boolean7 = name0.equals(intArray3, (int) (byte) 10);
        boolean boolean9 = name0.equals(56319);
        org.junit.Assert.assertNotNull(name0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 10, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, -1, -1, -1, -1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 10, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = serializedString0.putUnquotedUTF8(byteBuffer40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF8StreamJsonParser12, (long) 33, (int) (byte) -1, (int) (short) 1);
        int[] intArray19 = com.fasterxml.jackson.core.io.CharTypes.getInputCodeComment();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.Name name24 = uTF8StreamJsonParser12.parseEscapedName(intArray19, (int) (byte) -65, (int) '#', (int) (byte) 100, 56320);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -65");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 10, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, -1, -1, -1, -1, -1, -1, -1, -1]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = jsonFactory5.getCodec();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNull(objectCodec19);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding20 = com.fasterxml.jackson.core.JsonEncoding.UTF8;
        boolean boolean21 = jsonEncoding20.isBigEndian();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = jsonFactory5.createJsonGenerator(outputStream19, jsonEncoding20);
        jsonGenerator22.writeNumber((int) ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + jsonEncoding20 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF8 + "'", jsonEncoding20.equals(com.fasterxml.jackson.core.JsonEncoding.UTF8));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonGenerator22);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        java.lang.String str16 = uTF8StreamJsonParser12.getText();
        java.lang.String str17 = uTF8StreamJsonParser12.getCurrentName();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext15 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler12, (java.lang.Object) '4', true);
        java.io.InputStream inputStream17 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = null;
        byte[] byteArray20 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext15, 0, inputStream17, objectCodec18, bytesToNameCanonicalizer19, byteArray20, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken25 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str26 = uTF8StreamJsonParser24._getText2(jsonToken25);
        com.fasterxml.jackson.core.JsonLocation jsonLocation30 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF8StreamJsonParser24, (long) 33, (int) (byte) -1, (int) (short) 1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray33 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory31.createParser(byteArray33);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory31.setCodec(objectCodec35);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createJsonParser("hi!");
        java.lang.Object obj39 = jsonParser38.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature40 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonParser38.disable(feature40);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = uTF8StreamJsonParser24.configure(feature40, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory5.disable(feature40);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken25 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken25.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100]");
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES + "'", feature40.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertNotNull(jsonFactory44);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.lang.String str20 = jsonFactory18.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray23 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory21.createParser(byteArray23);
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory18.createParser(byteArray23);
        boolean boolean26 = jsonParser25.getValueAsBoolean();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        boolean boolean13 = uTF8StreamJsonParser12.hasTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = uTF8StreamJsonParser12.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory18.createJsonGenerator(outputStream20);
        int int22 = jsonGenerator21.getHighestEscapedChar();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        int int17 = uTF8StreamJsonParser12.getValueAsInt(56320);
        boolean boolean18 = uTF8StreamJsonParser12.isClosed();
        java.lang.String str19 = uTF8StreamJsonParser12.getValueAsString();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._reportInvalidToken("N/A", "");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'N/A': was expecting ? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 56320 + "'", int17 == 56320);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream13 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.setCodec(objectCodec18);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory19.createParser(byteArray22, (-1), 0);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader29 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, inputStream13, byteArray22, (int) (byte) -1, 2, true);
        boolean boolean30 = uTF32Reader29.markSupported();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        boolean boolean13 = uTF8StreamJsonParser12.hasTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._reportInvalidInitial((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Invalid UTF-8 start byte 0x0? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = serializedString0.putQuotedUTF8(byteBuffer40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.enable(feature6);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createParser(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonFactory9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.String str8 = jsonParser3.getValueAsString("N/A");
        boolean boolean9 = jsonParser3.hasTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = jsonParser3.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@48651295; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "N/A" + "'", str8, "N/A");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        byte[] byteArray30 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory5.createJsonParser(byteArray30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray34 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory32.createParser(byteArray34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory32.setCodec(objectCodec36);
        com.fasterxml.jackson.core.JsonFactory.Feature feature38 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean40 = feature38.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory37.enable(feature38);
        boolean boolean42 = jsonFactory5.isEnabled(feature38);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getCurrentToken();
        long long18 = uTF8StreamJsonParser12.getValueAsLong((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._reportInvalidOther(79);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Invalid UTF-8 middle byte 0x4f? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.JsonFactory.Feature feature4 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.enable(feature4);
        boolean boolean6 = feature4.enabledByDefault();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature4.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._reportInvalidInitial((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Invalid UTF-8 start byte 0x0? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.SerializableString serializableString3 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString3);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser(byteArray8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory6.setCodec(objectCodec10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory11.createParser(byteArray14, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray20 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory18.createParser(byteArray20);
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.enable(feature22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory11.enable(feature22);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = jsonFactory24._getBufferRecycler();
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory24.createJsonGenerator(outputStream26);
        jsonGenerator27.flush();
        defaultPrettyPrinter5.beforeObjectEntries(jsonGenerator27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = jsonGenerator27.getCodec();
        com.fasterxml.jackson.core.Version version31 = jsonGenerator27.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonGenerator27.setHighestNonEscapedChar((int) (short) 0);
        defaultPrettyPrinter1.writeEndObject(jsonGenerator33, 1);
        com.fasterxml.jackson.core.SerializableString serializableString36 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter37 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString36);
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray40 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonFactory38.createParser(byteArray40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = jsonFactory38.setCodec(objectCodec42);
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory43.createParser(byteArray46, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray52 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory50.createParser(byteArray52);
        com.fasterxml.jackson.core.JsonFactory.Feature feature54 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = jsonFactory50.enable(feature54);
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory43.enable(feature54);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler57 = jsonFactory56._getBufferRecycler();
        java.io.OutputStream outputStream58 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator59 = jsonFactory56.createJsonGenerator(outputStream58);
        defaultPrettyPrinter37.writeObjectEntrySeparator(jsonGenerator59);
        jsonGenerator59.writeString("");
        com.fasterxml.jackson.core.JsonFactory jsonFactory63 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray65 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory63.createParser(byteArray65);
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = jsonFactory63.setCodec(objectCodec67);
        com.fasterxml.jackson.core.JsonFactory.Feature feature69 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean71 = feature69.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = jsonFactory68.enable(feature69);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature73 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean74 = jsonFactory68.isEnabled(feature73);
        boolean boolean75 = feature73.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator76 = jsonGenerator59.disable(feature73);
        defaultPrettyPrinter1.writeStartObject(jsonGenerator59);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(bufferRecycler25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNull(objectCodec30);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100]");
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100]");
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature54.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory55);
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(bufferRecycler57);
        org.junit.Assert.assertNotNull(jsonGenerator59);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[100]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(jsonFactory68);
        org.junit.Assert.assertTrue("'" + feature69 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature69.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(jsonFactory72);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature73.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jsonGenerator76);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        boolean boolean18 = uTF8StreamJsonParser12.hasCurrentToken();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = uTF8StreamJsonParser12._symbols;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = uTF8StreamJsonParser12.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(bytesToNameCanonicalizer19);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType20 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version22 = jsonFactory21.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        byte[] byteArray32 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory31.createJsonParser(byteArray32, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory21.createParser(byteArray32, (int) (short) 10, 2);
        bufferRecycler19.releaseByteBuffer(byteBufferType20, byteArray32);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertTrue("'" + byteBufferType20 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType20.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser38);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType16 = uTF8StreamJsonParser12.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory5.createParser(byteArray7);
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory5.enable(feature9);
        byte[] byteArray11 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory10.createJsonParser(byteArray11, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory0.createParser(byteArray11, (int) (short) 10, 2);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory0.setCharacterEscapes(characterEscapes18);
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        boolean boolean13 = uTF8StreamJsonParser12.hasTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._matchToken("[Source: N/A; line: 10, column: 0]", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader9 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext0, inputStream1, byteArray4, (int) (short) 10, (int) (short) 10, false);
        boolean boolean10 = uTF32Reader9.markSupported();
        long long12 = uTF32Reader9.skip((long) ' ');
        char[] charArray13 = new char[] {};
        int int16 = uTF32Reader9.read(charArray13, (int) (byte) -1, 0);
        int int17 = uTF32Reader9.read();
        boolean boolean18 = uTF32Reader9.markSupported();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        int int17 = uTF8StreamJsonParser12.getTokenColumnNr();
        boolean boolean18 = uTF8StreamJsonParser12.loadMore();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        java.lang.String str40 = serializedString0.getValue();
        java.lang.String str41 = serializedString0.getValue();
        java.io.OutputStream outputStream42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = serializedString0.writeQuotedUTF8(outputStream42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " " + "'", str40, " ");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " " + "'", str41, " ");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream13 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.setCodec(objectCodec18);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory19.createParser(byteArray22, (-1), 0);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader29 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, inputStream13, byteArray22, (int) (byte) -1, 2, true);
        boolean boolean30 = uTF32Reader29.ready();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = uTF8StreamJsonParser12.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.lang.String str20 = jsonFactory18.getRootValueSeparator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes21 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.setCharacterEscapes(characterEscapes21);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertNotNull(jsonFactory22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature6 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean7 = feature6.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature6, false);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory5.setOutputDecorator(outputDecorator10);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory5.setOutputDecorator(outputDecorator12);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature6.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonFactory13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonParser3.skipChildren();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser3.setFeatureMask((int) (byte) -65);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonParser9.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@35fcfca2; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonParser9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray5 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory3.createParser(byteArray5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory3.setCodec(objectCodec7);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray17 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory15.createParser(byteArray17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory15.enable(feature19);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory8.enable(feature19);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = jsonFactory21._getBufferRecycler();
        java.io.OutputStream outputStream23 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = jsonFactory21.createJsonGenerator(outputStream23);
        jsonGenerator24.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator24);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator24.writeEndObject();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Current context not an object but ROOT");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(bufferRecycler22);
        org.junit.Assert.assertNotNull(jsonGenerator24);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray5 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory3.createParser(byteArray5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory3.setCodec(objectCodec7);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray17 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory15.createParser(byteArray17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory15.enable(feature19);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory8.enable(feature19);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = jsonFactory21._getBufferRecycler();
        java.io.OutputStream outputStream23 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = jsonFactory21.createJsonGenerator(outputStream23);
        jsonGenerator24.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator24);
        boolean boolean27 = jsonGenerator24.isClosed();
        jsonGenerator24.writeNumberField("false", 0.0f);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext35 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler32, (java.lang.Object) '4', true);
        java.io.InputStream inputStream37 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer39 = null;
        byte[] byteArray40 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser44 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext35, 0, inputStream37, objectCodec38, bytesToNameCanonicalizer39, byteArray40, 33, 33, false);
        java.io.InputStream inputStream45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray48 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory46.createParser(byteArray48);
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = jsonFactory46.setCodec(objectCodec50);
        byte[] byteArray54 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser57 = jsonFactory51.createParser(byteArray54, (-1), 0);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader61 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext35, inputStream45, byteArray54, (int) (byte) -1, 2, true);
        jsonGenerator24.writeBinaryField("", byteArray54);
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = jsonGenerator24.getCodec();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(bufferRecycler22);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100]");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser57);
        org.junit.Assert.assertNull(objectCodec63);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        int int16 = uTF8StreamJsonParser12._decodeCharForError((int) '#');
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray18 = jsonToken17.asByteArray();
        java.lang.String str19 = uTF8StreamJsonParser12._getText2(jsonToken17);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "false" + "'", str19, "false");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.Object obj7 = jsonParser3.getObjectId();
        boolean boolean8 = jsonParser3.hasCurrentToken();
        boolean boolean9 = jsonParser3.canReadTypeId();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonParser3.skipChildren();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory18.createJsonGenerator(outputStream20);
        jsonGenerator21.flush();
        jsonGenerator21.writeString("UTF-16LE");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        long long14 = uTF8StreamJsonParser12.getValueAsLong(100L);
        java.io.OutputStream outputStream15 = null;
        int int16 = uTF8StreamJsonParser12.releaseBuffered(outputStream15);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory20.createJsonGenerator(outputStream22);
        defaultPrettyPrinter1.writeObjectEntrySeparator(jsonGenerator23);
        com.fasterxml.jackson.core.SerializableString serializableString25 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter26 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString25);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter27 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter26);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter28 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        defaultPrettyPrinter26.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter28);
        defaultPrettyPrinter1.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter28);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter31 = defaultPrettyPrinter1.createInstance();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter28);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter31);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.JsonFactory.Feature feature4 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.enable(feature4);
        byte[] byteArray6 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory5.createJsonParser(byteArray6, 2, 10);
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser9.enable(feature10);
        int int12 = jsonParser9.getValueAsInt();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature4.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature10.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter2 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.SerializableString serializableString3 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString3);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser(byteArray8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory6.setCodec(objectCodec10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory11.createParser(byteArray14, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray20 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory18.createParser(byteArray20);
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.enable(feature22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory11.enable(feature22);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = jsonFactory24._getBufferRecycler();
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory24.createJsonGenerator(outputStream26);
        jsonGenerator27.flush();
        defaultPrettyPrinter5.beforeObjectEntries(jsonGenerator27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = jsonGenerator27.getCodec();
        com.fasterxml.jackson.core.Version version31 = jsonGenerator27.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonGenerator27.setHighestNonEscapedChar((int) (short) 0);
        lf2SpacesIndenter2.writeIndentation(jsonGenerator27, 79);
        jsonGenerator27.writeNumberField(" ", (long) (byte) 10);
        defaultPrettyPrinter1.writeEndObject(jsonGenerator27, (int) (byte) 100);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter2);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(bufferRecycler25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNull(objectCodec30);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        java.lang.String str40 = serializedString0.getValue();
        java.io.OutputStream outputStream41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = serializedString0.writeUnquotedUTF8(outputStream41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " " + "'", str40, " ");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonParser3.skipChildren();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext8 = jsonParser7.getParsingContext();
        int int9 = jsonStreamContext8.getCurrentIndex();
        java.lang.String str10 = jsonStreamContext8.getTypeDesc();
        boolean boolean11 = jsonStreamContext8.inObject();
        int int12 = jsonStreamContext8.getEntryCount();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonStreamContext8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ROOT" + "'", str10, "ROOT");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.Version version13 = uTF8StreamJsonParser12.version();
        java.lang.String str14 = uTF8StreamJsonParser12.getCurrentName();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        com.fasterxml.jackson.core.Version version17 = uTF8StreamJsonParser12.version();
        boolean boolean19 = uTF8StreamJsonParser12.getValueAsBoolean(true);
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._reportInvalidOther(0);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Invalid UTF-8 middle byte 0x0? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        java.lang.String str16 = uTF8StreamJsonParser12.getText();
        long long17 = uTF8StreamJsonParser12.getTokenCharacterOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = uTF8StreamJsonParser12.getTokenLocation();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(jsonLocation18);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser("hi!");
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = jsonParser7.getTokenLocation();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser7.skipChildren();
        java.lang.String str11 = jsonParser7.getValueAsString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = jsonParser7.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: java.io.StringReader@3884aede; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonLocation8);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF8StreamJsonParser12, (long) 33, (int) (byte) -1, (int) (short) 1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.setCodec(objectCodec23);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonFactory24.createJsonParser("hi!");
        java.lang.Object obj27 = jsonParser26.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonParser26.disable(feature28);
        com.fasterxml.jackson.core.JsonParser jsonParser31 = uTF8StreamJsonParser12.configure(feature28, false);
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = uTF8StreamJsonParser12.getTokenLocation();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES + "'", feature28.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonLocation32);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader9 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext0, inputStream1, byteArray4, (int) (short) 10, (int) (short) 10, false);
        int int10 = uTF32Reader9.read();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.SerializableString serializableString3 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString3);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser(byteArray8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory6.setCodec(objectCodec10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory11.createParser(byteArray14, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray20 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory18.createParser(byteArray20);
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.enable(feature22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory11.enable(feature22);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = jsonFactory24._getBufferRecycler();
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory24.createJsonGenerator(outputStream26);
        jsonGenerator27.flush();
        defaultPrettyPrinter5.beforeObjectEntries(jsonGenerator27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = jsonGenerator27.getCodec();
        com.fasterxml.jackson.core.Version version31 = jsonGenerator27.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonGenerator27.setHighestNonEscapedChar((int) (short) 0);
        defaultPrettyPrinter1.writeEndObject(jsonGenerator33, 1);
        com.fasterxml.jackson.core.SerializableString serializableString36 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter37 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString36);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter38 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter37);
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray41 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory39.createParser(byteArray41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory39.setCodec(objectCodec43);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory44.createParser(byteArray47, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray53 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory51.createParser(byteArray53);
        com.fasterxml.jackson.core.JsonFactory.Feature feature55 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory51.enable(feature55);
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = jsonFactory44.enable(feature55);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler58 = jsonFactory57._getBufferRecycler();
        java.io.OutputStream outputStream59 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = jsonFactory57.createJsonGenerator(outputStream59);
        jsonGenerator60.flush();
        defaultPrettyPrinter38.beforeObjectEntries(jsonGenerator60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = jsonGenerator60.getCodec();
        com.fasterxml.jackson.core.Version version64 = jsonGenerator60.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator66 = jsonGenerator60.setCodec(objectCodec65);
        defaultPrettyPrinter1.writeArrayValueSeparator(jsonGenerator60);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(bufferRecycler25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNull(objectCodec30);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100]");
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[100]");
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonFactory57);
        org.junit.Assert.assertNotNull(bufferRecycler58);
        org.junit.Assert.assertNotNull(jsonGenerator60);
        org.junit.Assert.assertNull(objectCodec63);
        org.junit.Assert.assertNotNull(version64);
        org.junit.Assert.assertNotNull(jsonGenerator66);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.setCodec(objectCodec8);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory9.createParser(byteArray12, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.enable(feature20);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = jsonFactory22._getBufferRecycler();
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory22.createJsonGenerator(outputStream24);
        jsonGenerator25.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator25);
        java.lang.Object obj28 = jsonGenerator25.getOutputTarget();
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(bufferRecycler23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        char[] charArray40 = serializedString0.asQuotedChars();
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ ]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray5 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory3.createParser(byteArray5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory3.setCodec(objectCodec7);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray17 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory15.createParser(byteArray17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory15.enable(feature19);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory8.enable(feature19);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = jsonFactory21._getBufferRecycler();
        java.io.OutputStream outputStream23 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = jsonFactory21.createJsonGenerator(outputStream23);
        jsonGenerator24.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = jsonGenerator24.getCodec();
        com.fasterxml.jackson.core.Version version28 = jsonGenerator24.version();
        int int29 = jsonGenerator24.getHighestEscapedChar();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(bufferRecycler22);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertNull(objectCodec27);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        java.lang.String str2 = jsonFactory0.getFormatName();
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = jsonFactory0.getCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.setCodec(objectCodec8);
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean12 = feature10.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory9.enable(feature10);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature14 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean15 = jsonFactory9.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.enable(feature20);
        boolean boolean23 = jsonFactory0.isEnabled(feature20);
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSON" + "'", str2, "JSON");
        org.junit.Assert.assertNull(objectCodec3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature14.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        int int16 = uTF8StreamJsonParser12.getTextOffset();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader18 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, inputStream13, byteArray14, (int) ' ', 100, true);
        com.fasterxml.jackson.core.io.SerializedString serializedString19 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.setCodec(objectCodec24);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory25.createParser(byteArray28, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray34 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory32.createParser(byteArray34);
        com.fasterxml.jackson.core.JsonFactory.Feature feature36 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory32.enable(feature36);
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory25.enable(feature36);
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray41 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory39.createParser(byteArray41);
        com.fasterxml.jackson.core.JsonFactory.Feature feature43 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory39.enable(feature43);
        byte[] byteArray45 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory44.createJsonParser(byteArray45, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory25.createParser(byteArray45);
        int int51 = serializedString19.appendUnquotedUTF8(byteArray45, 56319);
        byte[] byteArray52 = serializedString19.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray55 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory53.createParser(byteArray55);
        int int58 = serializedString19.appendQuotedUTF8(byteArray55, (int) (byte) 0);
        java.lang.String str59 = serializedString19.getValue();
        com.fasterxml.jackson.core.SerializableString serializableString60 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter61 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString60);
        com.fasterxml.jackson.core.JsonFactory jsonFactory62 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray64 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser65 = jsonFactory62.createParser(byteArray64);
        com.fasterxml.jackson.core.ObjectCodec objectCodec66 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory67 = jsonFactory62.setCodec(objectCodec66);
        byte[] byteArray70 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser73 = jsonFactory67.createParser(byteArray70, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory74 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray76 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser77 = jsonFactory74.createParser(byteArray76);
        com.fasterxml.jackson.core.JsonFactory.Feature feature78 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory79 = jsonFactory74.enable(feature78);
        com.fasterxml.jackson.core.JsonFactory jsonFactory80 = jsonFactory67.enable(feature78);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler81 = jsonFactory80._getBufferRecycler();
        java.io.OutputStream outputStream82 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator83 = jsonFactory80.createJsonGenerator(outputStream82);
        defaultPrettyPrinter61.writeObjectEntrySeparator(jsonGenerator83);
        jsonGenerator83.writeString("");
        char[] charArray91 = new char[] { '#', 'a', ' ', '4' };
        jsonGenerator83.writeRawValue(charArray91, (int) (short) 10, (int) (byte) 0);
        int int96 = serializedString19.appendUnquoted(charArray91, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = uTF32Reader18.read(charArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(serializedString19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100]");
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(byteArray45);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[32]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[32]");
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + " " + "'", str59, " ");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[100]");
        org.junit.Assert.assertNotNull(jsonParser65);
        org.junit.Assert.assertNotNull(jsonFactory67);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser73);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[100]");
        org.junit.Assert.assertNotNull(jsonParser77);
        org.junit.Assert.assertTrue("'" + feature78 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature78.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory79);
        org.junit.Assert.assertNotNull(jsonFactory80);
        org.junit.Assert.assertNotNull(bufferRecycler81);
        org.junit.Assert.assertNotNull(jsonGenerator83);
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), "#a 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), "#a 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[#, a,  , 4]");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.SerializableString serializableString3 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString3);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser(byteArray8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory6.setCodec(objectCodec10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory11.createParser(byteArray14, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray20 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory18.createParser(byteArray20);
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.enable(feature22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory11.enable(feature22);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = jsonFactory24._getBufferRecycler();
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory24.createJsonGenerator(outputStream26);
        jsonGenerator27.flush();
        defaultPrettyPrinter5.beforeObjectEntries(jsonGenerator27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = jsonGenerator27.getCodec();
        com.fasterxml.jackson.core.Version version31 = jsonGenerator27.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonGenerator27.setHighestNonEscapedChar((int) (short) 0);
        defaultPrettyPrinter1.writeEndObject(jsonGenerator33, 1);
        jsonGenerator33.writeNumber((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(bufferRecycler25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNull(objectCodec30);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
    }
}

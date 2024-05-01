package com.fasterxml.jackson.core.util;

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
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = jsonParser6.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.FormatSchema formatSchema7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonFactory2.canUseSchema(formatSchema7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser6.setSchema(formatSchema9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = jsonParser6.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = jsonParser6.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonParser6.readBinaryValue(base64Variant8, outputStream9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.io.OutputStream outputStream7 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory2.createJsonGenerator(outputStream7, jsonEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = jsonParser6.readBinaryValue(base64Variant10, outputStream11);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = jsonFactory2.getInputDecorator();
        com.fasterxml.jackson.core.JsonGenerator.Feature feature11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonFactory2.isEnabled(feature11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(inputDecorator10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonParser6.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not of boolean type? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonParser6.releaseBuffered(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory2.createParser(file10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.configure(feature5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        java.io.File file10 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = jsonFactory9.createJsonGenerator(file10, jsonEncoding11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext12 = jsonParser6.getParsingContext();
        java.lang.Boolean boolean13 = jsonParser6.nextBooleanValue();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(jsonStreamContext12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = jsonParser6.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes10 = jsonFactory2.getCharacterEscapes();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator11 = jsonFactory2.getOutputDecorator();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(characterEscapes10);
        org.junit.Assert.assertNull(outputDecorator11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        char[] charArray9 = jsonParser6.getTextCharacters();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(charArray9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = jsonParser19.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [C@24bef73d; line: 1, column: 262145]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        boolean boolean8 = jsonParser6.getValueAsBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = jsonParser6.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: ; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        java.lang.Boolean boolean16 = jsonParser15.nextBooleanValue();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.getValueAsLong(100L);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = jsonParser6.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 13]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        // The following exception was thrown during execution in test generation
        try {
            short short12 = jsonParser6.getShortValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = jsonParser6.nextValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType12 = jsonParser6.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + jsonToken11 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken11.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = jsonParser6.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 13]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonParser6.releaseBuffered(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        boolean boolean8 = jsonParser6.getValueAsBoolean(false);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonParser6.readBinaryValue(outputStream9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: ; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        int int8 = jsonParser6.getValueAsInt((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = jsonParser6.getClass();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.getValueAsLong(100L);
        java.lang.Object obj15 = jsonParser6.getEmbeddedObject();
        com.fasterxml.jackson.core.Base64Variant base64Variant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = jsonParser6.getBinaryValue(base64Variant16);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 13]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = jsonParser6.getBinaryValue(base64Variant9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str8 = jsonParser6.getCurrentName();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException12 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation11);
        java.lang.String str13 = jsonParseException12.getOriginalMessage();
        java.lang.Throwable[] throwableArray14 = jsonParseException12.getSuppressed();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory16.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken19 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean20 = jsonToken19.isBoolean();
        byte[] byteArray21 = jsonToken19.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory18.createJsonParser(byteArray21);
        jsonParser22.close();
        java.lang.Object obj24 = jsonParser22.getEmbeddedObject();
        boolean boolean25 = jsonParser22.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation26 = jsonParser22.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException27 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation26);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory29.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken32 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean33 = jsonToken32.isBoolean();
        byte[] byteArray34 = jsonToken32.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory31.createJsonParser(byteArray34);
        jsonParser35.close();
        java.lang.Object obj37 = jsonParser35.getEmbeddedObject();
        boolean boolean38 = jsonParser35.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation39 = jsonParser35.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException40 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation39);
        java.lang.String str41 = jsonParseException40.getOriginalMessage();
        jsonParseException27.addSuppressed((java.lang.Throwable) jsonParseException40);
        java.lang.Throwable[] throwableArray43 = jsonParseException40.getSuppressed();
        jsonParseException12.addSuppressed((java.lang.Throwable) jsonParseException40);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + jsonToken19 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken19.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonLocation26);
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertTrue("'" + jsonToken32 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken32.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonLocation39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        java.lang.Object obj16 = jsonParser15.getEmbeddedObject();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        java.lang.Boolean boolean8 = jsonParser6.nextBooleanValue();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = jsonParser6.nextValue();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        boolean boolean11 = feature7.enabledIn(262144);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        java.lang.String str9 = jsonParser6.nextTextValue();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = jsonParser15.canUseSchema(formatSchema16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = jsonParser15.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = jsonParser6.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = jsonParser6.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonParser6.readBinaryValue(outputStream10);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = jsonParser6.nextToken();
        boolean boolean8 = jsonToken7.isStructStart();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        long long12 = jsonParser6.getValueAsLong((long) 1000);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1000L + "'", long12 == 1000L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.getValueAsLong(100L);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        jsonParser6.setCodec(objectCodec15);
        java.lang.Object obj17 = jsonParser6.getEmbeddedObject();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        char[] charArray7 = jsonToken6.asCharArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray7, (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "{");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "{");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[{]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory0.createParser(inputStream5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonParser6.isEnabled(feature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        int int8 = jsonParser6.getValueAsInt((int) (byte) 1);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonParser6.releaseBuffered(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.getValueAsLong(100L);
        java.lang.Object obj15 = jsonParser6.getEmbeddedObject();
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = jsonParser6.readBinaryValue(outputStream16);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 13]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        int int10 = jsonParser6.nextIntValue((int) (short) 10);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        java.lang.Boolean boolean8 = jsonParser6.nextBooleanValue();
        int int9 = jsonParser6.getFeatureMask();
        // The following exception was thrown during execution in test generation
        try {
            float float10 = jsonParser6.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: ; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = jsonParser15.canUseSchema(formatSchema16);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = jsonParser15.readBinaryValue(outputStream18);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = jsonParser19.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [C@21034138; line: 1, column: 262145]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser6.canReadObjectId();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = jsonParser6.getCurrentToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer2 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler1);
        textBuffer2.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray9 = bufferRecycler6.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray12 = new char[] { ' ' };
        bufferRecycler6.releaseCharBuffer(0, charArray12);
        textBuffer2.resetWithShared(charArray12, 4000, 4);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory0.createParser(charArray12);
        int int18 = jsonParser17.getCurrentTokenId();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        java.lang.Object obj11 = jsonParser6.getObjectId();
        boolean boolean12 = jsonParser6.canReadObjectId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        java.lang.Boolean boolean8 = jsonParser6.nextBooleanValue();
        int int9 = jsonParser6.getFeatureMask();
        java.io.OutputStream outputStream10 = null;
        int int11 = jsonParser6.releaseBuffered(outputStream10);
        boolean boolean12 = jsonParser6.isExpectedStartArrayToken();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray9 = new char[] { 'a', ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray9, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a ##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a ##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , #, #]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        java.io.OutputStream outputStream7 = null;
        int int8 = jsonParser6.releaseBuffered(outputStream7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = jsonParser6.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        long long10 = jsonParser6.getValueAsLong();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        java.lang.String str12 = jsonParser6.getCurrentName();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory17.enable(feature18);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory19.disable(feature20);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonParser6.enable(feature20);
        boolean boolean23 = jsonParser22.canReadObjectId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = jsonParser4.getTokenLocation();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonLocation5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        boolean boolean8 = jsonParser6.getValueAsBoolean(false);
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        boolean boolean10 = jsonParser6.canUseSchema(formatSchema9);
        int int11 = jsonParser6.getTextOffset();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        int int4 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        int int4 = textBuffer1.size();
        char[] charArray5 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray5, 0, 4000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        boolean boolean3 = jsonFactory0.requiresPropertyOrdering();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory0.createJsonParser("}");
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory0.createParser(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonParser5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        double double8 = jsonParser6.getValueAsDouble();
        boolean boolean9 = jsonParser6.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonParser6.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer2 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler1);
        textBuffer2.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray9 = bufferRecycler6.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray12 = new char[] { ' ' };
        bufferRecycler6.releaseCharBuffer(0, charArray12);
        textBuffer2.resetWithShared(charArray12, 4000, 4);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory0.createParser(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = jsonParser17.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [C@41231e5a; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ]");
        org.junit.Assert.assertNotNull(jsonParser17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException12 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation11);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory15.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken18 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean19 = jsonToken18.isBoolean();
        byte[] byteArray20 = jsonToken18.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory17.createJsonParser(byteArray20);
        jsonParser21.close();
        java.lang.Object obj23 = jsonParser21.getEmbeddedObject();
        boolean boolean24 = jsonParser21.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation25 = jsonParser21.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException26 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation25);
        java.lang.Throwable throwable27 = null;
        com.fasterxml.jackson.core.JsonParseException jsonParseException28 = new com.fasterxml.jackson.core.JsonParseException("", jsonLocation25, throwable27);
        // The following exception was thrown during execution in test generation
        try {
            jsonParseException12.addSuppressed(throwable27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + jsonToken18 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken18.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonLocation25);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        int int8 = jsonParser6.getValueAsInt();
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = jsonParser6.getCurrentLocation();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jsonLocation9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean10 = jsonParser6.getValueAsBoolean(false);
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser6.setSchema(formatSchema11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean9 = feature7.enabledIn(1);
        int int10 = feature7.getMask();
        boolean boolean12 = feature7.enabledIn((int) (short) 10);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.disable(feature7);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 256 + "'", int10 == 256);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext12 = jsonParser6.getParsingContext();
        boolean boolean13 = jsonParser6.hasCurrentToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(jsonStreamContext12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        java.io.OutputStream outputStream7 = null;
        int int8 = jsonParser6.releaseBuffered(outputStream7);
        java.io.Writer writer9 = null;
        int int10 = jsonParser6.releaseBuffered(writer9);
        com.fasterxml.jackson.core.JsonToken jsonToken11 = jsonParser6.nextValue();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.String str7 = jsonFactory2.getRootValueSeparator();
        java.io.File file8 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory2.createGenerator(file8, jsonEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        double double9 = jsonParser6.getValueAsDouble(0.0d);
        int int10 = jsonParser6.getValueAsInt();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        java.lang.String str9 = jsonParser6.getValueAsString();
        int int10 = jsonParser6.getTextOffset();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        java.lang.Class<?> wildcardClass10 = jsonParser9.getClass();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory0.createParser("JSON");
        int int7 = jsonParser6.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType8 = jsonParser6.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: JSON; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory0.createParser("JSON");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = jsonParser6.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'JSON': was expecting ('true', 'false' or 'null')? at [Source: JSON; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        double double9 = jsonParser6.getValueAsDouble();
        int int11 = jsonParser6.nextIntValue(0);
        boolean boolean12 = jsonParser6.getBooleanValue();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.expandCurrentSegment(3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        java.lang.Boolean boolean8 = jsonParser6.nextBooleanValue();
        int int9 = jsonParser6.getFeatureMask();
        java.lang.String str10 = jsonParser6.getCurrentName();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = jsonParser6.nextToken();
        java.lang.Object obj8 = jsonParser6.getObjectId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        int int8 = jsonParser6.getValueAsInt((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = jsonParser6.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        java.io.Writer writer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = jsonParser19.releaseBuffered(writer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        long long12 = jsonParser6.nextLongValue((long) (byte) 0);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.resetWithEmpty();
        char[] charArray7 = textBuffer5.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray7, 4000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        jsonParser15.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            float float17 = jsonParser15.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory2.copy();
        java.lang.String str11 = jsonFactory2.getRootValueSeparator();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonParser6.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = jsonParser6.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonParser6.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append('4');
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        boolean boolean11 = jsonParser6.canReadObjectId();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = jsonParser6.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        java.io.OutputStream outputStream7 = null;
        int int8 = jsonParser6.releaseBuffered(outputStream7);
        java.io.Writer writer9 = null;
        int int10 = jsonParser6.releaseBuffered(writer9);
        jsonParser6.overrideCurrentName("JSON");
        java.lang.String str13 = jsonParser6.nextTextValue();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean14 = feature12.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonParser9.configure(feature12, true);
        boolean boolean17 = feature12.enabledByDefault();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = jsonParser6.nextToken();
        int int8 = jsonToken7.id();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory0.createGenerator(outputStream5);
        java.io.Writer writer7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory0.createJsonGenerator(writer7);
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory0.createGenerator(writer9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory11.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean15 = jsonToken14.isBoolean();
        byte[] byteArray16 = jsonToken14.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory13.createJsonParser(byteArray16);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser17.configure(feature18, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.disable(feature18);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory0.setOutputDecorator(outputDecorator22);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory23.enable(feature24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory23);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory0.createParser("JSON");
        int int7 = jsonParser6.getCurrentTokenId();
        java.io.OutputStream outputStream8 = null;
        int int9 = jsonParser6.releaseBuffered(outputStream8);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        boolean boolean13 = jsonParser6.isExpectedStartArrayToken();
        boolean boolean14 = jsonParser6.getValueAsBoolean();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory8.setRootValueSeparator("hi!");
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory8.createJsonParser(byteArray11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createJsonParser(byteArray11);
        char[] charArray14 = jsonParser13.getTextCharacters();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNull(charArray14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        boolean boolean17 = feature12.enabledIn((int) (byte) 10);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser("");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory6.disable(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertNotNull(jsonParser9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.getValueAsLong(100L);
        com.fasterxml.jackson.core.SerializableString serializableString15 = null;
        boolean boolean16 = jsonParser6.nextFieldName(serializableString15);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        boolean boolean12 = jsonParser6.hasTextCharacters();
        java.lang.Object obj13 = jsonParser6.getObjectId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        double double9 = jsonParser6.getValueAsDouble();
        double double11 = jsonParser6.getValueAsDouble((double) (byte) 10);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        int int4 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("null", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        char[] charArray8 = new char[] { 'a', ' ', '4', '4', '#', '4' };
        bufferRecycler0.releaseCharBuffer((int) (byte) 0, charArray8);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray20 = bufferRecycler17.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray23 = new char[] { ' ' };
        bufferRecycler17.releaseCharBuffer(0, charArray23);
        textBuffer13.resetWithShared(charArray23, 4000, 4);
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory11.createParser(charArray23);
        // The following exception was thrown during execution in test generation
        try {
            bufferRecycler0.releaseCharBuffer(100, charArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 44#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 44#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4, 4, #, 4]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ ]");
        org.junit.Assert.assertNotNull(jsonParser28);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.core.JsonLocation jsonLocation1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory3.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken6 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean7 = jsonToken6.isBoolean();
        byte[] byteArray8 = jsonToken6.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory5.createJsonParser(byteArray8);
        jsonParser9.close();
        java.lang.Object obj11 = jsonParser9.getEmbeddedObject();
        boolean boolean12 = jsonParser9.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = jsonParser9.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException14 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation13);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory16.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken19 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean20 = jsonToken19.isBoolean();
        byte[] byteArray21 = jsonToken19.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory18.createJsonParser(byteArray21);
        jsonParser22.close();
        java.lang.Object obj24 = jsonParser22.getEmbeddedObject();
        boolean boolean25 = jsonParser22.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation26 = jsonParser22.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException27 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation26);
        java.lang.String str28 = jsonParseException27.getOriginalMessage();
        jsonParseException14.addSuppressed((java.lang.Throwable) jsonParseException27);
        com.fasterxml.jackson.core.JsonParseException jsonParseException30 = new com.fasterxml.jackson.core.JsonParseException("}", jsonLocation1, (java.lang.Throwable) jsonParseException27);
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory34.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken37 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean38 = jsonToken37.isBoolean();
        byte[] byteArray39 = jsonToken37.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory36.createJsonParser(byteArray39);
        jsonParser40.close();
        java.lang.Object obj42 = jsonParser40.getEmbeddedObject();
        boolean boolean43 = jsonParser40.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation44 = jsonParser40.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException45 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory47.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken50 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean51 = jsonToken50.isBoolean();
        byte[] byteArray52 = jsonToken50.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory49.createJsonParser(byteArray52);
        jsonParser53.close();
        java.lang.Object obj55 = jsonParser53.getEmbeddedObject();
        boolean boolean56 = jsonParser53.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation57 = jsonParser53.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException58 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation57);
        java.lang.String str59 = jsonParseException58.getOriginalMessage();
        jsonParseException45.addSuppressed((java.lang.Throwable) jsonParseException58);
        com.fasterxml.jackson.core.JsonParseException jsonParseException61 = new com.fasterxml.jackson.core.JsonParseException("}", jsonLocation32, (java.lang.Throwable) jsonParseException58);
        java.lang.Throwable[] throwableArray62 = jsonParseException58.getSuppressed();
        java.lang.Throwable[] throwableArray63 = jsonParseException58.getSuppressed();
        jsonParseException30.addSuppressed((java.lang.Throwable) jsonParseException58);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + jsonToken19 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken19.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonLocation26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertTrue("'" + jsonToken37 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken37.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jsonLocation44);
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertTrue("'" + jsonToken50 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken50.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonLocation57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray5 = bufferRecycler2.allocByteBuffer(2, (int) (byte) 10);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator12 = jsonFactory11.getInputDecorator();
        java.lang.String str13 = jsonFactory11.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator15 = jsonFactory14.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.configure(feature16, true);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory18.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean22 = feature21.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.enable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory11.configure(feature21, false);
        byte[] byteArray27 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory11.createJsonParser(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            bufferRecycler2.releaseByteBuffer((int) ' ', byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNull(inputDecorator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertNull(outputDecorator15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser28);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        int int7 = jsonParser6.getTextOffset();
        java.lang.Boolean boolean8 = jsonParser6.nextBooleanValue();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        boolean boolean3 = jsonFactory0.requiresPropertyOrdering();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory0.createJsonParser("}");
        com.fasterxml.jackson.core.JsonToken jsonToken6 = jsonParser5.getLastClearedToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNull(jsonToken6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        boolean boolean10 = jsonFactory2.requiresCustomCodec();
        char[] charArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory2.createParser(charArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        long long11 = jsonParser9.getValueAsLong();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext12 = jsonParser9.getParsingContext();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(jsonStreamContext12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean8 = feature7.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.enable(feature7);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory4.createJsonParser(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonFactory9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        long long12 = jsonParser6.getValueAsLong((long) 3);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        int int4 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray8 = bufferRecycler5.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray11 = new char[] { ' ' };
        bufferRecycler5.releaseCharBuffer(0, charArray11);
        textBuffer1.resetWithShared(charArray11, 4000, 4);
        java.lang.Class<?> wildcardClass16 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        java.io.OutputStream outputStream10 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = jsonFactory2.createJsonGenerator(outputStream10);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonGenerator11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.SerializableString serializableString7 = null;
        boolean boolean8 = jsonParser6.nextFieldName(serializableString7);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory8.setRootValueSeparator("hi!");
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory8.createJsonParser(byteArray11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createJsonParser(byteArray11);
        java.io.OutputStream outputStream14 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator15 = jsonFactory7.createGenerator(outputStream14);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonGenerator15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = jsonParser6.getCurrentLocation();
        double double12 = jsonParser6.getValueAsDouble((double) '4');
        java.lang.Object obj13 = jsonParser6.getEmbeddedObject();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonLocation10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException12 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation11);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean18 = jsonToken17.isBoolean();
        byte[] byteArray19 = jsonToken17.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory16.createJsonParser(byteArray19);
        jsonParser20.close();
        java.lang.Object obj22 = jsonParser20.getEmbeddedObject();
        boolean boolean23 = jsonParser20.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation24 = jsonParser20.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException25 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24);
        java.lang.String str26 = jsonParseException25.getOriginalMessage();
        jsonParseException12.addSuppressed((java.lang.Throwable) jsonParseException25);
        java.lang.Throwable[] throwableArray28 = jsonParseException12.getSuppressed();
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonLocation24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory8.setRootValueSeparator("hi!");
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory8.createJsonParser(byteArray11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createJsonParser(byteArray11);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory7.createParser(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(jsonParser13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory4.setRootValueSeparator("");
        boolean boolean9 = jsonFactory4.canUseCharArrays();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = jsonParser6.getCurrentToken();
        java.lang.Boolean boolean9 = jsonParser6.nextBooleanValue();
        long long10 = jsonParser6.getValueAsLong();
        boolean boolean11 = jsonParser6.isClosed();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        boolean boolean10 = jsonFactory2.requiresCustomCodec();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory2.createParser(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser6.skipChildren();
        java.lang.Object obj12 = jsonParser6.getInputSource();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        char[] charArray4 = textBuffer1.getTextBuffer();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory0.createParser("JSON");
        int int7 = jsonParser6.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonParser6.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: JSON; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser("");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory6.configure(feature10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertNotNull(jsonParser9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        java.lang.Object obj8 = jsonParser6.getInputSource();
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = jsonParser6.getBinaryValue(base64Variant9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createParser("true");
        java.lang.Object obj5 = jsonParser4.getTypeId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        boolean boolean11 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.setFeatureMask(4000);
        int int15 = jsonParser13.nextIntValue(10);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        byte[] byteArray20 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory4.createJsonParser(byteArray20);
        java.lang.Class<?> wildcardClass22 = jsonFactory4.getClass();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser6.canReadObjectId();
        java.lang.String str11 = jsonParser6.getCurrentName();
        int int12 = jsonParser6.getTextOffset();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory2.setCodec(objectCodec20);
        java.io.Reader reader22 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory2.createParser(reader22);
        long long25 = jsonParser23.getValueAsLong((long) (byte) 0);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        boolean boolean13 = jsonParser6.isExpectedStartArrayToken();
        java.lang.Object obj14 = jsonParser6.getTypeId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        int int10 = jsonParser6.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = jsonParser6.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        java.lang.String str10 = jsonParser6.nextTextValue();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = jsonParser6.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.nextValue();
        boolean boolean13 = jsonToken12.isStructStart();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser9.getCurrentToken();
        int int11 = jsonParser9.getValueAsInt();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        java.lang.String str12 = jsonParser6.getCurrentName();
        long long14 = jsonParser6.nextLongValue((long) 0);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonParser6.readBinaryValue(base64Variant8, outputStream9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: ; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory2.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean6 = jsonToken5.isBoolean();
        byte[] byteArray7 = jsonToken5.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory4.createJsonParser(byteArray7);
        jsonParser8.close();
        java.lang.Object obj10 = jsonParser8.getEmbeddedObject();
        boolean boolean11 = jsonParser8.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = jsonParser8.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException13 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory15.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken18 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean19 = jsonToken18.isBoolean();
        byte[] byteArray20 = jsonToken18.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory17.createJsonParser(byteArray20);
        jsonParser21.close();
        java.lang.Object obj23 = jsonParser21.getEmbeddedObject();
        boolean boolean24 = jsonParser21.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation25 = jsonParser21.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException26 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation25);
        java.lang.String str27 = jsonParseException26.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException28 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation12, (java.lang.Throwable) jsonParseException26);
        com.fasterxml.jackson.core.JsonLocation jsonLocation29 = jsonParseException28.getLocation();
        java.lang.String str30 = jsonParseException28.getOriginalMessage();
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + jsonToken18 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken18.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonLocation25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(jsonLocation29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        java.lang.Object obj11 = jsonParser6.getObjectId();
        boolean boolean12 = jsonParser6.isClosed();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        boolean boolean18 = jsonFactory13.canUseCharArrays();
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean21 = feature19.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory13.enable(feature19);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonParser6.disable(feature19);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = jsonParser6.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser23);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) ' ');
        int int5 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.nextLongValue(0L);
        int int15 = jsonParser6.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        jsonParser6.setCodec(objectCodec16);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory6.disable(feature7);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        byte[][] byteArray17 = bufferRecycler12._byteBuffers;
        char[][] charArray18 = bufferRecycler12._charBuffers;
        byte[] byteArray20 = bufferRecycler12.balloc((int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory8.createJsonParser(byteArray20, (int) (short) 10, 0);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory8.setInputDecorator(inputDecorator24);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(jsonFactory25);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser9.hasCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser9.setSchema(formatSchema11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        jsonParser15.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = jsonParser15.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.Version version16 = jsonParser4.version();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = jsonParser4.getLastClearedToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        double double9 = jsonParser6.getValueAsDouble();
        int int11 = jsonParser6.nextIntValue(0);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.getLastClearedToken();
        com.fasterxml.jackson.core.JsonToken jsonToken13 = jsonParser6.getLastClearedToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray5 = bufferRecycler2.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray8 = new char[] { ' ' };
        bufferRecycler2.releaseCharBuffer(0, charArray8);
        char[] charArray12 = bufferRecycler2.allocCharBuffer(0, (int) ' ');
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = jsonParser6.getCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser6.setSchema(formatSchema9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createParser("true");
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory2.setCodec(objectCodec5);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory2.enable(feature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        bufferRecycler7.releaseByteBuffer(1, byteArray13);
        bufferRecycler2.releaseByteBuffer(7, byteArray13);
        char[][] charArray16 = bufferRecycler2._charBuffers;
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1, -1]");
        org.junit.Assert.assertNotNull(charArray16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser9.getCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext11 = jsonParser9.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = jsonParser9.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNotNull(jsonStreamContext11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.core.JsonLocation jsonLocation1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken7 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean8 = jsonToken7.isBoolean();
        byte[] byteArray9 = jsonToken7.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory6.createJsonParser(byteArray9);
        jsonParser10.close();
        java.lang.Object obj12 = jsonParser10.getEmbeddedObject();
        boolean boolean13 = jsonParser10.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = jsonParser10.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException15 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory17.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken20 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean21 = jsonToken20.isBoolean();
        byte[] byteArray22 = jsonToken20.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory19.createJsonParser(byteArray22);
        jsonParser23.close();
        java.lang.Object obj25 = jsonParser23.getEmbeddedObject();
        boolean boolean26 = jsonParser23.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation27 = jsonParser23.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException28 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation27);
        java.lang.String str29 = jsonParseException28.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException30 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation14, (java.lang.Throwable) jsonParseException28);
        com.fasterxml.jackson.core.JsonParseException jsonParseException31 = new com.fasterxml.jackson.core.JsonParseException("JSON", jsonLocation1, (java.lang.Throwable) jsonParseException30);
        java.lang.String str32 = jsonParseException31.toString();
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jsonLocation27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: JSON" + "'", str32, "com.fasterxml.jackson.core.JsonParseException: JSON");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray8 = bufferRecycler5.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray11 = new char[] { ' ' };
        bufferRecycler5.releaseCharBuffer(0, charArray11);
        textBuffer1.resetWithShared(charArray11, 4000, 4);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = textBuffer1.getCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser6.canReadObjectId();
        java.lang.String str11 = jsonParser6.getCurrentName();
        java.lang.Object obj12 = jsonParser6.getTypeId();
        jsonParser6.close();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        char[] charArray4 = textBuffer3.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.getValueAsLong(100L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonParser6.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not of boolean type? at [Source: [B@2fe88a09; line: 1, column: 13]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.InputStream inputStream3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createParser(inputStream3);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray8 = bufferRecycler7._byteBuffers;
        byte[][] byteArray9 = bufferRecycler7._byteBuffers;
        char[] charArray11 = bufferRecycler7.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory2.createParser(charArray11);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(jsonParser12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory9.disable(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory8.setRootValueSeparator("hi!");
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory8.createJsonParser(byteArray11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createJsonParser(byteArray11);
        java.lang.String str14 = jsonParser13.getCurrentName();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        java.lang.String str11 = jsonParser6.getText();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "true" + "'", str11, "true");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        byte[] byteArray20 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory4.createJsonParser(byteArray20);
        com.fasterxml.jackson.core.JsonToken jsonToken22 = jsonParser21.getLastClearedToken();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNull(jsonToken22);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setCodec(objectCodec1);
        com.fasterxml.jackson.core.JsonParser.Feature feature3 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.configure(feature3, false);
        com.fasterxml.jackson.core.JsonToken jsonToken6 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean7 = jsonToken6.isStructEnd();
        boolean boolean8 = jsonToken6.isScalarValue();
        byte[] byteArray9 = jsonToken6.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory0.createParser(byteArray9);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature3.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator3 = jsonFactory0.getOutputDecorator();
        java.io.Reader reader4 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory0.createJsonParser(reader4);
        boolean boolean6 = jsonParser5.canReadTypeId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNull(outputDecorator3);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.getValueAsLong((long) 256);
        com.fasterxml.jackson.core.Base64Variant base64Variant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = jsonParser6.getBinaryValue(base64Variant11);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 256L + "'", long10 == 256L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory2.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean6 = jsonToken5.isBoolean();
        byte[] byteArray7 = jsonToken5.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory4.createJsonParser(byteArray7);
        jsonParser8.close();
        java.lang.Object obj10 = jsonParser8.getEmbeddedObject();
        boolean boolean11 = jsonParser8.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = jsonParser8.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException13 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory15.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken18 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean19 = jsonToken18.isBoolean();
        byte[] byteArray20 = jsonToken18.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory17.createJsonParser(byteArray20);
        jsonParser21.close();
        java.lang.Object obj23 = jsonParser21.getEmbeddedObject();
        boolean boolean24 = jsonParser21.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation25 = jsonParser21.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException26 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation25);
        com.fasterxml.jackson.core.JsonLocation jsonLocation27 = jsonParseException26.getLocation();
        java.lang.String str28 = jsonParseException26.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException29 = new com.fasterxml.jackson.core.JsonParseException("", jsonLocation12, (java.lang.Throwable) jsonParseException26);
        java.lang.String str30 = jsonParseException29.toString();
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + jsonToken18 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken18.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonLocation25);
        org.junit.Assert.assertNotNull(jsonLocation27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.nextValue();
        boolean boolean13 = jsonToken12.isBoolean();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.Version version16 = jsonParser4.version();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(version16);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        char[] charArray3 = bufferRecycler0.allocCharBuffer(0, (int) (short) -1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray13 = bufferRecycler10.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray16 = new char[] { ' ' };
        bufferRecycler10.releaseCharBuffer(0, charArray16);
        textBuffer6.resetWithShared(charArray16, 4000, 4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator22 = jsonFactory21.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, true);
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory21.createGenerator(outputStream26);
        java.io.Writer writer28 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = jsonFactory21.createJsonGenerator(writer28);
        java.io.Writer writer30 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonFactory21.createGenerator(writer30);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer33 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler32);
        textBuffer33.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler37 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray40 = bufferRecycler37.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray43 = new char[] { ' ' };
        bufferRecycler37.releaseCharBuffer(0, charArray43);
        textBuffer33.resetWithShared(charArray43, 4000, 4);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory21.createParser(charArray43, 262144, (-1));
        textBuffer6.resetWithShared(charArray43, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            bufferRecycler0.releaseCharBuffer((int) (short) 10, charArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ]");
        org.junit.Assert.assertNull(outputDecorator22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[ ]");
        org.junit.Assert.assertNotNull(jsonParser50);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser6.canReadObjectId();
        int int11 = jsonParser6.getValueAsInt();
        java.lang.Object obj12 = jsonParser6.getObjectId();
        com.fasterxml.jackson.core.FormatSchema formatSchema13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser6.setSchema(formatSchema13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory2.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean6 = jsonToken5.isBoolean();
        byte[] byteArray7 = jsonToken5.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory4.createJsonParser(byteArray7);
        jsonParser8.close();
        java.lang.Object obj10 = jsonParser8.getEmbeddedObject();
        boolean boolean11 = jsonParser8.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = jsonParser8.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException13 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory15.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken18 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean19 = jsonToken18.isBoolean();
        byte[] byteArray20 = jsonToken18.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory17.createJsonParser(byteArray20);
        jsonParser21.close();
        java.lang.Object obj23 = jsonParser21.getEmbeddedObject();
        boolean boolean24 = jsonParser21.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation25 = jsonParser21.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException26 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation25);
        com.fasterxml.jackson.core.JsonLocation jsonLocation27 = jsonParseException26.getLocation();
        java.lang.String str28 = jsonParseException26.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException29 = new com.fasterxml.jackson.core.JsonParseException("", jsonLocation12, (java.lang.Throwable) jsonParseException26);
        java.lang.Throwable[] throwableArray30 = jsonParseException26.getSuppressed();
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + jsonToken18 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken18.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonLocation25);
        org.junit.Assert.assertNotNull(jsonLocation27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.Version version16 = jsonParser4.version();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType17 = jsonParser4.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(version16);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory0.createGenerator(outputStream5);
        java.io.Writer writer7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory0.createJsonGenerator(writer7);
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory0.createGenerator(writer9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory11.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean15 = jsonToken14.isBoolean();
        byte[] byteArray16 = jsonToken14.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory13.createJsonParser(byteArray16);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser17.configure(feature18, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.disable(feature18);
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory21.createJsonParser(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory21);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory4.disable(feature19);
        boolean boolean21 = jsonFactory20.requiresPropertyOrdering();
        boolean boolean22 = jsonFactory20.canUseCharArrays();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser9.getCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext11 = jsonParser9.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            float float12 = jsonParser9.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNotNull(jsonStreamContext11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setCharacterEscapes(characterEscapes5);
        java.io.OutputStream outputStream7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory6.createJsonGenerator(outputStream7);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory6.createJsonParser("null");
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonParser10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean14 = feature12.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonParser9.configure(feature12, true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        jsonParser9.setCodec(objectCodec17);
        com.fasterxml.jackson.core.JsonToken jsonToken19 = jsonParser9.nextValue();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNull(jsonToken19);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        double double8 = jsonParser6.getValueAsDouble();
        int int9 = jsonParser6.getValueAsInt();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonParser6.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean14 = feature12.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonParser9.configure(feature12, true);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = jsonParser9.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext12 = jsonParser6.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = jsonParser6.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(jsonStreamContext12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.OutputStream outputStream2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(outputStream2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.copy();
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.core.JsonLocation jsonLocation1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken7 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean8 = jsonToken7.isBoolean();
        byte[] byteArray9 = jsonToken7.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory6.createJsonParser(byteArray9);
        jsonParser10.close();
        java.lang.Object obj12 = jsonParser10.getEmbeddedObject();
        boolean boolean13 = jsonParser10.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = jsonParser10.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException15 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory17.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken20 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean21 = jsonToken20.isBoolean();
        byte[] byteArray22 = jsonToken20.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory19.createJsonParser(byteArray22);
        jsonParser23.close();
        java.lang.Object obj25 = jsonParser23.getEmbeddedObject();
        boolean boolean26 = jsonParser23.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation27 = jsonParser23.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException28 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation27);
        java.lang.String str29 = jsonParseException28.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException30 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation14, (java.lang.Throwable) jsonParseException28);
        com.fasterxml.jackson.core.JsonParseException jsonParseException31 = new com.fasterxml.jackson.core.JsonParseException("JSON", jsonLocation1, (java.lang.Throwable) jsonParseException30);
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = jsonParseException31.getLocation();
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jsonLocation27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(jsonLocation32);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = jsonFactory2.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator22 = jsonFactory21.getOutputDecorator();
        java.io.Writer writer23 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = jsonFactory21.createJsonGenerator(writer23);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator26 = jsonFactory25.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory25.configure(feature27, true);
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory29.createParser("");
        byte[] byteArray32 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory29.createParser(byteArray32, 262144, 0);
        com.fasterxml.jackson.core.JsonToken jsonToken36 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean37 = jsonToken36.isStructEnd();
        boolean boolean38 = jsonToken36.isScalarValue();
        byte[] byteArray39 = jsonToken36.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory29.createJsonParser(byteArray39);
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonFactory21.createParser(byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory2.createParser(byteArray39, (-1), 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNull(characterEscapes20);
        org.junit.Assert.assertNull(outputDecorator22);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertNull(outputDecorator26);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + jsonToken36 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken36.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(jsonParser41);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser6.canReadObjectId();
        java.lang.String str11 = jsonParser6.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = jsonParser6.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        boolean boolean11 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.setFeatureMask(4000);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        java.io.Reader reader17 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory16.createJsonParser(reader17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator20 = jsonFactory19.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory19.configure(feature21, true);
        java.io.Reader reader24 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory23.createJsonParser(reader24);
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonParser25.configure(feature26, true);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonParser18.disable(feature26);
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = null;
        boolean boolean31 = jsonParser29.canUseSchema(formatSchema30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator33 = jsonFactory32.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory32.configure(feature34, true);
        java.io.Reader reader37 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createJsonParser(reader37);
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonParser38.configure(feature39, true);
        jsonParser41.clearCurrentToken();
        com.fasterxml.jackson.core.Version version43 = jsonParser41.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean46 = feature44.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonParser41.configure(feature44, true);
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonParser29.disable(feature44);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonParser13.enable(feature44);
        java.lang.Class<?> wildcardClass51 = feature44.getClass();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNull(outputDecorator20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature26.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(outputDecorator33);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNotNull(version43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.expandCurrentSegment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser("");
        java.io.OutputStream outputStream10 = null;
        int int11 = jsonParser9.releaseBuffered(outputStream10);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        boolean boolean8 = jsonParser6.requiresCustomCodec();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        boolean boolean11 = jsonParser6.canReadObjectId();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = jsonParser6.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        boolean boolean5 = jsonFactory0.canUseCharArrays();
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory0.enable(feature6);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = new com.fasterxml.jackson.core.util.BufferRecycler();
        char[] charArray13 = bufferRecycler10.allocCharBuffer(0, (int) (short) -1);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory9.createParser(charArray13);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory9.createParser(file15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(jsonParser14);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory7.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean11 = jsonToken10.isBoolean();
        byte[] byteArray12 = jsonToken10.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory9.createJsonParser(byteArray12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory9.configure(feature14, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory9.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator23 = jsonFactory22.getInputDecorator();
        java.lang.String str24 = jsonFactory22.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator26 = jsonFactory25.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory25.configure(feature27, true);
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory29.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean33 = feature32.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory29.enable(feature32);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory22.configure(feature32, false);
        com.fasterxml.jackson.core.JsonFactory.Feature feature37 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory22.disable(feature37);
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory9.enable(feature37);
        boolean boolean40 = jsonFactory4.isEnabled(feature37);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNull(inputDecorator23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " " + "'", str24, " ");
        org.junit.Assert.assertNull(outputDecorator26);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        int int8 = jsonParser6.getValueAsInt((int) (byte) 1);
        boolean boolean9 = jsonParser6.isExpectedStartArrayToken();
        boolean boolean10 = jsonParser6.canReadObjectId();
        java.lang.Object obj11 = jsonParser6.getEmbeddedObject();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        bufferRecycler2.releaseByteBuffer(1, byteArray8);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.size();
        char[] charArray19 = new char[] { 'a', ' ', 'a', '#', ' ' };
        textBuffer12.resetWithShared(charArray19, 100, 0);
        bufferRecycler2.releaseCharBuffer(0, charArray19);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a,  , a, #,  ]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean18 = jsonToken17.isBoolean();
        byte[] byteArray19 = jsonToken17.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory16.createJsonParser(byteArray19);
        jsonParser20.close();
        java.lang.Object obj22 = jsonParser20.getEmbeddedObject();
        boolean boolean23 = jsonParser20.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation24 = jsonParser20.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException25 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory27.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken30 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean31 = jsonToken30.isBoolean();
        byte[] byteArray32 = jsonToken30.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory29.createJsonParser(byteArray32);
        jsonParser33.close();
        java.lang.Object obj35 = jsonParser33.getEmbeddedObject();
        boolean boolean36 = jsonParser33.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation37 = jsonParser33.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException38 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation37);
        java.lang.String str39 = jsonParseException38.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException40 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24, (java.lang.Throwable) jsonParseException38);
        com.fasterxml.jackson.core.JsonLocation jsonLocation41 = jsonParseException40.getLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException42 = new com.fasterxml.jackson.core.JsonParseException("true", jsonLocation11, (java.lang.Throwable) jsonParseException40);
        com.fasterxml.jackson.core.JsonLocation jsonLocation43 = jsonParseException40.getLocation();
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonLocation24);
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertTrue("'" + jsonToken30 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken30.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonLocation37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(jsonLocation41);
        org.junit.Assert.assertNotNull(jsonLocation43);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.append('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.Writer writer2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(writer2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator5 = jsonFactory4.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory4.configure(feature6, true);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory8.createParser("");
        byte[] byteArray11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, 262144, 0);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean16 = jsonToken15.isStructEnd();
        boolean boolean17 = jsonToken15.isScalarValue();
        byte[] byteArray18 = jsonToken15.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory8.createJsonParser(byteArray18);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory0.createParser(byteArray18);
        java.lang.Object obj21 = jsonParser20.getObjectId();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = jsonParser20.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNull(outputDecorator5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        boolean boolean11 = jsonToken10.isScalarValue();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.expandCurrentSegment(9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        java.lang.String str10 = jsonParser6.nextTextValue();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getCurrentLocation();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jsonLocation11);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = jsonParser6.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        double double9 = jsonParser6.getValueAsDouble(0.0d);
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = jsonParser6.getBinaryValue(base64Variant10);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: ; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser9.getCurrentToken();
        int int12 = jsonParser9.getValueAsInt(10);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        int int8 = jsonParser6.getCurrentTokenId();
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonParser6.readBinaryValue(outputStream9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.io.OutputStream outputStream7 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory2.createGenerator(outputStream7, jsonEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = jsonFactory4.canUseSchema(formatSchema19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory2.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator12 = jsonFactory11.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature13 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory11.configure(feature13, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator16 = jsonFactory15.getInputDecorator();
        java.lang.String str17 = jsonFactory15.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory22.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean26 = feature25.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory22.enable(feature25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory15.configure(feature25, false);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory15.disable(feature30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory2.enable(feature30);
        java.io.File file33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory2.createParser(file33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNull(outputDecorator12);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature13.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNull(inputDecorator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(jsonFactory32);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.getValueAsLong(100L);
        int int15 = jsonParser6.getTextLength();
        com.fasterxml.jackson.core.Version version16 = jsonParser6.version();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(version16);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = jsonParser15.canUseSchema(formatSchema16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        java.io.Reader reader23 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory22.createJsonParser(reader23);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonParser24.configure(feature25, true);
        jsonParser27.clearCurrentToken();
        com.fasterxml.jackson.core.Version version29 = jsonParser27.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature30 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean32 = feature30.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonParser27.configure(feature30, true);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonParser15.disable(feature30);
        long long36 = jsonParser15.getValueAsLong();
        int int38 = jsonParser15.nextIntValue(2);
        com.fasterxml.jackson.core.FormatSchema formatSchema39 = jsonParser15.getSchema();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature30.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNull(formatSchema39);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        char[] charArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray4, 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.Writer writer2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(writer2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator5 = jsonFactory4.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory4.configure(feature6, true);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory8.createParser("");
        byte[] byteArray11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, 262144, 0);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean16 = jsonToken15.isStructEnd();
        boolean boolean17 = jsonToken15.isScalarValue();
        byte[] byteArray18 = jsonToken15.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory8.createJsonParser(byteArray18);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory0.createParser(byteArray18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory0.setCodec(objectCodec21);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNull(outputDecorator5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory22);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean11 = feature7.enabledIn((int) (byte) 100);
        boolean boolean13 = feature7.enabledIn((int) (byte) 0);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator11 = jsonFactory10.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory10.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser6.disable(feature12);
        java.lang.String str16 = jsonParser6.getText();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(outputDecorator11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray8 = bufferRecycler5.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray11 = new char[] { ' ' };
        bufferRecycler5.releaseCharBuffer(0, charArray11);
        textBuffer1.resetWithShared(charArray11, 4000, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = textBuffer1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 4004");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.nextLongValue(0L);
        com.fasterxml.jackson.core.JsonLocation jsonLocation15 = jsonParser6.getTokenLocation();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(jsonLocation15);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean8 = feature7.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.enable(feature7);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator10 = jsonFactory9.getOutputDecorator();
        java.io.OutputStream outputStream11 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = jsonFactory9.createGenerator(outputStream11, jsonEncoding12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(outputDecorator10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory0.createGenerator(outputStream5);
        java.io.Writer writer7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory0.createJsonGenerator(writer7);
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory0.createGenerator(writer9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory11.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean15 = jsonToken14.isBoolean();
        byte[] byteArray16 = jsonToken14.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory13.createJsonParser(byteArray16);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser17.configure(feature18, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.disable(feature18);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory0.setOutputDecorator(outputDecorator22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory24.setRootValueSeparator("hi!");
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory26.createJsonParser(reader27);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator30 = jsonFactory29.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature31 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory29.configure(feature31, true);
        java.io.Reader reader34 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory33.createJsonParser(reader34);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonParser35.configure(feature36, true);
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonParser28.disable(feature36);
        com.fasterxml.jackson.core.FormatSchema formatSchema40 = null;
        boolean boolean41 = jsonParser39.canUseSchema(formatSchema40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator43 = jsonFactory42.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature44 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory42.configure(feature44, true);
        java.io.Reader reader47 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory46.createJsonParser(reader47);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonParser48.configure(feature49, true);
        jsonParser51.clearCurrentToken();
        com.fasterxml.jackson.core.Version version53 = jsonParser51.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature54 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean56 = feature54.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser58 = jsonParser51.configure(feature54, true);
        com.fasterxml.jackson.core.JsonParser jsonParser59 = jsonParser39.disable(feature54);
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator61 = jsonFactory60.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature62 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory64 = jsonFactory60.configure(feature62, true);
        java.io.Reader reader65 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory64.createJsonParser(reader65);
        com.fasterxml.jackson.core.JsonParser.Feature feature67 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser69 = jsonParser66.configure(feature67, true);
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonParser59.disable(feature67);
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = jsonFactory23.enable(feature67);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNull(outputDecorator30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(outputDecorator43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature44.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature54.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonParser58);
        org.junit.Assert.assertNotNull(jsonParser59);
        org.junit.Assert.assertNull(outputDecorator61);
        org.junit.Assert.assertTrue("'" + feature62 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature62.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory64);
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature67.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser69);
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(jsonFactory71);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.nextValue();
        java.lang.String str13 = jsonParser6.getValueAsString();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "true" + "'", str13, "true");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.getValueAsLong(100L);
        int int15 = jsonParser6.getValueAsInt();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.Writer writer2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(writer2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator5 = jsonFactory4.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory4.configure(feature6, true);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory8.createParser("");
        byte[] byteArray11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, 262144, 0);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean16 = jsonToken15.isStructEnd();
        boolean boolean17 = jsonToken15.isScalarValue();
        byte[] byteArray18 = jsonToken15.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory8.createJsonParser(byteArray18);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory0.createParser(byteArray18);
        java.lang.String str21 = jsonParser20.nextTextValue();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNull(outputDecorator5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        com.fasterxml.jackson.core.Version version8 = jsonParser6.version();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonParser6.setFeatureMask(256);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(jsonParser10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser6.skipChildren();
        com.fasterxml.jackson.core.Version version12 = jsonParser11.version();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonParser11.enable(feature15);
        boolean boolean19 = jsonParser18.requiresCustomCodec();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        boolean boolean12 = jsonParser9.hasTextCharacters();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        double double8 = jsonParser6.getValueAsDouble();
        int int9 = jsonParser6.getValueAsInt();
        jsonParser6.close();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.fasterxml.jackson.core.JsonLocation jsonLocation1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken7 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean8 = jsonToken7.isBoolean();
        byte[] byteArray9 = jsonToken7.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory6.createJsonParser(byteArray9);
        jsonParser10.close();
        java.lang.Object obj12 = jsonParser10.getEmbeddedObject();
        boolean boolean13 = jsonParser10.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = jsonParser10.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException15 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory17.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken20 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean21 = jsonToken20.isBoolean();
        byte[] byteArray22 = jsonToken20.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory19.createJsonParser(byteArray22);
        jsonParser23.close();
        java.lang.Object obj25 = jsonParser23.getEmbeddedObject();
        boolean boolean26 = jsonParser23.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation27 = jsonParser23.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException28 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation27);
        java.lang.String str29 = jsonParseException28.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException30 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation14, (java.lang.Throwable) jsonParseException28);
        com.fasterxml.jackson.core.JsonParseException jsonParseException31 = new com.fasterxml.jackson.core.JsonParseException("false", jsonLocation1, (java.lang.Throwable) jsonParseException28);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jsonLocation27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        int int4 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.resetWithEmpty();
        int int8 = textBuffer6.size();
        java.lang.String str9 = textBuffer6.contentsAsString();
        char[] charArray10 = textBuffer6.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray10, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory2.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean6 = jsonToken5.isBoolean();
        byte[] byteArray7 = jsonToken5.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory4.createJsonParser(byteArray7);
        jsonParser8.close();
        java.lang.Object obj10 = jsonParser8.getEmbeddedObject();
        boolean boolean11 = jsonParser8.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = jsonParser8.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException13 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation12);
        java.lang.Throwable throwable14 = null;
        com.fasterxml.jackson.core.JsonParseException jsonParseException15 = new com.fasterxml.jackson.core.JsonParseException("", jsonLocation12, throwable14);
        java.lang.Throwable[] throwableArray16 = jsonParseException15.getSuppressed();
        java.lang.String str17 = jsonParseException15.getOriginalMessage();
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory2.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean6 = jsonToken5.isBoolean();
        byte[] byteArray7 = jsonToken5.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory4.createJsonParser(byteArray7);
        jsonParser8.close();
        java.lang.Object obj10 = jsonParser8.getEmbeddedObject();
        boolean boolean11 = jsonParser8.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = jsonParser8.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException13 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory15.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken18 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean19 = jsonToken18.isBoolean();
        byte[] byteArray20 = jsonToken18.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory17.createJsonParser(byteArray20);
        jsonParser21.close();
        java.lang.Object obj23 = jsonParser21.getEmbeddedObject();
        boolean boolean24 = jsonParser21.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation25 = jsonParser21.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException26 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation25);
        com.fasterxml.jackson.core.JsonLocation jsonLocation27 = jsonParseException26.getLocation();
        java.lang.String str28 = jsonParseException26.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException29 = new com.fasterxml.jackson.core.JsonParseException("", jsonLocation12, (java.lang.Throwable) jsonParseException26);
        java.lang.Class<?> wildcardClass30 = jsonParseException29.getClass();
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + jsonToken18 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken18.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonLocation25);
        org.junit.Assert.assertNotNull(jsonLocation27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        com.fasterxml.jackson.core.Version version8 = jsonParser6.version();
        java.lang.String str9 = jsonParser6.getText();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator11 = jsonFactory10.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory10.configure(feature12, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator15 = jsonFactory14.getInputDecorator();
        java.lang.String str16 = jsonFactory14.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(1);
        boolean boolean20 = jsonFactory14.isEnabled(feature17);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean23 = feature21.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory14.configure(feature21, false);
        boolean boolean26 = jsonParser6.isEnabled(feature21);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(outputDecorator11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNull(inputDecorator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        boolean boolean11 = jsonParser7.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = jsonParser7.getTokenLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException13 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation12);
        java.lang.String str14 = jsonParseException13.toString();
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = jsonParser6.nextToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        byte[] byteArray3 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory0.createJsonParser(byteArray3);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = jsonParser4.nextValue();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory2.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean6 = jsonToken5.isBoolean();
        byte[] byteArray7 = jsonToken5.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory4.createJsonParser(byteArray7);
        jsonParser8.close();
        java.lang.Object obj10 = jsonParser8.getEmbeddedObject();
        boolean boolean11 = jsonParser8.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = jsonParser8.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException13 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation12);
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = jsonParseException13.getLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException15 = new com.fasterxml.jackson.core.JsonParseException("false", jsonLocation14);
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertNotNull(jsonLocation14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory4.getOutputDecorator();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(outputDecorator7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.expandCurrentSegment((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser6.skipChildren();
        int int12 = jsonParser6.getFeatureMask();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        boolean boolean13 = jsonParser6.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            float float14 = jsonParser6.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 13]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = jsonFactory2.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature11 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory2.enable(feature11);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(inputDecorator10);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = jsonParser6.getCurrentLocation();
        double double12 = jsonParser6.getValueAsDouble((double) '4');
        java.lang.String str13 = jsonParser6.nextTextValue();
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonParser6.configure(feature14, false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = jsonParser16.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonLocation10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES + "'", feature14.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        org.junit.Assert.assertNotNull(jsonParser16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength(8000);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        double double9 = jsonParser6.getValueAsDouble();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.getLastClearedToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser6.setSchema(formatSchema11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.OutputStream outputStream2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(outputStream2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.copy();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        long long13 = jsonParser6.nextLongValue((long) 9);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9L + "'", long13 == 9L);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray3 = bufferRecycler2._byteBuffers;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = jsonParser6.getCodec();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objectCodec8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        byte[] byteArray7 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory4.createParser(byteArray7, 262144, 0);
        com.fasterxml.jackson.core.JsonToken jsonToken11 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean12 = jsonToken11.isStructEnd();
        boolean boolean13 = jsonToken11.isScalarValue();
        byte[] byteArray14 = jsonToken11.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory4.createJsonParser(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = jsonParser15.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertTrue("'" + jsonToken11 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken11.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        java.lang.Object obj11 = jsonParser6.getObjectId();
        java.io.Writer writer12 = null;
        int int13 = jsonParser6.releaseBuffered(writer12);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException12 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation11);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean18 = jsonToken17.isBoolean();
        byte[] byteArray19 = jsonToken17.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory16.createJsonParser(byteArray19);
        jsonParser20.close();
        java.lang.Object obj22 = jsonParser20.getEmbeddedObject();
        boolean boolean23 = jsonParser20.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation24 = jsonParser20.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException25 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24);
        java.lang.String str26 = jsonParseException25.getOriginalMessage();
        jsonParseException12.addSuppressed((java.lang.Throwable) jsonParseException25);
        java.lang.Throwable[] throwableArray28 = jsonParseException25.getSuppressed();
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory30.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken33 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean34 = jsonToken33.isBoolean();
        byte[] byteArray35 = jsonToken33.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory32.createJsonParser(byteArray35);
        jsonParser36.close();
        java.lang.Object obj38 = jsonParser36.getEmbeddedObject();
        boolean boolean39 = jsonParser36.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation40 = jsonParser36.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException41 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation40);
        java.lang.String str42 = jsonParseException41.toString();
        jsonParseException25.addSuppressed((java.lang.Throwable) jsonParseException41);
        java.lang.Throwable[] throwableArray44 = jsonParseException41.getSuppressed();
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonLocation24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertTrue("'" + jsonToken33 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken33.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonLocation40);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean18 = jsonToken17.isBoolean();
        byte[] byteArray19 = jsonToken17.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory16.createJsonParser(byteArray19);
        jsonParser20.close();
        java.lang.Object obj22 = jsonParser20.getEmbeddedObject();
        boolean boolean23 = jsonParser20.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation24 = jsonParser20.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException25 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory27.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken30 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean31 = jsonToken30.isBoolean();
        byte[] byteArray32 = jsonToken30.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory29.createJsonParser(byteArray32);
        jsonParser33.close();
        java.lang.Object obj35 = jsonParser33.getEmbeddedObject();
        boolean boolean36 = jsonParser33.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation37 = jsonParser33.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException38 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation37);
        java.lang.String str39 = jsonParseException38.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException40 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24, (java.lang.Throwable) jsonParseException38);
        com.fasterxml.jackson.core.JsonLocation jsonLocation41 = jsonParseException40.getLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException42 = new com.fasterxml.jackson.core.JsonParseException("true", jsonLocation11, (java.lang.Throwable) jsonParseException40);
        java.lang.String str43 = jsonParseException42.getOriginalMessage();
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonLocation24);
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertTrue("'" + jsonToken30 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken30.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonLocation37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(jsonLocation41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "true" + "'", str43, "true");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean9 = feature7.enabledIn(1);
        boolean boolean10 = jsonFactory4.isEnabled(feature7);
        java.io.Writer writer11 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = jsonFactory4.createJsonGenerator(writer11);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory17.createParser("");
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean22 = feature20.enabledIn(1);
        int int23 = feature20.getMask();
        boolean boolean25 = feature20.enabledIn(2);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonParser19.disable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory4.configure(feature20, false);
        java.io.OutputStream outputStream29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory4.createJsonGenerator(outputStream29);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 256 + "'", int23 == 256);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes5 = jsonFactory0.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory6.configure(feature8, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator11 = jsonFactory10.getInputDecorator();
        java.lang.String str12 = jsonFactory10.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory17.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean21 = feature20.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory17.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory10.configure(feature20, false);
        byte[] byteArray26 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory10.createJsonParser(byteArray26);
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory0.createJsonParser(byteArray26);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator30 = jsonFactory29.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory29.configure(feature31, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature34 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory33.enable(feature34);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory35.disable(feature36);
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory0.enable(feature36);
        com.fasterxml.jackson.core.FormatSchema formatSchema39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = jsonFactory38.canUseSchema(formatSchema39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(characterEscapes5);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNull(inputDecorator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNull(outputDecorator30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature31.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature34.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonFactory38);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean8 = feature7.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.enable(feature7);
        boolean boolean10 = jsonFactory9.canHandleBinaryNatively();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory9.createJsonParser("");
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonParser12);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        boolean boolean7 = jsonParser6.getValueAsBoolean();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        java.io.Reader reader19 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory18.createParser(reader19);
        com.fasterxml.jackson.core.Base64Variant base64Variant21 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = jsonParser20.getBinaryValue(base64Variant21);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonParser20);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        boolean boolean11 = jsonParser6.canReadTypeId();
        java.lang.String str12 = jsonParser6.nextTextValue();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory6.createParser(" ");
        boolean boolean9 = jsonFactory6.canHandleBinaryNatively();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory8.setRootValueSeparator("hi!");
        java.io.Reader reader11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory10.createJsonParser(reader11);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        java.io.Reader reader18 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory17.createJsonParser(reader18);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonParser19.configure(feature20, true);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonParser12.disable(feature20);
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = null;
        boolean boolean25 = jsonParser23.canUseSchema(formatSchema24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator27 = jsonFactory26.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature28 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory26.configure(feature28, true);
        java.io.Reader reader31 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory30.createJsonParser(reader31);
        com.fasterxml.jackson.core.JsonParser.Feature feature33 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonParser32.configure(feature33, true);
        jsonParser35.clearCurrentToken();
        com.fasterxml.jackson.core.Version version37 = jsonParser35.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean40 = feature38.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonParser35.configure(feature38, true);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = jsonParser23.disable(feature38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator45 = jsonFactory44.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature46 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory44.configure(feature46, true);
        java.io.Reader reader49 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory48.createJsonParser(reader49);
        com.fasterxml.jackson.core.JsonParser.Feature feature51 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonParser50.configure(feature51, true);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonParser43.disable(feature51);
        boolean boolean55 = jsonFactory7.isEnabled(feature51);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(outputDecorator27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature28.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature33.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(version37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertNull(outputDecorator45);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature46.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature51.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException12 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation11);
        java.lang.String str13 = jsonParseException12.toString();
        java.lang.Throwable[] throwableArray14 = jsonParseException12.getSuppressed();
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        double double9 = jsonParser6.getValueAsDouble();
        int int11 = jsonParser6.nextIntValue(0);
        int int13 = jsonParser6.getValueAsInt((int) (short) 0);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = null;
        textBuffer1.resetWithShared(charArray5, 262144, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        double double9 = jsonParser6.getValueAsDouble();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = jsonParser6.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean14 = feature12.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonParser9.configure(feature12, true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        jsonParser9.setCodec(objectCodec17);
        boolean boolean19 = jsonParser9.isClosed();
        boolean boolean20 = jsonParser9.requiresCustomCodec();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory3.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken6 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean7 = jsonToken6.isBoolean();
        byte[] byteArray8 = jsonToken6.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory5.createJsonParser(byteArray8);
        jsonParser9.close();
        java.lang.Object obj11 = jsonParser9.getEmbeddedObject();
        boolean boolean12 = jsonParser9.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = jsonParser9.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException14 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation13);
        java.lang.Throwable throwable15 = null;
        com.fasterxml.jackson.core.JsonParseException jsonParseException16 = new com.fasterxml.jackson.core.JsonParseException("", jsonLocation13, throwable15);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory18.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken21 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean22 = jsonToken21.isBoolean();
        byte[] byteArray23 = jsonToken21.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory20.createJsonParser(byteArray23);
        jsonParser24.close();
        java.lang.Object obj26 = jsonParser24.getEmbeddedObject();
        boolean boolean27 = jsonParser24.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation28 = jsonParser24.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException29 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation28);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory31.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken34 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean35 = jsonToken34.isBoolean();
        byte[] byteArray36 = jsonToken34.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory33.createJsonParser(byteArray36);
        jsonParser37.close();
        java.lang.Object obj39 = jsonParser37.getEmbeddedObject();
        boolean boolean40 = jsonParser37.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation41 = jsonParser37.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException42 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation41);
        java.lang.String str43 = jsonParseException42.getOriginalMessage();
        jsonParseException29.addSuppressed((java.lang.Throwable) jsonParseException42);
        com.fasterxml.jackson.core.JsonLocation jsonLocation46 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory48.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken51 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean52 = jsonToken51.isBoolean();
        byte[] byteArray53 = jsonToken51.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory50.createJsonParser(byteArray53);
        jsonParser54.close();
        java.lang.Object obj56 = jsonParser54.getEmbeddedObject();
        boolean boolean57 = jsonParser54.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation58 = jsonParser54.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException59 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation58);
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory63 = jsonFactory61.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken64 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean65 = jsonToken64.isBoolean();
        byte[] byteArray66 = jsonToken64.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser67 = jsonFactory63.createJsonParser(byteArray66);
        jsonParser67.close();
        java.lang.Object obj69 = jsonParser67.getEmbeddedObject();
        boolean boolean70 = jsonParser67.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation71 = jsonParser67.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException72 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation71);
        java.lang.String str73 = jsonParseException72.getOriginalMessage();
        jsonParseException59.addSuppressed((java.lang.Throwable) jsonParseException72);
        com.fasterxml.jackson.core.JsonParseException jsonParseException75 = new com.fasterxml.jackson.core.JsonParseException("}", jsonLocation46, (java.lang.Throwable) jsonParseException72);
        jsonParseException29.addSuppressed((java.lang.Throwable) jsonParseException75);
        java.lang.String str77 = jsonParseException29.toString();
        com.fasterxml.jackson.core.JsonParseException jsonParseException78 = new com.fasterxml.jackson.core.JsonParseException("null", jsonLocation13, (java.lang.Throwable) jsonParseException29);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertTrue("'" + jsonToken21 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken21.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jsonLocation28);
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertTrue("'" + jsonToken34 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken34.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jsonLocation41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertTrue("'" + jsonToken51 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken51.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jsonLocation58);
        org.junit.Assert.assertNotNull(jsonFactory63);
        org.junit.Assert.assertTrue("'" + jsonToken64 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken64.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jsonLocation71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.io.Writer writer7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory2.createJsonGenerator(writer7);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        boolean boolean12 = jsonParser6.hasTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = jsonParser6.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2fe88a09; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory6.setRootValueSeparator("hi!");
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory8.createJsonParser(reader9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator12 = jsonFactory11.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature13 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory11.configure(feature13, true);
        java.io.Reader reader16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory15.createJsonParser(reader16);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser17.configure(feature18, true);
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonParser10.disable(feature18);
        com.fasterxml.jackson.core.FormatSchema formatSchema22 = null;
        boolean boolean23 = jsonParser21.canUseSchema(formatSchema22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator25 = jsonFactory24.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature26 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory24.configure(feature26, true);
        java.io.Reader reader29 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory28.createJsonParser(reader29);
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonParser30.configure(feature31, true);
        jsonParser33.clearCurrentToken();
        com.fasterxml.jackson.core.Version version35 = jsonParser33.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean38 = feature36.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonParser33.configure(feature36, true);
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonParser21.disable(feature36);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator43 = jsonFactory42.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature44 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory42.configure(feature44, true);
        java.io.Reader reader47 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory46.createJsonParser(reader47);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonParser48.configure(feature49, true);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonParser41.disable(feature49);
        boolean boolean53 = jsonFactory4.isEnabled(feature49);
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator55 = jsonFactory54.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature56 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory54.configure(feature56, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature59 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = jsonFactory58.enable(feature59);
        boolean boolean61 = jsonFactory60.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory62 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator63 = jsonFactory62.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature64 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = jsonFactory62.configure(feature64, true);
        boolean boolean67 = feature64.enabledByDefault();
        boolean boolean68 = jsonFactory60.isEnabled(feature64);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes69 = jsonFactory60.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonFactory jsonFactory70 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator71 = jsonFactory70.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature72 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory74 = jsonFactory70.configure(feature72, true);
        boolean boolean75 = feature72.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory77 = jsonFactory60.configure(feature72, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory4.enable(feature72);
        java.io.OutputStream outputStream79 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator80 = jsonFactory78.createJsonGenerator(outputStream79);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNull(outputDecorator12);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature13.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(outputDecorator25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature26.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature31.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNull(outputDecorator43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature44.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(outputDecorator55);
        org.junit.Assert.assertTrue("'" + feature56 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature56.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature59.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(outputDecorator63);
        org.junit.Assert.assertTrue("'" + feature64 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature64.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(characterEscapes69);
        org.junit.Assert.assertNull(outputDecorator71);
        org.junit.Assert.assertTrue("'" + feature72 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature72.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jsonFactory77);
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertNotNull(jsonGenerator80);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = jsonParser15.canUseSchema(formatSchema16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        java.io.Reader reader23 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory22.createJsonParser(reader23);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonParser24.configure(feature25, true);
        jsonParser27.clearCurrentToken();
        com.fasterxml.jackson.core.Version version29 = jsonParser27.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature30 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean32 = feature30.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonParser27.configure(feature30, true);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonParser15.disable(feature30);
        com.fasterxml.jackson.core.FormatSchema formatSchema36 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser15.setSchema(formatSchema36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature30.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonParser35);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        boolean boolean9 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = jsonParser6.getSchema();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser6.skipChildren();
        boolean boolean12 = jsonParser11.isExpectedStartArrayToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) ' ');
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        byte[] byteArray3 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory0.createJsonParser(byteArray3);
        com.fasterxml.jackson.core.Base64Variant base64Variant5 = null;
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonParser4.readBinaryValue(base64Variant5, outputStream6);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@32febf6c; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jsonParser4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        int int14 = jsonParser6.nextIntValue((int) (byte) -1);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        byte[] byteArray20 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory4.createJsonParser(byteArray20);
        com.fasterxml.jackson.core.FormatSchema formatSchema22 = jsonParser21.getSchema();
        int int24 = jsonParser21.getValueAsInt((int) ' ');
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNull(formatSchema22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        boolean boolean11 = jsonParser6.canReadTypeId();
        jsonParser6.overrideCurrentName("");
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException12 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation11);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean18 = jsonToken17.isBoolean();
        byte[] byteArray19 = jsonToken17.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory16.createJsonParser(byteArray19);
        jsonParser20.close();
        java.lang.Object obj22 = jsonParser20.getEmbeddedObject();
        boolean boolean23 = jsonParser20.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation24 = jsonParser20.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException25 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24);
        java.lang.String str26 = jsonParseException25.getOriginalMessage();
        jsonParseException12.addSuppressed((java.lang.Throwable) jsonParseException25);
        com.fasterxml.jackson.core.JsonLocation jsonLocation29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory31.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken34 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean35 = jsonToken34.isBoolean();
        byte[] byteArray36 = jsonToken34.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory33.createJsonParser(byteArray36);
        jsonParser37.close();
        java.lang.Object obj39 = jsonParser37.getEmbeddedObject();
        boolean boolean40 = jsonParser37.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation41 = jsonParser37.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException42 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation41);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory44.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken47 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean48 = jsonToken47.isBoolean();
        byte[] byteArray49 = jsonToken47.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory46.createJsonParser(byteArray49);
        jsonParser50.close();
        java.lang.Object obj52 = jsonParser50.getEmbeddedObject();
        boolean boolean53 = jsonParser50.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation54 = jsonParser50.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException55 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation54);
        java.lang.String str56 = jsonParseException55.getOriginalMessage();
        jsonParseException42.addSuppressed((java.lang.Throwable) jsonParseException55);
        com.fasterxml.jackson.core.JsonParseException jsonParseException58 = new com.fasterxml.jackson.core.JsonParseException("}", jsonLocation29, (java.lang.Throwable) jsonParseException55);
        jsonParseException12.addSuppressed((java.lang.Throwable) jsonParseException58);
        java.lang.String str60 = jsonParseException58.getOriginalMessage();
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonLocation24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertTrue("'" + jsonToken34 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken34.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jsonLocation41);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertTrue("'" + jsonToken47 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken47.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jsonLocation54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "}" + "'", str60, "}");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory2.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator12 = jsonFactory11.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory11.configure(feature13, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory15.enable(feature16);
        boolean boolean18 = jsonFactory17.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator20 = jsonFactory19.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory19.configure(feature21, true);
        boolean boolean24 = feature21.enabledByDefault();
        boolean boolean25 = jsonFactory17.isEnabled(feature21);
        int int26 = feature21.getMask();
        boolean boolean27 = jsonFactory10.isEnabled(feature21);
        java.io.OutputStream outputStream28 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory10.createGenerator(outputStream28, jsonEncoding29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNull(outputDecorator12);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature13.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(outputDecorator20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser("");
        long long11 = jsonParser9.getValueAsLong(0L);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        textBuffer1.append(' ');
        int int5 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = new com.fasterxml.jackson.core.util.BufferRecycler();
        char[] charArray7 = bufferRecycler5.allocCharBuffer(1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray7, 4000, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = jsonFactory2.getInputDecorator();
        boolean boolean11 = jsonFactory2.canUseCharArrays();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(inputDecorator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory4.disable(feature19);
        java.io.File file21 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory4.createGenerator(file21, jsonEncoding22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory20);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray8 = bufferRecycler5.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray11 = new char[] { ' ' };
        bufferRecycler5.releaseCharBuffer(0, charArray11);
        textBuffer1.resetWithShared(charArray11, 4000, 4);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("}", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.getValueAsLong(100L);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        jsonParser6.setCodec(objectCodec15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean17 = jsonParser6.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.contentsAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory2.setCodec(objectCodec20);
        java.io.File file22 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = jsonFactory21.createJsonGenerator(file22, jsonEncoding23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonFactory21);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.nextValue();
        java.lang.String str13 = jsonParser6.getText();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "true" + "'", str13, "true");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) 3);
        com.fasterxml.jackson.core.Version version11 = jsonParser6.version();
        // The following exception was thrown during execution in test generation
        try {
            float float12 = jsonParser6.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@2fe88a09; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(version11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("true");
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory0.createGenerator(outputStream5);
        java.io.Writer writer7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory0.createJsonGenerator(writer7);
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory0.createGenerator(writer9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory11.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean15 = jsonToken14.isBoolean();
        byte[] byteArray16 = jsonToken14.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory13.createJsonParser(byteArray16);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser17.configure(feature18, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.disable(feature18);
        com.fasterxml.jackson.core.JsonParser.Feature feature22 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean24 = feature22.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory0.enable(feature22);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature22.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonFactory25);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) ' ');
        int int5 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("}", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength((int) (short) 1);
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray8 = bufferRecycler5.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray11 = new char[] { ' ' };
        bufferRecycler5.releaseCharBuffer(0, charArray11);
        char[] charArray15 = bufferRecycler5.allocCharBuffer(0, (int) ' ');
        textBuffer1.resetWithCopy(charArray15, 0, 1);
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertNotNull(charArray15);
    }
}


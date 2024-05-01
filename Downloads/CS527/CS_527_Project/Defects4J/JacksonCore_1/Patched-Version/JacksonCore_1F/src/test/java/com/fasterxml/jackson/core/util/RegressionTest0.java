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
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"hi!\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = jsonParser3.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"?\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = jsonParser3.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = jsonParser3.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        int int7 = jsonParser3.nextIntValue(0);
        java.lang.String str8 = jsonParser3.getValueAsString();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("JSON");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"JSON\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        int int7 = jsonParser3.nextIntValue(0);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonParser3.readBinaryValue(outputStream8);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray2, 2000, 2000);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray2, 64, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        char[] charArray0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.SPACES;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray0, 2000, (-985736483));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -985736483");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        long long2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong("", (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = jsonParser3.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory1.createJsonParser(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        boolean boolean7 = jsonParser3.isExpectedStartArrayToken();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        boolean boolean6 = jsonParser3.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = jsonParser3.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        long long32 = jsonParser30.getValueAsLong((long) 64);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 64L + "'", long32 == 64L);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        // The following exception was thrown during execution in test generation
        try {
            short short6 = jsonParser3.getShortValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = textBuffer16.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.core.JsonToken jsonToken0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        char[] charArray1 = jsonToken0.asCharArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal4 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray1, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 149");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonToken0 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken0.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "{");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "{");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[{]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\n", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType31 = jsonParser30.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@67b21b6b; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        java.io.File file31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory1.createParser(file31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonParser3.setFeatureMask((int) (byte) 0);
        com.fasterxml.jackson.core.FormatSchema formatSchema7 = jsonParser6.getSchema();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(formatSchema7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter18 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString19 = defaultPrettyPrinter18._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        char[] charArray22 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer21.resetWithShared(charArray22, 2000, 2000);
        int int27 = serializableString19.appendUnquoted(charArray22, 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer16.resetWithCopy(charArray22, (-985736483), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(serializableString19);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jsonFactory1.isEnabled(feature4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithEmpty();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory(objectCodec17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean21 = feature19.enabledIn(3);
        boolean boolean22 = jsonFactory18.isEnabled(feature19);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory24.disable(feature29);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory18.disable(feature29);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = jsonFactory31._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType33 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER;
        char[] charArray35 = bufferRecycler32.allocCharBuffer(charBufferType33, (int) (byte) 0);
        char[] charArray36 = bufferRecycler15.allocCharBuffer(charBufferType33);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(bufferRecycler32);
        org.junit.Assert.assertTrue("'" + charBufferType33 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER + "'", charBufferType33.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER));
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray2, 2000, 2000);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\n", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory(objectCodec1);
        com.fasterxml.jackson.core.JsonFactory.Feature feature3 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean5 = feature3.enabledIn(3);
        boolean boolean6 = jsonFactory2.isEnabled(feature3);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory2.disable(feature7);
        java.io.OutputStream outputStream9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory2.createGenerator(outputStream9);
        com.fasterxml.jackson.core.io.IOContext iOContext11 = null;
        byte[] byteArray12 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper15 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext11, byteArray12, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory2.createJsonParser(byteArray12, 1, (int) (short) 100);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper21 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext0, byteArray12, 1, (int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer24 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int25 = bytesToNameCanonicalizer24.maxCollisionLength();
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser29 = byteSourceJsonBootstrapper21.constructParser((int) (byte) -1, objectCodec23, bytesToNameCanonicalizer24, charsToNameCanonicalizer26, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature3.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = jsonParser3.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonParser3.setFeatureMask((int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonParser6.enable(feature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("\n", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        // The following exception was thrown during execution in test generation
        try {
            short short4 = jsonParser3.getShortValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonParser3.setFeatureMask((int) (byte) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        jsonParser6.setCodec(objectCodec7);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory1.setRootValueSeparator("JSON");
        java.net.URL uRL33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory32.createJsonParser(uRL33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonFactory32);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray2, 2000, 2000);
        textBuffer1.setCurrentLength(79);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        boolean boolean4 = defaultPrettyPrinter3._spacesInObjectEntries;
        defaultPrettyPrinter3.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString9 = defaultPrettyPrinter8._rootSeparator;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter10 = defaultPrettyPrinter8._objectIndenter;
        defaultPrettyPrinter3.indentArraysWith(indenter10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory(objectCodec18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean22 = feature20.enabledIn(3);
        boolean boolean23 = jsonFactory19.isEnabled(feature20);
        com.fasterxml.jackson.core.JsonParser.Feature feature24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory19.disable(feature24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory13.disable(feature24);
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = jsonFactory13.createGenerator(outputStream27);
        indenter10.writeIndentation(jsonGenerator28, (int) ' ');
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonGenerator28.setCodec(objectCodec31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory(objectCodec33);
        com.fasterxml.jackson.core.JsonFactory.Feature feature35 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean37 = feature35.enabledIn(3);
        boolean boolean38 = jsonFactory34.isEnabled(feature35);
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory34.disable(feature39);
        java.io.OutputStream outputStream41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonFactory34.createGenerator(outputStream41);
        com.fasterxml.jackson.core.io.IOContext iOContext43 = null;
        byte[] byteArray44 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper47 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext43, byteArray44, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory34.createJsonParser(byteArray44, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter52 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString53 = defaultPrettyPrinter52._rootSeparator;
        byte[] byteArray60 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int62 = serializableString53.appendQuotedUTF8(byteArray60, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory34.createJsonParser(byteArray60);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator28.writeRawUTF8String(byteArray60, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableString9);
        org.junit.Assert.assertNotNull(indenter10);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature35.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(serializableString53);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(jsonParser63);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.sym.Name name5 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.getEmptyName();
        int[] intArray12 = new int[] { (-985736483), (short) 1, 0, (short) -1, 10, '4' };
        boolean boolean14 = name5.equals(intArray12, (-1));
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding15 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        boolean boolean16 = name5.equals((java.lang.Object) jsonEncoding15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = jsonFactory1.createGenerator(outputStream4, jsonEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-985736483, 1, 0, -1, 10, 52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + jsonEncoding15 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding15.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        int int7 = jsonParser3.nextIntValue(0);
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = jsonParser3.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParser.Feature feature9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean10 = jsonParser3.isEnabled(feature9);
        com.fasterxml.jackson.core.JsonToken jsonToken11 = jsonParser3.getCurrentToken();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jsonLocation8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature9.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        java.io.Reader reader8 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (int) (byte) -1, reader8, objectCodec9, charsToNameCanonicalizer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = jsonParser3.getSchema();
        java.lang.String str6 = jsonParser3.nextTextValue();
        long long7 = jsonParser3.getValueAsLong();
        java.io.Writer writer8 = null;
        int int9 = jsonParser3.releaseBuffered(writer8);
        java.lang.String str10 = jsonParser3.getValueAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = jsonParser3.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = jsonParser3.getLastClearedToken();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jsonToken6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory(objectCodec1);
        com.fasterxml.jackson.core.JsonFactory.Feature feature3 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean5 = feature3.enabledIn(3);
        boolean boolean6 = jsonFactory2.isEnabled(feature3);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory2.disable(feature7);
        java.io.OutputStream outputStream9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory2.createGenerator(outputStream9);
        com.fasterxml.jackson.core.io.IOContext iOContext11 = null;
        byte[] byteArray12 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper15 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext11, byteArray12, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory2.createJsonParser(byteArray12, 1, (int) (short) 100);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper21 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext0, byteArray12, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader22 = byteSourceJsonBootstrapper21.constructReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature3.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        com.fasterxml.jackson.core.JsonLocation jsonLocation31 = jsonParser30.getTokenLocation();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonLocation31);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType16 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER;
        char[] charArray18 = bufferRecycler15.allocCharBuffer(charBufferType16, (int) (byte) 0);
        int int21 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray18, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertTrue("'" + charBufferType16 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER + "'", charBufferType16.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1038366032) + "'", int21 == (-1038366032));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeObjectEntrySeparator(jsonGenerator20);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter23 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString24 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter25 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter23, serializableString24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory(objectCodec26);
        com.fasterxml.jackson.core.JsonFactory.Feature feature28 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean30 = feature28.enabledIn(3);
        boolean boolean31 = jsonFactory27.isEnabled(feature28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory(objectCodec32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean36 = feature34.enabledIn(3);
        boolean boolean37 = jsonFactory33.isEnabled(feature34);
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory33.disable(feature38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory27.disable(feature38);
        java.io.OutputStream outputStream41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonFactory27.createGenerator(outputStream41);
        defaultPrettyPrinter25.writeStartArray(jsonGenerator42);
        defaultPrettyPrinter3.writeStartObject(jsonGenerator42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        boolean boolean50 = jsonFactory46.isEnabled(feature47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        com.fasterxml.jackson.core.JsonFactory.Feature feature53 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean55 = feature53.enabledIn(3);
        boolean boolean56 = jsonFactory52.isEnabled(feature53);
        com.fasterxml.jackson.core.JsonParser.Feature feature57 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory52.disable(feature57);
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory46.disable(feature57);
        java.io.OutputStream outputStream60 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator61 = jsonFactory46.createGenerator(outputStream60);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature62 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean63 = feature62.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator64 = jsonGenerator61.enable(feature62);
        defaultPrettyPrinter3.writeEndArray(jsonGenerator64, (int) (byte) 100);
        boolean boolean67 = jsonGenerator64.isClosed();
        com.fasterxml.jackson.core.Base64Variant base64Variant68 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext69 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = new com.fasterxml.jackson.core.JsonFactory(objectCodec70);
        com.fasterxml.jackson.core.JsonFactory.Feature feature72 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean74 = feature72.enabledIn(3);
        boolean boolean75 = jsonFactory71.isEnabled(feature72);
        com.fasterxml.jackson.core.JsonParser.Feature feature76 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory77 = jsonFactory71.disable(feature76);
        java.io.OutputStream outputStream78 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator79 = jsonFactory71.createGenerator(outputStream78);
        com.fasterxml.jackson.core.io.IOContext iOContext80 = null;
        byte[] byteArray81 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper84 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext80, byteArray81, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser87 = jsonFactory71.createJsonParser(byteArray81, 1, (int) (short) 100);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper90 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext69, byteArray81, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator64.writeBinary(base64Variant68, byteArray81, (-985736483), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature53 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature53.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(jsonGenerator61);
        org.junit.Assert.assertTrue("'" + feature62 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature62.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jsonGenerator64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + feature72 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature72.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature76.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory77);
        org.junit.Assert.assertNotNull(jsonGenerator79);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser87);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = jsonParser3.getCodec();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectCodec7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray2, 2000, 2000);
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        int int6 = jsonParser3.getValueAsInt(0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = jsonParser3.getCodec();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objectCodec7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        boolean boolean4 = defaultPrettyPrinter3._spacesInObjectEntries;
        int int5 = defaultPrettyPrinter3._nesting;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = defaultPrettyPrinter3.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString9 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter10 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter8, serializableString9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory(objectCodec11);
        com.fasterxml.jackson.core.JsonFactory.Feature feature13 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean15 = feature13.enabledIn(3);
        boolean boolean16 = jsonFactory12.isEnabled(feature13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory(objectCodec17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean21 = feature19.enabledIn(3);
        boolean boolean22 = jsonFactory18.isEnabled(feature19);
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory18.disable(feature23);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory12.disable(feature23);
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory12.createGenerator(outputStream26);
        defaultPrettyPrinter10.writeObjectEntrySeparator(jsonGenerator27);
        defaultPrettyPrinter3.writeStartObject(jsonGenerator27);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter31 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString32 = defaultPrettyPrinter31._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        char[] charArray35 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer34.resetWithShared(charArray35, 2000, 2000);
        int int40 = serializableString32.appendUnquoted(charArray35, 0);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator27.writeRaw(charArray35, 2000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter6);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature13.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNotNull(serializableString32);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory1.createParser("\n");
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(jsonParser11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = defaultPrettyPrinter1._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        char[] charArray5 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer4.resetWithShared(charArray5, 2000, 2000);
        int int10 = serializableString2.appendUnquoted(charArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray5, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableString2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        java.lang.Object obj4 = jsonParser3.getEmbeddedObject();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonParser3.readBinaryValue(outputStream5);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        textBuffer1.setCurrentLength(100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory(objectCodec15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(3);
        boolean boolean20 = jsonFactory16.isEnabled(feature17);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory16.disable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory14.configure(feature21, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory14.setInputDecorator(inputDecorator25);
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory26.createParser(reader27);
        boolean boolean29 = jsonParser28.hasTextCharacters();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType16 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER;
        char[] charArray18 = bufferRecycler15.allocCharBuffer(charBufferType16, (int) (byte) 0);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertTrue("'" + charBufferType16 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER + "'", charBufferType16.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        java.lang.String str31 = jsonParser30.getValueAsString();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray2, 2000, 2000);
        textBuffer1.resetWithEmpty();
        char[] charArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray7, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext9 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler6, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream10 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory(objectCodec11);
        com.fasterxml.jackson.core.JsonFactory.Feature feature13 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean15 = feature13.enabledIn(3);
        boolean boolean16 = jsonFactory12.isEnabled(feature13);
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory12.disable(feature17);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory12.createGenerator(outputStream19);
        com.fasterxml.jackson.core.io.IOContext iOContext21 = null;
        byte[] byteArray22 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper25 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext21, byteArray22, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory12.createJsonParser(byteArray22, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = new com.fasterxml.jackson.core.JsonFactory(objectCodec29);
        com.fasterxml.jackson.core.JsonFactory.Feature feature31 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean33 = feature31.enabledIn(3);
        boolean boolean34 = jsonFactory30.isEnabled(feature31);
        com.fasterxml.jackson.core.JsonParser.Feature feature35 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory30.disable(feature35);
        java.io.OutputStream outputStream37 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = jsonFactory30.createGenerator(outputStream37);
        com.fasterxml.jackson.core.io.IOContext iOContext39 = null;
        byte[] byteArray40 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper43 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext39, byteArray40, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser46 = jsonFactory30.createJsonParser(byteArray40, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter48 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString49 = defaultPrettyPrinter48._rootSeparator;
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int58 = serializableString49.appendQuotedUTF8(byteArray56, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser59 = jsonFactory30.createJsonParser(byteArray56);
        com.fasterxml.jackson.core.JsonParser jsonParser62 = jsonFactory12.createJsonParser(byteArray56, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream65 = new com.fasterxml.jackson.core.io.MergedStream(iOContext9, inputStream10, byteArray56, 10, 2000);
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseReadIOBuffer(byteArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature13.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature35.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser46);
        org.junit.Assert.assertNotNull(serializableString49);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(jsonParser59);
        org.junit.Assert.assertNotNull(jsonParser62);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeObjectEntrySeparator(jsonGenerator20);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter23 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString24 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter25 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter23, serializableString24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory(objectCodec26);
        com.fasterxml.jackson.core.JsonFactory.Feature feature28 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean30 = feature28.enabledIn(3);
        boolean boolean31 = jsonFactory27.isEnabled(feature28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory(objectCodec32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean36 = feature34.enabledIn(3);
        boolean boolean37 = jsonFactory33.isEnabled(feature34);
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory33.disable(feature38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory27.disable(feature38);
        java.io.OutputStream outputStream41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonFactory27.createGenerator(outputStream41);
        defaultPrettyPrinter25.writeStartArray(jsonGenerator42);
        defaultPrettyPrinter3.writeStartObject(jsonGenerator42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        boolean boolean50 = jsonFactory46.isEnabled(feature47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        com.fasterxml.jackson.core.JsonFactory.Feature feature53 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean55 = feature53.enabledIn(3);
        boolean boolean56 = jsonFactory52.isEnabled(feature53);
        com.fasterxml.jackson.core.JsonParser.Feature feature57 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory52.disable(feature57);
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory46.disable(feature57);
        java.io.OutputStream outputStream60 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator61 = jsonFactory46.createGenerator(outputStream60);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature62 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean63 = feature62.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator64 = jsonGenerator61.enable(feature62);
        defaultPrettyPrinter3.writeEndArray(jsonGenerator64, (int) (byte) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        jsonGenerator64.writeString(serializableString69);
        char[] charArray71 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        int int73 = serializableString69.appendUnquoted(charArray71, (int) 'a');
        char[] charArray74 = serializableString69.asQuotedChars();
        char[] charArray75 = serializableString69.asQuotedChars();
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature53 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature53.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(jsonGenerator61);
        org.junit.Assert.assertTrue("'" + feature62 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature62.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jsonGenerator64);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[h, i, !]");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[h, i, !]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory(objectCodec7);
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean11 = feature9.enabledIn(3);
        boolean boolean12 = jsonFactory8.isEnabled(feature9);
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory8.disable(feature13);
        java.io.OutputStream outputStream15 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = jsonFactory8.createGenerator(outputStream15);
        com.fasterxml.jackson.core.io.IOContext iOContext17 = null;
        byte[] byteArray18 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper21 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext17, byteArray18, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory8.createJsonParser(byteArray18, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory(objectCodec25);
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean29 = feature27.enabledIn(3);
        boolean boolean30 = jsonFactory26.isEnabled(feature27);
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory26.disable(feature31);
        java.io.OutputStream outputStream33 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = jsonFactory26.createGenerator(outputStream33);
        com.fasterxml.jackson.core.io.IOContext iOContext35 = null;
        byte[] byteArray36 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper39 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext35, byteArray36, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory26.createJsonParser(byteArray36, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter44 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString45 = defaultPrettyPrinter44._rootSeparator;
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int54 = serializableString45.appendQuotedUTF8(byteArray52, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser55 = jsonFactory26.createJsonParser(byteArray52);
        com.fasterxml.jackson.core.JsonParser jsonParser58 = jsonFactory8.createJsonParser(byteArray52, 64, 1);
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseReadIOBuffer(byteArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature13.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(jsonGenerator16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertNotNull(serializableString45);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(jsonParser55);
        org.junit.Assert.assertNotNull(jsonParser58);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory(objectCodec18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean22 = feature20.enabledIn(3);
        boolean boolean23 = jsonFactory19.isEnabled(feature20);
        com.fasterxml.jackson.core.JsonParser.Feature feature24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory19.disable(feature24);
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory19.createGenerator(outputStream26);
        com.fasterxml.jackson.core.io.IOContext iOContext28 = null;
        byte[] byteArray29 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper32 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext28, byteArray29, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory19.createJsonParser(byteArray29, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter37 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString38 = defaultPrettyPrinter37._rootSeparator;
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int47 = serializableString38.appendQuotedUTF8(byteArray45, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory19.createJsonParser(byteArray45);
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory1.createJsonParser(byteArray45, 64, 1);
        boolean boolean52 = jsonParser51.getValueAsBoolean();
        jsonParser51.overrideCurrentName("");
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(serializableString38);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        boolean boolean4 = defaultPrettyPrinter3._spacesInObjectEntries;
        defaultPrettyPrinter3.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString9 = defaultPrettyPrinter8._rootSeparator;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter10 = defaultPrettyPrinter8._objectIndenter;
        defaultPrettyPrinter3.indentArraysWith(indenter10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory(objectCodec18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean22 = feature20.enabledIn(3);
        boolean boolean23 = jsonFactory19.isEnabled(feature20);
        com.fasterxml.jackson.core.JsonParser.Feature feature24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory19.disable(feature24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory13.disable(feature24);
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = jsonFactory13.createGenerator(outputStream27);
        indenter10.writeIndentation(jsonGenerator28, (int) ' ');
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonGenerator28.setCodec(objectCodec31);
        int int33 = jsonGenerator28.getFeatureMask();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = jsonGenerator28.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        com.fasterxml.jackson.core.JsonFactory.Feature feature37 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean39 = feature37.enabledIn(3);
        boolean boolean40 = jsonFactory36.isEnabled(feature37);
        com.fasterxml.jackson.core.JsonParser.Feature feature41 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory36.disable(feature41);
        java.io.OutputStream outputStream43 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = jsonFactory36.createGenerator(outputStream43);
        com.fasterxml.jackson.core.io.IOContext iOContext45 = null;
        byte[] byteArray46 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper49 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext45, byteArray46, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonFactory36.createJsonParser(byteArray46, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = new com.fasterxml.jackson.core.JsonFactory(objectCodec53);
        com.fasterxml.jackson.core.JsonFactory.Feature feature55 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean57 = feature55.enabledIn(3);
        boolean boolean58 = jsonFactory54.isEnabled(feature55);
        com.fasterxml.jackson.core.JsonParser.Feature feature59 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = jsonFactory54.disable(feature59);
        java.io.OutputStream outputStream61 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator62 = jsonFactory54.createGenerator(outputStream61);
        com.fasterxml.jackson.core.io.IOContext iOContext63 = null;
        byte[] byteArray64 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper67 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext63, byteArray64, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonFactory54.createJsonParser(byteArray64, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter72 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString73 = defaultPrettyPrinter72._rootSeparator;
        byte[] byteArray80 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int82 = serializableString73.appendQuotedUTF8(byteArray80, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser83 = jsonFactory54.createJsonParser(byteArray80);
        com.fasterxml.jackson.core.JsonParser jsonParser86 = jsonFactory36.createJsonParser(byteArray80, 64, 1);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator28.writeUTF8String(byteArray80, (-985719549), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableString9);
        org.junit.Assert.assertNotNull(indenter10);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 79 + "'", int33 == 79);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertNotNull(jsonGenerator44);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertNotNull(jsonGenerator62);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(serializableString73);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(jsonParser83);
        org.junit.Assert.assertNotNull(jsonParser86);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        java.lang.String str7 = jsonParser3.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = jsonParser3.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeStartArray(jsonGenerator20);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter22 = defaultPrettyPrinter3._arrayIndenter;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter23 = defaultPrettyPrinter3._objectIndenter;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = new com.fasterxml.jackson.core.JsonFactory(objectCodec24);
        java.io.Reader reader26 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory25.createParser(reader26);
        com.fasterxml.jackson.core.Version version28 = jsonFactory25.version();
        java.io.OutputStream outputStream29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory25.createGenerator(outputStream29);
        defaultPrettyPrinter3.writeEndArray(jsonGenerator30, (-985734347));
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(indenter22);
        org.junit.Assert.assertNotNull(indenter23);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeStartArray(jsonGenerator20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory(objectCodec22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean26 = feature24.enabledIn(3);
        boolean boolean27 = jsonFactory23.isEnabled(feature24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory(objectCodec28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean32 = feature30.enabledIn(3);
        boolean boolean33 = jsonFactory29.isEnabled(feature30);
        com.fasterxml.jackson.core.JsonParser.Feature feature34 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory29.disable(feature34);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory23.disable(feature34);
        java.io.OutputStream outputStream37 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = jsonFactory23.createGenerator(outputStream37);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature39 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean40 = feature39.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = jsonGenerator38.enable(feature39);
        defaultPrettyPrinter3.beforeObjectEntries(jsonGenerator41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory(objectCodec43);
        com.fasterxml.jackson.core.JsonFactory.Feature feature45 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean47 = feature45.enabledIn(3);
        boolean boolean48 = jsonFactory44.isEnabled(feature45);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory44.disable(feature49);
        java.io.OutputStream outputStream51 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = jsonFactory44.createGenerator(outputStream51);
        com.fasterxml.jackson.core.io.IOContext iOContext53 = null;
        byte[] byteArray54 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper57 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext53, byteArray54, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory44.createJsonParser(byteArray54, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory62 = new com.fasterxml.jackson.core.JsonFactory(objectCodec61);
        com.fasterxml.jackson.core.JsonFactory.Feature feature63 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean65 = feature63.enabledIn(3);
        boolean boolean66 = jsonFactory62.isEnabled(feature63);
        com.fasterxml.jackson.core.JsonParser.Feature feature67 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = jsonFactory62.disable(feature67);
        java.io.OutputStream outputStream69 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator70 = jsonFactory62.createGenerator(outputStream69);
        com.fasterxml.jackson.core.io.IOContext iOContext71 = null;
        byte[] byteArray72 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper75 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext71, byteArray72, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser78 = jsonFactory62.createJsonParser(byteArray72, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter80 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString81 = defaultPrettyPrinter80._rootSeparator;
        byte[] byteArray88 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int90 = serializableString81.appendQuotedUTF8(byteArray88, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonFactory62.createJsonParser(byteArray88);
        com.fasterxml.jackson.core.JsonParser jsonParser94 = jsonFactory44.createJsonParser(byteArray88, 64, 1);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator41.copyCurrentEvent(jsonParser94);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature39.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jsonGenerator41);
        org.junit.Assert.assertTrue("'" + feature45 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature45.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertNotNull(jsonGenerator52);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertTrue("'" + feature63 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature63.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature67.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory68);
        org.junit.Assert.assertNotNull(jsonGenerator70);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser78);
        org.junit.Assert.assertNotNull(serializableString81);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(jsonParser91);
        org.junit.Assert.assertNotNull(jsonParser94);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory(objectCodec1);
        com.fasterxml.jackson.core.JsonFactory.Feature feature3 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean5 = feature3.enabledIn(3);
        boolean boolean6 = jsonFactory2.isEnabled(feature3);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory2.disable(feature7);
        java.io.OutputStream outputStream9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory2.createGenerator(outputStream9);
        com.fasterxml.jackson.core.io.IOContext iOContext11 = null;
        byte[] byteArray12 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper15 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext11, byteArray12, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory2.createJsonParser(byteArray12, 1, (int) (short) 100);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper21 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext0, byteArray12, 1, (int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer24 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser28 = byteSourceJsonBootstrapper21.constructParser((-985719549), objectCodec23, bytesToNameCanonicalizer24, charsToNameCanonicalizer25, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature3.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer24);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory(objectCodec15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(3);
        boolean boolean20 = jsonFactory16.isEnabled(feature17);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory16.disable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory14.configure(feature21, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory14.setInputDecorator(inputDecorator25);
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory26.createParser(reader27);
        // The following exception was thrown during execution in test generation
        try {
            short short29 = jsonParser28.getShortValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        java.lang.Object obj4 = jsonParser3.getEmbeddedObject();
        int int5 = jsonParser3.getTextLength();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        textBuffer1.append(' ');
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory(objectCodec18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean22 = feature20.enabledIn(3);
        boolean boolean23 = jsonFactory19.isEnabled(feature20);
        com.fasterxml.jackson.core.JsonParser.Feature feature24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory19.disable(feature24);
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory19.createGenerator(outputStream26);
        com.fasterxml.jackson.core.io.IOContext iOContext28 = null;
        byte[] byteArray29 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper32 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext28, byteArray29, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory19.createJsonParser(byteArray29, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter37 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString38 = defaultPrettyPrinter37._rootSeparator;
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int47 = serializableString38.appendQuotedUTF8(byteArray45, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory19.createJsonParser(byteArray45);
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory1.createJsonParser(byteArray45, 64, 1);
        boolean boolean52 = jsonParser51.getValueAsBoolean();
        com.fasterxml.jackson.core.FormatSchema formatSchema53 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser51.setSchema(formatSchema53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(serializableString38);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory13.createGenerator(outputStream20);
        com.fasterxml.jackson.core.io.IOContext iOContext22 = null;
        byte[] byteArray23 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext22, byteArray23, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory13.createJsonParser(byteArray23, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.disable(feature36);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory31.createGenerator(outputStream38);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        byte[] byteArray41 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper44 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext40, byteArray41, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory31.createJsonParser(byteArray41, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int59 = serializableString50.appendQuotedUTF8(byteArray57, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory31.createJsonParser(byteArray57);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory13.createJsonParser(byteArray57, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream66 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray57, 10, 2000);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.io.MergedStream mergedStream81 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream11, byteArray76, (-1038366032), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            mergedStream81.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        boolean boolean7 = jsonParser3.canReadTypeId();
        int int8 = jsonParser3.getValueAsInt();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        boolean boolean7 = jsonParser3.canReadTypeId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = new com.fasterxml.jackson.core.JsonFactory(objectCodec8);
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean12 = feature10.enabledIn(3);
        boolean boolean13 = jsonFactory9.isEnabled(feature10);
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory9.disable(feature14);
        int int16 = feature14.getMask();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonParser3.enable(feature14);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(jsonParser17);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory13.createGenerator(outputStream20);
        com.fasterxml.jackson.core.io.IOContext iOContext22 = null;
        byte[] byteArray23 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext22, byteArray23, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory13.createJsonParser(byteArray23, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.disable(feature36);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory31.createGenerator(outputStream38);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        byte[] byteArray41 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper44 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext40, byteArray41, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory31.createJsonParser(byteArray41, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int59 = serializableString50.appendQuotedUTF8(byteArray57, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory31.createJsonParser(byteArray57);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory13.createJsonParser(byteArray57, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream66 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray57, 10, 2000);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.io.MergedStream mergedStream81 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream11, byteArray76, (-1038366032), (int) (short) -1);
        boolean boolean82 = iOContext3.isResourceManaged();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = jsonParser3.getTokenLocation();
        double double7 = jsonParser3.getValueAsDouble((double) (byte) 0);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonLocation5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        int int7 = jsonParser3.nextIntValue(0);
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = jsonParser3.getCurrentLocation();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser3.setSchema(formatSchema9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jsonLocation8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.SPACES;
        textBuffer16.append(charArray17, (int) (byte) 0, (int) (short) 1);
        char[] charArray21 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer16.append(charArray21, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonParser3.setFeatureMask((int) (byte) 0);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = jsonParser3.nextValue();
        java.lang.String str8 = jsonParser3.nextTextValue();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext8 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler5, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream9 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer10 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext8, outputStream9);
        uTF8Writer10.flush();
        java.io.Writer writer13 = uTF8Writer10.append('a');
        int int14 = jsonParser3.releaseBuffered(writer13);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(writer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString9 = defaultPrettyPrinter8._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray12, 2000, 2000);
        int int17 = serializableString9.appendUnquoted(charArray12, 0);
        boolean boolean18 = jsonParser3.nextFieldName(serializableString9);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = jsonParser3.getParsingContext();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(serializableString9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonParser3.setFeatureMask((int) (byte) 0);
        int int7 = jsonParser3.getTextLength();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        boolean boolean31 = jsonParser30.canReadObjectId();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType32 = jsonParser30.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2baa9a5e; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        java.lang.String str15 = jsonFactory1.getFormatName();
        java.io.InputStream inputStream16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createParser(inputStream16);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = jsonParser17.readBinaryValue(outputStream18);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSON" + "'", str15, "JSON");
        org.junit.Assert.assertNotNull(jsonParser17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        java.lang.Object obj17 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler15, obj17, false);
        byte[][] byteArray20 = bufferRecycler15._byteBuffers;
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = jsonParser3.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        java.lang.String str7 = jsonParser3.getCurrentName();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = new com.fasterxml.jackson.core.JsonFactory(objectCodec8);
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean12 = feature10.enabledIn(3);
        boolean boolean13 = jsonFactory9.isEnabled(feature10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory(objectCodec14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean18 = feature16.enabledIn(3);
        boolean boolean19 = jsonFactory15.isEnabled(feature16);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory15.disable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.disable(feature20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory24.disable(feature29);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory22.configure(feature29, true);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonParser3.disable(feature29);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = jsonParser3.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(jsonParser33);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory13.createGenerator(outputStream20);
        com.fasterxml.jackson.core.io.IOContext iOContext22 = null;
        byte[] byteArray23 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext22, byteArray23, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory13.createJsonParser(byteArray23, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.disable(feature36);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory31.createGenerator(outputStream38);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        byte[] byteArray41 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper44 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext40, byteArray41, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory31.createJsonParser(byteArray41, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int59 = serializableString50.appendQuotedUTF8(byteArray57, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory31.createJsonParser(byteArray57);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory13.createJsonParser(byteArray57, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream66 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray57, 10, 2000);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.io.MergedStream mergedStream81 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream11, byteArray76, (-1038366032), (int) (short) -1);
        boolean boolean82 = mergedStream81.markSupported();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("2.2250738585072012e-308");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeObjectEntrySeparator(jsonGenerator20);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter23 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString24 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter25 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter23, serializableString24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory(objectCodec26);
        com.fasterxml.jackson.core.JsonFactory.Feature feature28 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean30 = feature28.enabledIn(3);
        boolean boolean31 = jsonFactory27.isEnabled(feature28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory(objectCodec32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean36 = feature34.enabledIn(3);
        boolean boolean37 = jsonFactory33.isEnabled(feature34);
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory33.disable(feature38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory27.disable(feature38);
        java.io.OutputStream outputStream41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonFactory27.createGenerator(outputStream41);
        defaultPrettyPrinter25.writeStartArray(jsonGenerator42);
        defaultPrettyPrinter3.writeStartObject(jsonGenerator42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        boolean boolean50 = jsonFactory46.isEnabled(feature47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        com.fasterxml.jackson.core.JsonFactory.Feature feature53 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean55 = feature53.enabledIn(3);
        boolean boolean56 = jsonFactory52.isEnabled(feature53);
        com.fasterxml.jackson.core.JsonParser.Feature feature57 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory52.disable(feature57);
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory46.disable(feature57);
        java.io.OutputStream outputStream60 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator61 = jsonFactory46.createGenerator(outputStream60);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature62 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean63 = feature62.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator64 = jsonGenerator61.enable(feature62);
        defaultPrettyPrinter3.writeEndArray(jsonGenerator64, (int) (byte) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        jsonGenerator64.writeString(serializableString69);
        char[] charArray71 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        int int73 = serializableString69.appendUnquoted(charArray71, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal74 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature53 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature53.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(jsonGenerator61);
        org.junit.Assert.assertTrue("'" + feature62 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature62.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jsonGenerator64);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        java.io.Reader reader7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, 1, reader7, objectCodec8, charsToNameCanonicalizer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = defaultPrettyPrinter1._rootSeparator;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int11 = serializableString2.appendQuotedUTF8(byteArray9, (int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray14, 2000, 2000);
        int int19 = serializableString2.appendUnquoted(charArray14, (int) (byte) 0);
        org.junit.Assert.assertNotNull(serializableString2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory(objectCodec15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(3);
        boolean boolean20 = jsonFactory16.isEnabled(feature17);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory16.disable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory14.configure(feature21, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory14.setInputDecorator(inputDecorator25);
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory26.createParser(reader27);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = jsonFactory26._getBufferRecycler();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(bufferRecycler29);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.SPACES;
        textBuffer16.append(charArray17, (int) (byte) 0, (int) (short) 1);
        char[] charArray21 = textBuffer16.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-985734347), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean19 = writerBasedJsonGenerator17.isEnabled(feature18);
        java.math.BigInteger bigInteger20 = null;
        writerBasedJsonGenerator17.writeNumber(bigInteger20);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext25 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler22, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream26 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = new com.fasterxml.jackson.core.JsonFactory(objectCodec27);
        com.fasterxml.jackson.core.JsonFactory.Feature feature29 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean31 = feature29.enabledIn(3);
        boolean boolean32 = jsonFactory28.isEnabled(feature29);
        com.fasterxml.jackson.core.JsonParser.Feature feature33 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory28.disable(feature33);
        java.io.OutputStream outputStream35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory28.createGenerator(outputStream35);
        com.fasterxml.jackson.core.io.IOContext iOContext37 = null;
        byte[] byteArray38 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper41 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext37, byteArray38, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory28.createJsonParser(byteArray38, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        boolean boolean50 = jsonFactory46.isEnabled(feature47);
        com.fasterxml.jackson.core.JsonParser.Feature feature51 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = jsonFactory46.disable(feature51);
        java.io.OutputStream outputStream53 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator54 = jsonFactory46.createGenerator(outputStream53);
        com.fasterxml.jackson.core.io.IOContext iOContext55 = null;
        byte[] byteArray56 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper59 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext55, byteArray56, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser62 = jsonFactory46.createJsonParser(byteArray56, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter64 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString65 = defaultPrettyPrinter64._rootSeparator;
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int74 = serializableString65.appendQuotedUTF8(byteArray72, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser75 = jsonFactory46.createJsonParser(byteArray72);
        com.fasterxml.jackson.core.JsonParser jsonParser78 = jsonFactory28.createJsonParser(byteArray72, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream81 = new com.fasterxml.jackson.core.io.MergedStream(iOContext25, inputStream26, byteArray72, 10, 2000);
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.writeRawUTF8String(byteArray72, (-985734347), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Operation not supported by generator of type com.fasterxml.jackson.core.json.WriterBasedJsonGenerator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature18.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(jsonGenerator54);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser62);
        org.junit.Assert.assertNotNull(serializableString65);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(jsonParser75);
        org.junit.Assert.assertNotNull(jsonParser78);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        char[] charArray3 = new char[] {};
        int int5 = serializedString1.appendQuoted(charArray3, (int) (byte) 10);
        int int6 = serializedString1.charLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        int int4 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonFactory1.version();
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory1.createGenerator(outputStream5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) feature7, 0L, (long) (byte) 1, 10, (int) (short) -1);
        boolean boolean13 = feature7.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory1.configure(feature7, false);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonFactory15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString6 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter5, serializableString6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = new com.fasterxml.jackson.core.JsonFactory(objectCodec8);
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean12 = feature10.enabledIn(3);
        boolean boolean13 = jsonFactory9.isEnabled(feature10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory(objectCodec14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean18 = feature16.enabledIn(3);
        boolean boolean19 = jsonFactory15.isEnabled(feature16);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory15.disable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.disable(feature20);
        java.io.OutputStream outputStream23 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = jsonFactory9.createGenerator(outputStream23);
        defaultPrettyPrinter7.writeObjectEntrySeparator(jsonGenerator24);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter27 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString28 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter29 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter27, serializableString28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = new com.fasterxml.jackson.core.JsonFactory(objectCodec36);
        com.fasterxml.jackson.core.JsonFactory.Feature feature38 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean40 = feature38.enabledIn(3);
        boolean boolean41 = jsonFactory37.isEnabled(feature38);
        com.fasterxml.jackson.core.JsonParser.Feature feature42 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = jsonFactory37.disable(feature42);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory31.disable(feature42);
        java.io.OutputStream outputStream45 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = jsonFactory31.createGenerator(outputStream45);
        defaultPrettyPrinter29.writeStartArray(jsonGenerator46);
        defaultPrettyPrinter7.writeStartObject(jsonGenerator46);
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory(objectCodec49);
        com.fasterxml.jackson.core.JsonFactory.Feature feature51 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean53 = feature51.enabledIn(3);
        boolean boolean54 = jsonFactory50.isEnabled(feature51);
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = new com.fasterxml.jackson.core.JsonFactory(objectCodec55);
        com.fasterxml.jackson.core.JsonFactory.Feature feature57 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean59 = feature57.enabledIn(3);
        boolean boolean60 = jsonFactory56.isEnabled(feature57);
        com.fasterxml.jackson.core.JsonParser.Feature feature61 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory62 = jsonFactory56.disable(feature61);
        com.fasterxml.jackson.core.JsonFactory jsonFactory63 = jsonFactory50.disable(feature61);
        java.io.OutputStream outputStream64 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator65 = jsonFactory50.createGenerator(outputStream64);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature66 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean67 = feature66.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator68 = jsonGenerator65.enable(feature66);
        defaultPrettyPrinter7.writeEndArray(jsonGenerator68, (int) (byte) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter72 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString73 = defaultPrettyPrinter72._rootSeparator;
        jsonGenerator68.writeString(serializableString73);
        char[] charArray75 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        int int77 = serializableString73.appendUnquoted(charArray75, (int) 'a');
        textBuffer1.resetWithShared(charArray75, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature42.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(jsonGenerator46);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + feature61 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature61.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory62);
        org.junit.Assert.assertNotNull(jsonFactory63);
        org.junit.Assert.assertNotNull(jsonGenerator65);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature66.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jsonGenerator68);
        org.junit.Assert.assertNotNull(serializableString73);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        char[] charArray3 = new char[] {};
        int int5 = serializedString1.appendQuoted(charArray3, (int) (byte) 10);
        byte[] byteArray6 = serializedString1.asQuotedUTF8();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[92, 110]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonParser.Feature feature1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.disable(feature1);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createParser("");
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature1.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        java.lang.String str15 = jsonFactory1.getFormatName();
        java.io.InputStream inputStream16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createParser(inputStream16);
        long long18 = jsonParser17.getValueAsLong();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSON" + "'", str15, "JSON");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        char[] charArray6 = textBuffer1.expandCurrentSegment();
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer16.releaseBuffers();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = jsonParser3.getSchema();
        int int6 = jsonParser3.getValueAsInt();
        java.lang.Object obj7 = jsonParser3.getInputSource();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.emptyAndGetCurrentSegment();
        int int20 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray17, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-48) + "'", int20 == (-48));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        java.lang.Object obj4 = jsonParser3.getEmbeddedObject();
        java.lang.String str5 = jsonParser3.getValueAsString();
        jsonParser3.clearCurrentToken();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-985734347), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory(objectCodec19);
        java.io.Reader reader21 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory20.createParser(reader21);
        boolean boolean23 = jsonParser22.requiresCustomCodec();
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = jsonParser22.getSchema();
        java.lang.String str25 = jsonParser22.nextTextValue();
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.copyCurrentEvent(jsonParser22);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(formatSchema24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString9 = defaultPrettyPrinter8._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray12, 2000, 2000);
        int int17 = serializableString9.appendUnquoted(charArray12, 0);
        boolean boolean18 = jsonParser3.nextFieldName(serializableString9);
        com.fasterxml.jackson.core.Version version19 = jsonParser3.version();
        double double21 = jsonParser3.getValueAsDouble((double) (byte) -1);
        char[] charArray22 = jsonParser3.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = new com.fasterxml.jackson.core.JsonFactory(objectCodec29);
        com.fasterxml.jackson.core.JsonFactory.Feature feature31 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean33 = feature31.enabledIn(3);
        boolean boolean34 = jsonFactory30.isEnabled(feature31);
        com.fasterxml.jackson.core.JsonParser.Feature feature35 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory30.disable(feature35);
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory24.disable(feature35);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonParser3.enable(feature35);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(serializableString9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature35.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonParser38);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        char[] charArray6 = textBuffer1.finishCurrentSegment();
        org.junit.Assert.assertNotNull(charArray6);
    }
}

